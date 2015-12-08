// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.c;

import com.amazon.device.iap.internal.util.d;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class b
{

    private static final b b = new b();
    private final Set a = new ConcurrentSkipListSet();

    public b()
    {
    }

    public static b a()
    {
        return b;
    }

    public boolean a(String s)
    {
        if (!d.a(s))
        {
            return a.remove(s);
        } else
        {
            return false;
        }
    }

    public void b(String s)
    {
        if (!d.a(s))
        {
            a.add(s);
        }
    }

}
