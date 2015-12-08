// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service;

import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.service.resfetcher.ResourceFetcher;

// Referenced classes of package com.netflix.mediaclient.service:
//            NetflixService, NrdController

class this._cls0
    implements tContext
{

    final NetflixService this$0;

    public NetflixApplication getApplication()
    {
        return (NetflixApplication)NetflixService.this.getApplication();
    }

    public seAgentInterface getBrowseAgent()
    {
        return NetflixService.access$500(NetflixService.this);
    }

    public igurationAgentInterface getConfigurationAgent()
    {
        return NetflixService.access$1100(NetflixService.this);
    }

    public NrdController getNrdController()
    {
        return NetflixService.access$200(NetflixService.this);
    }

    public ResourceFetcher getResourceFetcher()
    {
        return NetflixService.access$300(NetflixService.this);
    }

    public NetflixService getService()
    {
        return NetflixService.this;
    }

    public AgentInterface getUserAgent()
    {
        return NetflixService.access$600(NetflixService.this);
    }

    AgentInterface()
    {
        this$0 = NetflixService.this;
        super();
    }
}
