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
    private static final String XL;
    private final DataLayer WK;

    public w(DataLayer datalayer)
    {
        super(ID, new String[] {
            VALUE
        });
        WK = datalayer;
    }

    private void a(com.google.android.gms.internal.d.a a1)
    {
        if (a1 != null && a1 != dh.lN())
        {
            if ((a1 = dh.j(a1)) != dh.lS())
            {
                WK.bv(a1);
                return;
            }
        }
    }

    private void b(com.google.android.gms.internal.d.a a1)
    {
        if (a1 != null && a1 != dh.lN())
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
                        WK.push(((Map) (obj)));
                    }
                }
            }
        }
    }

    public void z(Map map)
    {
        b((com.google.android.gms.internal.d.a)map.get(VALUE));
        a((com.google.android.gms.internal.d.a)map.get(XL));
    }

    static 
    {
        ID = a.af.toString();
        VALUE = b.ew.toString();
        XL = b.bD.toString();
    }
}
