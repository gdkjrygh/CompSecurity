// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.a.c;

import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.a.d.a.e;

public final class b
{

    private static final e a = d.a(com/nuance/a/a/a/a/c/b);

    public b()
    {
    }

    public static Object a(String s, Object obj)
    {
        if (obj == null)
        {
            s = (new StringBuilder()).append(s).append(" must not be null").toString();
            obj = new IllegalArgumentException(s);
            a.b(s);
            throw obj;
        } else
        {
            return obj;
        }
    }

}
