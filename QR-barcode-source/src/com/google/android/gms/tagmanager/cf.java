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
    private static final String aql;
    private static final String aqm;

    public cf()
    {
        super(ID, new String[0]);
    }

    public com.google.android.gms.internal.d.a C(Map map)
    {
        Object obj;
        obj = (com.google.android.gms.internal.d.a)map.get(aql);
        map = (com.google.android.gms.internal.d.a)map.get(aqm);
        if (obj == null || obj == di.pK() || map == null || map == di.pK()) goto _L2; else goto _L1
_L1:
        obj = di.k(((com.google.android.gms.internal.d.a) (obj)));
        map = di.k(map);
        if (obj == di.pI() || map == di.pI()) goto _L2; else goto _L3
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

    public boolean nN()
    {
        return false;
    }

    static 
    {
        ID = a.Q.toString();
        aql = b.dz.toString();
        aqm = b.dy.toString();
    }
}
