// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.activities;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.legacy.model.LocalCollection;
import com.soundcloud.android.api.legacy.model.Playable;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.api.legacy.model.activities.Activity;
import com.soundcloud.android.collections.ScBaseAdapter;
import com.soundcloud.android.collections.tasks.CollectionParams;
import com.soundcloud.android.comments.TrackCommentsActivity;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.android.storage.LegacyActivitiesStorage;
import com.soundcloud.android.storage.provider.Content;
import dagger.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.activities:
//            ActivityItem, ActivityItemRenderer

public class LegacyActivitiesAdapter extends ScBaseAdapter
{

    private final LegacyActivitiesStorage activitiesStorage;
    private final Content content;
    private final Uri contentUri;
    ImageOperations imageOperations;
    ActivityItemRenderer itemRenderer;
    Navigator navigator;
    PlaybackInitiator playbackInitiator;
    Provider subscriberProvider;

    public LegacyActivitiesAdapter()
    {
        content = Content.ME_ACTIVITIES;
        contentUri = content.uri;
        activitiesStorage = new LegacyActivitiesStorage();
        SoundCloudApplication.getObjectGraph().a(this);
    }

    LegacyActivitiesAdapter(ImageOperations imageoperations, PlaybackInitiator playbackinitiator, ActivityItemRenderer activityitemrenderer)
    {
        content = Content.ME_ACTIVITIES;
        contentUri = content.uri;
        activitiesStorage = new LegacyActivitiesStorage();
        imageOperations = imageoperations;
        playbackInitiator = playbackinitiator;
        itemRenderer = activityitemrenderer;
    }

    private List toActivityItems(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(new ActivityItem(((Activity)list.next()).toPropertySet()))) { }
        return arraylist;
    }

    public void addItems(List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Activity activity = (Activity)list.next();
            if (!data.contains(activity))
            {
                data.add(activity);
            }
        } while (true);
        Collections.sort(data);
    }

    protected void bindRow(int i, View view)
    {
        itemRenderer.bindItemView(i, view, toActivityItems(getItems()));
    }

    protected View createRow(Context context, int i, ViewGroup viewgroup)
    {
        return itemRenderer.createItemView(viewgroup);
    }

    public int getItemViewType(int i)
    {
        int j = super.getItemViewType(i);
        if (j == -1)
        {
            return j;
        } else
        {
            return ((Activity)getItem(i)).getType().ordinal();
        }
    }

    public CollectionParams getParams(boolean flag)
    {
        CollectionParams collectionparams = new CollectionParams();
        collectionparams.loadModel = content.modelType;
        collectionparams.isRefresh = flag;
        collectionparams.maxToLoad = 30;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = page * 30;
        }
        collectionparams.startIndex = i;
        collectionparams.contentUri = contentUri;
        if (data.size() > 0)
        {
            Activity activity = (Activity)getItem(0);
            Activity activity1 = (Activity)getItem(getItemCount() - 1);
            long l;
            if (flag)
            {
                l = activity.getCreatedAt().getTime();
            } else
            {
                l = activity1.getCreatedAt().getTime();
            }
            collectionparams.timestamp = l;
        }
        return collectionparams;
    }

    public int getViewTypeCount()
    {
        return super.getViewTypeCount() + com.soundcloud.android.api.legacy.model.activities.Activity.Type.values().length;
    }

    public void handleListItemClick(Context context, int i, long l)
    {
        com.soundcloud.android.api.legacy.model.activities.Activity.Type type = com.soundcloud.android.api.legacy.model.activities.Activity.Type.values()[getItemViewType(i)];
        switch (_cls1..SwitchMap.com.soundcloud.android.api.legacy.model.activities.Activity.Type[type.ordinal()])
        {
        default:
            context = SoundCloudApplication.TAG;
            return;

        case 1: // '\001'
        case 2: // '\002'
            context.startActivity((new Intent(context, com/soundcloud/android/comments/TrackCommentsActivity)).putExtra("extra", ((Activity)getItem(i)).getPlayable().toPropertySet()));
            return;

        case 3: // '\003'
        case 4: // '\004'
            navigator.openProfile(context, ((Activity)getItem(i)).getUser().getUrn());
            return;

        case 5: // '\005'
        case 6: // '\006'
            navigator.openProfile(context, ((Activity)getItem(i)).getUser().getUrn());
            return;

        case 7: // '\007'
            navigator.openProfile(context, ((Activity)getItem(i)).getUser().getUrn());
            break;
        }
    }

    public boolean isExpired(LocalCollection localcollection)
    {
        if (localcollection == null)
        {
            return false;
        }
        if (data.size() == 0)
        {
            return true;
        }
        localcollection = activitiesStorage.getLatestActivity(content);
        return localcollection == null || localcollection.getCreatedAt().getTime() > ((Activity)data.get(0)).getCreatedAt().getTime();
    }

    protected void onSuccessfulRefresh()
    {
    }

    private class _cls1
    {

        static final int $SwitchMap$com$soundcloud$android$api$legacy$model$activities$Activity$Type[];

        static 
        {
            $SwitchMap$com$soundcloud$android$api$legacy$model$activities$Activity$Type = new int[com.soundcloud.android.api.legacy.model.activities.Activity.Type.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$api$legacy$model$activities$Activity$Type[com.soundcloud.android.api.legacy.model.activities.Activity.Type.COMMENT.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$soundcloud$android$api$legacy$model$activities$Activity$Type[com.soundcloud.android.api.legacy.model.activities.Activity.Type.USER_MENTION.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$soundcloud$android$api$legacy$model$activities$Activity$Type[com.soundcloud.android.api.legacy.model.activities.Activity.Type.TRACK_LIKE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$soundcloud$android$api$legacy$model$activities$Activity$Type[com.soundcloud.android.api.legacy.model.activities.Activity.Type.TRACK_REPOST.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$soundcloud$android$api$legacy$model$activities$Activity$Type[com.soundcloud.android.api.legacy.model.activities.Activity.Type.PLAYLIST_LIKE.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$soundcloud$android$api$legacy$model$activities$Activity$Type[com.soundcloud.android.api.legacy.model.activities.Activity.Type.PLAYLIST_REPOST.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$api$legacy$model$activities$Activity$Type[com.soundcloud.android.api.legacy.model.activities.Activity.Type.AFFILIATION.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
