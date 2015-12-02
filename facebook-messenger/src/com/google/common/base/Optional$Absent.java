// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            Optional, Preconditions

final class  extends Optional
{

    private static final eckNotNull INSTANCE = new <init>();

    public boolean equals(Object obj)
    {
        return obj == this;
    }

    public Object get()
    {
        throw new IllegalStateException("value is absent");
    }

    public int hashCode()
    {
        return 0x598df91c;
    }

    public boolean isPresent()
    {
        return false;
    }

    public Object or(Object obj)
    {
        return Preconditions.checkNotNull(obj, "use orNull() instead of or(null)");
    }

    public Object orNull()
    {
        return null;
    }

    public String toString()
    {
        return "Optional.absent()";
    }



    private ()
    {
        super(null);
    }
}
