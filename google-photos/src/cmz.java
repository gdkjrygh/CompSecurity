// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;

abstract class cmz
    implements cmx
{

    public final cos a;
    private final float b;
    private final float c;
    private final int d;

    public cmz(float f, float f1, int i, cos cos)
    {
        b = f;
        c = f1;
        d = i;
        a = cos;
    }

    public final Object a(cmi cmi1, long al[])
    {
        boolean flag;
        flag = false;
        cmi1 = b(cmi1, al);
        if (!cmi1.isEmpty()) goto _L2; else goto _L1
_L1:
        cmi1 = new float[d];
_L4:
        return cmi1;
_L2:
        crj crj1 = new crj(b, c, d);
        cmi1 = cmi1.iterator();
        while (cmi1.hasNext()) 
        {
            float f = ((Float)cmi1.next()).floatValue();
            float f2 = (crj1.b - crj1.a) / (float)crj1.c;
            int k = (int)Math.floor((f - crj1.a) / f2);
            int i;
            if (k >= crj1.c)
            {
                i = crj1.c - 1;
            } else
            {
                i = k;
                if (k < 0)
                {
                    i = 0;
                }
            }
            al = crj1.d;
            al[i] = al[i] + 1;
        }
        int j = 0;
        float f1 = 0.0F;
        for (; j < crj1.d.length; j++)
        {
            f1 += crj1.d[j];
        }

        if (f1 == 0.0F)
        {
            throw new RuntimeException("The histogram has no counts. Hence, it can't no normalized.");
        }
        al = new float[crj1.d.length];
        j = ((flag) ? 1 : 0);
        do
        {
            cmi1 = al;
            if (j >= crj1.d.length)
            {
                continue;
            }
            al[j] = (float)crj1.d[j] / f1;
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected ArrayList b(cmi cmi1, long al[])
    {
        if (a == null)
        {
            throw new RuntimeException("Field type is null. Cannot extract values.");
        }
        ArrayList arraylist = new ArrayList();
        int j = al.length;
        for (int i = 0; i < j; i++)
        {
            long l = al[i];
            Float float1 = (Float)cmi1.a(a, l);
            if (float1 != null)
            {
                arraylist.add(float1);
            }
        }

        return arraylist;
    }
}
