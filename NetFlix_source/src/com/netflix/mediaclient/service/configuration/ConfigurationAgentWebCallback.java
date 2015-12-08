// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration;

import com.netflix.mediaclient.service.webclient.model.leafs.ConfigData;

public interface ConfigurationAgentWebCallback
{

    public abstract void onConfigDataFetched(ConfigData configdata, int i);
}
