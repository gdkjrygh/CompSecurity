// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.share.model;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class Resource
    implements JacksonModel
{

    private String mImage;
    private String mSubtitle;
    private String mTitle;
    private String mType;
    private String mUri;

    public Resource(String s, String s1, String s2, String s3, String s4)
    {
        mType = s;
        mUri = s1;
        mTitle = s2;
        mSubtitle = s3;
        mImage = s4;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Resource))
            {
                return false;
            }
            obj = (Resource)obj;
            if (mImage == null ? ((Resource) (obj)).mImage != null : !mImage.equals(((Resource) (obj)).mImage))
            {
                return false;
            }
            if (mSubtitle == null ? ((Resource) (obj)).mSubtitle != null : !mSubtitle.equals(((Resource) (obj)).mSubtitle))
            {
                return false;
            }
            if (mTitle == null ? ((Resource) (obj)).mTitle != null : !mTitle.equals(((Resource) (obj)).mTitle))
            {
                return false;
            }
            if (mType == null ? ((Resource) (obj)).mType != null : !mType.equals(((Resource) (obj)).mType))
            {
                return false;
            }
            if (mUri == null ? ((Resource) (obj)).mUri != null : !mUri.equals(((Resource) (obj)).mUri))
            {
                return false;
            }
        }
        return true;
    }

    public String getImage()
    {
        return mImage;
    }

    public String getSubtitle()
    {
        return mSubtitle;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public String getType()
    {
        return mType;
    }

    public String getUri()
    {
        return mUri;
    }

    public int hashCode()
    {
        int i1 = 0;
        int i;
        int j;
        int k;
        int l;
        if (mType != null)
        {
            i = mType.hashCode();
        } else
        {
            i = 0;
        }
        if (mUri != null)
        {
            j = mUri.hashCode();
        } else
        {
            j = 0;
        }
        if (mTitle != null)
        {
            k = mTitle.hashCode();
        } else
        {
            k = 0;
        }
        if (mSubtitle != null)
        {
            l = mSubtitle.hashCode();
        } else
        {
            l = 0;
        }
        if (mImage != null)
        {
            i1 = mImage.hashCode();
        }
        return (l + (k + (j + i * 31) * 31) * 31) * 31 + i1;
    }
}
