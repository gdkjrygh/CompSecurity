// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.java.collections.PropertySet;

public class PlayerItem
{

    protected final PropertySet source;

    public PlayerItem(PropertySet propertyset)
    {
        source = propertyset;
    }

    public Urn getTrackUrn()
    {
        return (Urn)source.get(TrackProperty.URN);
    }
}
