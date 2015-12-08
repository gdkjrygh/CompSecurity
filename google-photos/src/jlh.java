// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jlh
{

    private static final int a[] = {
        jno.c("isom"), jno.c("iso2"), jno.c("avc1"), jno.c("hvc1"), jno.c("hev1"), jno.c("mp41"), jno.c("mp42"), jno.c("3g2a"), jno.c("3g2b"), jno.c("3gr6"), 
        jno.c("3gs6"), jno.c("3ge6"), jno.c("3gg6"), jno.c("M4V "), jno.c("M4A "), jno.c("f4v "), jno.c("kddi"), jno.c("M4VP"), jno.c("qt  "), jno.c("MSNV")
    };

    public static boolean a(jke jke1)
    {
        return a(jke1, 4096, true);
    }

    private static boolean a(jke jke1, int i, boolean flag)
    {
        jnl jnl1;
        int k;
        int i1;
        boolean flag2;
        long l2;
label0:
        {
            long l4 = jke1.c();
            if (l4 != -1L)
            {
                l2 = l4;
                if (l4 <= (long)i)
                {
                    break label0;
                }
            }
            l2 = i;
        }
        i1 = (int)l2;
        jnl1 = new jnl(64);
        i = 0;
        flag2 = false;
        k = 0;
_L19:
        boolean flag1 = flag2;
        if (k >= i1) goto _L2; else goto _L1
_L1:
        jke1.c(jnl1.a, 0, 8);
        jnl1.b(0);
        long l3 = jnl1.g();
        int l = jnl1.h();
        int ai[];
        int j;
        int j1;
        int k1;
        int l1;
        if (l3 == 1L)
        {
            jke1.c(jnl1.a, 8, 8);
            l3 = jnl1.i();
            j = 16;
        } else
        {
            j = 8;
        }
        if (l3 < (long)j)
        {
            return false;
        }
        j = (int)l3 - j;
        if (l != jkx.a) goto _L4; else goto _L3
_L3:
        if (j < 8)
        {
            return false;
        }
        j1 = (j - 8) / 4;
        jke1.c(jnl1.a, 0, (j1 + 2) * 4);
        l = 0;
_L13:
        j = i;
        if (l >= j1 + 2) goto _L6; else goto _L5
_L5:
        if (l == 1) goto _L8; else goto _L7
_L7:
        k1 = jnl1.h();
        if (k1 >>> 8 != jno.c("3gp")) goto _L10; else goto _L9
_L9:
        j = 1;
_L11:
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j = 1;
_L6:
        l = j;
        if (j == 0)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L10:
        ai = a;
        l1 = ai.length;
        j = 0;
        do
        {
            if (j >= l1)
            {
                break;
            }
            if (ai[j] == k1)
            {
                j = 1;
                continue; /* Loop/switch isn't completed */
            }
            j++;
        } while (true);
        j = 0;
        if (true) goto _L11; else goto _L8
_L8:
        l++;
        if (true) goto _L13; else goto _L12
_L4:
        if (l != jkx.G) goto _L15; else goto _L14
_L14:
        flag1 = true;
_L2:
        return i != 0 && flag == flag1;
_L15:
        l = i;
        if (j == 0) goto _L12; else goto _L16
_L16:
        flag1 = flag2;
        if ((long)k + l3 >= (long)i1) goto _L2; else goto _L17
_L17:
        jke1.b(j);
        l = i;
_L12:
        k = (int)((long)k + l3);
        i = l;
        if (true) goto _L19; else goto _L18
_L18:
    }

    public static boolean b(jke jke1)
    {
        return a(jke1, 128, false);
    }

}
