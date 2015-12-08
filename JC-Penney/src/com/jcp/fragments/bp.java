// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.jcp.fragments:
//            LPOAddressFragment

class bp
    implements TextWatcher
{

    final LPOAddressFragment a;
    final LPOAddressFragment..ViewInjector b;

    bp(LPOAddressFragment..ViewInjector viewinjector, LPOAddressFragment lpoaddressfragment)
    {
        b = viewinjector;
        a = lpoaddressfragment;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        a.afterZipCodeLpoTextChanged();
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        a.onZipCodeLpoTextChanged();
    }
}
