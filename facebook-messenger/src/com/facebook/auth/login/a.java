// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import com.facebook.auth.b.b;
import com.facebook.auth.b.d;
import com.facebook.fbservice.service.o;
import com.facebook.http.b.ap;
import com.google.common.base.Preconditions;

public class a
{

    private final com.facebook.common.executors.a a;
    private final o b;
    private final ap c;
    private final b d;
    private final com.facebook.auth.userscope.b e;

    public a(com.facebook.common.executors.a a1, o o1, ap ap1, b b1, com.facebook.auth.userscope.b b2)
    {
        a = a1;
        b = o1;
        c = ap1;
        d = b1;
        e = b2;
    }

    public void a(Runnable runnable)
    {
        boolean flag1;
        flag1 = true;
        a.b();
        b.a();
        c.a();
        c.c();
        b.d();
        runnable.run();
        boolean flag;
        if (!d.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        if (!(d instanceof d))
        {
            break MISSING_BLOCK_LABEL_91;
        }
        if (d.a() == null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        e.a();
        c.b();
        b.b();
        return;
        runnable;
        c.b();
        throw runnable;
        runnable;
        b.b();
        throw runnable;
    }
}
