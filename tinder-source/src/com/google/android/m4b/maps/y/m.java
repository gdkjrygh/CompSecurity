// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.y;


// Referenced classes of package com.google.android.m4b.maps.y:
//            i, j

final class m extends i
{

    private static final long serialVersionUID = 0L;
    private final Object a;

    m(Object obj)
    {
        a = obj;
    }

    public final Object a(Object obj)
    {
        j.a(obj, "use Optional.orNull() instead of Optional.or(null)");
        return a;
    }

    public final boolean b()
    {
        return true;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof m)
        {
            obj = (m)obj;
            return a.equals(((m) (obj)).a);
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
        return (new StringBuilder("Optional.of(")).append(a).append(")").toString();
    }
}
