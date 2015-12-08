// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.jcp.fragments:
//            UnitedAddressFragment

class hi
    implements TextWatcher
{

    final UnitedAddressFragment a;
    final UnitedAddressFragment..ViewInjector b;

    hi(UnitedAddressFragment..ViewInjector viewinjector, UnitedAddressFragment unitedaddressfragment)
    {
        b = viewinjector;
        a = unitedaddressfragment;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        a.afterChangeUnitedLastNameTextChanged();
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
