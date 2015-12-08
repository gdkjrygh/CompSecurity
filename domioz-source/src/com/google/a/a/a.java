// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;


// Referenced classes of package com.google.a.a:
//            ac, ad

final class a extends ac
{

    static final a a = new a();

    private a()
    {
    }

    static ac a()
    {
        return a;
    }

    public final Object a(Object obj)
    {
        return ad.a(obj, "use Optional.orNull() instead of Optional.or(null)");
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
