// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.events;


public interface EventsManager
{

    public abstract void deleteAllEvents();

    public abstract void recordEvent(Object obj);

    public abstract void sendEvents();
}
