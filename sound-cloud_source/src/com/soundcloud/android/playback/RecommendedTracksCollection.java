// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.api.model.ModelCollection;
import java.util.List;

class RecommendedTracksCollection extends ModelCollection
{

    private String sourceVersion;

    public RecommendedTracksCollection()
    {
    }

    public RecommendedTracksCollection(List list, String s)
    {
        super(list);
        sourceVersion = s;
    }

    public String getSourceVersion()
    {
        return sourceVersion;
    }

    public void setSourceVersion(String s)
    {
        sourceVersion = s;
    }
}
