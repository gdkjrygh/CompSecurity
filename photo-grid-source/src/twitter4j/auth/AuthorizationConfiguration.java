// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.auth;


public interface AuthorizationConfiguration
{

    public abstract String getOAuth2AccessToken();

    public abstract String getOAuth2TokenType();

    public abstract String getOAuthAccessToken();

    public abstract String getOAuthAccessTokenSecret();

    public abstract String getOAuthConsumerKey();

    public abstract String getOAuthConsumerSecret();

    public abstract String getPassword();

    public abstract String getUser();
}
