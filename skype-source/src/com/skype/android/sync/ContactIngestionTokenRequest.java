// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.sync;

import com.skype.android.app.token.AbstractTokenRequest;
import com.skype.android.app.token.MsaTokenRequest;
import com.skype.android.app.token.SkypeTokenAccess;
import com.skype.android.inject.AccountProvider;

public class ContactIngestionTokenRequest extends AbstractTokenRequest
{

    private static final String SCOPES_TARGET_LIVE = "people.directory.live.com";
    private static final String SCOPES_TARGET_TEST = "people.directory.live-int.com";

    public ContactIngestionTokenRequest(AccountProvider accountprovider, MsaTokenRequest msatokenrequest, SkypeTokenAccess skypetokenaccess)
    {
        super(accountprovider, msatokenrequest, skypetokenaccess);
    }

    protected String getMsaScopeTarget()
    {
        return "people.directory.live.com";
    }
}
