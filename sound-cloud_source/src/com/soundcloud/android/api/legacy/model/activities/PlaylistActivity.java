// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model.activities;

import android.database.Cursor;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.legacy.model.Playable;
import com.soundcloud.android.api.legacy.model.PublicApiPlaylist;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.api.legacy.model.ScModelManager;
import com.soundcloud.android.api.legacy.model.behavior.PlayableHolder;
import com.soundcloud.android.api.legacy.model.behavior.Refreshable;

// Referenced classes of package com.soundcloud.android.api.legacy.model.activities:
//            Activity

public abstract class PlaylistActivity extends Activity
    implements PlayableHolder
{

    public PublicApiPlaylist playlist;

    public PlaylistActivity()
    {
    }

    public PlaylistActivity(Cursor cursor)
    {
        super(cursor);
        playlist = SoundCloudApplication.sModelManager.getCachedPlaylistFromCursor(cursor, "sound_id");
    }

    public void cacheDependencies()
    {
        playlist = SoundCloudApplication.sModelManager.cache(playlist);
    }

    public Playable getPlayable()
    {
        return playlist;
    }

    public Refreshable getRefreshableResource()
    {
        return playlist;
    }

    public PublicApiUser getUser()
    {
        if (playlist == null)
        {
            return null;
        } else
        {
            return playlist.user;
        }
    }

    public boolean isIncomplete()
    {
        return playlist == null || playlist.isIncomplete();
    }
}
