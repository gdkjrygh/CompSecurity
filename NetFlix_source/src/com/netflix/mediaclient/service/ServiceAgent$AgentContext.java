// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service;

import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.service.resfetcher.ResourceFetcher;

// Referenced classes of package com.netflix.mediaclient.service:
//            ServiceAgent, NrdController, NetflixService

public static interface rface
{

    public abstract NetflixApplication getApplication();

    public abstract terface getBrowseAgent();

    public abstract AgentInterface getConfigurationAgent();

    public abstract NrdController getNrdController();

    public abstract ResourceFetcher getResourceFetcher();

    public abstract NetflixService getService();

    public abstract rface getUserAgent();
}
