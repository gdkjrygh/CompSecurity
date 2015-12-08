// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;


// Referenced classes of package com.braintreepayments.api:
//            ClientToken

class this._cls0
{

    private boolean allowHttp;
    private String clientId;
    private String directBaseUrl;
    private String displayName;
    private String environment;
    private String privacyUrl;
    final ClientToken this$0;
    private boolean touchDisabled;
    private String userAgreementUrl;

    protected boolean getAllowHttp()
    {
        return allowHttp;
    }

    protected String getClientId()
    {
        return clientId;
    }

    protected String getDirectBaseUrl()
    {
        return (new StringBuilder()).append(directBaseUrl).append("/v1/").toString();
    }

    protected String getDisplayName()
    {
        return displayName;
    }

    protected String getEnvironment()
    {
        return environment;
    }

    protected String getPrivacyUrl()
    {
        return privacyUrl;
    }

    protected boolean getTouchDisabled()
    {
        return touchDisabled;
    }

    protected String getUserAgreementUrl()
    {
        return userAgreementUrl;
    }

    ()
    {
        this$0 = ClientToken.this;
        super();
    }
}
