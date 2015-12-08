// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.auth;

import twitter4j.TwitterException;

// Referenced classes of package twitter4j.auth:
//            AccessToken, RequestToken

public interface OAuthSupport
{

    public abstract AccessToken getOAuthAccessToken()
        throws TwitterException;

    public abstract AccessToken getOAuthAccessToken(String s)
        throws TwitterException;

    public abstract AccessToken getOAuthAccessToken(String s, String s1)
        throws TwitterException;

    public abstract AccessToken getOAuthAccessToken(RequestToken requesttoken)
        throws TwitterException;

    public abstract AccessToken getOAuthAccessToken(RequestToken requesttoken, String s)
        throws TwitterException;

    public abstract RequestToken getOAuthRequestToken()
        throws TwitterException;

    public abstract RequestToken getOAuthRequestToken(String s)
        throws TwitterException;

    public abstract RequestToken getOAuthRequestToken(String s, String s1)
        throws TwitterException;

    public abstract void setOAuthAccessToken(AccessToken accesstoken);

    public abstract void setOAuthConsumer(String s, String s1);
}
