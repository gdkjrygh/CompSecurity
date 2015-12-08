// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.scribe.oauth;

import org.scribe.model.OAuthRequest;
import org.scribe.model.Token;
import org.scribe.model.Verifier;

public interface OAuthService
{

    public abstract Token getAccessToken(Token token, Verifier verifier);

    public abstract String getAuthorizationUrl(Token token);

    public abstract Token getRequestToken();

    public abstract String getVersion();

    public abstract void signRequest(Token token, OAuthRequest oauthrequest);
}
