// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.experiment;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.base.Events;
import com.pinterest.kit.data.DiskCache;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.experiment:
//            Experiments

public class a extends ApiResponseHandler
{

    private boolean a;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        Events.post(new t>(a));
    }

    public void onFinish()
    {
        super.onFinish();
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        PinterestJsonObject pinterestjsonobject = (PinterestJsonObject)apiresponse.getData();
        if (pinterestjsonobject != null)
        {
            try
            {
                Experiments.a(pinterestjsonobject);
                DiskCache.setJsonObject("MY_EXPERIMENTS", pinterestjsonobject);
            }
            catch (Exception exception) { }
        }
        super.onSuccess(apiresponse);
        a = true;
        Experiments.Y();
        Events.post(new t>(a));
        return;
    }

    public ()
    {
        a = false;
    }
}
