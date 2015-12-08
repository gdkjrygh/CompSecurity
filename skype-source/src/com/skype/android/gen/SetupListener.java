// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;

public class SetupListener
{

    EventBus eventBus;

    public SetupListener()
    {
        eventBus = EventBusInstance.a();
    }
}
