// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.jcp.fragments:
//            AddCreditCardFragment

class b
    implements TextWatcher
{

    final AddCreditCardFragment a;
    final AddCreditCardFragment..ViewInjector b;

    b(AddCreditCardFragment..ViewInjector viewinjector, AddCreditCardFragment addcreditcardfragment)
    {
        b = viewinjector;
        a = addcreditcardfragment;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        a.afterOtherCardCVVChanged(editable);
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        a.otherCardCVVChanged();
    }
}
