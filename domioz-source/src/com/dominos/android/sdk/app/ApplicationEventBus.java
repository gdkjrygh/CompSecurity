// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.app;

import com.c.a.b;
import com.c.a.m;

public class ApplicationEventBus
{

    private b bus;

    public ApplicationEventBus()
    {
    }

    void initialize()
    {
        bus = new b(m.a);
    }

    public void post(Object obj)
    {
        bus.c(obj);
    }

    public void register(Object obj)
    {
        bus.a(obj);
    }

    public void unregister(Object obj)
    {
        bus.b(obj);
    }
}
