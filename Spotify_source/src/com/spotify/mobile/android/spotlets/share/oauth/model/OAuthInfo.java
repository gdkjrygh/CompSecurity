// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.share.oauth.model;

import com.spotify.mobile.android.util.Assertion;

public final class OAuthInfo extends Enum
{

    public static final OAuthInfo a;
    public static final OAuthInfo b;
    private static final OAuthInfo c[];
    public String mAccessTokenUrl;
    public String mAuthorizeUrl;
    public String mCallbackUrl;
    public String mRequestTokenUrl;
    public String mWhiteListedUrls[];

    private transient OAuthInfo(String s, int i, String s1, String s2, String s3, String s4, String as[])
    {
        super(s, i);
        Assertion.a(s1);
        Assertion.a(s2);
        Assertion.a(s3);
        Assertion.a(s4);
        Assertion.a(as);
        mRequestTokenUrl = s1;
        mAuthorizeUrl = s2;
        mAccessTokenUrl = s3;
        mCallbackUrl = s4;
        mWhiteListedUrls = as;
    }

    public static OAuthInfo valueOf(String s)
    {
        return (OAuthInfo)Enum.valueOf(com/spotify/mobile/android/spotlets/share/oauth/model/OAuthInfo, s);
    }

    public static OAuthInfo[] values()
    {
        return (OAuthInfo[])c.clone();
    }

    static 
    {
        a = new OAuthInfo("TWITTER", 0, "https://api.twitter.com/oauth/request_token", "https://api.twitter.com/oauth/authorize", "https://api.twitter.com/oauth/access_token", "http://localhost", new String[] {
            "https://twitter.com/login", "https://api.twitter.com/login", "https://mobile.twitter.com/login", "https://www.twitter.com/login", "https://twitter.com/logout", "https://api.twitter.com/logout", "https://mobile.twitter.com/logout", "https://www.twitter.com/logout", "https://twitter.com/oauth", "https://api.twitter.com/oauth", 
            "https://mobile.twitter.com/oauth", "https://www.twitter.com/oauth"
        });
        b = new OAuthInfo("TUMBLR", 1, "https://www.tumblr.com/oauth/request_token", "https://www.tumblr.com/oauth/authorize", "https://www.tumblr.com/oauth/access_token", "http://localhost", new String[] {
            "https://www.tumblr.com/login", "https://www.tumblr.com/logout"
        });
        c = (new OAuthInfo[] {
            a, b
        });
    }
}
