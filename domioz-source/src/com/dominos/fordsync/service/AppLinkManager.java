// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.service;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.net.Uri;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Pair;
import com.dominos.activities.LandingActivity;
import com.dominos.android.sdk.common.BaseCallback;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.ApplicationConfiguration;
import com.dominos.android.sdk.core.models.NinaPromptModel;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PromptModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.android.sdk.core.prompt.PromptManager;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.fordsync.FordSyncActivity_;
import com.dominos.fordsync.FordSyncSession;
import com.dominos.fordsync.interactions.CallStore_;
import com.dominos.fordsync.interactions.EasyOrder_;
import com.dominos.fordsync.interactions.HowMayIHelpYou_;
import com.dominos.fordsync.interactions.RecentOrder_;
import com.dominos.fordsync.interactions.SyncInteraction;
import com.dominos.fordsync.interactions.TrackOrder_;
import com.dominos.fordsync.util.ProxyImageHandler;
import com.dominos.fordsync.util.ProxyUtil;
import com.dominos.handlers.LocationUpdateHandler;
import com.dominos.loader.ApplicationLoader;
import com.ford.syncV4.a.a;
import com.ford.syncV4.e.bx;
import com.ford.syncV4.e.c.a.h;
import com.ford.syncV4.e.c.a.j;
import com.ford.syncV4.e.c.a.p;
import com.ford.syncV4.e.c.a.v;
import com.ford.syncV4.e.c.a.w;
import com.ford.syncV4.e.c.as;
import com.ford.syncV4.e.c.bc;
import com.ford.syncV4.e.c.be;
import com.ford.syncV4.e.c.bi;
import com.ford.syncV4.e.c.bn;
import com.ford.syncV4.e.c.bq;
import com.ford.syncV4.e.c.bv;
import com.ford.syncV4.e.c.d;
import com.ford.syncV4.e.c.o;
import com.ford.syncV4.e.c.s;
import com.ford.syncV4.e.f;
import com.ford.syncV4.e.i;
import com.ford.syncV4.h.e;
import com.google.a.a.ao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.a.a.a.a.g;

// Referenced classes of package com.dominos.fordsync.service:
//            AppLinkService_, ProxyListener_, ProxyListener

public class AppLinkManager
{

    public static final String ACTION_FORDSYNC_DISCONNECT = "intent.action.FORDSYNC_DISCONNECT";
    public static final String ACTION_FORDSYNC_REMOVE_CONNECTION_CHECK = "intent.action.FORDSYNC_REMOVE_CONNECTION_CHECK";
    public static final String ACTION_FORDSYNC_STOP_SERVICE = "intent.action.FORDSYNC_STOP_SERVICE";
    private static final int ALERT_TIME_OUT = 10000;
    private static final j APP_DESIRED_LANGUAGE;
    private static final String APP_ID = "3519075036";
    private static final String APP_MEDIA_SCREEN_NAME = "Domino\u2019s";
    private static final String APP_NAME = "Domino\u2019s Pizza";
    private static final int INTERACT_TIME_OUT = 15000;
    public static final String LAYOUT_BUTTONS_WITH_GRAPHIC = "TEXTBUTTONS_WITH_GRAPHIC";
    public static final String LAYOUT_TEXT_WITH_GRAPHIC = "TEXT_WITH_GRAPHIC";
    public static final String LOG_TAG = "FORDSYNC_AppLinkManager";
    private static final String PROMPT_TOKEN_DIVIDER = " ";
    private static final int PROMPT_TOKEN_MAX_LENGTH = 100;
    private static final int SPEAK_TIME_OUT_MINUTES = 2;
    private boolean callInProgress;
    protected SyncInteraction currentInteraction;
    private boolean lockScreenUp;
    ApplicationLoader mApplicationLoader;
    private List mBroadcastReceiverRegistry;
    private ConfigurationManager mConfigurationManager;
    private Context mContext;
    private AtomicInteger mCorrelationId;
    FordSyncSession mFordSyncSession;
    private volatile boolean mInitialized;
    private volatile boolean mInitializing;
    private com.ford.syncV4.e.c.a.e mLastTurnHMILevel;
    LocationUpdateHandler mLocationUpdateHandler;
    private PromptManager mPromptManager;
    private PromptCategoryModel mPrompts;
    ProxyImageHandler mProxyImageHandler;
    ProxyListener mProxyListener;
    private boolean mSetup;
    public CountDownLatch mSpeakLatch;
    private List mSpeechCapabilities;
    private i mSyncProxy;
    TelephonyManager mTelephonyManager;
    private UserProfileManager mUserProfileManager;
    private PhoneStateListener phoneStateListener;
    private Intent serviceIntent;
    private TimerTask vehicleDataConsumer;

    public AppLinkManager(Context context)
    {
        mSpeakLatch = null;
        mBroadcastReceiverRegistry = new ArrayList();
        mCorrelationId = new AtomicInteger(0);
        mInitializing = false;
        mInitialized = false;
        callInProgress = false;
        mSetup = false;
        phoneStateListener = new _cls1();
        mContext = context;
        serviceIntent = new Intent(context, com/dominos/fordsync/service/AppLinkService_);
    }

