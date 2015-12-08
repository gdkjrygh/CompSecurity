// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pez extends qlq
{

    private static volatile pez i[];
    public Long a;
    public int b;
    public Integer c;
    public pfb d;
    public pfd e;
    public pfa f;
    public pfc g;
    public Boolean h;

    public pez()
    {
        a = null;
        b = 0x80000000;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        F = null;
        G = -1;
    }

    public static pez[] b()
    {
        if (i == null)
        {
            synchronized (qlu.a)
            {
                if (i == null)
                {
                    i = new pez[0];
                }
            }
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        int k = super.a();
        int j = k;
        if (a != null)
        {
            j = k + qlp.e(1, a.longValue());
        }
        k = j;
        if (b != 0x80000000)
        {
            k = j + qlp.e(2, b);
        }
        j = k;
        if (c != null)
        {
            j = k + qlp.e(4, c.intValue());
        }
        k = j;
        if (d != null)
        {
            k = j + qlp.c(5, d);
        }
        j = k;
        if (e != null)
        {
            j = k + qlp.c(6, e);
        }
        k = j;
        if (f != null)
        {
            k = j + qlp.c(7, f);
        }
        j = k;
        if (g != null)
        {
            j = k + qlp.c(8, g);
        }
        k = j;
        if (h != null)
        {
            h.booleanValue();
            k = j + (qlp.c(9) + 1);
        }
        return k;
    }

    public final qlw a(qlo qlo1)
    {
_L11:
        int j = qlo1.a();
        j;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 97
    //                   8: 99
    //                   16: 113
    //                   32: 167
    //                   42: 181
    //                   50: 210
    //                   58: 239
    //                   66: 268
    //                   72: 297;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.a(qlo1, j)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        a = Long.valueOf(qlo1.j());
          goto _L11
_L4:
        int k = qlo1.i();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            b = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        c = Integer.valueOf(qlo1.i());
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new pfb();
        }
        qlo1.a(d);
        continue; /* Loop/switch isn't completed */
_L7:
        if (e == null)
        {
            e = new pfd();
        }
        qlo1.a(e);
        continue; /* Loop/switch isn't completed */
_L8:
        if (f == null)
        {
            f = new pfa();
        }
        qlo1.a(f);
        continue; /* Loop/switch isn't completed */
_L9:
        if (g == null)
        {
            g = new pfc();
        }
        qlo1.a(g);
        continue; /* Loop/switch isn't completed */
_L10:
        h = Boolean.valueOf(qlo1.f());
        if (true) goto _L11; else goto _L12
_L12:
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.b(1, a.longValue());
        }
        if (b != 0x80000000)
        {
            qlp1.a(2, b);
        }
        if (c != null)
        {
            qlp1.a(4, c.intValue());
        }
        if (d != null)
        {
            qlp1.a(5, d);
        }
        if (e != null)
        {
            qlp1.a(6, e);
        }
        if (f != null)
        {
            qlp1.a(7, f);
        }
        if (g != null)
        {
            qlp1.a(8, g);
        }
        if (h != null)
        {
            qlp1.a(9, h.booleanValue());
        }
        super.a(qlp1);
    }
}
