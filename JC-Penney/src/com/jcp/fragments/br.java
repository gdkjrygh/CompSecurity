// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.jcp.fragments:
//            LPOAddressFragment

class br
    implements android.widget.AdapterView.OnItemSelectedListener
{

    final LPOAddressFragment a;
    final LPOAddressFragment..ViewInjector b;

    br(LPOAddressFragment..ViewInjector viewinjector, LPOAddressFragment lpoaddressfragment)
    {
        b = viewinjector;
        a = lpoaddressfragment;
        super();
    }

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        a.onAaAeSpinnerItemSelected(i);
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }
}
