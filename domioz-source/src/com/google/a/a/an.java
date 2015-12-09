// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;


// Referenced classes of package com.google.a.a:
//            ac, ad

final class an extends ac
{

    private final Object a;

    an(Object obj)
    {
        a = obj;
    }

    public final Object a(Object obj)
    {
        ad.a(obj, "use Optional.orNull() instead of Optional.or(null)");
        return a;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof an)
        {
            obj = (an)obj;
            return a.equals(((an) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return 0x598df91c + a.hashCode();
    }

    public final String toString()
    {
        String s = String.valueOf(String.valueOf(a));
        return (new StringBuilder(s.length() + 13)).append("Optional.of(").append(s).append(")").toString();
    }
}
