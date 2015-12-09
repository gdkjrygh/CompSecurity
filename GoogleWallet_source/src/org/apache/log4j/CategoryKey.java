// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.log4j;


class CategoryKey
{

    static Class class$org$apache$log4j$CategoryKey;
    int hashCache;
    String name;

    CategoryKey(String s)
    {
        name = s;
        hashCache = s.hashCode();
    }

    private static Class _mthclass$(String s)
    {
        try
        {
            s = Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new NoClassDefFoundError(s.getMessage());
        }
        return s;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj != null)
        {
            Class class1;
            if (class$org$apache$log4j$CategoryKey == null)
            {
                class1 = _mthclass$("org.apache.log4j.CategoryKey");
                class$org$apache$log4j$CategoryKey = class1;
            } else
            {
                class1 = class$org$apache$log4j$CategoryKey;
            }
            if (class1 == obj.getClass())
            {
                return name.equals(((CategoryKey)obj).name);
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return hashCache;
    }
}
