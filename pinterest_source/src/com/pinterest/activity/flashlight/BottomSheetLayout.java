// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.flashlight;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.pinterest.base.Device;

// Referenced classes of package com.pinterest.activity.flashlight:
//            ViewTransformer, OnSheetDismissedListener

public class BottomSheetLayout extends FrameLayout
{

    private static final long ANIMATION_DURATION = 300L;
    private static final Property SHEET_TRANSLATION = new _cls1(java/lang/Float, "sheetTranslation");
    private TimeInterpolator animationInterpolator;
    public boolean bottomSheetOwnsTouch;
    private Rect contentClipRect;
    private Animator currentAnimator;
    private int currentSheetViewHeight;
    private int defaultSheetWidth;
    private ViewTransformer defaultViewTransformer;
    private View dimView;
    private float downSheetTranslation;
    private State downState;
    private float downX;
    private float downY;
    private boolean hasIntercepted;
    private View horizontallyScrollableView;
    private boolean interceptContentTouch;
    private final boolean isTablet;
    private float minFlingVelocity;
    private OnSheetDismissedListener onSheetDismissedListener;
    private OnSheetStateChangeListener onSheetStateChangeListener;
    private float peek;
    private boolean peekOnDismiss;
    private Runnable runAfterDismiss;
    private int screenWidth;
    private int sheetEndX;
    private int sheetStartX;
    private float sheetTranslation;
    private android.view.View.OnLayoutChangeListener sheetViewOnLayoutChangeListener;
    private boolean sheetViewOwnsTouch;
    private boolean shouldDimContentView;
    private State state;
    private float touchSlop;
    private boolean useHardwareLayerWhileAnimating;
    private VelocityTracker velocityTracker;
    private ViewTransformer viewTransformer;

    public BottomSheetLayout(Context context)
    {
        super(context);
        contentClipRect = new Rect();
        state = State.HIDDEN;
        peekOnDismiss = false;
        animationInterpolator = new DecelerateInterpolator(1.6F);
        defaultViewTransformer = new IdentityViewTransformer(null);
        shouldDimContentView = true;
        useHardwareLayerWhileAnimating = true;
        interceptContentTouch = true;
        defaultSheetWidth = (int)Device.getScreenWidth();
        screenWidth = 0;
        isTablet = Device.isTablet();
        sheetStartX = 0;
        sheetEndX = 0;
        init();
    }