    private void cancelVehicleDataConsumer()
    {
        if (vehicleDataConsumer != null)
        {
            vehicleDataConsumer.cancel();
            vehicleDataConsumer = null;
        }
    }

    private void clearInitializedComponents()
    {
        mInitialized = false;
        mInitializing = false;
        mSyncProxy = null;
        clearInitializedSpeechComponents();
        cancelVehicleDataConsumer();
    }

    private void clearInitializedSpeechComponents()
    {
        mSetup = false;
        currentInteraction = null;
        mLastTurnHMILevel = null;
        mCorrelationId = new AtomicInteger(0);
        mLocationUpdateHandler.dispose();
        if (mBroadcastReceiverRegistry != null)
        {
            BroadcastReceiver broadcastreceiver;
            for (Iterator iterator = mBroadcastReceiverRegistry.iterator(); iterator.hasNext(); mContext.unregisterReceiver(broadcastreceiver))
            {
                broadcastreceiver = (BroadcastReceiver)iterator.next();
            }

            mBroadcastReceiverRegistry.clear();
        }
    }

    private String collapseAddressLines(Address address)
    {
        String s = "";
        for (int k = 0; k < address.getMaxAddressLineIndex(); k++)
        {
            s = (new StringBuilder()).append(s).append(" ").append(address.getAddressLine(k)).toString();
        }

        return s;
    }

    private BluetoothAdapter getBluetoothAdapter()
    {
        if (android.os.Build.VERSION.SDK_INT <= 17)
        {
            LogUtil.d("FORDSYNC_AppLinkManager", "Android is lower than jelly bean, using BT Default Adapter.", new Object[0]);
            return BluetoothAdapter.getDefaultAdapter();
        }
        LogUtil.d("FORDSYNC_AppLinkManager", "Android is greater than jelly bean, using BT system service.", new Object[0]);
        Object obj = mContext.getSystemService("bluetooth");
        if (obj != null)
        {
            return ((BluetoothManager)obj).getAdapter();
        } else
        {
            return null;
        }
    }

    private Vector getVrSynonyms(String s)
    {
        return new Vector(mPrompts.getPrompter(s).getHintsVector());
    }

    private NinaPromptModel loadPrompts()
    {
        String s = mConfigurationManager.getApplicationConfiguration().getFordsyncPromptsVersion();
        Object obj = mConfigurationManager.getApplicationConfiguration().getPromptsURL();
        s = mPromptManager.createVersionedFileName(s, "fordsync.json");
        mPromptManager.loadPromptModel(((String) (obj)), s);
        obj = mPromptManager.getPromptModel();
        if (obj == null)
        {
            mConfigurationManager.getApplicationConfiguration().setFordSyncEnabled(false);
        }
        return ((NinaPromptModel) (obj));
    }

    private void navigateToFordSync(Context context, int k)
    {
        ((com.dominos.fordsync.FordSyncActivity_.IntentBuilder_)FordSyncActivity_.intent(context).flags(k)).start();
    }

