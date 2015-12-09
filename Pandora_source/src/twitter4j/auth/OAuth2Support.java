// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.auth;

import twitter4j.TwitterException;

// Referenced classes of package twitter4j.auth:
//            OAuth2Token

public interface OAuth2Support
{

    public abstract OAuth2Token getOAuth2Token()
        throws TwitterException;

    public abstract void invalidateOAuth2Token()
        throws TwitterException;

    public abstract void setOAuth2Token(OAuth2Token oauth2token);

    public abstract void setOAuthConsumer(String s, String s1);
}
