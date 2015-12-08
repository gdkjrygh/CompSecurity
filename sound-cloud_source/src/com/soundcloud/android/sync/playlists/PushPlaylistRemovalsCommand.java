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
import java.util.Collection;
import java.util.Iterator;

class PushPlaylistRemovalsCommand extends LegacyCommand
{

    private final ApiClient apiClient;
    private Urn playlistUrn;

    PushPlaylistRemovalsCommand(ApiClient apiclient)
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
        Object obj;
        for (Iterator iterator = ((Collection)input).iterator(); iterator.hasNext(); throwNetworkOrServerError(apiClient.fetchResponse(((ApiRequest) (obj)))))
        {
            obj = (Urn)iterator.next();
            obj = ApiRequest.delete(ApiEndpoints.PLAYLIST_REMOVE_TRACK.path(new Object[] {
                playlistUrn, obj
            })).forPrivateApi(1).build();
        }

        return (Collection)input;
    }

    public PushPlaylistRemovalsCommand with(Urn urn)
    {
        playlistUrn = urn;
        return this;
    }
}
