// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.location;

import android.location.Location;
import com.facebook.auth.f.b;
import com.facebook.common.time.a;

public class r
    implements b
{

    private volatile Location a;
    private final a b;

    public r(a a1)
    {
        b = a1;
    }

    public Location a()
    {
        return a(0x493e0L);
    }

    public Location a(long l)
    {
        while (a == null || l != -1L && b.a() - a.getTime() <= l) 
        {
            return null;
        }
        return a;
    }

    public void a(Location location)
    {
        a = location;
    }

    public void b()
    {
        a = null;
    }

    public void d()
    {
        b();
    }
}
