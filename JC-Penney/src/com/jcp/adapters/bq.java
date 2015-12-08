// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import com.jcp.c.n;
import com.jcp.storepickup.pojo.Stores;

// Referenced classes of package com.jcp.adapters:
//            PickUpFromStoreAdapter

class bq
    implements android.view.View.OnClickListener
{

    final Stores a;
    final int b;
    final PickUpFromStoreAdapter c;

    bq(PickUpFromStoreAdapter pickupfromstoreadapter, Stores stores, int i)
    {
        c = pickupfromstoreadapter;
        a = stores;
        b = i;
        super();
    }

    public void onClick(View view)
    {
        PickUpFromStoreAdapter.a(c).a(a.getId());
        PickUpFromStoreAdapter.b(c, a);
        PickUpFromStoreAdapter.a(c, PickUpFromStoreAdapter.a(c, (Stores)c.getItem(b)));
        PickUpFromStoreAdapter.b(c, PickUpFromStoreAdapter.b(c));
    }
}
