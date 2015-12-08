// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.posts;

import android.content.ContentValues;
import com.soundcloud.android.api.model.ApiPlaylist;
import com.soundcloud.android.commands.StorePlaylistsCommand;
import com.soundcloud.android.commands.StoreUsersCommand;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.ChangeResult;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Where;
import com.soundcloud.propeller.schema.Column;

// Referenced classes of package com.soundcloud.android.sync.posts:
//            ReplacePlaylistPostCommand

class val.localPlaylistUrn extends com.soundcloud.propeller.
{

    final ReplacePlaylistPostCommand this$0;
    final Urn val$localPlaylistUrn;
    final ApiPlaylist val$newPlaylist;

    public void steps(PropellerDatabase propellerdatabase)
    {
        step(propellerdatabase.upsert(Table.Users, StoreUsersCommand.buildUserContentValues(val$newPlaylist.getUser())));
        step(propellerdatabase.insert(Table.Sounds, StorePlaylistsCommand.buildPlaylistContentValues(val$newPlaylist)));
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("playlist_id", Long.valueOf(val$newPlaylist.getId()));
        step(propellerdatabase.update(Table.PlaylistTracks, contentvalues, Filter.filter().whereEq("playlist_id", Long.valueOf(val$localPlaylistUrn.getNumericId()))));
        step(propellerdatabase.delete(Table.Sounds, Filter.filter().whereEq("_id", Long.valueOf(val$localPlaylistUrn.getNumericId())).whereEq("_type", Integer.valueOf(1))));
        contentvalues = new ContentValues();
        contentvalues.put("target_id", Long.valueOf(val$newPlaylist.getId()));
        step(propellerdatabase.update(Table.Posts, contentvalues, Filter.filter().whereEq("target_id", Long.valueOf(val$localPlaylistUrn.getNumericId())).whereEq("target_type", Integer.valueOf(1))));
        contentvalues = new ContentValues();
        contentvalues.put(com.soundcloud.android.storage.._cls1.val.localPlaylistUrn.name(), Long.valueOf(val$newPlaylist.getUrn().getNumericId()));
        contentvalues.put(com.soundcloud.android.storage.._cls1.val.newPlaylist.name(), Integer.valueOf(1));
        if (((ChangeResult)step(propellerdatabase.delete(com.soundcloud.android.storage.._cls1.step, Filter.filter().whereEq(com.soundcloud.android.storage.._cls1.step, Long.valueOf(val$localPlaylistUrn.getNumericId())).whereEq(com.soundcloud.android.storage.._cls1.val.localPlaylistUrn, Integer.valueOf(1))))).getNumRowsAffected() > 0)
        {
            step(propellerdatabase.insert(com.soundcloud.android.storage.._cls1.step, contentvalues));
        }
    }

    ()
    {
        this$0 = final_replaceplaylistpostcommand;
        val$newPlaylist = apiplaylist;
        val$localPlaylistUrn = Urn.this;
        super();
    }
}
