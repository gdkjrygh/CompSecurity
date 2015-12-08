// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.d;


// Referenced classes of package android.support.v4.d:
//            c

public final class n
    implements Cloneable
{

    public static final Object a = new Object();
    public boolean b;
    public int c[];
    public Object d[];
    public int e;

    public n()
    {
        this((byte)0);
    }

    private n(byte byte0)
    {
        b = false;
        byte0 = android.support.v4.d.c.a(10);
        c = new int[byte0];
        d = new Object[byte0];
        e = 0;
    }

    private n d()
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

    private void e()
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
            e();
        }
        return e;
    }

    public final Object a(int i)
    {
        i = android.support.v4.d.c.a(c, e, i);
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
        int j = android.support.v4.d.c.a(c, e, i);
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
                e();
                j = ~android.support.v4.d.c.a(c, e, i);
            }
        }
        if (e >= c.length)
        {
            int l = android.support.v4.d.c.a(e + 1);
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

    public final int b()
    {
        if (b)
        {
            e();
        }
        return android.support.v4.d.c.a(c, e, 0);
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
            e();
        }
        return c[i];
    }

    public final void c()
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

    public final Object clone()
    {
        return d();
    }

    public final Object d(int i)
    {
        if (b)
        {
            e();
        }
        return d[i];
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
