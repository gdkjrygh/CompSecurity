// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient;


public interface ApiEndpointRegistry
{

    public abstract String getApiUrlFull();

    public abstract String getClientLoggingUrlFull();

    public abstract String getConfigUrlFull();

    public abstract String getPresentationTrackingUrlFull();

    public abstract void updateApiEndpointHost(String s);
}
