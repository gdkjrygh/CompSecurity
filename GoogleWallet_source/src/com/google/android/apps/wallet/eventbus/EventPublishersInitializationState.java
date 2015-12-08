// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.eventbus;


public class EventPublishersInitializationState
{

    private volatile boolean areEventPublishersInitialized;

    public EventPublishersInitializationState()
    {
        areEventPublishersInitialized = false;
    }

    public final boolean areEventPublishersInitialized()
    {
        return areEventPublishersInitialized;
    }

    public final void eventPublishersInitialized()
    {
        areEventPublishersInitialized = true;
    }
}
