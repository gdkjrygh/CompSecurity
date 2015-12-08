// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.activity;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.LocalBroadcastManager;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.app.LoadingStatus;
import com.netflix.mediaclient.android.app.UserInputManager;
import com.netflix.mediaclient.android.widget.AlertDialogFactory;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.logging.client.model.DataContext;
import com.netflix.mediaclient.service.user.UserAgentBroadcastIntents;
import com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.LaunchActivity;
import com.netflix.mediaclient.ui.RelaunchActivity;
import com.netflix.mediaclient.ui.ServiceErrorsHandler;
import com.netflix.mediaclient.ui.common.DebugMenuItems;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.kids.KidsUtils;
import com.netflix.mediaclient.ui.kids.NetflixKidsActionBar;
import com.netflix.mediaclient.ui.login.LogoutActivity;
import com.netflix.mediaclient.ui.mdx.MdxMiniPlayerFrag;
import com.netflix.mediaclient.ui.mdx.MdxReceiver;
import com.netflix.mediaclient.ui.pin.PinDialogVault;
import com.netflix.mediaclient.ui.pin.PinVerifier;
import com.netflix.mediaclient.ui.settings.SettingsActivity;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.DeviceUtils;
import com.netflix.mediaclient.util.LogUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public abstract class NetflixActivity extends Activity
    implements com.netflix.mediaclient.ui.details.EpisodeRowView.EpisodeRowListenerProvider, LoadingStatus, com.netflix.mediaclient.ui.mdx.ShowMessageDialogFrag.MessageResponseProvider, com.netflix.mediaclient.ui.pin.PinVerifier.PinVerificationCallback
{
    private class DefaultManagerStatusListener
        implements ManagerStatusListener
    {

        private final ManagerStatusListener listener;
        final NetflixActivity this$0;

        public void onManagerReady(ServiceManager servicemanager, int i)
        {
            Log.d("NetflixActivity", (new StringBuilder()).append("onManagerReady, status: ").append(i).toString());
            mIsTablet = servicemanager.isTablet();
            if (!NetflixService.isServiceReady(i))
            {
                startLaunchActivityIfVisible();
            }
            ((NetflixApplication)getApplication()).refreshLocale(servicemanager.getCurrentAppLocale());
            if (netflixActionBar != null)
            {
                netflixActionBar.onManagerReady();
            }
            if (mdxFrag != null)
            {
                mdxFrag.onManagerReady(servicemanager, i);
                if (shouldExpandMiniPlayer)
                {
                    shouldExpandMiniPlayer = false;
                    handler.postDelayed(new Runnable() {

                        final DefaultManagerStatusListener this$1;

                        public void run()
                        {
                            expandMiniPlayerIfVisible();
                        }

            
            {
                this$1 = DefaultManagerStatusListener.this;
                super();
            }
                    }, 400L);
                }
            }
            DialogFragment dialogfragment = getDialogFragment();
            if (dialogfragment instanceof ManagerStatusListener)
            {
                ((ManagerStatusListener)dialogfragment).onManagerReady(servicemanager, i);
            }
            addMdxReceiver();
            addUserAgentUpdateReceiver();
            if (showMdxInMenu())
            {
                invalidateOptionsMenu();
            }
            if (listener != null)
            {
                listener.onManagerReady(servicemanager, i);
            }
            if (!(NetflixActivity.this instanceof LaunchActivity))
            {
                servicemanager.getClientLogging().getApplicationPerformanceMetricsLogging().endUiStartupSession(true, null);
            }
            servicemanager.getClientLogging().setDataContext(getDataContext());
            reportUiViewChanged(getUiScreen());
        }

        public void onManagerUnavailable(ServiceManager servicemanager, int i)
        {
            Log.d("NetflixActivity", (new StringBuilder()).append("onManagerUnavailable, status: ").append(i).toString());
            if (mdxFrag != null)
            {
                mdxFrag.onManagerUnavailable(servicemanager, i);
            }
            DialogFragment dialogfragment = getDialogFragment();
            if (dialogfragment instanceof ManagerStatusListener)
            {
                ((ManagerStatusListener)dialogfragment).onManagerUnavailable(servicemanager, i);
            }
            if (listener != null)
            {
                listener.onManagerUnavailable(servicemanager, i);
            }
            startLaunchActivityIfVisible();
            if (shouldFinishOnManagerError())
            {
                Log.d("NetflixActivity", (new StringBuilder()).append(getClass().getSimpleName()).append(": Finishing activity because manager error occured...").toString());
                finish();
            }
        }

        public DefaultManagerStatusListener(ManagerStatusListener managerstatuslistener)
        {
            this$0 = NetflixActivity.this;
            super();
            listener = managerstatuslistener;
        }
    }


    private static final long ACTION_BAR_VISIBILITY_CHECK_DELAY_MS = 1000L;
    private static final String ACTION_FINISH_ALL_ACTIVITIES = "com.netflix.mediaclient.ui.login.ACTION_FINISH_ALL_ACTIVITIES";
    public static final long EXPAND_MINI_PLAYER_DELAY_MS = 400L;
    private static final String EXTRA_SHOULD_EXPAND_MINI_PLAYER = "mini_player_expanded";
    private static final String FRAG_DIALOG_TAG = "frag_dialog";
    private static final String INSTANCE_STATE_SAVED_TAG = "NetflixActivity_instanceState";
    public static final String INTENT_CATEGORY_UI = "LocalIntentNflxUi";
    private static final boolean PRINT_LOADING_STATUS = false;
    private static final String TAG = "NetflixActivity";
    private int actionBarHeight;
    private final Set autoUnregisterLocalBroadcastReceivers = new HashSet();
    private final Set autoUnregisterReceivers = new HashSet();
    private final BroadcastReceiver autokillReceiver = new BroadcastReceiver() {

        final NetflixActivity this$0;

        public void onReceive(Context context, Intent intent)
        {
            Log.v("NetflixActivity", (new StringBuilder()).append("Finishing activity ").append(getClass().getSimpleName()).append(" from intent: ").append(intent.getAction()).toString());
            finish();
        }

            
            {
                this$0 = NetflixActivity.this;
                super();
            }
    };
    private final BroadcastReceiver expandMdxMiniPlayerReceiver = new BroadcastReceiver() {

        final NetflixActivity this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (destroyed())
            {
                return;
            }
            if (intent == null || !"com.netflix.mediaclient.service.ACTION_EXPAND_MDX_MINI_PLAYER".equals(intent.getAction()))
            {
                Log.v("NetflixActivity", "Invalid intent: ");
                AndroidUtils.logIntent("NetflixActivity", intent);
                return;
            } else
            {
                expandMiniPlayerIfVisible();
                return;
            }
        }

            
            {
                this$0 = NetflixActivity.this;
                super();
            }
    };
    protected Handler handler;
    protected AtomicBoolean instanceStateSaved;
    private boolean isDestroyed;
    private boolean isVisible;
    protected AtomicLong mDialogCount;
    protected boolean mIsTablet;
    protected com.netflix.mediaclient.android.app.LoadingStatus.LoadingStatusCallback mLoadingStatusCallback;
    private MdxMiniPlayerFrag mdxFrag;
    private NetflixActionBar netflixActionBar;
    private final com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelSlideListener panelSlideListener = new com.sothree.slidinguppanel.SlidingUpPanelLayout.PanelSlideListener() {

        final NetflixActivity this$0;

        public void onPanelAnchored(View view)
        {
            Log.v("NetflixActivity", "onPanelAnchored");
        }

        public void onPanelCollapsed(View view)
        {
            Log.v("NetflixActivity", "onPanelCollapsed");
            onSlidingPanelCollapsed(view);
            if (mdxFrag != null)
            {
                mdxFrag.onPanelCollapsed();
            }
        }

        public void onPanelExpanded(View view)
        {
            Log.v("NetflixActivity", "onPanelExpanded");
            onSlidingPanelExpanded(view);
            if (mdxFrag != null)
            {
                mdxFrag.onPanelExpanded();
            }
        }

        public void onPanelSlide(View view, float f)
        {
            if (Log.isLoggable("NetflixActivity", 2))
            {
                Log.v("NetflixActivity", (new StringBuilder()).append("onPanelSlide, offset: ").append(f).toString());
            }
            if (mdxFrag != null)
            {
                mdxFrag.onPanelSlide(f);
            }
            if (systemActionBar != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            if (f >= 0.3F)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!systemActionBar.isShowing()) goto _L1; else goto _L3
_L3:
            systemActionBar.hide();
            return;
            if (systemActionBar.isShowing()) goto _L1; else goto _L4
_L4:
            systemActionBar.show();
            return;
        }

            
            {
                this$0 = NetflixActivity.this;
                super();
            }
    };
    private final Runnable printLoadingStatusRunnable = new Runnable() {

        final NetflixActivity this$0;

        public void run()
        {
        }

            
            {
                this$0 = NetflixActivity.this;
                super();
            }
    };
    private ServiceManager serviceManager;
    private boolean shouldExpandMiniPlayer;
    private SlidingUpPanelLayout slidingPanel;
    private ActionBar systemActionBar;
    private final Runnable updateActionBarVisibilityRunnable = new Runnable() {

        final NetflixActivity this$0;

        public void run()
        {
_L2:
            return;
            if (!isVisible || destroyed() || mdxFrag == null || slidingPanel == null || systemActionBar == null) goto _L2; else goto _L1
_L1:
            if (Log.isLoggable("NetflixActivity", 2))
            {
                Log.v("NetflixActivity", (new StringBuilder()).append("Checking to see if action bar visibility is valid.  Frag showing: ").append(mdxFrag.isShowing()).append(", panel expanded: ").append(slidingPanel.isExpanded()).append(", system action bar showing: ").append(systemActionBar.isShowing()).toString());
            }
            if (!mdxFrag.isShowing() || !slidingPanel.isExpanded())
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!systemActionBar.isShowing()) goto _L2; else goto _L3
_L3:
            Log.v("NetflixActivity", "Hiding action bar since it should not be shown");
            systemActionBar.hide();
            return;
            if (systemActionBar.isShowing()) goto _L2; else goto _L4
_L4:
            Log.v("NetflixActivity", "Showing action bar since it should not be hidden");
            systemActionBar.show();
            return;
        }

            
            {
                this$0 = NetflixActivity.this;
                super();
            }
    };
    private final BroadcastReceiver userAgentUpdateReceiver = new BroadcastReceiver() {

        final NetflixActivity this$0;

        private void logWithClassName(String s)
        {
            if (Log.isLoggable("NetflixActivity", 3))
            {
                Log.d("NetflixActivity", (new StringBuilder()).append(getClass().getSimpleName()).append(": ").append(s).toString());
            }
        }

        public void onReceive(Context context, Intent intent)
        {
            if (intent == null)
            {
                logWithClassName("Null intent");
                return;
            }
            context = intent.getAction();
            if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_ACTIVE".equals(context))
            {
                logWithClassName("User profile activated - restarting app");
                PinVerifier.getInstance().clearState();
                handleProfileActivated();
                return;
            }
            if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_DEACTIVE".equals(context))
            {
                logWithClassName("Account deactivated - restarting app");
                handleAccountDeactivated();
                return;
            }
            if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_READY_TO_SELECT".equals(context))
            {
                logWithClassName("Ready to select profile - calling children");
                handleProfileReadyToSelect();
                return;
            }
            if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_SELECTION_RESULT".equals(context))
            {
                int i = intent.getIntExtra("com.netflix.mediaclient.intent.action.EXTRA_USER_PROFILE_SELECTION_RESULT_INT", 0);
                context = intent.getStringExtra("com.netflix.mediaclient.intent.action.EXTRA_USER_PROFILE_SELECTION_RESULT_STRING");
                logWithClassName((new StringBuilder()).append("Profile selection status: ").append(i).toString());
                handleProfileSelectionResult(i, context);
                return;
            } else
            {
                logWithClassName((new StringBuilder()).append("No action taken for intent: ").append(context).toString());
                return;
            }
        }

            
            {
                this$0 = NetflixActivity.this;
                super();
            }
    };
    protected Dialog visibleDialog;
    protected Object visibleDialogLock;

    public NetflixActivity()
    {
        instanceStateSaved = new AtomicBoolean(false);
        visibleDialogLock = new Object();
        mDialogCount = new AtomicLong(1L);
        mIsTablet = false;
    }

    private void addMdxReceiver()
    {
        if (!showMdxInMenu())
        {
            Log.d("NetflixActivity", "Activity does not required MDX, skipping add of MDX receiver.");
            return;
        } else
        {
            Log.d("NetflixActivity", "Listen to updated from MDX service, add");
            MdxReceiver mdxreceiver = new MdxReceiver(this);
            registerReceiverWithAutoUnregister(mdxreceiver, mdxreceiver.getFilter());
            Log.d("NetflixActivity", "Listen to updated from MDX service, added");
            return;
        }
    }

    private void addUserAgentUpdateReceiver()
    {
        registerBroadcastReceiverLocallyWithAutoUnregister(userAgentUpdateReceiver, UserAgentBroadcastIntents.getNotificationIntentFilter());
    }

    private void collapseSlidingPanel()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (slidingPanel != null)
        {
            flag = flag1;
            if (slidingPanel.isExpanded())
            {
                Log.v("NetflixActivity", "Collapsing sliding panel...");
                flag = slidingPanel.collapsePane();
            }
        }
        if (!flag && mdxFrag != null)
        {
            mdxFrag.onPanelCollapsed();
        }
    }

    private int computeActionBarHeight()
    {
        Object obj = new TypedValue();
        getTheme().resolveAttribute(0x10102ce, ((TypedValue) (obj)), true);
        obj = obtainStyledAttributes(((TypedValue) (obj)).resourceId, new int[] {
            0x1010155
        });
        int i = ((TypedArray) (obj)).getDimensionPixelSize(0, -1);
        ((TypedArray) (obj)).recycle();
        if (Log.isLoggable("NetflixActivity", 2))
        {
            Log.v("NetflixActivity", (new StringBuilder()).append("computed action bar height as: ").append(i).toString());
        }
        return i;
    }

    public static void finishAllActivities(Context context)
    {
        context.sendBroadcast(new Intent("com.netflix.mediaclient.ui.login.ACTION_FINISH_ALL_ACTIVITIES"));
    }

    public static ImageLoader getImageLoader(Context context)
    {
        return ((NetflixActivity)context).serviceManager.getImageLoader();
    }

    private void postActionBarUpdate()
    {
        handler.removeCallbacks(updateActionBarVisibilityRunnable);
        handler.postDelayed(updateActionBarVisibilityRunnable, 1000L);
    }

    private void setInstanceStateSaved(boolean flag)
    {
        Log.v("NetflixActivity_instanceState", (new StringBuilder()).append(getClass().getSimpleName()).append(" instanceStateSaved: ").append(flag).toString());
        synchronized (instanceStateSaved)
        {
            instanceStateSaved.set(flag);
        }
        return;
        exception;
        atomicboolean;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected NetflixActionBar createActionBar(ActionBar actionbar)
    {
        if (isForKids())
        {
            return new NetflixKidsActionBar(this, hasUpAction());
        } else
        {
            return new NetflixActionBar(this, hasUpAction());
        }
    }

    protected ManagerStatusListener createManagerStatusListener()
    {
        return null;
    }

    public boolean destroyed()
    {
        return isDestroyed;
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        getNetflixApplication().getUserInput().updateUserInteraction();
        if (mdxFrag != null && mdxFrag.dispatchKeyEvent(keyevent))
        {
            return true;
        } else
        {
            return super.dispatchKeyEvent(keyevent);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        getNetflixApplication().getUserInput().updateUserInteraction();
        return super.dispatchTouchEvent(motionevent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionevent)
    {
        getNetflixApplication().getUserInput().updateUserInteraction();
        return super.dispatchTrackballEvent(motionevent);
    }

    public Dialog displayDialog(android.app.AlertDialog.Builder builder)
    {
        if (builder == null)
        {
            return null;
        }
        synchronized (visibleDialogLock)
        {
            builder = builder.create();
            displayDialog(((Dialog) (builder)));
        }
        return builder;
        builder;
        obj;
        JVM INSTR monitorexit ;
        throw builder;
    }

    public Dialog displayDialog(com.netflix.mediaclient.android.widget.UpdateDialog.Builder builder)
    {
        if (builder == null || destroyed())
        {
            return null;
        }
        synchronized (visibleDialogLock)
        {
            builder = builder.create();
            displayDialog(((Dialog) (builder)));
        }
        return builder;
        builder;
        obj;
        JVM INSTR monitorexit ;
        throw builder;
    }

    public void displayDialog(Dialog dialog)
    {
        if (dialog == null || destroyed())
        {
            return;
        }
        synchronized (visibleDialogLock)
        {
            if (!destroyed())
            {
                break MISSING_BLOCK_LABEL_34;
            }
        }
        return;
        dialog;
        obj;
        JVM INSTR monitorexit ;
        throw dialog;
        if (visibleDialog != null)
        {
            visibleDialog.dismiss();
        }
        dialog.show();
        visibleDialog = dialog;
        obj;
        JVM INSTR monitorexit ;
    }

    protected void displayErrorDialog(String s, int i)
    {
        displayUserAgentDialog(String.format("%s ( %d )", new Object[] {
            s, Integer.valueOf(i)
        }), new Runnable() {

            final NetflixActivity this$0;

            public void run()
            {
                finish();
            }

            
            {
                this$0 = NetflixActivity.this;
                super();
            }
        }, true);
    }

    protected void displayUserAgentDialog(String s, Runnable runnable, boolean flag)
    {
        com.netflix.mediaclient.android.widget.UpdateDialog.Builder builder;
        runnable = new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor(null, s, getString(0x104000a), runnable);
        builder = AlertDialogFactory.createDialog(this, handler, runnable);
        if (destroyed())
        {
            break MISSING_BLOCK_LABEL_255;
        }
        runnable = ((Runnable) (visibleDialogLock));
        runnable;
        JVM INSTR monitorenter ;
        if (!flag) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("NetflixActivity", 3))
        {
            Log.d("NetflixActivity", (new StringBuilder()).append("displayUserAgentDialog ").append(s).append(" isCritical").toString());
        }
        displayDialog(builder);
_L3:
        runnable;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (getVisibleDialog() == null || getVisibleDialog().isShowing())
        {
            break MISSING_BLOCK_LABEL_165;
        }
        if (Log.isLoggable("NetflixActivity", 3))
        {
            Log.d("NetflixActivity", (new StringBuilder()).append("displayUserAgentDialog ").append(s).toString());
        }
        displayDialog(builder);
          goto _L3
        s;
        runnable;
        JVM INSTR monitorexit ;
        throw s;
        if (getVisibleDialog() != null) goto _L5; else goto _L4
_L4:
        if (Log.isLoggable("NetflixActivity", 3))
        {
            Log.d("NetflixActivity", (new StringBuilder()).append("displayUserAgentDialog, no dialog  ").append(s).toString());
        }
        displayDialog(builder);
          goto _L3
_L5:
        if (!Log.isLoggable("NetflixActivity", 3)) goto _L3; else goto _L6
_L6:
        Log.e("NetflixActivity", (new StringBuilder()).append("displayUserAgentDialog, Dialog visible, skipping  ").append(s).toString());
          goto _L3
    }

    protected void expandMiniPlayerIfVisible()
    {
        if (isVisible)
        {
            Log.v("NetflixActivity", "Activity is visible, checking for MDX mini player to see if it can be expanded...");
            StringBuilder stringbuilder = (new StringBuilder()).append("MDX frag showing: ");
            Object obj;
            if (mdxFrag == null)
            {
                obj = "null";
            } else
            {
                obj = Boolean.valueOf(mdxFrag.isShowing());
            }
            Log.v("NetflixActivity", stringbuilder.append(obj).toString());
            if (mdxFrag != null && mdxFrag.isShowing() && slidingPanel != null)
            {
                Log.v("NetflixActivity", "Expanding mini player");
                if (slidingPanel.expandPane())
                {
                    obj = "Panel is expanding";
                } else
                {
                    obj = "Panel is NOT expanding";
                }
                Log.v("NetflixActivity", ((String) (obj)));
            }
        }
    }

    public void finish()
    {
        if (Log.isLoggable("NetflixActivity", 3))
        {
            Log.d("NetflixActivity", (new StringBuilder()).append(getClass().getSimpleName()).append(": finish has been called").toString());
        }
        super.finish();
    }

    public int getActionBarHeight()
    {
        return actionBarHeight;
    }

    protected ApplicationPerformanceMetricsLogging getApmSafely()
    {
        Object obj = getServiceManager();
        if (obj != null)
        {
            obj = ((ServiceManager) (obj)).getClientLogging();
            if (obj != null)
            {
                return ((IClientLogging) (obj)).getApplicationPerformanceMetricsLogging();
            }
        }
        return null;
    }

    protected DataContext getDataContext()
    {
        return null;
    }

    public DialogFragment getDialogFragment()
    {
        return (DialogFragment)getFragmentManager().findFragmentByTag("frag_dialog");
    }

    public com.netflix.mediaclient.ui.details.EpisodeRowView.EpisodeRowListener getEpisodeRowListener()
    {
        return mdxFrag;
    }

    public MdxMiniPlayerFrag getMdxMiniPlayerFrag()
    {
        return mdxFrag;
    }

    public NetflixActionBar getNetflixActionBar()
    {
        return netflixActionBar;
    }

    public NetflixApplication getNetflixApplication()
    {
        return (NetflixApplication)getApplication();
    }

    public ServiceManager getServiceManager()
    {
        return serviceManager;
    }

    public abstract com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getUiScreen();

    public Dialog getVisibleDialog()
    {
        return visibleDialog;
    }

    protected void handleAccountDeactivated()
    {
        finish();
        if (isVisible && !(this instanceof LogoutActivity))
        {
            startActivity(LogoutActivity.create(this));
        }
    }

    protected boolean handleBackPressed()
    {
        return false;
    }

    protected void handleNetworkErrorDialog()
    {
        finish();
    }

    protected void handleProfileActivated()
    {
        finish();
    }

    protected void handleProfileReadyToSelect()
    {
    }

    protected void handleProfileSelectionResult(int i, String s)
    {
    }

    protected void handleUserAgentErrors(Activity activity, int i, String s)
    {
        if (s == null)
        {
            s = "";
        }
        switch (i)
        {
        default:
            displayErrorDialog(getString(0x7f0c0197), i);
            return;

        case -202: 
            displayUserAgentDialog(s, null, false);
            return;

        case -207: 
        case -203: 
            displayUserAgentDialog(String.format("%s ( %d )", new Object[] {
                getString(0x7f0c019c), Integer.valueOf(i)
            }), new Runnable() {

                final NetflixActivity this$0;

                public void run()
                {
                    long l = System.nanoTime();
                    Log.d("NetflixActivity", (new StringBuilder()).append("Restarting app, time: ").append(l).toString());
                    finish();
                    startActivity(LogoutActivity.create(NetflixActivity.this));
                }

            
            {
                this$0 = NetflixActivity.this;
                super();
            }
            }, true);
            return;

        case -208: 
            ServiceErrorsHandler.handleManagerResponse(this, -5);
            return;

        case -211: 
        case -210: 
        case -209: 
        case -206: 
        case -205: 
        case -204: 
        case -201: 
        case -200: 
            displayUserAgentDialog(String.format("%s ( %d )", new Object[] {
                getString(0x7f0c0193), Integer.valueOf(i)
            }), null, false);
            return;

        case -122: 
        case -121: 
        case -120: 
            displayErrorDialog(getString(0x7f0c0196), i);
            break;
        }
    }

    protected boolean hasUpAction()
    {
        return true;
    }

    public void hideMdxMiniPlayer()
    {
        if (mdxFrag != null)
        {
            mdxFrag.hide();
        }
    }

    public boolean isDialogFragmentVisible()
    {
        return getDialogFragment() != null;
    }

    public boolean isForKids()
    {
        return false;
    }

    public boolean isPanelExpanded()
    {
        if (slidingPanel == null)
        {
            return false;
        } else
        {
            return slidingPanel.isExpanded();
        }
    }

    public boolean isTablet()
    {
        return mIsTablet;
    }

    public void notifyMdxEndOfPlayback()
    {
        Log.v("NetflixActivity", "MDX end of playback");
        collapseSlidingPanel();
        postActionBarUpdate();
    }

    public void notifyMdxMiniPlayerHidden()
    {
        Log.v("NetflixActivity", "MDX frag hidden");
        collapseSlidingPanel();
        postActionBarUpdate();
    }

    public void notifyMdxMiniPlayerShown()
    {
        Log.v("NetflixActivity", "MDX frag shown");
        postActionBarUpdate();
    }

    public void notifyMdxShowDetailsRequest()
    {
        handler.postDelayed(new Runnable() {

            final NetflixActivity this$0;

            public void run()
            {
                collapseSlidingPanel();
            }

            
            {
                this$0 = NetflixActivity.this;
                super();
            }
        }, 250L);
    }

    public void onBackPressed()
    {
        if (Log.isLoggable("NetflixActivity", 2))
        {
            Log.v("NetflixActivity", (new StringBuilder()).append(getClass().getSimpleName()).append(": back button pressed").toString());
        }
        if (slidingPanel != null && mdxFrag != null && slidingPanel.isExpanded() && mdxFrag.isVisible())
        {
            Log.v("NetflixActivity", "MDX mini player sliding panel was expanded, collapsing...");
            slidingPanel.collapsePane();
        } else
        if (!handleBackPressed())
        {
            LogUtils.reportUIViewCommand(this, com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName.backButton, getUiScreen(), getDataContext());
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        boolean flag = true;
        super.onCreate(bundle);
        setInstanceStateSaved(false);
        if (Log.isLoggable("NetflixActivity", 2))
        {
            Log.v("NetflixActivity", (new StringBuilder()).append("Creating activity: ").append(getClass().getSimpleName()).append(", hash: ").append(hashCode()).toString());
        }
        if (isForKids())
        {
            setRequestedOrientation(1);
        }
        if (shouldShowKidsBackground())
        {
            getWindow().setBackgroundDrawableResource(0x7f0200df);
        }
        if (bundle == null || !bundle.getBoolean("mini_player_expanded", false))
        {
            flag = false;
        }
        shouldExpandMiniPlayer = flag;
        Log.v("NetflixActivity", (new StringBuilder()).append("Should expand mini player: ").append(shouldExpandMiniPlayer).toString());
        registerFinishReceiverWithAutoUnregister("com.netflix.mediaclient.ui.login.ACTION_FINISH_ALL_ACTIVITIES");
        registerReceiverWithAutoUnregister(expandMdxMiniPlayerReceiver, "com.netflix.mediaclient.service.ACTION_EXPAND_MDX_MINI_PLAYER");
        actionBarHeight = computeActionBarHeight();
        systemActionBar = super.getActionBar();
        if (systemActionBar != null)
        {
            netflixActionBar = createActionBar(systemActionBar);
        }
        setupServicemanager();
        handler = new Handler();
    }

    protected void onCreateOptionsMenu(Menu menu, Menu menu1)
    {
        if (menu1 != null)
        {
            (new DebugMenuItems("NetflixActivity", this)).addItems(menu1);
        }
        if (showSettingsInMenu())
        {
            menu.add(0x7f0c0111).setIcon(0x7f0200d8).setIntent(SettingsActivity.createStartIntent(this));
        }
        if (showSignOutInMenu())
        {
            menu.add(0x7f0c0141).setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() {

                final NetflixActivity this$0;

                public boolean onMenuItemClick(MenuItem menuitem)
                {
                    LogoutActivity.showLogoutDialog(NetflixActivity.this);
                    return true;
                }

            
            {
                this$0 = NetflixActivity.this;
                super();
            }
            });
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        Log.v("NetflixActivity", "onCreateOptionsMenu");
        onCreateOptionsMenu(menu, null);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy()
    {
        ((NetflixApplication)getApplication()).releaseCurrentActivity(this);
        if (Log.isLoggable("NetflixActivity", 2))
        {
            Log.v("NetflixActivity", (new StringBuilder()).append("Destroying activity: ").append(getClass().getSimpleName()).append(", hash: ").append(hashCode()).toString());
        }
        isDestroyed = true;
        for (Iterator iterator = autoUnregisterReceivers.iterator(); iterator.hasNext(); unregisterReceiver((BroadcastReceiver)iterator.next())) { }
        BroadcastReceiver broadcastreceiver;
        for (Iterator iterator1 = autoUnregisterLocalBroadcastReceivers.iterator(); iterator1.hasNext(); LocalBroadcastManager.getInstance(this).unregisterReceiver(broadcastreceiver))
        {
            broadcastreceiver = (BroadcastReceiver)iterator1.next();
        }

        if (serviceManager != null)
        {
            serviceManager.release();
        }
        super.onDestroy();
    }

    protected void onLoaded(int i)
    {
        if (mLoadingStatusCallback != null)
        {
            mLoadingStatusCallback.onDataLoaded(i);
        }
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        Log.v("NetflixActivity", (new StringBuilder()).append("onMenuItemSelected: ").append(menuitem.getItemId()).toString());
        if (menuitem != null && netflixActionBar != null && netflixActionBar.handleHomeButtonSelected(menuitem))
        {
            return true;
        } else
        {
            return super.onMenuItemSelected(i, menuitem);
        }
    }

    protected void onPause()
    {
        super.onPause();
        ((NetflixApplication)getApplication()).releaseCurrentActivity(this);
        isVisible = false;
        handler.removeCallbacks(printLoadingStatusRunnable);
    }

    public void onPinVerified(PinDialogVault pindialogvault)
    {
        throw new IllegalStateException(String.format("onPinVerified vault: %s", new Object[] {
            pindialogvault
        }));
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        Log.v("NetflixActivity", (new StringBuilder()).append(getClass().getSimpleName()).append(": onPostCreate").toString());
    }

    protected void onPostResume()
    {
        super.onPostResume();
        if (mdxFrag != null)
        {
            mdxFrag.onResumeFragments();
        }
    }

    public void onResponse(String s)
    {
        if (Log.isLoggable("NetflixActivity", 3))
        {
            Log.d("NetflixActivity", (new StringBuilder()).append("onResponse: User selected: ").append(s).toString());
        }
        if (mdxFrag != null)
        {
            mdxFrag.sendDialogResponse(s);
        }
    }

    protected void onResume()
    {
        super.onResume();
        setInstanceStateSaved(false);
        ((NetflixApplication)getApplication()).setCurrentActivity(this);
        isVisible = true;
        handler.post(printLoadingStatusRunnable);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        boolean flag = true;
        setInstanceStateSaved(true);
        super.onSaveInstanceState(bundle);
        if (mdxFrag == null || !mdxFrag.isShowing() || slidingPanel == null || !slidingPanel.isExpanded())
        {
            flag = false;
        }
        bundle.putBoolean("mini_player_expanded", flag);
    }

    protected void onSlidingPanelCollapsed(View view)
    {
    }

    protected void onSlidingPanelExpanded(View view)
    {
    }

    protected void onStart()
    {
        super.onStart();
        LogUtils.reportNavigationActionStarted(this, null, getUiScreen());
        mdxFrag = (MdxMiniPlayerFrag)getFragmentManager().findFragmentById(0x7f07010f);
        slidingPanel = (SlidingUpPanelLayout)findViewById(0x7f0700b5);
        if (slidingPanel != null)
        {
            slidingPanel.setDragView(mdxFrag.getSlidingPanelDragView());
            slidingPanel.setPanelHeight(getResources().getDimensionPixelSize(0x7f0a0034));
            slidingPanel.setShadowDrawable(getResources().getDrawable(0x7f020164));
            slidingPanel.setPanelSlideListener(panelSlideListener);
            if (shouldApplyPaddingToSlidingPanel())
            {
                View view = slidingPanel.getChildAt(0);
                view.setPadding(view.getPaddingLeft(), actionBarHeight, view.getPaddingRight(), view.getPaddingBottom());
            }
        }
    }

    protected void onStop()
    {
        LogUtils.reportNavigationActionEnded(this, getUiScreen(), com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.success, null);
        Object obj = visibleDialogLock;
        obj;
        JVM INSTR monitorenter ;
        Dialog dialog = visibleDialog;
        if (dialog == null) goto _L2; else goto _L1
_L1:
        visibleDialog.dismiss();
_L3:
        visibleDialog = null;
_L2:
        obj;
        JVM INSTR monitorexit ;
        super.onStop();
        return;
        Object obj1;
        obj1;
        Log.e("NetflixActivity", "Failed to dismiss dialog!", ((Throwable) (obj1)));
          goto _L3
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public void performUpAction()
    {
        if (KidsUtils.shouldShowBackNavigationAffordance(this))
        {
            LogUtils.reportUIViewCommand(this, com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName.actionBarBackButton, getUiScreen(), getDataContext());
            finish();
            return;
        } else
        {
            startActivity(HomeActivity.createShowIntent(this));
            LogUtils.reportUIViewCommand(this, com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName.upButton, getUiScreen(), getDataContext());
            return;
        }
    }

    public void registerBroadcastReceiverLocallyWithAutoUnregister(BroadcastReceiver broadcastreceiver, IntentFilter intentfilter)
    {
        LocalBroadcastManager.getInstance(this).registerReceiver(broadcastreceiver, intentfilter);
        autoUnregisterLocalBroadcastReceivers.add(broadcastreceiver);
    }

    protected void registerFinishReceiverWithAutoUnregister(String s)
    {
        registerReceiverWithAutoUnregister(autokillReceiver, s);
    }

    public void registerReceiverWithAutoUnregister(BroadcastReceiver broadcastreceiver, IntentFilter intentfilter)
    {
        super.registerReceiver(broadcastreceiver, intentfilter);
        autoUnregisterReceivers.add(broadcastreceiver);
    }

    public void registerReceiverWithAutoUnregister(BroadcastReceiver broadcastreceiver, String s)
    {
        registerReceiverWithAutoUnregister(broadcastreceiver, new IntentFilter(s));
    }

    public void removeDialogFrag()
    {
        FragmentTransaction fragmenttransaction = getFragmentManager().beginTransaction();
        DialogFragment dialogfragment = getDialogFragment();
        if (dialogfragment != null)
        {
            if (dialogfragment instanceof DialogFragment)
            {
                ((DialogFragment)dialogfragment).dismiss();
            }
            fragmenttransaction.remove(dialogfragment);
        }
        fragmenttransaction.commitAllowingStateLoss();
    }

    public void removeVisibleDialog()
    {
        synchronized (visibleDialogLock)
        {
            if (visibleDialog != null)
            {
                visibleDialog.dismiss();
                visibleDialog = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void reportUiModelessViewSessionEnded(com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview, String s)
    {
        ApplicationPerformanceMetricsLogging applicationperformancemetricslogging = getApmSafely();
        if (applicationperformancemetricslogging != null)
        {
            boolean flag = DeviceUtils.isPortrait(this);
            if (Log.isLoggable("NetflixActivity", 3))
            {
                Log.d("NetflixActivity", (new StringBuilder()).append("Report UI modeless view session ended for  ").append(modalview).append(" in portrait: ").append(flag).append(". Dialog id: ").append(s).toString());
            }
            applicationperformancemetricslogging.endUiModelessViewSession(s);
        }
    }

    public String reportUiModelessViewSessionStart(com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        ApplicationPerformanceMetricsLogging applicationperformancemetricslogging = getApmSafely();
        if (applicationperformancemetricslogging != null && modalview != null)
        {
            boolean flag = DeviceUtils.isPortrait(this);
            String s = String.valueOf(mDialogCount.getAndIncrement());
            if (Log.isLoggable("NetflixActivity", 3))
            {
                Log.d("NetflixActivity", (new StringBuilder()).append("Report UI modeless view session started for  ").append(modalview).append(" in portrait: ").append(flag).append(". Dialog id: ").append(s).toString());
            }
            applicationperformancemetricslogging.startUiModelessViewSession(flag, modalview, s);
            return s;
        } else
        {
            return null;
        }
    }

    protected void reportUiViewChanged(com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        ApplicationPerformanceMetricsLogging applicationperformancemetricslogging = getApmSafely();
        if (applicationperformancemetricslogging != null && modalview != null)
        {
            boolean flag = DeviceUtils.isPortrait(this);
            if (Log.isLoggable("NetflixActivity", 3))
            {
                Log.d("NetflixActivity", (new StringBuilder()).append("Report UI view change for  ").append(modalview).append(" in portrait: ").append(flag).toString());
            }
            applicationperformancemetricslogging.uiViewChanged(flag, modalview);
        }
    }

    public void runInUiThread(Runnable runnable)
    {
        if (runnable == null || destroyed())
        {
            return;
        } else
        {
            runOnUiThread(runnable);
            return;
        }
    }

    public void setLoadingStatusCallback(com.netflix.mediaclient.android.app.LoadingStatus.LoadingStatusCallback loadingstatuscallback)
    {
        if (!isLoadingData() && loadingstatuscallback != null)
        {
            loadingstatuscallback.onDataLoaded(0);
            return;
        } else
        {
            mLoadingStatusCallback = loadingstatuscallback;
            return;
        }
    }

    protected void setupServicemanager()
    {
        serviceManager = new ServiceManager(this, new DefaultManagerStatusListener(createManagerStatusListener()));
    }

    public boolean shouldAddMdxToMenu()
    {
        if (!showMdxInMenu())
        {
            Log.d("NetflixActivity", "Activity does not required MDX.");
            return false;
        }
        if (serviceManager == null || !serviceManager.isReady() || serviceManager.getMdx() == null)
        {
            Log.w("NetflixActivity", "Service manager or mdx are null or service manager is not ready.");
            return false;
        }
        if (!serviceManager.isUserLoggedIn())
        {
            Log.d("NetflixActivity", "User is not logged in, not adding MDX icon");
            return false;
        } else
        {
            return true;
        }
    }

    public boolean shouldApplyPaddingToSlidingPanel()
    {
        return true;
    }

    protected boolean shouldFinishOnManagerError()
    {
        return true;
    }

    protected boolean shouldShowKidsBackground()
    {
        return isForKids();
    }

    public void showDialog(DialogFragment dialogfragment)
    {
        if (dialogfragment == null || isDestroyed || instanceStateSaved.get())
        {
            return;
        }
        synchronized (instanceStateSaved)
        {
            if (!instanceStateSaved.get())
            {
                break MISSING_BLOCK_LABEL_47;
            }
        }
        return;
        dialogfragment;
        atomicboolean;
        JVM INSTR monitorexit ;
        throw dialogfragment;
        FragmentTransaction fragmenttransaction;
        DialogFragment dialogfragment1;
        fragmenttransaction = getFragmentManager().beginTransaction();
        dialogfragment1 = getDialogFragment();
        if (dialogfragment1 == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        if (dialogfragment1 instanceof DialogFragment)
        {
            Log.v("NetflixActivity", "Dismissing previous dialog");
            ((DialogFragment)dialogfragment1).dismiss();
        }
        Log.v("NetflixActivity", "Removing previous dialog");
        fragmenttransaction.remove(dialogfragment1);
        fragmenttransaction.addToBackStack(null);
        Log.v("NetflixActivity", "Showing dialog");
        dialogfragment.show(fragmenttransaction, "frag_dialog");
        atomicboolean;
        JVM INSTR monitorexit ;
    }

    public void showFetchErrorsToast()
    {
    }

    protected boolean showMdxInMenu()
    {
        return true;
    }

    protected boolean showSettingsInMenu()
    {
        return !isForKids();
    }

    protected boolean showSignOutInMenu()
    {
        return !isForKids();
    }

    protected void startLaunchActivityIfVisible()
    {
        if (isVisible && !(this instanceof LaunchActivity))
        {
            Log.i("NetflixActivity", "Activity is visible, starting launch activity");
            startActivity(RelaunchActivity.createStartIntent(this, "startLaunchActivityIfVisible()").addFlags(0x20000));
            return;
        } else
        {
            Log.v("NetflixActivity", "Activity is not visible, skipping launch of new activity");
            return;
        }
    }

    public void updateVisibleDialog(Dialog dialog)
    {
        if (dialog == null)
        {
            return;
        }
        synchronized (visibleDialogLock)
        {
            if (visibleDialog != null)
            {
                visibleDialog.dismiss();
            }
            visibleDialog = dialog;
        }
        return;
        dialog;
        obj;
        JVM INSTR monitorexit ;
        throw dialog;
    }





/*
    static boolean access$202(NetflixActivity netflixactivity, boolean flag)
    {
        netflixactivity.shouldExpandMiniPlayer = flag;
        return flag;
    }

*/







}
