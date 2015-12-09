// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.a;
import com.google.android.gms.internal.b;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, dh, DataLayer

class u extends aj
{

    private static final String ID;
    private static final String NAME;
    private static final String XA;
    private final DataLayer WK;

    public u(DataLayer datalayer)
    {
        super(ID, new String[] {
            NAME
        });
        WK = datalayer;
    }

    public boolean jX()
    {
        return false;
    }

    public com.google.android.gms.internal.d.a x(Map map)
    {
        Object obj = WK.get(dh.j((com.google.android.gms.internal.d.a)map.get(NAME)));
        if (obj == null)
        {
            map = (com.google.android.gms.internal.d.a)map.get(XA);
            if (map != null)
            {
                return map;
            } else
            {
                return dh.lT();
            }
        } else
        {
            return dh.r(obj);
        }
    }

    static 
    {
        ID = a.C.toString();
        NAME = b.dc.toString();
        XA = b.cb.toString();
    }
}
