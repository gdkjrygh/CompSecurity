// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            ju, kk, ow, pd, 
//            jv, ji

public abstract class kg extends ju
    implements Comparable
{

    private int a;
    final int b;
    private kk c;
    private int d;

    public kg(int i, int j)
    {
        kk.a(i);
        if (j < -1)
        {
            throw new IllegalArgumentException("writeSize < -1");
        } else
        {
            b = i;
            a = j;
            c = null;
            d = -1;
            return;
        }
    }

    public static int b(kg kg1)
    {
        if (kg1 == null)
        {
            return 0;
        } else
        {
            return kg1.d();
        }
    }

    protected int a(kg kg1)
    {
        throw new UnsupportedOperationException("unsupported");
    }

    public final void a(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("writeSize < 0");
        }
        if (a >= 0)
        {
            throw new UnsupportedOperationException("writeSize already set");
        } else
        {
            a = i;
            return;
        }
    }

    public final void a(ji ji, ow ow1)
    {
        ow1.h(b);
        try
        {
            if (a < 0)
            {
                throw new UnsupportedOperationException("writeSize is unknown");
            }
        }
        // Misplaced declaration of an exception variable
        catch (ji ji)
        {
            throw pd.a(ji, (new StringBuilder("...while writing ")).append(this).toString());
        }
        ow1.a(d());
        a_(ji, ow1);
        return;
    }

    protected void a(kk kk1, int i)
    {
    }

    protected abstract void a_(ji ji, ow ow1);

    public final int b(kk kk1, int i)
    {
        if (kk1 == null)
        {
            throw new NullPointerException("addedTo == null");
        }
        if (i < 0)
        {
            throw new IllegalArgumentException("offset < 0");
        }
        if (c != null)
        {
            throw new RuntimeException("already written");
        } else
        {
            int j = b - 1;
            i = ~j & i + j;
            c = kk1;
            d = i;
            a(kk1, i);
            return i;
        }
    }

    public final int c(kg kg1)
    {
        if (this == kg1)
        {
            return 0;
        }
        jv jv1 = a();
        jv jv2 = kg1.a();
        if (jv1 != jv2)
        {
            return jv1.compareTo(jv2);
        } else
        {
            return a(kg1);
        }
    }

    public final int compareTo(Object obj)
    {
        return c((kg)obj);
    }

    public final int d()
    {
        if (d < 0)
        {
            throw new RuntimeException("offset not yet known");
        } else
        {
            return c.b(d);
        }
    }

    public final int e()
    {
        return b;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            obj = (kg)obj;
            if (a() != ((kg) (obj)).a())
            {
                return false;
            }
            if (a(((kg) (obj))) != 0)
            {
                return false;
            }
        }
        return true;
    }

    public final String f()
    {
        return (new StringBuilder("[")).append(Integer.toHexString(d())).append(']').toString();
    }

    public final int i_()
    {
        if (a < 0)
        {
            throw new UnsupportedOperationException("writeSize is unknown");
        } else
        {
            return a;
        }
    }
}
