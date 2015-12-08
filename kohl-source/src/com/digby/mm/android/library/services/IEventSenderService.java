// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.services;

import android.net.ConnectivityManager;
import com.digby.mm.android.library.events.IEvent;
import com.digby.mm.android.library.events.IEventResponseHandler;
import com.digby.mm.android.library.events.queue.IBackoffManager;

public interface IEventSenderService
{

    public abstract void addEvent(IEvent ievent, IEventResponseHandler ieventresponsehandler);

    public abstract int getEventCount();

    public abstract void initializeService(IBackoffManager ibackoffmanager, ConnectivityManager connectivitymanager);
}
