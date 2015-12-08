// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import com.netflix.mediaclient.javabridge.ui.mdxcontroller.DiscoveryController;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.MdxController;
import com.netflix.mediaclient.util.StringUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            TargetContext

class this._cls0
    implements Runnable
{

    final TargetContext this$0;

    public void run()
    {
        TargetContext.access$700(TargetContext.this).getDiscovery().isRemoteDeviceReady(TargetContext.access$600(TargetContext.this));
        HashMap hashmap = new HashMap();
        hashmap.put("intent", "sync");
        if (StringUtils.isNotEmpty(TargetContext.access$600(TargetContext.this)))
        {
            TargetContext.access$700(TargetContext.this).getDiscovery().launchNetflix(TargetContext.access$600(TargetContext.this), hashmap);
            return;
        } else
        {
            TargetContext.access$700(TargetContext.this).getDiscovery().launchNetflix(TargetContext.access$800(TargetContext.this), hashmap);
            return;
        }
    }

    troller()
    {
        this$0 = TargetContext.this;
        super();
    }
}
