// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.autoupdate;

import android.util.Log;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.kit.autoupdate:
//            OtaAutoUpdateClient

final class  extends BaseApiResponseHandler
{

    public final void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        Log.e("DebugAutoUpdateManager", (new StringBuilder("Failed to retrieve latest Jenkins Build Version ")).append(apiresponse).append(" ").append(apiresponse.getCode()).append(" ").append(apiresponse.getStatus()).append(" ").append(apiresponse.getMessage()).toString(), throwable);
    }

    public final void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        super.onSuccess(pinterestjsonobject);
        if (pinterestjsonobject == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        OtaAutoUpdateClient.a(Integer.parseInt(pinterestjsonobject.a("android_latest_version", "")));
        int i = OtaAutoUpdateClient.a();
        if (OtaAutoUpdateClient.b() - i >= 4)
        {
            OtaAutoUpdateClient.c();
        }
        return;
        pinterestjsonobject;
    }

    ()
    {
    }
}
