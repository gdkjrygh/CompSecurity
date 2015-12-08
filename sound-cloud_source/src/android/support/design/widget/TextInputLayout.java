// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AccelerateInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//            CollapsingTextHelper, AnimationUtils, ViewUtils, ValueAnimatorCompat

public class TextInputLayout extends LinearLayout
{
    private class TextInputAccessibilityDelegate extends AccessibilityDelegateCompat
    {

        final TextInputLayout this$0;

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            super.onInitializeAccessibilityEvent(view, accessibilityevent);
            accessibilityevent.setClassName(android/support/design/widget/TextInputLayout.getSimpleName());
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
            accessibilitynodeinfocompat.setClassName(android/support/design/widget/TextInputLayout.getSimpleName());
            view = mCollapsingTextHelper.getText();
            if (!TextUtils.isEmpty(view))
            {
                accessibilitynodeinfocompat.setText(view);
            }
            if (mEditText != null)
            {
                accessibilitynodeinfocompat.setLabelFor(mEditText);
            }
            if (mErrorView != null)
            {
                view = mErrorView.getText();
            } else
            {
                view = null;
            }
            if (!TextUtils.isEmpty(view))
            {
                accessibilitynodeinfocompat.setContentInvalid(true);
                accessibilitynodeinfocompat.setError(view);
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            super.onPopulateAccessibilityEvent(view, accessibilityevent);
            view = mCollapsingTextHelper.getText();
            if (!TextUtils.isEmpty(view))
            {
                accessibilityevent.getText().add(view);
            }
        }

        private TextInputAccessibilityDelegate()
        {
            this$0 = TextInputLayout.this;
            super();
        }

