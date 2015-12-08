// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.playlists;

import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.commands.LegacyCommand;

// Referenced classes of package com.soundcloud.android.sync.playlists:
//            ApiPlaylistWithTracks

public class FetchPlaylistWithTracksCommand extends LegacyCommand
{

    private final ApiClient apiClient;

    public FetchPlaylistWithTracksCommand(ApiClient apiclient)
    {
        apiClient = apiclient;
    }

    public ApiPlaylistWithTracks call()
        throws Exception
    {
        ApiRequest apirequest = ApiRequest.get(ApiEndpoints.PLAYLIST_WITH_TRACKS.path(new Object[] {
            input
        })).forPrivateApi(1).build();
        return (ApiPlaylistWithTracks)apiClient.fetchMappedResponse(apirequest, new _cls1());
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    private class _cls1 extends TypeToken
    {

        final FetchPlaylistWithTracksCommand this$0;

        _cls1()
        {
            this$0 = FetchPlaylistWithTracksCommand.this;
            super();
        }
    }

}
