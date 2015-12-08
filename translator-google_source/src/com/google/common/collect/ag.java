// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.e;
import com.google.common.base.p;
import java.util.Collection;

// Referenced classes of package com.google.common.collect:
//            af

public final class ag
{

    static final e a = (new e(", ")).a("null");

    static StringBuilder a(int i)
    {
        af.a(i, "size");
        return new StringBuilder((int)Math.min((long)i << 3, 0x40000000L));
    }

    static Collection a(Iterable iterable)
    {
        return (Collection)iterable;
    }

    static boolean a(Collection collection, Object obj)
    {
        p.a(collection);
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
