// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;

import android.text.TextUtils;
import android.util.Base64;
import com.google.gson.Gson;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.braintreepayments.api:
//            Utils

class ClientToken
{

    private Analytics analytics;
    private String authorizationFingerprint;
    private String challenges[];
    private String clientApiUrl;
    private String merchantAccountId;
    private String merchantId;
    private PayPal paypal;
    private boolean paypalEnabled;
    private boolean threeDSecureEnabled;
    private String venmo;

    ClientToken()
    {
    }

    protected static ClientToken getClientToken(String s)
    {
        String s1 = s;
        if (Pattern.compile("([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)").matcher(s).matches())
        {
            s1 = new String(Base64.decode(s, 0));
        }
        return (ClientToken)Utils.getGson().a(s1, com/braintreepayments/api/ClientToken);
    }

    private boolean isChallengePresent(String s)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (challenges == null) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (challenges.length <= 0) goto _L2; else goto _L3
_L3:
        String as[];
        int i;
        int j;
        as = challenges;
        j = as.length;
        i = 0;
_L8:
        flag = flag1;
        if (i >= j) goto _L2; else goto _L4
_L4:
        if (!as[i].equals(s)) goto _L6; else goto _L5
_L5:
        flag = true;
_L2:
        return flag;
_L6:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected Analytics getAnalytics()
    {
        return analytics;
    }

    protected String getAuthorizationFingerprint()
    {
        return authorizationFingerprint;
    }

    protected String getClientApiUrl()
    {
        return clientApiUrl;
    }

    protected String getMerchantAccountId()
    {
        return merchantAccountId;
    }

    protected String getMerchantId()
    {
        return merchantId;
    }

    protected PayPal getPayPal()
    {
        return paypal;
    }

    protected String getVenmoState()
    {
        if (venmo == null)
        {
            return "off";
        } else
        {
            return venmo;
        }
    }

    protected boolean isAnalyticsEnabled()
    {
        return analytics != null && !TextUtils.isEmpty(analytics.getUrl());
    }

    protected boolean isCvvChallengePresent()
    {
        return isChallengePresent("cvv");
    }

    protected boolean isPayPalEnabled()
    {
        return paypalEnabled && paypal != null;
    }

    protected boolean isPostalCodeChallengePresent()
    {
        return isChallengePresent("postal_code");
    }

    protected boolean isThreeDSecureEnabled()
    {
        return threeDSecureEnabled;
    }

    private class Analytics
    {

        final ClientToken this$0;
        private String url;

        protected String getUrl()
        {
            return url;
        }

        Analytics()
        {
            this$0 = ClientToken.this;
            super();
        }
    }

}
