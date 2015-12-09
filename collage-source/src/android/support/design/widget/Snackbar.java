// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.design.widget:
//            ThemeUtils, AnimationUtils, SnackbarManager, CoordinatorLayout, 
//            SwipeDismissBehavior

public final class Snackbar
{
    final class Behavior extends SwipeDismissBehavior
    {

        final Snackbar this$0;

        public boolean canSwipeDismissView(View view)
        {
            return view instanceof SnackbarLayout;
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorlayout, SnackbarLayout snackbarlayout, MotionEvent motionevent)
        {
            if (!coordinatorlayout.isPointInChildBounds(snackbarlayout, (int)motionevent.getX(), (int)motionevent.getY())) goto _L2; else goto _L1
_L1:
            motionevent.getActionMasked();
            JVM INSTR tableswitch 0 3: default 52
        //                       0 60
        //                       1 76
        //                       2 52
        //                       3 76;
               goto _L2 _L3 _L4 _L2 _L4
_L2:
            return super.onInterceptTouchEvent(coordinatorlayout, snackbarlayout, motionevent);
_L3:
            SnackbarManager.getInstance().cancelTimeout(mManagerCallback);
            continue; /* Loop/switch isn't completed */
_L4:
            SnackbarManager.getInstance().restoreTimeout(mManagerCallback);
            if (true) goto _L2; else goto _L5
_L5:
        }

        public volatile boolean onInterceptTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
        {
            return onInterceptTouchEvent(coordinatorlayout, (SnackbarLayout)view, motionevent);
        }

        Behavior()
        {
            this$0 = Snackbar.this;
            super();
        }
    }

    public static abstract class Callback
    {

        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        public void onDismissed(Snackbar snackbar, int i)
        {
        }

        public void onShown(Snackbar snackbar)
        {
        }

        public Callback()
        {
        }
    }

    public static interface Callback.DismissEvent
        extends Annotation
    {
    }

    public static interface Duration
        extends Annotation
    {
    }

    public static class SnackbarLayout extends LinearLayout
    {

        private Button mActionView;
        private int mMaxInlineActionWidth;
        private int mMaxWidth;
        private TextView mMessageView;
        private OnAttachStateChangeListener mOnAttachStateChangeListener;
        private OnLayoutChangeListener mOnLayoutChangeListener;

