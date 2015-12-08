// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.java.collections.Property;

public class TrackProperty extends PlayableProperty
{

    public static final Property COMMENTS_COUNT = Property.of(com/soundcloud/android/tracks/TrackProperty, java/lang/Integer);
    public static final Property DESCRIPTION = Property.of(com/soundcloud/android/tracks/TrackProperty, java/lang/String);
    public static final Property GENRE = Property.ofOptional(com/soundcloud/android/tracks/TrackProperty, java/lang/String);
    public static final Property MONETIZABLE = Property.of(com/soundcloud/android/tracks/TrackProperty, java/lang/Boolean);
    public static final Property MONETIZATION_MODEL = Property.of(com/soundcloud/android/tracks/TrackProperty, java/lang/String);
    public static final Property PLAY_COUNT = Property.of(com/soundcloud/android/tracks/TrackProperty, java/lang/Integer);
    public static final Property POLICY = Property.of(com/soundcloud/android/tracks/TrackProperty, java/lang/String);
    public static final Property STREAM_URL = Property.of(com/soundcloud/android/tracks/TrackProperty, java/lang/String);
    public static final Property SUB_MID_TIER = Property.of(com/soundcloud/android/tracks/TrackProperty, java/lang/Boolean);
    public static final Property SYNCABLE = Property.of(com/soundcloud/android/tracks/TrackProperty, java/lang/Boolean);
    public static final Property WAVEFORM_URL = Property.of(com/soundcloud/android/tracks/TrackProperty, java/lang/String);

    public TrackProperty()
    {
    }

}
