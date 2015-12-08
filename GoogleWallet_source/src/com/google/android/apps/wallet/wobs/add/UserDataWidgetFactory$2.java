// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.view.View;
import com.google.android.apps.wallet.widgets.validation.ValidatedCurrencyEditText;
import com.google.common.base.Strings;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            UserDataPromptDisplay, UserDataWidgetFactory

final class nit> extends UserDataPromptDisplay
{

    final UserDataWidgetFactory this$0;

    public final View getInputView()
    {
        return ((ValidatedCurrencyEditText)getView()).getInputView();
    }

    public final String getValue()
    {
        return Strings.nullToEmpty(((ValidatedCurrencyEditText)getView()).getValue());
    }

    public final void setValue(String s)
    {
        ((ValidatedCurrencyEditText)getView()).setValue(s);
    }

    ncyEditText(ValidatedCurrencyEditText validatedcurrencyedittext)
    {
        this$0 = UserDataWidgetFactory.this;
        super(validatedcurrencyedittext);
    }
}
