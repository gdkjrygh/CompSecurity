// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.json.JsonTransformer;
import com.soundcloud.android.associations.NextFollowingOperations;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.sync.affiliations.MyFollowingsSyncer;
import com.soundcloud.android.sync.playlists.LegacySinglePlaylistSyncer;
import com.soundcloud.android.sync.playlists.SinglePlaylistSyncerFactory;
import dagger.Lazy;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync:
//            ApiSyncService, ApiSyncer, SyncStrategy

public class ApiSyncerFactory
{

    public static final String TAG;
    private final Provider accountOpsProvider;
    private final FeatureFlags featureFlags;
    private final JsonTransformer jsonTransformer;
    private final Lazy lazyActivitiesSyncer;
    private final Lazy lazyMyLikesSyncer;
    private final Lazy lazyMyPostsSyncer;
    private final Lazy lazyPlaylistsSyncer;
    private final Lazy lazySoundStreamSyncer;
    private final Navigator navigator;
    private final Provider nextFollowingOperationsProvider;
    private final Provider notificationManagerProvider;
    private final SinglePlaylistSyncerFactory singlePlaylistSyncerFactory;

    public ApiSyncerFactory(Provider provider, Provider provider1, Provider provider2, Lazy lazy, Lazy lazy1, Lazy lazy2, Lazy lazy3, 
            Lazy lazy4, SinglePlaylistSyncerFactory singleplaylistsyncerfactory, JsonTransformer jsontransformer, Navigator navigator1, FeatureFlags featureflags)
    {
        nextFollowingOperationsProvider = provider;
        accountOpsProvider = provider1;
        notificationManagerProvider = provider2;
        lazySoundStreamSyncer = lazy;
        lazyActivitiesSyncer = lazy1;
        lazyPlaylistsSyncer = lazy2;
        lazyMyLikesSyncer = lazy3;
        lazyMyPostsSyncer = lazy4;
        singlePlaylistSyncerFactory = singleplaylistsyncerfactory;
        jsonTransformer = jsontransformer;
        navigator = navigator1;
        featureFlags = featureflags;
    }

    private Urn getPlaylistUrnFromLegacyContentUri(Uri uri)
    {
        return Urn.forPlaylist(Long.valueOf(uri.getLastPathSegment()).longValue());
    }

    public SyncStrategy forContentUri(Context context, Uri uri)
    {
        switch (_cls1..SwitchMap.com.soundcloud.android.storage.provider.Content[Content.match(uri).ordinal()])
        {
        default:
            return new ApiSyncer(context, context.getContentResolver());

        case 1: // '\001'
            return (SyncStrategy)lazySoundStreamSyncer.a();

        case 2: // '\002'
            if (featureFlags.isEnabled(Flag.ACTIVITIES_REFACTOR))
            {
                return (SyncStrategy)lazyActivitiesSyncer.a();
            } else
            {
                return new ApiSyncer(context, context.getContentResolver());
            }

        case 3: // '\003'
            return (SyncStrategy)lazyMyLikesSyncer.a();

        case 4: // '\004'
            return new MyFollowingsSyncer(context, (AccountOperations)accountOpsProvider.get(), (NextFollowingOperations)nextFollowingOperationsProvider.get(), (NotificationManager)notificationManagerProvider.get(), jsonTransformer, navigator);

        case 5: // '\005'
            return (SyncStrategy)lazyPlaylistsSyncer.a();

        case 6: // '\006'
            return new LegacySinglePlaylistSyncer(singlePlaylistSyncerFactory, getPlaylistUrnFromLegacyContentUri(uri));

        case 7: // '\007'
            return (SyncStrategy)lazyMyPostsSyncer.a();
        }
    }

    static 
    {
        TAG = ApiSyncService.LOG_TAG;
    }

    private class _cls1
    {

        static final int $SwitchMap$com$soundcloud$android$storage$provider$Content[];

        static 
        {
            $SwitchMap$com$soundcloud$android$storage$provider$Content = new int[Content.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_SOUND_STREAM.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_ACTIVITIES.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_LIKES.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_FOLLOWINGS.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_PLAYLISTS.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.PLAYLIST.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_SOUNDS.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
