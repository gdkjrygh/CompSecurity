// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ka
    implements Cloneable
{

    public static final Object a = new Object();
    public boolean b;
    public int c[];
    public Object d[];
    public int e;

    public ka()
    {
        this(10);
    }

    private ka(int i)
    {
        b = false;
        i = jm.a(10);
        c = new int[i];
        d = new Object[i];
        e = 0;
    }

    private ka c()
    {
        Object obj;
        try
        {
            obj = (ka)super.clone();
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
            return ((ka) (obj));
        }
        return ((ka) (obj));
    }

    private void d()
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
                    aobj[i] = null;
                }
                k = j + 1;
            }
            i++;
        }

        b = false;
        e = j;
    }

    public final int a()
    {
        if (b)
        {
            d();
        }
        return e;
    }

    public final void a(int i)
    {
        if (d[i] != a)
        {
            d[i] = a;
            b = true;
        }
    }

    public final void a(int i, Object obj)
    {
        int j = jm.a(c, e, i);
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
                d();
                j = ~jm.a(c, e, i);
            }
        }
        if (e >= c.length)
        {
            int l = jm.a(e + 1);
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

    public final int b(int i)
    {
        if (b)
        {
            d();
        }
        return c[i];
    }

    public final void b()
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

    public final Object c(int i)
    {
        if (b)
        {
            d();
        }
        return d[i];
    }

    public final Object clone()
    {
        return c();
    }

    public final int d(int i)
    {
        if (b)
        {
            d();
        }
        return jm.a(c, e, i);
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
            stringbuilder.append(b(i));
            stringbuilder.append('=');
            Object obj = c(i);
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
