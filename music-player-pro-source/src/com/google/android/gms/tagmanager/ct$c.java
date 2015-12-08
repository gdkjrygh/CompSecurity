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

    private final Set atj = new HashSet();
    private final Map att = new HashMap();
    private final Map atu = new HashMap();
    private final Map atv = new HashMap();
    private final Map atw = new HashMap();
    private atx atx;

    public void a( ,  1)
    {
        List list = (List)att.get();
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            att.put(, obj);
        }
        ((List) (obj)).add(1);
    }

    public void a(att att1, String s)
    {
        List list = (List)atv.get(att1);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            atv.put(att1, obj);
        }
        ((List) (obj)).add(s);
    }

    public void b(atv atv1)
    {
        atj.add(atv1);
    }

    public void b(atj atj1, atj atj2)
    {
        List list = (List)atu.get(atj1);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            atu.put(atj1, obj);
        }
        ((List) (obj)).add(atj2);
    }

    public void b(atu atu1, String s)
    {
        List list = (List)atw.get(atu1);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            atw.put(atu1, obj);
        }
        ((List) (obj)).add(s);
    }

    public void i(atw atw1)
    {
        atx = atw1;
    }

    public Set qH()
    {
        return atj;
    }

    public Map qI()
    {
        return att;
    }

    public Map qJ()
    {
        return atv;
    }

    public Map qK()
    {
        return atw;
    }

    public Map qL()
    {
        return atu;
    }

    public atu qM()
    {
        return atx;
    }

    public ()
    {
    }
}