    private String phoneticize(String s)
    {
        PrompterModel promptermodel = mPromptManager.getPromptModel().getFordSync("generic").getPrompter("substitutions");
        Iterator iterator = promptermodel.prompts.keySet().iterator();
        String s1 = s;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s2 = (String)iterator.next();
            if (StringHelper.containsIgnoreCase(s, s2))
            {
                String s3 = promptermodel.getPrompt(s2).getSpeech(new Object[0]);
                s1 = s1.replaceAll(String.format("(?i)\\b%s\\b", new Object[] {
                    s2
                }), s3);
            }
        } while (true);
        return s1;
    }

    private void setupInteractions(boolean flag)
    {
        Object obj1 = null;
        Object obj2 = mSyncProxy;
        Vector vector = EasyOrder_.getInstance_(mContext).getVrSynonyms();
        int k = mCorrelationId.incrementAndGet();
        Object obj;
        Vector vector1;
        Vector vector2;
        if (flag)
        {
            obj = "EASY_ORDER_35";
        } else
        {
            obj = null;
        }
        ProxyUtil.addMenuCommand(((i) (obj2)), Integer.valueOf(100), "Place Easy Order", vector, Integer.valueOf(k), ((String) (obj)));
        obj2 = mSyncProxy;
        vector = RecentOrder_.getInstance_(mContext).getVrSynonyms();
        k = mCorrelationId.incrementAndGet();
        if (flag)
        {
            obj = "RECENT_ORDER_35";
        } else
        {
            obj = null;
        }
        ProxyUtil.addMenuCommand(((i) (obj2)), Integer.valueOf(101), "Place Recent Order", vector, Integer.valueOf(k), ((String) (obj)));
        obj2 = mSyncProxy;
        vector = TrackOrder_.getInstance_(mContext).getVrSynonyms();
        k = mCorrelationId.incrementAndGet();
        if (flag)
        {
            obj = "TRACKER_35";
        } else
        {
            obj = null;
        }
        ProxyUtil.addMenuCommand(((i) (obj2)), Integer.valueOf(102), "Track Order", vector, Integer.valueOf(k), ((String) (obj)));
        obj2 = mSyncProxy;
        vector = CallStore_.getInstance_(mContext).getVrSynonyms();
        k = mCorrelationId.incrementAndGet();
        if (flag)
        {
            obj = "CALL_STORE_35";
        } else
        {
            obj = null;
        }
        ProxyUtil.addMenuCommand(((i) (obj2)), Integer.valueOf(103), "Call Store", vector, Integer.valueOf(k), ((String) (obj)));
        obj2 = new Vector();
        vector = getVrSynonyms("choice_no");
        if (flag)
        {
            obj = "NO_70";
        } else
        {
            obj = null;
        }
        ((Vector) (obj2)).add(ProxyUtil.createChoice(Integer.valueOf(0), "No", vector, ((String) (obj))));
        vector = getVrSynonyms("choice_yes");
        if (flag)
        {
            obj = "YES_70";
        } else
        {
            obj = null;
        }
        ((Vector) (obj2)).add(ProxyUtil.createChoice(Integer.valueOf(1), "Yes", vector, ((String) (obj))));
        vector = new Vector();
        vector1 = EasyOrder_.getInstance_(mContext).getVrSynonyms();
        if (flag)
        {
            obj = "EASY_ORDER_70";
        } else
        {
            obj = null;
        }
        vector.add(ProxyUtil.createChoice(Integer.valueOf(2), "Easy Order", vector1, ((String) (obj))));
        vector1 = RecentOrder_.getInstance_(mContext).getVrSynonyms();
        if (flag)
        {
            obj = "RECENT_ORDER_70";
        } else
        {
            obj = null;
        }
        vector.add(ProxyUtil.createChoice(Integer.valueOf(3), "Recent Order", vector1, ((String) (obj))));
        vector1 = TrackOrder_.getInstance_(mContext).getVrSynonyms();
        if (flag)
        {
            obj = "TRACKER_70";
        } else
        {
            obj = null;
        }
        vector.add(ProxyUtil.createChoice(Integer.valueOf(4), "Track Order", vector1, ((String) (obj))));
        vector1 = CallStore_.getInstance_(mContext).getVrSynonyms();
        if (flag)
        {
            obj = "CALL_STORE_70";
        } else
        {
            obj = null;
        }
        vector.add(ProxyUtil.createChoice(Integer.valueOf(5), "Call Store", vector1, ((String) (obj))));
        vector1 = new Vector();
        vector2 = CallStore_.getInstance_(mContext).getVrSynonyms();
        if (flag)
        {
            obj = "CALL_STORE_70";
        } else
        {
            obj = null;
        }
        vector1.add(ProxyUtil.createChoice(Integer.valueOf(6), "Call Domino's", vector2, ((String) (obj))));
        vector2 = getVrSynonyms("start_over");
        obj = obj1;
        if (flag)
        {
            obj = "START_OVER_70";
        }
        vector1.add(ProxyUtil.createChoice(Integer.valueOf(7), "Start Over", vector2, ((String) (obj))));
        mSyncProxy.a(((Vector) (obj2)), Integer.valueOf(0), Integer.valueOf(mCorrelationId.incrementAndGet()));
        mSyncProxy.a(vector, Integer.valueOf(1), Integer.valueOf(mCorrelationId.incrementAndGet()));
        mSyncProxy.a(vector1, Integer.valueOf(2), Integer.valueOf(mCorrelationId.incrementAndGet()));
        mSpeechCapabilities = mSyncProxy.c();
        if (flag)
        {
            updateLayout("TEXTBUTTONS_WITH_GRAPHIC");
        }
        obj = new bq();
        ((bq) (obj)).a(Boolean.valueOf(true));
        ((bq) (obj)).b(Boolean.valueOf(true));
        ((bq) (obj)).c(Boolean.valueOf(true));
        ((bq) (obj)).d(Boolean.valueOf(true));
        ((bq) (obj)).e(Boolean.valueOf(true));
        ((bq) (obj)).a(Integer.valueOf(mCorrelationId.incrementAndGet()));
        mSyncProxy.a(((com.ford.syncV4.e.e) (obj)));
        mSetup = true;
    }

    private List splitPrompt(String s)
    {
        ArrayList arraylist = new ArrayList();
        if (s != null)
        {
            if (s.length() < 100)
            {
                arraylist.add(s);
            } else
            {
                StringBuilder stringbuilder = new StringBuilder();
                String as1[] = StringHelper.split(s, " ");
                int l = as1.length;
                s = stringbuilder;
                int k = 0;
                while (k < l) 
                {
                    String s1 = as1[k];
                    s1 = (new StringBuilder()).append(s1).append(" ").toString();
                    if (s1.length() + s.length() < 100)
                    {
                        s.append(s1);
                    } else
                    {
                        arraylist.add(StringHelper.trim(s.toString()));
                        s = new StringBuilder();
                        s.append(s1);
                    }
                    k++;
                }
                if (s.length() > 0)
                {
                    arraylist.add(StringHelper.trim(s.toString()));
                    return arraylist;
                }
            }
        }
        return arraylist;
    }

    private boolean startProxy()
    {
        NinaPromptModel ninapromptmodel = loadPrompts();
        if (ninapromptmodel == null)
        {
            LogUtil.d("FORDSYNC_AppLinkManager", "Not starting SyncProxy; Prompts file not loaded", new Object[0]);
            return false;
        }
        if (!mConfigurationManager.getApplicationConfiguration().isFordSyncEnabled())
        {
            LogUtil.d("FORDSYNC_AppLinkManager", "Not starting SyncProxy; FordSync is disabled", new Object[0]);
            return false;
        }
        LogUtil.d("FORDSYNC_AppLinkManager", "startProxy: %s", new Object[] {
            mSyncProxy
        });
        if (mSyncProxy != null)
        {
            LogUtil.d("FORDSYNC_AppLinkManager", "SyncProxy is already started.", new Object[0]);
            return true;
        }
        try
        {
            mPrompts = ninapromptmodel.getFordSync("AppLinkService");
            mProxyListener = ProxyListener_.getInstance_(mContext);
            mProxyListener.setAppLinkManager(this);
            f.a(null, "Domino\u2019s Pizza", null, null, null, Boolean.valueOf(false), null, null, null, "3519075036", null);
            mSyncProxy = new i(mProxyListener, "Domino\u2019s Pizza", "Domino\u2019s", getVrSynonyms("app_name"), Boolean.valueOf(false), APP_DESIRED_LANGUAGE, APP_DESIRED_LANGUAGE, "3519075036");
            LogUtil.d("FORDSYNC_AppLinkManager", "startProxy: started %s", new Object[] {
                mSyncProxy
            });
        }
        catch (a a1)
        {
            LogUtil.e("FORDSYNC_AppLinkManager", "startProxy", a1, new Object[0]);
            return false;
        }
        return true;
    }

    private Vector text2tts(String s)
    {
        if (s == null)
        {
            return null;
        }
        Vector vector = new Vector();
        s = splitPrompt(s).iterator();
        do
        {
            if (!s.hasNext())
            {
                break;
            }
            String s1 = phoneticize((String)s.next());
            int k = 0;
            do
            {
                int l = s1.indexOf("[", k);
                if (l < 0)
                {
                    break;
                }
                if (k - l != 0)
                {
                    vector.add(bx.a(p.a, s1.substring(k, l)));
                }
                k = s1.indexOf("]", l);
                if (k <= l)
                {
                    LogUtil.e("FORDSYNC_AppLinkManager", "text2tts", new StringIndexOutOfBoundsException("Invalid format while parsing speech"), new Object[0]);
                }
                String as1[] = s1.substring(l + 1, k).split("\\|");
                if (as1.length != 3)
                {
                    LogUtil.e("FORDSYNC_AppLinkManager", "text2tts", new StringIndexOutOfBoundsException("Unexpected |"), new Object[0]);
                }
                if (mSpeechCapabilities != null && mSpeechCapabilities.contains(p.c))
                {
                    vector.add(bx.a(p.c, as1[2]));
                } else
                if (mSpeechCapabilities != null && mSpeechCapabilities.contains(p.b))
                {
                    vector.add(bx.a(p.b, as1[1]));
                } else
                {
                    vector.add(bx.a(p.a, as1[0]));
                }
                k++;
            } while (true);
            if (k < s1.length())
            {
                vector.add(bx.a(p.a, s1.substring(k)));
            }
        } while (true);
        return vector;
    }

    public transient void alert(PromptModel promptmodel, Object aobj[])
    {
        if (promptmodel == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        d d1 = new d();
        d1.a(Integer.valueOf(mCorrelationId.incrementAndGet()));
        d1.a(text2tts(promptmodel.getSpeech(aobj)));
        d1.a(promptmodel.getText(aobj));
        d1.a(Boolean.valueOf(true));
        d1.b(Integer.valueOf(10000));
        LogUtil.d("FORDSYNC_AppLinkManager", "alert[tts=%s, text2=%s, corrId=%d]", new Object[] {
            d1.e(), d1.d(), d1.c()
        });
        mSyncProxy.a(d1);
        return;
        promptmodel;
        LogUtil.e("FORDSYNC_AppLinkManager", "alert", promptmodel, new Object[0]);
        return;
    }

    protected void bgSpeak(Vector vector)
    {
        for (Iterator iterator = vector.iterator(); iterator.hasNext(); LogUtil.d("FORDSYNC_AppLinkManager", String.format("bgSpeak: {%s}", new Object[] {
    org.a.a.a.a.f.b((bv)iterator.next(), g.d)
}), new Object[0])) { }
        try
        {
            bn bn1 = new bn();
            bn1.a(vector);
            bn1.a(Integer.valueOf(mCorrelationId.incrementAndGet()));
            LogUtil.d("FORDSYNC_AppLinkManager", "bgSpeak: {%s}, corrId=%d", new Object[] {
                vector, bn1.c()
            });
            mSyncProxy.a(bn1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Vector vector)
        {
            LogUtil.e("FORDSYNC_AppLinkManager", "bgSpeak", vector, new Object[0]);
        }
    }

    public void callStore(String s)
    {
        show(mPrompts.getPrompter("calling_store"), new Object[] {
            s
        });
        mTelephonyManager.listen(phoneStateListener, 32);
        Intent intent = new Intent("android.intent.action.CALL");
        intent.setData(Uri.parse((new StringBuilder("tel:")).append(s).toString()));
        intent.addFlags(0x10040000);
        mContext.startActivity(intent);
    }

    public boolean canUseLocationServices()
    {
        return mLocationUpdateHandler.canUseLocationServices();
    }

    protected void clearLockScreen()
    {
        LogUtil.d("FORDSYNC_AppLinkManager", "clearLockScreen", new Object[0]);
        mContext.sendBroadcast(new Intent("intent.action.FORDSYNC_DISCONNECT"));
    }

    protected void deinitialize()
    {
        if (!mInitialized)
        {
            LogUtil.d("FORDSYNC_AppLinkManager", "Already de-initialized", new Object[0]);
            return;
        }
        if (mSyncProxy != null)
        {
            try
            {
                mSyncProxy.e();
                LogUtil.d("FORDSYNC_AppLinkManager", "SyncProxy disposed.", new Object[0]);
            }
            catch (a a1) { }
        }
        clearInitializedComponents();
        clearLockScreen();
        mInitialized = false;
        LogUtil.d("FORDSYNC_AppLinkManager", "De-initialized.", new Object[0]);
    }

    public void enableSyncTrace(boolean flag)
    {
        if (flag)
        {
            e.a(Boolean.valueOf(true));
            e.a(new _cls2());
            int k = com.ford.syncV4.h.a.a.c;
            e.a(k);
            e.d(k);
            e.e(k);
            e.b(k);
            e.c(k);
            e.f(k);
        }
    }

    public com.ford.syncV4.e.c.a.e getLastTurnHMILevel()
    {
        return mLastTurnHMILevel;
    }

    public NinaPromptModel getPromptModel()
    {
        return mPromptManager.getPromptModel();
    }

    public PromptCategoryModel getPrompts()
    {
        return mPrompts;
    }

    public Pair getStreetAndZipCode()
    {
        Object obj;
        Geocoder geocoder;
        obj = mLocationUpdateHandler.getLastLocation();
        LogUtil.d("FORDSYNC_AppLinkManager", "getStreetAndZipCode", new Object[] {
            "lastLocation = %s", obj
        });
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        geocoder = new Geocoder(mContext);
        obj = geocoder.getFromLocation(((Location) (obj)).getLatitude(), ((Location) (obj)).getLongitude(), 1);
        LogUtil.d("FORDSYNC_AppLinkManager", "getStreetAndZipCode", new Object[] {
            "addresses = %s", obj
        });
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        if (((List) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_144;
        }
        obj = (Address)((List) (obj)).get(0);
        obj = new Pair(collapseAddressLines(((Address) (obj))), StringHelper.defaultIfBlank(((Address) (obj)).getPostalCode(), ""));
        return ((Pair) (obj));
        Exception exception;
        exception;
        LogUtil.e("FORDSYNC_AppLinkManager", "getStreetAndZipCode", exception, new Object[0]);
        return null;
    }

    protected void handleInitialization(BluetoothAdapter bluetoothadapter)
    {
        if (bluetoothadapter != null && bluetoothadapter.isEnabled())
        {
            if (!mApplicationLoader.isApplicationInitialized() || !mConfigurationManager.getApplicationConfiguration().isFordSyncEnabled())
            {
                mApplicationLoader.setup(mFordSyncSession);
            }
            if (mApplicationLoader.isApplicationInitialized() && mConfigurationManager.getApplicationConfiguration().isFordSyncEnabled())
            {
                mInitialized = startProxy();
            }
        } else
        {
            LogUtil.d("FORDSYNC_AppLinkManager", "Bluetooth adapter disabled.", new Object[0]);
        }
        mInitializing = false;
        LogUtil.d("FORDSYNC_AppLinkManager", (new StringBuilder("Initialization process finished: ")).append(mInitialized).toString(), new Object[0]);
        if (!mInitialized)
        {
            stop();
        }
    }

    protected void initialize()
    {
        if (!mInitializing)
        {
            mInitializing = true;
            LogUtil.d("FORDSYNC_AppLinkManager", "Initializing...", new Object[0]);
            handleInitialization(getBluetoothAdapter());
            return;
        } else
        {
            LogUtil.d("FORDSYNC_AppLinkManager", "Already initializing", new Object[0]);
            return;
        }
    }

    public void interact(SyncInteraction syncinteraction)
    {
        currentInteraction = syncinteraction;
        PromptModel promptmodel = syncinteraction.getInitialPrompt();
        try
        {
            as as1 = new as();
            as1.a(text2tts(promptmodel.getSpeech(new Object[0])));
            as1.a(promptmodel.getText(new Object[0]));
            as1.b(syncinteraction.getChoiceSets());
            as1.c(text2tts(syncinteraction.getHelpPrompt()));
            as1.d(text2tts(syncinteraction.getTimeoutPrompt()));
            as1.a(h.c);
            as1.b(Integer.valueOf(15000));
            as1.d();
            as1.a(Integer.valueOf(mCorrelationId.incrementAndGet()));
            LogUtil.d("FORDSYNC_AppLinkManager", "performInteraction[pi=%s, corrId=%d]", new Object[] {
                syncinteraction.getClass().getSimpleName(), as1.c()
            });
            mSyncProxy.a(as1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SyncInteraction syncinteraction)
        {
            LogUtil.e("FORDSYNC_AppLinkManager", "performInteraction", syncinteraction, new Object[0]);
        }
    }

    public boolean isProxyConnected()
    {
        return mSyncProxy != null && mSyncProxy.d().booleanValue();
    }

    public boolean isProxyOnHMILevel(com.ford.syncV4.e.c.a.e e1)
    {
        return isProxyConnected() && mLastTurnHMILevel == e1;
    }

    public boolean isSetup()
    {
        return mSetup;
    }

    public void onAfterInject()
    {
        mConfigurationManager = (ConfigurationManager)mFordSyncSession.getManager("configuration_manager");
        mPromptManager = (PromptManager)mFordSyncSession.getManager("prompt_manager");
        mUserProfileManager = (UserProfileManager)mFordSyncSession.getManager("user_manager");
    }

    public void performWelcomeInteraction()
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onReceive: start welcome interaction", new Object[0]);
        if (!mUserProfileManager.isAuthorizedUser())
        {
            showWelcomeMessage();
            CallStore_.getInstance_(mContext).start();
            return;
        } else
        {
            showWelcomeMessage();
            speak(getPrompts().getPrompter("app_welcome").getRandomPrompt().getText(new Object[0]));
            HowMayIHelpYou_.getInstance_(mContext).start();
            return;
        }
    }

    protected void processVehicleData(o o, w w, s s, Double double1)
    {
        this;
        JVM INSTR monitorenter ;
        LogUtil.d("FORDSYNC_AppLinkManager", "processVehicleData: %s, %s, %s, %s", new Object[] {
            o, w, s, double1
        });
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        mLocationUpdateHandler.updateLocationViaVehicle(s);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        o;
        LogUtil.e("FORDSYNC_AppLinkManager", "processVehicleData", o, new Object[0]);
        if (true) goto _L2; else goto _L1
_L1:
        o;
        throw o;
    }

    public transient void prompt(PromptModel promptmodel, Object aobj[])
    {
        if (promptmodel != null)
        {
            show(promptmodel.getText(aobj));
            speak(promptmodel.getSpeech(aobj));
        }
    }

    public transient void prompt(PrompterModel promptermodel, Object aobj[])
    {
        if (promptermodel != null)
        {
            prompt(promptermodel.getRandomPrompt(), aobj);
        }
    }

    public void registerReceiver(BroadcastReceiver broadcastreceiver, IntentFilter intentfilter)
    {
        mBroadcastReceiverRegistry.add(broadcastreceiver);
        mContext.registerReceiver(broadcastreceiver, intentfilter);
    }

    public void reset()
    {
        reset(true);
    }

    public void reset(boolean flag)
    {
        LogUtil.d("FORDSYNC_AppLinkManager", "Resetting AppLink...", new Object[0]);
        if (flag && mSyncProxy != null)
        {
            try
            {
                mSyncProxy.a();
            }
            catch (a a1) { }
        }
        clearInitializedSpeechComponents();
    }

    public void restart()
    {
        Intent intent = new Intent(mContext, com/dominos/fordsync/service/AppLinkService_);
        intent.setAction("intent.action.FORDSYNC_REMOVE_CONNECTION_CHECK");
        mContext.startService(intent);
        deinitialize();
        initialize();
    }

    public void setApplicationIcon()
    {
        bc bc1 = new bc();
        bc1.a("LOGO_70");
        bc1.a(Integer.valueOf(mCorrelationId.incrementAndGet()));
        try
        {
            mSyncProxy.a(bc1);
            return;
        }
        catch (a a1)
        {
            return;
        }
    }

    public void setLastTurnHMILevel(com.ford.syncV4.e.c.a.e e1)
    {
        mLastTurnHMILevel = e1;
    }

    public void setLockScreenUp(boolean flag)
    {
        lockScreenUp = flag;
    }

    protected void setup(final BaseCallback setupCallback)
    {
        LogUtil.d("FORDSYNC_AppLinkManager", "setup started: %s %s", new Object[] {
            mSyncProxy.toString(), Boolean.valueOf(mSetup)
        });
        if (mSetup || setupCallback == null)
        {
            LogUtil.d("FORDSYNC_AppLinkManager", (new StringBuilder("setup() -> it is already setup, mSetup = ")).append(mSetup).toString(), new Object[0]);
            return;
        } else
        {
            setupCallback.onBegin();
            LogUtil.d("FORDSYNC_AppLinkManager", "setup() -> loading default images", new Object[0]);
            mProxyImageHandler.loadDefaultImages(mSyncProxy, mCorrelationId, new _cls3());
            return;
        }
    }

    public transient void show(PromptModel promptmodel, Object aobj[])
    {
        if (promptmodel != null)
        {
            show(promptmodel.getText(aobj));
        }
    }

    public transient void show(PrompterModel promptermodel, Object aobj[])
    {
        if (promptermodel != null)
        {
            show(promptermodel.getRandomPrompt(), aobj);
        }
    }

    public void show(String s)
    {
        String as1[] = new String[4];
        as1[0] = "";
        as1[1] = "";
        as1[2] = "";
        as1[3] = "";
        String as2[];
        int j1;
        as2 = s.split("\\s*\\|\\s*");
        j1 = as2.length;
        int k;
        int l;
        l = 0;
        k = 0;
_L5:
        if (l >= j1) goto _L2; else goto _L1
_L1:
        Object obj = as2[l];
        obj = ao.a(20).a(((CharSequence) (obj))).iterator();
_L3:
        String s1;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_276;
        }
        s1 = (String)((Iterator) (obj)).next();
        int i1;
        i1 = k + 1;
        as1[k] = s1;
        if (i1 > 3)
        {
            k = i1;
            break MISSING_BLOCK_LABEL_276;
        }
        break MISSING_BLOCK_LABEL_269;
_L2:
        try
        {
            bi bi1 = new bi();
            bi1.a(Integer.valueOf(mCorrelationId.incrementAndGet()));
            bi1.e(mContext.getString(0x7f080387));
            bi1.a(v.c);
            if (ProxyUtil.isProxyGraphicSupported(mSyncProxy))
            {
                bi1.a(ProxyUtil.getImage("HOME_185"));
            }
            bi1.a(as1[0]);
            bi1.b(as1[1]);
            bi1.c(as1[2]);
            bi1.d(as1[3]);
            bi1.a(mProxyImageHandler.getSoftButtons());
            LogUtil.d("FORDSYNC_AppLinkManager", "show() -> [text=%s, corrId=%d]", new Object[] {
                s, bi1.c()
            });
            mSyncProxy.a(bi1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogUtil.e("FORDSYNC_AppLinkManager", "show", s, new Object[0]);
        }
        return;
        k = i1;
          goto _L3
        l++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void showLockScreen()
    {
label0:
        {
            boolean flag1 = true;
            boolean flag2 = callInProgress;
            boolean flag;
            if (mSyncProxy != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (mSyncProxy == null || !mSyncProxy.d().booleanValue())
            {
                flag1 = false;
            }
            LogUtil.d("FORDSYNC_AppLinkManager", "showLockScreen[callInProgress=%s,proxy=%s,proxyConnected=%s]", new Object[] {
                Boolean.valueOf(flag2), Boolean.valueOf(flag), Boolean.valueOf(flag1)
            });
            if (!callInProgress && mSyncProxy != null && !lockScreenUp)
            {
                LogUtil.d("FORDSYNC_AppLinkManager", "showLockScreen: starting activity", new Object[0]);
                com.dominos.activities.LandingActivity_ landingactivity_ = LandingActivity.getInstance();
                if (landingactivity_ == null)
                {
                    break label0;
                }
                navigateToFordSync(landingactivity_, 0x4040000);
            }
            return;
        }
        navigateToFordSync(mContext, 0x14040000);
    }

    public void showWelcomeMessage()
    {
        show(getPrompts().getPrompter("app_welcome"), new Object[0]);
    }

    public void speak(String s)
    {
        LogUtil.d("FORDSYNC_AppLinkManager", String.format("speak: {%s}", new Object[] {
            s
        }), new Object[0]);
        bgSpeak(text2tts(s));
        try
        {
            mSpeakLatch = new CountDownLatch(1);
            LogUtil.d("FORDSYNC_AppLinkManager", "speak() -> waiting now...", new Object[0]);
            mSpeakLatch.await(2L, TimeUnit.MINUTES);
            LogUtil.d("FORDSYNC_AppLinkManager", "speak() -> waiting over, continuing with execution...", new Object[0]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogUtil.e("FORDSYNC_AppLinkManager", "speak", s, new Object[0]);
        }
    }

    public void start()
    {
        LogUtil.d("FORDSYNC_AppLinkManager", "Starting AppLink...", new Object[0]);
        mContext.startService(serviceIntent);
    }

    protected void startVehicleDataConsumer()
    {
        if (vehicleDataConsumer == null)
        {
            vehicleDataConsumer = new _cls4();
            (new Timer("VehicleDataConsumer")).schedule(vehicleDataConsumer, 5000L, 25000L);
        }
    }

    public void stop()
    {
        LogUtil.d("FORDSYNC_AppLinkManager", "Requesting AppLink service to stop...", new Object[0]);
        Intent intent = new Intent(mContext, com/dominos/fordsync/service/AppLinkService_);
        intent.setAction("intent.action.FORDSYNC_STOP_SERVICE");
        mContext.startService(intent);
    }

    public void unregisterReceiver(BroadcastReceiver broadcastreceiver)
    {
        mBroadcastReceiverRegistry.remove(broadcastreceiver);
        mContext.unregisterReceiver(broadcastreceiver);
    }

    public void updateLayout(String s)
    {
        try
        {
            if (ProxyUtil.isProxyGraphicSupported(mSyncProxy))
            {
                i k = mSyncProxy;
                int l = mCorrelationId.incrementAndGet();
                be be1 = new be();
                be1.a(Integer.valueOf(l));
                be1.a(s);
                k.a(be1);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public void uploadApplicationIcon()
    {
        mProxyImageHandler.loadImage(mSyncProxy, mCorrelationId, "LOGO_70");
    }

    static 
    {
        APP_DESIRED_LANGUAGE = j.a;
    }


/*
    static boolean access$002(AppLinkManager applinkmanager, boolean flag)
    {
        applinkmanager.callInProgress = flag;
        return flag;
    }

*/



/*
    static boolean access$202(AppLinkManager applinkmanager, boolean flag)
    {
        applinkmanager.mSetup = flag;
        return flag;
    }

*/




    private class _cls1 extends PhoneStateListener
    {

        private boolean calling;
        final AppLinkManager this$0;

        public void onCallStateChanged(int k, String s)
        {
            callInProgress = true;
            LogUtil.d("FORDSYNC_AppLinkManager", (new StringBuilder("onCallStateChanged: ")).append(k).toString(), new Object[0]);
            if (k == 2)
            {
                calling = true;
            } else
            if (k == 0 && calling)
            {
                mTelephonyManager.listen(this, 0);
                callInProgress = false;
                calling = false;
                show("");
                return;
            }
        }

        _cls1()
        {
            this$0 = AppLinkManager.this;
            super();
            calling = false;
        }
    }


    private class _cls2
        implements b
    {

        final AppLinkManager this$0;

        private String scanAndDecode(String s, Map map)
        {
            String s1 = s;
            if (map != null)
            {
                s1 = s;
                if (map.containsKey("d"))
                {
                    map = (String)map.get("d");
                    s1 = s.replaceFirst(map, new String(Base64.decode(map, 0)));
                }
            }
            return s1;
        }

        public void logXmlMsg(String s, String s1)
        {
            Map map = (Map)Xml.parse(s).get("msg");
            String s2 = s;
            if (map != null)
            {
                s = scanAndDecode(s, map);
                s2 = s;
                if (map.containsKey("frame"))
                {
                    s2 = scanAndDecode(s, (Map)map.get("frame"));
                }
            }
            LogUtil.wtf("FORDSYNC_AppLinkManager", String.format("%s, %s", new Object[] {
                s2, s1
            }), new Object[0]);
        }

        _cls2()
        {
            this$0 = AppLinkManager.this;
            super();
        }
    }


    private class _cls3 extends com.dominos.fordsync.util.ProxyImageHandler.LoadDefaultImageCallback
    {

        final AppLinkManager this$0;
        final BaseCallback val$setupCallback;

        public void onDefaultImagesLoadFailure()
        {
            LogUtil.d("FORDSYNC_AppLinkManager", "setup() -> images were not loaded, setting up interactions without images.", new Object[0]);
            try
            {
                setupInteractions(false);
            }
            catch (a a1)
            {
                mSetup = false;
            }
            setupCallback.onFinish();
        }

        public void onDefaultImagesLoaded()
        {
            LogUtil.d("FORDSYNC_AppLinkManager", "setup() -> images were load, setting up interactions with images.", new Object[0]);
            try
            {
                setupInteractions(true);
            }
            catch (a a1)
            {
                mSetup = false;
            }
            setupCallback.onFinish();
        }

        _cls3()
        {
            this$0 = AppLinkManager.this;
            setupCallback = basecallback;
            super();
        }
    }


    private class _cls4 extends TimerTask
    {

        final AppLinkManager this$0;

        public void run()
        {
            try
            {
                LogUtil.d("FORDSYNC_AppLinkManager", "getvehicledata: %s", new Object[] {
                    mSyncProxy
                });
                com.ford.syncV4.e.c.v v1 = new com.ford.syncV4.e.c.v();
                v1.a(Boolean.valueOf(true));
                v1.b(Boolean.valueOf(true));
                v1.c(Boolean.valueOf(true));
                v1.d(Boolean.valueOf(true));
                v1.e(Boolean.valueOf(true));
                v1.a(Integer.valueOf(mCorrelationId.incrementAndGet()));
                mSyncProxy.a(v1);
                return;
            }
            catch (a a1)
            {
                LogUtil.e("FORDSYNC_AppLinkManager", "getvehicledata", a1, new Object[0]);
            }
            cancelVehicleDataConsumer();
        }

        _cls4()
        {
            this$0 = AppLinkManager.this;
            super();
        }
    }

}
