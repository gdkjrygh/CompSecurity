// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import com.jcp.storepickup.pojo.Stores;
import java.util.Comparator;

// Referenced classes of package com.jcp.adapters:
//            PickUpFromStoreAdapter

class bp
    implements Comparator
{

    final PickUpFromStoreAdapter a;

    bp(PickUpFromStoreAdapter pickupfromstoreadapter)
    {
        a = pickupfromstoreadapter;
        super();
    }

    public int a(Stores stores, Stores stores1)
    {
        return PickUpFromStoreAdapter.a(a, stores1) - PickUpFromStoreAdapter.a(a, stores);
    }

    public int compare(Object obj, Object obj1)
    {
        return a((Stores)obj, (Stores)obj1);
    }
}
