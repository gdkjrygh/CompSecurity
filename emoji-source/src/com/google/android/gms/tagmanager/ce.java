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
    private static final String agF;
    private static final String agG;

    public ce()
    {
        super(ID, new String[0]);
    }

    public boolean lh()
    {
        return false;
    }

    public com.google.android.gms.internal.d.a w(Map map)
    {
        Object obj;
        obj = (com.google.android.gms.internal.d.a)map.get(agF);
        map = (com.google.android.gms.internal.d.a)map.get(agG);
        if (obj == null || obj == dh.nd() || map == null || map == dh.nd()) goto _L2; else goto _L1
_L1:
        obj = dh.k(((com.google.android.gms.internal.d.a) (obj)));
        map = dh.k(map);
        if (obj == dh.nb() || map == dh.nb()) goto _L2; else goto _L3
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
        agF = b.da.toString();
        agG = b.cZ.toString();
    }
}
