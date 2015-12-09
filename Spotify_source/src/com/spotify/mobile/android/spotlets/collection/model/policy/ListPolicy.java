// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.model.policy;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Map;

public class ListPolicy
    implements JacksonModel
{

    private Map mAlbumAttributes;
    private Map mArtistAttributes;
    private Map mArtistsAttributes;
    private Map mAttributes;
    private Map mShowAttributes;

    public ListPolicy()
    {
    }

    public Map getMap()
    {
        return mAttributes;
    }

    public void setAlbumAttributes(Map map)
    {
        mAlbumAttributes = map;
    }

    public void setArtistAttributes(Map map)
    {
        mArtistAttributes = map;
    }

    public void setArtistsAttributes(Map map)
    {
        mArtistsAttributes = map;
    }

    public void setListAttributes(Map map)
    {
        mAttributes = map;
    }

    public void setShowAttributes(Map map)
    {
        mShowAttributes = map;
    }
}
