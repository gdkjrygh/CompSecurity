// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.content.res.Resources;
import com.soundcloud.android.ads.AdProperty;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.java.collections.PropertySet;

public class NotificationTrack
{

    private final Resources resources;
    private final PropertySet source;

    public NotificationTrack(Resources resources1, PropertySet propertyset)
    {
        resources = resources1;
        source = propertyset;
    }

    public String getCreatorName()
    {
        if (isAnAdvertisement())
        {
            return resources.getString(0x7f07006b);
        } else
        {
            return (String)source.get(PlayableProperty.CREATOR_NAME);
        }
    }

    public long getDuration()
    {
        return ((Long)source.get(PlayableProperty.DURATION)).longValue();
    }

    public String getTitle()
    {
        return (String)source.get(PlayableProperty.TITLE);
    }

    public boolean isAnAdvertisement()
    {
        return source.contains(AdProperty.AD_URN);
    }
}
