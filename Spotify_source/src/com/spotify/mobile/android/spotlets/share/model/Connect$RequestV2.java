// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.share.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;

public class mVerifier
    implements JacksonModel
{

    private String mId;
    private String mToken;
    private String mVerifier;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof mVerifier))
            {
                return false;
            }
            obj = (mVerifier)obj;
            if (mId == null ? ((mId) (obj)).mId != null : !mId.equals(((mId) (obj)).mId))
            {
                return false;
            }
            if (mToken == null ? ((mToken) (obj)).mToken != null : !mToken.equals(((mToken) (obj)).mToken))
            {
                return false;
            }
            if (mVerifier == null ? ((mVerifier) (obj)).mVerifier != null : !mVerifier.equals(((mVerifier) (obj)).mVerifier))
            {
                return false;
            }
        }
        return true;
    }

    public String getId()
    {
        return mId;
    }

    public String getToken()
    {
        return mToken;
    }

    public String getVerifier()
    {
        return mVerifier;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mId, mToken, mVerifier
        });
    }

    public (String s, String s1, String s2)
    {
        mId = s;
        mToken = s1;
        mVerifier = s2;
    }
}
