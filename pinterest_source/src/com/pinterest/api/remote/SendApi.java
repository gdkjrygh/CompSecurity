// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import android.text.TextUtils;
import com.pinterest.api.ApiCacheStore;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.RequestParams;
import com.pinterest.kit.log.PLog;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi

public class SendApi extends BaseApi
{

    private final ApiCacheStore a;

    protected SendApi(ApiCacheStore apicachestore)
    {
        a = apicachestore;
    }

    public static void a(String s, String s1, String s2, BaseApiResponseHandler baseapiresponsehandler)
    {
        String s3 = (new StringBuilder("pins/")).append(s).append("/share/user/").toString();
        RequestParams requestparams = new RequestParams();
        requestparams.a("user", s1);
        requestparams.a("message", s2);
        PLog.info("sendPin pin %s, user %s", new Object[] {
            s, s1
        });
        b(s3, requestparams, baseapiresponsehandler, null);
    }

    public static void a(String s, String s1, String s2, String s3, String s4, BaseApiResponseHandler baseapiresponsehandler)
    {
        s = (new StringBuilder("pins/")).append(s).append("/share/email/").toString();
        RequestParams requestparams = new RequestParams();
        requestparams.a("email", s1);
        requestparams.a("recipient_name", s2);
        requestparams.a("recipient_image", s3);
        requestparams.a("message", s4);
        b(s, requestparams, baseapiresponsehandler, null);
    }

    public static void b(String s, String s1, String s2, BaseApiResponseHandler baseapiresponsehandler)
    {
        s = (new StringBuilder("boards/")).append(s).append("/share/user/").toString();
        RequestParams requestparams = new RequestParams();
        requestparams.a("user", s1);
        requestparams.a("message", s2);
        b(s, requestparams, baseapiresponsehandler, null);
    }

    public static void b(String s, String s1, String s2, String s3, String s4, BaseApiResponseHandler baseapiresponsehandler)
    {
        s = (new StringBuilder("boards/")).append(s).append("/share/email/").toString();
        RequestParams requestparams = new RequestParams();
        requestparams.a("email", s1);
        requestparams.a("recipient_name", s2);
        requestparams.a("recipient_image", s3);
        requestparams.a("message", s4);
        b(s, requestparams, baseapiresponsehandler, null);
    }

    public static void f(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("q", s);
        a("users/contacts/suggestions/search/share/", requestparams, baseapiresponsehandler, s1);
    }

    public final void a(BaseApiResponseHandler baseapiresponsehandler, String s)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("page_size", 15);
        requestparams.a("add_fields", "contact.user()");
        a("users/contacts/suggestions/share/", requestparams, a.a(baseapiresponsehandler, "users/contacts/suggestions/share/", requestparams, s), s);
    }

    public final void b(BaseApiResponseHandler baseapiresponsehandler, String s)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("page_size", 15);
        requestparams.a("add_fields", "contact.user()");
        s = a.a("users/contacts/suggestions/share/", requestparams, s);
        if (TextUtils.isEmpty(s))
        {
            baseapiresponsehandler.onFailure(new IllegalStateException("cache entry not initialized"), null);
            return;
        } else
        {
            baseapiresponsehandler.onResponse(s);
            return;
        }
    }
}
