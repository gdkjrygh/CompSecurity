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
//            dg, di, DataLayer

class w extends dg
{

    private static final String ID;
    private static final String VALUE;
    private static final String ark;
    private final DataLayer aqn;

    public w(DataLayer datalayer)
    {
        super(ID, new String[] {
            VALUE
        });
        aqn = datalayer;
    }

    private void a(com.google.android.gms.internal.d.a a1)
    {
        if (a1 != null && a1 != di.qV())
        {
            if ((a1 = di.j(a1)) != di.ra())
            {
                aqn.cx(a1);
                return;
            }
        }
    }

    private void b(com.google.android.gms.internal.d.a a1)
    {
        if (a1 != null && a1 != di.qV())
        {
            if ((a1 = ((com.google.android.gms.internal.d.a) (di.o(a1)))) instanceof List)
            {
                a1 = ((List)a1).iterator();
                while (a1.hasNext()) 
                {
                    Object obj = a1.next();
                    if (obj instanceof Map)
                    {
                        obj = (Map)obj;
                        aqn.push(((Map) (obj)));
                    }
                }
            }
        }
    }

    public void D(Map map)
    {
        b((com.google.android.gms.internal.d.a)map.get(VALUE));
        a((com.google.android.gms.internal.d.a)map.get(ark));
    }

    static 
    {
        ID = a.ah.toString();
        VALUE = b.ff.toString();
        ark = b.bS.toString();
    }
}
