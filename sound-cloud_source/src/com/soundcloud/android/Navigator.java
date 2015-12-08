// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.soundcloud.android.activities.ActivitiesActivity;
import com.soundcloud.android.analytics.PromotedSourceInfo;
import com.soundcloud.android.analytics.SearchQuerySourceInfo;
import com.soundcloud.android.api.legacy.model.Recording;
import com.soundcloud.android.creators.record.RecordActivity;
import com.soundcloud.android.deeplinks.ResolveActivity;
import com.soundcloud.android.discovery.DiscoveryActivity;
import com.soundcloud.android.discovery.PlaylistDiscoveryActivity;
import com.soundcloud.android.discovery.RecommendedTracksActivity;
import com.soundcloud.android.discovery.SearchActivity;
import com.soundcloud.android.discovery.SearchResultsActivity;
import com.soundcloud.android.explore.ExploreActivity;
import com.soundcloud.android.likes.TrackLikesActivity;
import com.soundcloud.android.main.LauncherActivity;
import com.soundcloud.android.main.MainActivity;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.main.WebViewActivity;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.onboarding.OnboardActivity;
import com.soundcloud.android.payments.UpgradeActivity;
import com.soundcloud.android.playlists.PlaylistDetailActivity;
import com.soundcloud.android.profile.ProfileActivity;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import com.soundcloud.android.search.LegacySearchActivity;
import com.soundcloud.android.settings.LegalActivity;
import com.soundcloud.android.settings.NotificationSettingsActivity;
import com.soundcloud.android.settings.OfflineSettingsActivity;
import com.soundcloud.android.settings.SettingsActivity;
import com.soundcloud.android.stations.ShowAllStationsActivity;

public class Navigator
{

    private static final int FLAGS_TOP = 0x1400c000;
    private static final int NO_FLAGS = 0;
    private final FeatureFlags featureFlags;

    public Navigator(FeatureFlags featureflags)
    {
        featureFlags = featureflags;
    }

    private Intent createExploreIntent(Context context, Screen screen)
    {
        context = new Intent(context, com/soundcloud/android/explore/ExploreActivity);
        screen.addToIntent(context);
        return context;
    }

    private Intent createLauncherIntent(Context context)
    {
        return new Intent(context, com/soundcloud/android/main/LauncherActivity);
    }

    private Intent createOnboardingIntent(Context context, Screen screen, Urn urn)
    {
        context = (new Intent(context, com/soundcloud/android/onboarding/OnboardActivity)).putExtra("EXTRA_URN", urn).setFlags(0x1400c000);
        screen.addToIntent(context);
        return context;
    }

    private Intent createPlaylistDiscoveryIntent(Context context, String s)
    {
        return (new Intent(context, com/soundcloud/android/discovery/PlaylistDiscoveryActivity)).putExtra("playlistTag", s);
    }

    private Intent createRecommendationIntent(Context context, long l)
    {
        return (new Intent(context, com/soundcloud/android/discovery/RecommendedTracksActivity)).putExtra("localSeedId", l);
    }

    private Intent createRecordIntent(Context context, Recording recording)
    {
        return (new Intent(context, com/soundcloud/android/creators/record/RecordActivity)).putExtra("recording", recording).setFlags(0x4020000);
    }

    private Intent createRecordIntent(Context context, Recording recording, Screen screen)
    {
        context = createRecordIntent(context, recording);
        screen.addToIntent(context);
        return context;
    }

    private Intent createResolveIntent(Context context, Urn urn)
    {
        context = new Intent(context, com/soundcloud/android/deeplinks/ResolveActivity);
        context.setAction("android.intent.action.VIEW");
        context.setData(Uri.parse(urn.toString()));
        context.setFlags(0x1400c000);
        return context;
    }

    private Intent createSearchIntent(Context context, Uri uri, Screen screen)
    {
        context = new Intent(context, com/soundcloud/android/search/LegacySearchActivity);
        context.setAction("android.intent.action.VIEW");
        context.setData(uri);
        screen.addToIntent(context);
        return context;
    }

    private Intent createSearchResultsIntent(Context context, String s)
    {
        return (new Intent(context, com/soundcloud/android/discovery/SearchResultsActivity)).putExtra("searchQuery", s);
    }

    private Intent createStreamIntent(Screen screen)
    {
        Intent intent = (new Intent("com.soundcloud.android.action.STREAM")).setFlags(0x1400c000);
        screen.addToIntent(intent);
        return intent;
    }

    private Intent createStreamWithExpandedPlayerIntent(Screen screen)
    {
        return createStreamIntent(screen).putExtra("expand_player", true);
    }

    private Intent createWebViewIntent(Context context, Uri uri)
    {
        return (new Intent(context, com/soundcloud/android/main/WebViewActivity)).setData(uri);
    }

    private void startActivity(Context context, Class class1)
    {
        context.startActivity(new Intent(context, class1));
    }

    public Intent createProfileIntent(Context context, Urn urn)
    {
        return (new Intent(context, com/soundcloud/android/profile/ProfileActivity)).putExtra("userUrn", urn);
    }

    public Intent createProfileIntent(Context context, Urn urn, Screen screen)
    {
        context = createProfileIntent(context, urn);
        screen.addToIntent(context);
        return context;
    }

