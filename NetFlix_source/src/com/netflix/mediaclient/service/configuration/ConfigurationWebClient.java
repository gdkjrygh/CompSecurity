// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration;


// Referenced classes of package com.netflix.mediaclient.service.configuration:
//            ConfigurationAgentWebCallback

public interface ConfigurationWebClient
{

    public abstract void fetchConfigData(ConfigurationAgentWebCallback configurationagentwebcallback);

    public abstract boolean isSynchronous();
}
