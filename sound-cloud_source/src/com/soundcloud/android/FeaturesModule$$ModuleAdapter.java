// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android;

import com.soundcloud.android.accounts.AuthenticationModule;
import com.soundcloud.android.activities.ActivitiesModule;
import com.soundcloud.android.collections.CollectionsModule;
import com.soundcloud.android.comments.CommentsModule;
import com.soundcloud.android.creators.record.RecordModule;
import com.soundcloud.android.creators.upload.UploadModule;
import com.soundcloud.android.discovery.DiscoveryModule;
import com.soundcloud.android.explore.ExploreModule;
import com.soundcloud.android.likes.LikesModule;
import com.soundcloud.android.main.MainModule;
import com.soundcloud.android.offline.OfflineModule;
import com.soundcloud.android.payments.PaymentModule;
import com.soundcloud.android.playback.PlayerModule;
import com.soundcloud.android.playlists.PlaylistsModule;
import com.soundcloud.android.policies.PoliciesModule;
import com.soundcloud.android.profile.ProfileModule;
import com.soundcloud.android.search.SearchModule;
import com.soundcloud.android.settings.SettingsModule;
import com.soundcloud.android.stations.StationsModule;
import com.soundcloud.android.stream.SoundStreamModule;
import com.soundcloud.android.tracks.TrackModule;
import com.soundcloud.android.you.YouModule;
import dagger.a.r;

// Referenced classes of package com.soundcloud.android:
//            FeaturesModule

public final class INCLUDES extends r
{

    private static final Class INCLUDES[] = {
        com/soundcloud/android/accounts/AuthenticationModule, com/soundcloud/android/activities/ActivitiesModule, com/soundcloud/android/search/SearchModule, com/soundcloud/android/explore/ExploreModule, com/soundcloud/android/main/MainModule, com/soundcloud/android/playback/PlayerModule, com/soundcloud/android/playlists/PlaylistsModule, com/soundcloud/android/profile/ProfileModule, com/soundcloud/android/stream/SoundStreamModule, com/soundcloud/android/tracks/TrackModule, 
        com/soundcloud/android/comments/CommentsModule, com/soundcloud/android/payments/PaymentModule, com/soundcloud/android/offline/OfflineModule, com/soundcloud/android/policies/PoliciesModule, com/soundcloud/android/creators/record/RecordModule, com/soundcloud/android/creators/upload/UploadModule, com/soundcloud/android/likes/LikesModule, com/soundcloud/android/settings/SettingsModule, com/soundcloud/android/stations/StationsModule, com/soundcloud/android/discovery/DiscoveryModule, 
        com/soundcloud/android/collections/CollectionsModule, com/soundcloud/android/you/YouModule
    };
    private static final String INJECTS[] = new String[0];
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final FeaturesModule newModule()
    {
        return new FeaturesModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public ()
    {
        super(com/soundcloud/android/FeaturesModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, true, false);
    }
}
