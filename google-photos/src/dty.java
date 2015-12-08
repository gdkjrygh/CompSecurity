// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dty
    implements Cloneable
{

    public long a[];
    public int b[];
    public int c;

    public dty()
    {
        this(10);
    }

    public dty(int i)
    {
        if (i == 0)
        {
            a = dtx.b;
            b = dtx.a;
        } else
        {
            i = dtw.a(i);
            a = new long[i];
            b = new int[i];
        }
        c = 0;
    }

    private dty a()
    {
        Object obj;
        try
        {
            obj = (dty)super.clone();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        try
        {
            obj.a = (long[])a.clone();
            obj.b = (int[])b.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return ((dty) (obj));
        }
        return ((dty) (obj));
    }

    public final int a(long l, int i)
    {
        int j = dtx.a(a, c, l);
        if (j < 0)
        {
            return i;
        } else
        {
            return b[j];
        }
    }

    public void a(int i)
    {
        i = dtw.a(i);
        long al[] = new long[i];
        int ai[] = new int[i];
        System.arraycopy(a, 0, al, 0, a.length);
        System.arraycopy(b, 0, ai, 0, b.length);
        a = al;
        b = ai;
    }

    public final void b(long l, int i)
    {
        int j = dtx.a(a, c, l);
        if (j >= 0)
        {
            b[j] = i;
            return;
        }
        j = ~j;
        if (c >= a.length)
        {
            a(c + 1);
        }
        if (c - j != 0)
        {
            System.arraycopy(a, j, a, j + 1, c - j);
            System.arraycopy(b, j, b, j + 1, c - j);
        }
        a[j] = l;
        b[j] = i;
        c = c + 1;
    }

    public final Object clone()
    {
        return a();
    }

    public final String toString()
    {
        if (c <= 0)
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder(c * 28);
        stringbuilder.append('{');
        for (int i = 0; i < c; i++)
        {
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(a[i]);
            stringbuilder.append('=');
            stringbuilder.append(b[i]);
        }

        stringbuilder.append('}');
        return stringbuilder.toString();
    }
}
