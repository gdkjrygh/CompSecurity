// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.a;
import com.google.android.gms.internal.b;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, dh, dg

class ce extends aj
{

    private static final String ID;
    private static final String agC;
    private static final String agD;

    public ce()
    {
        super(ID, new String[0]);
    }

    public boolean lc()
    {
        return false;
    }

    public com.google.android.gms.internal.d.a w(Map map)
    {
        Object obj;
        obj = (com.google.android.gms.internal.d.a)map.get(agC);
        map = (com.google.android.gms.internal.d.a)map.get(agD);
        if (obj == null || obj == dh.mY() || map == null || map == dh.mY()) goto _L2; else goto _L1
_L1:
        obj = dh.k(((com.google.android.gms.internal.d.a) (obj)));
        map = dh.k(map);
        if (obj == dh.mW() || map == dh.mW()) goto _L2; else goto _L3
_L3:
        double d;
        double d1;
        d1 = ((dg) (obj)).doubleValue();
        d = map.doubleValue();
        if (d1 > d) goto _L2; else goto _L4
_L4:
        return dh.r(Long.valueOf(Math.round((d - d1) * Math.random() + d1)));
_L2:
        d = 2147483647D;
        d1 = 0.0D;
        if (true) goto _L4; else goto _L5
_L5:
    }

    static 
    {
        ID = a.O.toString();
        agC = b.da.toString();
        agD = b.cZ.toString();
    }
}
