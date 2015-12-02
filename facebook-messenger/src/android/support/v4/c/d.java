// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.c;


public class d
{

    private static final Object a = new Object();
    private boolean b;
    private int c[];
    private Object d[];
    private int e;

    public d()
    {
        this(10);
    }

    public d(int i)
    {
        b = false;
        i = g(i);
        c = new int[i];
        d = new Object[i];
        e = 0;
    }

    private static int a(int ai[], int i, int j, int k)
    {
        int i1 = i - 1;
        int l;
        for (l = i + j; l - i1 > 1;)
        {
            int j1 = (l + i1) / 2;
            if (ai[j1] < k)
            {
                i1 = j1;
            } else
            {
                l = j1;
            }
        }

        if (l == i + j)
        {
            i = ~(i + j);
        } else
        {
            i = l;
            if (ai[l] != k)
            {
                return ~l;
            }
        }
        return i;
    }

    private void c()
    {
        int l = e;
        int ai[] = c;
        Object aobj[] = d;
        int i = 0;
        int j;
        int k;
        for (j = 0; i < l; j = k)
        {
            Object obj = aobj[i];
            k = j;
            if (obj != a)
            {
                if (i != j)
                {
                    ai[j] = ai[i];
                    aobj[j] = obj;
                }
                k = j + 1;
            }
            i++;
        }

        b = false;
        e = j;
    }

    static int f(int i)
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

    static int g(int i)
    {
        return f(i * 4) / 4;
    }

    public int a()
    {
        if (b)
        {
            c();
        }
        return e;
    }

    public Object a(int i)
    {
        return a(i, null);
    }

    public Object a(int i, Object obj)
    {
        i = a(c, 0, e, i);
        if (i < 0 || d[i] == a)
        {
            return obj;
        } else
        {
            return d[i];
        }
    }

    public void b()
    {
        int j = e;
        Object aobj[] = d;
        for (int i = 0; i < j; i++)
        {
            aobj[i] = null;
        }

        e = 0;
        b = false;
    }

    public void b(int i)
    {
        i = a(c, 0, e, i);
        if (i >= 0 && d[i] != a)
        {
            d[i] = a;
            b = true;
        }
    }

    public void b(int i, Object obj)
    {
        int j = a(c, 0, e, i);
        if (j >= 0)
        {
            d[j] = obj;
            return;
        }
        int k = ~j;
        if (k < e && d[k] == a)
        {
            c[k] = i;
            d[k] = obj;
            return;
        }
        j = k;
        if (b)
        {
            j = k;
            if (e >= c.length)
            {
                c();
                j = ~a(c, 0, e, i);
            }
        }
        if (e >= c.length)
        {
            int l = g(e + 1);
            int ai[] = new int[l];
            Object aobj[] = new Object[l];
            System.arraycopy(c, 0, ai, 0, c.length);
            System.arraycopy(((Object) (d)), 0, ((Object) (aobj)), 0, d.length);
            c = ai;
            d = aobj;
        }
        if (e - j != 0)
        {
            System.arraycopy(c, j, c, j + 1, e - j);
            System.arraycopy(((Object) (d)), j, ((Object) (d)), j + 1, e - j);
        }
        c[j] = i;
        d[j] = obj;
        e = e + 1;
    }

    public void c(int i)
    {
        b(i);
    }

    public int d(int i)
    {
        if (b)
        {
            c();
        }
        return c[i];
    }

    public Object e(int i)
    {
        if (b)
        {
            c();
        }
        return d[i];
    }

}
