// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Arrays;

// Referenced classes of package com.google.common.base:
//            Preconditions

public final class Objects
{
    public static final class ToStringHelper
    {

        private final StringBuilder builder;
        private String separator;

        public ToStringHelper add(String s, Object obj)
        {
            builder.append(separator).append((String)Preconditions.checkNotNull(s)).append('=').append(obj);
            separator = ", ";
            return this;
        }

        public ToStringHelper addValue(Object obj)
        {
            builder.append(separator).append(obj);
            separator = ", ";
            return this;
        }

        public String toString()
        {
            return builder.append('}').toString();
        }

        private ToStringHelper(String s)
        {
            separator = "";
            builder = (new StringBuilder(32)).append((String)Preconditions.checkNotNull(s)).append('{');
        }

    }


    private Objects()
    {
    }

    public static boolean equal(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public static Object firstNonNull(Object obj, Object obj1)
    {
        if (obj != null)
        {
            return obj;
        } else
        {
            return Preconditions.checkNotNull(obj1);
        }
    }

    public static transient int hashCode(Object aobj[])
    {
        return Arrays.hashCode(aobj);
    }

    private static String simpleName(Class class1)
    {
        class1 = class1.getName();
        int j = class1.lastIndexOf('$');
        int i = j;
        if (j == -1)
        {
            i = class1.lastIndexOf('.');
        }
        return class1.substring(i + 1);
    }

    public static ToStringHelper toStringHelper(Class class1)
    {
        return new ToStringHelper(simpleName(class1));
    }

    public static ToStringHelper toStringHelper(Object obj)
    {
        return new ToStringHelper(simpleName(obj.getClass()));
    }

    public static ToStringHelper toStringHelper(String s)
    {
        return new ToStringHelper(s);
    }
}
