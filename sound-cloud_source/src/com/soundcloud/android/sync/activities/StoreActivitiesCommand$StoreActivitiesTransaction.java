// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.activities;

import com.soundcloud.android.activities.ActivityKind;
import com.soundcloud.android.commands.StorePlaylistsCommand;
import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.commands.StoreUsersCommand;
import com.soundcloud.android.comments.CommentRecord;
import com.soundcloud.android.comments.StoreCommentCommand;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.java.optional.Optional;
import com.soundcloud.propeller.ContentValuesBuilder;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.WriteResult;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.sync.activities:
//            StoreActivitiesCommand, ApiActivityItem, ApiTrackCommentActivity, ApiActivity, 
//            ApiEngagementActivity

protected class activities extends com.soundcloud.propeller.esTransaction
{

    private final Iterable activities;
    final StoreActivitiesCommand this$0;

    private void handleCommentActivity(PropellerDatabase propellerdatabase, ApiActivityItem apiactivityitem)
    {
        apiactivityitem = apiactivityitem.getTrackComment();
        if (apiactivityitem.isPresent())
        {
            apiactivityitem = (ApiTrackCommentActivity)apiactivityitem.get();
            Object obj = apiactivityitem.getComment();
            step((WriteResult)StoreActivitiesCommand.access$000(StoreActivitiesCommand.this).call(obj));
            obj = ((CommentRecord) (obj)).getTrackUrn();
            insert(propellerdatabase, valuesFor(apiactivityitem, ActivityKind.TRACK_COMMENT, ((Urn) (obj))).put("comment_id", StoreActivitiesCommand.access$000(StoreActivitiesCommand.this).lastRowId()));
        }
    }

    private void handleFollowActivity(PropellerDatabase propellerdatabase, ApiActivityItem apiactivityitem)
    {
        apiactivityitem = apiactivityitem.getFollow();
        if (apiactivityitem.isPresent())
        {
            insert(propellerdatabase, valuesFor((ApiActivity)apiactivityitem.get(), ActivityKind.USER_FOLLOW));
        }
    }

    private void handleLikeActivity(PropellerDatabase propellerdatabase, ApiActivityItem apiactivityitem)
    {
        apiactivityitem = apiactivityitem.getLike();
        if (apiactivityitem.isPresent())
        {
            ApiEngagementActivity apiengagementactivity = (ApiEngagementActivity)apiactivityitem.get();
            Urn urn = apiengagementactivity.getTargetUrn();
            if (urn.isTrack())
            {
                apiactivityitem = ActivityKind.TRACK_LIKE;
            } else
            {
                apiactivityitem = ActivityKind.PLAYLIST_LIKE;
            }
            insert(propellerdatabase, valuesFor(apiengagementactivity, apiactivityitem, urn));
        }
    }

    private void handleRepostActivity(PropellerDatabase propellerdatabase, ApiActivityItem apiactivityitem)
    {
        apiactivityitem = apiactivityitem.getRepost();
        if (apiactivityitem.isPresent())
        {
            ApiEngagementActivity apiengagementactivity = (ApiEngagementActivity)apiactivityitem.get();
            Urn urn = apiengagementactivity.getTargetUrn();
            if (urn.isTrack())
            {
                apiactivityitem = ActivityKind.TRACK_REPOST;
            } else
            {
                apiactivityitem = ActivityKind.PLAYLIST_REPOST;
            }
            insert(propellerdatabase, valuesFor(apiengagementactivity, apiactivityitem, urn));
        }
    }

    private void insert(PropellerDatabase propellerdatabase, ContentValuesBuilder contentvaluesbuilder)
    {
        step(propellerdatabase.insert(Table.Activities, contentvaluesbuilder.get()));
    }

    private void storeDependencies(PropellerDatabase propellerdatabase)
    {
        HashSet hashset = new HashSet();
        HashSet hashset1 = new HashSet();
        HashSet hashset2 = new HashSet();
        ApiActivityItem apiactivityitem;
        for (Iterator iterator = activities.iterator(); iterator.hasNext(); hashset2.addAll(apiactivityitem.getPlaylist().asSet()))
        {
            apiactivityitem = (ApiActivityItem)iterator.next();
            hashset.addAll(apiactivityitem.getUser().asSet());
            hashset1.addAll(apiactivityitem.getTrack().asSet());
        }

        if (!hashset.isEmpty())
        {
            step((WriteResult)(new StoreUsersCommand(propellerdatabase)).call(hashset));
        }
        if (!hashset1.isEmpty())
        {
            step((WriteResult)(new StoreTracksCommand(propellerdatabase)).call(hashset1));
        }
        if (!hashset2.isEmpty())
        {
            step((WriteResult)(new StorePlaylistsCommand(propellerdatabase)).call(hashset2));
        }
    }

    private ContentValuesBuilder valuesFor(ApiActivity apiactivity, ActivityKind activitykind)
    {
        ContentValuesBuilder contentvaluesbuilder = ContentValuesBuilder.values();
        contentvaluesbuilder.put("type", activitykind.identifier());
        contentvaluesbuilder.put("user_id", apiactivity.getUserUrn().getNumericId());
        contentvaluesbuilder.put("created_at", apiactivity.getCreatedAt().getTime());
        return contentvaluesbuilder;
    }

    private ContentValuesBuilder valuesFor(ApiActivity apiactivity, ActivityKind activitykind, Urn urn)
    {
        apiactivity = valuesFor(apiactivity, activitykind).put("sound_id", urn.getNumericId());
        int i;
        if (urn.isTrack())
        {
            i = 0;
        } else
        {
            i = 1;
        }
        return apiactivity.put("sound_type", i);
    }

    public void steps(PropellerDatabase propellerdatabase)
    {
        storeDependencies(propellerdatabase);
        ApiActivityItem apiactivityitem;
        for (Iterator iterator = activities.iterator(); iterator.hasNext(); handleFollowActivity(propellerdatabase, apiactivityitem))
        {
            apiactivityitem = (ApiActivityItem)iterator.next();
            handleLikeActivity(propellerdatabase, apiactivityitem);
            handleRepostActivity(propellerdatabase, apiactivityitem);
            handleCommentActivity(propellerdatabase, apiactivityitem);
        }

    }

    protected (Iterable iterable)
    {
        this$0 = StoreActivitiesCommand.this;
        super();
        activities = iterable;
    }
}
