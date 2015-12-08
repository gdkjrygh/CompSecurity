// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class jlq extends jlp
{

    private boolean b;
    private final jly c;
    private final boolean d[] = new boolean[3];
    private final jlr e;
    private final jlw f = new jlw(7, 128);
    private final jlw g = new jlw(8, 128);
    private final jlw h = new jlw(6, 128);
    private boolean i;
    private long j;
    private boolean k;
    private long l;
    private long m;
    private final jnl n = new jnl();

    public jlq(jkq jkq1, jly jly1, boolean flag)
    {
        super(jkq1);
        c = jly1;
        if (flag)
        {
            jkq1 = null;
        } else
        {
            jkq1 = new jlr();
        }
        e = jkq1;
    }

    private void a(byte abyte0[], int i1, int j1)
    {
        if (e == null) goto _L2; else goto _L1
_L1:
        jlr jlr1 = e;
        if (!jlr1.d) goto _L2; else goto _L3
_L3:
        int k1;
        k1 = j1 - i1;
        if (jlr1.b.length < jlr1.c + k1)
        {
            jlr1.b = Arrays.copyOf(jlr1.b, jlr1.c + k1 << 1);
        }
        System.arraycopy(abyte0, i1, jlr1.b, jlr1.c, k1);
        jlr1.c = k1 + jlr1.c;
        jnk jnk1 = jlr1.a;
        byte abyte1[] = jlr1.b;
        k1 = jlr1.c;
        jnk1.a = abyte1;
        jnk1.b = 0;
        jnk1.c = 0;
        jnk1.d = k1;
        jlr1.a.b(8);
        k1 = jlr1.a.c();
        if (k1 != -1 && k1 <= jlr1.a.a()) goto _L4; else goto _L2
_L2:
        if (!b)
        {
            f.a(abyte0, i1, j1);
            g.a(abyte0, i1, j1);
        }
        h.a(abyte0, i1, j1);
        return;
_L4:
        jlr1.a.b(k1);
        k1 = jlr1.a.c();
        if (k1 != -1 && k1 <= jlr1.a.a())
        {
            jlr1.e = jlr1.a.e();
            jlr1.d = false;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final void a()
    {
        jly jly1 = c;
        jnj.a(d);
        f.a();
        g.a();
        h.a();
        if (e != null)
        {
            e.a();
        }
        i = false;
        j = 0L;
    }

    public final void a(jnl jnl1, long l1, boolean flag)
    {
_L8:
        byte abyte0[];
        int i1;
        int j1;
        if (jnl1.b() <= 0)
        {
            break MISSING_BLOCK_LABEL_731;
        }
        i1 = jnl1.b;
        j1 = jnl1.c;
        abyte0 = jnl1.a;
        j = j + (long)jnl1.b();
        a.a(jnl1, jnl1.b());
_L6:
        int k1;
        int i2;
        int j2;
        int k2;
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = jnj.a(abyte0, i1, j1, d);
        if (k1 >= j1)
        {
            break MISSING_BLOCK_LABEL_714;
        }
        j2 = k1 - i1;
        if (j2 > 0)
        {
            a(abyte0, i1, k1);
        }
        i2 = jnj.b(abyte0, k1);
        k2 = j1 - k1;
        i2;
        JVM INSTR lookupswitch 2: default 148
    //                   5: 319
    //                   9: 327;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_327;
_L4:
        Object obj;
        Object obj1;
        byte abyte1[];
        byte abyte2[];
        int l2;
        if (j2 < 0)
        {
            i1 = -j2;
        } else
        {
            i1 = 0;
        }
        f.b(i1);
        g.b(i1);
        if (h.b(i1))
        {
            i1 = jnj.a(h.b, h.c);
            n.a(h.b, i1);
            n.b(4);
            c.a(n, l1, true);
        }
        if (e != null)
        {
            jlr jlr1 = e;
            if (i2 == 1)
            {
                jlr1.a();
                jlr1.d = true;
            }
        }
        if (!b)
        {
            f.a(i2);
            g.a(i2);
        }
        h.a(i2);
        i1 = k1 + 3;
        continue; /* Loop/switch isn't completed */
_L2:
        k = true;
          goto _L4
        if (i)
        {
            if (e != null)
            {
                if (e.e != -1)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (i1 != 0)
                {
                    i1 = e.e;
                    flag = k;
                    if (i1 == 2 || i1 == 7)
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                    k = i1 | flag;
                    e.a();
                }
            }
            if (k && !b && f.a && g.a)
            {
                obj1 = f;
                obj = g;
                abyte1 = new byte[((jlw) (obj1)).c];
                abyte2 = new byte[((jlw) (obj)).c];
                System.arraycopy(((jlw) (obj1)).b, 0, abyte1, 0, ((jlw) (obj1)).c);
                System.arraycopy(((jlw) (obj)).b, 0, abyte2, 0, ((jlw) (obj)).c);
                obj = new ArrayList();
                ((List) (obj)).add(abyte1);
                ((List) (obj)).add(abyte2);
                jnj.a(((jlw) (obj1)).b, ((jlw) (obj1)).c);
                obj1 = new jnk(((jlw) (obj1)).b);
                ((jnk) (obj1)).b(32);
                obj1 = jnf.a(((jnk) (obj1)));
                a.a(jjh.a(-1, "video/avc", -1, -1, -1L, ((jng) (obj1)).a, ((jng) (obj1)).b, ((List) (obj)), -1, ((jng) (obj1)).c));
                b = true;
            }
            if (k)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            l2 = (int)(j - l);
            a.a(m, i1, l2 - k2, k2, null);
        }
        i = true;
        l = j - (long)k2;
        m = l1;
        k = false;
          goto _L4
        a(abyte0, i1, j1);
        i1 = j1;
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void b()
    {
    }
}
