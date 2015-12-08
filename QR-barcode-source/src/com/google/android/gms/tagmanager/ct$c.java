// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ct

private static class 
{

    private final Set ara = new HashSet();
    private final Map ark = new HashMap();
    private final Map arl = new HashMap();
    private final Map arm = new HashMap();
    private final Map arn = new HashMap();
    private aro aro;

    public void a( ,  1)
    {
        List list = (List)ark.get();
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            ark.put(, obj);
        }
        ((List) (obj)).add(1);
    }

    public void a(ark ark1, String s)
    {
        List list = (List)arm.get(ark1);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            arm.put(ark1, obj);
        }
        ((List) (obj)).add(s);
    }

    public void b(arm arm1)
    {
        ara.add(arm1);
    }

    public void b(ara ara1, ara ara2)
    {
        List list = (List)arl.get(ara1);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            arl.put(ara1, obj);
        }
        ((List) (obj)).add(ara2);
    }

    public void b(arl arl1, String s)
    {
        List list = (List)arn.get(arl1);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            arn.put(arl1, obj);
        }
        ((List) (obj)).add(s);
    }

    public void i(arn arn1)
    {
        aro = arn1;
    }

    public Set pq()
    {
        return ara;
    }

    public Map pr()
    {
        return ark;
    }

    public Map ps()
    {
        return arm;
    }

    public Map pt()
    {
        return arn;
    }

    public Map pu()
    {
        return arl;
    }

    public arl pv()
    {
        return aro;
    }

    public ()
    {
    }
}
