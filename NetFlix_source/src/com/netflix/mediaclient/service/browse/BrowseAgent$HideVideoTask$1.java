// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            SimpleBrowseAgentCallback, BrowseAgent, BrowseAgentCallback

class nit> extends SimpleBrowseAgentCallback
{

    final _cls1.val.statusCode this$1;

    public void onVideoHide(final int statusCode)
    {
        BrowseAgent.access$4500(_fld0).post(new Runnable() {

            final BrowseAgent.HideVideoTask._cls1 this$2;
            final int val$statusCode;

            public void run()
            {
                getCallback().onVideoHide(statusCode);
            }

            
            {
                this$2 = BrowseAgent.HideVideoTask._cls1.this;
                statusCode = i;
                super();
            }
        });
    }

    _cls1.val.statusCode()
    {
        this$1 = this._cls1.this;
        super();
    }
}