    public void launchSearchSuggestion(Context context, Urn urn, SearchQuerySourceInfo searchquerysourceinfo, Uri uri)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(0x10000000);
        if (urn.isUser())
        {
            intent.putExtra("searchQuerySourceInfo", searchquerysourceinfo);
        }
        Screen.SEARCH_SUGGESTIONS.addToIntent(intent);
        context.startActivity(intent.setData(uri));
    }

    public void openActivities(Context context)
    {
        context.startActivity(new Intent(context, com/soundcloud/android/activities/ActivitiesActivity));
    }

    public void openDiscovery(Context context)
    {
        if (featureFlags.isEnabled(Flag.DISCOVERY))
        {
            startActivity(context, com/soundcloud/android/discovery/DiscoveryActivity);
            return;
        } else
        {
            startActivity(context, com/soundcloud/android/search/LegacySearchActivity);
            return;
        }
    }

    public void openExplore(Context context, Screen screen)
    {
        context.startActivity(createExploreIntent(context, screen));
    }

    public void openHelpCenter(Context context)
    {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(context.getString(0x7f070334))));
    }

    public void openHome(Context context)
    {
        context.startActivity((new Intent(context, com/soundcloud/android/main/MainActivity)).addFlags(0x4000000));
    }

    public void openLauncher(Context context)
    {
        context.startActivity(createLauncherIntent(context));
    }

    public void openLegacySearch(Context context, Uri uri, Screen screen)
    {
        context.startActivity(createSearchIntent(context, uri, screen));
    }

    public void openLegal(Context context)
    {
        context.startActivity(new Intent(context, com/soundcloud/android/settings/LegalActivity));
    }

    public void openNotificationSettings(Context context)
    {
        context.startActivity(new Intent(context, com/soundcloud/android/settings/NotificationSettingsActivity));
    }

    public void openOfflineSettings(Context context)
    {
        context.startActivity(new Intent(context, com/soundcloud/android/settings/OfflineSettingsActivity));
    }

    public void openOnboarding(Context context, Urn urn, Screen screen)
    {
        context.startActivity(createOnboardingIntent(context, screen, urn));
    }

    public void openPlaylist(Context context, Urn urn, Screen screen)
    {
        context.startActivity(PlaylistDetailActivity.getIntent(urn, screen, false));
    }

    public void openPlaylist(Context context, Urn urn, Screen screen, SearchQuerySourceInfo searchquerysourceinfo, PromotedSourceInfo promotedsourceinfo)
    {
        context.startActivity(PlaylistDetailActivity.getIntent(urn, screen, false, searchquerysourceinfo, promotedsourceinfo));
    }

    public void openPlaylistDiscoveryTag(Context context, String s)
    {
        context.startActivity(createPlaylistDiscoveryIntent(context, s));
    }

    public void openProfile(Context context, Urn urn)
    {
        context.startActivity(createProfileIntent(context, urn));
    }

    public void openProfile(Context context, Urn urn, Screen screen)
    {
        context.startActivity(createProfileIntent(context, urn, screen));
    }

    public void openProfile(Context context, Urn urn, Screen screen, SearchQuerySourceInfo searchquerysourceinfo)
    {
        context.startActivity(createProfileIntent(context, urn, screen).putExtra("searchQuerySourceInfo", searchquerysourceinfo));
    }

    public PendingIntent openProfileFromNotification(Context context, Urn urn)
    {
        return PendingIntent.getActivity(context, 0, createProfileIntent(context, urn, Screen.NOTIFICATION).addFlags(0x30000000), 0x10000000);
    }

    public PendingIntent openProfileFromWidget(Context context, Urn urn, int i)
    {
        return PendingIntent.getActivity(context, i, createProfileIntent(context, urn, Screen.WIDGET), 0x10000000);
    }

    public void openRecommendation(Context context, long l)
    {
        context.startActivity(createRecommendationIntent(context, l));
    }

    public void openRecord(Context context)
    {
        context.startActivity(createRecordIntent(context, null));
    }

    public void openRecord(Context context, Recording recording)
    {
        context.startActivity(createRecordIntent(context, recording));
    }

    public void openRecord(Context context, Screen screen)
    {
        context.startActivity(createRecordIntent(context, null, screen));
    }

    public void openResolveForUrn(Context context, Urn urn)
    {
        context.startActivity(createResolveIntent(context, urn));
    }

    public void openSearch(Activity activity)
    {
        startActivity(activity, com/soundcloud/android/discovery/SearchActivity);
    }

    public void openSettings(Context context)
    {
        context.startActivity(new Intent(context, com/soundcloud/android/settings/SettingsActivity));
    }

    public void openStream(Context context, Screen screen)
    {
        context.startActivity(createStreamIntent(screen));
    }

    public void openStreamWithExpandedPlayer(Context context, Screen screen)
    {
        context.startActivity(createStreamWithExpandedPlayerIntent(screen));
    }

    public void openTrackLikes(Context context)
    {
        context.startActivity(new Intent(context, com/soundcloud/android/likes/TrackLikesActivity));
    }

    public void openUpgrade(Context context)
    {
        context.startActivity(new Intent(context, com/soundcloud/android/payments/UpgradeActivity));
    }

    public void openViewAllStations(Context context, int i)
    {
        Intent intent = new Intent(context, com/soundcloud/android/stations/ShowAllStationsActivity);
        intent.putExtra("type", i);
        context.startActivity(intent);
    }

    public void openWebView(Context context, Uri uri)
    {
        context.startActivity(createWebViewIntent(context, uri));
    }
}