        TextInputAccessibilityDelegate(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final int ANIMATION_DURATION = 200;
    private static final int MSG_UPDATE_LABEL = 0;
    private ValueAnimatorCompat mAnimator;
    private final CollapsingTextHelper mCollapsingTextHelper;
    private int mDefaultTextColor;
    private EditText mEditText;
    private boolean mErrorEnabled;
    private int mErrorTextAppearance;
    private TextView mErrorView;
    private int mFocusedTextColor;
    private final Handler mHandler;
    private CharSequence mHint;

    public TextInputLayout(Context context)
    {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setOrientation(1);
        setWillNotDraw(false);
        mCollapsingTextHelper = new CollapsingTextHelper(this);
        mHandler = new Handler(new _cls1());
        mCollapsingTextHelper.setTextSizeInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        mCollapsingTextHelper.setPositionInterpolator(new AccelerateInterpolator());
        mCollapsingTextHelper.setCollapsedTextVerticalGravity(48);
        context = context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.TextInputLayout, 0, android.support.design.R.style.Widget_Design_TextInputLayout);
        mHint = context.getText(android.support.design.R.styleable.TextInputLayout_android_hint);
        int i = context.getResourceId(android.support.design.R.styleable.TextInputLayout_hintTextAppearance, -1);
        if (i != -1)
        {
            mCollapsingTextHelper.setCollapsedTextAppearance(i);
        }
        mErrorTextAppearance = context.getResourceId(android.support.design.R.styleable.TextInputLayout_errorTextAppearance, 0);
        boolean flag = context.getBoolean(android.support.design.R.styleable.TextInputLayout_errorEnabled, false);
        mDefaultTextColor = getThemeAttrColor(0x101009a);
        mFocusedTextColor = mCollapsingTextHelper.getCollapsedTextColor();
        mCollapsingTextHelper.setCollapsedTextColor(mDefaultTextColor);
        mCollapsingTextHelper.setExpandedTextColor(mDefaultTextColor);
        context.recycle();
        if (flag)
        {
            setErrorEnabled(true);
        }
        if (ViewCompat.getImportantForAccessibility(this) == 0)
        {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        ViewCompat.setAccessibilityDelegate(this, new TextInputAccessibilityDelegate(null));
    }

    private void animateToExpansionFraction(float f)
    {
        if (mAnimator != null) goto _L2; else goto _L1
_L1:
        mAnimator = ViewUtils.createAnimator();
        mAnimator.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        mAnimator.setDuration(200);
        mAnimator.setUpdateListener(new _cls5());
_L4:
        mAnimator.setFloatValues(mCollapsingTextHelper.getExpansionFraction(), f);
        mAnimator.start();
        return;
_L2:
        if (mAnimator.isRunning())
        {
            mAnimator.cancel();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void collapseHint(boolean flag)
    {
        if (flag)
        {
            animateToExpansionFraction(1.0F);
            return;
        } else
        {
            mCollapsingTextHelper.setExpansionFraction(1.0F);
            return;
        }
    }

    private void expandHint(boolean flag)
    {
        if (flag)
        {
            animateToExpansionFraction(0.0F);
            return;
        } else
        {
            mCollapsingTextHelper.setExpansionFraction(0.0F);
            return;
        }
    }

    private int getThemeAttrColor(int i)
    {
        TypedValue typedvalue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(i, typedvalue, true))
        {
            return typedvalue.data;
        } else
        {
            return -65281;
        }
    }

    private android.widget.LinearLayout.LayoutParams setEditText(EditText edittext, android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (mEditText != null)
        {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        mEditText = edittext;
        mCollapsingTextHelper.setExpandedTextSize(mEditText.getTextSize());
        mEditText.addTextChangedListener(new _cls2());
        mDefaultTextColor = mEditText.getHintTextColors().getDefaultColor();
        mEditText.setOnFocusChangeListener(new _cls3());
        if (TextUtils.isEmpty(mHint))
        {
            setHint(mEditText.getHint());
            mEditText.setHint(null);
        }
        if (mErrorView != null)
        {
            ViewCompat.setPaddingRelative(mErrorView, ViewCompat.getPaddingStart(mEditText), 0, ViewCompat.getPaddingEnd(mEditText), mEditText.getPaddingBottom());
        }
        updateLabelVisibility(false);
        edittext = new android.widget.LinearLayout.LayoutParams(layoutparams);
        layoutparams = new Paint();
        layoutparams.setTextSize(mCollapsingTextHelper.getExpandedTextSize());
        edittext.topMargin = (int)(-layoutparams.ascent());
        return edittext;
    }

    private void updateLabelVisibility(boolean flag)
    {
        CollapsingTextHelper collapsingtexthelper;
        boolean flag1;
        int i;
        boolean flag2;
        if (!TextUtils.isEmpty(mEditText.getText()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = mEditText.isFocused();
        mCollapsingTextHelper.setExpandedTextColor(mDefaultTextColor);
        collapsingtexthelper = mCollapsingTextHelper;
        if (flag2)
        {
            i = mFocusedTextColor;
        } else
        {
            i = mDefaultTextColor;
        }
        collapsingtexthelper.setCollapsedTextColor(i);
        if (flag1 || flag2)
        {
            collapseHint(flag);
            return;
        } else
        {
            expandHint(flag);
            return;
        }
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (view instanceof EditText)
        {
            super.addView(view, 0, setEditText((EditText)view, layoutparams));
            return;
        } else
        {
            super.addView(view, i, layoutparams);
            return;
        }
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        mCollapsingTextHelper.draw(canvas);
    }

    public EditText getEditText()
    {
        return mEditText;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (mEditText != null)
        {
            i = mEditText.getLeft() + mEditText.getCompoundPaddingLeft();
            k = mEditText.getRight() - mEditText.getCompoundPaddingRight();
            mCollapsingTextHelper.setExpandedBounds(i, mEditText.getTop() + mEditText.getCompoundPaddingTop(), k, mEditText.getBottom() - mEditText.getCompoundPaddingBottom());
            mCollapsingTextHelper.setCollapsedBounds(i, getPaddingTop(), k, l - j - getPaddingBottom());
            mCollapsingTextHelper.recalculate();
        }
    }

    public void setError(CharSequence charsequence)
    {
        if (!mErrorEnabled)
        {
            if (TextUtils.isEmpty(charsequence))
            {
                return;
            }
            setErrorEnabled(true);
        }
        if (TextUtils.isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        mErrorView.setText(charsequence);
        mErrorView.setVisibility(0);
        ViewCompat.setAlpha(mErrorView, 0.0F);
        ViewCompat.animate(mErrorView).alpha(1.0F).setDuration(200L).setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR).setListener(null).start();
_L4:
        sendAccessibilityEvent(2048);
        return;
_L2:
        if (mErrorView.getVisibility() == 0)
        {
            ViewCompat.animate(mErrorView).alpha(0.0F).setDuration(200L).setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR).setListener(new _cls4()).start();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setErrorEnabled(boolean flag)
    {
        if (mErrorEnabled != flag)
        {
            if (flag)
            {
                mErrorView = new TextView(getContext());
                mErrorView.setTextAppearance(getContext(), mErrorTextAppearance);
                mErrorView.setVisibility(4);
                addView(mErrorView);
                if (mEditText != null)
                {
                    ViewCompat.setPaddingRelative(mErrorView, ViewCompat.getPaddingStart(mEditText), 0, ViewCompat.getPaddingEnd(mEditText), mEditText.getPaddingBottom());
                }
            } else
            {
                removeView(mErrorView);
                mErrorView = null;
            }
            mErrorEnabled = flag;
        }
    }

    public void setHint(CharSequence charsequence)
    {
        mHint = charsequence;
        mCollapsingTextHelper.setText(charsequence);
        sendAccessibilityEvent(2048);
    }






    private class _cls1
        implements android.os.Handler.Callback
    {

        final TextInputLayout this$0;

        public boolean handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return false;

            case 0: // '\0'
                updateLabelVisibility(true);
                break;
            }
            return true;
        }

        _cls1()
        {
            this$0 = TextInputLayout.this;
            super();
        }
    }


    private class _cls5
        implements ValueAnimatorCompat.AnimatorUpdateListener
    {

        final TextInputLayout this$0;

        public void onAnimationUpdate(ValueAnimatorCompat valueanimatorcompat)
        {
            mCollapsingTextHelper.setExpansionFraction(valueanimatorcompat.getAnimatedFloatValue());
        }

        _cls5()
        {
            this$0 = TextInputLayout.this;
            super();
        }
    }


    private class _cls2
        implements TextWatcher
    {

        final TextInputLayout this$0;

        public void afterTextChanged(Editable editable)
        {
            mHandler.sendEmptyMessage(0);
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        _cls2()
        {
            this$0 = TextInputLayout.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnFocusChangeListener
    {

        final TextInputLayout this$0;

        public void onFocusChange(View view, boolean flag)
        {
            mHandler.sendEmptyMessage(0);
        }

        _cls3()
        {
            this$0 = TextInputLayout.this;
            super();
        }
    }


    private class _cls4 extends ViewPropertyAnimatorListenerAdapter
    {

        final TextInputLayout this$0;

        public void onAnimationEnd(View view)
        {
            mErrorView.setText(null);
            mErrorView.setVisibility(4);
        }

        _cls4()
        {
            this$0 = TextInputLayout.this;
            super();
        }
    }

}