        private static void updateTopBottomPadding(View view, int i, int j)
        {
            if (ViewCompat.isPaddingRelative(view))
            {
                ViewCompat.setPaddingRelative(view, ViewCompat.getPaddingStart(view), i, ViewCompat.getPaddingEnd(view), j);
                return;
            } else
            {
                view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), j);
                return;
            }
        }

        private boolean updateViewsWithinLayout(int i, int j, int k)
        {
            boolean flag = false;
            if (i != getOrientation())
            {
                setOrientation(i);
                flag = true;
            }
            if (mMessageView.getPaddingTop() != j || mMessageView.getPaddingBottom() != k)
            {
                updateTopBottomPadding(mMessageView, j, k);
                flag = true;
            }
            return flag;
        }

        void animateChildrenIn(int i, int j)
        {
            ViewCompat.setAlpha(mMessageView, 0.0F);
            ViewCompat.animate(mMessageView).alpha(1.0F).setDuration(j).setStartDelay(i).start();
            if (mActionView.getVisibility() == 0)
            {
                ViewCompat.setAlpha(mActionView, 0.0F);
                ViewCompat.animate(mActionView).alpha(1.0F).setDuration(j).setStartDelay(i).start();
            }
        }

        void animateChildrenOut(int i, int j)
        {
            ViewCompat.setAlpha(mMessageView, 1.0F);
            ViewCompat.animate(mMessageView).alpha(0.0F).setDuration(j).setStartDelay(i).start();
            if (mActionView.getVisibility() == 0)
            {
                ViewCompat.setAlpha(mActionView, 1.0F);
                ViewCompat.animate(mActionView).alpha(0.0F).setDuration(j).setStartDelay(i).start();
            }
        }

        Button getActionView()
        {
            return mActionView;
        }

        TextView getMessageView()
        {
            return mMessageView;
        }

        protected void onAttachedToWindow()
        {
            super.onAttachedToWindow();
            if (mOnAttachStateChangeListener != null)
            {
                mOnAttachStateChangeListener.onViewAttachedToWindow(this);
            }
        }

        protected void onDetachedFromWindow()
        {
            super.onDetachedFromWindow();
            if (mOnAttachStateChangeListener != null)
            {
                mOnAttachStateChangeListener.onViewDetachedFromWindow(this);
            }
        }

        protected void onFinishInflate()
        {
            super.onFinishInflate();
            mMessageView = (TextView)findViewById(android.support.design.R.id.snackbar_text);
            mActionView = (Button)findViewById(android.support.design.R.id.snackbar_action);
        }

        protected void onLayout(boolean flag, int i, int j, int k, int l)
        {
            super.onLayout(flag, i, j, k, l);
            if (flag && mOnLayoutChangeListener != null)
            {
                mOnLayoutChangeListener.onLayoutChange(this, i, j, k, l);
            }
        }

        protected void onMeasure(int i, int j)
        {
            int l;
            int i1;
            super.onMeasure(i, j);
            int k = i;
            if (mMaxWidth > 0)
            {
                k = i;
                if (getMeasuredWidth() > mMaxWidth)
                {
                    k = android.view.View.MeasureSpec.makeMeasureSpec(mMaxWidth, 0x40000000);
                    super.onMeasure(k, j);
                }
            }
            l = getResources().getDimensionPixelSize(android.support.design.R.dimen.design_snackbar_padding_vertical_2lines);
            i1 = getResources().getDimensionPixelSize(android.support.design.R.dimen.design_snackbar_padding_vertical);
            if (mMessageView.getLayout().getLineCount() > 1)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i == 0 || mMaxInlineActionWidth <= 0 || mActionView.getMeasuredWidth() <= mMaxInlineActionWidth) goto _L2; else goto _L1
_L1:
            if (!updateViewsWithinLayout(1, l, l - i1)) goto _L4; else goto _L3
_L3:
            i = 1;
_L6:
            if (i != 0)
            {
                super.onMeasure(k, j);
            }
            return;
_L2:
            if (i != 0)
            {
                i = l;
            } else
            {
                i = i1;
            }
            if (updateViewsWithinLayout(0, i, i))
            {
                i = 1;
                continue; /* Loop/switch isn't completed */
            }
_L4:
            i = 0;
            if (true) goto _L6; else goto _L5
