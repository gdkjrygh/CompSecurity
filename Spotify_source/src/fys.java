// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.connect.flags.ContextlessMiniPlayerVisibilityFlag;
import com.spotify.mobile.android.spotlets.offline.flags.OfflineSyncSwitchVisibility;
import com.spotify.mobile.android.spotlets.onboarding.premium.offline.OfflineSyncFeatureOnboarding;
import com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellsFlag;
import com.spotify.mobile.android.ui.activity.upsell.ondemand.OnDemandUpsellVariationFlag;
import com.spotify.mobile.android.ui.activity.upsell.repository.OptInTrialBypassFlag;
import com.spotify.mobile.android.ui.activity.upsell.repository.ShowOfferInNavigationDrawerFlag;
import com.spotify.mobile.android.ui.activity.upsell.telco.PassIMSIToCheckoutFlow;
import com.spotify.music.spotlets.churnlockedstate.ChurnLockedStateRolloutFlag;
import com.spotify.music.spotlets.networkoperatorpremiumactivation.RolloutGlobalChargeMsisdnLookup;
import com.spotify.music.spotlets.tracking.adjust.AdjustDeepLinkAttributionFlag;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class fys
    implements dxf
{

    public static final fyo A = b("shows-collection-jam");
    public static final fyo B = b("glenn-v2");
    public static final fyo C = b("arsenal_country");
    public static final fyy D = new fyy("enable-annotations", new fzf("enable-annotations"));
    public static final fyy E = new fyy("ab-playlist-annotation-edit", new fzf("ab-playlist-annotation-edit"));
    public static final fyo F = b("ugc-abuse-report");
    public static final fzj G = new fzj("ugc-abuse-report-url", new fzf("ugc-abuse-report-url"));
    public static final fyo H = b("enable-annotations-read");
    public static final fyo I = b("add-to-playlist-recently-changed");
    public static final fyo J = b("add-to-playlist-on-save-to-collection");
    public static final fzj K = a("bfs_episodes_in_search_results");
    public static final fzj L = a("bfs_android_genre_hub");
    public static final fyo M = b("ab-artist-promo");
    public static final fyo N = b("ab-mobile-hubs");
    public static final fyo O = b("android-browse-hub");
    public static final fyo P = b("showcase-android");
    public static final fyo Q = b("user-profile-show-invitation-codes");
    public static final fyo R = b("network-operator-premium-activation");
    public static final fzj S = a("android-cluster-radio");
    public static final fzj T = a("android-station-entity");
    public static final fzj U = a("rafiki-ab-album-apollo");
    public static final fzj V = a("ab-resubscription-interstitial-and");
    public static final fyo W = b("payments-cancel-state-interstitial");
    public static final fyo X = b("payments-locked-state");
    public static final fzj Y = new fzj("social_share_oauth_android_v2", new fym("social_share_oauth_android_v2"));
    public static final fzj Z = new fzj("ab-feedback-channel", new fym("feedback-channel-android"));
    public static final fyo a = b("ad-formats-preroll-video");
    public static final fyq aA;
    public static final fyq aB;
    public static final fyo aC;
    public static final fzj aD = new fzj("ab-cast-showcase", new fym("ab-cast-showcase"));
    public static final fyq aE;
    public static final fzj aF = new fzj("ab-events-hub-enabled", new fym("ab-events-hub-enabled"));
    public static final fzj aG = new fzj("ab-events-hub-in-nav", new fym("ab-events-hub-in-nav"));
    public static final fzj aH = new fzj("ab-events-hub-showcase", new fym("ab-events-hub-showcase"));
    public static final fyq aI;
    public static final fyq aJ;
    public static final fyq aK;
    public static final fzj aL = c("backstage-favorite-artist");
    public static final fyq aM;
    public static final fyq aN;
    public static final fyq aO;
    public static final fyq aP;
    public static final fyq aQ;
    private static final List aR;
    private static final List aS;
    private static final List aT;
    private static final List aU;
    public static final fyo aa = b("ads");
    public static final fyo ab = b("offline");
    public static final fyo ac = b("high-bitrate");
    public static final fyo ad = b("on-demand");
    public static final fyo ae = b("streaming");
    public static final fzj af = c("streaming-rules");
    public static final fyo ag = b("ab-mobile-upsell-basic");
    public static final fzj ah = new fzj("ab-mobile-upsell-basic-consumable", new fym("ab-mobile-upsell-basic-consumable"));
    public static final fzj ai = new fzj("ab-mobile-upsell-basic-consumable-v2", new fym("ab-mobile-upsell-basic-consumable-v2"));
    public static final fyy aj = new fyy("license-acceptance-grace-days", new fzf("license-acceptance-grace-days"));
    public static final fzj ak = a("ab-adjust-sdk-enabled");
    public static final fyo al = b("ab-mobile-taste-onboarding-v0");
    public static final fzj am = a("rollout-google-now-client-enabler");
    public static final fzj an = c("widevine-license-url");
    public static final fzj ao = c("video-manifest-url");
    public static final fzj ap = c("video-keyframe-url");
    public static final fyo aq = b("video-device-blacklisted");
    public static final fzj ar = a("ab-video-wifi-initial-bitrate");
    public static final gqb as = new gqb();
    public static final fyo at = b("ab-party");
    public static final fyo au = new fyo("ab-mobile-running", new fzf("ab-mobile-running")) {

        public final Serializable b_(String s1)
        {
            boolean flag;
            if ("running".equals(s1) || "beta".equals("release"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

    };
    public static final fyo av = new fyo("ab-mobile-running-tempo-detection", new fzf("ab-mobile-running-tempo-detection")) {

        public final Serializable b_(String s1)
        {
            return Boolean.valueOf("Enabled".equals(s1));
        }

    };
    public static final fyq aw;
    public static final fyy ax = new fyy("ab-mobile-startpage", new fzf("ab-mobile-startpage"));
    public static final fzj ay = c("opt-in");
    public static final fse az = new fse();
    public static final fyo b = b("ab-watch-now");
    public static final fyo c = b("ad-formats-banner");
    public static final fyo d = b("ad-exoplayer-video");
    public static final fyo e = b("ad-betamax-video");
    public static final fzj f = a("ad-sponsored-playlist-android");
    public static final fzj g = a("ads-mobile-screensaver-android");
    public static final fzj h = a("ad-nielsen-measurement");
    public static final fyy i = new fyy("ab-browse-highlights", new fzf("ab-browse-highlights"));
    public static final fyo j = a("shuffle_restricted", "shuffle_restricted");
    public static final fyo k = new fyo("connect_icon_enabled", new fyt("connect")) {

        public final boolean a(int i1)
        {
            boolean flag1 = false;
            boolean flag;
            if ((i1 & 1) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if ((i1 & 2) != 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (flag || i1 != 0)
            {
                flag1 = true;
            }
            return flag1;
        }

    };
    public static final fyo l = new fyo("connect_devices_enabled", new fyt("connect")) {

        public final boolean a(int i1)
        {
            boolean flag1 = false;
            boolean flag;
            if ((i1 & 2) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if ((i1 & 4) != 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (flag || i1 != 0)
            {
                flag1 = true;
            }
            return flag1;
        }

    };
    public static final fyo m = a("push_notifications_enabled", "ab_test_push_notifications");
    public static final fyo n = b("ab-connect-onboarding");
    public static final fyo o = b("connect-showcase");
    public static final fyo p = b("ab-collection-bookmark-model");
    public static final fyo q = b("ab-collection-followed-artists-only");
    public static final fyo r = b("collection-cosmos-album-list");
    public static final fyo s = b("collection-cosmos-artist-list");
    public static final fyo t = b("collection-cosmos-playlist-list");
    public static final fyo u = b("collection-cosmos-song-list");
    public static final fyo v = b("ab-collection-hide-unavailable-albums");
    public static final fyo w = b("ab-collection-offline-mode");
    public static final fyo x = b("shows-collection");
    public static final fyo y = b("ab-mobile-new-navigation");
    public static final fzj z = c("ab-mobile-moments-sub-navigation");

    public fys()
    {
    }

    private static fyo a(String s1, String s2)
    {
        return new fyo(s1, new fyt(s2));
    }

    private static fyq a(String s1, Class class1, Enum enum)
    {
        return new fyq(class1, enum, s1, new fym(s1));
    }

    private static fzj a(String s1)
    {
        return new fzj(s1, new fym(s1));
    }

    private static void a(List list, List list1, List list2, List list3)
    {
        Object obj;
        fzi fzi;
        int i1;
        Field afield[] = fys.getDeclaredFields();
        int j1;
        try
        {
            j1 = afield.length;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new AssertionError(list);
        }
        i1 = 0;
_L7:
        if (i1 >= j1) goto _L2; else goto _L1
_L1:
        obj = afield[i1];
        if (!fyu.isAssignableFrom(((Field) (obj)).getType()))
        {
            break MISSING_BLOCK_LABEL_141;
        }
        obj = (fyu)((Field) (obj)).get(null);
        fzi = ((fyu) (obj)).c;
        if (!(fzi instanceof fyt)) goto _L4; else goto _L3
_L3:
        list.add(obj);
_L5:
        list3.add(obj);
        break MISSING_BLOCK_LABEL_141;
_L4:
        if (fzi instanceof fzf)
        {
            list1.add(obj);
            continue; /* Loop/switch isn't completed */
        }
        if (fzi instanceof fym)
        {
            list2.add(obj);
        }
        if (true) goto _L5; else goto _L2
_L2:
        return;
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static fyo b(String s1)
    {
        return new fyo(s1, new fzf(s1));
    }

    private static fzj c(String s1)
    {
        return new fzj(s1, new fzf(s1));
    }

    public static Collection d()
    {
        return aU;
    }

    public final List a()
    {
        return aR;
    }

    public final List b()
    {
        return aS;
    }

    public final List c()
    {
        return aT;
    }

    static 
    {
        new fyy("ab-connect-npb-icon", new fzf("ab-connect-npb-icon"));
        b("collection-cosmos-album-entity");
        b("collection-cosmos-artist-entity");
        a("bfs_search_feedback");
        new fyy("twitter-feedback-cat-android-tracks", new fzf("twitter-feedback-cat-android-tracks"));
        c("streaming-max-skips-per-hour");
        aw = a("rollout-global-charge-imsi-lookup", com/spotify/music/spotlets/networkoperatorpremiumactivation/RolloutGlobalChargeMsisdnLookup, RolloutGlobalChargeMsisdnLookup.a);
        aA = new fyq(com/spotify/mobile/android/ui/activity/upsell/repository/OptInTrialBypassFlag, OptInTrialBypassFlag.a, "ab-bypass-opt-in-trial", new fym("ab-bypass-opt-in-trial"));
        aB = a("upsell-backend-service-ab-android", com/spotify/mobile/android/ui/activity/dynamicupsell/DynamicUpsellsFlag, DynamicUpsellsFlag.b);
        aC = b(gej.b);
        aE = a("castaway_contextless_mini_player_visibility", com/spotify/mobile/android/spotlets/connect/flags/ContextlessMiniPlayerVisibilityFlag, ContextlessMiniPlayerVisibilityFlag.a);
        new fzj("ab-fannypack-on-artist", new fym("ab-fannypack-on-artist"));
        aI = a("navtray-show-best-offer", com/spotify/mobile/android/ui/activity/upsell/repository/ShowOfferInNavigationDrawerFlag, ShowOfferInNavigationDrawerFlag.a);
        aJ = a("adjust-attribution-rollout", com/spotify/music/spotlets/tracking/adjust/AdjustDeepLinkAttributionFlag, AdjustDeepLinkAttributionFlag.a);
        aK = a("ab-on-demand-upsell", com/spotify/mobile/android/ui/activity/upsell/ondemand/OnDemandUpsellVariationFlag, OnDemandUpsellVariationFlag.a);
        aM = a("ab-opt-in-activation-flow", com/spotify/mobile/android/ui/activity/dialog/trialactivation/TrialActivationActivity$OptInTrialActivationFlow, com.spotify.mobile.android.ui.activity.dialog.trialactivation.TrialActivationActivity.OptInTrialActivationFlow.a);
        aN = a("rollout-pass-imsi-to-checkout", com/spotify/mobile/android/ui/activity/upsell/telco/PassIMSIToCheckoutFlow, PassIMSIToCheckoutFlow.a);
        aO = a("offline-sync-feature-onboarding", com/spotify/mobile/android/spotlets/onboarding/premium/offline/OfflineSyncFeatureOnboarding, OfflineSyncFeatureOnboarding.a);
        aP = a("offline-sync-switch-visibility", com/spotify/mobile/android/spotlets/offline/flags/OfflineSyncSwitchVisibility, OfflineSyncSwitchVisibility.a);
        aQ = a("rollout-churn-lock-state", com/spotify/music/spotlets/churnlockedstate/ChurnLockedStateRolloutFlag, ChurnLockedStateRolloutFlag.b);
        LinkedList linkedlist = new LinkedList();
        LinkedList linkedlist1 = new LinkedList();
        LinkedList linkedlist2 = new LinkedList();
        LinkedList linkedlist3 = new LinkedList();
        a(linkedlist, linkedlist1, linkedlist2, linkedlist3);
        aR = Collections.unmodifiableList(linkedlist);
        aS = Collections.unmodifiableList(linkedlist1);
        aT = Collections.unmodifiableList(linkedlist2);
        aU = Collections.unmodifiableList(linkedlist3);
    }
}
