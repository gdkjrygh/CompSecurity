// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.commands;

import android.content.ContentValues;
import android.text.TextUtils;
import com.soundcloud.android.api.model.Sharing;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.PlaylistRecord;
import com.soundcloud.android.users.UserRecord;
import com.soundcloud.propeller.ContentValuesBuilder;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.WriteResult;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.commands:
//            DefaultWriteStorageCommand

public class StorePlaylistsCommand extends DefaultWriteStorageCommand
{

    public StorePlaylistsCommand(PropellerDatabase propellerdatabase)
    {
        super(propellerdatabase);
    }

    public static ContentValues buildPlaylistContentValues(PlaylistRecord playlistrecord)
    {
        return ContentValuesBuilder.values().put("_id", playlistrecord.getUrn().getNumericId()).put("_type", 1).put("title", playlistrecord.getTitle()).put("duration", playlistrecord.getDuration()).put("created_at", playlistrecord.getCreatedAt().getTime()).put("sharing", playlistrecord.getSharing().value()).put("favoritings_count", playlistrecord.getLikesCount()).put("reposts_count", playlistrecord.getRepostsCount()).put("track_count", playlistrecord.getTrackCount()).put("user_id", playlistrecord.getUser().getUrn().getNumericId()).put("tag_list", TextUtils.join(" ", playlistrecord.getTags())).put("permalink_url", playlistrecord.getPermalinkUrl()).get();
    }

    protected WriteResult write(PropellerDatabase propellerdatabase, final Iterable input)
    {
        return propellerdatabase.runTransaction(new _cls1());
    }

    protected volatile WriteResult write(PropellerDatabase propellerdatabase, Object obj)
    {
        return write(propellerdatabase, (Iterable)obj);
    }

    private class _cls1 extends com.soundcloud.propeller.PropellerDatabase.Transaction
    {

        final StorePlaylistsCommand this$0;
        final Iterable val$input;

        public void steps(PropellerDatabase propellerdatabase)
        {
            PlaylistRecord playlistrecord;
            for (Iterator iterator = input.iterator(); iterator.hasNext(); step(propellerdatabase.upsert(Table.Sounds, StorePlaylistsCommand.buildPlaylistContentValues(playlistrecord))))
            {
                playlistrecord = (PlaylistRecord)iterator.next();
                step(propellerdatabase.upsert(Table.Users, StoreUsersCommand.buildUserContentValues(playlistrecord.getUser())));
            }

        }

        _cls1()
        {
            this$0 = StorePlaylistsCommand.this;
            input = iterable;
            super();
        }
    }

}
