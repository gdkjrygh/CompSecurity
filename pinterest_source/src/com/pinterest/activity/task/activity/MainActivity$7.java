// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.activity;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.task.activity:
//            MainActivity

class this._cls0 extends ApiResponseHandler
{

    final MainActivity this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        apiresponse = (PinterestJsonObject)apiresponse.getData();
        (new itTypeaheadCacheTask(MainActivity.this, apiresponse)).execute();
    }

    itTypeaheadCacheTask()
    {
        this$0 = MainActivity.this;
        super();
    }
}
