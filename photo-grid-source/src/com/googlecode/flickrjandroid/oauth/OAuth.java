// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.oauth;

import com.googlecode.flickrjandroid.people.User;
import java.io.Serializable;

// Referenced classes of package com.googlecode.flickrjandroid.oauth:
//            OAuthToken

public class OAuth
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private OAuthToken token;
    private User user;

    public OAuth()
    {
    }

    public OAuthToken getToken()
    {
        return token;
    }

    public User getUser()
    {
        return user;
    }

    public void setToken(OAuthToken oauthtoken)
    {
        token = oauthtoken;
    }

    public void setUser(User user1)
    {
        user = user1;
    }

    public String toString()
    {
        return (new StringBuilder("OAuth [token=")).append(token).append(", user=").append(user).append("]").toString();
    }
}
