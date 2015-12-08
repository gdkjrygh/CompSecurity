// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import com.skype.android.util.PropertyAnimationUtil;

// Referenced classes of package com.skype.android.app.chat:
//            f, j

public class ChatTimeStampAnimator
{
    public class ExpansionAnimationListener extends AnimatorListenerAdapter
    {

        private final android.support.v7.widget.RecyclerView.v holder;
        private boolean keepHolderRecyclability;
        final ChatTimeStampAnimator this$0;

        public void onAnimationEnd(Animator animator)
        {
            if (!keepHolderRecyclability && !holder.isRecyclable())
            {
                holder.setIsRecyclable(true);
            }
            animator = holder.itemView.getLayoutParams();
            animator.width = -1;
            animator.height = -2;
            holder.itemView.setLayoutParams(animator);
        }

        public void onAnimationStart(Animator animator)
        {
            boolean flag;
            if (!holder.isRecyclable())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            keepHolderRecyclability = flag;
            if (holder.isRecyclable())
            {
                holder.setIsRecyclable(false);
            }
        }

        public ExpansionAnimationListener(android.support.v7.widget.RecyclerView.v v)
        {
            this$0 = ChatTimeStampAnimator.this;
            super();
            holder = v;
            keepHolderRecyclability = false;
        }
    }

    public class ExpansionUpdateListener
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        private int end;
        private j holder;
        private int start;
        final ChatTimeStampAnimator this$0;

        public void onAnimationUpdate(ValueAnimator valueanimator)
        {
            float f1 = ((Float)valueanimator.getAnimatedValue()).floatValue();
            valueanimator = holder.getTimestampContainer().getLayoutParams();
            valueanimator.height = start + (int)((float)(end - start) * f1);
            holder.getTimestampContainer().setLayoutParams(valueanimator);
            valueanimator = holder.getTimestampView();
            if (end <= start)
            {
                f1 = 1.0F - f1;
            }
            valueanimator.setAlpha(f1);
        }

        public ExpansionUpdateListener(j j1, int i, int k)
        {
            this$0 = ChatTimeStampAnimator.this;
            super();
            holder = j1;
            start = i;
            end = k;
        }
    }


    public ChatTimeStampAnimator()
    {
    }

    private void cancelPreviousAnimators(View view)
    {
        view = getAnimatorFromView(view);
        if (view != null && view.isRunning())
        {
            view.cancel();
        }
    }

    private Animator getAnimatorFromView(View view)
    {
        view = ((View) (view.getTag()));
        if (view instanceof Animator)
        {
            return (Animator)view;
        } else
        {
            return null;
        }
    }

    private void setAnimatorOnView(View view, Animator animator)
    {
        view.setTag(animator);
    }

    private void toggleAuthorTextTimestamp(j j1, boolean flag)
    {
        TextView textview;
        PropertyAnimationUtil propertyanimationutil;
label0:
        {
            if (j1 instanceof f)
            {
                textview = j1.getTimestampView();
                j1 = ((f)j1).authorText;
                propertyanimationutil = new PropertyAnimationUtil();
                if (!flag)
                {
                    break label0;
                }
                propertyanimationutil.a(j1, 8);
                PropertyAnimationUtil.c(textview);
            }
            return;
        }
        propertyanimationutil.a(textview, 8);
        PropertyAnimationUtil.c(j1);
    }

    public Animator buildAnimator(j j1)
    {
        Object obj;
        if (j1.getTimestampContainer() != null)
        {
            obj = (View)j1.getTimestampContainer().getParent();
        } else
        {
            obj = null;
        }
        if (obj == null)
        {
            return null;
        } else
        {
            int i = j1.getTimestampContainer().getMeasuredHeight();
            j1.getTimestampContainer().measure(android.view.View.MeasureSpec.makeMeasureSpec(((View) (obj)).getMeasuredWidth(), 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            int k = j1.getTimestampContainer().getMeasuredHeight();
            obj = ValueAnimator.ofFloat(new float[] {
                0.0F, 1.0F
            });
            ((ValueAnimator) (obj)).addUpdateListener(new ExpansionUpdateListener(j1, i, k));
            ((ValueAnimator) (obj)).addListener(new ExpansionAnimationListener(j1));
            ((ValueAnimator) (obj)).setInterpolator(new AccelerateDecelerateInterpolator());
            ((ValueAnimator) (obj)).setDuration(200L);
            return ((Animator) (obj));
        }
    }

    public void closeTimestampView(j j1)
    {
        if (j1 != null)
        {
            final TextView expandView = j1.getTimestampView();
            if (expandView != null)
            {
                cancelPreviousAnimators(expandView);
                expandView.setVisibility(8);
                j1 = buildAnimator(j1);
                if (j1 != null)
                {
                    expandView.setVisibility(0);
                    j1.addListener(new AnimatorListenerAdapter() {

                        final ChatTimeStampAnimator this$0;
                        final TextView val$expandView;

                        public final void onAnimationEnd(Animator animator)
                        {
                            expandView.setVisibility(8);
                            setAnimatorOnView(expandView, null);
                        }

            
            {
                this$0 = ChatTimeStampAnimator.this;
                expandView = textview;
                super();
            }
                    });
                    j1.start();
                    setAnimatorOnView(expandView, j1);
                }
            }
        }
    }

    public void expandTimestampView(j j1)
    {
        if (j1 != null)
        {
            final TextView expandView = j1.getTimestampView();
            if (expandView != null)
            {
                cancelPreviousAnimators(expandView);
                expandView.setVisibility(0);
                j1 = buildAnimator(j1);
                if (j1 != null)
                {
                    j1.addListener(new AnimatorListenerAdapter() {

                        final ChatTimeStampAnimator this$0;
                        final TextView val$expandView;

                        public final void onAnimationEnd(Animator animator)
                        {
                            setAnimatorOnView(expandView, null);
                        }

            
            {
                this$0 = ChatTimeStampAnimator.this;
                expandView = textview;
                super();
            }
                    });
                    j1.start();
                    setAnimatorOnView(expandView, j1);
                }
            }
        }
    }

    public void toggleTimestampView(j j1, boolean flag, boolean flag1)
    {
        if (flag)
        {
            if (flag1 && !j1.isChained())
            {
                toggleAuthorTextTimestamp(j1, true);
                return;
            } else
            {
                expandTimestampView(j1);
                return;
            }
        }
        if (flag1 && !j1.isChained())
        {
            toggleAuthorTextTimestamp(j1, false);
            return;
        } else
        {
            closeTimestampView(j1);
            return;
        }
    }

}
