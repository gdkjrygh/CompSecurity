// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.playlists;

import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.api.ApiRequestException;
import com.soundcloud.android.api.ApiResponse;
import com.soundcloud.android.commands.LegacyCommand;
import com.soundcloud.android.model.Urn;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class PushPlaylistAdditionsCommand extends LegacyCommand
{

    private final ApiClient apiClient;
    private Urn playlistUrn;

    PushPlaylistAdditionsCommand(ApiClient apiclient)
    {
        apiClient = apiclient;
    }

    private void throwNetworkOrServerError(ApiResponse apiresponse)
        throws ApiRequestException
    {
        ApiRequestException apirequestexception = apiresponse.getFailure();
        if (apirequestexception != null && (apirequestexception.isNetworkError() || apiresponse.getStatusCode() >= 500))
        {
            throw apirequestexception;
        } else
        {
            return;
        }
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Collection call()
        throws Exception
    {
        ArrayList arraylist = new ArrayList(((Collection)input).size());
        for (Iterator iterator = ((Collection)input).iterator(); iterator.hasNext();)
        {
            Urn urn = (Urn)iterator.next();
            Object obj = ApiRequest.post(ApiEndpoints.PLAYLIST_ADD_TRACK.path(new Object[] {
                playlistUrn
            })).forPrivateApi(1).withContent(Collections.singletonMap("track_urn", urn.toString())).build();
            obj = apiClient.fetchResponse(((ApiRequest) (obj)));
            if (((ApiResponse) (obj)).isSuccess())
            {
                arraylist.add(urn);
            } else
            {
                throwNetworkOrServerError(((ApiResponse) (obj)));
            }
        }

        return arraylist;
    }

    public PushPlaylistAdditionsCommand with(Urn urn)
    {
        playlistUrn = urn;
        return this;
    }
}
