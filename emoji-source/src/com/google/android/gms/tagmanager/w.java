// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.a;
import com.google.android.gms.internal.b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            df, dh, DataLayer

class w extends df
{

    private static final String ID;
    private static final String VALUE;
    private static final String aft;
    private final DataLayer aeu;

    public w(DataLayer datalayer)
    {
        super(ID, new String[] {
            VALUE
        });
        aeu = datalayer;
    }

    private void a(com.google.android.gms.internal.d.a a1)
    {
        if (a1 != null && a1 != dh.mX())
        {
            if ((a1 = dh.j(a1)) != dh.nc())
            {
                aeu.bN(a1);
                return;
            }
        }
    }

    private void b(com.google.android.gms.internal.d.a a1)
    {
        if (a1 != null && a1 != dh.mX())
        {
            if ((a1 = ((com.google.android.gms.internal.d.a) (dh.o(a1)))) instanceof List)
            {
                a1 = ((List)a1).iterator();
                while (a1.hasNext()) 
                {
                    Object obj = a1.next();
                    if (obj instanceof Map)
                    {
                        obj = (Map)obj;
                        aeu.push(((Map) (obj)));
                    }
                }
            }
        }
    }

    public void y(Map map)
    {
        b((com.google.android.gms.internal.d.a)map.get(VALUE));
        a((com.google.android.gms.internal.d.a)map.get(aft));
    }

    static 
    {
        ID = a.af.toString();
        VALUE = b.ew.toString();
        aft = b.bD.toString();
    }
}
