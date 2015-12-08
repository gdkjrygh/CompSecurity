// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.cardform.view;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Looper;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package com.braintreepayments.cardform.view:
//            ErrorEditText

public abstract class FloatingLabelEditText extends ErrorEditText
    implements TextWatcher, android.view.View.OnFocusChangeListener
{

    private static final int ANIMATION_DURATION_MILLIS = 300;
    private ValueAnimator mAlphaAnimator;
    private int mAnimatedHintColor;
    private float mAnimatedHintHeight;
    private ValueAnimator mFocusColorAnimator;
    private int mHintAlpha;
    private ValueAnimator mHintAnimator;
    private TextPaint mHintPaint;
    private float mHorizontalTextOffset;
    private ValueAnimator mInactiveColorAnimator;
    private android.view.View.OnFocusChangeListener mOnFocusChangeListener;
    private OnTextChangedListener mOnTextChangedListener;
    private int mPreviousTextLength;
    protected boolean mRightToLeftLanguage;

    public FloatingLabelEditText(Context context)
    {
        super(context);
        mHintPaint = new TextPaint();
        mAnimatedHintHeight = -1F;
        init();
    }

    public FloatingLabelEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mHintPaint = new TextPaint();
        mAnimatedHintHeight = -1F;
        init();
    }

    public FloatingLabelEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mHintPaint = new TextPaint();
        mAnimatedHintHeight = -1F;
        init();
    }

    private void init()
    {
        mRightToLeftLanguage = isRightToLeftLanguage();
        addTextChangedListener(this);
        mPreviousTextLength = getText().length();
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            setupAnimations();
        }
    }

    private boolean isRightToLeftLanguage()
    {
        return android.os.Build.VERSION.SDK_INT >= 17 && getResources().getConfiguration().getLayoutDirection() == 1;
    }

    private void setupAnimations()
    {
        Object obj = getResources();
        mHorizontalTextOffset = ((Resources) (obj)).getDimension(com.braintreepayments.cardform.R.dimen.bt_floating_edit_text_horizontal_offset);
        float f = getTextSize();
        mHintAnimator = ValueAnimator.ofFloat(new float[] {
            1.75F * f, f
        });
        mHintAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final FloatingLabelEditText this$0;

            public void onAnimationUpdate(ValueAnimator valueanimator)
            {
                mAnimatedHintHeight = ((Float)valueanimator.getAnimatedValue()).floatValue();
                invalidate();
            }

            
            {
                this$0 = FloatingLabelEditText.this;
                super();
            }
        });
        mHintAnimator.setDuration(300L);
        int i = ((Resources) (obj)).getColor(com.braintreepayments.cardform.R.color.bt_light_gray);
        int j = ((Resources) (obj)).getColor(com.braintreepayments.cardform.R.color.bt_blue);
        obj = new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final FloatingLabelEditText this$0;

            public void onAnimationUpdate(ValueAnimator valueanimator)
            {
                mAnimatedHintColor = ((Integer)valueanimator.getAnimatedValue()).intValue();
                invalidate();
            }

            
            {
                this$0 = FloatingLabelEditText.this;
                super();
            }
        };
        mFocusColorAnimator = ValueAnimator.ofInt(new int[] {
            i, j
        });
        mFocusColorAnimator.setEvaluator(new ArgbEvaluator());
        mFocusColorAnimator.addUpdateListener(((android.animation.ValueAnimator.AnimatorUpdateListener) (obj)));
        mFocusColorAnimator.setDuration(300L);
        mInactiveColorAnimator = ValueAnimator.ofInt(new int[] {
            j, i
        });
        mInactiveColorAnimator.setEvaluator(new ArgbEvaluator());
        mInactiveColorAnimator.addUpdateListener(((android.animation.ValueAnimator.AnimatorUpdateListener) (obj)));
        mInactiveColorAnimator.setDuration(300L);
        mAlphaAnimator = ValueAnimator.ofInt(new int[] {
            0, 255
        });
        mAlphaAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final FloatingLabelEditText this$0;

            public void onAnimationUpdate(ValueAnimator valueanimator)
            {
                mHintAlpha = ((Integer)valueanimator.getAnimatedValue()).intValue();
                invalidate();
            }

            
            {
                this$0 = FloatingLabelEditText.this;
                super();
            }
        });
        setOnFocusChangeListener(this);
    }

    public void afterTextChanged(Editable editable)
    {
        if (mOnTextChangedListener != null)
        {
            mOnTextChangedListener.onTextChanged(editable);
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void focusNext()
    {
        View view;
        if (getImeActionId() != 2)
        {
            if ((view = focusSearch(2)) != null)
            {
                view.requestFocus();
                return;
            }
        }
    }

    protected void handleTextColorOnFocus(boolean flag)
    {
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 11 && Looper.myLooper() != null)
            {
                if (!flag)
                {
                    break label0;
                }
                mFocusColorAnimator.start();
            }
            return;
        }
        mInactiveColorAnimator.start();
    }

    public abstract boolean isValid();

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (getText().length() > 0)
        {
            mHintPaint.setColor(mAnimatedHintColor);
            mHintPaint.setTextSize((getPaint().getTextSize() * 2.0F) / 3F);
            mHintPaint.setAlpha(mHintAlpha);
            canvas.drawText(getHint().toString(), mHorizontalTextOffset, mAnimatedHintHeight, mHintPaint);
        }
    }

    public void onFocusChange(View view, boolean flag)
    {
        handleTextColorOnFocus(flag);
        setErrorOnFocusChange(flag);
        if (mOnFocusChangeListener != null)
        {
            mOnFocusChangeListener.onFocusChange(view, flag);
        }
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        super.onTextChanged(charsequence, i, j, k);
        if (android.os.Build.VERSION.SDK_INT >= 14 && Looper.myLooper() != null && mPreviousTextLength == 0 && charsequence.length() > 0 && !mHintAnimator.isStarted())
        {
            mHintAnimator.start();
            mFocusColorAnimator.start();
            mAlphaAnimator.start();
        }
        mPreviousTextLength = charsequence.length();
    }

    protected void setErrorOnFocusChange(boolean flag)
    {
        if (!flag && !isValid())
        {
            setError();
        }
    }

    public void setFocusChangeListener(android.view.View.OnFocusChangeListener onfocuschangelistener)
    {
        mOnFocusChangeListener = onfocuschangelistener;
    }

    public void setTextChangedListener(OnTextChangedListener ontextchangedlistener)
    {
        mOnTextChangedListener = ontextchangedlistener;
    }

    public void validate()
    {
        if (isValid())
        {
            clearError();
            return;
        } else
        {
            setError();
            return;
        }
    }


/*
    static float access$002(FloatingLabelEditText floatinglabeledittext, float f)
    {
        floatinglabeledittext.mAnimatedHintHeight = f;
        return f;
    }

*/


/*
    static int access$102(FloatingLabelEditText floatinglabeledittext, int i)
    {
        floatinglabeledittext.mAnimatedHintColor = i;
        return i;
    }

*/


/*
    static int access$202(FloatingLabelEditText floatinglabeledittext, int i)
    {
        floatinglabeledittext.mHintAlpha = i;
        return i;
    }

*/

    private class OnTextChangedListener
    {

        public abstract void onTextChanged(Editable editable);
    }

}
