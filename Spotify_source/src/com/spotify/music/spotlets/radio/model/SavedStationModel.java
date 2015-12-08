// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.radio.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import cty;

public class SavedStationModel
    implements JacksonModel
{

    public final String seedUri;

    public SavedStationModel(String s)
    {
        seedUri = s;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof SavedStationModel)
        {
            obj = (SavedStationModel)obj;
            return cty.a(seedUri, ((SavedStationModel) (obj)).seedUri);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return seedUri.hashCode();
    }
}
