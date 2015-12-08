// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import com.jcp.storepickup.pojo.Inventory;
import com.jcp.storepickup.pojo.Stores;
import java.util.Comparator;

// Referenced classes of package com.jcp.adapters:
//            cw

class cy
    implements Comparator
{

    final cw a;

    cy(cw cw)
    {
        a = cw;
        super();
    }

    public int a(Stores stores, Stores stores1)
    {
        if (stores.getInventory().getStatus() == null && stores1.getInventory().getStatus() == null)
        {
            return 0;
        }
        if (stores.getInventory().getStatus() == null)
        {
            return 1;
        }
        if (stores1.getInventory().getStatus() == null)
        {
            return -1;
        } else
        {
            return stores.getInventory().getStatus().compareTo(stores1.getInventory().getStatus());
        }
    }

    public int compare(Object obj, Object obj1)
    {
        return a((Stores)obj, (Stores)obj1);
    }
}
