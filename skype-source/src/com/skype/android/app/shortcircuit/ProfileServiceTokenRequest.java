// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.shortcircuit;

import com.skype.android.app.token.AbstractTokenRequest;
import com.skype.android.app.token.MsaTokenRequest;
import com.skype.android.app.token.SkypeTokenAccess;
import com.skype.android.inject.AccountProvider;

// Referenced classes of package com.skype.android.app.shortcircuit:
//            ProfileServiceToken

public class ProfileServiceTokenRequest extends AbstractTokenRequest
{

    public static final String HEADER_MSA_TICKET = "PS-MSAAuthTicket";
    public static final String HEADER_SKYPE_TOKEN = "X-SkypeToken";
    private static final String SCOPES_TARGET_PF = "pf.directory.live.com";
    private static final String SCOPES_TARGET_PF_TEST = "pf.directory.live-int.com";

    public ProfileServiceTokenRequest(AccountProvider accountprovider, MsaTokenRequest msatokenrequest, SkypeTokenAccess skypetokenaccess)
    {
        super(accountprovider, msatokenrequest, skypetokenaccess);
    }

    public static ProfileServiceToken getProfileServiceToken(com.skype.android.app.token.AbstractTokenRequest.TokenAccount tokenaccount, String s)
    {
        if (tokenaccount == com.skype.android.app.token.AbstractTokenRequest.TokenAccount.MSA)
        {
            tokenaccount = "PS-MSAAuthTicket";
        } else
        {
            tokenaccount = "X-SkypeToken";
        }
        return new ProfileServiceToken(tokenaccount, s);
    }

    protected String getMsaScopeTarget()
    {
        return "pf.directory.live.com";
    }
}