    public BottomSheetLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public BottomSheetLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        contentClipRect = new Rect();
        state = State.HIDDEN;
        peekOnDismiss = false;
        animationInterpolator = new DecelerateInterpolator(1.6F);
        defaultViewTransformer = new IdentityViewTransformer(null);
        shouldDimContentView = true;
        useHardwareLayerWhileAnimating = true;
        interceptContentTouch = true;
        defaultSheetWidth = (int)Device.getScreenWidth();
        screenWidth = 0;
        isTablet = Device.isTablet();
        sheetStartX = 0;
        sheetEndX = 0;
        init();
    }

    public BottomSheetLayout(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        contentClipRect = new Rect();
        state = State.HIDDEN;
        peekOnDismiss = false;
        animationInterpolator = new DecelerateInterpolator(1.6F);
        defaultViewTransformer = new IdentityViewTransformer(null);
        shouldDimContentView = true;
        useHardwareLayerWhileAnimating = true;
        interceptContentTouch = true;
        defaultSheetWidth = (int)Device.getScreenWidth();
        screenWidth = 0;
        isTablet = Device.isTablet();
        sheetStartX = 0;
        sheetEndX = 0;
        init();
    }

    private boolean canScrollUp(View view, float f, float f1)
    {
        if (view instanceof ViewGroup)
        {
            ViewGroup viewgroup = (ViewGroup)view;
            int j;
            for (int i = 0; i < viewgroup.getChildCount(); i++)
            {
                View view1 = viewgroup.getChildAt(i);
                int k = view1.getLeft();
                int l = view1.getTop();
                j = view1.getRight();
                int i1 = view1.getBottom();
                if (f > (float)k && f < (float)j && f1 > (float)l && f1 < (float)i1)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                if (j && canScrollUp(view1, f - (float)k, f1 - (float)l))
                {
                    return true;
                }
            }

        }
        return view.canScrollVertically(-1);
    }

    private void cancelCurrentAnimation()
    {
        if (currentAnimator != null)
        {
            currentAnimator.cancel();
        }
    }

    private float getDefaultPeekTranslation()
    {
        if (hasFullHeightSheet())
        {
            return (float)(getHeight() / 3);
        } else
        {
            return (float)getSheetView().getHeight();
        }
    }

    private float getDimAlpha(float f)
    {
        if (viewTransformer != null)
        {
            return viewTransformer.getDimAlpha(f, getMaxSheetTranslation(), getPeekSheetTranslation(), this, getContentView());
        }
        if (defaultViewTransformer != null)
        {
            return defaultViewTransformer.getDimAlpha(f, getMaxSheetTranslation(), getPeekSheetTranslation(), this, getContentView());
        } else
        {
            return 0.0F;
        }
    }

    private boolean hasFullHeightSheet()
    {
        return getSheetView() == null || getSheetView().getHeight() == getHeight();
    }

    private void init()
    {
        Object obj = ViewConfiguration.get(getContext());
        minFlingVelocity = ((ViewConfiguration) (obj)).getScaledMinimumFlingVelocity();
        touchSlop = ((ViewConfiguration) (obj)).getScaledTouchSlop();
        dimView = new View(getContext());
        dimView.setBackgroundColor(0xff000000);
        dimView.setAlpha(0.0F);
        dimView.setVisibility(4);
        peek = 0.0F;
        setFocusableInTouchMode(true);
        obj = new Point();
        ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getSize(((Point) (obj)));
        screenWidth = ((Point) (obj)).x;
        sheetEndX = screenWidth;
    }

    private void initializeSheetValues()
    {
        if (getSheetView() == null)
        {
            return;
        } else
        {
            sheetTranslation = 0.0F;
            contentClipRect.set(0, 0, getWidth(), getHeight());
            getSheetView().setTranslationY(getHeight());
            getSheetView().setVisibility(0);
            dimView.setAlpha(0.0F);
            dimView.setVisibility(4);
            return;
        }
    }

    private boolean isAnimating()
    {
        return currentAnimator != null;
    }

    private boolean isInsideHorizontallyScrollableView(MotionEvent motionevent)
    {
        if (horizontallyScrollableView != null)
        {
            int ai[] = new int[2];
            horizontallyScrollableView.getLocationOnScreen(ai);
            if ((float)(ai[0] + horizontallyScrollableView.getWidth()) > motionevent.getRawX() && (float)(ai[1] + horizontallyScrollableView.getHeight()) > motionevent.getRawY() && (float)ai[0] < motionevent.getRawX() && (float)ai[1] < motionevent.getRawY())
            {
                return true;
            }
        }
        return false;
    }

    private boolean isXInSheet(float f)
    {
        return true;
    }

    private void setSheetLayerTypeIfEnabled(int i)
    {
        if (useHardwareLayerWhileAnimating)
        {
            getSheetView().setLayerType(i, null);
        }
    }

    private void setState(State state1)
    {
        state = state1;
        if (onSheetStateChangeListener != null)
        {
            onSheetStateChangeListener.onSheetStateChanged(state1);
        }
    }

    private void transformView(float f)
    {
        if (viewTransformer != null)
        {
            viewTransformer.transformView(f, getMaxSheetTranslation(), getPeekSheetTranslation(), this, getContentView());
        } else
        if (defaultViewTransformer != null)
        {
            defaultViewTransformer.transformView(f, getMaxSheetTranslation(), getPeekSheetTranslation(), this, getContentView());
            return;
        }
    }

    public void addView(View view)
    {
        if (getChildCount() > 0)
        {
            throw new IllegalArgumentException("You may not declare more then one child of bottom sheet. The sheet view must be added dynamically with showWithSheetView()");
        } else
        {
            setContentView(view);
            return;
        }
    }

    public void addView(View view, int i)
    {
        addView(view);
    }

    public void addView(View view, int i, int j)
    {
        addView(view);
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
        addView(view);
    }

    public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        addView(view);
    }

    public void dismissSheet()
    {
        dismissSheet(null);
    }

    public void dismissSheet(final Runnable sheetView)
    {
        if (state == State.HIDDEN)
        {
            runAfterDismiss = null;
            return;
        } else
        {
            runAfterDismiss = sheetView;
            sheetView = getSheetView();
            sheetView.removeOnLayoutChangeListener(sheetViewOnLayoutChangeListener);
            cancelCurrentAnimation();
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(this, SHEET_TRANSLATION, new float[] {
                0.0F
            });
            objectanimator.setDuration(300L);
            objectanimator.setInterpolator(animationInterpolator);
            objectanimator.addListener(new _cls8());
            objectanimator.start();
            currentAnimator = objectanimator;
            sheetStartX = 0;
            sheetEndX = screenWidth;
            return;
        }
    }

    public void expandSheet()
    {
        cancelCurrentAnimation();
        setSheetLayerTypeIfEnabled(0);
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(this, SHEET_TRANSLATION, new float[] {
            (float)getHeight()
        });
        objectanimator.setDuration(300L);
        objectanimator.setInterpolator(animationInterpolator);
        objectanimator.addListener(new _cls2());
        objectanimator.start();
        currentAnimator = objectanimator;
        setState(State.EXPANDED);
    }

    public View getContentView()
    {
        if (getChildCount() > 0)
        {
            return getChildAt(0);
        } else
        {
            return null;
        }
    }

    public boolean getInterceptContentTouch()
    {
        return interceptContentTouch;
    }

    public float getMaxSheetTranslation()
    {
        if (hasFullHeightSheet())
        {
            return (float)(getHeight() - getPaddingTop());
        } else
        {
            return (float)getSheetView().getHeight();
        }
    }

    public boolean getPeekOnDismiss()
    {
        return peekOnDismiss;
    }

    public float getPeekSheetTranslation()
    {
        if (peek == 0.0F)
        {
            return getDefaultPeekTranslation();
        } else
        {
            return peek;
        }
    }

    public View getSheetView()
    {
        if (getChildCount() > 2)
        {
            return getChildAt(2);
        } else
        {
            return null;
        }
    }

    public State getState()
    {
        return state;
    }

    public boolean isSheetShowing()
    {
        return state != State.HIDDEN;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        velocityTracker = VelocityTracker.obtain();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        velocityTracker.clear();
        cancelCurrentAnimation();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        boolean flag1 = true;
        boolean flag;
        if (motionevent.getActionMasked() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            hasIntercepted = false;
        }
        if (interceptContentTouch || motionevent.getY() > (float)getHeight() - sheetTranslation && isXInSheet(motionevent.getX()))
        {
            if (!flag || !isSheetShowing())
            {
                flag1 = false;
            }
            hasIntercepted = flag1;
        } else
        {
            hasIntercepted = false;
        }
        return hasIntercepted;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        i = (int)((double)getHeight() - Math.ceil(sheetTranslation));
        contentClipRect.set(0, 0, getWidth(), i);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag2 = true;
        boolean flag = false;
        boolean flag1;
        if (!isSheetShowing())
        {
            flag1 = false;
        } else
        {
            if (isAnimating())
            {
                return false;
            }
            if (!hasIntercepted)
            {
                return onInterceptTouchEvent(motionevent);
            }
            flag1 = flag2;
            if (motionevent.getAction() != 3)
            {
                if (motionevent.getAction() == 0)
                {
                    bottomSheetOwnsTouch = false;
                    sheetViewOwnsTouch = false;
                    downY = motionevent.getY();
                    downX = motionevent.getX();
                    downSheetTranslation = sheetTranslation;
                    downState = state;
                    velocityTracker.clear();
                }
                velocityTracker.addMovement(motionevent);
                float f3 = getMaxSheetTranslation();
                float f2 = getPeekSheetTranslation();
                float f = downY - motionevent.getY();
                motionevent.getX();
                float f1;
                if (!bottomSheetOwnsTouch && !sheetViewOwnsTouch)
                {
                    MotionEvent motionevent2;
                    if (Math.abs(f) > touchSlop)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    bottomSheetOwnsTouch = flag1;
                    if (horizontallyScrollableView != null)
                    {
                        if (motionevent.getAction() == 0)
                        {
                            sheetViewOwnsTouch = isInsideHorizontallyScrollableView(motionevent);
                        }
                        if (sheetViewOwnsTouch)
                        {
                            bottomSheetOwnsTouch = false;
                        }
                    }
                    if (bottomSheetOwnsTouch)
                    {
                        if (state == State.PEEKED)
                        {
                            MotionEvent motionevent1 = MotionEvent.obtain(motionevent);
                            motionevent1.offsetLocation(0.0F, sheetTranslation - (float)getHeight());
                            motionevent1.setAction(3);
                            getSheetView().dispatchTouchEvent(motionevent1);
                            motionevent1.recycle();
                        }
                        sheetViewOwnsTouch = false;
                        downY = motionevent.getY();
                        downX = motionevent.getX();
                        f = 0.0F;
                    }
                }
                f1 = downSheetTranslation;
                if (bottomSheetOwnsTouch)
                {
                    if (f < 0.0F)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    flag1 = canScrollUp(getSheetView(), motionevent.getX(), motionevent.getY() + (sheetTranslation - (float)getHeight()));
                    if (state == State.EXPANDED && flag && !flag1)
                    {
                        downY = motionevent.getY();
                        downSheetTranslation = sheetTranslation;
                        velocityTracker.clear();
                        setState(State.PEEKED);
                        setSheetLayerTypeIfEnabled(2);
                        f1 = sheetTranslation;
                        motionevent2 = MotionEvent.obtain(motionevent);
                        motionevent2.setAction(3);
                        getSheetView().dispatchTouchEvent(motionevent2);
                        motionevent2.recycle();
                    } else
                    {
                        f1 += f;
                    }
                    f = f1;
                    if (state == State.PEEKED)
                    {
                        f = f1;
                        if (f1 > f3)
                        {
                            setSheetTranslation(f3);
                            f = Math.min(f3, f1);
                            motionevent2 = MotionEvent.obtain(motionevent);
                            motionevent2.setAction(0);
                            motionevent2.offsetLocation(-1F * motionevent.getX() + 2.0F, 0.0F);
                            getSheetView().dispatchTouchEvent(motionevent2);
                            motionevent2.recycle();
                            setState(State.EXPANDED);
                            setSheetLayerTypeIfEnabled(0);
                        }
                    }
                    if (state == State.EXPANDED)
                    {
                        motionevent.offsetLocation(0.0F, sheetTranslation - (float)getHeight());
                        getSheetView().dispatchTouchEvent(motionevent);
                        return true;
                    }
                    f1 = f;
                    if (f < f2)
                    {
                        f1 = f2;
                    }
                    setSheetTranslation(f1);
                    if (motionevent.getAction() == 3)
                    {
                        if (downState == State.EXPANDED)
                        {
                            expandSheet();
                        } else
                        {
                            peekSheet();
                        }
                    }
                    flag1 = flag2;
                    if (motionevent.getAction() == 1)
                    {
                        if (f1 >= f2)
                        {
                            velocityTracker.computeCurrentVelocity(1000);
                            f = velocityTracker.getYVelocity();
                            if (Math.abs(f) < minFlingVelocity)
                            {
                                if (sheetTranslation > (float)(getHeight() / 2))
                                {
                                    expandSheet();
                                    return true;
                                } else
                                {
                                    peekSheet();
                                    return true;
                                }
                            }
                            if (f < 0.0F)
                            {
                                expandSheet();
                                return true;
                            }
                        }
                        peekSheet();
                        return true;
                    }
                } else
                {
                    if (motionevent.getY() < (float)getHeight() - sheetTranslation || !isXInSheet(motionevent.getX()))
                    {
                        flag = true;
                    }
                    if (motionevent.getAction() == 1 && flag && interceptContentTouch)
                    {
                        dismissSheet();
                        return true;
                    } else
                    {
                        motionevent.offsetLocation(0.0F, sheetTranslation - (float)getHeight());
                        getSheetView().dispatchTouchEvent(motionevent);
                        return true;
                    }
                }
            }
        }
        return flag1;
    }

    public void peekSheet()
    {
        cancelCurrentAnimation();
        setSheetLayerTypeIfEnabled(2);
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(this, SHEET_TRANSLATION, new float[] {
            getPeekSheetTranslation()
        });
        objectanimator.setDuration(300L);
        objectanimator.setInterpolator(animationInterpolator);
        objectanimator.addListener(new _cls3());
        objectanimator.start();
        currentAnimator = objectanimator;
        setState(State.PEEKED);
    }

    public void setContentView(View view)
    {
        super.addView(view, -1, generateDefaultLayoutParams());
        super.addView(dimView, -1, generateDefaultLayoutParams());
    }

    public void setDefaultViewTransformer(ViewTransformer viewtransformer)
    {
        defaultViewTransformer = viewtransformer;
    }

    public void setHorizontallyScrollableView(View view)
    {
        horizontallyScrollableView = view;
    }

    public void setInterceptContentTouch(boolean flag)
    {
        interceptContentTouch = flag;
    }

    public void setOnSheetStateChangeListener(OnSheetStateChangeListener onsheetstatechangelistener)
    {
        onSheetStateChangeListener = onsheetstatechangelistener;
    }

    public void setPeekOnDismiss(boolean flag)
    {
        peekOnDismiss = flag;
    }

    public void setPeekSheetTranslation(float f)
    {
        peek = f;
    }

    public void setSheetTranslation(float f)
    {
        int i = 0;
        sheetTranslation = f;
        int j = (int)((double)getHeight() - Math.ceil(f));
        contentClipRect.set(0, 0, getWidth(), j);
        getSheetView().setTranslationY((float)getHeight() - f);
        transformView(f);
        if (shouldDimContentView)
        {
            f = getDimAlpha(f);
            dimView.setAlpha(f);
            View view = dimView;
            if (f <= 0.0F)
            {
                i = 4;
            }
            view.setVisibility(i);
        }
    }

    public void setShouldDimContentView(boolean flag)
    {
        shouldDimContentView = flag;
    }

    public void setUseHardwareLayerWhileAnimating(boolean flag)
    {
        useHardwareLayerWhileAnimating = flag;
    }

    public boolean shouldDimContentView()
    {
        return shouldDimContentView;
    }

    public void showWithSheetView(View view)
    {
        showWithSheetView(view, null);
    }

    public void showWithSheetView(View view, ViewTransformer viewtransformer)
    {
        showWithSheetView(view, viewtransformer, null);
    }

    public void showWithSheetView(final View sheetView, final ViewTransformer viewTransformer, final OnSheetDismissedListener onSheetDismissedListener)
    {
        if (state != State.HIDDEN)
        {
            dismissSheet(new _cls4());
            return;
        }
        setState(State.PREPARING);
        android.widget.FrameLayout.LayoutParams layoutparams1 = (android.widget.FrameLayout.LayoutParams)sheetView.getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutparams = layoutparams1;
        if (layoutparams1 == null)
        {
            layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -2, 1);
        }
        sheetView.setVisibility(4);
        sheetView.post(new _cls5());
        super.addView(sheetView, -1, layoutparams);
        this.viewTransformer = viewTransformer;
        this.onSheetDismissedListener = onSheetDismissedListener;
        getViewTreeObserver().addOnPreDrawListener(new _cls6());
        currentSheetViewHeight = sheetView.getMeasuredHeight();
        sheetViewOnLayoutChangeListener = new _cls7();
        sheetView.addOnLayoutChangeListener(sheetViewOnLayoutChangeListener);
    }




