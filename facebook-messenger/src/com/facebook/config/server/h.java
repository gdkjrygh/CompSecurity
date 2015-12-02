// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.config.server;

import com.facebook.http.c.i;

public abstract class h
    implements i
{

    private final i a;

    public h(i j)
    {
        a = j;
    }

    public android.net.Uri.Builder a()
    {
        return a.a();
    }

    public android.net.Uri.Builder b()
    {
        return a.b();
    }

    public android.net.Uri.Builder c()
    {
        return a.c();
    }

    public android.net.Uri.Builder d()
    {
        return a.d();
    }

    public String e()
    {
        return a.e();
    }

    public String f()
    {
        return a.f();
    }
}
