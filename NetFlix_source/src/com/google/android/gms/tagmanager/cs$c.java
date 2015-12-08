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

    private final Set ZM = new HashSet();
    private final Map ZW = new HashMap();
    private final Map ZX = new HashMap();
    private final Map ZY = new HashMap();
    private final Map ZZ = new HashMap();
    private aaa aaa;

    public void a( ,  1)
    {
        List list = (List)ZW.get();
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            ZW.put(, obj);
        }
        ((List) (obj)).add(1);
    }

    public void a(ZW zw, String s)
    {
        List list = (List)ZY.get(zw);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            ZY.put(zw, obj);
        }
        ((List) (obj)).add(s);
    }

    public void b(ZY zy)
    {
        ZM.add(zy);
    }

    public void b(ZM zm, ZM zm1)
    {
        List list = (List)ZX.get(zm);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            ZX.put(zm, obj);
        }
        ((List) (obj)).add(zm1);
    }

    public void b(ZX zx, String s)
    {
        List list = (List)ZZ.get(zx);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            ZZ.put(zx, obj);
        }
        ((List) (obj)).add(s);
    }

    public void i(ZZ zz)
    {
        aaa = zz;
    }

    public Set lA()
    {
        return ZM;
    }

    public Map lB()
    {
        return ZW;
    }

    public Map lC()
    {
        return ZY;
    }

    public Map lD()
    {
        return ZZ;
    }

    public Map lE()
    {
        return ZX;
    }

    public ZX lF()
    {
        return aaa;
    }

    public ()
    {
    }
}
