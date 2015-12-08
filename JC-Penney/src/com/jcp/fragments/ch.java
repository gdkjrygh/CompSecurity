// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.jcp.fragments:
//            PrimaryAddressFragment

class ch
    implements android.widget.AdapterView.OnItemClickListener
{

    final PrimaryAddressFragment a;
    final PrimaryAddressFragment..ViewInjector b;

    ch(PrimaryAddressFragment..ViewInjector viewinjector, PrimaryAddressFragment primaryaddressfragment)
    {
        b = viewinjector;
        a = primaryaddressfragment;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.onPrimaryAddressListItemClick(i);
    }
}
