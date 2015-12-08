// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ppk extends qlq
{

    private static volatile ppk a[];
    private int b[];
    private String c;

    public ppk()
    {
        b = qmb.a;
        c = null;
        F = null;
        G = -1;
    }

    public static ppk[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new ppk[0];
                }
            }
        }
        return a;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        int i = 0;
        int l = super.a();
        int k;
        if (b != null && b.length > 0)
        {
            int j = 0;
            for (; i < b.length; i++)
            {
                j += qlp.b(b[i]);
            }

            i = l + j + b.length * 1;
        } else
        {
            i = l;
        }
        k = i;
        if (c != null)
        {
            k = i + qlp.b(2, c);
        }
        return k;
    }

    public final qlw a(qlo qlo1)
    {
_L20:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 4: default 52
    //                   0: 62
    //                   8: 64
    //                   10: 296
    //                   18: 590;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.a(qlo1, i))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        int ai[];
        int j;
        int i1;
        i1 = qmb.b(qlo1, 8);
        ai = new int[i1];
        j = 0;
        i = 0;
_L12:
        if (j >= i1) goto _L7; else goto _L6
_L6:
        int j1;
        if (j != 0)
        {
            qlo1.a();
        }
        j1 = qlo1.i();
        j1;
        JVM INSTR tableswitch 0 13: default 180
    //                   0 189
    //                   1 189
    //                   2 189
    //                   3 189
    //                   4 189
    //                   5 189
    //                   6 189
    //                   7 189
    //                   8 189
    //                   9 189
    //                   10 189
    //                   11 189
    //                   12 189
    //                   13 189;
           goto _L8 _L9 _L9 _L9 _L9 _L9 _L9 _L9 _L9 _L9 _L9 _L9 _L9 _L9 _L9
_L8:
        j++;
          goto _L10
_L9:
        int k = i + 1;
        ai[i] = j1;
        i = k;
        if (true) goto _L8; else goto _L10
_L10:
        if (true) goto _L12; else goto _L11
_L11:
_L7:
        if (i != 0)
        {
            if (b == null)
            {
                j = 0;
            } else
            {
                j = b.length;
            }
            if (j == 0 && i == ai.length)
            {
                b = ai;
            } else
            {
                int ai1[] = new int[j + i];
                if (j != 0)
                {
                    System.arraycopy(b, 0, ai1, 0, j);
                }
                System.arraycopy(ai, 0, ai1, j, i);
                b = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int l;
        l = qlo1.c(qlo1.i());
        i = qlo1.o();
        j = 0;
_L18:
        if (qlo1.m() > 0)
        {
            switch (qlo1.i())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j == 0) goto _L14; else goto _L13
_L13:
        qlo1.e(i);
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.length;
        }
        ai = new int[j + i];
        j = i;
        if (i != 0)
        {
            System.arraycopy(b, 0, ai, 0, i);
            j = i;
        }
_L16:
        if (qlo1.m() > 0)
        {
            i = qlo1.i();
            switch (i)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
                ai[j] = i;
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        b = ai;
          goto _L14
        if (true) goto _L16; else goto _L15
_L15:
        if (true) goto _L18; else goto _L17
_L17:
_L14:
        qlo1.d(l);
        continue; /* Loop/switch isn't completed */
_L5:
        c = qlo1.g();
        if (true) goto _L20; else goto _L19
_L19:
    }

    public final void a(qlp qlp1)
    {
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                qlp1.a(1, b[i]);
            }

        }
        if (c != null)
        {
            qlp1.a(2, c);
        }
        super.a(qlp1);
    }
}
