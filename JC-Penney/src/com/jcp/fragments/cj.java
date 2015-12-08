// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.jcp.fragments:
//            PrimaryAddressFragment

class cj
    implements android.widget.AdapterView.OnItemLongClickListener
{

    final PrimaryAddressFragment a;
    final PrimaryAddressFragment..ViewInjector b;

    cj(PrimaryAddressFragment..ViewInjector viewinjector, PrimaryAddressFragment primaryaddressfragment)
    {
        b = viewinjector;
        a = primaryaddressfragment;
        super();
    }

    public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
        return a.onAdditionalAddressListItemLongClick(i);
    }
}
