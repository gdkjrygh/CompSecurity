// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.c;


// Referenced classes of package android.support.v4.c:
//            c

public class i
    implements Cloneable
{

    private static final Object a = new Object();
    private boolean b;
    private int c[];
    private Object d[];
    private int e;

    public i()
    {
        this(10);
    }

    public i(int j)
    {
        b = false;
        if (j == 0)
        {
            c = c.a;
            d = c.c;
        } else
        {
            j = android.support.v4.c.c.a(j);
            c = new int[j];
            d = new Object[j];
        }
        e = 0;
    }

    private void d()
    {
        int i1 = e;
        int ai[] = c;
        Object aobj[] = d;
        int j = 0;
        int k;
        int l;
        for (k = 0; j < i1; k = l)
        {
            Object obj = aobj[j];
            l = k;
            if (obj != a)
            {
                if (j != k)
                {
                    ai[k] = ai[j];
                    aobj[k] = obj;
                    aobj[j] = null;
                }
                l = k + 1;
            }
            j++;
        }

        b = false;
        e = k;
    }

    public int a(int j)
    {
        if (b)
        {
            d();
        }
        return c[j];
    }

    public i a()
    {
        Object obj;
        try
        {
            obj = (i)super.clone();
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
            return ((i) (obj));
        }
        return ((i) (obj));
    }

    public int b()
    {
        if (b)
        {
            d();
        }
        return e;
    }

    public Object b(int j)
    {
        if (b)
        {
            d();
        }
        return d[j];
    }

    public void c()
    {
        int k = e;
        Object aobj[] = d;
        for (int j = 0; j < k; j++)
        {
            aobj[j] = null;
        }

        e = 0;
        b = false;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return a();
    }

    public String toString()
    {
        if (b() <= 0)
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder(e * 28);
        stringbuilder.append('{');
        int j = 0;
        while (j < e) 
        {
            if (j > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(a(j));
            stringbuilder.append('=');
            Object obj = b(j);
            if (obj != this)
            {
                stringbuilder.append(obj);
            } else
            {
                stringbuilder.append("(this Map)");
            }
            j++;
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

}
