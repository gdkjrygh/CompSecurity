// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzrk

class zzrj
    implements Cloneable
{

    private static final zzrk a = new zzrk();
    private boolean b;
    private int c[];
    private zzrk d[];
    private int e;

    public zzrj()
    {
        this(10);
    }

    public zzrj(int i)
    {
        b = false;
        i = c(i);
        c = new int[i];
        d = new zzrk[i];
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

    private boolean a(zzrk azzrk[], zzrk azzrk1[], int i)
    {
        for (int j = 0; j < i; j++)
        {
            if (!azzrk[j].equals(azzrk1[j]))
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
        zzrk azzrk[] = d;
        int i = 0;
        int j;
        int k;
        for (j = 0; i < l; j = k)
        {
            zzrk zzrk1 = azzrk[i];
            k = j;
            if (zzrk1 != a)
            {
                if (i != j)
                {
                    ai[j] = ai[i];
                    azzrk[j] = zzrk1;
                    azzrk[i] = null;
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

    public zzrk a(int i)
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

    public void a(int i, zzrk zzrk1)
    {
        int j = e(i);
        if (j >= 0)
        {
            d[j] = zzrk1;
            return;
        }
        int k = ~j;
        if (k < e && d[k] == a)
        {
            c[k] = i;
            d[k] = zzrk1;
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
            zzrk azzrk[] = new zzrk[l];
            System.arraycopy(c, 0, ai, 0, c.length);
            System.arraycopy(d, 0, azzrk, 0, d.length);
            c = ai;
            d = azzrk;
        }
        if (e - j != 0)
        {
            System.arraycopy(c, j, c, j + 1, e - j);
            System.arraycopy(d, j, d, j + 1, e - j);
        }
        c[j] = i;
        d[j] = zzrk1;
        e = e + 1;
    }

    public zzrk b(int i)
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

    public final zzrj c()
    {
        int i = 0;
        int j = a();
        zzrj zzrj1 = new zzrj(j);
        System.arraycopy(c, 0, zzrj1.c, 0, j);
        for (; i < j; i++)
        {
            if (d[i] != null)
            {
                zzrj1.d[i] = d[i].b();
            }
        }

        zzrj1.e = j;
        return zzrj1;
    }

    public Object clone()
    {
        return c();
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof zzrj))
            {
                return false;
            }
            obj = (zzrj)obj;
            if (a() != ((zzrj) (obj)).a())
            {
                return false;
            }
            if (!a(c, ((zzrj) (obj)).c, e) || !a(d, ((zzrj) (obj)).d, e))
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
