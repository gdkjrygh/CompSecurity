// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ad;
import com.google.a.a.t;
import com.google.a.a.w;
import java.util.Collection;

// Referenced classes of package com.google.a.b:
//            y, aa

public final class z
{

    static final w a = w.a(", ").b("null");

    static StringBuilder a(int i)
    {
        y.a(i, "size");
        return new StringBuilder((int)Math.min((long)i * 8L, 0x40000000L));
    }

    static Collection a(Iterable iterable)
    {
        return (Collection)iterable;
    }

    public static Collection a(Collection collection, t t)
    {
        return new aa(collection, t);
    }

    static boolean a(Collection collection, Object obj)
    {
        ad.a(collection);
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
