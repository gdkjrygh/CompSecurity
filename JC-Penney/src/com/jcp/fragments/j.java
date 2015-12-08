// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.jcp.fragments:
//            AddCreditCardFragment

class j
    implements TextWatcher
{

    final AddCreditCardFragment a;
    final AddCreditCardFragment..ViewInjector b;

    j(AddCreditCardFragment..ViewInjector viewinjector, AddCreditCardFragment addcreditcardfragment)
    {
        b = viewinjector;
        a = addcreditcardfragment;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        a.afterOtherCardTextChanged();
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int k, int l)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int k, int l)
    {
        a.onOtherCardTextChanged();
    }
}
