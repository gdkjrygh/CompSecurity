// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import android.text.TextUtils;
import com.pinterest.api.ApiFields;
import com.pinterest.api.RequestParams;
import java.util.List;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi

public class FlashlightApi extends BaseApi
{

    public static void a(String s, float f, float f1, float f2, float f3, List list, com.pinterest.activity.flashlight.FlashlightResultsFragment.FlashlightFeedApiResponseHandler flashlightfeedapiresponsehandler, String s1)
    {
        s = String.format("visual_search/flashlight/signature/%s/", new Object[] {
            s
        });
        RequestParams requestparams = new RequestParams();
        requestparams.a("fields", ApiFields.b());
        requestparams.a("x", String.valueOf(f));
        requestparams.a("y", String.valueOf(f1));
        requestparams.a("w", String.valueOf(f2));
        requestparams.a("h", String.valueOf(f3));
        if (list != null && !list.isEmpty())
        {
            requestparams.a("text_filters", TextUtils.join(",", list));
        }
        a(s, requestparams, ((com.pinterest.api.BaseApiResponseHandler) (flashlightfeedapiresponsehandler)), s1);
    }
}
