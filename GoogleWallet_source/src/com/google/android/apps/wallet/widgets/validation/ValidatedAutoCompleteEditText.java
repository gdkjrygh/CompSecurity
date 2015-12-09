// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.validation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import com.google.android.apps.wallet.inject.ApplicationInjector;
import com.google.android.apps.wallet.util.accessibility.AccessibilityUtil;
import com.google.android.apps.wallet.validator.DataValidator;

// Referenced classes of package com.google.android.apps.wallet.widgets.validation:
//            ValidationLogic

public class ValidatedAutoCompleteEditText extends AutoCompleteTextView
    implements ValidationGroup.Groupable
{

    AccessibilityUtil accessibilityUtil;
    ValidationLogic validationLogic;

    public ValidatedAutoCompleteEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        ApplicationInjector.inject(this, context);
        validationLogic = new ValidationLogic(this, accessibilityUtil);
        validationLogic.initializeStyle(context, attributeset);
    }

    public final boolean checkForError()
    {
        return validationLogic.checkForError();
    }

    public final String getValue()
    {
        return getText().toString();
    }

    public void setInvalidState(String s)
    {
        validationLogic.setInvalidState(s);
    }

    public void setValidator(DataValidator datavalidator)
    {
        validationLogic.setValidator(datavalidator);
    }

    public void setValue(String s)
    {
        setText(s);
    }
}
