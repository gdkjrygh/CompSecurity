// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.share.model;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class mToken
    implements JacksonModel
{

    private String mEmail;
    private String mId;
    private String mPassword;
    private String mToken;
    private String mUsername;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof mToken))
            {
                return false;
            }
            obj = (mToken)obj;
            if (mEmail == null ? ((mEmail) (obj)).mEmail != null : !mEmail.equals(((mEmail) (obj)).mEmail))
            {
                return false;
            }
            if (mId == null ? ((mId) (obj)).mId != null : !mId.equals(((mId) (obj)).mId))
            {
                return false;
            }
            if (mPassword == null ? ((mPassword) (obj)).mPassword != null : !mPassword.equals(((mPassword) (obj)).mPassword))
            {
                return false;
            }
            if (mToken == null ? ((mToken) (obj)).mToken != null : !mToken.equals(((mToken) (obj)).mToken))
            {
                return false;
            }
            if (mUsername == null ? ((mUsername) (obj)).mUsername != null : !mUsername.equals(((mUsername) (obj)).mUsername))
            {
                return false;
            }
        }
        return true;
    }

    public String getEmail()
    {
        return mEmail;
    }

    public String getId()
    {
        return mId;
    }

    public String getPassword()
    {
        return mPassword;
    }

    public String getToken()
    {
        return mToken;
    }

    public String getUsername()
    {
        return mUsername;
    }

    public int hashCode()
    {
        int i1 = 0;
        int i;
        int j;
        int k;
        int l;
        if (mId != null)
        {
            i = mId.hashCode();
        } else
        {
            i = 0;
        }
        if (mUsername != null)
        {
            j = mUsername.hashCode();
        } else
        {
            j = 0;
        }
        if (mEmail != null)
        {
            k = mEmail.hashCode();
        } else
        {
            k = 0;
        }
        if (mPassword != null)
        {
            l = mPassword.hashCode();
        } else
        {
            l = 0;
        }
        if (mToken != null)
        {
            i1 = mToken.hashCode();
        }
        return (l + (k + (j + i * 31) * 31) * 31) * 31 + i1;
    }

    public (String s, String s1, String s2, String s3, String s4)
    {
        mId = s;
        mUsername = s1;
        mEmail = s2;
        mPassword = s3;
        mToken = s4;
    }
}
