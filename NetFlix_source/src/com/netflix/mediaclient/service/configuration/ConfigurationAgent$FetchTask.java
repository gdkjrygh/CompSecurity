// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration;


// Referenced classes of package com.netflix.mediaclient.service.configuration:
//            ConfigurationAgent, ConfigurationAgentWebCallback

private static abstract class callback
    implements Runnable
{

    private final ConfigurationAgentWebCallback callback;

    protected ConfigurationAgentWebCallback getCallback()
    {
        return callback;
    }

    public (ConfigurationAgentWebCallback configurationagentwebcallback)
    {
        callback = configurationagentwebcallback;
    }
}
