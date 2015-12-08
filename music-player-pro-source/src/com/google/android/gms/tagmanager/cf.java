// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.a;
import com.google.android.gms.internal.b;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, di, dh

class cf extends aj
{

    private static final String ID;
    private static final String asu;
    private static final String asv;

    public cf()
    {
        super(ID, new String[0]);
    }

    public com.google.android.gms.internal.d.a B(Map map)
    {
        Object obj;
        obj = (com.google.android.gms.internal.d.a)map.get(asu);
        map = (com.google.android.gms.internal.d.a)map.get(asv);
        if (obj == null || obj == di.rb() || map == null || map == di.rb()) goto _L2; else goto _L1
_L1:
        obj = di.k(((com.google.android.gms.internal.d.a) (obj)));
        map = di.k(map);
        if (obj == di.qZ() || map == di.qZ()) goto _L2; else goto _L3
_L3:
        double d;
        double d1;
        d1 = ((dh) (obj)).doubleValue();
        d = map.doubleValue();
        if (d1 > d) goto _L2; else goto _L4
_L4:
        return di.u(Long.valueOf(Math.round((d - d1) * Math.random() + d1)));
_L2:
        d = 2147483647D;
        d1 = 0.0D;
        if (true) goto _L4; else goto _L5
_L5:
    }

    public boolean pe()
    {
        return false;
    }

    static 
    {
        ID = a.Q.toString();
        asu = b.dz.toString();
        asv = b.dy.toString();
    }
}
