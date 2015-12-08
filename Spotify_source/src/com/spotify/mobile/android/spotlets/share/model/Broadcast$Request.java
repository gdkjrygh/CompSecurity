// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.share.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;

public class mNetworks
    implements JacksonModel
{

    private String mMessage;
    private mNetworks mNetworks[];
    private String mTitle;
    private String mUri;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof mNetworks))
            {
                return false;
            }
            obj = (mNetworks)obj;
            if (mMessage == null ? ((mMessage) (obj)).mMessage != null : !mMessage.equals(((mMessage) (obj)).mMessage))
            {
                return false;
            }
            if (!Arrays.equals(mNetworks, ((mNetworks) (obj)).mNetworks))
            {
                return false;
            }
            if (mTitle == null ? ((mTitle) (obj)).mTitle != null : !mTitle.equals(((mTitle) (obj)).mTitle))
            {
                return false;
            }
            if (mUri == null ? ((mUri) (obj)).mUri != null : !mUri.equals(((mUri) (obj)).mUri))
            {
                return false;
            }
        }
        return true;
    }

    public String getMessage()
    {
        return mMessage;
    }

    public mMessage[] getNetworks()
    {
        return mNetworks;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public String getUri()
    {
        return mUri;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (mUri != null)
        {
            i = mUri.hashCode();
        } else
        {
            i = 0;
        }
        if (mTitle != null)
        {
            j = mTitle.hashCode();
        } else
        {
            j = 0;
        }
        if (mMessage != null)
        {
            k = mMessage.hashCode();
        } else
        {
            k = 0;
        }
        if (mNetworks != null)
        {
            l = Arrays.hashCode(mNetworks);
        }
        return (k + (j + i * 31) * 31) * 31 + l;
    }

    public (String s, String s1, String s2,  a[])
    {
        mUri = s;
        mTitle = s1;
        mMessage = s2;
        s = a;
        if (a == null)
        {
            s = new mMessage[0];
        }
        mNetworks = s;
    }
}
