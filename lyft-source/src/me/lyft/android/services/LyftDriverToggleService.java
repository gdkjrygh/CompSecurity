// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.support.v4.view.GestureDetectorCompat;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import java.util.Arrays;
import java.util.List;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.IUserSession;
import me.lyft.android.LyftApplication;
import me.lyft.android.analytics.studies.DriverAnalytics;
import me.lyft.android.common.Objects;
import me.lyft.android.controls.SimpleAnimationListener;
import me.lyft.android.events.AppStateUpdatedEvent;
import me.lyft.android.facades.ApiFacade;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.profile.NullUserDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.ui.MainActivity;
import me.lyft.android.utils.MetricsUtils;
import rx.Observable;
import rx.functions.Action0;
import rx.functions.Action1;

public class LyftDriverToggleService extends Service
{

    private static final int ALPHA_PERCENTAGE_50 = 128;
    private static final int ALPHA_PERCENTAGE_95 = 242;
    public static final int ANIMATION_DURATION = 500;
    public static final int ANIMATION_DURATION_SHORT = 325;
    private static final int DRAG_TOGGLE_DELTA_DP = 150;
    public static final int FLOATTING_BUTTO_MARGIN_TOP_DP = 8;
    private static List IN_RIDE_STATUSES = Arrays.asList(new String[] {
        "accepted", "approaching", "arrived", "pickedUp", "droppedOff"
    });
    public static final int NO_ACTION_IMAGE_MARGIN_TOP_DP = 120;
    public static final int NO_ACTION_IMAGE_SIZE_DP = 203;
    private ViewPropertyAnimator animator;
    ApiFacade apiFacade;
    private int backgroundAlpha;
    private final Binder binder = new Binder();
    MessageBus bus;
    private FrameLayout cancelButtonLayout;
    private android.view.WindowManager.LayoutParams cancelLayoutParams;
    private BroadcastReceiver configurationChangeReceiver;
    IDevice device;
    private final ReactiveProperty dragStatusChange = ReactiveProperty.create();
    private ImageView driverModeIndicator;
    private int driverModeToggleThreshold;
    private FrameLayout floatingBackgroundContainer;
    private ImageView floatingButtonImageView;
    private RelativeLayout floatingButtonLayout;
    private android.view.WindowManager.LayoutParams floatingButtonLayoutParams;
    private TextView floatingButtonTextView;
    private GestureDetectorCompat gestureDetector;
    private android.view.GestureDetector.SimpleOnGestureListener gestureListener;
    ILyftPreferences lyftPreferences;
    private MetricsUtils metricsUtils;
    private ImageView noActionAreaImageView;
    private final Observable observeDragging;
    private final Action1 onAppStateUpdate = new Action1() {

        final LyftDriverToggleService this$0;

        public volatile void call(Object obj)
        {
            call((AppStateDTO)obj);
        }

        public void call(AppStateDTO appstatedto)
        {
            userModeChangedProperty.onNext(((UserDTO)Objects.firstNonNull(appstatedto.getUser(), NullUserDTO.getInstance())).getMode());
        }

            
            {
                this$0 = LyftDriverToggleService.this;
                super();
            }
    };
    private final Action0 onDragNearCancel = new Action0() {

        final LyftDriverToggleService this$0;

        public void call()
        {
            noActionAreaImageView.setVisibility(0);
            cancelButtonLayout.setVisibility(0);
            floatingButtonTextView.setVisibility(0);
            floatingButtonTextView.setText(0x7f07017b);
        }

            
            {
                this$0 = LyftDriverToggleService.this;
                super();
            }
    };
    private final Action0 onDragOutsideNoAction = new Action0() {

        final LyftDriverToggleService this$0;

        public void call()
        {
            noActionAreaImageView.setVisibility(0);
            cancelButtonLayout.setVisibility(0);
            RideDTO ridedto = userSession.getRide();
            int i;
            if (ridedto != null && LyftDriverToggleService.IN_RIDE_STATUSES.contains(ridedto.getStatus()))
            {
                i = 0x7f07017c;
            } else
            if ("driver".equalsIgnoreCase(userSession.getUser().getMode()))
            {
                i = 0x7f07017d;
            } else
            {
                i = 0x7f07017e;
            }
            floatingButtonTextView.setText(i);
            if (backgroundAlpha != 242)
            {
                animateBackgroundAlpha(floatingBackgroundContainer, backgroundAlpha, 242);
            }
            if (animator != null)
            {
                animator.cancel();
            }
            if (floatingButtonTextView.getVisibility() != 0 || floatingButtonImageView.getAlpha() != 1.0F)
            {
                floatingButtonTextView.setAlpha(0.0F);
                floatingButtonTextView.setVisibility(0);
                animator = floatingButtonTextView.animate().alpha(1.0F).setDuration(325L).setListener(null);
            }
        }

            
            {
                this$0 = LyftDriverToggleService.this;
                super();
            }
    };
    private final Action0 onDragStarted = new Action0() {

        final LyftDriverToggleService this$0;

        public void call()
        {
            floatingBackgroundContainer.setVisibility(0);
            noActionAreaImageView.setVisibility(0);
            cancelButtonLayout.setVisibility(0);
            floatingButtonTextView.setVisibility(0);
            if (backgroundAlpha != 128)
            {
                animateBackgroundAlpha(floatingBackgroundContainer, backgroundAlpha, 128);
            }
            if (animator != null)
            {
                animator.cancel();
            }
            if (floatingButtonTextView.getVisibility() == 0 && floatingButtonImageView.getAlpha() > 0.0F)
            {
                animator = floatingButtonTextView.animate().alpha(0.0F).setDuration(325L).setListener(new SimpleAnimationListener() {

                    final _cls3 this$1;

                    public void onAnimationEnd(Animator animator1)
                    {
                        super.onAnimationEnd(animator1);
                        floatingButtonTextView.setVisibility(4);
                    }

            
            {
                this$1 = _cls3.this;
                super();
            }
                });
            }
        }

            
            {
                this$0 = LyftDriverToggleService.this;
                super();
            }
    };
    private final Action1 onDragStatusChanged = new Action1() {

        final LyftDriverToggleService this$0;

        public volatile void call(Object obj)
        {
            call((DraggingZone)obj);
        }

        public void call(DraggingZone draggingzone)
        {
            if (draggingzone == DraggingZone.DRAG_STARTED)
            {
                onDragStarted.call();
            } else
            {
                if (draggingzone == DraggingZone.DRAG_TO_SWITCH)
                {
                    onDragOutsideNoAction.call();
                    return;
                }
                if (draggingzone == DraggingZone.DRAG_TO_REMOVE)
                {
                    onDragNearCancel.call();
                    return;
                }
            }
        }

            
            {
                this$0 = LyftDriverToggleService.this;
                super();
            }

        private class DraggingZone extends Enum
        {

            private static final DraggingZone $VALUES[];
            public static final DraggingZone DRAG_STARTED;
            public static final DraggingZone DRAG_TO_REMOVE;
            public static final DraggingZone DRAG_TO_SWITCH;

            public static DraggingZone valueOf(String s)
            {
                return (DraggingZone)Enum.valueOf(me/lyft/android/services/LyftDriverToggleService$DraggingZone, s);
            }

            public static DraggingZone[] values()
            {
                return (DraggingZone[])$VALUES.clone();
            }

            static 
            {
                DRAG_STARTED = new DraggingZone("DRAG_STARTED", 0);
                DRAG_TO_SWITCH = new DraggingZone("DRAG_TO_SWITCH", 1);
                DRAG_TO_REMOVE = new DraggingZone("DRAG_TO_REMOVE", 2);
                $VALUES = (new DraggingZone[] {
                    DRAG_STARTED, DRAG_TO_SWITCH, DRAG_TO_REMOVE
                });
            }

            private DraggingZone(String s, int i)
            {
                super(s, i);
            }
        }

    };
    private final Action1 onUserModeChanged = new Action1() {

        final LyftDriverToggleService this$0;

        public volatile void call(Object obj)
        {
            call((String)obj);
        }

        public void call(String s)
        {
            ImageView imageview = driverModeIndicator;
            int i;
            if (s.equals("driver"))
            {
                i = 0;
            } else
            {
                i = 8;
            }
            imageview.setVisibility(i);
        }

            
            {
                this$0 = LyftDriverToggleService.this;
                super();
            }
    };
    private BroadcastReceiver screenOnOffReceiver;
    private LyftToggleTouchListener toggleTouchListener;
    private final ReactiveProperty userModeChangedProperty = ReactiveProperty.create();
    IUserSession userSession;
    private WindowManager windowManager;

