// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.Participant;
import com.skype.SkyLib;
import com.skype.android.SkypeApplication;
import com.skype.android.SkypeConstants;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.calling.CallView;
import com.skype.android.calling.CallViewElementFactory;
import com.skype.android.calling.CameraFacing;
import com.skype.android.calling.UnhandledGestureListener;
import com.skype.android.event.EventBusInstance;
import com.skype.android.inject.EventSubscriberBinder;
import com.skype.android.util.CheckedBroadcastReceiver;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.PropertyAnimationUtil;
import com.skype.android.util.ViewStateManager;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.video.OnVideoDisplayChangedListener;
import com.skype.android.video.ViewSnapper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import wei.mark.standout.StandOutWindow;
import wei.mark.standout.a.a;
import wei.mark.standout.ui.Window;

// Referenced classes of package com.skype.android.app.calling:
//            CallConstants, DaggerVideoMonitorComponent, VideoFacade, CallActivity, 
//            CallVideoFacade, CallAgent, VideoMonitorComponent

public class VideoMonitor extends StandOutWindow
    implements SkypeConstants, CallConstants, CallViewElementFactory, UnhandledGestureListener, OnVideoDisplayChangedListener
{
    private final class a extends CheckedBroadcastReceiver
    {

        final VideoMonitor this$0;

        public final void onReceiveFiltered(Context context1, Intent intent, int i)
        {
            i;
            JVM INSTR tableswitch 0 1: default 24
        //                       0 25
        //                       1 48;
               goto _L1 _L2 _L3
_L1:
            return;
_L2:
            if (videoFacade != null)
            {
                videoFacade.stop();
                return;
            }
            continue; /* Loop/switch isn't completed */
_L3:
            if (videoFacade != null && ongoingCall.get())
            {
                videoFacade.initialize(lib, conversation, videoMonitorCallView);
                videoFacade.start();
                return;
            }
            if (true) goto _L1; else goto _L4
_L4:
        }

        a()
        {
            this$0 = VideoMonitor.this;
            super(VideoMonitor.SCREEN_TOGGLE_ACTIONS);
        }
    }


    private static final Logger LOG = Logger.getLogger("VideoMonitor");
    private static final int PRIVATE_FLAG_NO_MOVE_ANIMATION = 64;
    private static final int SCREEN_OFF_POSITION = 0;
    private static final int SCREEN_ON_POSITION = 1;
    private static final String SCREEN_TOGGLE_ACTIONS[] = {
        "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON"
    };
    private static final AtomicInteger invokedCount = new AtomicInteger(0);
    private static boolean isShowing;
    private static boolean showIntent;
    AccessibilityUtil accessibilityUtil;
    Analytics analytics;
    PropertyAnimationUtil animationUtil;
    CallAgent callAgent;
    private VideoMonitorComponent component;
    private Context context;
    private Conversation conversation;
    ConversationUtil conversationUtil;
    private EventSubscriberBinder eventBinder;
    private GestureDetector gestureDetector;
    SkyLib lib;
    private CameraFacing myCameraFacing;
    private AtomicBoolean ongoingCall;
    private View overlay;
    private boolean restrictTouch;
    private CheckedBroadcastReceiver screenOffReceiver;
    private android.view.GestureDetector.SimpleOnGestureListener simpleGestureDetector;
    private boolean startMyVideo;
    ViewStateManager stateManager;
    private Rect touchBounds;
    private View touchDelegate;
    private VideoFacade videoFacade;
    private View videoMonitorBackground;
    private CallView videoMonitorCallView;
    private ViewSnapper viewSnapper;

    public VideoMonitor()
    {
        touchBounds = new Rect();
        simpleGestureDetector = new android.view.GestureDetector.SimpleOnGestureListener() {

            final VideoMonitor this$0;

            public final boolean onDoubleTap(MotionEvent motionevent)
            {
                if (!restrictTouch)
                {
                    restrictTouch = true;
                    VideoMonitor.LOG.info("TAP doubletap");
                    goToInAppVideoCall();
                    analytics.c(AnalyticsEvent.bb);
                    return true;
                } else
                {
                    return false;
                }
            }

            public final void onLongPress(MotionEvent motionevent)
            {
            }

            public final boolean onSingleTapConfirmed(MotionEvent motionevent)
            {
                if (!restrictTouch)
                {
                    restrictTouch = true;
                    VideoMonitor.LOG.info("TAP single confrmd");
                    goToInAppVideoCall();
                    analytics.c(AnalyticsEvent.be);
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = VideoMonitor.this;
                super();
            }
        };
    }

    private void adjustViewLayoutParams(View view)
    {
        Rect rect = getBackgroundRect();
        android.widget.FrameLayout.LayoutParams layoutparams;
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            layoutparams = new android.widget.FrameLayout.LayoutParams(view.getLayoutParams());
        } else
        {
            layoutparams = new android.widget.FrameLayout.LayoutParams((android.widget.FrameLayout.LayoutParams)view.getLayoutParams());
        }
        layoutparams.leftMargin = rect.left;
        layoutparams.topMargin = rect.top;
        layoutparams.rightMargin = rect.right;
        layoutparams.bottomMargin = rect.bottom;
        view.setLayoutParams(layoutparams);
    }

    public static void close(Context context1)
    {
        closeAll(context1.getApplicationContext(), com/skype/android/app/calling/VideoMonitor);
    }

    private Rect getBackgroundRect()
    {
        Rect rect = new Rect();
        Drawable drawable = videoMonitorCallView.getBackground();
        if (drawable != null)
        {
            drawable.getPadding(rect);
        }
        return rect;
    }

    public static Intent getCloseAllIntent(Context context1, Class class1)
    {
        showIntent = false;
        return StandOutWindow.getCloseAllIntent(context1, class1);
    }

    public static Intent getCloseIntent(Context context1, Class class1, int i)
    {
        showIntent = false;
        return StandOutWindow.getCloseIntent(context1, class1, i);
    }

    private VideoMonitorComponent getComponent()
    {
        if (component == null)
        {
            component = DaggerVideoMonitorComponent.builder().skypeApplicationComponent(((SkypeApplication)getApplication()).a()).build();
        }
        return component;
    }

    public static Intent getHideIntent(Context context1, Class class1, int i)
    {
        showIntent = false;
        return StandOutWindow.getHideIntent(context1, class1, i);
    }

    private LayoutInflater getLayoutInflater()
    {
        return (LayoutInflater)getSystemService("layout_inflater");
    }

    public static Intent getShowIntent(Context context1, Class class1, int i)
    {
        showIntent = true;
        return StandOutWindow.getShowIntent(context1, class1, i);
    }

    private android.view.WindowManager.LayoutParams getTouchParams()
    {
        int i = touchBounds.width();
        int j = touchBounds.height();
        int k = touchBounds.left;
        int l = touchBounds.top;
        android.view.WindowManager.LayoutParams layoutparams;
        char c;
        if (android.os.Build.VERSION.SDK_INT > 22)
        {
            c = '\u07D5';
        } else
        {
            c = '\u07D2';
        }
        layoutparams = new android.view.WindowManager.LayoutParams(i, j, k, l, c, 72, -2);
        layoutparams.gravity = 51;
        return layoutparams;
    }

    private void goToInAppVideoCall()
    {
        Intent intent;
        boolean flag;
        if (myCameraFacing != null && myCameraFacing != CameraFacing.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (videoFacade != null)
        {
            videoFacade.stop();
            videoFacade.destroy();
        }
        close(context);
        intent = new Intent(this, com/skype/android/app/calling/CallActivity);
        intent.putExtra("com.skype.objId", conversation.getObjectID());
        intent.putExtra("extraVideo", flag);
        intent.addFlags(0x10000000);
        startActivity(intent);
    }

    public static void hide(Context context1, CameraFacing camerafacing, int i)
    {
        Intent intent = getHideIntent(context1, com/skype/android/app/calling/VideoMonitor, 0);
        intent.putExtra("extraMyCamera", camerafacing);
        intent.putExtra("com.skype.objId", i);
        context1.startService(intent);
    }

    private void hideTouchDelegate()
    {
        try
        {
            getWindowManager().removeView(touchDelegate);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            return;
        }
    }

    public static boolean isShowing()
    {
        return isShowing;
    }

    private void layoutTouchArea()
    {
        try
        {
            getWindowManager().updateViewLayout(touchDelegate, getTouchParams());
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            return;
        }
    }

    private void registerScreenOffReceiver()
    {
        if (screenOffReceiver == null)
        {
            screenOffReceiver = new a();
            screenOffReceiver.register(context);
        }
    }

    private void reportInvokedCount()
    {
        analytics.a(AnalyticsEvent.ba, invokedCount.getAndSet(0));
    }

    public static void show(Context context1, CameraFacing camerafacing, int i)
    {
        Intent intent = getShowIntent(context1, com/skype/android/app/calling/VideoMonitor, 0);
        intent.putExtra("extraMyCamera", camerafacing);
        intent.putExtra("com.skype.objId", i);
        context1.startService(intent);
    }

    private void toggleVideoMonitorBackground()
    {
        if (videoFacade != null && videoFacade.isVideoDisplayed())
        {
            videoMonitorBackground.setVisibility(4);
            return;
        } else
        {
            videoMonitorBackground.setVisibility(0);
            return;
        }
    }

    private void unregisterScreenOffReceiver()
    {
        if (screenOffReceiver != null)
        {
            screenOffReceiver.unregister(context);
            screenOffReceiver = null;
        }
    }

    private void updateDraggingBounds(Rect rect)
    {
        if (rect != null)
        {
            rect.offset(0, rect.top * -1);
            viewSnapper.setBounds(rect);
            if (videoMonitorCallView != null)
            {
                videoMonitorCallView.setOverlayBounds(rect);
                return;
            }
        }
    }

    private void updateDraggingBounds(Window window)
    {
        if (window == null)
        {
            return;
        } else
        {
            Rect rect = new Rect();
            window.getWindowVisibleDisplayFrame(rect);
            updateDraggingBounds(rect);
            return;
        }
    }

    private void updateTouchBounds()
    {
        if (videoMonitorCallView != null)
        {
            videoMonitorCallView.a(touchBounds);
            layoutTouchArea();
        }
    }

    public void createAndAttachView(int i, FrameLayout framelayout)
    {
        framelayout = getLayoutInflater().inflate(0x7f030137, framelayout, true);
        videoMonitorBackground = framelayout.findViewById(0x7f100597);
        videoMonitorCallView = (CallView)framelayout.findViewById(0x7f100595);
        videoMonitorCallView.setMaxVideosOnStage(0);
        videoMonitorCallView.setFactory(this);
        videoMonitorCallView.setUnhandledGestureListener(this);
        videoMonitorCallView.setOverlayBounds(viewSnapper.getCurrentPosition());
        videoMonitorCallView.setRibbonSnapping(com.skype.android.video.ViewSnapper.HorizontalSnap.RIGHT, com.skype.android.video.ViewSnapper.VerticalSnap.TOP);
        overlay = framelayout.findViewById(0x7f100596);
        if (conversation != null)
        {
            videoFacade = new CallVideoFacade(stateManager);
            videoFacade.initialize(lib, conversation, videoMonitorCallView);
            videoFacade.setVideoDisplayChangedListener(this);
            if (startMyVideo)
            {
                videoFacade.setCameraFacing(myCameraFacing);
            } else
            {
                videoFacade.setCameraFacing(CameraFacing.c);
            }
            videoFacade.start();
        }
        toggleVideoMonitorBackground();
        videoMonitorCallView.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() {

            final VideoMonitor this$0;

            public final void onLayoutChange(View view, int j, int k, int l, int i1, int j1, int k1, 
                    int l1, int i2)
            {
                if (l != l1 || i1 != i2)
                {
                    view = getWindow(0);
                    if (view != null)
                    {
                        updateViewLayout(0, getParams(0, view));
                    }
                }
            }

            
            {
                this$0 = VideoMonitor.this;
                super();
            }
        });
        videoMonitorCallView.setRibbonLayoutListener(new android.view.View.OnLayoutChangeListener() {

            final VideoMonitor this$0;

            public final void onLayoutChange(View view, int j, int k, int l, int i1, int j1, int k1, 
                    int l1, int i2)
            {
                touchBounds.set(j, k, l, i1);
                layoutTouchArea();
            }

            
            {
                this$0 = VideoMonitor.this;
                super();
            }
        });
        invokedCount.getAndIncrement();
    }

    public View createCameraSwitchView()
    {
        return null;
    }

    public View createParticipantDisplayName(Participant participant)
    {
        return null;
    }

    public View createParticipantPlusView()
    {
        return null;
    }

    public View createParticipantTileView()
    {
        return getLayoutInflater().inflate(0x7f030032, videoMonitorCallView, false);
    }

    public View createTileView()
    {
        return getLayoutInflater().inflate(0x7f030027, videoMonitorCallView, false);
    }

    public int getAppIcon()
    {
        return 0x7f0201f7;
    }

    public String getAppName()
    {
        return getString(0x7f0801a9);
    }

    public int getFlags(int i)
    {
        return wei.mark.standout.a.a.g | 0x10 | 0x20 | 0x1000000 | wei.mark.standout.a.a.m | wei.mark.standout.a.a.n;
    }

    public wei.mark.standout.StandOutWindow.StandOutLayoutParams getParams(int i, Window window)
    {
label0:
        {
            Rect rect;
            Rect rect1;
            int j;
            int k;
            if (videoMonitorCallView == null || videoMonitorCallView.getMeasuredHeight() == 0 || videoMonitorCallView.getMeasuredWidth() == 0)
            {
                j = Resources.getSystem().getDisplayMetrics().widthPixels;
                k = Resources.getSystem().getDisplayMetrics().heightPixels;
            } else
            {
                j = videoMonitorCallView.getMeasuredWidth();
                k = videoMonitorCallView.getMeasuredHeight();
            }
            rect1 = viewSnapper.getCurrentPosition();
            if (rect1.width() == j)
            {
                rect = rect1;
                if (rect1.height() == k)
                {
                    break label0;
                }
            }
            viewSnapper.updateRectSize(j, k);
            updateDraggingBounds(window);
            rect = viewSnapper.getCurrentPosition();
        }
        window = new wei.mark.standout.StandOutWindow.StandOutLayoutParams(this, i, j, k, rect.left, rect.top);
        window.flags = ((wei.mark.standout.StandOutWindow.StandOutLayoutParams) (window)).flags | 0x10;
        window.flags = ((wei.mark.standout.StandOutWindow.StandOutLayoutParams) (window)).flags | 0x80;
        if (android.os.Build.VERSION.SDK_INT > 22)
        {
            window.type = 2005;
        }
        return window;
    }

    public Notification getPersistentNotification(int i)
    {
        return callAgent.getOrCreateOngoingCallNotification(conversation);
    }

    public int getPersistentNotificationId()
    {
        return callAgent.getNotificationId(conversation);
    }

    public WindowManager getWindowManager()
    {
        return (WindowManager)getSystemService("window");
    }

    public boolean isPersistentNotificationRemovable()
    {
        return !ongoingCall.get();
    }

    public boolean onClose(int i, Window window)
    {
        hideTouchDelegate();
        return super.onClose(i, window);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2 || configuration.orientation == 1)
        {
            configuration = getWindow(0);
            if (configuration != null)
            {
                DisplayMetrics displaymetrics = Resources.getSystem().getDisplayMetrics();
                configuration.setDisplayDimensions(displaymetrics.widthPixels, displaymetrics.heightPixels);
                Rect rect = new Rect();
                configuration.getWindowVisibleDisplayFrame(rect);
                if (rect.width() > displaymetrics.widthPixels || rect.height() > displaymetrics.heightPixels)
                {
                    updateViewLayout(0, getParams(0, configuration));
                    configuration.getWindowVisibleDisplayFrame(rect);
                    if (rect.width() > displaymetrics.widthPixels || rect.height() > displaymetrics.heightPixels)
                    {
                        rect.set(rect.left, rect.top, rect.left + rect.height(), rect.top + rect.width());
                    }
                }
                updateDraggingBounds(rect);
                updateViewLayout(0, getParams(0, configuration));
                updateTouchBounds();
            }
        }
    }

    public void onCreate()
    {
        super.onCreate();
        context = getApplicationContext();
        getComponent().inject(this);
        gestureDetector = new GestureDetector(context, simpleGestureDetector);
        eventBinder = new EventSubscriberBinder(EventBusInstance.a(), this);
        eventBinder.bind();
        viewSnapper = new ViewSnapper(new Rect());
        viewSnapper.setBounds(new Rect(0, 0, Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels));
        viewSnapper.snapTo(com.skype.android.video.ViewSnapper.HorizontalSnap.RIGHT, com.skype.android.video.ViewSnapper.VerticalSnap.TOP);
        ongoingCall = new AtomicBoolean(true);
        touchDelegate = new View(this) {

            final int locationOnScreen[] = new int[2];
            final VideoMonitor this$0;

            public final boolean onTouchEvent(MotionEvent motionevent)
            {
                boolean flag = false;
                if (videoMonitorCallView != null)
                {
                    videoMonitorCallView.getLocationOnScreen(locationOnScreen);
                    motionevent.setLocation(motionevent.getRawX() - (float)locationOnScreen[0], motionevent.getRawY() - (float)locationOnScreen[1]);
                    flag = videoMonitorCallView.dispatchTouchEvent(motionevent);
                }
                return flag;
            }

            
            {
                this$0 = VideoMonitor.this;
                super(context1);
            }
        };
        registerScreenOffReceiver();
    }

    public void onDestroy()
    {
        if (eventBinder != null)
        {
            eventBinder.unbind();
        }
        if (videoFacade != null)
        {
            videoFacade.destroy();
            videoFacade = null;
        }
        unregisterScreenOffReceiver();
        super.onDestroy();
    }

    public void onEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
