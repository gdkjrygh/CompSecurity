// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth2;

import java.io.IOException;

// Referenced classes of package com.google.api.client.auth.oauth2:
//            Credential, TokenErrorResponse, TokenResponse

public interface CredentialRefreshListener
{

    public abstract void onTokenErrorResponse(Credential credential, TokenErrorResponse tokenerrorresponse)
        throws IOException;

    public abstract void onTokenResponse(Credential credential, TokenResponse tokenresponse)
        throws IOException;
}
