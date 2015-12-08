// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.locator;

import com.dominos.android.sdk.common.dom.order.Address;
import com.google.a.b.ar;

// Referenced classes of package com.dominos.android.sdk.common.dom.locator:
//            LocatorResult

public class stores
{

    private Address address;
    private String granularity;
    private int status;
    private ar stores;

    public LocatorResult build()
    {
        return new LocatorResult(status, granularity, address, stores);
    }

    public stores setAddress(Address address1)
    {
        address = address1;
        return this;
    }

    public address setGranularity(String s)
    {
        granularity = s;
        return this;
    }

    public granularity setStatus(int i)
    {
        status = i;
        return this;
    }

    public status setStores(ar ar1)
    {
        stores = ar1;
        return this;
    }

    public ()
    {
        address = Address.EMPTY;
        granularity = "";
        status = -1;
        stores = ar.d();
    }
}
