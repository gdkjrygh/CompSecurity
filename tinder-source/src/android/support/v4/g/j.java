// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.g;


// Referenced classes of package android.support.v4.g:
//            b

public final class j
    implements Cloneable
{

    public static final Object a = new Object();
    public boolean b;
    public int c[];
    public Object d[];
    public int e;

    public j()
    {
        this((byte)0);
    }

    private j(byte byte0)
    {
        b = false;
        byte0 = android.support.v4.g.b.a(10);
        c = new int[byte0];
        d = new Object[byte0];
        e = 0;
    }

    private j c()
    {
        Object obj;
        try
        {
            obj = (j)super.clone();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        try
        {
            obj.c = (int[])c.clone();
            obj.d = (Object[])((Object []) (d)).clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return ((j) (obj));
        }
        return ((j) (obj));
    }

    private void d()
    {
        int i1 = e;
        int ai[] = c;
        Object aobj[] = d;
        int i = 0;
        int k;
        int l;
        for (k = 0; i < i1; k = l)
        {
            Object obj = aobj[i];
            l = k;
            if (obj != a)
            {
                if (i != k)
                {
                    ai[k] = ai[i];
                    aobj[k] = obj;
                    aobj[i] = null;
                }
                l = k + 1;
            }
            i++;
        }

        b = false;
        e = k;
    }

    public final int a()
    {
        if (b)
        {
            d();
        }
        return e;
    }

    public final Object a(int i)
    {
        i = android.support.v4.g.b.a(c, e, i);
        if (i < 0 || d[i] == a)
        {
            return null;
        } else
        {
            return d[i];
        }
    }

    public final void a(int i, Object obj)
    {
        int k = android.support.v4.g.b.a(c, e, i);
        if (k >= 0)
        {
            d[k] = obj;
            return;
        }
        int l = ~k;
        if (l < e && d[l] == a)
        {
            c[l] = i;
            d[l] = obj;
            return;
        }
        k = l;
        if (b)
        {
            k = l;
            if (e >= c.length)
            {
                d();
                k = ~android.support.v4.g.b.a(c, e, i);
            }
        }
        if (e >= c.length)
        {
            int i1 = android.support.v4.g.b.a(e + 1);
            int ai[] = new int[i1];
            Object aobj[] = new Object[i1];
            System.arraycopy(c, 0, ai, 0, c.length);
            System.arraycopy(((Object) (d)), 0, ((Object) (aobj)), 0, d.length);
            c = ai;
            d = aobj;
        }
        if (e - k != 0)
        {
            System.arraycopy(c, k, c, k + 1, e - k);
            System.arraycopy(((Object) (d)), k, ((Object) (d)), k + 1, e - k);
        }
        c[k] = i;
        d[k] = obj;
        e = e + 1;
    }

    public final void b()
    {
        int k = e;
        Object aobj[] = d;
        for (int i = 0; i < k; i++)
        {
            aobj[i] = null;
        }

        e = 0;
        b = false;
    }

    public final void b(int i)
    {
        if (d[i] != a)
        {
            d[i] = a;
            b = true;
        }
    }

    public final int c(int i)
    {
        if (b)
        {
            d();
        }
        return c[i];
    }

    public final Object clone()
        throws CloneNotSupportedException
    {
        return c();
    }

    public final Object d(int i)
    {
        if (b)
        {
            d();
        }
        return d[i];
    }

    public final int e(int i)
    {
        if (b)
        {
            d();
        }
        return android.support.v4.g.b.a(c, e, i);
    }

    public final String toString()
    {
        if (a() <= 0)
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder(e * 28);
        stringbuilder.append('{');
        int i = 0;
        while (i < e) 
        {
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(c(i));
            stringbuilder.append('=');
            Object obj = d(i);
            if (obj != this)
            {
                stringbuilder.append(obj);
            } else
            {
                stringbuilder.append("(this Map)");
            }
            i++;
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

}
