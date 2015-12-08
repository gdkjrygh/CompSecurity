// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.playlists;

import com.soundcloud.android.api.ApiRequestException;
import com.soundcloud.android.api.model.ApiPlaylist;
import com.soundcloud.android.api.model.ApiTrack;
import com.soundcloud.android.api.model.ModelCollection;
import com.soundcloud.android.commands.StoreCommand;
import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.playlists.PlaylistTrackProperty;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.PropellerWriteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;

// Referenced classes of package com.soundcloud.android.sync.playlists:
//            LoadPlaylistTracksWithChangesCommand, ApiPlaylistWithTracks, RemovePlaylistCommand, PushPlaylistAdditionsCommand, 
//            PushPlaylistRemovalsCommand, StorePlaylistCommand, FetchPlaylistWithTracksCommand, ReplacePlaylistTracksCommand

class SinglePlaylistSyncer
    implements Callable
{

    private final FetchPlaylistWithTracksCommand fetchPlaylistWithTracks;
    private final LoadPlaylistTracksWithChangesCommand loadPlaylistTracks;
    private final PushPlaylistAdditionsCommand pushPlaylistAdditions;
    private final PushPlaylistRemovalsCommand pushPlaylistRemovals;
    private final RemovePlaylistCommand removePlaylist;
    private final ReplacePlaylistTracksCommand replacePlaylistTracks;
    private final StorePlaylistCommand storePlaylist;
    private final StoreTracksCommand storeTracks;

    SinglePlaylistSyncer(FetchPlaylistWithTracksCommand fetchplaylistwithtrackscommand, RemovePlaylistCommand removeplaylistcommand, LoadPlaylistTracksWithChangesCommand loadplaylisttrackswithchangescommand, PushPlaylistAdditionsCommand pushplaylistadditionscommand, PushPlaylistRemovalsCommand pushplaylistremovalscommand, StoreTracksCommand storetrackscommand, StorePlaylistCommand storeplaylistcommand, 
            ReplacePlaylistTracksCommand replaceplaylisttrackscommand)
    {
        loadPlaylistTracks = loadplaylisttrackswithchangescommand;
        pushPlaylistAdditions = pushplaylistadditionscommand;
        pushPlaylistRemovals = pushplaylistremovalscommand;
        fetchPlaylistWithTracks = fetchplaylistwithtrackscommand;
        storeTracks = storetrackscommand;
        storePlaylist = storeplaylistcommand;
        removePlaylist = removeplaylistcommand;
        replacePlaylistTracks = replaceplaylisttrackscommand;
    }

    private void compileLocalPlaylistState(Set set, Set set1, Set set2)
        throws Exception
    {
        for (Iterator iterator = loadPlaylistTracks.call().iterator(); iterator.hasNext();)
        {
            PropertySet propertyset = (PropertySet)iterator.next();
            if (propertyset.contains(PlaylistTrackProperty.REMOVED_AT))
            {
                set2.add(propertyset.get(PlaylistTrackProperty.TRACK_URN));
            } else
            if (propertyset.contains(PlaylistTrackProperty.ADDED_AT))
            {
                set1.add(propertyset.get(PlaylistTrackProperty.TRACK_URN));
            } else
            {
                set.add(propertyset.get(PlaylistTrackProperty.TRACK_URN));
            }
        }

    }

    private Set createRemoteTracklist(ApiPlaylistWithTracks apiplaylistwithtracks)
    {
        TreeSet treeset = new TreeSet();
        for (apiplaylistwithtracks = apiplaylistwithtracks.getPlaylistTracks().getCollection().iterator(); apiplaylistwithtracks.hasNext(); treeset.add(((ApiTrack)apiplaylistwithtracks.next()).getUrn())) { }
        return treeset;
    }

    private transient Set getSetDifference(Set set, Set aset[])
    {
        TreeSet treeset = new TreeSet();
        treeset.addAll(set);
        int j = aset.length;
        for (int i = 0; i < j; i++)
        {
            treeset.removeAll(aset[i]);
        }

        return treeset;
    }

    private Set getSetIntersection(Set set, Set set1)
    {
        TreeSet treeset = new TreeSet();
        treeset.addAll(set);
        treeset.retainAll(set1);
        return treeset;
    }

    private void handleRemotePlaylistException(ApiRequestException apirequestexception)
        throws Exception
    {
        switch (_cls1..SwitchMap.com.soundcloud.android.api.ApiRequestException.Reason[apirequestexception.reason().ordinal()])
        {
        default:
            throw apirequestexception;

        case 1: // '\001'
        case 2: // '\002'
            removePlaylist.call();
            break;
        }
    }

    private List performAdditions(List list, Set set)
        throws Exception
    {
        set = ((PushPlaylistAdditionsCommand)pushPlaylistAdditions.with(set)).call();
        ArrayList arraylist = new ArrayList(list.size() + set.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(((ApiTrack)list.next()).getUrn())) { }
        arraylist.addAll(set);
        return arraylist;
    }

    private List performRemovals(ApiPlaylistWithTracks apiplaylistwithtracks, Set set)
        throws Exception
    {
        ((PushPlaylistRemovalsCommand)pushPlaylistRemovals.with(set)).call();
        ArrayList arraylist = new ArrayList();
        apiplaylistwithtracks = apiplaylistwithtracks.getPlaylistTracks().getCollection().iterator();
        do
        {
            if (!apiplaylistwithtracks.hasNext())
            {
                break;
            }
            ApiTrack apitrack = (ApiTrack)apiplaylistwithtracks.next();
            if (!set.contains(apitrack.getUrn()))
            {
                arraylist.add(apitrack);
            }
        } while (true);
        return arraylist;
    }

    private void updateLocalPlaylist(ApiPlaylist apiplaylist, Set set, Set set1)
        throws PropellerWriteException
    {
        apiplaylist.setTrackCount((apiplaylist.getTrackCount() + set1.size()) - set.size());
        ((StoreCommand)storePlaylist.with(apiplaylist)).call();
    }

    public Boolean call()
        throws Exception
    {
        ApiPlaylistWithTracks apiplaylistwithtracks;
        Set set;
        Object obj;
        Object obj1;
        Object obj2;
        try
        {
            apiplaylistwithtracks = fetchPlaylistWithTracks.call();
        }
        catch (ApiRequestException apirequestexception)
        {
            handleRemotePlaylistException(apirequestexception);
            return Boolean.valueOf(true);
        }
        set = createRemoteTracklist(apiplaylistwithtracks);
        obj1 = new TreeSet();
        obj = new TreeSet();
        obj2 = new TreeSet();
        compileLocalPlaylistState(((Set) (obj1)), ((Set) (obj)), ((Set) (obj2)));
        obj1 = getSetIntersection(((Set) (obj2)), set);
        obj2 = performRemovals(apiplaylistwithtracks, ((Set) (obj1)));
        storeTracks.call(obj2);
        set = getSetDifference(((Set) (obj)), new Set[] {
            set
        });
        obj = performAdditions(((List) (obj2)), set);
        ((StoreCommand)replacePlaylistTracks.with(obj)).call();
        updateLocalPlaylist(apiplaylistwithtracks.getPlaylist(), ((Set) (obj1)), set);
        return Boolean.valueOf(true);
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    private class _cls1
    {

        static final int $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[];

        static 
        {
            $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason = new int[com.soundcloud.android.api.ApiRequestException.Reason.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ApiRequestException.Reason.NOT_FOUND.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ApiRequestException.Reason.NOT_ALLOWED.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
