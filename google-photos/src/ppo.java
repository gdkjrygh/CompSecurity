// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ppo extends qlq
{

    private int a[];

    public ppo()
    {
        a = qmb.a;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int i = 0;
        int k = super.a();
        if (a != null && a.length > 0)
        {
            int j = 0;
            for (; i < a.length; i++)
            {
                j += qlp.b(a[i]);
            }

            return k + j + a.length * 1;
        } else
        {
            return k;
        }
    }

    public final qlw a(qlo qlo1)
    {
_L19:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 3: default 44
    //                   0: 54
    //                   8: 56
    //                   10: 296;
           goto _L1 _L2 _L3 _L4
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
_L11:
        if (j >= i1) goto _L6; else goto _L5
_L5:
        int j1;
        if (j != 0)
        {
            qlo1.a();
        }
        j1 = qlo1.i();
        j1;
        JVM INSTR tableswitch 0 15: default 180
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
    //                   10 180
    //                   11 189
    //                   12 189
    //                   13 189
    //                   14 189
    //                   15 189;
           goto _L7 _L8 _L8 _L8 _L8 _L8 _L8 _L8 _L8 _L8 _L8 _L7 _L8 _L8 _L8 _L8 _L8
_L7:
        j++;
          goto _L9
_L8:
        int k = i + 1;
        ai[i] = j1;
        i = k;
        if (true) goto _L7; else goto _L9
_L9:
        if (true) goto _L11; else goto _L10
_L10:
_L6:
        if (i != 0)
        {
            if (a == null)
            {
                j = 0;
            } else
            {
                j = a.length;
            }
            if (j == 0 && i == ai.length)
            {
                a = ai;
            } else
            {
                int ai1[] = new int[j + i];
                if (j != 0)
                {
                    System.arraycopy(a, 0, ai1, 0, j);
                }
                System.arraycopy(ai, 0, ai1, j, i);
                a = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int l;
        l = qlo1.c(qlo1.i());
        i = qlo1.o();
        j = 0;
_L17:
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
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j == 0) goto _L13; else goto _L12
_L12:
        qlo1.e(i);
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.length;
        }
        ai = new int[j + i];
        j = i;
        if (i != 0)
        {
            System.arraycopy(a, 0, ai, 0, i);
            j = i;
        }
_L15:
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
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
                ai[j] = i;
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        a = ai;
          goto _L13
        if (true) goto _L15; else goto _L14
_L14:
        if (true) goto _L17; else goto _L16
_L16:
_L13:
        qlo1.d(l);
        if (true) goto _L19; else goto _L18
_L18:
    }

    public final void a(qlp qlp1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                qlp1.a(1, a[i]);
            }

        }
        super.a(qlp1);
    }
}
