// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.f;


// Referenced classes of package android.support.v4.f:
//            c

public class n
    implements Cloneable
{

    private static final Object a = new Object();
    private boolean b;
    private int c[];
    private Object d[];
    private int e;

    public n()
    {
        this(10);
    }

    public n(int i)
    {
        b = false;
        if (i == 0)
        {
            c = c.a;
            d = c.c;
        } else
        {
            i = android.support.v4.f.c.a(i);
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

    public int a(int i)
    {
        if (b)
        {
            d();
        }
        return c[i];
    }

    public n a()
    {
        Object obj;
        try
        {
            obj = (n)super.clone();
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
            return ((n) (obj));
        }
        return ((n) (obj));
    }

    public int b()
    {
        if (b)
        {
            d();
        }
        return e;
    }

    public Object b(int i)
    {
        if (b)
        {
            d();
        }
        return d[i];
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

    public Object clone()
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
        int i = 0;
        while (i < e) 
        {
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(a(i));
            stringbuilder.append('=');
            Object obj = b(i);
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
