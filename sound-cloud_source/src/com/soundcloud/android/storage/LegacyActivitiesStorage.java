// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import android.content.Context;
import android.net.Uri;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.legacy.model.LocalCollection;
import com.soundcloud.android.api.legacy.model.activities.Activities;
import com.soundcloud.android.api.legacy.model.activities.Activity;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.sync.SyncStateManager;
import java.util.List;

// Referenced classes of package com.soundcloud.android.storage:
//            ActivityDAO

public class LegacyActivitiesStorage
{

    private ActivityDAO activitiesDAO;
    private SyncStateManager syncStateManager;

    public LegacyActivitiesStorage()
    {
        this(((Context) (SoundCloudApplication.instance)));
    }

    public LegacyActivitiesStorage(Context context)
    {
        this(new SyncStateManager(context), new ActivityDAO(context.getContentResolver()));
    }

    public LegacyActivitiesStorage(SyncStateManager syncstatemanager, ActivityDAO activitydao)
    {
        syncStateManager = syncstatemanager;
        activitiesDAO = activitydao;
    }

    private Activities getCollectionSince(Uri uri, long l, int i)
    {
        Activities activities = new Activities();
        activities.future_href = syncStateManager.fromContent(uri).extra;
        uri = activitiesDAO.buildQuery(uri);
        if (l > 0L)
        {
            uri.where("created_at> ?", new String[] {
                String.valueOf(l)
            });
        }
        if (i > 0)
        {
            uri.limit(i);
        }
        uri = uri.queryAll();
        if (uri.isEmpty())
        {
            return Activities.EMPTY;
        } else
        {
            activities.collection = uri;
            return activities;
        }
    }

    public Activities getCollectionBefore(Uri uri, long l)
    {
        Object obj = activitiesDAO.buildQuery(uri);
        if (l > 0L)
        {
            ((BaseDAO.QueryBuilder) (obj)).where("created_at< ?", new String[] {
                String.valueOf(l)
            });
        }
        uri = new Activities();
        obj = ((BaseDAO.QueryBuilder) (obj)).queryAll();
        if (((List) (obj)).isEmpty())
        {
            return Activities.EMPTY;
        } else
        {
            uri.collection = ((List) (obj));
            return uri;
        }
    }

    public Activities getCollectionSince(Uri uri, long l)
    {
        return getCollectionSince(uri, l, 0);
    }

    public Activity getLatestActivity(Content content)
    {
        return (Activity)activitiesDAO.buildQuery(content.uri).where("content_id = ?", new String[] {
            String.valueOf(content.id)
        }).order("created_at DESC").first();
    }

    public Activity getOldestActivity(Content content)
    {
        return (Activity)activitiesDAO.buildQuery(content.uri).where("content_id = ?", new String[] {
            String.valueOf(content.id)
        }).order("created_at ASC").first();
    }

    public int insert(Content content, Activities activities)
    {
        return activitiesDAO.insert(content, activities);
    }
}
