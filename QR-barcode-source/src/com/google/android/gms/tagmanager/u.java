// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.a;
import com.google.android.gms.internal.b;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, di, DataLayer

class u extends aj
{

    private static final String ID;
    private static final String NAME;
    private static final String aoP;
    private final DataLayer aod;

    public u(DataLayer datalayer)
    {
        super(ID, new String[] {
            NAME
        });
        aod = datalayer;
    }

    public com.google.android.gms.internal.d.a C(Map map)
    {
        Object obj = aod.get(di.j((com.google.android.gms.internal.d.a)map.get(NAME)));
        if (obj == null)
        {
            map = (com.google.android.gms.internal.d.a)map.get(aoP);
            if (map != null)
            {
                return map;
            } else
            {
                return di.pK();
            }
        } else
        {
            return di.u(obj);
        }
    }

    public boolean nN()
    {
        return false;
    }

    static 
    {
        ID = a.C.toString();
        NAME = b.dB.toString();
        aoP = b.cr.toString();
    }
}
