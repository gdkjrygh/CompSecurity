// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.tuple;


// Referenced classes of package org.apache.commons.lang3.tuple:
//            Pair

public final class ImmutablePair extends Pair
{

    public final Object left;
    public final Object right;

    public ImmutablePair(Object obj, Object obj1)
    {
        left = obj;
        right = obj1;
    }

    public static ImmutablePair of(Object obj, Object obj1)
    {
        return new ImmutablePair(obj, obj1);
    }

    public final Object getLeft()
    {
        return left;
    }

    public final Object getRight()
    {
        return right;
    }

    public final Object setValue(Object obj)
    {
        throw new UnsupportedOperationException();
    }
}
