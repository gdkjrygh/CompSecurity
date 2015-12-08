// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model.activities;

import android.content.ContentValues;
import android.database.Cursor;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.activities.ActivityKind;
import com.soundcloud.android.activities.ActivityProperty;
import com.soundcloud.android.api.legacy.model.Playable;
import com.soundcloud.android.api.legacy.model.PublicApiComment;
import com.soundcloud.android.api.legacy.model.PublicApiTrack;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.api.legacy.model.ScModelManager;
import com.soundcloud.android.api.legacy.model.behavior.Refreshable;
import com.soundcloud.java.collections.PropertySet;
import java.util.List;

// Referenced classes of package com.soundcloud.android.api.legacy.model.activities:
//            Activity

public class CommentActivity extends Activity
{

    public PublicApiComment comment;

    public CommentActivity()
    {
    }

    public CommentActivity(Cursor cursor)
    {
        super(cursor);
        comment = new PublicApiComment(cursor, true);
        comment.track = SoundCloudApplication.sModelManager.getTrack(comment.track_id);
        comment.user = SoundCloudApplication.sModelManager.getUser(comment.user_id);
    }

    public ContentValues buildContentValues()
    {
        ContentValues contentvalues = super.buildContentValues();
        contentvalues.put("comment_id", Long.valueOf(comment.getId()));
        return contentvalues;
    }

    public void cacheDependencies()
    {
        comment.user = SoundCloudApplication.sModelManager.cache(comment.user, com.soundcloud.android.api.legacy.model.PublicApiResource.CacheUpdateMode.MINI);
        comment.track = SoundCloudApplication.sModelManager.cache(comment.track, com.soundcloud.android.api.legacy.model.PublicApiResource.CacheUpdateMode.MINI);
    }

    public List getDependentModels()
    {
        List list = super.getDependentModels();
        list.add(comment);
        return list;
    }

    public Playable getPlayable()
    {
        return comment.track;
    }

    public Refreshable getRefreshableResource()
    {
        return comment.user;
    }

    public Activity.Type getType()
    {
        return Activity.Type.COMMENT;
    }

    public PublicApiUser getUser()
    {
        return comment.user;
    }

    public boolean isIncomplete()
    {
        return false;
    }

    public PropertySet toPropertySet()
    {
        return super.toPropertySet().put(ActivityProperty.KIND, ActivityKind.TRACK_COMMENT).put(ActivityProperty.PLAYABLE_TITLE, comment.track.getTitle());
    }
}
