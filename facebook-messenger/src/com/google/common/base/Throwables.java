// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            Preconditions

public final class Throwables
{

    private Throwables()
    {
    }

    public static RuntimeException propagate(Throwable throwable)
    {
        propagateIfPossible((Throwable)Preconditions.checkNotNull(throwable));
        throw new RuntimeException(throwable);
    }

    public static void propagateIfInstanceOf(Throwable throwable, Class class1)
    {
        if (throwable != null && class1.isInstance(throwable))
        {
            throw (Throwable)class1.cast(throwable);
        } else
        {
            return;
        }
    }

    public static void propagateIfPossible(Throwable throwable)
    {
        propagateIfInstanceOf(throwable, java/lang/Error);
        propagateIfInstanceOf(throwable, java/lang/RuntimeException);
    }

    public static void propagateIfPossible(Throwable throwable, Class class1)
    {
        propagateIfInstanceOf(throwable, class1);
        propagateIfPossible(throwable);
    }
}