/*
    static ViewTransformer access$1002(BottomSheetLayout bottomsheetlayout, ViewTransformer viewtransformer)
    {
        bottomsheetlayout.viewTransformer = viewtransformer;
        return viewtransformer;
    }

*/



/*
    static Runnable access$1102(BottomSheetLayout bottomsheetlayout, Runnable runnable)
    {
        bottomsheetlayout.runAfterDismiss = runnable;
        return runnable;
    }

*/


/*
    static Animator access$302(BottomSheetLayout bottomsheetlayout, Animator animator)
    {
        bottomsheetlayout.currentAnimator = animator;
        return animator;
    }

*/





/*
    static int access$602(BottomSheetLayout bottomsheetlayout, int i)
    {
        bottomsheetlayout.currentSheetViewHeight = i;
        return i;
    }

*/





/*
    static OnSheetDismissedListener access$902(BottomSheetLayout bottomsheetlayout, OnSheetDismissedListener onsheetdismissedlistener)
    {
        bottomsheetlayout.onSheetDismissedListener = onsheetdismissedlistener;
        return onsheetdismissedlistener;
    }

*/

    private class State extends Enum
    {

        private static final State $VALUES[];
        public static final State EXPANDED;
        public static final State HIDDEN;
        public static final State PEEKED;
        public static final State PREPARING;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/pinterest/activity/flashlight/BottomSheetLayout$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            HIDDEN = new State("HIDDEN", 0);
            PREPARING = new State("PREPARING", 1);
            PEEKED = new State("PEEKED", 2);
            EXPANDED = new State("EXPANDED", 3);
            $VALUES = (new State[] {
                HIDDEN, PREPARING, PEEKED, EXPANDED
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    private class IdentityViewTransformer extends BaseViewTransformer
    {

        final BottomSheetLayout this$0;

        public void transformView(float f, float f1, float f2, BottomSheetLayout bottomsheetlayout, View view)
        {
        }

        private IdentityViewTransformer()
        {
            this$0 = BottomSheetLayout.this;
            super();
        }

        IdentityViewTransformer(_cls1 _pcls1)
        {
            this();
        }
    }


    private class OnSheetStateChangeListener
    {

        public abstract void onSheetStateChanged(State state1);
    }


    private class _cls8 extends CancelDetectionAnimationListener
    {
        private class CancelDetectionAnimationListener extends AnimatorListenerAdapter
        {

            protected boolean canceled;
            final BottomSheetLayout this$0;

            public void onAnimationCancel(Animator animator)
            {
                canceled = true;
            }

            private CancelDetectionAnimationListener()
            {
                this$0 = BottomSheetLayout.this;
                super();
            }

            CancelDetectionAnimationListener(_cls1 _pcls1)
            {
                this();
            }
        }


        final BottomSheetLayout this$0;
        final View val$sheetView;

        public void onAnimationEnd(Animator animator)
        {
            if (!canceled)
            {
                currentAnimator = null;
                setState(State.HIDDEN);
                setSheetLayerTypeIfEnabled(0);
                removeView(sheetView);
                if (onSheetDismissedListener != null)
                {
                    onSheetDismissedListener.onDismissed(BottomSheetLayout.this);
                }
                viewTransformer = null;
                onSheetDismissedListener = null;
                if (runAfterDismiss != null)
                {
                    runAfterDismiss.run();
                    runAfterDismiss = null;
                }
            }
        }

        _cls8()
        {
            this$0 = BottomSheetLayout.this;
            sheetView = view;
            super(null);
        }
    }


    private class _cls2 extends CancelDetectionAnimationListener
    {

        final BottomSheetLayout this$0;

        public void onAnimationEnd(Animator animator)
        {
            if (!canceled)
            {
                currentAnimator = null;
            }
        }

        _cls2()
        {
            this$0 = BottomSheetLayout.this;
            super(null);
        }
    }


    private class _cls3 extends CancelDetectionAnimationListener
    {

        final BottomSheetLayout this$0;

        public void onAnimationEnd(Animator animator)
        {
            if (!canceled)
            {
                currentAnimator = null;
            }
        }

        _cls3()
        {
            this$0 = BottomSheetLayout.this;
            super(null);
        }
    }


    private class _cls4
        implements Runnable
    {

        final BottomSheetLayout this$0;
        final OnSheetDismissedListener val$onSheetDismissedListener;
        final View val$sheetView;
        final ViewTransformer val$viewTransformer;

        public void run()
        {
            showWithSheetView(sheetView, viewTransformer, onSheetDismissedListener);
        }

        _cls4()
        {
            this$0 = BottomSheetLayout.this;
            sheetView = view;
            viewTransformer = viewtransformer;
            onSheetDismissedListener = onsheetdismissedlistener;
            super();
        }
    }


    private class _cls5
        implements Runnable
    {

        final BottomSheetLayout this$0;

        public void run()
        {
            initializeSheetValues();
        }

        _cls5()
        {
            this$0 = BottomSheetLayout.this;
            super();
        }
    }


    private class _cls6
        implements android.view.ViewTreeObserver.OnPreDrawListener
    {

        final BottomSheetLayout this$0;

        public boolean onPreDraw()
        {
            getViewTreeObserver().removeOnPreDrawListener(this);
            class _cls1
                implements Runnable
            {

                final _cls6 this$1;

                public void run()
                {
                    if (getSheetView() != null)
                    {
                        peekSheet();
                    }
                }

                _cls1()
                {
                    this$1 = _cls6.this;
                    super();
                }
            }

            post(new _cls1());
            return true;
        }

        _cls6()
        {
            this$0 = BottomSheetLayout.this;
            super();
        }
    }


    private class _cls7
        implements android.view.View.OnLayoutChangeListener
    {

        final BottomSheetLayout this$0;

        public void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
                int k1, int l1)
        {
            i = view.getMeasuredHeight();
            if (state != State.HIDDEN && i < currentSheetViewHeight)
            {
                if (state == State.EXPANDED)
                {
                    setState(State.PEEKED);
                }
                setSheetTranslation(i);
            }
            currentSheetViewHeight = i;
        }

        _cls7()
        {
            this$0 = BottomSheetLayout.this;
            super();
        }
    }


    private class _cls1 extends Property
    {

        public final Float get(BottomSheetLayout bottomsheetlayout)
        {
            return Float.valueOf(bottomsheetlayout.sheetTranslation);
        }

        public final volatile Object get(Object obj)
        {
            return get((BottomSheetLayout)obj);
        }

        public final void set(BottomSheetLayout bottomsheetlayout, Float float1)
        {
            bottomsheetlayout.setSheetTranslation(float1.floatValue());
        }

        public final volatile void set(Object obj, Object obj1)
        {
            set((BottomSheetLayout)obj, (Float)obj1);
        }

        _cls1(Class class1, String s)
        {
            super(class1, s);
        }
    }

}
