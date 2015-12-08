// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.posts;

import android.net.Uri;
import android.support.v4.util.ArrayMap;
import android.util.Pair;
import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.api.model.ApiPlaylist;
import com.soundcloud.android.events.EntityMetadata;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.LoadPlaylistTrackUrnsCommand;
import com.soundcloud.android.playlists.PlaylistProperty;
import com.soundcloud.android.sync.ApiSyncResult;
import com.soundcloud.android.sync.SyncStrategy;
import com.soundcloud.android.utils.Urns;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.soundcloud.android.sync.posts:
//            LoadLocalPlaylistsCommand, ApiPlaylistWrapper, ReplacePlaylistPostCommand, PostsSyncer

public class MyPlaylistsSyncer
    implements SyncStrategy
{

    private static final String TAG = "MyPlaylistsSyncer";
    private final ApiClient apiClient;
    private final EventBus eventBus;
    private final LoadLocalPlaylistsCommand loadLocalPlaylists;
    private final LoadPlaylistTrackUrnsCommand loadPlaylistTrackUrnsCommand;
    private final PostsSyncer postsSyncer;
    private final ReplacePlaylistPostCommand replacePlaylist;

    public MyPlaylistsSyncer(PostsSyncer postssyncer, LoadLocalPlaylistsCommand loadlocalplaylistscommand, LoadPlaylistTrackUrnsCommand loadplaylisttrackurnscommand, ReplacePlaylistPostCommand replaceplaylistpostcommand, ApiClient apiclient, EventBus eventbus)
    {
        postsSyncer = postssyncer;
        loadLocalPlaylists = loadlocalplaylistscommand;
        loadPlaylistTrackUrnsCommand = loadplaylisttrackurnscommand;
        replacePlaylist = replaceplaylistpostcommand;
        apiClient = apiclient;
        eventBus = eventbus;
    }

    private Map createPlaylistBody(PropertySet propertyset, List list)
    {
        ArrayMap arraymap = new ArrayMap(2);
        arraymap.put("title", propertyset.get(PlaylistProperty.TITLE));
        boolean flag;
        if (!((Boolean)propertyset.get(PlaylistProperty.IS_PRIVATE)).booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        arraymap.put("public", Boolean.valueOf(flag));
        propertyset = new ArrayMap(2);
        propertyset.put("playlist", arraymap);
        propertyset.put("track_urns", Urns.toString(list));
        return propertyset;
    }

    private void publishPlaylistCreated(ApiPlaylist apiplaylist)
    {
        eventBus.publish(EventQueue.TRACKING, UIEvent.fromCreatePlaylist(EntityMetadata.from(apiplaylist)));
    }

    private List pushLocalPlaylists()
        throws Exception
    {
        Object obj = loadLocalPlaylists.call();
        ArrayList arraylist = new ArrayList(((List) (obj)).size());
        (new StringBuilder("Local Playlist count : ")).append(((List) (obj)).size());
        Object obj1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(((ApiPlaylist) (obj1)).getUrn()))
        {
            obj1 = (PropertySet)((Iterator) (obj)).next();
            Urn urn = (Urn)((PropertySet) (obj1)).get(PlaylistProperty.URN);
            List list = ((LoadPlaylistTrackUrnsCommand)loadPlaylistTrackUrnsCommand.with(urn)).call();
            obj1 = ApiRequest.post(ApiEndpoints.PLAYLISTS_CREATE.path()).forPrivateApi(1).withContent(createPlaylistBody(((PropertySet) (obj1)), list)).build();
            obj1 = ((ApiPlaylistWrapper)apiClient.fetchMappedResponse(((ApiRequest) (obj1)), com/soundcloud/android/sync/posts/ApiPlaylistWrapper)).getApiPlaylist();
            publishPlaylistCreated(((ApiPlaylist) (obj1)));
            ((ReplacePlaylistPostCommand)replacePlaylist.with(Pair.create(urn, obj1))).call();
        }

        return arraylist;
    }

    public ApiSyncResult syncContent(Uri uri, String s)
        throws Exception
    {
        if (postsSyncer.call(pushLocalPlaylists()).booleanValue())
        {
            return ApiSyncResult.fromSuccessfulChange(uri);
        } else
        {
            return ApiSyncResult.fromSuccessWithoutChange(uri);
        }
    }
}
