// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bid
{

    private final cmi a;
    private final long b[];
    private final cos c;

    public bid(cmi cmi1, long al[], cos cos)
    {
        b.a(cmi1, "metrics", null);
        b.a(al, "timestamps", null);
        b.a(cos, "field", null);
        a = cmi1;
        b = al;
        c = cos;
    }

    public final cob a()
    {
        cob cob1;
        float af[];
        float af1[];
        long al[];
        int i;
        int j;
        boolean flag;
        int i1;
        af1 = null;
        flag = false;
        al = b;
        i1 = al.length;
        j = 0;
        i = 0;
        af = null;
        cob1 = null;
_L2:
        int l;
        if (j >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        long l1 = al[j];
        cob cob2 = (cob)a.a(c, l1);
        if (cob2 != null)
        {
            l = i + 1;
            if (l == 1)
            {
                cob1 = new cob(cob2.a, cob2.b);
                af = new float[cob2.b()];
                af1 = new float[cob2.b()];
            }
            for (i = 0; i < af.length; i++)
            {
                float f = cob2.c[i] - af[i];
                af[i] = af[i] + f / (float)l;
                float f2 = af1[i];
                af1[i] = f * (cob2.c[i] - af[i]) + f2;
            }

            break MISSING_BLOCK_LABEL_252;
        }
_L3:
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        if (cob1 != null)
        {
            for (int k = ((flag) ? 1 : 0); k < af.length; k++)
            {
                float f1 = (float)Math.sqrt(af1[k] / (float)i);
                cob1.c[k] = f1;
            }

        }
        return cob1;
        i = l;
          goto _L3
    }

    public cob a(boolean flag)
    {
        float af[] = null;
        boolean flag1 = false;
        float f = 0.0F;
        long al[] = b;
        int i1 = al.length;
        int j = 0;
        int i = 0;
        cob cob1 = null;
        for (; j < i1; j++)
        {
            long l1 = al[j];
            cob cob3 = (cob)a.a(c, l1);
            if (cob3 == null)
            {
                continue;
            }
            cob cob2 = cob1;
            if (cob1 == null)
            {
                cob2 = new cob(cob3.a, cob3.b);
                af = cob2.c;
            }
            for (int l = 0; l < af.length; l++)
            {
                float f1 = cob3.c[l];
                af[l] = af[l] + f1;
                f += f1;
            }

            i++;
            cob1 = cob2;
        }

        if (af != null)
        {
            int k = ((flag1) ? 1 : 0);
            while (k < af.length) 
            {
                float f2;
                if (flag)
                {
                    f2 = af[k] / f;
                } else
                {
                    f2 = af[k] / (float)i;
                }
                af[k] = f2;
                k++;
            }
        }
        return cob1;
    }
}
