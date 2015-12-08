// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.analytics.FunnelActions;
import com.pinterest.api.ApiHttpClient;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.BaseApiResponseHandler;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi, AnalyticsApi

public class BusinessApi extends BaseApi
{

    public static void a(ApiResponseHandler apiresponsehandler)
    {
        ApiHttpClient.signedCall("partners/account_types/", "GET", null, apiresponsehandler, null, null);
    }

    public static void a(PartnerParams partnerparams, BaseApiResponseHandler baseapiresponsehandler)
    {
        TreeMap treemap = new TreeMap();
        treemap.put("email", partnerparams.c);
        treemap.put("password", partnerparams.e);
        treemap.put("business_name", partnerparams.A);
        treemap.put("first_name", partnerparams.A);
        treemap.put("account_type", partnerparams.B);
        if (StringUtils.isNotEmpty(partnerparams.C))
        {
            treemap.put("website_url", partnerparams.C);
        }
        treemap.put("locale", Locale.getDefault().toString());
        if (partnerparams.u != null)
        {
            treemap.put("invite_code", partnerparams.u);
        }
        AnalyticsApi.a(FunnelActions.a(6));
        ApiHttpClient.signedCall("register/partner/", "POST", treemap, baseapiresponsehandler, null, null);
    }

    private class PartnerParams extends AccountApi.SignupParams
    {

        public String A;
        public String B;
        public String C;

        public PartnerParams()
        {
        }
    }

}
