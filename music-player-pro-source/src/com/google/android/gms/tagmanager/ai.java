// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            di, DataLayer, bh

class ai
{

    private static void a(DataLayer datalayer, com.google.android.gms.internal.c.d d)
    {
        d = d.fB;
        int j = d.length;
        for (int i = 0; i < j; i++)
        {
            datalayer.cx(di.j(d[i]));
        }

    }

    public static void a(DataLayer datalayer, com.google.android.gms.internal.c.i i)
    {
        if (i.gq == null)
        {
            bh.W("supplemental missing experimentSupplemental");
            return;
        } else
        {
            a(datalayer, i.gq);
            b(datalayer, i.gq);
            c(datalayer, i.gq);
            return;
        }
    }

    private static void b(DataLayer datalayer, com.google.android.gms.internal.c.d d)
    {
        d = d.fA;
        int j = d.length;
        for (int i = 0; i < j; i++)
        {
            Map map = c(d[i]);
            if (map != null)
            {
                datalayer.push(map);
            }
        }

    }

    private static Map c(com.google.android.gms.internal.d.a a1)
    {
        a1 = ((com.google.android.gms.internal.d.a) (di.o(a1)));
        if (!(a1 instanceof Map))
        {
            bh.W((new StringBuilder()).append("value: ").append(a1).append(" is not a map value, ignored.").toString());
            return null;
        } else
        {
            return (Map)a1;
        }
    }

    private static void c(DataLayer datalayer, com.google.android.gms.internal.c.d d)
    {
        com.google.android.gms.internal.c.c ac[];
        int i;
        int j;
        ac = d.fC;
        j = ac.length;
        i = 0;
_L2:
        com.google.android.gms.internal.c.c c1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_291;
        }
        c1 = ac[i];
        if (c1.fv != null)
        {
            break; /* Loop/switch isn't completed */
        }
        bh.W("GaExperimentRandom: No key");
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
label0:
        {
            Object obj = datalayer.get(c1.fv);
            long l;
            long l1;
            if (!(obj instanceof Number))
            {
                d = null;
            } else
            {
                d = Long.valueOf(((Number)obj).longValue());
            }
            l = c1.fw;
            l1 = c1.fx;
            if (!c1.fy || d == null || d.longValue() < l || d.longValue() > l1)
            {
                if (l > l1)
                {
                    break label0;
                }
                obj = Long.valueOf(Math.round(Math.random() * (double)(l1 - l) + (double)l));
            }
            datalayer.cx(c1.fv);
            d = datalayer.c(c1.fv, obj);
            if (c1.fz > 0L)
            {
                if (!d.containsKey("gtm"))
                {
                    d.put("gtm", DataLayer.mapOf(new Object[] {
                        "lifetime", Long.valueOf(c1.fz)
                    }));
                } else
                {
                    Object obj1 = d.get("gtm");
                    if (obj1 instanceof Map)
                    {
                        ((Map)obj1).put("lifetime", Long.valueOf(c1.fz));
                    } else
                    {
                        bh.W("GaExperimentRandom: gtm not a map");
                    }
                }
            }
            datalayer.push(d);
        }
          goto _L3
        bh.W("GaExperimentRandom: random range invalid");
          goto _L3
          goto _L3
    }
}
