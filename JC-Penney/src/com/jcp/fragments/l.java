// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.jcp.fragments:
//            AddCreditCardFragment

class l
    implements TextWatcher
{

    final AddCreditCardFragment a;
    final AddCreditCardFragment..ViewInjector b;

    l(AddCreditCardFragment..ViewInjector viewinjector, AddCreditCardFragment addcreditcardfragment)
    {
        b = viewinjector;
        a = addcreditcardfragment;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        a.afterOtherCardMonthYearTextChanged(editable);
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        a.beforeOtherCardMonthYearTextChanged();
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        a.otherCardMonthYearTextChanged(charsequence);
    }
}
