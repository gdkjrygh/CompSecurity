// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            q

class p
    implements Cloneable
{

    private static final q a = new q();
    private boolean b;
    private int c[];
    private q d[];
    private int e;

    public p()
    {
        this(10);
    }

    public p(int i)
    {
        b = false;
        i = c(i);
        c = new int[i];
        d = new q[i];
        e = 0;
    }

    private boolean a(int ai[], int ai1[], int i)
    {
        for (int j = 0; j < i; j++)
        {
            if (ai[j] != ai1[j])
            {
                return false;
            }
        }

        return true;
    }

    private boolean a(q aq[], q aq1[], int i)
    {
        for (int j = 0; j < i; j++)
        {
            if (!aq[j].equals(aq1[j]))
            {
                return false;
            }
        }

        return true;
    }

    private int c(int i)
    {
        return d(i * 4) / 4;
    }

    private int d(int i)
    {
        int j = 4;
        do
        {
label0:
            {
                int k = i;
                if (j < 32)
                {
                    if (i > (1 << j) - 12)
                    {
                        break label0;
                    }
                    k = (1 << j) - 12;
                }
                return k;
            }
            j++;
        } while (true);
    }

    private void d()
    {
        int l = e;
        int ai[] = c;
        q aq[] = d;
        int i = 0;
        int j;
        int k;
        for (j = 0; i < l; j = k)
        {
            q q1 = aq[i];
            k = j;
            if (q1 != a)
            {
                if (i != j)
                {
                    ai[j] = ai[i];
                    aq[j] = q1;
                    aq[i] = null;
                }
                k = j + 1;
            }
            i++;
        }

        b = false;
        e = j;
    }

    private int e(int i)
    {
        int j = 0;
        for (int k = e - 1; j <= k;)
        {
            int l = j + k >>> 1;
            int i1 = c[l];
            if (i1 < i)
            {
                j = l + 1;
            } else
            if (i1 > i)
            {
                k = l - 1;
            } else
            {
                return l;
            }
        }

        return ~j;
    }

    public int a()
    {
        if (b)
        {
            d();
        }
        return e;
    }

    public q a(int i)
    {
        i = e(i);
        if (i < 0 || d[i] == a)
        {
            return null;
        } else
        {
            return d[i];
        }
    }

    public void a(int i, q q1)
    {
        int j = e(i);
        if (j >= 0)
        {
            d[j] = q1;
            return;
        }
        int k = ~j;
        if (k < e && d[k] == a)
        {
            c[k] = i;
            d[k] = q1;
            return;
        }
        j = k;
        if (b)
        {
            j = k;
            if (e >= c.length)
            {
                d();
                j = ~e(i);
            }
        }
        if (e >= c.length)
        {
            int l = c(e + 1);
            int ai[] = new int[l];
            q aq[] = new q[l];
            System.arraycopy(c, 0, ai, 0, c.length);
            System.arraycopy(d, 0, aq, 0, d.length);
            c = ai;
            d = aq;
        }
        if (e - j != 0)
        {
            System.arraycopy(c, j, c, j + 1, e - j);
            System.arraycopy(d, j, d, j + 1, e - j);
        }
        c[j] = i;
        d[j] = q1;
        e = e + 1;
    }

    public q b(int i)
    {
        if (b)
        {
            d();
        }
        return d[i];
    }

    public boolean b()
    {
        return a() == 0;
    }

    public final p c()
    {
        int i = 0;
        int j = a();
        p p1 = new p(j);
        System.arraycopy(c, 0, p1.c, 0, j);
        for (; i < j; i++)
        {
            if (d[i] != null)
            {
                p1.d[i] = d[i].b();
            }
        }

        p1.e = j;
        return p1;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return c();
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof p))
            {
                return false;
            }
            obj = (p)obj;
            if (a() != ((p) (obj)).a())
            {
                return false;
            }
            if (!a(c, ((p) (obj)).c, e) || !a(d, ((p) (obj)).d, e))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        if (b)
        {
            d();
        }
        int j = 17;
        for (int i = 0; i < e; i++)
        {
            j = (j * 31 + c[i]) * 31 + d[i].hashCode();
        }

        return j;
    }

}
