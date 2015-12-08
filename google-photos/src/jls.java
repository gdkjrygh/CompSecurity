// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.Collections;

final class jls extends jlp
{

    private boolean b;
    private final jly c;
    private final boolean d[] = new boolean[3];
    private final jlw e = new jlw(32, 128);
    private final jlw f = new jlw(33, 128);
    private final jlw g = new jlw(34, 128);
    private final jlw h = new jlw(39, 128);
    private final jlw i = new jlw(40, 128);
    private final jlt j;
    private long k;
    private final jnl l = new jnl();

    public jls(jkq jkq1, jly jly1)
    {
        super(jkq1);
        c = jly1;
        j = new jlt(jkq1);
    }

    private void a(byte abyte0[], int i1, int j1)
    {
        if (b)
        {
            jlt jlt1 = j;
            if (jlt1.d)
            {
                int k1 = (i1 + 2) - jlt1.c;
                if (k1 < j1)
                {
                    boolean flag;
                    if ((abyte0[k1] & 0x80) != 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    jlt1.e = flag;
                    jlt1.d = false;
                } else
                {
                    jlt1.c = jlt1.c + (j1 - i1);
                }
            }
        } else
        {
            e.a(abyte0, i1, j1);
            f.a(abyte0, i1, j1);
            g.a(abyte0, i1, j1);
        }
        h.a(abyte0, i1, j1);
        i.a(abyte0, i1, j1);
    }

    public final void a()
    {
        Object obj = c;
        jnj.a(d);
        e.a();
        f.a();
        g.a();
        h.a();
        i.a();
        obj = j;
        obj.d = false;
        obj.e = false;
        obj.f = false;
        k = 0L;
    }

    public final void a(jnl jnl1, long l1, boolean flag)
    {
_L9:
        byte abyte0[];
        int i1;
        int j3;
        if (jnl1.b() <= 0)
        {
            break MISSING_BLOCK_LABEL_1700;
        }
        i1 = jnl1.b;
        j3 = jnl1.c;
        abyte0 = jnl1.a;
        k = k + (long)jnl1.b();
        a.a(jnl1, jnl1.b());
_L7:
        int i2;
        if (i1 >= j3)
        {
            break; /* Loop/switch isn't completed */
        }
        int k3 = jnj.a(abyte0, i1, j3, d);
        if (k3 >= j3)
        {
            break MISSING_BLOCK_LABEL_1683;
        }
        int j1 = k3 - i1;
        if (j1 > 0)
        {
            a(abyte0, i1, k3);
        }
        int l3 = j3 - k3;
        long l5 = k - (long)l3;
        jlt jlt1;
        if (j1 < 0)
        {
            i2 = -j1;
        } else
        {
            i2 = 0;
        }
        if (!b) goto _L2; else goto _L1
_L1:
        jlt1 = j;
        if (jlt1.e)
        {
            if (jlt1.f)
            {
                jlt1.a((int)(l5 - jlt1.a) + l3);
            }
            jlt1.g = jlt1.a;
            jlt1.h = l1;
            jlt1.f = true;
            jlt1.i = jlt1.b;
        }
_L4:
        if (h.b(i2))
        {
            i1 = jnj.a(h.b, h.c);
            l.a(h.b, i1);
            l.c(5);
            c.a(l, l1, true);
        }
        if (i.b(i2))
        {
            i1 = jnj.a(i.b, i.c);
            l.a(i.b, i1);
            l.c(5);
            c.a(l, l1, true);
        }
        i1 = jnj.c(abyte0, k3);
        if (!b)
        {
            e.a(i1);
            f.a(i1);
            g.a(i1);
        }
        h.a(i1);
        i.a(i1);
        jlt1 = j;
        jlt1.e = false;
        jlt1.c = 0;
        jlt1.a = l5;
        if (i1 >= 32 && jlt1.f)
        {
            jlt1.a(l3);
            jlt1.f = false;
        }
        float f1;
        float f2;
        byte abyte1[];
        Object obj;
        jlw jlw1;
        jlw jlw2;
        int k1;
        int j2;
        int k2;
        int l2;
        int i3;
        int i4;
        int j4;
        int k4;
        int l4;
        if (i1 >= 16 && i1 <= 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jlt1.b = flag;
        if (jlt1.b || i1 <= 9)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jlt1.d = flag;
        i1 = k3 + 3;
        continue; /* Loop/switch isn't completed */
_L2:
        e.b(i2);
        f.b(i2);
        g.b(i2);
        if (!e.a || !f.a || !g.a) goto _L4; else goto _L3
_L3:
        obj = e;
        jlw1 = f;
        jlw2 = g;
        abyte1 = new byte[((jlw) (obj)).c + jlw1.c + jlw2.c];
        System.arraycopy(((jlw) (obj)).b, 0, abyte1, 0, ((jlw) (obj)).c);
        System.arraycopy(jlw1.b, 0, abyte1, ((jlw) (obj)).c, jlw1.c);
        System.arraycopy(jlw2.b, 0, abyte1, ((jlw) (obj)).c + jlw1.c, jlw2.c);
        jnj.a(jlw1.b, jlw1.c);
        obj = new jnk(jlw1.b);
        ((jnk) (obj)).b(44);
        k2 = ((jnk) (obj)).c(3);
        ((jnk) (obj)).b(1);
        ((jnk) (obj)).b(88);
        ((jnk) (obj)).b(8);
        i1 = 0;
        for (j2 = 0; j2 < k2; j2++)
        {
            k1 = i1;
            if (((jnk) (obj)).c(1) == 1)
            {
                k1 = i1 + 89;
            }
            i1 = k1;
            if (((jnk) (obj)).c(1) == 1)
            {
                i1 = k1 + 8;
            }
        }

        ((jnk) (obj)).b(i1);
        if (k2 > 0)
        {
            ((jnk) (obj)).b((8 - k2) * 2);
        }
        ((jnk) (obj)).e();
        l4 = ((jnk) (obj)).e();
        if (l4 == 3)
        {
            ((jnk) (obj)).b(1);
        }
        i3 = ((jnk) (obj)).e();
        l2 = ((jnk) (obj)).e();
        j2 = i3;
        k1 = l2;
        if (((jnk) (obj)).b())
        {
            j2 = ((jnk) (obj)).e();
            k4 = ((jnk) (obj)).e();
            i4 = ((jnk) (obj)).e();
            j4 = ((jnk) (obj)).e();
            if (l4 == 1 || l4 == 2)
            {
                i1 = 2;
            } else
            {
                i1 = 1;
            }
            if (l4 == 1)
            {
                k1 = 2;
            } else
            {
                k1 = 1;
            }
            j2 = i3 - i1 * (j2 + k4);
            k1 = l2 - k1 * (i4 + j4);
        }
        ((jnk) (obj)).e();
        ((jnk) (obj)).e();
        i4 = ((jnk) (obj)).e();
        if (((jnk) (obj)).b())
        {
            i1 = 0;
        } else
        {
            i1 = k2;
        }
        for (; i1 <= k2; i1++)
        {
            ((jnk) (obj)).e();
            ((jnk) (obj)).e();
            ((jnk) (obj)).e();
        }

        ((jnk) (obj)).e();
        ((jnk) (obj)).e();
        ((jnk) (obj)).e();
        ((jnk) (obj)).e();
        ((jnk) (obj)).e();
        ((jnk) (obj)).e();
        if (((jnk) (obj)).b() && ((jnk) (obj)).b())
        {
            for (i1 = 0; i1 < 4; i1++)
            {
                k2 = 0;
                while (k2 < 6) 
                {
                    if (!((jnk) (obj)).b())
                    {
                        ((jnk) (obj)).e();
                    } else
                    {
                        i3 = Math.min(64, 1 << (i1 << 1) + 4);
                        if (i1 > 1)
                        {
                            ((jnk) (obj)).d();
                        }
                        l2 = 0;
                        while (l2 < i3) 
                        {
                            ((jnk) (obj)).d();
                            l2++;
                        }
                    }
                    if (i1 == 3)
                    {
                        l2 = 3;
                    } else
                    {
                        l2 = 1;
                    }
                    k2 = l2 + k2;
                }
            }

        }
        ((jnk) (obj)).b(2);
        if (((jnk) (obj)).b())
        {
            ((jnk) (obj)).b(8);
            ((jnk) (obj)).e();
            ((jnk) (obj)).e();
            ((jnk) (obj)).b(1);
        }
        j4 = ((jnk) (obj)).e();
        i1 = 0;
        l2 = 0;
        flag = false;
        while (i1 < j4) 
        {
            if (i1 != 0)
            {
                flag = ((jnk) (obj)).b();
            }
            if (flag)
            {
                ((jnk) (obj)).b(1);
                ((jnk) (obj)).e();
                i3 = 0;
                do
                {
                    k2 = l2;
                    if (i3 > l2)
                    {
                        break;
                    }
                    if (((jnk) (obj)).b())
                    {
                        ((jnk) (obj)).b(1);
                    }
                    i3++;
                } while (true);
            } else
            {
                l2 = ((jnk) (obj)).e();
                k4 = ((jnk) (obj)).e();
                i3 = l2 + k4;
                for (k2 = 0; k2 < l2; k2++)
                {
                    ((jnk) (obj)).e();
                    ((jnk) (obj)).b(1);
                }

                l2 = 0;
                do
                {
                    k2 = i3;
                    if (l2 >= k4)
                    {
                        break;
                    }
                    ((jnk) (obj)).e();
                    ((jnk) (obj)).b(1);
                    l2++;
                } while (true);
            }
            i1++;
            l2 = k2;
        }
        if (((jnk) (obj)).b())
        {
            for (i1 = 0; i1 < ((jnk) (obj)).e(); i1++)
            {
                ((jnk) (obj)).b(i4 + 4 + 1);
            }

        }
        ((jnk) (obj)).b(2);
        f2 = 1.0F;
        if (!((jnk) (obj)).b() || !((jnk) (obj)).b())
        {
            break MISSING_BLOCK_LABEL_1665;
        }
        i1 = ((jnk) (obj)).c(8);
        if (i1 == 255)
        {
            i1 = ((jnk) (obj)).c(16);
            k2 = ((jnk) (obj)).c(16);
            f1 = f2;
            if (i1 != 0)
            {
                f1 = f2;
                if (k2 != 0)
                {
                    f1 = (float)i1 / (float)k2;
                }
            }
        } else
        {
label0:
            {
                if (i1 >= jnj.b.length)
                {
                    break label0;
                }
                f1 = jnj.b[i1];
            }
        }
_L5:
        a.a(jjh.a(-1, "video/hevc", -1, -1, -1L, j2, k1, Collections.singletonList(abyte1), -1, f1));
        b = true;
          goto _L4
        Log.w("H265Reader", (new StringBuilder(46)).append("Unexpected aspect_ratio_idc value: ").append(i1).toString());
        f1 = 1.0F;
          goto _L5
        a(abyte0, i1, j3);
        i1 = j3;
        if (true) goto _L7; else goto _L6
_L6:
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void b()
    {
    }
}
