// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.objects.MoreObjects;

public final class Pair
{

    private final Object a;
    private final Object b;

    Pair(Object obj, Object obj1)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
        a = obj;
        b = obj1;
    }

    public static Pair of(Object obj, Object obj1)
    {
        return new Pair(obj, obj1);
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof Pair) && MoreObjects.equal(a, ((Pair)obj).a) && MoreObjects.equal(b, ((Pair)obj).b);
    }

    public final Object first()
    {
        return a;
    }

    public final int hashCode()
    {
        return a.hashCode() ^ b.hashCode();
    }

    public final Object second()
    {
        return b;
    }

    public final String toString()
    {
        return (new StringBuilder("(")).append(a).append("=").append(b).append(")").toString();
    }
}
