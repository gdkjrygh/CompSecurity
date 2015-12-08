// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.widget.Space;
import android.support.v7.widget.TintManager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
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
//            CollapsingTextHelper, ThemeUtils, AnimationUtils, ViewUtils, 
//            ValueAnimatorCompat

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

    }


    private static final int ANIMATION_DURATION = 200;
    private static final int INVALID_MAX_LENGTH = -1;
    private ValueAnimatorCompat mAnimator;
    private final CollapsingTextHelper mCollapsingTextHelper;
    private boolean mCounterEnabled;
    private int mCounterMaxLength;
    private int mCounterOverflowTextAppearance;
    private boolean mCounterOverflowed;
    private int mCounterTextAppearance;
    private TextView mCounterView;
    private ColorStateList mDefaultTextColor;
    private EditText mEditText;
    private boolean mErrorEnabled;
    private boolean mErrorShown;
    private int mErrorTextAppearance;
    private TextView mErrorView;
    private ColorStateList mFocusedTextColor;
    private CharSequence mHint;
    private boolean mHintAnimationEnabled;
    private LinearLayout mIndicatorArea;
    private Paint mTmpPaint;

    public TextInputLayout(Context context)
    {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TextInputLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset);
        mCollapsingTextHelper = new CollapsingTextHelper(this);
        ThemeUtils.checkAppCompatTheme(context);
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        mCollapsingTextHelper.setTextSizeInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        mCollapsingTextHelper.setPositionInterpolator(new AccelerateInterpolator());
        mCollapsingTextHelper.setCollapsedTextGravity(0x800033);
        context = context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.TextInputLayout, i, android.support.design.R.style.Widget_Design_TextInputLayout);
        setHint(context.getText(android.support.design.R.styleable.TextInputLayout_android_hint));
        mHintAnimationEnabled = context.getBoolean(android.support.design.R.styleable.TextInputLayout_hintAnimationEnabled, true);
        if (context.hasValue(android.support.design.R.styleable.TextInputLayout_android_textColorHint))
        {
            attributeset = context.getColorStateList(android.support.design.R.styleable.TextInputLayout_android_textColorHint);
            mFocusedTextColor = attributeset;
            mDefaultTextColor = attributeset;
        }
        if (context.getResourceId(android.support.design.R.styleable.TextInputLayout_hintTextAppearance, -1) != -1)
        {
            setHintTextAppearance(context.getResourceId(android.support.design.R.styleable.TextInputLayout_hintTextAppearance, 0));
        }
        mErrorTextAppearance = context.getResourceId(android.support.design.R.styleable.TextInputLayout_errorTextAppearance, 0);
        boolean flag = context.getBoolean(android.support.design.R.styleable.TextInputLayout_errorEnabled, false);
        boolean flag1 = context.getBoolean(android.support.design.R.styleable.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(context.getInt(android.support.design.R.styleable.TextInputLayout_counterMaxLength, -1));
        mCounterTextAppearance = context.getResourceId(android.support.design.R.styleable.TextInputLayout_counterTextAppearance, 0);
        mCounterOverflowTextAppearance = context.getResourceId(android.support.design.R.styleable.TextInputLayout_counterOverflowTextAppearance, 0);
        context.recycle();
        setErrorEnabled(flag);
        setCounterEnabled(flag1);
        if (ViewCompat.getImportantForAccessibility(this) == 0)
        {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        ViewCompat.setAccessibilityDelegate(this, new TextInputAccessibilityDelegate());
    }

    private void addIndicator(TextView textview, int i)
    {
        if (mIndicatorArea == null)
        {
            mIndicatorArea = new LinearLayout(getContext());
            mIndicatorArea.setOrientation(0);
            addView(mIndicatorArea, -1, -2);
            Space space = new Space(getContext());
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(0, 0, 1.0F);
            mIndicatorArea.addView(space, layoutparams);
            if (mEditText != null)
            {
                adjustIndicatorPadding();
            }
        }
        mIndicatorArea.setVisibility(0);
        mIndicatorArea.addView(textview, i);
    }

    private void adjustIndicatorPadding()
    {
        ViewCompat.setPaddingRelative(mIndicatorArea, ViewCompat.getPaddingStart(mEditText), 0, ViewCompat.getPaddingEnd(mEditText), mEditText.getPaddingBottom());
    }

    private void animateToExpansionFraction(float f)
    {
        if (mCollapsingTextHelper.getExpansionFraction() == f)
        {
            return;
        }
        if (mAnimator == null)
        {
            mAnimator = ViewUtils.createAnimator();
            mAnimator.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
            mAnimator.setDuration(200);
            mAnimator.setUpdateListener(new ValueAnimatorCompat.AnimatorUpdateListener() {

                final TextInputLayout this$0;

                public void onAnimationUpdate(ValueAnimatorCompat valueanimatorcompat)
                {
                    mCollapsingTextHelper.setExpansionFraction(valueanimatorcompat.getAnimatedFloatValue());
                }

            
            {
                this$0 = TextInputLayout.this;
                super();
            }
            });
        }
        mAnimator.setFloatValues(mCollapsingTextHelper.getExpansionFraction(), f);
        mAnimator.start();
    }

    private static boolean arrayContains(int ai[], int i)
    {
        boolean flag1 = false;
        int k = ai.length;
        int j = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j < k)
                {
                    if (ai[j] != i)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            j++;
        } while (true);
    }

    private void collapseHint(boolean flag)
    {
        if (mAnimator != null && mAnimator.isRunning())
        {
            mAnimator.cancel();
        }
        if (flag && mHintAnimationEnabled)
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
        if (mAnimator != null && mAnimator.isRunning())
        {
            mAnimator.cancel();
        }
        if (flag && mHintAnimationEnabled)
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

    private void removeIndicator(TextView textview)
    {
        if (mIndicatorArea != null)
        {
            mIndicatorArea.removeView(textview);
            if (mIndicatorArea.getChildCount() == 0)
            {
                mIndicatorArea.setVisibility(8);
            }
        }
    }

    private void setEditText(EditText edittext)
    {
        if (mEditText != null)
        {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        mEditText = edittext;
        mCollapsingTextHelper.setTypefaces(mEditText.getTypeface());
        mCollapsingTextHelper.setExpandedTextSize(mEditText.getTextSize());
        mCollapsingTextHelper.setExpandedTextGravity(mEditText.getGravity());
        mEditText.addTextChangedListener(new TextWatcher() {

            final TextInputLayout this$0;

            public void afterTextChanged(Editable editable)
            {
                updateLabelVisibility(true);
                if (mCounterEnabled)
                {
                    updateCounter(editable.length());
                }
            }

            public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            
            {
                this$0 = TextInputLayout.this;
                super();
            }
        });
        if (mDefaultTextColor == null)
        {
            mDefaultTextColor = mEditText.getHintTextColors();
        }
        if (TextUtils.isEmpty(mHint))
        {
            setHint(mEditText.getHint());
            mEditText.setHint(null);
        }
        if (mCounterView != null)
        {
            updateCounter(mEditText.getText().length());
        }
        if (mIndicatorArea != null)
        {
            adjustIndicatorPadding();
        }
        updateLabelVisibility(false);
    }

    private void updateCounter(int i)
    {
        boolean flag1 = mCounterOverflowed;
        if (mCounterMaxLength == -1)
        {
            mCounterView.setText(String.valueOf(i));
            mCounterOverflowed = false;
        } else
        {
            boolean flag;
            if (i > mCounterMaxLength)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mCounterOverflowed = flag;
            if (flag1 != mCounterOverflowed)
            {
                TextView textview = mCounterView;
                Context context = getContext();
                int j;
                if (mCounterOverflowed)
                {
                    j = mCounterOverflowTextAppearance;
                } else
                {
                    j = mCounterTextAppearance;
                }
                textview.setTextAppearance(context, j);
            }
            mCounterView.setText(getContext().getString(android.support.design.R.string.character_counter_pattern, new Object[] {
                Integer.valueOf(i), Integer.valueOf(mCounterMaxLength)
            }));
        }
        if (mEditText != null && flag1 != mCounterOverflowed)
        {
            updateLabelVisibility(false);
            updateEditTextBackground();
        }
    }

    private void updateEditTextBackground()
    {
        if (mErrorShown && mErrorView != null)
        {
            ViewCompat.setBackgroundTintList(mEditText, ColorStateList.valueOf(mErrorView.getCurrentTextColor()));
            return;
        }
        if (mCounterOverflowed && mCounterView != null)
        {
            ViewCompat.setBackgroundTintList(mEditText, ColorStateList.valueOf(mCounterView.getCurrentTextColor()));
            return;
        } else
        {
            TintManager tintmanager = TintManager.get(getContext());
            ViewCompat.setBackgroundTintList(mEditText, tintmanager.getTintList(android.support.design.R.drawable.abc_edit_text_material));
            return;
        }
    }

    private android.widget.LinearLayout.LayoutParams updateEditTextMargin(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.widget.LinearLayout.LayoutParams)
        {
            layoutparams = (android.widget.LinearLayout.LayoutParams)layoutparams;
        } else
        {
            layoutparams = new android.widget.LinearLayout.LayoutParams(layoutparams);
        }
        if (mTmpPaint == null)
        {
            mTmpPaint = new Paint();
        }
        mTmpPaint.setTypeface(mCollapsingTextHelper.getCollapsedTypeface());
        mTmpPaint.setTextSize(mCollapsingTextHelper.getCollapsedTextSize());
        layoutparams.topMargin = (int)(-mTmpPaint.ascent());
        return layoutparams;
    }

    private void updateLabelVisibility(boolean flag)
    {
        boolean flag2 = true;
        boolean flag1;
        boolean flag3;
        if (mEditText != null && !TextUtils.isEmpty(mEditText.getText()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag3 = arrayContains(getDrawableState(), 0x101009c);
        if (TextUtils.isEmpty(getError()))
        {
            flag2 = false;
        }
        if (mDefaultTextColor != null)
        {
            mCollapsingTextHelper.setExpandedTextColor(mDefaultTextColor.getDefaultColor());
        }
        if (mCounterOverflowed && mCounterView != null)
        {
            mCollapsingTextHelper.setCollapsedTextColor(mCounterView.getCurrentTextColor());
        } else
        if (flag2 && mErrorView != null)
        {
            mCollapsingTextHelper.setCollapsedTextColor(mErrorView.getCurrentTextColor());
        } else
        if (flag3 && mFocusedTextColor != null)
        {
            mCollapsingTextHelper.setCollapsedTextColor(mFocusedTextColor.getDefaultColor());
        } else
        if (mDefaultTextColor != null)
        {
            mCollapsingTextHelper.setCollapsedTextColor(mDefaultTextColor.getDefaultColor());
        }
        if (flag1 || flag3 || flag2)
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
            setEditText((EditText)view);
            super.addView(view, 0, updateEditTextMargin(layoutparams));
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

    public int getCounterMaxLength()
    {
        return mCounterMaxLength;
    }

    public EditText getEditText()
    {
        return mEditText;
    }

    public CharSequence getError()
    {
        if (mErrorEnabled && mErrorView != null && mErrorView.getVisibility() == 0)
        {
            return mErrorView.getText();
        } else
        {
            return null;
        }
    }

    public CharSequence getHint()
    {
        return mHint;
    }

    public Typeface getTypeface()
    {
        return mCollapsingTextHelper.getCollapsedTypeface();
    }

    public boolean isErrorEnabled()
    {
        return mErrorEnabled;
    }

    public boolean isHintAnimationEnabled()
    {
        return mHintAnimationEnabled;
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

    public void refreshDrawableState()
    {
        super.refreshDrawableState();
        updateLabelVisibility(ViewCompat.isLaidOut(this));
    }

    public void setCounterEnabled(boolean flag)
    {
        if (mCounterEnabled != flag)
        {
            if (flag)
            {
                mCounterView = new TextView(getContext());
                mCounterView.setMaxLines(1);
                mCounterView.setTextAppearance(getContext(), mCounterTextAppearance);
                ViewCompat.setAccessibilityLiveRegion(mCounterView, 1);
                addIndicator(mCounterView, -1);
                if (mEditText == null)
                {
                    updateCounter(0);
                } else
                {
                    updateCounter(mEditText.getText().length());
                }
            } else
            {
                removeIndicator(mCounterView);
                mCounterView = null;
            }
            mCounterEnabled = flag;
        }
    }

    public void setCounterMaxLength(int i)
    {
        if (mCounterMaxLength != i)
        {
            if (i > 0)
            {
                mCounterMaxLength = i;
            } else
            {
                mCounterMaxLength = -1;
            }
            if (mCounterEnabled)
            {
                if (mEditText == null)
                {
                    i = 0;
                } else
                {
                    i = mEditText.getText().length();
                }
                updateCounter(i);
            }
        }
    }

    public void setError(CharSequence charsequence)
    {
        if (mErrorEnabled) goto _L2; else goto _L1
_L1:
        if (!TextUtils.isEmpty(charsequence)) goto _L4; else goto _L3
_L3:
        return;
_L4:
        setErrorEnabled(true);
_L2:
        if (!TextUtils.isEmpty(charsequence))
        {
            ViewCompat.setAlpha(mErrorView, 0.0F);
            mErrorView.setText(charsequence);
            ViewCompat.animate(mErrorView).alpha(1.0F).setDuration(200L).setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR).setListener(new ViewPropertyAnimatorListenerAdapter() {

                final TextInputLayout this$0;

                public void onAnimationStart(View view)
                {
                    view.setVisibility(0);
                }

            
            {
                this$0 = TextInputLayout.this;
                super();
            }
            }).start();
            mErrorShown = true;
            updateEditTextBackground();
            updateLabelVisibility(true);
            return;
        }
        if (mErrorView.getVisibility() == 0)
        {
            ViewCompat.animate(mErrorView).alpha(0.0F).setDuration(200L).setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR).setListener(new ViewPropertyAnimatorListenerAdapter() {

                final TextInputLayout this$0;

                public void onAnimationEnd(View view)
                {
                    view.setVisibility(4);
                    updateLabelVisibility(true);
                }

            
            {
                this$0 = TextInputLayout.this;
                super();
            }
            }).start();
            mErrorShown = false;
            updateEditTextBackground();
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public void setErrorEnabled(boolean flag)
    {
        if (mErrorEnabled != flag)
        {
            if (mErrorView != null)
            {
                ViewCompat.animate(mErrorView).cancel();
            }
            if (flag)
            {
                mErrorView = new TextView(getContext());
                mErrorView.setTextAppearance(getContext(), mErrorTextAppearance);
                mErrorView.setVisibility(4);
                ViewCompat.setAccessibilityLiveRegion(mErrorView, 1);
                addIndicator(mErrorView, 0);
            } else
            {
                mErrorShown = false;
                updateEditTextBackground();
                removeIndicator(mErrorView);
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

    public void setHintAnimationEnabled(boolean flag)
    {
        mHintAnimationEnabled = flag;
    }

    public void setHintTextAppearance(int i)
    {
        mCollapsingTextHelper.setCollapsedTextAppearance(i);
        mFocusedTextColor = ColorStateList.valueOf(mCollapsingTextHelper.getCollapsedTextColor());
        if (mEditText != null)
        {
            updateLabelVisibility(false);
            android.widget.LinearLayout.LayoutParams layoutparams = updateEditTextMargin(mEditText.getLayoutParams());
            mEditText.setLayoutParams(layoutparams);
            mEditText.requestLayout();
        }
    }

    public void setTypeface(Typeface typeface)
    {
        mCollapsingTextHelper.setTypefaces(typeface);
    }






}
