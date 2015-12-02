// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.auth;

import com.facebook.auth.broadcast.c;
import com.facebook.debug.log.b;
import com.facebook.push.PushInitializer;

public class a
    implements c
{

    private static final Class a = com/facebook/orca/auth/a;
    private PushInitializer b;

    public a(PushInitializer pushinitializer)
    {
        b = pushinitializer;
    }

    public void a()
    {
        com.facebook.debug.log.b.b(a, "reporting login on push initializer");
        b.i();
    }

}
