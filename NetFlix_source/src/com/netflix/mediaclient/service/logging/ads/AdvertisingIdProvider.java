// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.ads;


public interface AdvertisingIdProvider
{

    public abstract String getId();

    public abstract boolean isLimitAdTrackingEnabled();

    public abstract boolean isResettable();
}
