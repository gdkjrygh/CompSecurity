// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.java.collections.Property;
import java.util.Date;

public final class PlaylistTrackProperty
{

    public static final Property ADDED_AT = Property.of(com/soundcloud/android/playlists/PlaylistTrackProperty, java/util/Date);
    public static final Property REMOVED_AT = Property.of(com/soundcloud/android/playlists/PlaylistTrackProperty, java/util/Date);
    public static final Property TRACK_URN;

    public PlaylistTrackProperty()
    {
    }

    static 
    {
        TRACK_URN = PlayableProperty.URN;
    }
}
