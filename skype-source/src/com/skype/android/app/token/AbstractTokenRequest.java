// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.token;

import com.skype.android.inject.AccountProvider;
import com.skype.android.util.AccountUtil;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.token:
//            MsaTokenRequestCallback, SkypeTokenCallback, TokenRequestCallback, MsaTokenRequest, 
//            SkypeTokenAccess

public abstract class AbstractTokenRequest
    implements MsaTokenRequestCallback, SkypeTokenCallback
{
    public static final class TokenAccount extends Enum
    {

        private static final TokenAccount $VALUES[];
        public static final TokenAccount MSA;
        public static final TokenAccount SKYPE;

        public static TokenAccount valueOf(String s)
        {
            return (TokenAccount)Enum.valueOf(com/skype/android/app/token/AbstractTokenRequest$TokenAccount, s);
        }

        public static TokenAccount[] values()
        {
            return (TokenAccount[])$VALUES.clone();
        }

        static 
        {
            MSA = new TokenAccount("MSA", 0);
            SKYPE = new TokenAccount("SKYPE", 1);
            $VALUES = (new TokenAccount[] {
                MSA, SKYPE
            });
        }

        private TokenAccount(String s, int i)
        {
            super(s, i);
        }
    }


    private static final Logger log = Logger.getLogger("AbstractTokenRequest");
    private final AccountProvider accountProvider;
    private final Object lockForTokenCallback = new Object();
    private final MsaTokenRequest msaTokenRequest;
    private final SkypeTokenAccess skypeTokenAccess;
    private TokenRequestCallback tokenRequestCallback;

    protected AbstractTokenRequest(AccountProvider accountprovider, MsaTokenRequest msatokenrequest, SkypeTokenAccess skypetokenaccess)
    {
        accountProvider = accountprovider;
        msaTokenRequest = msatokenrequest;
        skypeTokenAccess = skypetokenaccess;
    }

    protected abstract String getMsaScopeTarget();

    public final void onMsaTokenRetrieved(String s)
    {
        log.info("Receiving MSA Token");
        onTokenRetrieved(TokenAccount.MSA, s);
    }

    public final void onSkypeTokenRetrieved(String s)
    {
        log.info("Receiving Skype Token");
        onTokenRetrieved(TokenAccount.SKYPE, s);
    }

    protected void onTokenRetrieved(TokenAccount tokenaccount, String s)
    {
        TokenRequestCallback tokenrequestcallback;
        synchronized (lockForTokenCallback)
        {
            tokenrequestcallback = tokenRequestCallback;
            tokenRequestCallback = null;
        }
        if (tokenrequestcallback == null)
        {
            log.warning("Ignoring retrieved token since there is no token callback.");
            return;
        } else
        {
            tokenrequestcallback.onTokenRetrieved(tokenaccount, s);
            return;
        }
        tokenaccount;
        obj;
        JVM INSTR monitorexit ;
        throw tokenaccount;
    }

    public void requestToken(TokenRequestCallback tokenrequestcallback)
    {
        synchronized (lockForTokenCallback)
        {
            if (tokenRequestCallback != null)
            {
                log.warning("Overwriting previous request.");
            }
            tokenRequestCallback = tokenrequestcallback;
        }
        if (AccountUtil.a(accountProvider.get()))
        {
            log.info("Requesting MSA Token");
            msaTokenRequest.requestTicket(getMsaScopeTarget(), this);
            return;
        } else
        {
            log.info("Requesting Skype Token");
            skypeTokenAccess.requestSkypeToken(this);
            return;
        }
        tokenrequestcallback;
        obj;
        JVM INSTR monitorexit ;
        throw tokenrequestcallback;
    }

}
