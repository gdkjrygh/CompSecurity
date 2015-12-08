// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.tooltip;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.ObjectAnimator;
import com.nineoldandroids.view.ViewHelper;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.hmobile.tooltip:
//            ToolTip

public class ToolTipView extends LinearLayout
    implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnClickListener
{
    public static interface OnToolTipViewClickedListener
    {

        public abstract void onToolTipViewClicked(ToolTipView tooltipview);
    }


    private View mBottomFrame;
    private ImageView mBottomPointerView;
    private ViewGroup mContentHolder;
    private boolean mDimensionsKnown;
    private OnToolTipViewClickedListener mListener;
    private int mRelativeMasterViewX;
    private int mRelativeMasterViewY;
    private View mShadowView;
    private ToolTip mToolTip;
    private TextView mToolTipTV;
    private View mTopFrame;
    private ImageView mTopPointerView;
    private View mView;
    private int mWidth;

    public ToolTipView(Context context)
    {
        super(context);
        init();
    }

    private void applyToolTipPosition()
    {
        final float fToolTipViewY;
        Object obj;
        int ai[] = new int[2];
        int ai1[] = new int[2];
        Rect rect = new Rect();
        mView.getLocationOnScreen(ai);
        mView.getWindowVisibleDisplayFrame(rect);
        ((View)getParent()).getLocationOnScreen(ai1);
        int j = mView.getWidth();
        int i = mView.getHeight();
        mRelativeMasterViewX = ai[0] - ai1[0];
        mRelativeMasterViewY = ai[1] - ai1[1];
        j = mRelativeMasterViewX + j / 2;
        fToolTipViewY = mRelativeMasterViewY - getHeight();
        float f = mRelativeMasterViewY + i;
        float f1 = Math.max(0, j - mWidth / 2);
        final float fToolTipViewX = f1;
        if ((float)mWidth + f1 > (float)rect.right)
        {
            fToolTipViewX = rect.right - mWidth;
        }
        setX(fToolTipViewX);
        setPointerCenterX(j);
        boolean flag;
        if (fToolTipViewY < 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            obj = mTopPointerView;
            AnimatorSet animatorset;
            int k;
            if (flag)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            ViewHelper.setAlpha(((View) (obj)), k);
            obj = mBottomPointerView;
            if (flag)
            {
                k = 0;
            } else
            {
                k = 1;
            }
            ViewHelper.setAlpha(((View) (obj)), k);
        } else
        {
            obj = mTopPointerView;
            int l;
            if (flag)
            {
                l = 0;
            } else
            {
                l = 8;
            }
            ((ImageView) (obj)).setVisibility(l);
            obj = mBottomPointerView;
            if (flag)
            {
                l = 8;
            } else
            {
                l = 0;
            }
            ((ImageView) (obj)).setVisibility(l);
        }
        if (flag)
        {
            fToolTipViewY = f;
        }
        obj = new ArrayList();
        if (mToolTip.getAnimationType() != 101) goto _L2; else goto _L1
_L1:
        ((List) (obj)).add(ObjectAnimator.ofFloat(this, "translationY", new float[] {
            (float)((mRelativeMasterViewY + mView.getHeight() / 2) - getHeight() / 2), fToolTipViewY
        }));
        ((List) (obj)).add(ObjectAnimator.ofFloat(this, "translationX", new float[] {
            (float)((mRelativeMasterViewX + mView.getWidth() / 2) - mWidth / 2), fToolTipViewX
        }));
_L4:
        ((List) (obj)).add(ObjectAnimator.ofFloat(this, "scaleX", new float[] {
            0.0F, 1.0F
        }));
        ((List) (obj)).add(ObjectAnimator.ofFloat(this, "scaleY", new float[] {
            0.0F, 1.0F
        }));
        ((List) (obj)).add(ObjectAnimator.ofFloat(this, "alpha", new float[] {
            0.0F, 1.0F
        }));
        animatorset = new AnimatorSet();
        animatorset.playTogether(((java.util.Collection) (obj)));
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            animatorset.addListener(new com.nineoldandroids.animation.Animator.AnimatorListener() {

                final ToolTipView this$0;
                private final float val$fToolTipViewX;
                private final float val$fToolTipViewY;

                public void onAnimationCancel(Animator animator)
                {
                }

                public void onAnimationEnd(Animator animator)
                {
                    animator = (android.widget.RelativeLayout.LayoutParams)getLayoutParams();
                    animator.leftMargin = (int)fToolTipViewX;
                    animator.topMargin = (int)fToolTipViewY;
                    setX(0.0F);
                    setY(0.0F);
                    setLayoutParams(animator);
                }

                public void onAnimationRepeat(Animator animator)
                {
                }

                public void onAnimationStart(Animator animator)
                {
                }

            
            {
                this$0 = ToolTipView.this;
                fToolTipViewX = f;
                fToolTipViewY = f1;
                super();
            }
            });
        }
        animatorset.start();
        return;
_L2:
        if (mToolTip.getAnimationType() == 102)
        {
            ((List) (obj)).add(ObjectAnimator.ofFloat(this, "translationY", new float[] {
                0.0F, fToolTipViewY
            }));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void init()
    {
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(0x7f030034, this, true);
        mTopPointerView = (ImageView)findViewById(0x7f0e012f);
        mTopFrame = findViewById(0x7f0e012e);
        mContentHolder = (ViewGroup)findViewById(0x7f0e0130);
        mToolTipTV = (TextView)findViewById(0x7f0e0131);
        mBottomFrame = findViewById(0x7f0e0133);
        mBottomPointerView = (ImageView)findViewById(0x7f0e0134);
        mShadowView = findViewById(0x7f0e0132);
        setOnClickListener(this);
        getViewTreeObserver().addOnPreDrawListener(this);
    }

    private void setContentView(View view)
    {
        mContentHolder.removeAllViews();
        mContentHolder.addView(view);
    }

    public float getX()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return super.getX();
        } else
        {
            return ViewHelper.getX(this);
        }
    }

    public float getY()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return super.getY();
        } else
        {
            return ViewHelper.getY(this);
        }
    }

    public void onClick(View view)
    {
        if (mListener != null)
        {
            mListener.onToolTipViewClicked(this);
        }
    }

    public boolean onPreDraw()
    {
        getViewTreeObserver().removeOnPreDrawListener(this);
        mDimensionsKnown = true;
        mWidth = mContentHolder.getWidth();
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)getLayoutParams();
        layoutparams.width = mWidth;
        setLayoutParams(layoutparams);
        if (mToolTip != null)
        {
            applyToolTipPosition();
        }
        return true;
    }

    public void remove()
    {
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)getLayoutParams();
            setX(layoutparams.leftMargin);
            setY(layoutparams.topMargin);
            layoutparams.leftMargin = 0;
            layoutparams.topMargin = 0;
            setLayoutParams(layoutparams);
        }
        ArrayList arraylist = new ArrayList();
        AnimatorSet animatorset;
        if (mToolTip.getAnimationType() == 101)
        {
            arraylist.add(ObjectAnimator.ofFloat(this, "translationY", new float[] {
                getY(), (float)((mRelativeMasterViewY + mView.getHeight() / 2) - getHeight() / 2)
            }));
            arraylist.add(ObjectAnimator.ofFloat(this, "translationX", new float[] {
                getX(), (float)((mRelativeMasterViewX + mView.getWidth() / 2) - mWidth / 2)
            }));
        } else
        {
            arraylist.add(ObjectAnimator.ofFloat(this, "translationY", new float[] {
                getY(), 0.0F
            }));
        }
        arraylist.add(ObjectAnimator.ofFloat(this, "scaleX", new float[] {
            1.0F, 0.0F
        }));
        arraylist.add(ObjectAnimator.ofFloat(this, "scaleY", new float[] {
            1.0F, 0.0F
        }));
        arraylist.add(ObjectAnimator.ofFloat(this, "alpha", new float[] {
            1.0F, 0.0F
        }));
        animatorset = new AnimatorSet();
        animatorset.playTogether(arraylist);
        animatorset.addListener(new com.nineoldandroids.animation.Animator.AnimatorListener() {

            final ToolTipView this$0;

            public void onAnimationCancel(Animator animator)
            {
            }

            public void onAnimationEnd(Animator animator)
            {
                if (getParent() != null)
                {
                    ((ViewGroup)getParent()).removeView(ToolTipView.this);
                }
            }

            public void onAnimationRepeat(Animator animator)
            {
            }

            public void onAnimationStart(Animator animator)
            {
            }

            
            {
                this$0 = ToolTipView.this;
                super();
            }
        });
        animatorset.start();
    }

    public void setColor(int i)
    {
        mTopPointerView.setColorFilter(i, android.graphics.PorterDuff.Mode.MULTIPLY);
        mTopFrame.getBackground().setColorFilter(i, android.graphics.PorterDuff.Mode.MULTIPLY);
        mBottomPointerView.setColorFilter(i, android.graphics.PorterDuff.Mode.MULTIPLY);
        mBottomFrame.getBackground().setColorFilter(i, android.graphics.PorterDuff.Mode.MULTIPLY);
        mContentHolder.setBackgroundColor(i);
    }

    public void setOnToolTipViewClickedListener(OnToolTipViewClickedListener ontooltipviewclickedlistener)
    {
        mListener = ontooltipviewclickedlistener;
    }

    public void setPointerCenterX(int i)
    {
        int j = Math.max(mTopPointerView.getMeasuredWidth(), mBottomPointerView.getMeasuredWidth());
        ViewHelper.setX(mTopPointerView, (float)(i - j / 2) - getX());
        ViewHelper.setX(mBottomPointerView, (float)(i - j / 2) - getX());
    }

    public void setToolTip(ToolTip tooltip, View view)
    {
        mToolTip = tooltip;
        mView = view;
        if (mToolTip.getText() == null) goto _L2; else goto _L1
_L1:
        mToolTipTV.setText(mToolTip.getText());
_L4:
        if (mToolTip.getColor() != 0)
        {
            setColor(mToolTip.getColor());
        }
        if (mToolTip.getContentView() != null)
        {
            setContentView(mToolTip.getContentView());
        }
        if (!mToolTip.getShadow())
        {
            mShadowView.setVisibility(8);
        }
        if (mDimensionsKnown)
        {
            applyToolTipPosition();
        }
        return;
_L2:
        if (mToolTip.getTextResId() != 0)
        {
            mToolTipTV.setText(mToolTip.getTextResId());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setX(float f)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            super.setX(f);
            return;
        } else
        {
            ViewHelper.setX(this, f);
            return;
        }
    }

    public void setY(float f)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            super.setY(f);
            return;
        } else
        {
            ViewHelper.setY(this, f);
            return;
        }
    }
}
