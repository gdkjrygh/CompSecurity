// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import android.content.Context;
import com.worklight.common.WLConfig;
import com.worklight.wlclient.WLRequest;
import java.util.TimerTask;

// Referenced classes of package com.worklight.wlclient.api:
//            WLClient, WLRequestOptions

class context extends TimerTask
{

    private Context context;
    final WLClient this$0;

    public void run()
    {
        if (!WLClient.isApplicationSentToBackground(context))
        {
            WLRequestOptions wlrequestoptions = new WLRequestOptions();
            ner ner = new ner(WLClient.this);
            WLClient wlclient = WLClient.getInstance();
            if (wlclient != null)
            {
                (new WLRequest(ner, wlrequestoptions, WLConfig.getInstance(), wlclient.getContext())).makeRequest("heartbeat");
                return;
            }
        }
    }

    ner(Context context1)
    {
        this$0 = WLClient.this;
        super();
        context = null;
        context = context1;
    }
}
