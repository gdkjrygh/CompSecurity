// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.toast.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.pinterest.activity.task.toast.BaseToast;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.kit.utils.AnimationUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToastContainer extends FrameLayout
{

    private static int MIN_FLING_VELOCITY = 0;
    private static int MIN_TOUCH_SLOP = 0;
    private static final int OFFSCREEN_TRANSLATE_Y = 300;
    private static final float SPRING_FRICTION = 0.75F;
    private static final float SPRING_TENSION = 0.25F;
    private static final int TOAST_DELAY = 500;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private SparseArray _expireRunnables;
    private Map _stackableToasts;

    public ToastContainer(Context context)
    {
        this(context, null);
    }

    public ToastContainer(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _expireRunnables = new SparseArray();
        _eventsSubscriber = new _cls3();
        init(context);
    }

    private void addExpireRunnable(View view)
    {
        if (view.getTag() instanceof BaseToast)
        {
            addExpireRunnable(view, ((Runnable) (new ToastExpireRunnable(view))), ((BaseToast)view.getTag()).getDuration());
        }
    }

    private void addExpireRunnable(View view, Runnable runnable, int i)
    {
        postDelayed(runnable, i);
        _expireRunnables.put(view.getId(), runnable);
    }

    private List getListForGravityType(int i)
    {
        if (!_stackableToasts.containsKey(Integer.valueOf(i)))
        {
            ArrayList arraylist = new ArrayList();
            _stackableToasts.put(Integer.valueOf(i), arraylist);
        }
        return (List)_stackableToasts.get(Integer.valueOf(i));
    }

    private boolean hide(final View v)
    {
        if (v == null || v.getParent() == null)
        {
            return false;
        }
        if (!setToastDismissed(v))
        {
            return false;
        } else
        {
            ObjectAnimator objectanimator = AnimationUtils.springAnimate(v, "translationY", v.getTranslationY(), 300F, 0.75F, 0.25F);
            objectanimator.setStartDelay(160L);
            ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(v, "alpha", new float[] {
                1.0F, 0.0F
            });
            objectanimator1.setDuration(400L);
            AnimatorSet animatorset = new AnimatorSet();
            animatorset.playTogether(new Animator[] {
                objectanimator1, objectanimator
            });
            animatorset.addListener(new _cls2());
            animatorset.start();
            return true;
        }
    }

    private void init(Context context)
    {
        context = ViewConfiguration.get(context);
        MIN_FLING_VELOCITY = context.getScaledMinimumFlingVelocity();
        MIN_TOUCH_SLOP = context.getScaledTouchSlop();
        setPadding(Constants.MARGIN, Constants.MARGIN, Constants.MARGIN, Constants.MARGIN);
        setClipChildren(false);
        setClipToPadding(false);
        _stackableToasts = new HashMap();
    }

    private static boolean isToastDismissed(View view)
    {
        if (view.getTag() instanceof BaseToast)
        {
            return ((BaseToast)view.getTag()).isDismissed();
        } else
        {
            return false;
        }
    }

    private static void onToastClicked(View view)
    {
        Object obj = view.getTag();
        if (obj instanceof BaseToast)
        {
            ((BaseToast)obj).onToastClicked(view.getContext());
        }
    }

    private static void onToastCompleted(View view)
    {
        Object obj = view.getTag();
        if (obj instanceof BaseToast)
        {
            ((BaseToast)obj).onToastCompleted(view.getContext());
        }
    }

    private void removeExpireRunnable(View view)
    {
        Runnable runnable = (Runnable)_expireRunnables.get(view.getId());
        if (runnable != null)
        {
            removeCallbacks(runnable);
            _expireRunnables.remove(view.getId());
        }
    }

    private void removeToastView(View view)
    {
        if (view != null)
        {
            removeView(view);
        }
    }

    private static boolean setToastDismissed(View view)
    {
        if (view.getTag() instanceof BaseToast)
        {
            view = (BaseToast)view.getTag();
            if (!view.isDismissed())
            {
                view.setDismissed(true);
                return true;
            }
        }
        return false;
    }

    public void addToast(final BaseToast previousChildren)
    {
        if (previousChildren == null)
        {
            return;
        } else
        {
            final View v = previousChildren.getView(this);
            v.setTag(previousChildren);
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutparams.gravity = previousChildren.getGravity();
            previousChildren = new ArrayList();
            previousChildren.addAll(getListForGravityType(layoutparams.gravity));
            v.setLayoutParams(layoutparams);
            v.setOnTouchListener(new ToastTouchListener());
            int i = previousChildren.size();
            v.postDelayed(new _cls1(), i * 500);
            v.setTranslationY(300F);
            addView(v);
            return;
        }
    }

    public void addView(View view)
    {
        super.addView(view);
        getListForGravityType(((android.widget.FrameLayout.LayoutParams)view.getLayoutParams()).gravity).add(view);
    }

    public void dismiss(View view)
    {
        hide(view);
    }

    public boolean extendToast(View view, int i)
    {
        if (!(view.getTag() instanceof BaseToast))
        {
            return false;
        }
        if (((BaseToast)view.getTag()).isDismissed())
        {
            return false;
        }
        Runnable runnable = (Runnable)_expireRunnables.get(view.getId());
        if (runnable == null)
        {
            return false;
        } else
        {
            removeCallbacks(runnable);
            addExpireRunnable(view, new ToastExpireRunnable(view), i);
            return true;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Events.register(_eventsSubscriber, com/pinterest/activity/task/view/MainViewPager$PageChangedEvent, new Class[0]);
    }

    protected void onDetachedFromWindow()
    {
        Events.unregister(_eventsSubscriber);
        super.onDetachedFromWindow();
    }

    public void removeView(View view)
    {
        super.removeView(view);
        getListForGravityType(((android.widget.FrameLayout.LayoutParams)view.getLayoutParams()).gravity).remove(view);
    }












    private class _cls3
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final ToastContainer this$0;

        public void onEventMainThread(com.pinterest.activity.task.view.MainViewPager.PageChangedEvent pagechangedevent)
        {
            for (int i = 0; i < getChildCount(); i++)
            {
                pagechangedevent = getChildAt(i);
                if (hide(pagechangedevent))
                {
                    ToastContainer.onToastCompleted(pagechangedevent);
                }
            }

        }

        _cls3()
        {
            this$0 = ToastContainer.this;
            super();
        }
    }


    private class ToastExpireRunnable
        implements Runnable
    {

        final ToastContainer this$0;
        private View v;

        public void run()
        {
            if (hide(v))
            {
                ToastContainer.onToastCompleted(v);
            }
            _expireRunnables.delete(v.getId());
        }

        public ToastExpireRunnable(View view)
        {
            this$0 = ToastContainer.this;
            super();
            v = view;
        }
    }


    private class _cls2 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final ToastContainer this$0;
        final View val$v;

        public void onAnimationCancel(Animator animator)
        {
            removeToastView(v);
        }

        public void onAnimationEnd(Animator animator)
        {
            removeToastView(v);
        }

        _cls2()
        {
            this$0 = ToastContainer.this;
            v = view;
            super();
        }
    }


    private class ToastTouchListener
        implements android.view.View.OnTouchListener
    {

        private float MAX_CLICK_TIME;
        private VelocityTracker _velocityTracker;
        private float deltaX;
        private float downX;
        final ToastContainer this$0;

        public boolean onTouch(final View v, MotionEvent motionevent)
        {
            MotionEventCompat.getActionMasked(motionevent);
            JVM INSTR tableswitch 0 2: default 32
        //                       0 34
        //                       1 67
        //                       2 277;
               goto _L1 _L2 _L3 _L4
_L1:
            return false;
_L2:
            _velocityTracker = VelocityTracker.obtain();
            _velocityTracker.addMovement(motionevent);
            downX = motionevent.getRawX();
            removeExpireRunnable(v);
            return false;
_L3:
            if (_velocityTracker != null)
            {
                deltaX = motionevent.getRawX() - downX;
                _velocityTracker.addMovement(motionevent);
                _velocityTracker.computeCurrentVelocity(1000);
                if (Math.abs(_velocityTracker.getXVelocity()) >= (float)ToastContainer.MIN_FLING_VELOCITY)
                {
                    motionevent = ObjectAnimator.ofFloat(v, "translationX", new float[] {
                        v.getTranslationX(), Math.copySign(Device.getScreenWidth(), deltaX)
                    });
                    motionevent.setInterpolator(new AccelerateDecelerateInterpolator());
                    class _cls1 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
                    {

                        final ToastTouchListener this$1;
                        final View val$v;

                        public void onAnimationEnd(Animator animator)
                        {
                            removeToastView(v);
                            ToastContainer.onToastCompleted(v);
                        }

                _cls1()
                {
                    this$1 = ToastTouchListener.this;
                    v = view;
                    super();
                }
                    }

                    motionevent.addListener(new _cls1());
                    motionevent.start();
                    ToastContainer.setToastDismissed(v);
                    return true;
                }
                if ((float)(motionevent.getEventTime() - motionevent.getDownTime()) < MAX_CLICK_TIME)
                {
                    dismiss(v);
                    ToastContainer.onToastClicked(v);
                    return true;
                }
                if (Math.abs(deltaX) >= (float)ToastContainer.MIN_TOUCH_SLOP)
                {
                    AnimationUtils.springAnimate(v, "translationX", deltaX, 0.0F, 0.75F, 0.25F).start();
                    addExpireRunnable(v);
                    return true;
                } else
                {
                    _velocityTracker.recycle();
                    _velocityTracker = null;
                    return false;
                }
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (_velocityTracker != null)
            {
                _velocityTracker.addMovement(motionevent);
                deltaX = motionevent.getRawX() - downX;
                v.setTranslationX(deltaX);
                return true;
            }
            if (true) goto _L1; else goto _L5
_L5:
        }

        ToastTouchListener()
        {
            this$0 = ToastContainer.this;
            super();
            MAX_CLICK_TIME = 200F;
        }
    }


    private class _cls1
        implements Runnable
    {

        final ToastContainer this$0;
        final List val$previousChildren;
        final View val$v;

        public void run()
        {
            ObjectAnimator objectanimator = AnimationUtils.springAnimate(v, "translationY", 300, 0, 0.75F, 0.25F);
            class _cls1 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
            {

                final _cls1 this$1;

                public void onAnimationStart(Animator animator)
                {
                    animator = previousChildren.iterator();
                    do
                    {
                        if (!animator.hasNext())
                        {
                            break;
                        }
                        View view = (View)animator.next();
                        if (!ToastContainer.isToastDismissed(view))
                        {
                            float f = view.getTranslationY();
                            AnimationUtils.springAnimate(view, "translationY", f, f - (float)v.getMeasuredHeight(), 0.75F, 0.25F).start();
                        }
                    } while (true);
                }

                _cls1()
                {
                    this$1 = _cls1.this;
                    super();
                }
            }

            objectanimator.addListener(new _cls1());
            objectanimator.start();
            addExpireRunnable(v);
        }

        _cls1()
        {
            this$0 = ToastContainer.this;
            v = view;
            previousChildren = list;
            super();
        }
    }

}
