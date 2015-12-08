// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.facebook.internal:
//            Utility

public final class Validate
{

    public Validate()
    {
    }

    public static void containsNoNullOrEmpty(Collection collection, String s)
    {
        notNull(collection, s);
        collection = collection.iterator();
        String s1;
        do
        {
            if (!collection.hasNext())
            {
                return;
            }
            s1 = (String)collection.next();
            if (s1 == null)
            {
                throw new NullPointerException((new StringBuilder("Container '")).append(s).append("' cannot contain null values").toString());
            }
        } while (s1.length() != 0);
        throw new IllegalArgumentException((new StringBuilder("Container '")).append(s).append("' cannot contain empty values").toString());
    }

    public static void containsNoNulls(Collection collection, String s)
    {
        notNull(collection, s);
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                return;
            }
        } while ((Object)collection.next() != null);
        throw new NullPointerException((new StringBuilder("Container '")).append(s).append("' cannot contain null values").toString());
    }

    public static void notEmpty(Collection collection, String s)
    {
        if (collection.isEmpty())
        {
            throw new IllegalArgumentException((new StringBuilder("Container '")).append(s).append("' cannot be empty").toString());
        } else
        {
            return;
        }
    }

    public static void notEmptyAndContainsNoNulls(Collection collection, String s)
    {
        containsNoNulls(collection, s);
        notEmpty(collection, s);
    }

    public static void notNull(Object obj, String s)
    {
        if (obj == null)
        {
            throw new NullPointerException((new StringBuilder("Argument '")).append(s).append("' cannot be null").toString());
        } else
        {
            return;
        }
    }

    public static void notNullOrEmpty(String s, String s1)
    {
        if (Utility.isNullOrEmpty(s))
        {
            throw new IllegalArgumentException((new StringBuilder("Argument '")).append(s1).append("' cannot be null or empty").toString());
        } else
        {
            return;
        }
    }

    public static transient void oneOf(Object obj, String s, Object aobj[])
    {
        int j = aobj.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                throw new IllegalArgumentException((new StringBuilder("Argument '")).append(s).append("' was not one of the allowed values").toString());
            }
            Object obj1 = aobj[i];
            if (obj1 == null ? obj == null : obj1.equals(obj))
            {
                return;
            }
            i++;
        } while (true);
    }
}
