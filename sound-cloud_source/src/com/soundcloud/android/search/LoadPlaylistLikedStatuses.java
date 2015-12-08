// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.commands.Command;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.PlaylistProperty;
import com.soundcloud.android.storage.Table;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.query.ColumnFunctions;
import com.soundcloud.propeller.query.Exists;
import com.soundcloud.propeller.query.Query;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LoadPlaylistLikedStatuses extends Command
{

    private static final String COLUMN_IS_LIKED = "is_liked";
    private final PropellerDatabase propeller;

    public LoadPlaylistLikedStatuses(PropellerDatabase propellerdatabase)
    {
        propeller = propellerdatabase;
    }

    private Query forLikes(Iterable iterable)
    {
        Query query = (Query)((Query)Query.from(new String[] {
            Table.Likes.name()
        }).joinOn((new StringBuilder()).append(Table.SoundView).append("._id").toString(), (new StringBuilder()).append(Table.Likes.name()).append("._id").toString()).whereEq((new StringBuilder()).append(Table.Likes).append("._type").toString(), Integer.valueOf(1))).whereNull("removed_at");
        return (Query)((Query)Query.from(new String[] {
            Table.SoundView.name()
        }).select(new Object[] {
            "_id", ColumnFunctions.exists(query).as("is_liked")
        }).whereIn("_id", getPlaylistIds(iterable))).whereEq("_type", Integer.valueOf(1));
    }

    private List getPlaylistIds(Iterable iterable)
    {
        ArrayList arraylist = new ArrayList();
        iterable = iterable.iterator();
        do
        {
            if (!iterable.hasNext())
            {
                break;
            }
            Urn urn = (Urn)((PropertySet)iterable.next()).getOrElse(PlayableProperty.URN, Urn.NOT_SET);
            if (urn.isPlaylist())
            {
                arraylist.add(Long.valueOf(urn.getNumericId()));
            }
        } while (true);
        return arraylist;
    }

    public volatile Object call(Object obj)
    {
        return call((Iterable)obj);
    }

    public Map call(Iterable iterable)
    {
        return toLikedSet(propeller.query(forLikes(iterable)));
    }

    public Map toLikedSet(QueryResult queryresult)
    {
        HashMap hashmap = new HashMap();
        CursorReader cursorreader;
        for (queryresult = queryresult.iterator(); queryresult.hasNext(); hashmap.put(Urn.forPlaylist(cursorreader.getLong("_id")), PropertySet.from(new PropertyBinding[] {
    PlaylistProperty.IS_LIKED.bind(Boolean.valueOf(cursorreader.getBoolean("is_liked")))
})))
        {
            cursorreader = (CursorReader)queryresult.next();
        }

        return hashmap;
    }
}
