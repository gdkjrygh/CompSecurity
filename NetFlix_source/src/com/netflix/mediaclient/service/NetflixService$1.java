// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.configuration.ConfigurationAgent;
import com.netflix.mediaclient.util.ThreadUtils;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.netflix.mediaclient.service:
//            NetflixService, ServiceAgent

class this._cls0
    implements Callback
{

    private final ArrayList agentsToInitBatch1 = new ArrayList() {

        final NetflixService._cls1 this$1;

            
            {
                this$1 = NetflixService._cls1.this;
                super();
                add(NetflixService.access$200(this$0));
                add(NetflixService.access$300(this$0));
                add(NetflixService.access$400(this$0));
            }
    };
    private final ArrayList agentsToInitBatch2 = new ArrayList() {

        final NetflixService._cls1 this$1;

            
            {
                this$1 = NetflixService._cls1.this;
                super();
                add(NetflixService.access$500(this$0));
                add(NetflixService.access$600(this$0));
                add(NetflixService.access$700(this$0));
                add(NetflixService.access$800(this$0));
            }
    };
    final NetflixService this$0;

    public void onInitComplete(ServiceAgent serviceagent, int i)
    {
        ThreadUtils.assertOnMain();
        if (i >= 0) goto _L2; else goto _L1
_L1:
        Log.e("NetflixService", (new StringBuilder()).append("NetflixService init failed with ServiceAgent ").append(serviceagent.getClass().getSimpleName()).append(" statusCode=").append(i).toString());
        NetflixService.access$902(NetflixService.this, i);
        NetflixService.access$1000(NetflixService.this);
        stopSelf();
_L4:
        return;
_L2:
        Log.i("NetflixService", (new StringBuilder()).append("NetflixService successfully inited ServiceAgent ").append(serviceagent.getClass().getSimpleName()).toString());
        if (serviceagent != NetflixService.access$1100(NetflixService.this))
        {
            break; /* Loop/switch isn't completed */
        }
        serviceagent = agentsToInitBatch1.iterator();
        while (serviceagent.hasNext()) 
        {
            ((ServiceAgent)serviceagent.next()).init(NetflixService.access$1200(NetflixService.this), this);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!agentsToInitBatch1.contains(serviceagent))
        {
            break; /* Loop/switch isn't completed */
        }
        agentsToInitBatch1.remove(serviceagent);
        if (agentsToInitBatch1.isEmpty())
        {
            Log.d("NetflixService", "NetflixService successfully inited batch1 of ServiceAgents");
            for (serviceagent = agentsToInitBatch2.iterator(); serviceagent.hasNext(); ((ServiceAgent)serviceagent.next()).init(NetflixService.access$1200(NetflixService.this), this)) { }
            NetflixService.access$1300(NetflixService.this, NetflixService.access$1200(NetflixService.this), this);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        agentsToInitBatch2.remove(serviceagent);
        if (agentsToInitBatch2.isEmpty())
        {
            Log.i("NetflixService", "NetflixService successfully inited all ServiceAgents ");
            NetflixService.access$902(NetflixService.this, i);
            ServiceAgent serviceagent1;
            if (NetflixService.access$900(NetflixService.this) == 0)
            {
                if (NetflixService.access$1100(NetflixService.this).isAppVersionObsolete())
                {
                    NetflixService.access$902(NetflixService.this, -5);
                    Log.w("NetflixService", "Current app is obsolete. It should not run!");
                } else
                if (!NetflixService.access$1100(NetflixService.this).isAppVersionRecommended())
                {
                    Log.w("NetflixService", "Current app is not recommended. User should be warned!");
                    NetflixService.access$902(NetflixService.this, 1);
                }
            }
            NetflixService.access$1000(NetflixService.this);
        }
        serviceagent = agentsToInitBatch2.iterator();
        while (serviceagent.hasNext()) 
        {
            serviceagent1 = (ServiceAgent)serviceagent.next();
            if (!serviceagent1.isReady())
            {
                Log.d("NetflixService", (new StringBuilder()).append("NetflixService still waiting for init of ServiceAgent ").append(serviceagent1.getClass().getSimpleName()).toString());
            }
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    this._cls0()
    {
        this$0 = NetflixService.this;
        super();
    }
}
