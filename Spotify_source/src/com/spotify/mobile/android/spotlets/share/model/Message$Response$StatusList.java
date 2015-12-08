// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.share.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Map;

public class mFacebookStatusMap
    implements JacksonModel
{

    private Map mFacebookStatusMap;
    private Map mSpotifyStatusMap;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof mFacebookStatusMap))
            {
                return false;
            }
            obj = (mFacebookStatusMap)obj;
            if (mFacebookStatusMap == null ? ((mFacebookStatusMap) (obj)).mFacebookStatusMap != null : !mFacebookStatusMap.equals(((mFacebookStatusMap) (obj)).mFacebookStatusMap))
            {
                return false;
            }
            if (mSpotifyStatusMap == null ? ((mSpotifyStatusMap) (obj)).mSpotifyStatusMap != null : !mSpotifyStatusMap.equals(((mSpotifyStatusMap) (obj)).mSpotifyStatusMap))
            {
                return false;
            }
        }
        return true;
    }

    public Map getFacebookStatusMap()
    {
        return mFacebookStatusMap;
    }

    public Map getSpotifyStatusMap()
    {
        return mSpotifyStatusMap;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (mSpotifyStatusMap != null)
        {
            i = mSpotifyStatusMap.hashCode();
        } else
        {
            i = 0;
        }
        if (mFacebookStatusMap != null)
        {
            j = mFacebookStatusMap.hashCode();
        }
        return i * 31 + j;
    }

    public Q(Map map, Map map1)
    {
        mSpotifyStatusMap = map;
        mFacebookStatusMap = map1;
    }
}