_L5:
        }

        void setOnAttachStateChangeListener(OnAttachStateChangeListener onattachstatechangelistener)
        {
            mOnAttachStateChangeListener = onattachstatechangelistener;
        }

        void setOnLayoutChangeListener(OnLayoutChangeListener onlayoutchangelistener)
        {
            mOnLayoutChangeListener = onlayoutchangelistener;
        }

        public SnackbarLayout(Context context)
        {
            this(context, null);
        }

        public SnackbarLayout(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            attributeset = context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.SnackbarLayout);
            mMaxWidth = attributeset.getDimensionPixelSize(android.support.design.R.styleable.SnackbarLayout_android_maxWidth, -1);
            mMaxInlineActionWidth = attributeset.getDimensionPixelSize(android.support.design.R.styleable.SnackbarLayout_maxActionInlineWidth, -1);
            if (attributeset.hasValue(android.support.design.R.styleable.SnackbarLayout_elevation))
            {
                ViewCompat.setElevation(this, attributeset.getDimensionPixelSize(android.support.design.R.styleable.SnackbarLayout_elevation, 0));
            }
            attributeset.recycle();
            setClickable(true);
            LayoutInflater.from(context).inflate(android.support.design.R.layout.design_layout_snackbar_include, this);
            ViewCompat.setAccessibilityLiveRegion(this, 1);
        }
    }

    static interface SnackbarLayout.OnAttachStateChangeListener
    {

        public abstract void onViewAttachedToWindow(View view);

        public abstract void onViewDetachedFromWindow(View view);
    }

    static interface SnackbarLayout.OnLayoutChangeListener
    {

        public abstract void onLayoutChange(View view, int i, int j, int k, int l);
    }


    private static final int ANIMATION_DURATION = 250;
    private static final int ANIMATION_FADE_DURATION = 180;
    public static final int LENGTH_INDEFINITE = -2;
    public static final int LENGTH_LONG = 0;
    public static final int LENGTH_SHORT = -1;
    private static final int MSG_DISMISS = 1;
    private static final int MSG_SHOW = 0;
    private static final Handler sHandler = new Handler(Looper.getMainLooper(), new android.os.Handler.Callback() {

        public boolean handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return false;

            case 0: // '\0'
                ((Snackbar)message.obj).showView();
                return true;

            case 1: // '\001'
                ((Snackbar)message.obj).hideView(message.arg1);
                break;
            }
            return true;
        }

    });
    private Callback mCallback;
    private final Context mContext;
    private int mDuration;
    private final SnackbarManager.Callback mManagerCallback = new SnackbarManager.Callback() {

        final Snackbar this$0;

        public void dismiss(int i)
        {
            Snackbar.sHandler.sendMessage(Snackbar.sHandler.obtainMessage(1, i, 0, Snackbar.this));
        }

        public void show()
        {
            Snackbar.sHandler.sendMessage(Snackbar.sHandler.obtainMessage(0, Snackbar.this));
        }

            
            {
                this$0 = Snackbar.this;
                super();
            }
    };
    private final ViewGroup mTargetParent;
    private final SnackbarLayout mView;

    private Snackbar(ViewGroup viewgroup)
    {
        mTargetParent = viewgroup;
        mContext = viewgroup.getContext();
        ThemeUtils.checkAppCompatTheme(mContext);
        mView = (SnackbarLayout)LayoutInflater.from(mContext).inflate(android.support.design.R.layout.design_layout_snackbar, mTargetParent, false);
    }

    private void animateViewIn()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            ViewCompat.setTranslationY(mView, mView.getHeight());
            ViewCompat.animate(mView).translationY(0.0F).setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR).setDuration(250L).setListener(new ViewPropertyAnimatorListenerAdapter() {

                final Snackbar this$0;

                public void onAnimationEnd(View view)
                {
                    if (mCallback != null)
                    {
                        mCallback.onShown(Snackbar.this);
                    }
                    SnackbarManager.getInstance().onShown(mManagerCallback);
                }

                public void onAnimationStart(View view)
                {
                    mView.animateChildrenIn(70, 180);
                }

            
            {
                this$0 = Snackbar.this;
                super();
            }
            }).start();
            return;
        } else
        {
            Animation animation = AnimationUtils.loadAnimation(mView.getContext(), android.support.design.R.anim.design_snackbar_in);
            animation.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            animation.setDuration(250L);
            animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final Snackbar this$0;

                public void onAnimationEnd(Animation animation1)
                {
                    if (mCallback != null)
                    {
                        mCallback.onShown(Snackbar.this);
                    }
                    SnackbarManager.getInstance().onShown(mManagerCallback);
                }

                public void onAnimationRepeat(Animation animation1)
                {
                }

                public void onAnimationStart(Animation animation1)
                {
                }

            
            {
                this$0 = Snackbar.this;
                super();
            }
            });
            mView.startAnimation(animation);
            return;
        }
    }

    private void animateViewOut(final int event)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            ViewCompat.animate(mView).translationY(mView.getHeight()).setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR).setDuration(250L).setListener(new ViewPropertyAnimatorListenerAdapter() {

                final Snackbar this$0;
                final int val$event;

                public void onAnimationEnd(View view)
                {
                    onViewHidden(event);
                }

                public void onAnimationStart(View view)
                {
                    mView.animateChildrenOut(0, 180);
                }

            
            {
                this$0 = Snackbar.this;
                event = i;
                super();
            }
            }).start();
            return;
        } else
        {
            Animation animation = AnimationUtils.loadAnimation(mView.getContext(), android.support.design.R.anim.design_snackbar_out);
            animation.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            animation.setDuration(250L);
            animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final Snackbar this$0;
                final int val$event;

                public void onAnimationEnd(Animation animation1)
                {
                    onViewHidden(event);
                }

                public void onAnimationRepeat(Animation animation1)
                {
                }

                public void onAnimationStart(Animation animation1)
                {
                }

            
            {
                this$0 = Snackbar.this;
                event = i;
                super();
            }
            });
            mView.startAnimation(animation);
            return;
        }
    }

    private void dispatchDismiss(int i)
    {
        SnackbarManager.getInstance().dismiss(mManagerCallback, i);
    }

    private static ViewGroup findSuitableParent(View view)
    {
        ViewGroup viewgroup1 = null;
        View view1 = view;
        do
        {
            if (view1 instanceof CoordinatorLayout)
            {
                return (ViewGroup)view1;
            }
            ViewGroup viewgroup = viewgroup1;
            if (view1 instanceof FrameLayout)
            {
                if (view1.getId() == 0x1020002)
                {
                    return (ViewGroup)view1;
                }
                viewgroup = (ViewGroup)view1;
            }
            view = view1;
            if (view1 != null)
            {
                view = view1.getParent();
                if (view instanceof View)
                {
                    view = (View)view;
                } else
                {
                    view = null;
                }
            }
            view1 = view;
            viewgroup1 = viewgroup;
        } while (view != null);
        return viewgroup;
    }

    private boolean isBeingDragged()
    {
        Object obj = mView.getLayoutParams();
        if (obj instanceof CoordinatorLayout.LayoutParams)
        {
            obj = ((CoordinatorLayout.LayoutParams)obj).getBehavior();
            if (obj instanceof SwipeDismissBehavior)
            {
                return ((SwipeDismissBehavior)obj).getDragState() != 0;
            }
        }
        return false;
    }

    public static Snackbar make(View view, int i, int j)
    {
        return make(view, view.getResources().getText(i), j);
    }

    public static Snackbar make(View view, CharSequence charsequence, int i)
    {
        view = new Snackbar(findSuitableParent(view));
        view.setText(charsequence);
        view.setDuration(i);
        return view;
    }

    private void onViewHidden(int i)
    {
        SnackbarManager.getInstance().onDismissed(mManagerCallback);
        if (mCallback != null)
        {
            mCallback.onDismissed(this, i);
        }
        android.view.ViewParent viewparent = mView.getParent();
        if (viewparent instanceof ViewGroup)
        {
            ((ViewGroup)viewparent).removeView(mView);
        }
    }

    public void dismiss()
    {
        dispatchDismiss(3);
    }

    public int getDuration()
    {
        return mDuration;
    }

    public View getView()
    {
        return mView;
    }

    final void hideView(int i)
    {
        if (mView.getVisibility() != 0 || isBeingDragged())
        {
            onViewHidden(i);
            return;
        } else
        {
            animateViewOut(i);
            return;
        }
    }

    public boolean isShown()
    {
        return SnackbarManager.getInstance().isCurrent(mManagerCallback);
    }

    public boolean isShownOrQueued()
    {
        return SnackbarManager.getInstance().isCurrentOrNext(mManagerCallback);
    }

    public Snackbar setAction(int i, android.view.View.OnClickListener onclicklistener)
    {
        return setAction(mContext.getText(i), onclicklistener);
    }

    public Snackbar setAction(CharSequence charsequence, final android.view.View.OnClickListener listener)
    {
        Button button = mView.getActionView();
        if (TextUtils.isEmpty(charsequence) || listener == null)
        {
            button.setVisibility(8);
            button.setOnClickListener(null);
            return this;
        } else
        {
            button.setVisibility(0);
            button.setText(charsequence);
            button.setOnClickListener(new android.view.View.OnClickListener() {

                final Snackbar this$0;
                final android.view.View.OnClickListener val$listener;

                public void onClick(View view)
                {
                    listener.onClick(view);
                    dispatchDismiss(1);
                }

            
            {
                this$0 = Snackbar.this;
                listener = onclicklistener;
                super();
            }
            });
            return this;
        }
    }

    public Snackbar setActionTextColor(int i)
    {
        mView.getActionView().setTextColor(i);
        return this;
    }

    public Snackbar setActionTextColor(ColorStateList colorstatelist)
    {
        mView.getActionView().setTextColor(colorstatelist);
        return this;
    }

    public Snackbar setCallback(Callback callback)
    {
        mCallback = callback;
        return this;
    }

    public Snackbar setDuration(int i)
    {
        mDuration = i;
        return this;
    }

    public Snackbar setText(int i)
    {
        return setText(mContext.getText(i));
    }

    public Snackbar setText(CharSequence charsequence)
    {
        mView.getMessageView().setText(charsequence);
        return this;
    }

    public void show()
    {
        SnackbarManager.getInstance().show(mDuration, mManagerCallback);
    }

    final void showView()
    {
        if (mView.getParent() == null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = mView.getLayoutParams();
            if (layoutparams instanceof CoordinatorLayout.LayoutParams)
            {
                Behavior behavior = new Behavior();
                behavior.setStartAlphaSwipeDistance(0.1F);
                behavior.setEndAlphaSwipeDistance(0.6F);
                behavior.setSwipeDirection(0);
                behavior.setListener(new SwipeDismissBehavior.OnDismissListener() {

                    final Snackbar this$0;

                    public void onDismiss(View view)
                    {
                        dispatchDismiss(0);
                    }

                    public void onDragStateChanged(int i)
                    {
                        switch (i)
                        {
                        default:
                            return;

                        case 1: // '\001'
                        case 2: // '\002'
                            SnackbarManager.getInstance().cancelTimeout(mManagerCallback);
                            return;

                        case 0: // '\0'
                            SnackbarManager.getInstance().restoreTimeout(mManagerCallback);
                            return;
                        }
                    }

            
            {
                this$0 = Snackbar.this;
                super();
            }
                });
                ((CoordinatorLayout.LayoutParams)layoutparams).setBehavior(behavior);
            }
            mTargetParent.addView(mView);
        }
        mView.setOnAttachStateChangeListener(new SnackbarLayout.OnAttachStateChangeListener() {

            final Snackbar this$0;

            public void onViewAttachedToWindow(View view)
            {
            }

            public void onViewDetachedFromWindow(View view)
            {
                if (isShownOrQueued())
                {
                    Snackbar.sHandler.post(new Runnable() {

                        final _cls5 this$1;

                        public void run()
                        {
                            onViewHidden(3);
                        }

            
            {
                this$1 = _cls5.this;
                super();
            }
                    });
                }
            }

            
            {
                this$0 = Snackbar.this;
                super();
            }
        });
        if (ViewCompat.isLaidOut(mView))
        {
            animateViewIn();
            return;
        } else
        {
            mView.setOnLayoutChangeListener(new SnackbarLayout.OnLayoutChangeListener() {

                final Snackbar this$0;

                public void onLayoutChange(View view, int i, int j, int k, int l)
                {
                    animateViewIn();
                    mView.setOnLayoutChangeListener(null);
                }

            
            {
                this$0 = Snackbar.this;
                super();
            }
            });
            return;
        }
    }








}
