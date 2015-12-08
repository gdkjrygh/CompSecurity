// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.tooltips;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.SimpleAnimationListener;
import me.lyft.android.domain.tooltips.Tooltip;
import me.lyft.android.logging.L;
import me.lyft.android.utils.ViewExtensions;
import rx.Observable;
import rx.functions.Action1;

public class TooltipView extends LinearLayout
{

    private static final int HINT_BANNER_BOBBING_ANIMATION_DURATION = 1200;
    private static final int HINT_BANNER_IN_ANIMATION_DURATION = 300;
    private AnimatorSet animationSet;
    private float margin;
    View tooltipBottomArrow;
    TextView tooltipText;
    View tooltipTopArrow;

    public TooltipView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private void animateIn(float f, float f1)
    {
        if (animationSet != null)
        {
            return;
        } else
        {
            animationSet = new AnimatorSet();
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(this, "scaleX", new float[] {
                0.0F, 1.0F
            });
            objectanimator.setDuration(300L);
            ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(this, "scaleY", new float[] {
                0.0F, 1.0F
            });
            objectanimator1.setDuration(300L);
            setPivotX(f);
            setPivotY(f1);
            animationSet.play(objectanimator).with(objectanimator1);
            animationSet.start();
            return;
        }
    }

    private void animateOut()
    {
        if (animationSet != null)
        {
            animationSet.cancel();
        }
        animationSet = new AnimatorSet();
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(this, "scaleX", new float[] {
            1.0F, 0.0F
        });
        objectanimator.setDuration(300L);
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(this, "scaleY", new float[] {
            1.0F, 0.0F
        });
        objectanimator1.setDuration(300L);
        animationSet.play(objectanimator).with(objectanimator1);
        animationSet.addListener(new SimpleAnimationListener() {

            final TooltipView this$0;

            public void onAnimationEnd(Animator animator)
            {
                if (getParent() != null)
                {
                    ((ViewGroup)getParent()).removeView(TooltipView.this);
                }
            }

            
            {
                this$0 = TooltipView.this;
                super();
            }
        });
        animationSet.start();
    }

    private int getAnchorRelativeX(View view)
    {
        int ai[] = new int[2];
        int ai1[] = new int[2];
        view.getLocationOnScreen(ai);
        ((ViewGroup)getParent()).getLocationOnScreen(ai1);
        return ai[0] - ai1[0];
    }

    private int getAnchorRelativeY(View view)
    {
        int ai[] = new int[2];
        int ai1[] = new int[2];
        view.getLocationOnScreen(ai);
        ((ViewGroup)getParent()).getLocationOnScreen(ai1);
        return ai[1] - ai1[1];
    }

    private float getTooltipArrowPositionX(View view, View view1, float f)
    {
        return ((float)getAnchorRelativeX(view) + (float)view.getWidth() / 2.0F) - (float)view1.getWidth() / 2.0F - f;
    }

    private float getTooltipPositionX(View view)
    {
        float f = ((float)getAnchorRelativeX(view) + (float)view.getWidth() / 2.0F) - (float)getWidth() / 2.0F;
        float f1 = ((View)getParent()).getWidth();
        f1 = ((float)getWidth() + f) - f1;
        if (f1 > 0.0F)
        {
            f -= f1;
        }
        float f2 = 0.0F - f;
        f1 = f;
        if (f2 > 0.0F)
        {
            f1 = f + f2;
        }
        return f1;
    }

    private void positionAbove(final View anchorView)
    {
        tooltipBottomArrow.setVisibility(0);
        tooltipTopArrow.setVisibility(4);
        ViewExtensions.onLoadedObservable(this).subscribe(new Action1() {

            final TooltipView this$0;
            final View val$anchorView;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                if (getParent() == null)
                {
                    return;
                } else
                {
                    setVisibility(0);
                    setX(getTooltipPositionX(anchorView));
                    tooltipBottomArrow.setX(getTooltipArrowPositionX(anchorView, tooltipBottomArrow, getX()));
                    setY(getAnchorRelativeY(anchorView) - getHeight());
                    animateIn(tooltipBottomArrow.getX(), tooltipBottomArrow.getY());
                    return;
                }
            }

            
            {
                this$0 = TooltipView.this;
                anchorView = view;
                super();
            }
        });
    }

    private void positionBelow(final View anchorView)
    {
        tooltipTopArrow.setVisibility(0);
        tooltipBottomArrow.setVisibility(4);
        ViewExtensions.onLoadedObservable(this).subscribe(new Action1() {

            final TooltipView this$0;
            final View val$anchorView;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                if (getParent() == null)
                {
                    return;
                } else
                {
                    setVisibility(0);
                    setX(getTooltipPositionX(anchorView));
                    tooltipTopArrow.setX(getTooltipArrowPositionX(anchorView, tooltipTopArrow, getX()));
                    setY(getAnchorRelativeY(anchorView) + anchorView.getHeight());
                    animateIn(tooltipTopArrow.getX(), tooltipTopArrow.getY());
                    return;
                }
            }

            
            {
                this$0 = TooltipView.this;
                anchorView = view;
                super();
            }
        });
    }

    private void positionInCenter()
    {
        setVisibility(0);
        tooltipTopArrow.setVisibility(4);
        tooltipBottomArrow.setVisibility(4);
        ((android.widget.FrameLayout.LayoutParams)getLayoutParams()).gravity = 17;
    }

    private void positionTooltip(View view, int i)
    {
        if (view.getWidth() == 0 || view.getHeight() == 0)
        {
            setVisibility(4);
            return;
        }
        if (i == 48)
        {
            positionAbove(view);
            return;
        } else
        {
            positionBelow(view);
            return;
        }
    }

    private void setBackgroundColorForDrawable(View view, int i)
    {
        ((GradientDrawable)((RotateDrawable)((LayerDrawable)view.getBackground()).getDrawable(0)).getDrawable()).setColor(i);
    }

    private void updateBackgroundColor(String s)
    {
        if (s == null)
        {
            return;
        }
        try
        {
            int i = Color.parseColor(s);
            setBackgroundColorForDrawable(tooltipTopArrow, i);
            setBackgroundColorForDrawable(tooltipBottomArrow, i);
            setBackgroundColorForDrawable(tooltipText, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            L.e(s.getMessage(), new Object[0]);
        }
    }

    public void hide()
    {
        animateOut();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

    public void show(Tooltip tooltip, View view, final int gravity)
    {
        margin = getContext().getResources().getDimension(0x7f08007e);
        tooltipText.setText(tooltip.getText());
        updateBackgroundColor(tooltip.getBackgroundColor());
        setOnClickListener(new android.view.View.OnClickListener() {

            final TooltipView this$0;

            public void onClick(View view1)
            {
                hide();
            }

            
            {
                this$0 = TooltipView.this;
                super();
            }
        });
        if (view == null)
        {
            positionInCenter();
            return;
        } else
        {
            view.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() {

                final TooltipView this$0;
                final int val$gravity;

                public void onLayoutChange(View view1, int i, int j, int k, int l, int i1, int j1, 
                        int k1, int l1)
                {
                    if (getParent() == null)
                    {
                        view1.removeOnLayoutChangeListener(this);
                    }
                    positionTooltip(view1, gravity);
                }

            
            {
                this$0 = TooltipView.this;
                gravity = i;
                super();
            }
            });
            positionTooltip(view, gravity);
            return;
        }
    }





}
