// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.service.user:
//            SimpleUserAgentWebCallback, UserAgent, UserAgentWebCallback

class t> extends SimpleUserAgentWebCallback
{

    final allback this$1;

    public void onDummyWebCallDone(int i)
    {
        if (allback != null)
        {
            allback.onDummyWebCallDone(i);
            allback = null;
        }
        Log.d("nf_service_useragent", "dummy web call done");
    }

    I()
    {
        this$1 = this._cls1.this;
        super();
    }
}