label0:
        {
            onpropertychange = (Conversation)onpropertychange.getSender();
            static final class _cls5
            {

                static final int $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[];

                static 
                {
                    $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS = new int[com.skype.Conversation.LOCAL_LIVESTATUS.values().length];
                    try
                    {
                        $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.NONE.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.OTHERS_ARE_LIVE.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.Conversation.LOCAL_LIVESTATUS.RECENTLY_LIVE.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            if (conversation != null && onpropertychange.getObjectID() == conversation.getObjectID())
            {
                switch (_cls5..SwitchMap.com.skype.Conversation.LOCAL_LIVESTATUS[onpropertychange.getLocalLiveStatusProp().ordinal()])
                {
                default:
                    ongoingCall.set(true);
                    break;

                case 1: // '\001'
                case 2: // '\002'
                case 3: // '\003'
                    break label0;
                }
            }
            return;
        }
        ongoingCall.set(false);
        reportInvokedCount();
        close(context);
    }

    public boolean onFocusChange(int i, Window window, boolean flag)
    {
        if (flag)
        {
            videoMonitorCallView.setBackgroundResource(0x7f020247);
        } else
        {
            videoMonitorCallView.setBackgroundResource(0x7f020246);
        }
        adjustViewLayoutParams(videoMonitorBackground);
        return super.onFocusChange(i, window, flag);
    }

    public boolean onHide(int i, Window window)
    {
        restrictTouch = true;
        hideTouchDelegate();
        return super.onHide(i, window);
    }

    public void onOverlayLayoutChanged(int i, int j)
    {
    }

    public boolean onShow(int i, Window window)
    {
        restrictTouch = false;
        getWindowManager().addView(touchDelegate, getTouchParams());
        return super.onShow(i, window);
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (intent != null && intent.getExtras() != null && !intent.getAction().equals("SEND_DATA"))
        {
            int k = intent.getExtras().getInt("com.skype.objId", 0);
            conversation = new ConversationImpl();
            lib.getConversation(k, conversation);
            myCameraFacing = (CameraFacing)intent.getExtras().getSerializable("extraMyCamera");
            boolean flag;
            if (myCameraFacing != null && myCameraFacing != CameraFacing.c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            startMyVideo = flag;
        }
        i = super.onStartCommand(intent, i, j);
        return i;
        intent;
_L2:
        LOG.info((new StringBuilder("onStartCommand() Exception:")).append(intent.getMessage()).toString());
        return 2;
        intent;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean onTouchHandleMove(int i, Window window, View view, MotionEvent motionevent)
    {
        if (overlay.getVisibility() == 0 || motionevent.getAction() == 1 && getWindow(i) != null && !restrictTouch)
        {
            unfocus(i);
            return true;
        } else
        {
            return super.onTouchHandleMove(i, window, view, motionevent);
        }
    }

    public void onUnhandledGesture()
    {
        goToInAppVideoCall();
    }

    public void onVideoDisplayChanged(String s, com.skype.Video.STATUS status)
    {
        toggleVideoMonitorBackground();
        if (videoFacade == null || !videoFacade.isVideoDisplayed() && showIntent)
        {
            hide(context, myCameraFacing, conversation.getObjectID());
        } else
        if (videoFacade.isVideoDisplayed() && !showIntent)
        {
            show(context, myCameraFacing, conversation.getObjectID());
            return;
        }
    }

    public void onVisibilityChange(int i, Window window, boolean flag)
    {
        if (flag)
        {
            unfocus(i);
            window.setContentDescription(getString(0x7f0800ca, new Object[] {
                conversationUtil.m(conversation)
            }));
            if (accessibilityUtil.a())
            {
                AccessibilityUtil.a(window, 128);
            }
        }
        isShowing = flag;
    }







/*
    static boolean access$302(VideoMonitor videomonitor, boolean flag)
    {
        videomonitor.restrictTouch = flag;
        return flag;
    }

*/






}
