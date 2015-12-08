// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.oauth;

import java.io.Serializable;

public class OAuthToken
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String oauthToken;
    private String oauthTokenSecret;

    public OAuthToken()
    {
    }

    public OAuthToken(String s, String s1)
    {
        oauthToken = s;
        oauthTokenSecret = s1;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (!(obj instanceof OAuthToken))
        {
            return false;
        }
        obj = (OAuthToken)obj;
        if (oauthToken == null)
        {
            if (((OAuthToken) (obj)).oauthToken != null)
            {
                return false;
            }
        } else
        if (!oauthToken.equals(((OAuthToken) (obj)).oauthToken))
        {
            return false;
        }
        if (oauthTokenSecret != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((OAuthToken) (obj)).oauthTokenSecret == null) goto _L1; else goto _L3
_L3:
        return false;
        if (oauthTokenSecret.equals(((OAuthToken) (obj)).oauthTokenSecret)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getOauthToken()
    {
        return oauthToken;
    }

    public String getOauthTokenSecret()
    {
        return oauthTokenSecret;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (oauthToken == null)
        {
            i = 0;
        } else
        {
            i = oauthToken.hashCode();
        }
        if (oauthTokenSecret != null)
        {
            j = oauthTokenSecret.hashCode();
        }
        return (i + 31) * 31 + j;
    }

    public void setOauthToken(String s)
    {
        oauthToken = s;
    }

    public void setOauthTokenSecret(String s)
    {
        oauthTokenSecret = s;
    }

    public String toString()
    {
        return (new StringBuilder("OAuthToken [oauthToken=")).append(oauthToken).append(", oauthTokenSecret=").append(oauthTokenSecret).append("]").toString();
    }
}
