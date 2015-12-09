// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.speech;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewGroup;
import com.dominos.App;
import com.dominos.activities.LabsBaseListActivity;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.ConfigProvider;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.prompt.PromptManager;
import com.dominos.bus.events.ExplicitNavigationEvents;
import com.dominos.bus.events.ExplicitNavigationEvents_;
import com.dominos.nina.dialog.DialogModelBuilder;
import com.dominos.nina.dialog.agent.GlobalAgent;
import com.dominos.nina.dialog.agent.ProductsAgent;
import com.dominos.nina.dialog.agent.VanityAgent;
import com.dominos.nina.layout.DomInvocationLayout;
import com.dominos.nina.persona.DominosNinaPersona;
import com.dominos.nina.persona.NinaView;
import com.nuance.b.a.ae;
import com.nuance.b.b.a;
import com.nuance.b.b.a.am;
import com.nuance.b.b.a.e;
import com.nuance.b.b.a.o;
import com.nuance.b.b.a.r;
import com.nuance.b.b.az;
import com.nuance.b.b.bb;
import com.nuance.b.b.bx;
import com.nuance.b.b.dx;
import com.nuance.b.b.u;
import com.nuance.b.b.v;
import com.nuance.b.e.aa;
import com.nuance.b.e.c;
import com.nuance.b.e.x;
import com.nuance.b.e.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.dominos.nina.speech:
//            GeneralInterpretationHandler, SpeechContext

