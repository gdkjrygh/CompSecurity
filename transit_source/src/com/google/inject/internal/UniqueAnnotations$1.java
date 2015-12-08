// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;


// Referenced classes of package com.google.inject.internal:
//            UniqueAnnotations

static final class val.value
    implements ternal
{

    final int val$value;

    public Class annotationType()
    {
        return com/google/inject/internal/UniqueAnnotations$Internal;
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof ternal) && ((ternal)obj).value() == value();
    }

    public int hashCode()
    {
        return "value".hashCode() * 127 ^ val$value;
    }

    public String toString()
    {
        return (new StringBuilder()).append("@").append(com/google/inject/internal/UniqueAnnotations$Internal.getName()).append("(value=").append(val$value).append(")").toString();
    }

    public int value()
    {
        return val$value;
    }

    ternal(int i)
    {
        val$value = i;
        super();
    }
}
