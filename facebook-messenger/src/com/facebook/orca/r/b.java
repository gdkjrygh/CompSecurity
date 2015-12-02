// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.r;

import com.facebook.f.n;
import com.facebook.inject.d;
import com.facebook.prefs.shared.ae;

public class b extends d
{

    public static final ae a = n.a("messenger_zero_rating");
    private final com.facebook.config.a.d b;
    private final com.facebook.prefs.shared.d c;

    public b(com.facebook.config.a.d d1, com.facebook.prefs.shared.d d2)
    {
        b = d1;
        c = d2;
    }

    public Boolean a()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (b == com.facebook.config.a.d.MESSENGER)
        {
            flag = flag1;
            if (c.a(a, false))
            {
                flag = true;
            }
        }
        return Boolean.valueOf(flag);
    }

    public Object b()
    {
        return a();
    }

}
