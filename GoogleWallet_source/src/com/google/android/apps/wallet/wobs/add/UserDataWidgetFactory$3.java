// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.view.View;
import com.google.android.apps.wallet.widgets.validation.ValidatedSpinner;
import com.google.common.base.Strings;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            UserDataPromptDisplay, UserDataWidgetFactory

final class nit> extends UserDataPromptDisplay
{

    final UserDataWidgetFactory this$0;

    public final View getInputView()
    {
        return ((ValidatedSpinner)getView()).getInputView();
    }

    public final String getValue()
    {
        return Strings.nullToEmpty((String)((ValidatedSpinner)getView()).getValue());
    }

    public final void setValue(String s)
    {
        ((ValidatedSpinner)getView()).setValue(s);
    }

    er(ValidatedSpinner validatedspinner)
    {
        this$0 = UserDataWidgetFactory.this;
        super(validatedspinner);
    }
}
