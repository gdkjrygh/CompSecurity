// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class anf
{

    private static final anh e = new ang();
    final Object a;
    final anh b;
    final String c;
    volatile byte d[];

    private anf(String s, Object obj, anh anh1)
    {
        c = b.f(s);
        a = obj;
        b = (anh)b.a(anh1, "Argument must not be null");
    }

    public static anf a(String s)
    {
        return new anf(s, null, e);
    }

    public static anf a(String s, Object obj)
    {
        return new anf(s, obj, e);
    }

    public static anf a(String s, Object obj, anh anh1)
    {
        return new anf(s, obj, anh1);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof anf)
        {
            obj = (anf)obj;
            return c.equals(((anf) (obj)).c);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return c.hashCode();
    }

    public final String toString()
    {
        String s = String.valueOf("Option{key='");
        String s1 = c;
        return (new StringBuilder(String.valueOf(s).length() + 2 + String.valueOf(s1).length())).append(s).append(s1).append("'}").toString();
    }

}
