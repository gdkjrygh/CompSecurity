// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.q;
import com.facebook.u;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.facebook.internal:
//            aw

public final class bc
{

    public static void a()
    {
        if (!q.a())
        {
            throw new u();
        } else
        {
            return;
        }
    }

    public static void a(Object obj, String s)
    {
        if (obj == null)
        {
            throw new NullPointerException((new StringBuilder("Argument '")).append(s).append("' cannot be null").toString());
        } else
        {
            return;
        }
    }

    public static void a(String s, String s1)
    {
        if (aw.a(s))
        {
            throw new IllegalArgumentException((new StringBuilder("Argument '")).append(s1).append("' cannot be null or empty").toString());
        } else
        {
            return;
        }
    }

    public static void a(Collection collection, String s)
    {
        a(collection, s);
        for (Iterator iterator = collection.iterator(); iterator.hasNext();)
        {
            if (iterator.next() == null)
            {
                throw new NullPointerException((new StringBuilder("Container '")).append(s).append("' cannot contain null values").toString());
            }
        }

        if (collection.isEmpty())
        {
            throw new IllegalArgumentException((new StringBuilder("Container '")).append(s).append("' cannot be empty").toString());
        } else
        {
            return;
        }
    }
}
