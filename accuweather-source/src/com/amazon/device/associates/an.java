// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import java.util.Collection;
import java.util.Iterator;

class an
{

    private an()
    {
    }

    public static void a(int i, String s)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(" must be positive").toString());
        } else
        {
            return;
        }
    }

    public static void a(Object obj, String s)
    {
        if (obj == null || (obj instanceof String) && ((String)obj).length() == 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(" must not be null or empty").toString());
        } else
        {
            return;
        }
    }

    public static void a(Collection collection, String s)
    {
        if (collection == null || collection.isEmpty())
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(" set must not be null or empty").toString());
        }
        for (collection = collection.iterator(); collection.hasNext();)
        {
            String s1 = (String)collection.next();
            if (s1 == null || s1.length() == 0)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(s).append(" must not contains an empty string").toString());
            }
        }

    }
}
