// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.service.logging.client.LoggingSession;
import com.netflix.mediaclient.service.logging.client.model.Event;

public interface EventHandler
{

    public abstract void addSession(LoggingSession loggingsession);

    public abstract boolean canSendEvent(String s, String s1);

    public abstract void createUserSession(com.netflix.mediaclient.javabridge.ui.Log.ResetSessionIdCallback resetsessionidcallback);

    public abstract void executeInBackground(Runnable runnable);

    public abstract String getApplicationId();

    public abstract String getUserSessionId();

    public abstract void post(Event event);

    public abstract void removeSession(LoggingSession loggingsession);
}
