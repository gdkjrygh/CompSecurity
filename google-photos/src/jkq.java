// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;

public class jkq
{

    final jkl a;
    final jjk b = new jjk(0);
    boolean c;
    long d;
    volatile long e;
    volatile jjh f;

    public jkq(jmo jmo1)
    {
        a = new jkl(jmo1);
        c = true;
        d = 0x8000000000000000L;
        e = 0x8000000000000000L;
    }

    public int a(jke jke1, int i, boolean flag)
    {
        jkl jkl1 = a;
        i = jkl1.a(i);
        byte abyte0[] = jkl1.i.a;
        jmn jmn1 = jkl1.i;
        int j = jkl1.j;
        i = jke1.a(abyte0, jmn1.b + j, i);
        if (i == -1)
        {
            if (flag)
            {
                return -1;
            } else
            {
                throw new EOFException();
            }
        } else
        {
            jkl1.j = jkl1.j + i;
            jkl1.h = jkl1.h + (long)i;
            return i;
        }
    }

    public void a()
    {
        jkl jkl1 = a;
        jkm jkm1 = jkl1.c;
        jkm1.b = 0;
        jkm1.c = 0;
        jkm1.d = 0;
        jkm1.a = 0;
        for (; !jkl1.d.isEmpty(); jkl1.a.a((jmn)jkl1.d.remove())) { }
        jkl1.g = 0L;
        jkl1.h = 0L;
        jkl1.i = null;
        jkl1.j = jkl1.b;
        c = true;
        d = 0x8000000000000000L;
        e = 0x8000000000000000L;
    }

    public void a(long l)
    {
        while (a.a(b) && b.e < l) 
        {
            a.a();
            c = true;
        }
    }

    public void a(long l, int i, int j, int k, byte abyte0[])
    {
        e = Math.max(e, l);
        jkl jkl1 = a;
        long l1 = a.h;
        long l2 = j;
        long l3 = k;
        jkl1.c.a(l, i, l1 - l2 - l3, j, abyte0);
    }

    public void a(jjh jjh)
    {
        f = jjh;
    }

    public void a(jnl jnl1, int i)
    {
        jkl jkl1 = a;
        int j;
        for (; i > 0; i -= j)
        {
            j = jkl1.a(i);
            byte abyte0[] = jkl1.i.a;
            jmn jmn1 = jkl1.i;
            int k = jkl1.j;
            jnl1.a(abyte0, jmn1.b + k, j);
            jkl1.j = jkl1.j + j;
            jkl1.h = jkl1.h + (long)j;
        }

    }

    public boolean a(jjk jjk1)
    {
        jkl jkl1;
        if (!f())
        {
            return false;
        }
        jkl1 = a;
        if (jkl1.c.a(jjk1, jkl1.e)) goto _L2; else goto _L1
_L1:
        c = false;
        return true;
_L2:
        int j1;
label0:
        {
            Object obj;
            int ai[];
            jkn jkn1;
            int l;
            long l1;
label1:
            {
                if (!jjk1.a())
                {
                    break label0;
                }
                jkn1 = jkl1.e;
                l1 = jkn1.a;
                jkl1.a(l1, jkl1.f.a, 1);
                l1 = 1L + l1;
                l = jkl1.f.a[0];
                int ai1[];
                jnl jnl1;
                int i;
                if ((l & 0x80) != 0)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                l &= 0x7f;
                if (jjk1.a.a == null)
                {
                    jjk1.a.a = new byte[16];
                }
                jkl1.a(l1, jjk1.a.a, l);
                l1 += l;
                if (i != 0)
                {
                    jkl1.a(l1, jkl1.f.a, 2);
                    l1 += 2L;
                    jkl1.f.b(0);
                    l = jkl1.f.e();
                } else
                {
                    l = 1;
                }
                ai = jjk1.a.d;
                if (ai != null)
                {
                    obj = ai;
                    if (ai.length >= l)
                    {
                        break label1;
                    }
                }
                obj = new int[l];
            }
label2:
            {
                ai1 = jjk1.a.e;
                if (ai1 != null)
                {
                    ai = ai1;
                    if (ai1.length >= l)
                    {
                        break label2;
                    }
                }
                ai = new int[l];
            }
            jic jic1;
            byte abyte0[];
            byte abyte1[];
            int j;
            if (i != 0)
            {
                i = l * 6;
                jnl1 = jkl1.f;
                if (jnl1.c < i)
                {
                    jnl1.a(new byte[i], i);
                }
                jkl1.a(l1, jkl1.f.a, i);
                long l2 = i;
                jkl1.f.b(0);
                for (i = 0; i < l; i++)
                {
                    obj[i] = jkl1.f.e();
                    ai[i] = jkl1.f.j();
                }

                l1 += l2;
            } else
            {
                obj[0] = 0;
                ai[0] = jjk1.c - (int)(l1 - jkn1.a);
            }
            jic1 = jjk1.a;
            abyte0 = jkn1.b;
            abyte1 = jjk1.a.a;
            jic1.f = l;
            jic1.d = ((int []) (obj));
            jic1.e = ai;
            jic1.b = abyte0;
            jic1.a = abyte1;
            jic1.c = 1;
            if (jno.a >= 16)
            {
                jic1.g.set(jic1.f, jic1.d, jic1.e, jic1.b, jic1.a, jic1.c);
            }
            j = (int)(l1 - jkn1.a);
            jkn1.a = jkn1.a + (long)j;
            jjk1.c = jjk1.c - j;
        }
        j1 = jjk1.c;
        if (jjk1.b != null) goto _L4; else goto _L3
_L3:
        jjk1.b = jjk1.a(j1);
_L6:
        l1 = jkl1.e.a;
        obj = jjk1.b;
        for (j = jjk1.c; j > 0; j -= j1)
        {
            jkl1.a(l1);
            l = (int)(l1 - jkl1.g);
            j1 = Math.min(j, jkl1.b - l);
            jjk1 = (jmn)jkl1.d.peek();
            ((ByteBuffer) (obj)).put(((jmn) (jjk1)).a, ((jmn) (jjk1)).b + l, j1);
            l1 += j1;
        }

        break; /* Loop/switch isn't completed */
_L4:
        int k = jjk1.b.capacity();
        int i1 = jjk1.b.position();
        j1 += i1;
        if (k < j1)
        {
            ByteBuffer bytebuffer = jjk1.a(j1);
            if (i1 > 0)
            {
                jjk1.b.position(0);
                jjk1.b.limit(i1);
                bytebuffer.put(jjk1.b);
            }
            jjk1.b = bytebuffer;
        }
        if (true) goto _L6; else goto _L5
_L5:
        jkl1.a(jkl1.c.a());
        if (true) goto _L1; else goto _L7
_L7:
    }

    public boolean b()
    {
        return f != null;
    }

    public boolean b(long l)
    {
        jkl jkl1 = a;
        l = jkl1.c.a(l);
        if (l == -1L)
        {
            return false;
        } else
        {
            jkl1.a(l);
            return true;
        }
    }

    public jjh c()
    {
        return f;
    }

    public long d()
    {
        return e;
    }

    public boolean e()
    {
        return !f();
    }

    boolean f()
    {
        boolean flag = a.a(b);
        boolean flag1 = flag;
        if (c)
        {
            do
            {
                flag1 = flag;
                if (!flag)
                {
                    break;
                }
                flag1 = flag;
                if (b.b())
                {
                    break;
                }
                a.a();
                flag = a.a(b);
            } while (true);
        }
        while (!flag1 || d != 0x8000000000000000L && b.e >= d) 
        {
            return false;
        }
        return true;
    }
}
