// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.e;


// Referenced classes of package p.e:
//            b

public class h
    implements Cloneable
{

    private static final Object a = new Object();
    private boolean b;
    private int c[];
    private Object d[];
    private int e;

    public h()
    {
        this(10);
    }

    public h(int i)
    {
        b = false;
        if (i == 0)
        {
            c = b.a;
            d = b.c;
        } else
        {
            i = p.e.b.a(i);
            c = new int[i];
            d = new Object[i];
        }
        e = 0;
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

    public Object a(int i)
    {
        return a(i, null);
    }

    public Object a(int i, Object obj)
    {
        i = p.e.b.a(c, e, i);
        if (i < 0 || d[i] == a)
        {
            return obj;
        } else
        {
            return d[i];
        }
    }

    public h a()
    {
        Object obj;
        try
        {
            obj = (h)super.clone();
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
            return ((h) (obj));
        }
        return ((h) (obj));
    }

    public int b()
    {
        if (b)
        {
            d();
        }
        return e;
    }

    public void b(int i)
    {
        i = p.e.b.a(c, e, i);
        if (i >= 0 && d[i] != a)
        {
            d[i] = a;
            b = true;
        }
    }

    public void b(int i, Object obj)
    {
        int j = p.e.b.a(c, e, i);
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
                j = ~p.e.b.a(c, e, i);
            }
        }
        if (e >= c.length)
        {
            int l = p.e.b.a(e + 1);
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

    public void c()
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

    public void c(int i)
    {
        b(i);
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return a();
    }

    public void d(int i)
    {
        if (d[i] != a)
        {
            d[i] = a;
            b = true;
        }
    }

    public int e(int i)
    {
        if (b)
        {
            d();
        }
        return c[i];
    }

    public Object f(int i)
    {
        if (b)
        {
            d();
        }
        return d[i];
    }

    public int g(int i)
    {
        if (b)
        {
            d();
        }
        return p.e.b.a(c, e, i);
    }

    public String toString()
    {
        if (b() <= 0)
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
            stringbuilder.append(e(i));
            stringbuilder.append('=');
            Object obj = f(i);
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
