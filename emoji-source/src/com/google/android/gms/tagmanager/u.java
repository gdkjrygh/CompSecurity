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
    private static final String afi;
    private final DataLayer aeu;

    public u(DataLayer datalayer)
    {
        super(ID, new String[] {
            NAME
        });
        aeu = datalayer;
    }

    public boolean lh()
    {
        return false;
    }

    public com.google.android.gms.internal.d.a w(Map map)
    {
        Object obj = aeu.get(dh.j((com.google.android.gms.internal.d.a)map.get(NAME)));
        if (obj == null)
        {
            map = (com.google.android.gms.internal.d.a)map.get(afi);
            if (map != null)
            {
                return map;
            } else
            {
                return dh.nd();
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
        afi = b.cb.toString();
    }
}
