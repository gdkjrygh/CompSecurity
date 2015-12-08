// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.auth;


// Referenced classes of package twitter4j.auth:
//            AccessToken, RequestToken

public interface OAuthSupport
{

    public abstract AccessToken getOAuthAccessToken();

    public abstract AccessToken getOAuthAccessToken(String s);

    public abstract AccessToken getOAuthAccessToken(String s, String s1);

    public abstract AccessToken getOAuthAccessToken(RequestToken requesttoken);

    public abstract AccessToken getOAuthAccessToken(RequestToken requesttoken, String s);

    public abstract RequestToken getOAuthRequestToken();

    public abstract RequestToken getOAuthRequestToken(String s);

    public abstract RequestToken getOAuthRequestToken(String s, String s1);

    public abstract void setOAuthAccessToken(AccessToken accesstoken);

    public abstract void setOAuthConsumer(String s, String s1);
}
