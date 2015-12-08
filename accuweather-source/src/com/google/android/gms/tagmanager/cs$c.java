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
//            cs

private static class 
{

    private final Map ahB = new HashMap();
    private final Map ahC = new HashMap();
    private final Map ahD = new HashMap();
    private final Map ahE = new HashMap();
    private ahF ahF;
    private final Set ahr = new HashSet();

    public void a( ,  1)
    {
        List list = (List)ahB.get();
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            ahB.put(, obj);
        }
        ((List) (obj)).add(1);
    }

    public void a(ahB ahb, String s)
    {
        List list = (List)ahD.get(ahb);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            ahD.put(ahb, obj);
        }
        ((List) (obj)).add(s);
    }

    public void b(ahD ahd)
    {
        ahr.add(ahd);
    }

    public void b(ahr ahr1, ahr ahr2)
    {
        List list = (List)ahC.get(ahr1);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            ahC.put(ahr1, obj);
        }
        ((List) (obj)).add(ahr2);
    }

    public void b(ahC ahc, String s)
    {
        List list = (List)ahE.get(ahc);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            ahE.put(ahc, obj);
        }
        ((List) (obj)).add(s);
    }

    public void i(ahE ahe)
    {
        ahF = ahe;
    }

    public Set mF()
    {
        return ahr;
    }

    public Map mG()
    {
        return ahB;
    }

    public Map mH()
    {
        return ahD;
    }

    public Map mI()
    {
        return ahE;
    }

    public Map mJ()
    {
        return ahC;
    }

    public ahC mK()
    {
        return ahF;
    }

    public ()
    {
    }
}
