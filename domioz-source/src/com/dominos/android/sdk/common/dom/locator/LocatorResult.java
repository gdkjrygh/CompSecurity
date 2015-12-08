// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.locator;

import com.dominos.android.sdk.common.core.ListNode;
import com.dominos.android.sdk.common.core.MapNode;
import com.dominos.android.sdk.common.core.Util;
import com.dominos.android.sdk.common.dom.order.Address;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.google.a.b.ar;
import com.google.a.b.at;
import com.google.b.ab;
import com.google.b.t;
import com.google.b.w;
import com.google.b.z;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.dominos.android.sdk.common.dom.locator:
//            LocatorStore

public class LocatorResult
{

    private final Address address;
    private final String granularity;
    private LabsAddress labsAddress;
    private final int status;
    private final ar stores;

    LocatorResult(int i, String s, Address address1, ar ar1)
    {
        status = i;
        granularity = (String)Util.notNull(s);
        address = (Address)Util.notNull(address1);
        stores = (ar)Util.notNull(ar1);
    }

    public static LocatorResult from(String s)
    {
        boolean flag = false;
        new ab();
        z z1 = (z)ab.a(s);
        s = z1.c("Stores");
        at at1 = ar.g();
        if (s != null)
        {
            for (int i = 0; i < s.a(); i++)
            {
                at1.c(LocatorStore.from(s.a(i).h()));
            }

        }
        s = new Builder();
        int j = ((flag) ? 1 : 0);
        if (z1.a("Status"))
        {
            j = z1.b("Status").f();
        }
        Builder builder = s.setStatus(j);
        if (z1.a("Granularity"))
        {
            s = z1.b("Granularity").c();
        } else
        {
            s = "";
        }
        s = builder.setGranularity(s).setStores(at1.a()).build();
        if (z1.a("Address"))
        {
            s.setLabsAddress(new LabsAddress(z1.d("Address")));
        }
        return s;
    }

    public static LocatorResult from(Map map)
    {
        map = new MapNode(map);
        at at1 = ar.g();
        for (Iterator iterator = map.getList("Stores").iterator(); iterator.hasNext(); at1.c(LocatorStore.from(((MapNode)iterator.next()).asMap()))) { }
        return (new Builder()).setStatus(map.getInt("Status").intValue()).setGranularity(map.getText("Granularity", "")).setAddress(Address.from(map.getMap("Address", Collections.EMPTY_MAP))).setStores(at1.a()).build();
    }

    public Address getAddress()
    {
        return address;
    }

    public String getGranularity()
    {
        return granularity;
    }

    public LabsAddress getLabsAddress()
    {
        return labsAddress;
    }

    public int getStatus()
    {
        return status;
    }

    public ar getStores()
    {
        return stores;
    }

    public void setLabsAddress(LabsAddress labsaddress)
    {
        labsAddress = labsaddress;
    }

    private class Builder
    {

        private Address address;
        private String granularity;
        private int status;
        private ar stores;

        public LocatorResult build()
        {
            return new LocatorResult(status, granularity, address, stores);
        }

        public Builder setAddress(Address address1)
        {
            address = address1;
            return this;
        }

        public Builder setGranularity(String s)
        {
            granularity = s;
            return this;
        }

        public Builder setStatus(int i)
        {
            status = i;
            return this;
        }

        public Builder setStores(ar ar1)
        {
            stores = ar1;
            return this;
        }

        public Builder()
        {
            address = Address.EMPTY;
            granularity = "";
            status = -1;
            stores = ar.d();
        }
    }

}
