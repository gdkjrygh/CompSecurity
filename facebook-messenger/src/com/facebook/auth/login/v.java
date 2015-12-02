// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.content.Intent;
import android.support.v4.a.e;
import com.facebook.auth.c.b;
import com.facebook.auth.c.d;

public class v
{

    protected final e a;
    protected final b b;

    public v(e e1, b b1)
    {
        a = e1;
        b = b1;
    }

    public void a()
    {
        a.a(new Intent("com.facebook.orca.login.AuthStateMachineMonitor.SHOWING_LOGIN_UI"));
    }

    public void b()
    {
        a.a(new Intent("com.facebook.orca.login.AuthStateMachineMonitor.AUTH_COMPLETE"));
        b.a(new d());
    }

    public void c()
    {
        a.a(new Intent("com.facebook.orca.login.AuthStateMachineMonitor.LOGIN_COMPLETE"));
    }

    public void d()
    {
        a.a(new Intent("com.facebook.orca.login.AuthStateMachineMonitor.LOGOUT_COMPLETE"));
        b.a(new com.facebook.auth.c.e());
    }
}
