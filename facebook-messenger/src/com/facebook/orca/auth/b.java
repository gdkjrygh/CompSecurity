// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.auth;

import com.facebook.auth.b.a;
import com.facebook.inject.d;

public class b extends d
{

    private final a a;
    private final com.facebook.prefs.shared.d b;

    public b(a a1, com.facebook.prefs.shared.d d1)
    {
        a = a1;
        b = d1;
    }

    public Boolean a()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (a.a() != null)
        {
            flag = flag1;
            if (b.a(com.facebook.auth.e.a.g, false))
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
