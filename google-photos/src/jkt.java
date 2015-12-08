// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.EOFException;

public final class jkt
    implements jkd
{

    private static final int a = jno.c("ID3");
    private static final int b = jno.c("Xing");
    private static final int c = jno.c("Info");
    private static final int d = jno.c("VBRI");
    private final long e;
    private final jkr f;
    private final jnl g;
    private final jni h;
    private jkf i;
    private jkq j;
    private int k;
    private jku l;
    private long m;
    private int n;
    private int o;

    public jkt()
    {
        this(-1L);
    }

    private jkt(long l1)
    {
        e = -1L;
        f = new jkr(12288);
        g = new jnl(4);
        h = new jni();
        m = -1L;
    }

    private static long a(jke jke1, jkr jkr1)
    {
        return jke1.b() - (long)(jkr1.c - jkr1.b);
    }

    private long b(jke jke1)
    {
        if (jke1.b() != 0L) goto _L2; else goto _L1
_L1:
        f.a();
_L4:
        long l2 = a(jke1, f);
        long l3;
        l3 = l2;
        if (l2 != 0L)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        l3 = l2;
        do
        {
            f.a(jke1, g.a, 0, 3);
            g.b(0);
            if (g.f() != a)
            {
                break;
            }
            jke1.a(3);
            jke1.b(g.a, 0, 4);
            jke1.a((g.a[0] & 0x7f) << 21 | (g.a[1] & 0x7f) << 14 | (g.a[2] & 0x7f) << 7 | g.a[3] & 0x7f);
            f.a();
            l3 = a(jke1, f);
        } while (true);
          goto _L3
_L2:
        f.c();
          goto _L4
_L3:
        f.c();
        f.b();
        int i1;
        int j1;
        i1 = 0;
        j1 = 0;
        l2 = l3;
_L5:
        if (l2 - l3 < 0x20000L)
        {
            break MISSING_BLOCK_LABEL_245;
        }
        throw new jjj("Searched too many bytes while resynchronizing.");
        if (!f.b(jke1, g.a, 0, 4))
        {
            return -1L;
        }
        int k1;
        g.b(0);
        k1 = g.h();
        if (i1 != 0 && (0xfffe0c00 & k1) != (0xfffe0c00 & i1))
        {
            break MISSING_BLOCK_LABEL_317;
        }
        int l1 = jni.a(k1);
        if (l1 != -1)
        {
            break MISSING_BLOCK_LABEL_355;
        }
        i1 = 0;
        f.c();
        f.a(jke1, 1);
        f.b();
        l2++;
        j1 = 0;
          goto _L5
        if (j1 != 0)
        {
            break MISSING_BLOCK_LABEL_374;
        }
        jni.a(k1, h);
        i1 = k1;
        j1++;
        if (j1 == 4)
        {
            break MISSING_BLOCK_LABEL_401;
        }
        f.a(jke1, l1 - 4);
          goto _L5
        f.c();
        k = i1;
        l3 = l2;
        if (l != null) goto _L7; else goto _L6
_L6:
        jnl jnl1;
        l3 = jke1.c();
        f.b();
        l = null;
        jkr jkr1 = f;
        i1 = h.c;
        if (!jkr1.b(jke1, i1))
        {
            throw new EOFException();
        }
        jnl1 = new jnl(jkr1.a.a, jkr1.c);
        jnl1.b(jkr1.b);
        jkr1.b = i1 + jkr1.b;
        if ((h.a & 1) != 1) goto _L9; else goto _L8
_L8:
        if (h.e != 1)
        {
            i1 = 32;
        } else
        {
            i1 = 17;
        }
        jnl1.b(i1 + 4);
        i1 = jnl1.h();
        if (i1 != b && i1 != c) goto _L11; else goto _L10
_L10:
        l = jkw.a(h, jnl1, l2, l3);
        i1 = 1;
_L20:
        if (i1 == 0) goto _L13; else goto _L12
_L12:
        f.b();
        if (l != null) goto _L15; else goto _L14
_L14:
        f.a(jke1, g.a, 0, 4);
        g.b(0);
        l3 = l2 + (long)h.c;
        jni.a(g.h(), h);
_L16:
        f.c();
        l = new jks(l3, h.f * 1000, jke1.c());
_L15:
        i.a(l);
        j.a(jjh.a(-1, h.b, -1, 4096, l.b(), h.e, h.d, null, null));
        return l2;
_L9:
        if (h.e != 1)
        {
            i1 = 17;
        } else
        {
            i1 = 9;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        jnl1.b(36);
        if (jnl1.h() != d)
        {
            break MISSING_BLOCK_LABEL_818;
        }
        l = jkv.a(h, jnl1, l2);
        i1 = 1;
        continue; /* Loop/switch isn't completed */
        i1 = 0;
        continue; /* Loop/switch isn't completed */
_L13:
        l3 = l2;
          goto _L16
        jke1;
        l3 = -1L;
_L7:
        return l3;
        if (true) goto _L18; else goto _L17
_L18:
        break MISSING_BLOCK_LABEL_543;
_L17:
        if (true) goto _L20; else goto _L19
_L19:
    }

    public final int a(jke jke1, jkk jkk)
    {
        boolean flag = false;
        if (k != 0 || b(jke1) != -1L) goto _L2; else goto _L1
_L1:
        int i1 = -1;
_L4:
        return i1;
_L2:
        long l3;
        long l5;
        if (o == 0)
        {
            f.b();
            long l1;
            if (!f.b(jke1, g.a, 0, 4))
            {
                l1 = -1L;
            } else
            {
                f.c();
                g.b(0);
                i1 = g.h();
                if ((i1 & 0xfffe0c00) == (k & 0xfffe0c00) && jni.a(i1) != -1)
                {
                    jni.a(i1, h);
                    l1 = 0L;
                } else
                {
                    k = 0;
                    f.a(jke1, 1);
                    l1 = b(jke1);
                }
            }
            if (l1 == -1L)
            {
                return -1;
            }
            if (m == -1L)
            {
                m = l.b(a(jke1, f));
                if (e != -1L)
                {
                    long l2 = l.b(0L);
                    long l4 = m;
                    m = (e - l2) + l4;
                }
            }
            o = h.c;
        }
        l3 = m;
        l5 = ((long)n * 0xf4240L) / (long)h.d;
        int j1 = o;
        jkk = f;
        jkq jkq1 = j;
        i1 = o;
        if (i1 == 0)
        {
            i1 = 0;
        } else
        {
            ((jkr) (jkk)).a.b(((jkr) (jkk)).b);
            i1 = Math.min(((jkr) (jkk)).c - ((jkr) (jkk)).b, i1);
            jkq1.a(((jkr) (jkk)).a, i1);
            jkk.b = ((jkr) (jkk)).b + i1;
        }
        o = j1 - i1;
        if (o <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        f.b();
        i1 = j.a(jke1, o, true);
        if (i1 == -1)
        {
            return -1;
        }
        o = o - i1;
        i1 = ((flag) ? 1 : 0);
        if (o > 0) goto _L4; else goto _L3
_L3:
        j.a(l3 + l5, 1, h.c, 0, null);
        n = n + h.g;
        o = 0;
        return 0;
    }

    public final void a(jkf jkf1)
    {
        i = jkf1;
        j = jkf1.c(0);
        jkf1.g();
    }

    public final boolean a(jke jke1)
    {
        jnl jnl1 = new jnl(4);
        int k1 = 0;
        do
        {
            jke1.c(jnl1.a, 0, 3);
            jnl1.b(0);
            if (jnl1.f() != a)
            {
                break;
            }
            jke1.b(3);
            jke1.c(jnl1.a, 0, 4);
            int i1 = (jnl1.a[0] & 0x7f) << 21 | (jnl1.a[1] & 0x7f) << 14 | (jnl1.a[2] & 0x7f) << 7 | jnl1.a[3] & 0x7f;
            jke1.b(i1);
            k1 += i1 + 10;
        } while (true);
        jke1.a();
        jke1.b(k1);
        int j1 = 0;
        int l1 = 0;
        int i2 = k1;
        do
        {
            int j2;
            int k2;
label0:
            {
                if (i2 - k1 >= 4096)
                {
                    return false;
                }
                jke1.c(jnl1.a, 0, 4);
                jnl1.b(0);
                j2 = jnl1.h();
                if (j1 == 0 || (j2 & 0xfffe0c00) == (j1 & 0xfffe0c00))
                {
                    k2 = jni.a(j2);
                    if (k2 != -1)
                    {
                        break label0;
                    }
                }
                jke1.a();
                i2++;
                jke1.b(i2);
                j1 = 0;
                l1 = 0;
                continue;
            }
            if (l1 == 0)
            {
                j1 = j2;
            }
            l1++;
            if (l1 == 4)
            {
                return true;
            }
            jke1.b(k2 - 4);
        } while (true);
    }

    public final void b()
    {
        k = 0;
        n = 0;
        m = -1L;
        o = 0;
        f.a();
    }

}
