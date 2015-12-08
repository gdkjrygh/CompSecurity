// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import android.text.TextUtils;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.RequestParams;
import java.util.List;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi

public class HomefeedApi extends BaseApi
{

    public static void a(BaseApiResponseHandler baseapiresponsehandler, List list, List list1, String s)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("followed_interests", TextUtils.join(",", list));
        requestparams.a("unfollowed_interests", TextUtils.join(",", list1));
        b("feeds/feedbuilder_complete/", requestparams, baseapiresponsehandler, s);
    }
}
