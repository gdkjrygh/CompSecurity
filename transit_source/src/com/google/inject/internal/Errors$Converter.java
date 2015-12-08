// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;


// Referenced classes of package com.google.inject.internal:
//            Errors

private static abstract class type
{

    final Class type;

    boolean appliesTo(Object obj)
    {
        return obj != null && type.isAssignableFrom(obj.getClass());
    }

    String convert(Object obj)
    {
        return toString(type.cast(obj));
    }

    abstract String toString(Object obj);

    (Class class1)
    {
        type = class1;
    }
}
