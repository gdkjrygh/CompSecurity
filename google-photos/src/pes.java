// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pes extends qlq
{

    public pet a;
    public pet b[];
    private pek c;
    private String d;
    private String e;
    private Boolean f;
    private Boolean g;
    private int h;

    public pes()
    {
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        a = null;
        b = pet.b();
        h = 0x80000000;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (c != null)
        {
            i = j + qlp.c(1, c);
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.b(2, d);
        }
        i = j;
        if (e != null)
        {
            i = j + qlp.b(3, e);
        }
        j = i;
        if (f != null)
        {
            f.booleanValue();
            j = i + (qlp.c(4) + 1);
        }
        int k = j;
        if (g != null)
        {
            g.booleanValue();
            k = j + (qlp.c(7) + 1);
        }
        i = k;
        if (a != null)
        {
            i = k + qlp.c(8, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    pet pet1 = b[j];
                    int l = i;
                    if (pet1 != null)
                    {
                        l = i + qlp.c(9, pet1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (h != 0x80000000)
        {
            i = j + qlp.e(10, h);
        }
        return i;
    }

    public final qlw a(qlo qlo1)
    {
_L11:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 97
    //                   10: 99
    //                   18: 128
    //                   26: 139
    //                   32: 150
    //                   56: 164
    //                   66: 178
    //                   74: 207
    //                   80: 331;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.a(qlo1, i)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        if (c == null)
        {
            c = new pek();
        }
        qlo1.a(c);
          goto _L11
_L4:
        d = qlo1.g();
          goto _L11
_L5:
        e = qlo1.g();
          goto _L11
_L6:
        f = Boolean.valueOf(qlo1.f());
          goto _L11
_L7:
        g = Boolean.valueOf(qlo1.f());
          goto _L11
_L8:
        if (a == null)
        {
            a = new pet();
        }
        qlo1.a(a);
          goto _L11
_L9:
        int l = qmb.b(qlo1, 74);
        pet apet[];
        int j;
        if (b == null)
        {
            j = 0;
        } else
        {
            j = b.length;
        }
        apet = new pet[l + j];
        l = j;
        if (j != 0)
        {
            System.arraycopy(b, 0, apet, 0, j);
            l = j;
        }
        for (; l < apet.length - 1; l++)
        {
            apet[l] = new pet();
            qlo1.a(apet[l]);
            qlo1.a();
        }

        apet[l] = new pet();
        qlo1.a(apet[l]);
        b = apet;
          goto _L11
_L10:
        int k = qlo1.i();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            h = k;
            break;
        }
        if (true) goto _L11; else goto _L12
_L12:
    }

    public final void a(qlp qlp1)
    {
        if (c != null)
        {
            qlp1.a(1, c);
        }
        if (d != null)
        {
            qlp1.a(2, d);
        }
        if (e != null)
        {
            qlp1.a(3, e);
        }
        if (f != null)
        {
            qlp1.a(4, f.booleanValue());
        }
        if (g != null)
        {
            qlp1.a(7, g.booleanValue());
        }
        if (a != null)
        {
            qlp1.a(8, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                pet pet1 = b[i];
                if (pet1 != null)
                {
                    qlp1.a(9, pet1);
                }
            }

        }
        if (h != 0x80000000)
        {
            qlp1.a(10, h);
        }
        super.a(qlp1);
    }
}
