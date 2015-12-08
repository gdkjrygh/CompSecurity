// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.posts;

import com.soundcloud.android.api.model.Sharing;
import com.soundcloud.android.commands.LegacyCommand;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.PlaylistProperty;
import com.soundcloud.android.storage.Table;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.ResultMapper;
import com.soundcloud.propeller.query.Query;
import java.util.List;

class LoadLocalPlaylistsCommand extends LegacyCommand
{
    private static final class LocalPlaylistsMapper
        implements ResultMapper
    {

        public final PropertySet map(CursorReader cursorreader)
        {
            return PropertySet.from(new PropertyBinding[] {
                PlaylistProperty.URN.bind(Urn.forPlaylist(cursorreader.getLong("_id"))), PlaylistProperty.TITLE.bind(cursorreader.getString("title")), PlaylistProperty.IS_PRIVATE.bind(Boolean.valueOf(Sharing.PRIVATE.value().equals(cursorreader.getString("sharing"))))
            });
        }

        public final volatile Object map(CursorReader cursorreader)
        {
            return map(cursorreader);
        }

        private LocalPlaylistsMapper()
        {
        }

        LocalPlaylistsMapper(_cls1 _pcls1)
        {
            this();
        }
    }


    private final PropellerDatabase database;

    LoadLocalPlaylistsCommand(PropellerDatabase propellerdatabase)
    {
        database = propellerdatabase;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public List call()
        throws Exception
    {
        return database.query((Query)((Query)Query.from(new String[] {
            Table.Sounds.name()
        }).select(new Object[] {
            "_id", "title", "sharing"
        }).whereEq("_type", Integer.valueOf(1))).whereLt("_id", Integer.valueOf(0))).toList(new LocalPlaylistsMapper(null));
    }
}
