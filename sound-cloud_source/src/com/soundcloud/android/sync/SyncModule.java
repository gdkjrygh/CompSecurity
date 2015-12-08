// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.content.SharedPreferences;
import com.soundcloud.android.sync.timeline.TimelineSyncStorage;

public class SyncModule
{

    public static final String ACTIVITIES_SYNC_STORAGE = "ActivitiesSyncStorage";
    public static final String SOUND_STREAM_SYNC_STORAGE = "SoundStreamSyncStorage";

    public SyncModule()
    {
    }

    TimelineSyncStorage activitiesSyncStorage(SharedPreferences sharedpreferences)
    {
        return new TimelineSyncStorage(sharedpreferences);
    }

    TimelineSyncStorage soundStreamSyncStorage(SharedPreferences sharedpreferences)
    {
        return new TimelineSyncStorage(sharedpreferences);
    }
}
