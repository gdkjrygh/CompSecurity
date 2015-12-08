// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.event;

import com.vungle.publisher.dj;

public class EventBus
{

    public final dj a = new dj();

    EventBus()
    {
    }

    public final void a(Object obj)
    {
        a.b(obj);
    }

    public final void b(Object obj)
    {
        a.a(obj, "onEvent", false);
    }
}
