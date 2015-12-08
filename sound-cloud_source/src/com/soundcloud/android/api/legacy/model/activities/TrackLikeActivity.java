// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model.activities;

import android.database.Cursor;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.activities.ActivityKind;
import com.soundcloud.android.activities.ActivityProperty;
import com.soundcloud.android.api.legacy.model.PublicApiTrack;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.api.legacy.model.ScModelManager;
import com.soundcloud.android.api.legacy.model.behavior.PlayableHolder;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.api.legacy.model.activities:
//            TrackActivity

public class TrackLikeActivity extends TrackActivity
    implements PlayableHolder
{

    public PublicApiUser user;

    public TrackLikeActivity()
    {
    }

    public TrackLikeActivity(Cursor cursor)
    {
        super(cursor);
        user = SoundCloudApplication.sModelManager.getCachedUserFromActivityCursor(cursor);
    }

    public void cacheDependencies()
    {
        super.cacheDependencies();
        user = SoundCloudApplication.sModelManager.cache(user, com.soundcloud.android.api.legacy.model.PublicApiResource.CacheUpdateMode.MINI);
    }

    public Activity.Type getType()
    {
        return Activity.Type.TRACK_LIKE;
    }

    public PublicApiUser getUser()
    {
        return user;
    }

    public PropertySet toPropertySet()
    {
        return super.toPropertySet().put(ActivityProperty.KIND, ActivityKind.TRACK_LIKE).put(ActivityProperty.PLAYABLE_TITLE, track.getTitle());
    }
}
