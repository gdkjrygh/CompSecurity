// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.share.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

public class mFacebook
    implements JacksonModel
{

    List mFacebook;
    List mSpotify;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof mFacebook))
            {
                return false;
            }
            obj = (mFacebook)obj;
            if (mFacebook == null ? ((mFacebook) (obj)).mFacebook != null : !mFacebook.equals(((mFacebook) (obj)).mFacebook))
            {
                return false;
            }
            if (mSpotify == null ? ((mSpotify) (obj)).mSpotify != null : !mSpotify.equals(((mSpotify) (obj)).mSpotify))
            {
                return false;
            }
        }
        return true;
    }

    public List getFacebook()
    {
        return mFacebook;
    }

    public List getSpotify()
    {
        return mSpotify;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (mSpotify != null)
        {
            i = mSpotify.hashCode();
        } else
        {
            i = 0;
        }
        if (mFacebook != null)
        {
            j = mFacebook.hashCode();
        }
        return i * 31 + j;
    }

    public (List list, List list1)
    {
        mSpotify = list;
        mFacebook = list1;
    }
}
