// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.posts;

import com.soundcloud.android.commands.LegacyCommand;
import com.soundcloud.android.model.PostProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.rx.RxResultMapper;
import java.util.Date;
import java.util.List;

public class LoadLocalPostsCommand extends LegacyCommand
{
    private static class PlaylistMapper extends RxResultMapper
    {

        private final boolean isPlaylist;

        private Urn getUrn(long l)
        {
            if (isPlaylist)
            {
                return Urn.forPlaylist(l);
            } else
            {
                return Urn.forTrack(l);
            }
        }

        public PropertySet map(CursorReader cursorreader)
        {
            return PropertySet.from(new PropertyBinding[] {
                PostProperty.TARGET_URN.bind(getUrn(cursorreader.getLong("target_id"))), PostProperty.CREATED_AT.bind(new Date(cursorreader.getLong("created_at"))), PostProperty.IS_REPOST.bind(Boolean.valueOf("repost".equals(cursorreader.getString("type"))))
            });
        }

        public volatile Object map(CursorReader cursorreader)
        {
            return map(cursorreader);
        }

        private PlaylistMapper(boolean flag)
        {
            isPlaylist = flag;
        }

        PlaylistMapper(boolean flag, _cls1 _pcls1)
        {
            this(flag);
        }
    }


    private final PropellerDatabase database;
    private final int resourceType;

    LoadLocalPostsCommand(PropellerDatabase propellerdatabase, int i)
    {
        database = propellerdatabase;
        resourceType = i;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public List call()
        throws Exception
    {
        QueryResult queryresult = database.query(((Query)Query.from(new String[] {
            Table.Posts.name()
        }).select(new Object[] {
            "target_id", "created_at", "type"
        }).whereEq("target_type", Integer.valueOf(resourceType))).order("created_at", com.soundcloud.propeller.query.Query.Order.DESC));
        boolean flag;
        if (resourceType == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return queryresult.toList(new PlaylistMapper(flag, null));
    }
}