    public LyftDriverToggleService()
    {
        backgroundAlpha = 128;
        observeDragging = dragStatusChange.distinctUntilChanged();
        gestureListener = new android.view.GestureDetector.SimpleOnGestureListener() {

            final LyftDriverToggleService this$0;

            public boolean onSingleTapUp(MotionEvent motionevent)
            {
                DriverAnalytics.trackDriverDefenseButtonTap();
                bringAppToForeground();
                stopSelf();
                return true;
            }

            
            {
                this$0 = LyftDriverToggleService.this;
                super();
            }
        };
        toggleTouchListener = new LyftToggleTouchListener();
        configurationChangeReceiver = new BroadcastReceiver() {

            final LyftDriverToggleService this$0;

            public void onReceive(Context context, Intent intent)
            {
                LyftDriverToggleService.stopService(context);
                LyftDriverToggleService.startService(context);
            }

            
            {
                this$0 = LyftDriverToggleService.this;
                super();
            }
        };
        screenOnOffReceiver = new BroadcastReceiver() {

            final LyftDriverToggleService this$0;

            public void onReceive(Context context, Intent intent)
            {
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF"))
                {
                    hideFloattingButton();
                } else
                if (intent.getAction().equals("android.intent.action.USER_PRESENT"))
                {
                    showFloattingButtion();
                    return;
                }
            }

            
            {
                this$0 = LyftDriverToggleService.this;
                super();
            }
        };
    }

