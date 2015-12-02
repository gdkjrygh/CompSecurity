// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.d;

import com.facebook.common.w.q;
import com.facebook.user.User;

public class a
    implements javax.inject.a
{

    private final javax.inject.a a;

    public a(javax.inject.a a1)
    {
        a = a1;
    }

    public q a()
    {
        User user = (User)a.b();
        if (user == null)
        {
            return q.UNSET;
        }
        if (user.y())
        {
            return q.YES;
        } else
        {
            return q.NO;
        }
    }

    public Object b()
    {
        return a();
    }
}
