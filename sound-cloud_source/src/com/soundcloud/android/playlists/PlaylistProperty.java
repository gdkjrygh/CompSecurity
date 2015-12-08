// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.java.collections.Property;

public class PlaylistProperty extends PlayableProperty
{

    public static final Property IS_POSTED = Property.of(com/soundcloud/android/model/PlayableProperty, java/lang/Boolean);
    public static final Property TAGS = Property.ofOptionalList(com/soundcloud/android/playlists/PlaylistProperty, java/lang/String);
    public static final Property TRACK_COUNT = Property.of(com/soundcloud/android/playlists/PlaylistProperty, java/lang/Integer);

    public PlaylistProperty()
    {
    }

}
