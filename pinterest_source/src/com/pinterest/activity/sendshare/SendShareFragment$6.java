// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendshare;

import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.remote.ApiServices;
import com.pinterest.api.remote.SendApi;
import com.pinterest.common.async.BackgroundTask;

// Referenced classes of package com.pinterest.activity.sendshare:
//            SendShareFragment

class this._cls0 extends BackgroundTask
{

    final SendShareFragment this$0;

    public void run()
    {
        SendShareFragment.access$600(SendShareFragment.this).b.a(new BaseApiResponseHandler(), "SEND_API_CACHE");
    }

    ()
    {
        this$0 = SendShareFragment.this;
        super();
    }
}
