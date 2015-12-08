// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.provider;

import com.pandora.android.util.s;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class c
{

    private static ConcurrentHashMap a = new ConcurrentHashMap();

    public static Object a(String s1)
    {
        if (s.a(s1))
        {
            return null;
        } else
        {
            return a.get(s1);
        }
    }

    public static String a(Object obj)
    {
        String s1 = UUID.randomUUID().toString();
        a.put(s1, obj);
        return s1;
    }

    public static Object b(String s1)
    {
        return a.remove(s1);
    }

}
