// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dtz
    implements Cloneable
{

    public int a[];
    public long b[];
    public int c;

    public dtz()
    {
        this(10);
    }

    public dtz(int i)
    {
        if (i == 0)
        {
            a = dtx.a;
            b = dtx.b;
        } else
        {
            i = dtw.a(i);
            a = new int[i];
            b = new long[i];
        }
        c = 0;
    }

    private void a(int i)
    {
        i = dtw.a(i);
        int ai[] = new int[i];
        long al[] = new long[i];
        System.arraycopy(a, 0, ai, 0, a.length);
        System.arraycopy(b, 0, al, 0, b.length);
        a = ai;
        b = al;
    }

    public final dtz a()
    {
        Object obj;
        try
        {
            obj = (dtz)super.clone();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        try
        {
            obj.a = (int[])a.clone();
            obj.b = (long[])b.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return ((dtz) (obj));
        }
        return ((dtz) (obj));
    }

    public final void a(int i, long l)
    {
        int j = dtx.a(a, c, i);
        if (j >= 0)
        {
            b[j] = l;
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
        a[j] = i;
        b[j] = l;
        c = c + 1;
    }

    public final void b(int i, long l)
    {
        if (c != 0 && i <= a[c - 1])
        {
            a(i, l);
            return;
        }
        int j = c;
        if (j >= a.length)
        {
            a(j + 1);
        }
        a[j] = i;
        b[j] = l;
        c = j + 1;
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
