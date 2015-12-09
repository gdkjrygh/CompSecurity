// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client;

import com.netflix.mediaclient.service.logging.client.model.SessionKey;

public interface LoggingSession
{

    public abstract SessionKey getKey();

    public abstract String getName();
}
