// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model.activities;

import android.database.Cursor;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.legacy.model.Playable;
import com.soundcloud.android.api.legacy.model.PublicApiTrack;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.api.legacy.model.ScModelManager;
import com.soundcloud.android.api.legacy.model.behavior.PlayableHolder;
import com.soundcloud.android.api.legacy.model.behavior.Refreshable;

// Referenced classes of package com.soundcloud.android.api.legacy.model.activities:
//            Activity

public abstract class TrackActivity extends Activity
    implements PlayableHolder
{

    public PublicApiTrack track;

    public TrackActivity()
    {
    }

    public TrackActivity(Cursor cursor)
    {
        super(cursor);
        track = SoundCloudApplication.sModelManager.getCachedTrackFromCursor(cursor, "sound_id");
    }

    public void cacheDependencies()
    {
        track = SoundCloudApplication.sModelManager.cache(track);
    }

    public Playable getPlayable()
    {
        return track;
    }

    public Refreshable getRefreshableResource()
    {
        return track;
    }

    public PublicApiUser getUser()
    {
        return track.user;
    }

    public boolean isIncomplete()
    {
        return track == null || track.isIncomplete();
    }
}
