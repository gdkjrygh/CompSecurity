// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.g;
import com.google.android.m4b.maps.y.j;
import java.util.Collection;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            bb

public final class bc
{

    static final g a = g.a(", ").b("null");

    static StringBuilder a(int i)
    {
        bb.a(i, "size");
        return new StringBuilder((int)Math.min((long)i * 8L, 0x40000000L));
    }

    public static Collection a(Iterable iterable)
    {
        return (Collection)iterable;
    }

    static boolean a(Collection collection, Object obj)
    {
        j.a(collection);
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
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            return false;
        }
        return flag;
    }

}
