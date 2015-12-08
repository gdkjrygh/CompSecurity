// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendshare;

import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.remote.ApiServices;
import com.pinterest.api.remote.SendApi;
import com.pinterest.common.async.BackgroundTask;

// Referenced classes of package com.pinterest.activity.sendshare:
//            SendShareSearchFragment

class this._cls0 extends BackgroundTask
{

    final SendShareSearchFragment this$0;

    public void run()
    {
        SendShareSearchFragment.access$300(SendShareSearchFragment.this).b.a(new BaseApiResponseHandler(), "SEND_API_CACHE");
    }

    ()
    {
        this$0 = SendShareSearchFragment.this;
        super();
    }
}
