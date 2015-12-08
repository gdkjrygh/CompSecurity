// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.a;

import java.util.HashMap;
import java.util.Map;

public class a
{

    private static final Map a = new HashMap();

    public a()
    {
    }

    public static Object a(Class class1)
    {
        return a.get(class1);
    }

    public static void a(Class class1, Object obj)
    {
        a.put(class1, obj);
    }

}
