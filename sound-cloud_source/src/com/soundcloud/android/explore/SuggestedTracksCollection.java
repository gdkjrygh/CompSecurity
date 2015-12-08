// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import com.soundcloud.android.api.model.ModelCollection;

public class SuggestedTracksCollection extends ModelCollection
{

    private String trackingTag;

    public SuggestedTracksCollection()
    {
    }

    public String getTrackingTag()
    {
        return trackingTag;
    }

    public void setTrackingTag(String s)
    {
        trackingTag = s;
    }
}
