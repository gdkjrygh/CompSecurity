// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class ogv extends msm
{

    public final qzn b;
    public final Integer c;

    private transient ogv(msp msp, Integer integer, ogw aogw[])
    {
        super(msp);
        b = new qzn();
        b.a = new qzo[aogw.length];
        for (int i = 0; i < aogw.length; i++)
        {
            msp = b.a;
            integer = aogw[i];
            qzo qzo1 = new qzo();
            qzo1.a = Integer.valueOf(((ogw) (integer)).a);
            if (((ogw) (integer)).b != null)
            {
                qzo1.b = ((ogw) (integer)).b;
            }
            if (((ogw) (integer)).c != null)
            {
                qzo1.c = ((ogw) (integer)).c;
            }
            msp[i] = qzo1;
        }

        c = null;
    }

    public transient ogv(msp msp, ogw aogw[])
    {
        this(msp, null, aogw);
    }

    public final boolean equals(Object obj)
    {
        if (!super.equals(obj)) goto _L2; else goto _L1
_L1:
        obj = (ogv)obj;
        if (!c.c(c, ((ogv) (obj)).c) || b.a.length != ((ogv) (obj)).b.a.length) goto _L2; else goto _L3
_L3:
        int i = 0;
_L6:
        qzo qzo1;
        qzo qzo2;
        if (i >= b.a.length)
        {
            break; /* Loop/switch isn't completed */
        }
        qzo1 = b.a[i];
        qzo2 = ((ogv) (obj)).b.a[i];
        if (c.c(qzo1.a, qzo2.a) && c.c(qzo1.b, qzo2.b) && c.c(qzo1.c, qzo2.c)) goto _L4; else goto _L2
_L2:
        return false;
_L4:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        return true;
    }

    public final int hashCode()
    {
        qzo aqzo[] = b.a;
        int ai[] = new int[aqzo.length];
        for (int i = 0; i < aqzo.length; i++)
        {
            ai[i] = Arrays.hashCode(new Object[] {
                aqzo[i].b, aqzo[i].a, aqzo[i].c
            });
        }

        return Arrays.hashCode(new Object[] {
            Integer.valueOf(Arrays.hashCode(ai)), c, Integer.valueOf(super.hashCode())
        });
    }
}
