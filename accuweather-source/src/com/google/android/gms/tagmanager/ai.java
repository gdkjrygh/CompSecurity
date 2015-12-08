// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            dh, DataLayer, bh

class ai
{

    private static void a(DataLayer datalayer, com.google.android.gms.internal.c.d d)
    {
        d = d.eS;
        int j = d.length;
        for (int i = 0; i < j; i++)
        {
            datalayer.bN(dh.j(d[i]));
        }

    }

    public static void a(DataLayer datalayer, com.google.android.gms.internal.c.i i)
    {
        if (i.fI == null)
        {
            bh.D("supplemental missing experimentSupplemental");
            return;
        } else
        {
            a(datalayer, i.fI);
            b(datalayer, i.fI);
            c(datalayer, i.fI);
            return;
        }
    }

    private static void b(DataLayer datalayer, com.google.android.gms.internal.c.d d)
    {
        d = d.eR;
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
        a1 = ((com.google.android.gms.internal.d.a) (dh.o(a1)));
        if (!(a1 instanceof Map))
        {
            bh.D((new StringBuilder()).append("value: ").append(a1).append(" is not a map value, ignored.").toString());
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
        ac = d.eT;
        j = ac.length;
        i = 0;
_L2:
        com.google.android.gms.internal.c.c c1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_291;
        }
        c1 = ac[i];
        if (c1.eM != null)
        {
            break; /* Loop/switch isn't completed */
        }
        bh.D("GaExperimentRandom: No key");
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
label0:
        {
            Object obj = datalayer.get(c1.eM);
            long l;
            long l1;
            if (!(obj instanceof Number))
            {
                d = null;
            } else
            {
                d = Long.valueOf(((Number)obj).longValue());
            }
            l = c1.eN;
            l1 = c1.eO;
            if (!c1.eP || d == null || d.longValue() < l || d.longValue() > l1)
            {
                if (l > l1)
                {
                    break label0;
                }
                obj = Long.valueOf(Math.round(Math.random() * (double)(l1 - l) + (double)l));
            }
            datalayer.bN(c1.eM);
            d = datalayer.c(c1.eM, obj);
            if (c1.eQ > 0L)
            {
                if (!d.containsKey("gtm"))
                {
                    d.put("gtm", DataLayer.mapOf(new Object[] {
                        "lifetime", Long.valueOf(c1.eQ)
                    }));
                } else
                {
                    Object obj1 = d.get("gtm");
                    if (obj1 instanceof Map)
                    {
                        ((Map)obj1).put("lifetime", Long.valueOf(c1.eQ));
                    } else
                    {
                        bh.D("GaExperimentRandom: gtm not a map");
                    }
                }
            }
            datalayer.push(d);
        }
          goto _L3
        bh.D("GaExperimentRandom: random range invalid");
          goto _L3
          goto _L3
    }
}