public class SpeechManager
    implements com.dominos.nina.persona.DominosNinaPersona.NoiseHeardHandler, x
{

    public static final String AVAILABLE_LANGUAGES[] = {
        "en"
    };
    private static String GATEWAY_HOST;
    private static final short GATEWAY_PORT = 443;
    private static final boolean GATEWAY_SSL_ENABLED = true;
    private static final boolean GATEWAY_VALIDATE_SSL_CERTIFICATE = false;
    private static final String SERVER_APPLICATION_NAME = "Dominos";
    public static final String TAG = (new StringBuilder()).append(com/dominos/nina/speech/SpeechManager.getSimpleName()).append("-Nina").toString();
    private String activityFilter[] = {
        "LabsCheckoutActivity", "LabsCouponListActivity", "LabsCouponWizardActivity", "LabsFlavorListActivity", "LabsMenuListActivity", "LabsProductDetailListActivity", "LabsRootMenuListActivity", "LabsSizeListActivity", "LabsVariantListActivity", "LandingActivity", 
        "CartActivity", "HistoricalListActivity", "StoreListActivity", "AddressTypeActivity", "SavedAddressActivity", "DeliveryActivity"
    };
    private final Collection activityHashcodes = new HashSet();
    private final Collection activityInvokeButton = new HashSet();
    private DomInvocationLayout buttonLayout;
    private e connectionListener;
    private long currentConversationTurn;
    private r elListener;
    private o endptListener;
    private ExplicitNavigationEvents explicitNavigationEventSubscriber;
    private String grammarVersion;
    private boolean initialGreet;
    public volatile boolean isNinaBusy;
    ConfigProvider mConfigProvider;
    private Activity mCurrentActivity;
    private Activity mCurrentActivityOnBusyListener;
    private ae mDialogModel;
    private DominosNinaPersona mNinaPersona;
    private final AtomicBoolean mPreventNinaPause = new AtomicBoolean(false);
    protected PromptManager mPromptManager;
    private boolean ninaConnected;
    private final AtomicBoolean ninaInitialized = new AtomicBoolean(false);
    private boolean ninaInvoked;
    final com.nuance.b.e.u ninaStateListener = new _cls6();
    private boolean noiseHeard;
    private am recListener;
    private ProductRedirection redirection;
    private boolean shouldRepeat;

    public SpeechManager()
    {
        currentConversationTurn = -1L;
        ninaInvoked = false;
        shouldRepeat = false;
        initialGreet = true;
        redirection = null;
        connectionListener = new _cls1();
    }

    private void attachNinaView(Activity activity)
    {
label0:
        {
            if (mNinaPersona != null)
            {
                if (!(activity instanceof LabsBaseListActivity))
                {
                    break label0;
                }
                mNinaPersona.attachContentView((ViewGroup)activity.findViewById(0x1020002));
            }
            return;
        }
        mNinaPersona.attachContentView(activity);
    }

    private void attachSpeechButton(final Activity activity)
    {
        buttonLayout = new DomInvocationLayout(activity, findParentLayout(activity), new _cls3());
        if (!isNinaConnected())
        {
            hideNinaButton();
        }
    }

    private void dismissNinaPersona()
    {
        LogUtil.d(TAG, "SpeechManager.dismissNinaPersona()", new Object[0]);
        if (mNinaPersona != null)
        {
            mNinaPersona.dismiss();
        }
    }

    private void displayNina()
    {
        MediaPlayer.create(mCurrentActivity, 0x7f07000d).start();
        c.g();
        if (shouldRepeat)
        {
            c.l().a(new a[] {
                new dx(GlobalAgent.CONCEPT, "repeat")
            });
        }
        if (mNinaPersona != null)
        {
            mNinaPersona.resume();
        }
    }

    private void enableDisableViewHierarchy(View view, boolean flag)
    {
        view.setEnabled(flag);
        if (view instanceof ViewGroup)
        {
            ViewGroup viewgroup = (ViewGroup)view;
            for (int i = 0; i < viewgroup.getChildCount(); i++)
            {
                if (!(view instanceof NinaView))
                {
                    enableDisableViewHierarchy(viewgroup.getChildAt(i), flag);
                }
            }

        }
    }

    private ViewGroup findParentLayout(Activity activity)
    {
        if (activity != null)
        {
            activity = (ViewGroup)activity.findViewById(0x1020002);
            ViewGroup viewgroup = (ViewGroup)activity.getChildAt(0);
            if (viewgroup == null)
            {
                return activity;
            } else
            {
                return viewgroup;
            }
        } else
        {
            return null;
        }
    }

    private byte[] getApplicationKey(boolean flag)
    {
        if (flag)
        {
            return (new byte[] {
                36, -2, -125, -35, 39, -111, 23, -34, 3, 40, 
                125, 60, 18, -18, -9, 83, 92, 0, 46, -48, 
                106, 125, -10, -8, -95, 47, -93, 91, 62, 34, 
                63, -65, -89, 89, -101, -97, 52, 22, -99, -39, 
                23, -70, -86, 12, -113, -40, -87, 53, 8, 107, 
                112, 5, 87, -60, 20, -109, -78, 64, -9, -55, 
                -102, 56, 18, 71
            });
        } else
        {
            return (new byte[] {
                -58, -32, 38, 34, -63, -63, -45, -45, 117, 91, 
                -70, -101, -20, -63, 118, -112, -96, -43, 19, 31, 
                31, -31, 56, 26, 1, 110, -21, 39, -59, 55, 
                -65, -61, -44, -37, -35, -60, 48, 83, -35, 123, 
                32, -100, -61, 88, 98, -58, 15, 85, 21, -55, 
                78, -27, 11, 63, 19, -73, -105, -124, -83, 20, 
                -102, 73, -85, 30
            });
        }
    }

    private void initialize(Context context)
    {
        mNinaPersona = new DominosNinaPersona(App.getInstance().getApplicationContext());
        mNinaPersona.registerNoiseHeardHandler(this);
        az az1 = c.e();
        az1.a(GATEWAY_HOST, 443);
        az1.f();
        az1.h();
        az1.c("Dominos");
        az1.a(u.d);
        String s;
        if (mConfigProvider.isNuanceProductionServer())
        {
            s = "DominosMobile_Dominos_PROD_NMAID1";
        } else
        {
            s = "DominosMobile_Dominos_DEV_NMAID1";
        }
        az1.a(s);
        az1.b("Evan");
        az1.a(getApplicationKey(mConfigProvider.isNuanceProductionServer()));
        az1.a(bb.c);
        c.a(App.getInstance(), mNinaPersona, getDialogModel());
        c.f().a(connectionListener);
        LogUtil.d(TAG, (new StringBuilder("Nina initialized on server: ")).append(GATEWAY_HOST).append(" Grammar ").append(grammarVersion).toString(), new Object[0]);
        ninaConnected = false;
        if (explicitNavigationEventSubscriber == null)
        {
            explicitNavigationEventSubscriber = ExplicitNavigationEvents_.getInstance_(context);
        }
    }

    private void restartCurrentActivity()
    {
        if (mCurrentActivity != null)
        {
            Intent intent = mCurrentActivity.getIntent();
            mCurrentActivity.finish();
            mCurrentActivity.startActivity(intent);
        }
    }

    private void setCurrentActivity(Activity activity)
    {
        mCurrentActivity = activity;
    }

    public boolean addErrorCount()
    {
        LogUtil.d(TAG, "addErrorCount()", new Object[0]);
        mNinaPersona.addErrorCount();
        return isErrorCountLimitReached();
    }

    public void connect()
    {
        if (ninaInitialized.get())
        {
            c.a(new _cls2());
        }
    }

    public void enableDisableActivityViews(final boolean enabled, final Activity currentActivity)
    {
        LogUtil.d(TAG, (new StringBuilder()).append(currentActivity.getClass().getSimpleName()).append(".setEnabled(").append(enabled).append(")").toString(), new Object[0]);
        currentActivity.runOnUiThread(new _cls5());
    }

    public void enableSpeech(String s, String s1)
    {
        if (ninaInitialized.get() && StringHelper.equals(GATEWAY_HOST, s) && StringHelper.equals(s1, grammarVersion))
        {
            LogUtil.d(TAG, "Nina is already initialized.", new Object[0]);
            return;
        } else
        {
            GATEWAY_HOST = s;
            mNinaPersona = null;
            grammarVersion = s1;
            App.getInstance().bus.register(this);
            c.l().a(this);
            c.a(ninaStateListener);
            return;
        }
    }

    public long getCurrentConversationTurn()
    {
        return currentConversationTurn;
    }

    public Activity getCurrentNinaActivity()
    {
        this;
        JVM INSTR monitorenter ;
        Activity activity = mCurrentActivity;
        this;
        JVM INSTR monitorexit ;
        return activity;
        Exception exception;
        exception;
        throw exception;
    }

    public ae getDialogModel()
    {
        if (mDialogModel == null)
        {
            mDialogModel = (new DialogModelBuilder(new GeneralInterpretationHandler(App.getInstance().getBaseContext()))).buildDialogModel(grammarVersion);
        }
        return mDialogModel;
    }

    public int getErrorCount()
    {
        return mNinaPersona.getErrorCount();
    }

    public int getErrorCountLimit()
    {
        return mNinaPersona.getErrorCountLimit();
    }

    public String getNuanceSessionId()
    {
        return v.r().m();
    }

    public ProductRedirection getProductRedirection()
    {
        return redirection;
    }

    public PromptManager getPromptManager()
    {
        return mPromptManager;
    }

    public transient boolean handleBackPressed(String as[])
    {
        if (c.l() != null && c.i())
        {
            if (!mNinaPersona.handleBackPress())
            {
                c.h();
                if (as.length > 0)
                {
                    SpeechContext.updateAgents(as);
                }
            }
            return true;
        } else
        {
            return false;
        }
    }

    public void handleNoiseHeard()
    {
        noiseHeard = true;
        String s = SpeechContext.getAgentNameInFocus();
        if (StringHelper.isNotEmpty(s))
        {
            SpeechContext.updateAgents(new String[] {
                s, "RESET"
            });
        }
    }

    protected void hideNinaButton()
    {
        if (buttonLayout != null)
        {
            buttonLayout.hideDomButton();
        }
    }

    public boolean isErrorCountLimitReached()
    {
        return mNinaPersona.isErrorCountLimitReached();
    }

    public boolean isNinaConnected()
    {
        return ninaConnected;
    }

    public boolean isNinaInvoked()
    {
        return ninaInvoked;
    }

    public boolean isNinaValidActivity(Activity activity)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (activity == null) goto _L2; else goto _L1
_L1:
        String as[];
        int i;
        int j;
        as = activityFilter;
        j = as.length;
        i = 0;
_L7:
        flag = flag1;
        if (i >= j) goto _L2; else goto _L3
_L3:
        String s = as[i];
        if (!activity.getClass().getSimpleName().contains(s)) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean isNoiseHeard()
    {
        return noiseHeard;
    }

    public void onActivityBackButton(com.dominos.bus.events.ActivityLifecycleEvents.BackButtonEvent backbuttonevent)
    {
        LogUtil.d(TAG, "On Back button pressed ".concat(backbuttonevent.getActivity().getClass().getSimpleName()), new Object[0]);
    }

    public void onActivityCreate(com.dominos.bus.events.ActivityLifecycleEvents.CreateEvent createevent)
    {
        LogUtil.d(TAG, "On Create ".concat(createevent.getActivity().getClass().getSimpleName()), new Object[0]);
        if (isNinaValidActivity(createevent.getActivity()))
        {
            synchronized (activityHashcodes)
            {
                activityHashcodes.add(Integer.valueOf(createevent.getActivity().hashCode()));
            }
            LogUtil.d(TAG, (new StringBuilder("activityHashcodes.add(), refcount: ")).append(activityHashcodes.size()).toString(), new Object[0]);
            if (!ninaInitialized.getAndSet(true))
            {
                initialize(createevent.getActivity());
            }
            connect();
        }
        return;
        createevent;
        collection;
        JVM INSTR monitorexit ;
        throw createevent;
    }

    public void onActivityDestroy(com.dominos.bus.events.ActivityLifecycleEvents.DestroyEvent destroyevent)
    {
        LogUtil.d(TAG, "On Destroy ".concat(destroyevent.getActivity().getClass().getSimpleName()), new Object[0]);
        if (isNinaValidActivity(destroyevent.getActivity()))
        {
            synchronized (activityHashcodes)
            {
                activityHashcodes.remove(Integer.valueOf(destroyevent.getActivity().hashCode()));
                LogUtil.d(TAG, (new StringBuilder("activityHashcodes.remove(), refcount: ")).append(activityHashcodes.size()).toString(), new Object[0]);
                Activity activity = destroyevent.getActivity();
                if (activity.isTaskRoot() && activity.getChangingConfigurations() == 0 && ninaInitialized.getAndSet(false))
                {
                    c.m().n();
                    c.f().b(connectionListener);
                    LogUtil.d(TAG, "deinitializing nina", new Object[0]);
                    if (mNinaPersona != null)
                    {
                        mNinaPersona.pause();
                        c.c();
                        ninaInitialized.set(false);
                        mNinaPersona.destroy();
                        mNinaPersona = null;
                    }
                }
            }
            synchronized (activityInvokeButton)
            {
                activityInvokeButton.remove(Integer.valueOf(destroyevent.getActivity().hashCode()));
            }
        }
        return;
        destroyevent;
        collection;
        JVM INSTR monitorexit ;
        throw destroyevent;
        destroyevent;
        collection;
        JVM INSTR monitorexit ;
        throw destroyevent;
    }

    public void onActivityPause(com.dominos.bus.events.ActivityLifecycleEvents.PauseEvent pauseevent)
    {
        LogUtil.d(TAG, "On Pause ".concat(pauseevent.getActivity().getClass().getSimpleName()), new Object[0]);
        break MISSING_BLOCK_LABEL_26;
        if (ninaConnected && isNinaValidActivity(pauseevent.getActivity()))
        {
            if (!mPreventNinaPause.getAndSet(false))
            {
                if (pauseevent.getActivity().getChangingConfigurations() == 0)
                {
                    LogUtil.d(TAG, "invoking Nina.pause()", new Object[0]);
                    c.k();
                    LogUtil.d(TAG, "invoking NinaPersona.pause()", new Object[0]);
                    c.m().n();
                    if (mNinaPersona != null)
                    {
                        mNinaPersona.pause();
                        return;
                    }
                }
            } else
            {
                LogUtil.d(TAG, "something prevented nina from pausing", new Object[0]);
                return;
            }
        }
        return;
    }

    public void onActivityResume(com.dominos.bus.events.ActivityLifecycleEvents.ResumeEvent resumeevent)
    {
        LogUtil.d(TAG, "On Resume ".concat(resumeevent.getActivity().getClass().getSimpleName()), new Object[0]);
        if (isNinaValidActivity(resumeevent.getActivity()))
        {
            LogUtil.d(TAG, "invoking Nina.resume()", new Object[0]);
            c.j();
            setCurrentActivity(resumeevent.getActivity());
            attachNinaView(resumeevent.getActivity());
            synchronized (activityInvokeButton)
            {
                int i = resumeevent.getActivity().hashCode();
                if (!activityInvokeButton.contains(Integer.valueOf(i)))
                {
                    attachSpeechButton(resumeevent.getActivity());
                    activityInvokeButton.add(Integer.valueOf(resumeevent.getActivity().hashCode()));
                }
            }
            if (mNinaPersona != null)
            {
                LogUtil.d(TAG, "invoking NinaPersona.resume()", new Object[0]);
                mNinaPersona.resume();
            }
        }
        return;
        resumeevent;
        collection;
        JVM INSTR monitorexit ;
        throw resumeevent;
    }

    public void onActivitySetContent(com.dominos.bus.events.ActivityLifecycleEvents.SetContentEvent setcontentevent)
    {
        LogUtil.d(TAG, "On setContent ".concat(setcontentevent.getActivity().getClass().getSimpleName()), new Object[0]);
    }

    public void onBusy()
    {
        LogUtil.d("Ninax", "Nina Busy Listener -- On Busy", new Object[0]);
        isNinaBusy = true;
        SpeechContext.resetNinaBusyWaitLatch();
        mCurrentActivityOnBusyListener = getCurrentNinaActivity();
        enableDisableActivityViews(false, mCurrentActivityOnBusyListener);
    }

    public void onReady()
    {
        LogUtil.d("Ninax", "Nina Busy Listener -- On Ready", new Object[0]);
        isNinaBusy = false;
        Activity activity;
        if (mCurrentActivityOnBusyListener == null)
        {
            activity = getCurrentNinaActivity();
        } else
        {
            activity = mCurrentActivityOnBusyListener;
        }
        enableDisableActivityViews(true, activity);
        if (SpeechContext.getNinaBusyWaitLatch() != null)
        {
            SpeechContext.getNinaBusyWaitLatch().countDown();
        }
    }

    public void onShowSpeechBar(com.dominos.bus.events.SpeechEvents.ShowSpeechBarEvent showspeechbarevent)
    {
        displayNina();
    }

    public void preventNinaPause()
    {
        mPreventNinaPause.set(true);
    }

    public void removeInvokeButton()
    {
        removeInvokeButton(mCurrentActivity);
    }

    public void removeInvokeButton(Activity activity)
    {
        if (buttonLayout != null)
        {
            activity.runOnUiThread(new _cls4());
        }
    }

    public void removeInvokeButtonEvent(com.dominos.bus.events.SpeechEvents.RemoveInvokeButton removeinvokebutton)
    {
        removeInvokeButton(removeinvokebutton.getActivity());
    }

    public void removeSpeechManager()
    {
        if (ninaInitialized.getAndSet(false))
        {
            LogUtil.d(TAG, " removing speech manager", new Object[0]);
            c.l().b(this);
            c.b(ninaStateListener);
            mNinaPersona.pause();
            c.c();
            ninaInitialized.set(false);
            dismissNinaPersona();
            mNinaPersona.destroy();
            mNinaPersona = null;
            App.getInstance().bus.unregister(this);
            c.f().b(connectionListener);
            restartCurrentActivity();
        }
    }

    public void resetDialogModel()
    {
        resetDialogModel(null);
    }

    public void resetDialogModel(SpeechContext speechcontext)
    {
        if (c.i())
        {
            ProductsAgent.remembered = null;
            if (speechcontext == null)
            {
                SpeechContext.updateAgents(new String[] {
                    "Application", "RESET"
                });
            } else
            {
                speechcontext.resetAgency(new String[] {
                    "Application"
                });
            }
            preventNinaPause();
        }
    }

    public void resetErrorCount()
    {
        LogUtil.d(TAG, "resetErrorCount()", new Object[0]);
        mNinaPersona.resetErrorCount();
    }

    public void setActivityFilter(com.dominos.bus.events.SpeechEvents.FilterModification filtermodification)
    {
        activityFilter = filtermodification.getFilter();
    }

    public void setCurrentConversationTurn(long l)
    {
        currentConversationTurn = l;
    }

    public void setHint(String s)
    {
        if (mNinaPersona != null && StringHelper.isNotEmpty(s))
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(s);
            mNinaPersona.changeHints(arraylist);
        }
    }

    public void setNinaInvoked(boolean flag)
    {
        ninaInvoked = flag;
    }

    public void setNoiseHeard(boolean flag)
    {
        noiseHeard = flag;
    }

    public void setProductRedirection(ProductRedirection productredirection)
    {
        redirection = productredirection;
    }

    public void setShouldInitialGreet(boolean flag)
    {
        initialGreet = flag;
    }

    public void setShouldRepeat(boolean flag)
    {
        shouldRepeat = flag;
    }

    public boolean shouldInitialGreet()
    {
        return initialGreet && !VanityAgent.hasMeaning;
    }

    public void showHints()
    {
        mNinaPersona.displayHints();
    }

    protected void showNinaButton()
    {
        if (buttonLayout != null)
        {
            buttonLayout.showDomButton();
        }
    }

    public void startActivityRequest(com.dominos.bus.events.ActivityNavEvents.StartActivityRequest startactivityrequest)
    {
        startactivityrequest = startactivityrequest.getActivityClass();
        Activity activity = getCurrentNinaActivity();
        activity.startActivity(new Intent(activity, startactivityrequest));
    }

    public void stopNina(com.dominos.bus.events.SpeechEvents.StopNinaRequest stopninarequest)
    {
        LogUtil.d(TAG, "StopNinaRequest event triggered", new Object[0]);
        if (c.i())
        {
            c.h();
        }
        dismissNinaPersona();
    }

    public void updateServerState(com.dominos.bus.events.SpeechEvents.UpdateServerState updateserverstate)
    {
        if (c.i())
        {
            SpeechContext.updateAgents(updateserverstate.getAgentsAndMeanings());
        }
    }



