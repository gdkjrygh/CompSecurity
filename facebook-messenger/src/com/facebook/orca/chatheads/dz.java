// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import javax.inject.a;

public class dz
    implements a
{

    public static final ae a = n.a("messenger_android_device_push_persistence");
    private final d b;
    private final a c;
    private final a d;

    public dz(d d1, a a1, a a2)
    {
        b = d1;
        c = a1;
        d = a2;
    }

    public Boolean a()
    {
        boolean flag;
        if (b.a(a, false) && (((Boolean)c.b()).booleanValue() || ((Boolean)d.b()).booleanValue()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public Object b()
    {
        return a();
    }

}
