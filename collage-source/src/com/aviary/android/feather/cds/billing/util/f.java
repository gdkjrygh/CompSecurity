// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds.billing.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.aviary.android.feather.cds.billing.util:
//            h, Purchase

public class f
{

    Map a;
    Map b;

    f()
    {
        a = new HashMap();
        b = new HashMap();
    }

    public h a(String s)
    {
        return (h)a.get(s);
    }

    public List a()
    {
        return new ArrayList(b.keySet());
    }

    public void a(Purchase purchase)
    {
        b.put(purchase.c(), purchase);
    }

    public void a(h h1)
    {
        a.put(h1.a(), h1);
    }

    public Purchase b(String s)
    {
        return (Purchase)b.get(s);
    }

    public boolean c(String s)
    {
        return b.containsKey(s);
    }

    public boolean d(String s)
    {
        return a.containsKey(s);
    }

    public List e(String s)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = b.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Purchase purchase = (Purchase)iterator.next();
            if (purchase.a().equals(s))
            {
                arraylist.add(purchase.c());
            }
        } while (true);
        return arraylist;
    }
}
