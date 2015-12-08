// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.activity;

import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.remote.AnalyticsApi;

// Referenced classes of package com.pinterest.kit.activity:
//            BaseActivity

class this._cls0
    implements Runnable
{

    final BaseActivity this$0;

    public void run()
    {
        AnalyticsApi.a(new BaseApiResponseHandler());
    }

    ()
    {
        this$0 = BaseActivity.this;
        super();
    }
}
