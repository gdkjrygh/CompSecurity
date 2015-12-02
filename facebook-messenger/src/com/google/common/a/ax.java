// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            ay, gb, az

public final class ax
{

    static final Joiner a = Joiner.on(", ");

    private ax()
    {
    }

    static String a(Collection collection)
    {
        StringBuilder stringbuilder = a(collection.size()).append('[');
        a.appendTo(stringbuilder, gb.a(collection, new ay(collection)));
        return stringbuilder.append(']').toString();
    }

    static StringBuilder a(int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "size must be non-negative");
        return new StringBuilder((int)Math.min((long)i * 8L, 0x40000000L));
    }

    static Collection a(Iterable iterable)
    {
        return (Collection)iterable;
    }

    public static Collection a(Collection collection, Function function)
    {
        return new az(collection, function);
    }

    static boolean a(Collection collection, Object obj)
    {
        boolean flag;
        try
        {
            flag = collection.contains(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            return false;
        }
        return flag;
    }

    static boolean a(Collection collection, Collection collection1)
    {
        Preconditions.checkNotNull(collection);
        for (collection1 = collection1.iterator(); collection1.hasNext();)
        {
            if (!collection.contains(collection1.next()))
            {
                return false;
            }
        }

        return true;
    }

}
