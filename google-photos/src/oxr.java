// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class oxr extends qlq
{

    private oxw a;
    private qmg b;
    private oxt c;
    private Long d;
    private String e;
    private oxs f;
    private String g;
    private Boolean h;
    private int i;
    private oxv j;

    public oxr()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = 0x80000000;
        j = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int l = super.a();
        int k = l;
        if (a != null)
        {
            k = l + qlp.c(1, a);
        }
        l = k;
        if (b != null)
        {
            l = k + qlp.c(2, b);
        }
        k = l;
        if (c != null)
        {
            k = l + qlp.c(3, c);
        }
        l = k;
        if (d != null)
        {
            l = k + qlp.e(4, d.longValue());
        }
        k = l;
        if (e != null)
        {
            k = l + qlp.b(5, e);
        }
        l = k;
        if (f != null)
        {
            l = k + qlp.c(6, f);
        }
        k = l;
        if (g != null)
        {
            k = l + qlp.b(7, g);
        }
        l = k;
        if (h != null)
        {
            h.booleanValue();
            l = k + (qlp.c(8) + 1);
        }
        k = l;
        if (i != 0x80000000)
        {
            k = l + qlp.e(9, i);
        }
        l = k;
        if (j != null)
        {
            l = k + qlp.c(10, j);
        }
        return l;
    }

    public final qlw a(qlo qlo1)
    {
_L13:
        int k = qlo1.a();
        k;
        JVM INSTR lookupswitch 11: default 104
    //                   0: 113
    //                   10: 115
    //                   18: 144
    //                   26: 173
    //                   32: 202
    //                   42: 216
    //                   50: 227
    //                   58: 256
    //                   64: 267
    //                   72: 281
    //                   82: 327;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        if (super.a(qlo1, k)) goto _L13; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new oxw();
        }
        qlo1.a(a);
          goto _L13
_L4:
        if (b == null)
        {
            b = new qmg();
        }
        qlo1.a(b);
          goto _L13
_L5:
        if (c == null)
        {
            c = new oxt();
        }
        qlo1.a(c);
          goto _L13
_L6:
        d = Long.valueOf(qlo1.j());
          goto _L13
_L7:
        e = qlo1.g();
          goto _L13
_L8:
        if (f == null)
        {
            f = new oxs();
        }
        qlo1.a(f);
          goto _L13
_L9:
        g = qlo1.g();
          goto _L13
_L10:
        h = Boolean.valueOf(qlo1.f());
          goto _L13
_L11:
        int l = qlo1.i();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            i = l;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (j == null)
        {
            j = new oxv();
        }
        qlo1.a(j);
        if (true) goto _L13; else goto _L14
_L14:
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a);
        }
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (c != null)
        {
            qlp1.a(3, c);
        }
        if (d != null)
        {
            qlp1.b(4, d.longValue());
        }
        if (e != null)
        {
            qlp1.a(5, e);
        }
        if (f != null)
        {
            qlp1.a(6, f);
        }
        if (g != null)
        {
            qlp1.a(7, g);
        }
        if (h != null)
        {
            qlp1.a(8, h.booleanValue());
        }
        if (i != 0x80000000)
        {
            qlp1.a(9, i);
        }
        if (j != null)
        {
            qlp1.a(10, j);
        }
        super.a(qlp1);
    }
}
