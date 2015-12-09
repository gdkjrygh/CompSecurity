// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.util;

import java.util.Collection;

public class d
{

    public d()
    {
    }

    public static void a(Object obj, String s)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(" must not be null").toString());
        } else
        {
            return;
        }
    }

    public static void a(String s, String s1)
    {
        if (a(s))
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s1).append(" must not be null or empty").toString());
        } else
        {
            return;
        }
    }

    public static void a(Collection collection, String s)
    {
        if (collection.isEmpty())
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(" must not be empty").toString());
        } else
        {
            return;
        }
    }

    public static boolean a(String s)
    {
        return s == null || s.trim().length() == 0;
    }
}
