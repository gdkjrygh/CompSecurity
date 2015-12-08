// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.presentation;


public interface PresentationWebCallback
{

    public abstract void onEventsDelivered(String s);

    public abstract void onEventsDeliveryFailed(String s);
}
