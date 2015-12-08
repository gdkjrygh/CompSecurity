// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.d.b;


public final class d
{

    public static String a(Class class1)
    {
        String s = class1.getSimpleName();
        Object obj;
        if (s == null)
        {
            obj = null;
        } else
        {
            obj = s;
            if (s.length() <= 0)
            {
                class1 = class1.getName();
                if (class1 == null)
                {
                    return null;
                }
                int i = class1.lastIndexOf('.');
                obj = class1;
                if (i >= 0)
                {
                    i++;
                    obj = class1;
                    if (i < class1.length())
                    {
                        return class1.substring(i);
                    }
                }
            }
        }
        return ((String) (obj));
    }
}
