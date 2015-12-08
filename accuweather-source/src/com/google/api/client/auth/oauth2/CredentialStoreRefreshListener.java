// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth2;

import com.google.api.client.util.Preconditions;
import java.io.IOException;

// Referenced classes of package com.google.api.client.auth.oauth2:
//            CredentialRefreshListener, CredentialStore, Credential, TokenErrorResponse, 
//            TokenResponse

public final class CredentialStoreRefreshListener
    implements CredentialRefreshListener
{

    private final CredentialStore credentialStore;
    private final String userId;

    public CredentialStoreRefreshListener(String s, CredentialStore credentialstore)
    {
        userId = (String)Preconditions.checkNotNull(s);
        credentialStore = (CredentialStore)Preconditions.checkNotNull(credentialstore);
    }

    public CredentialStore getCredentialStore()
    {
        return credentialStore;
    }

    public void makePersistent(Credential credential)
        throws IOException
    {
        credentialStore.store(userId, credential);
    }

    public void onTokenErrorResponse(Credential credential, TokenErrorResponse tokenerrorresponse)
        throws IOException
    {
        makePersistent(credential);
    }

    public void onTokenResponse(Credential credential, TokenResponse tokenresponse)
        throws IOException
    {
        makePersistent(credential);
    }
}
