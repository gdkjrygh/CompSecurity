// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.validation;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.wallet.util.accessibility.AccessibilityUtil;
import com.google.android.apps.wallet.util.text.DefaultTextWatcher;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.validator.DataValidator;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;

final class ValidationLogic
{
    final class MaxLengthWatcher extends DefaultTextWatcher
    {

        final ValidationLogic this$0;

        private void performAutoAdvance()
        {
            if (validatedEditText.focusSearch(130) != null)
            {
                validatedEditText.onEditorAction(5);
            } else
            {
                validatedEditText.onEditorAction(6);
            }
            isFocusedFirstTime = false;
        }

        public final void afterTextChanged(Editable editable)
        {
            if (validatedEditText.length() >= maxLength && isFocusedFirstTime && autoAdvanceEnabled && !checkForError())
            {
                performAutoAdvance();
            }
        }

        private MaxLengthWatcher()
        {
            this$0 = ValidationLogic.this;
            super();
        }

    }

    final class ValidatingFocusChangeListner
        implements android.view.View.OnFocusChangeListener
    {

        final ValidationLogic this$0;

        public final void onFocusChange(View view, boolean flag)
        {
            view = ValidationLogic.this;
            boolean flag1;
            if (flag && !hasHadFocus)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            view.isFocusedFirstTime = flag1;
            hasHadFocus = true;
            if ((!flag || validatedEditText.length() > 0) && !isRestoringState)
            {
                checkForError();
            }
        }

        private ValidatingFocusChangeListner()
        {
            this$0 = ValidationLogic.this;
            super();
        }

    }


    private final AccessibilityUtil accessibilityUtil;
    private boolean autoAdvanceEnabled;
    private String errorText;
    private boolean hasHadFocus;
    private final Map invalidValues = Maps.newHashMap();
    private boolean isFocusedFirstTime;
    private boolean isRestoringState;
    private int maxLength;
    private final EditText validatedEditText;
    private DataValidator validator;

    ValidationLogic(EditText edittext, AccessibilityUtil accessibilityutil)
    {
        maxLength = 0x7fffffff;
        hasHadFocus = false;
        isFocusedFirstTime = false;
        autoAdvanceEnabled = false;
        isRestoringState = false;
        validatedEditText = edittext;
        accessibilityUtil = accessibilityutil;
        validatedEditText.setEnabled(true);
        validatedEditText.setFocusable(true);
        validatedEditText.setFocusableInTouchMode(true);
        validatedEditText.setSaveEnabled(true);
        initializeValidation();
    }

    private transient void addFilters(InputFilter ainputfilter[])
    {
        InputFilter ainputfilter1[] = validatedEditText.getFilters();
        if (ainputfilter1 == null)
        {
            validatedEditText.setFilters(ainputfilter);
            return;
        } else
        {
            InputFilter ainputfilter2[] = (InputFilter[])Arrays.copyOf(ainputfilter1, ainputfilter1.length + ainputfilter.length);
            System.arraycopy(ainputfilter, 0, ainputfilter2, ainputfilter1.length, ainputfilter.length);
            validatedEditText.setFilters(ainputfilter2);
            return;
        }
    }

    private void initializeValidation()
    {
        validatedEditText.addTextChangedListener(new MaxLengthWatcher());
        validatedEditText.setOnFocusChangeListener(new ValidatingFocusChangeListner());
        validatedEditText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final ValidationLogic this$0;

            public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                if (i == 6)
                {
                    checkForError();
                }
                return false;
            }

            
            {
                this$0 = ValidationLogic.this;
                super();
            }
        });
    }

    private void renderState(boolean flag)
    {
        if (flag)
        {
            validatedEditText.setError(null);
            validatedEditText.setError(errorText);
            accessibilityUtil.announce(validatedEditText, errorText);
            return;
        } else
        {
            validatedEditText.setError(null);
            Views.hideDrawableIndicators(validatedEditText);
            return;
        }
    }

    final boolean checkForError()
    {
        String s = validatedEditText.getText().toString();
        errorText = validator.validate(s, validatedEditText.getResources());
        boolean flag;
        boolean flag1;
        if (!errorText.equals(""))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (!flag)
        {
            errorText = (String)invalidValues.get(s);
            flag1 = flag;
            if (errorText != null)
            {
                flag1 = true;
            }
        }
        renderState(flag1);
        return flag1;
    }

    final void clearInvalidState()
    {
        renderState(false);
    }

    final void initializeStyle(Context context, AttributeSet attributeset)
    {
        context = context.obtainStyledAttributes(attributeset, com.google.android.apps.walletnfcrel.R.styleable.ValidatedEditText);
        if (context.getBoolean(com.google.android.apps.walletnfcrel.R.styleable.ValidatedEditText_autoAdvance, false))
        {
            autoAdvanceEnabled = true;
        }
        int i = context.getInteger(com.google.android.apps.walletnfcrel.R.styleable.ValidatedEditText_android_maxLength, -1);
        if (i != -1)
        {
            setMaxLength(i);
        }
        context.recycle();
    }

    final void setAutoAdvance(boolean flag)
    {
        autoAdvanceEnabled = flag;
    }

    final void setInvalidState(String s)
    {
        errorText = Strings.nullToEmpty(s);
        invalidValues.put(validatedEditText.getText().toString(), errorText);
        renderState(true);
    }

    final void setMaxLength(int i)
    {
        maxLength = i;
        addFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(maxLength)
        });
    }

    final void setRestoringState(boolean flag)
    {
        isRestoringState = flag;
    }

    final void setValidator(DataValidator datavalidator)
    {
        validator = datavalidator;
    }





/*
    static boolean access$202(ValidationLogic validationlogic, boolean flag)
    {
        validationlogic.isFocusedFirstTime = flag;
        return flag;
    }

*/




/*
    static boolean access$402(ValidationLogic validationlogic, boolean flag)
    {
        validationlogic.hasHadFocus = flag;
        return flag;
    }

*/

}
