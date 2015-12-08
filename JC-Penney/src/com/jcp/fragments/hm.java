// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.jcp.fragments:
//            UnitedAddressFragment

class hm
    implements android.widget.AdapterView.OnItemSelectedListener
{

    final UnitedAddressFragment a;
    final UnitedAddressFragment..ViewInjector b;

    hm(UnitedAddressFragment..ViewInjector viewinjector, UnitedAddressFragment unitedaddressfragment)
    {
        b = viewinjector;
        a = unitedaddressfragment;
        super();
    }

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        a.onStateSpinnerItemSelected(i);
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }
}
