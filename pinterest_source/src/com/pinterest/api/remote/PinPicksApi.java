// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import android.text.TextUtils;
import com.pinterest.api.ApiFields;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.RequestParams;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi

public class PinPicksApi extends BaseApi
{

    public static void f(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        }
        String s2 = s;
        if (s.startsWith("/"))
        {
            s2 = s.substring(1);
        }
        s = new RequestParams();
        s.a("fields", (new StringBuilder()).append(ApiFields.l).append(",board.type").toString());
        a(s2, s, baseapiresponsehandler, s1);
    }
}
