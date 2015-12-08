// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth2;

import com.google.api.client.util.Preconditions;
import com.google.api.client.util.store.DataStore;
import com.google.api.client.util.store.DataStoreFactory;
import java.io.IOException;

// Referenced classes of package com.google.api.client.auth.oauth2:
//            CredentialRefreshListener, StoredCredential, Credential, TokenErrorResponse, 
//            TokenResponse

public final class DataStoreCredentialRefreshListener
    implements CredentialRefreshListener
{

    private final DataStore credentialDataStore;
    private final String userId;

    public DataStoreCredentialRefreshListener(String s, DataStore datastore)
    {
        userId = (String)Preconditions.checkNotNull(s);
        credentialDataStore = (DataStore)Preconditions.checkNotNull(datastore);
    }

    public DataStoreCredentialRefreshListener(String s, DataStoreFactory datastorefactory)
        throws IOException
    {
        this(s, StoredCredential.getDefaultDataStore(datastorefactory));
    }

    public DataStore getCredentialDataStore()
    {
        return credentialDataStore;
    }

    public void makePersistent(Credential credential)
        throws IOException
    {
        credentialDataStore.set(userId, new StoredCredential(credential));
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
