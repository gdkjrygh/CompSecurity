// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import com.facebook.config.a.b;
import com.facebook.f.n;
import com.facebook.inject.d;
import com.facebook.prefs.shared.ae;
import com.facebook.user.User;
import javax.inject.a;

public class g extends d
{

    private static final ae a = n.a("messenger_internal_prefs_android");
    private final com.facebook.prefs.shared.d b;
    private final com.facebook.config.a.a c;
    private final a d;

    public g(com.facebook.prefs.shared.d d1, com.facebook.config.a.a a1, a a2)
    {
        b = d1;
        c = a1;
        d = a2;
    }

    public Boolean a()
    {
        User user = (User)d.b();
        if (user == null)
        {
            return Boolean.valueOf(false);
        }
        if (c.h() == b.PUBLIC)
        {
            return Boolean.valueOf(user.y());
        } else
        {
            return Boolean.valueOf(b.a(a, false));
        }
    }

    public Object b()
    {
        return a();
    }

}
