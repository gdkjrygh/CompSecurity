// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view;

import com.facebook.common.eventbus.TypedEvent;
import com.facebook.common.eventbus.TypedEventBus;
import com.facebook.common.executors.AndroidThreadUtil;

public class UiThreadTypedEventBus extends TypedEventBus
{

    private final AndroidThreadUtil a;

    public UiThreadTypedEventBus(AndroidThreadUtil androidthreadutil)
    {
        a = androidthreadutil;
    }

    public final void a(TypedEvent typedevent)
    {
        a.a();
        super.a(typedevent);
    }
}
