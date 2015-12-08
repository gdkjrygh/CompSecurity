// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.e;
import com.google.android.gms.internal.f;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            o, cl, ck

final class bh extends o
{

    private static final String a;
    private static final String b;
    private static final String c;

    public bh()
    {
        super(a, new String[0]);
    }

    public final com.google.android.gms.internal.h.a a(Map map)
    {
        Object obj;
        obj = (com.google.android.gms.internal.h.a)map.get(b);
        map = (com.google.android.gms.internal.h.a)map.get(c);
        if (obj == null || obj == com.google.android.gms.tagmanager.cl.f() || map == null || map == com.google.android.gms.tagmanager.cl.f()) goto _L2; else goto _L1
_L1:
        obj = cl.b(((com.google.android.gms.internal.h.a) (obj)));
        map = cl.b(map);
        if (obj == cl.d() || map == cl.d()) goto _L2; else goto _L3
_L3:
        double d;
        double d1;
        d1 = ((ck) (obj)).doubleValue();
        d = map.doubleValue();
        if (d1 > d) goto _L2; else goto _L4
_L4:
        return cl.a(Long.valueOf(Math.round((d - d1) * Math.random() + d1)));
_L2:
        d = 2147483647D;
        d1 = 0.0D;
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final boolean a()
    {
        return false;
    }

    static 
    {
        a = e.w.toString();
        b = f.bF.toString();
        c = f.bD.toString();
    }
}
