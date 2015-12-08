// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.deeplinks;

import android.net.Uri;
import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiMapperException;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.api.ApiRequestException;
import com.soundcloud.android.api.legacy.model.PublicApiPlaylist;
import com.soundcloud.android.api.legacy.model.PublicApiResource;
import com.soundcloud.android.api.legacy.model.PublicApiTrack;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.commands.StorePlaylistsCommand;
import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.commands.StoreUsersCommand;
import com.soundcloud.android.model.Urn;
import java.io.IOException;
import java.util.Collections;
import rx.R;
import rx.b;

// Referenced classes of package com.soundcloud.android.deeplinks:
//            DeepLink, UrnResolver

class ResolveOperations
{

    private final ApiClient apiClient;
    private final R scheduler;
    private final StorePlaylistsCommand storePlaylistsCommand;
    private final StoreTracksCommand storeTracksCommand;
    private final StoreUsersCommand storeUsersCommand;

    ResolveOperations(ApiClient apiclient, R r, StoreTracksCommand storetrackscommand, StorePlaylistsCommand storeplaylistscommand, StoreUsersCommand storeuserscommand)
    {
        apiClient = apiclient;
        scheduler = r;
        storeTracksCommand = storetrackscommand;
        storePlaylistsCommand = storeplaylistscommand;
        storeUsersCommand = storeuserscommand;
    }

    private Uri followClickTrackingUrl(Uri uri)
    {
        Uri uri1 = uri;
        if (DeepLink.isClickTrackingUrl(uri))
        {
            apiClient.fetchResponse(ApiRequest.get(uri.toString()).forPublicApi().build());
            uri1 = DeepLink.extractClickTrackingRedirectUrl(uri);
        }
        return uri1;
    }

    private PublicApiResource resolveResource(String s)
    {
        s = ApiRequest.get(ApiEndpoints.RESOLVE.path()).forPublicApi().addQueryParam("url", new Object[] {
            s
        }).build();
        s = (PublicApiResource)apiClient.fetchMappedResponse(s, com/soundcloud/android/api/legacy/model/PublicApiResource);
        return s;
        s;
_L2:
        return null;
        s;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private PublicApiResource resolveUri(Uri uri)
    {
        Urn urn = resolveUrn(uri);
        if (Urn.NOT_SET.equals(urn))
        {
            return resolveResource(uri.toString());
        } else
        {
            return resolveResource(urn.toString());
        }
    }

    private Urn resolveUrn(Uri uri)
    {
        try
        {
            uri = (new UrnResolver()).toUrn(uri);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return Urn.NOT_SET;
        }
        return uri;
    }

    private void storeResource(PublicApiResource publicapiresource)
    {
        Urn urn = publicapiresource.getUrn();
        if (urn.isTrack())
        {
            storeTracksCommand.call(Collections.singletonList(((PublicApiTrack)publicapiresource).toApiMobileTrack()));
        } else
        {
            if (urn.isPlaylist())
            {
                storePlaylistsCommand.call(Collections.singletonList(((PublicApiPlaylist)publicapiresource).toApiMobilePlaylist()));
                return;
            }
            if (urn.isUser())
            {
                storeUsersCommand.call(Collections.singletonList(((PublicApiUser)publicapiresource).toApiMobileUser()));
                return;
            }
        }
    }

    public b resolve(final Uri originalUri)
    {
        return b.create(new _cls1()).subscribeOn(scheduler);
    }




    private class _cls1
        implements rx.b.f
    {

        final ResolveOperations this$0;
        final Uri val$originalUri;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            Uri uri = followClickTrackingUrl(originalUri);
            PublicApiResource publicapiresource = resolveUri(uri);
            if (publicapiresource != null)
            {
                storeResource(publicapiresource);
                x.onNext(publicapiresource);
                x.onCompleted();
                return;
            } else
            {
                x.onError(new rx.exceptions.OnErrorThrowable.OnNextValue(uri));
                return;
            }
        }

        _cls1()
        {
            this$0 = ResolveOperations.this;
            originalUri = uri;
            super();
        }
    }

}
