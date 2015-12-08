// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.y;


// Referenced classes of package com.google.android.m4b.maps.y:
//            i, j

final class a extends i
{

    private static a a = new a();
    private static final long serialVersionUID = 0L;

    private a()
    {
    }

    static i a()
    {
        return a;
    }

    private Object readResolve()
    {
        return a;
    }

    public final Object a(Object obj)
    {
        return j.a(obj, "use Optional.orNull() instead of Optional.or(null)");
    }

    public final boolean b()
    {
        return false;
    }

    public final boolean equals(Object obj)
    {
        return obj == this;
    }

    public final int hashCode()
    {
        return 0x598df91c;
    }

    public final String toString()
    {
        return "Optional.absent()";
    }

}
