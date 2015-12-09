// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class fnw extends fnu
{

    private final Object a;

    fnw(Object obj)
    {
        a = ctz.a(obj);
    }

    public final Object a()
    {
        return a;
    }

    public final boolean b()
    {
        return true;
    }

    public final Object c(Object obj)
    {
        return a;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (fnw)obj;
            return a.equals(((fnw) (obj)).a);
        }
    }

    public final int hashCode()
    {
        return 0x2e4de7c + a.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("Some{")).append(a).append('}').toString();
    }
}
