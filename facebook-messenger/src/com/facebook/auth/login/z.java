// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import com.facebook.auth.a.a;
import com.facebook.debug.log.b;
import java.util.Iterator;
import java.util.Set;

public class z extends a
{

    private final Class a = com/facebook/auth/login/z;
    private final com.facebook.common.executors.a b;
    private final Set c;
    private final Set d;

    public z(com.facebook.common.executors.a a1, Set set, Set set1)
    {
        b = a1;
        c = set;
        d = set1;
    }

    public void e()
    {
        b.b();
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((com.facebook.auth.f.a)iterator.next()).b()) { }
        com.facebook.debug.log.b.c(a, "Privacy critical data is cleared successfully.");
    }

    public void f()
    {
        b.b();
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((com.facebook.auth.f.b)iterator.next()).d()) { }
        com.facebook.debug.log.b.c(a, "User data is cleared successfully.");
    }
}
