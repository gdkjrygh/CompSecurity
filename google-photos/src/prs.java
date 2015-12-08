// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class prs extends qlq
{

    private int a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;

    public prs()
    {
        a = 0x80000000;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j1 = super.a() + qlp.e(1, a);
        int i1 = j1;
        if (b != null)
        {
            i1 = j1 + qlp.b(2, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + qlp.b(3, c);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + qlp.b(4, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + qlp.b(5, e);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + qlp.b(6, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + qlp.b(7, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + qlp.b(8, h);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + qlp.b(9, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + qlp.b(10, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + qlp.b(11, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + qlp.b(12, l);
        }
        return i1;
    }

    public final qlw a(qlo qlo1)
    {
_L15:
        int i1 = qlo1.a();
        i1;
        JVM INSTR lookupswitch 13: default 120
    //                   0: 129
    //                   8: 131
    //                   18: 171
    //                   26: 182
    //                   34: 193
    //                   42: 204
    //                   50: 215
    //                   58: 226
    //                   66: 237
    //                   74: 248
    //                   82: 259
    //                   90: 270
    //                   98: 281;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        if (super.a(qlo1, i1)) goto _L15; else goto _L2
_L2:
        return this;
_L3:
        int j1 = qlo1.i();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
            a = j1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L5:
        c = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L6:
        d = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L7:
        e = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L8:
        f = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L9:
        g = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L10:
        h = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L11:
        i = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L12:
        j = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L13:
        k = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L14:
        l = qlo1.g();
        if (true) goto _L15; else goto _L16
_L16:
    }

    public final void a(qlp qlp1)
    {
        qlp1.a(1, a);
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
            qlp1.a(4, d);
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
            qlp1.a(8, h);
        }
        if (i != null)
        {
            qlp1.a(9, i);
        }
        if (j != null)
        {
            qlp1.a(10, j);
        }
        if (k != null)
        {
            qlp1.a(11, k);
        }
        if (l != null)
        {
            qlp1.a(12, l);
        }
        super.a(qlp1);
    }
}
