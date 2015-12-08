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
    private static final String aqZ;
    private final DataLayer aqn;

    public u(DataLayer datalayer)
    {
        super(ID, new String[] {
            NAME
        });
        aqn = datalayer;
    }

    public com.google.android.gms.internal.d.a B(Map map)
    {
        Object obj = aqn.get(di.j((com.google.android.gms.internal.d.a)map.get(NAME)));
        if (obj == null)
        {
            map = (com.google.android.gms.internal.d.a)map.get(aqZ);
            if (map != null)
            {
                return map;
            } else
            {
                return di.rb();
            }
        } else
        {
            return di.u(obj);
        }
    }

    public boolean pe()
    {
        return false;
    }

    static 
    {
        ID = a.C.toString();
        NAME = b.dB.toString();
        aqZ = b.cr.toString();
    }
}