    private void animateBackgroundAlpha(final View view, int i, int j)
    {
        ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
            i, j
        });
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final LyftDriverToggleService this$0;
            final View val$view;

            public void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                valueanimator1 = ((ValueAnimator) (valueanimator1.getAnimatedValue()));
                if (valueanimator1 != null)
                {
                    backgroundAlpha = ((Integer)valueanimator1).intValue();
                    view.getBackground().setAlpha(backgroundAlpha);
                }
            }

            
            {
                this$0 = LyftDriverToggleService.this;
                view = view1;
                super();
            }
        });
        valueanimator.setDuration(325L);
        valueanimator.start();
    }

    private void bringAppToForeground()
    {
        MainActivity.startActivity(this);
    }

    private Rect getViewRect(View view)
    {
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        int i = ai[0];
        int j = ai[1];
        return new Rect(i, j, view.getWidth() + i, view.getHeight() + j);
    }

    private void hideFloattingButton()
    {
        floatingButtonLayout.setVisibility(8);
    }

    private void initFloatingBackgroundContainer()
    {
        floatingBackgroundContainer = (FrameLayout)LayoutInflater.from(this).inflate(0x7f03007d, null);
        cancelButtonLayout = (FrameLayout)floatingBackgroundContainer.findViewById(0x7f0d0221);
        noActionAreaImageView = (ImageView)floatingBackgroundContainer.findViewById(0x7f0d0223);
        floatingButtonTextView = (TextView)floatingBackgroundContainer.findViewById(0x7f0d0224);
        cancelLayoutParams = new android.view.WindowManager.LayoutParams(-1, -1, 2002, 8, -3);
        windowManager.addView(floatingBackgroundContainer, cancelLayoutParams);
        floatingBackgroundContainer.getBackground().setAlpha(backgroundAlpha);
        floatingBackgroundContainer.setVisibility(8);
    }

    private void initFloatingView()
    {
        floatingButtonLayout = (RelativeLayout)LayoutInflater.from(this).inflate(0x7f03007e, null);
        floatingButtonImageView = (ImageView)ButterKnife.a(floatingButtonLayout, 0x7f0d0225);
        driverModeIndicator = (ImageView)ButterKnife.a(floatingButtonLayout, 0x7f0d0226);
        floatingButtonImageView.setVisibility(0);
        Object obj = driverModeIndicator;
        int i;
        if ("driver".equalsIgnoreCase(userSession.getUser().getMode()))
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((ImageView) (obj)).setVisibility(i);
        floatingButtonLayoutParams = new android.view.WindowManager.LayoutParams(-2, -2, 2002, 8, -3);
        obj = new Point();
        windowManager.getDefaultDisplay().getSize(((Point) (obj)));
        floatingButtonLayoutParams.x = 0 - ((Point) (obj)).x / 2;
        floatingButtonLayoutParams.y = (0 - ((Point) (obj)).y / 2) + metricsUtils.dpToPixels(120F) + metricsUtils.dpToPixels(203F) / 2 + metricsUtils.dpToPixels(8F);
        floatingButtonImageView.setOnTouchListener(toggleTouchListener);
        windowManager.addView(floatingButtonLayout, floatingButtonLayoutParams);
    }

    private void showFloattingButtion()
    {
        floatingButtonLayout.setVisibility(0);
    }

    public static void startService(Context context)
    {
        context.startService(new Intent(context, me/lyft/android/services/LyftDriverToggleService));
    }

    public static void stopService(Context context)
    {
        context.stopService(new Intent(context, me/lyft/android/services/LyftDriverToggleService));
    }

    private void switchUserMode()
    {
        UserDTO userdto = userSession.getUser();
        if (((Boolean)Objects.firstNonNull(userdto.isApprovedDriver(), Boolean.valueOf(false))).booleanValue() && (device.isGPSEnabled() || "driver".equalsIgnoreCase(userdto.getMode())))
        {
            binder.bind(apiFacade.switchMode("passenger".equalsIgnoreCase(userSession.getUser().getMode())), new AsyncCall() {

                final LyftDriverToggleService this$0;

                public void onFail(Throwable throwable)
                {
                    super.onFail(throwable);
                    bringAppToForeground();
                }

            
            {
                this$0 = LyftDriverToggleService.this;
                super();
            }
            });
        }
    }

    protected LyftApplication getLyftApplication()
    {
        return (LyftApplication)getApplication();
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        getLyftApplication().inject(this);
        metricsUtils = MetricsUtils.fromContext(this);
        driverModeToggleThreshold = metricsUtils.dpToPixels(150F);
        gestureDetector = new GestureDetectorCompat(this, gestureListener);
        gestureDetector.a(false);
        windowManager = (WindowManager)getSystemService("window");
        initFloatingBackgroundContainer();
        initFloatingView();
        binder.bind(bus.observe(me/lyft/android/events/AppStateUpdatedEvent), onAppStateUpdate);
        binder.bind(userModeChangedProperty, onUserModeChanged);
        binder.bind(observeDragging, onDragStatusChanged);
        DriverAnalytics.trackDriverDefenseShown();
        registerReceiver(configurationChangeReceiver, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
        IntentFilter intentfilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentfilter.addAction("android.intent.action.USER_PRESENT");
        registerReceiver(screenOnOffReceiver, intentfilter);
    }

    public void onDestroy()
    {
        super.onDestroy();
        unregisterReceiver(configurationChangeReceiver);
        unregisterReceiver(screenOnOffReceiver);
        toggleTouchListener.stopAnimations();
        windowManager.removeView(floatingButtonLayout);
        windowManager.removeView(floatingBackgroundContainer);
        binder.detach();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        return 2;
    }

























/*
    static int access$602(LyftDriverToggleService lyftdrivertoggleservice, int i)
    {
        lyftdrivertoggleservice.backgroundAlpha = i;
        return i;
    }

*/




/*
    static ViewPropertyAnimator access$802(LyftDriverToggleService lyftdrivertoggleservice, ViewPropertyAnimator viewpropertyanimator)
    {
        lyftdrivertoggleservice.animator = viewpropertyanimator;
        return viewpropertyanimator;
    }

*/


    private class LyftToggleTouchListener
        implements android.view.View.OnTouchListener
    {

        private ValueAnimator bounceXAnimator;
        private ValueAnimator bounceYAnimator;
        private AnimatorSet bouncingAnimatorSet;
        private float initialTouchX;
        private float initialTouchY;
        private int initialX;
        private int initialY;
        private boolean shouldSwitchUserMode;
        final LyftDriverToggleService this$0;

        private void animateBouncingBack()
        {
            stopAnimations();
            bounceXAnimator = ValueAnimator.ofInt(new int[] {
                floatingButtonLayoutParams.x, initialX
            });
            bounceYAnimator = ValueAnimator.ofInt(new int[] {
                floatingButtonLayoutParams.y, initialY
            });
            bounceXAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                final LyftToggleTouchListener this$1;

                public void onAnimationUpdate(ValueAnimator valueanimator)
                {
                    valueanimator = (Integer)valueanimator.getAnimatedValue();
                    floatingButtonLayoutParams.x = valueanimator.intValue();
                    windowManager.updateViewLayout(floatingButtonLayout, floatingButtonLayoutParams);
                }

                
                {
                    this$1 = LyftToggleTouchListener.this;
                    super();
                }
            });
            bounceYAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                final LyftToggleTouchListener this$1;

                public void onAnimationUpdate(ValueAnimator valueanimator)
                {
                    valueanimator = (Integer)valueanimator.getAnimatedValue();
                    floatingButtonLayoutParams.y = valueanimator.intValue();
                    windowManager.updateViewLayout(floatingButtonLayout, floatingButtonLayoutParams);
                }

                
                {
                    this$1 = LyftToggleTouchListener.this;
                    super();
                }
            });
            bouncingAnimatorSet = new AnimatorSet();
            bouncingAnimatorSet.playTogether(new Animator[] {
                bounceXAnimator, bounceYAnimator
            });
            bouncingAnimatorSet.setInterpolator(new AnticipateOvershootInterpolator(2.0F, 1.5F));
            bouncingAnimatorSet.addListener(new SimpleAnimationListener() {

                final LyftToggleTouchListener this$1;

                public void onAnimationEnd(Animator animator1)
                {
                    super.onAnimationEnd(animator1);
                    floatingButtonImageView.setEnabled(true);
                    changeTextVisibility(false);
                    changeBackgroundVisibility(false);
                    if (shouldSwitchUserMode)
                    {
                        shouldSwitchUserMode = false;
                        switchUserMode();
                    }
                }

                public void onAnimationStart(Animator animator1)
                {
                    super.onAnimationStart(animator1);
                    floatingButtonImageView.setEnabled(false);
                }

                
                {
                    this$1 = LyftToggleTouchListener.this;
                    super();
                }
            });
            bouncingAnimatorSet.setDuration(500L);
            bouncingAnimatorSet.start();
        }

        private void changeBackgroundVisibility(boolean flag)
        {
            Object obj = floatingBackgroundContainer;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            ((FrameLayout) (obj)).setVisibility(i);
            obj = LyftDriverToggleService.this;
            if (flag)
            {
                i = backgroundAlpha;
            } else
            {
                i = 128;
            }
            obj.backgroundAlpha = i;
        }

        private void changeTextVisibility(boolean flag)
        {
            TextView textview = floatingButtonTextView;
            float f;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            textview.setVisibility(i);
            textview = floatingButtonTextView;
            if (flag)
            {
                f = 1.0F;
            } else
            {
                f = 0.0F;
            }
            textview.setAlpha(f);
        }

        private double distance(float f, float f1, float f2, float f3)
        {
            return Math.sqrt(Math.pow(f2 - f, 2D) + Math.pow(f3 - f1, 2D));
        }

        private boolean isToggleTresholdReached(MotionEvent motionevent)
        {
            float f = motionevent.getRawX();
            float f1 = motionevent.getRawY();
            return distance(initialTouchX, initialTouchY, f, f1) > (double)driverModeToggleThreshold;
        }

        private boolean shouldDismissChathead(MotionEvent motionevent)
        {
            if (floatingBackgroundContainer.getVisibility() != 8)
            {
                float f = motionevent.getRawX();
                float f1 = motionevent.getRawY();
                motionevent = getViewRect(cancelButtonLayout);
                if (f > (float)((Rect) (motionevent)).left && f1 > (float)(((Rect) (motionevent)).top + motionevent.height() / 2) || f > (float)(((Rect) (motionevent)).left + motionevent.width() / 2) && f1 > (float)((Rect) (motionevent)).top)
                {
                    return true;
                }
            }
            return false;
        }

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            if (gestureDetector.a(motionevent))
            {
                return true;
            }
            switch (motionevent.getAction())
            {
            default:
                return false;

            case 0: // '\0'
                initialX = floatingButtonLayoutParams.x;
                initialTouchX = motionevent.getRawX();
                initialY = floatingButtonLayoutParams.y;
                initialTouchY = motionevent.getRawY();
                return true;

            case 1: // '\001'
                if (shouldDismissChathead(motionevent))
                {
                    DriverAnalytics.trackDriverDefenseDragToDismiss();
                    lyftPreferences.setDriverShortcutEnabled(false);
                    stopSelf();
                    return true;
                }
                floatingButtonImageView.setEnabled(false);
                view = userSession.getRide();
                if (isToggleTresholdReached(motionevent) && (view == null || !LyftDriverToggleService.IN_RIDE_STATUSES.contains(view.getStatus())))
                {
                    shouldSwitchUserMode = true;
                }
                animateBouncingBack();
                return true;

            case 2: // '\002'
                floatingButtonLayoutParams.x = (int)((float)initialX + (motionevent.getRawX() - initialTouchX));
                floatingButtonLayoutParams.y = (int)((float)initialY + (motionevent.getRawY() - initialTouchY));
                windowManager.updateViewLayout(floatingButtonLayout, floatingButtonLayoutParams);
                break;
            }
            if (shouldDismissChathead(motionevent))
            {
                dragStatusChange.onNext(DraggingZone.DRAG_TO_REMOVE);
            } else
            if (isToggleTresholdReached(motionevent))
            {
                dragStatusChange.onNext(DraggingZone.DRAG_TO_SWITCH);
            } else
            {
                dragStatusChange.onNext(DraggingZone.DRAG_STARTED);
            }
            changeBackgroundVisibility(true);
            return true;
        }

        protected void stopAnimations()
        {
            bouncingAnimatorSet.cancel();
            bounceXAnimator.cancel();
            bounceYAnimator.cancel();
            bounceXAnimator.removeAllUpdateListeners();
            bounceYAnimator.removeAllUpdateListeners();
        }





/*
        static boolean access$2702(LyftToggleTouchListener lyfttoggletouchlistener, boolean flag)
        {
            lyfttoggletouchlistener.shouldSwitchUserMode = flag;
            return flag;
        }

*/

        private LyftToggleTouchListener()
        {
            this$0 = LyftDriverToggleService.this;
            super();
            bouncingAnimatorSet = new AnimatorSet();
            bounceXAnimator = new ValueAnimator();
            bounceYAnimator = new ValueAnimator();
        }

    }

}