/*
    static boolean access$002(SpeechManager speechmanager, boolean flag)
    {
        speechmanager.ninaConnected = flag;
        return flag;
    }

*/




/*
    static boolean access$302(SpeechManager speechmanager, boolean flag)
    {
        speechmanager.shouldRepeat = flag;
        return flag;
    }

*/


/*
    static boolean access$402(SpeechManager speechmanager, boolean flag)
    {
        speechmanager.initialGreet = flag;
        return flag;
    }

*/



/*
    static r access$502(SpeechManager speechmanager, r r)
    {
        speechmanager.elListener = r;
        return r;
    }

*/



/*
    static am access$602(SpeechManager speechmanager, am am)
    {
        speechmanager.recListener = am;
        return am;
    }

*/



/*
    static o access$702(SpeechManager speechmanager, o o)
    {
        speechmanager.endptListener = o;
        return o;
    }

*/

    private class _cls1
        implements e
    {

        final SpeechManager this$0;

        public void onConnect(b b)
        {
            LogUtil.d(SpeechManager.TAG, "ConnectionListener Nina connected", new Object[0]);
        }

        public void onConnectError(com.nuance.b.b.a.c c1)
        {
            LogUtil.d(SpeechManager.TAG, "ConnectionListener Nina connection error", new Object[0]);
        }

        public void onConnectionLost(f f1)
        {
            LogUtil.d(SpeechManager.TAG, "ConnectionListener Nina Lost Connection", new Object[0]);
            ninaConnected = false;
            if (f1.b == g.b)
            {
                if (c.i())
                {
                    c.h();
                }
                connect();
            }
        }

        public void onDisconnect(h h)
        {
            LogUtil.d(SpeechManager.TAG, "ConnectionListener Nina disconnected", new Object[0]);
        }

        public void onDisconnectError(i i)
        {
            LogUtil.d(SpeechManager.TAG, "ConnectionListener Nina disconnect error", new Object[0]);
        }

        _cls1()
        {
            this$0 = SpeechManager.this;
            super();
        }
    }


    private class _cls6
        implements com.nuance.b.e.u
    {

        final SpeechManager this$0;

        public void started()
        {
            class _cls1
                implements r
            {

                final _cls6 this$1;

                public void onEnergyLevel(p p1)
                {
                    PowerManager powermanager = (PowerManager)getCurrentNinaActivity().getSystemService("power");
                    if (p1.b > 40F)
                    {
                        int i;
                        if (q.a == p1.c)
                        {
                            i = 0x2000000a;
                        } else
                        {
                            i = 0x20000006;
                        }
                        powermanager.newWakeLock(i, "NinaWake").acquire(1L);
                    }
                }

                _cls1()
                {
                    this$1 = _cls6.this;
                    super();
                }
            }

            class _cls2
                implements o
            {

                final _cls6 this$1;

                public void onEndOfSpeech(n n)
                {
                }

                public void onStartOfSpeech(ap ap)
                {
                    c.a("I only heard noise. Tap to wake me up.");
                }

                _cls2()
                {
                    this$1 = _cls6.this;
                    super();
                }
            }

            class _cls3
                implements am
            {

                final _cls6 this$1;

                public void onAudioCollected(com.nuance.b.b.a.a a1)
                {
                }

                public void onRecordingError(ak ak)
                {
                }

                public void onRecordingStarted(an an)
                {
                    c.a();
                }

                public void onRecordingStopped(ao ao)
                {
                }

                _cls3()
                {
                    this$1 = _cls6.this;
                    super();
                }
            }

            boolean flag;
            if (getCurrentNinaActivity().checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && elListener == null)
            {
                elListener = new _cls1();
            }
            c.f().a(elListener);
            endptListener = new _cls2();
            c.f().a(endptListener);
            recListener = new _cls3();
            c.f().a(recListener);
        }

        public void stopped()
        {
            shouldRepeat = true;
            initialGreet = true;
            if (elListener != null)
            {
                c.f().b(elListener);
                elListener = null;
            }
            if (recListener != null)
            {
                c.f().b(recListener);
                recListener = null;
            }
            if (endptListener != null)
            {
                c.f().b(endptListener);
                endptListener = null;
            }
            App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.HideSpeechBarEvent(getCurrentNinaActivity()));
        }

        _cls6()
        {
            this$0 = SpeechManager.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final SpeechManager this$0;
        final Activity val$activity;

        public void onClick(View view)
        {
            setNinaInvoked(true);
            App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.ShowSpeechBarEvent(activity));
        }

        _cls3()
        {
            this$0 = SpeechManager.this;
            activity = activity1;
            super();
        }
    }


    private class _cls2
        implements l
    {

        final SpeechManager this$0;

        public void completed(boolean flag)
        {
            ninaConnected = flag;
            if (flag)
            {
                LogUtil.d(SpeechManager.TAG, (new StringBuilder("Nina connected successfully, SESSION ID: ")).append(getNuanceSessionId()).toString(), new Object[0]);
                showNinaButton();
            }
        }

        _cls2()
        {
            this$0 = SpeechManager.this;
            super();
        }
    }


    private class _cls5
        implements Runnable
    {

        final SpeechManager this$0;
        final Activity val$currentActivity;
        final boolean val$enabled;

        public void run()
        {
            View view = currentActivity.findViewById(0x1020002);
            enableDisableViewHierarchy(view, enabled);
        }

        _cls5()
        {
            this$0 = SpeechManager.this;
            currentActivity = activity;
            enabled = flag;
            super();
        }
    }


    private class _cls4
        implements Runnable
    {

        final SpeechManager this$0;

        public void run()
        {
            buttonLayout.setVisibility(8);
        }

        _cls4()
        {
            this$0 = SpeechManager.this;
            super();
        }
    }

}
