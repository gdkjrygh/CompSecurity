// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth;


// Referenced classes of package com.google.api.client.auth.oauth:
//            AbstractOAuthGetToken, OAuthParameters

public class OAuthGetTemporaryToken extends AbstractOAuthGetToken
{

    public String callback;

    public OAuthGetTemporaryToken(String s)
    {
        super(s);
    }

    public OAuthParameters createParameters()
    {
        OAuthParameters oauthparameters = super.createParameters();
        oauthparameters.callback = callback;
        return oauthparameters;
    }
}
