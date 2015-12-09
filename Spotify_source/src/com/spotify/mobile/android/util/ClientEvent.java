// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util;

import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import ctz;
import dmz;
import gdz;
import gng;
import gni;

// Referenced classes of package com.spotify.mobile.android.util:
//            Assertion

public final class ClientEvent
{

    private static final gdz e = new gdz() {

        protected final volatile Object a()
        {
            return ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        }

    };
    public final Event a;
    public final SubEvent b;
    public String c;
    private final gdz d;

    public ClientEvent(Event event)
    {
        this(event, SubEvent.a);
    }

    public ClientEvent(Event event, SubEvent subevent)
    {
        d = new gdz() {

            protected final Object a()
            {
                return ((ObjectMapper)ClientEvent.b().b()).createObjectNode();
            }

        };
        a = (Event)ctz.a(event);
        b = (SubEvent)ctz.a(subevent);
        c = "";
    }

    static gdz b()
    {
        return e;
    }

    public final ClientEvent a(String s)
    {
        c = (String)s;
        return this;
    }

    public final ClientEvent a(String s, JsonNode jsonnode)
    {
        boolean flag1 = true;
        ctz.a(jsonnode);
        boolean flag;
        if (!jsonnode.isNull())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "Don't use NullNode to sneak a null!");
        if (!jsonnode.isMissingNode())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "Don't use MissingNode to sneak a null!");
        ((ObjectNode)d.b()).set((String)ctz.a(s), jsonnode);
        return this;
    }

    public final ClientEvent a(String s, String s1)
    {
        return a(s, ((JsonNode) (TextNode.valueOf(s1))));
    }

    public final String a()
    {
        String s;
        try
        {
            s = ((ObjectMapper)e.b()).writeValueAsString(d.b());
        }
        catch (JsonProcessingException jsonprocessingexception)
        {
            Assertion.a("Could not serialize extra data");
            return "{}";
        }
        return s;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof ClientEvent)
        {
            if (((ClientEvent) (obj = (ClientEvent)obj)).a == a && ((ClientEvent) (obj)).b == b && TextUtils.equals(((ClientEvent) (obj)).b.toString(), b.toString()))
            {
                obj = (ObjectNode)((ClientEvent) (obj)).d.b();
                return ((ObjectNode)d.b()).equals(obj);
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return a.hashCode() ^ b.hashCode() ^ b.toString().hashCode();
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(a);
        if (b != SubEvent.a)
        {
            stringbuilder.append('/');
            stringbuilder.append(b);
        }
        stringbuilder.append('/');
        stringbuilder.append(b.toString());
        stringbuilder.append('/');
        stringbuilder.append(d.toString());
        return stringbuilder.toString();
    }


    private class SubEvent extends Enum
    {

        public static final SubEvent A;
        public static final SubEvent B;
        public static final SubEvent C;
        public static final SubEvent D;
        public static final SubEvent E;
        public static final SubEvent F;
        public static final SubEvent G;
        public static final SubEvent H;
        public static final SubEvent I;
        public static final SubEvent J;
        public static final SubEvent K;
        public static final SubEvent L;
        public static final SubEvent M;
        public static final SubEvent N;
        public static final SubEvent O;
        public static final SubEvent P;
        public static final SubEvent Q;
        public static final SubEvent R;
        public static final SubEvent S;
        public static final SubEvent T;
        public static final SubEvent U;
        public static final SubEvent V;
        public static final SubEvent W;
        public static final SubEvent X;
        public static final SubEvent Y;
        public static final SubEvent Z;
        public static final SubEvent a;
        public static final SubEvent aA;
        public static final SubEvent aB;
        public static final SubEvent aC;
        public static final SubEvent aD;
        public static final SubEvent aE;
        public static final SubEvent aF;
        public static final SubEvent aG;
        public static final SubEvent aH;
        public static final SubEvent aI;
        public static final SubEvent aJ;
        public static final SubEvent aK;
        public static final SubEvent aL;
        public static final SubEvent aM;
        public static final SubEvent aN;
        public static final SubEvent aO;
        public static final SubEvent aP;
        public static final SubEvent aQ;
        public static final SubEvent aR;
        public static final SubEvent aS;
        public static final SubEvent aT;
        public static final SubEvent aU;
        public static final SubEvent aV;
        public static final SubEvent aW;
        public static final SubEvent aX;
        public static final SubEvent aY;
        public static final SubEvent aZ;
        public static final SubEvent aa;
        public static final SubEvent ab;
        public static final SubEvent ac;
        public static final SubEvent ad;
        public static final SubEvent ae;
        public static final SubEvent af;
        public static final SubEvent ag;
        public static final SubEvent ah;
        public static final SubEvent ai;
        public static final SubEvent aj;
        public static final SubEvent ak;
        public static final SubEvent al;
        public static final SubEvent am;
        public static final SubEvent an;
        public static final SubEvent ao;
        public static final SubEvent ap;
        public static final SubEvent aq;
        public static final SubEvent ar;
        public static final SubEvent as;
        public static final SubEvent at;
        public static final SubEvent au;
        public static final SubEvent av;
        public static final SubEvent aw;
        public static final SubEvent ax;
        public static final SubEvent ay;
        public static final SubEvent az;
        public static final SubEvent b;
        public static final SubEvent bA;
        public static final SubEvent bB;
        public static final SubEvent bC;
        public static final SubEvent bD;
        public static final SubEvent bE;
        public static final SubEvent bF;
        public static final SubEvent bG;
        public static final SubEvent bH;
        public static final SubEvent bI;
        public static final SubEvent bJ;
        public static final SubEvent bK;
        public static final SubEvent bL;
        public static final SubEvent bM;
        public static final SubEvent bN;
        public static final SubEvent bO;
        public static final SubEvent bP;
        public static final SubEvent bQ;
        public static final SubEvent bR;
        public static final SubEvent bS;
        public static final SubEvent bT;
        public static final SubEvent bU;
        public static final SubEvent bV;
        public static final SubEvent bW;
        public static final SubEvent bX;
        public static final SubEvent bY;
        public static final SubEvent bZ;
        public static final SubEvent ba;
        public static final SubEvent bb;
        public static final SubEvent bc;
        public static final SubEvent bd;
        public static final SubEvent be;
        public static final SubEvent bf;
        public static final SubEvent bg;
        public static final SubEvent bh;
        public static final SubEvent bi;
        public static final SubEvent bj;
        public static final SubEvent bk;
        public static final SubEvent bl;
        public static final SubEvent bm;
        public static final SubEvent bn;
        public static final SubEvent bo;
        public static final SubEvent bp;
        public static final SubEvent bq;
        public static final SubEvent br;
        public static final SubEvent bs;
        public static final SubEvent bt;
        public static final SubEvent bu;
        public static final SubEvent bv;
        public static final SubEvent bw;
        public static final SubEvent bx;
        public static final SubEvent by;
        public static final SubEvent bz;
        public static final SubEvent c;
        public static final SubEvent cA;
        public static final SubEvent cB;
        public static final SubEvent cC;
        public static final SubEvent cD;
        public static final SubEvent cE;
        public static final SubEvent cF;
        public static final SubEvent cG;
        public static final SubEvent cH;
        public static final SubEvent cI;
        public static final SubEvent cJ;
        public static final SubEvent cK;
        public static final SubEvent cL;
        public static final SubEvent cM;
        public static final SubEvent cN;
        public static final SubEvent cO;
        public static final SubEvent cP;
        public static final SubEvent cQ;
        public static final SubEvent cR;
        public static final SubEvent cS;
        public static final SubEvent cT;
        public static final SubEvent cU;
        public static final SubEvent cV;
        public static final SubEvent cW;
        public static final SubEvent cX;
        public static final SubEvent cY;
        public static final SubEvent cZ;
        public static final SubEvent ca;
        public static final SubEvent cb;
        public static final SubEvent cc;
        public static final SubEvent cd;
        public static final SubEvent ce;
        public static final SubEvent cf;
        public static final SubEvent cg;
        public static final SubEvent ch;
        public static final SubEvent ci;
        public static final SubEvent cj;
        public static final SubEvent ck;
        public static final SubEvent cl;
        public static final SubEvent cm;
        public static final SubEvent cn;
        public static final SubEvent co;
        public static final SubEvent cp;
        public static final SubEvent cq;
        public static final SubEvent cr;
        public static final SubEvent cs;
        public static final SubEvent ct;
        public static final SubEvent cu;
        public static final SubEvent cv;
        public static final SubEvent cw;
        public static final SubEvent cx;
        public static final SubEvent cy;
        public static final SubEvent cz;
        public static final SubEvent d;
        public static final SubEvent dA;
        public static final SubEvent dB;
        public static final SubEvent dC;
        public static final SubEvent dD;
        public static final SubEvent dE;
        public static final SubEvent dF;
        public static final SubEvent dG;
        public static final SubEvent dH;
        public static final SubEvent dI;
        public static final SubEvent dJ;
        public static final SubEvent dK;
        public static final SubEvent dL;
        public static final SubEvent dM;
        public static final SubEvent dN;
        public static final SubEvent dO;
        public static final SubEvent dP;
        public static final SubEvent dQ;
        private static SubEvent dR;
        private static SubEvent dS;
        private static SubEvent dT;
        private static SubEvent dU;
        private static SubEvent dV;
        private static SubEvent dW;
        private static SubEvent dX;
        private static SubEvent dY;
        private static SubEvent dZ;
        public static final SubEvent da;
        public static final SubEvent db;
        public static final SubEvent dc;
        public static final SubEvent dd;
        public static final SubEvent de;
        public static final SubEvent df;
        public static final SubEvent dg;
        public static final SubEvent dh;
        public static final SubEvent di;
        public static final SubEvent dj;
        public static final SubEvent dk;
        public static final SubEvent dl;
        public static final SubEvent dm;
        public static final SubEvent dn;
        public static final SubEvent _flddo;
        public static final SubEvent dp;
        public static final SubEvent dq;
        public static final SubEvent dr;
        public static final SubEvent ds;
        public static final SubEvent dt;
        public static final SubEvent du;
        public static final SubEvent dv;
        public static final SubEvent dw;
        public static final SubEvent dx;
        public static final SubEvent dy;
        public static final SubEvent dz;
        public static final SubEvent e;
        private static SubEvent eA;
        private static SubEvent eB;
        private static SubEvent eC;
        private static SubEvent eD;
        private static SubEvent eE;
        private static SubEvent eF;
        private static SubEvent eG;
        private static SubEvent eH;
        private static SubEvent eI;
        private static SubEvent eJ;
        private static SubEvent eK;
        private static final SubEvent eL[];
        private static SubEvent ea;
        private static SubEvent eb;
        private static SubEvent ec;
        private static SubEvent ed;
        private static SubEvent ee;
        private static SubEvent ef;
        private static SubEvent eg;
        private static SubEvent eh;
        private static SubEvent ei;
        private static SubEvent ej;
        private static SubEvent ek;
        private static SubEvent el;
        private static SubEvent em;
        private static SubEvent en;
        private static SubEvent eo;
        private static SubEvent ep;
        private static SubEvent eq;
        private static SubEvent er;
        private static SubEvent es;
        private static SubEvent et;
        private static SubEvent eu;
        private static SubEvent ev;
        private static SubEvent ew;
        private static SubEvent ex;
        private static SubEvent ey;
        private static SubEvent ez;
        public static final SubEvent f;
        public static final SubEvent g;
        public static final SubEvent h;
        public static final SubEvent i;
        public static final SubEvent j;
        public static final SubEvent k;
        public static final SubEvent l;
        public static final SubEvent m;
        public static final SubEvent n;
        public static final SubEvent o;
        public static final SubEvent p;
        public static final SubEvent q;
        public static final SubEvent r;
        public static final SubEvent s;
        public static final SubEvent t;
        public static final SubEvent u;
        public static final SubEvent v;
        public static final SubEvent w;
        public static final SubEvent x;
        public static final SubEvent y;
        public static final SubEvent z;
        private final String mEvent;

        public static SubEvent valueOf(String s1)
        {
            return (SubEvent)Enum.valueOf(com/spotify/mobile/android/util/ClientEvent$SubEvent, s1);
        }

        public static SubEvent[] values()
        {
            return (SubEvent[])eL.clone();
        }

        public final String toString()
        {
            return mEvent;
        }

        static 
        {
            a = new SubEvent("NONE", 0, "");
            b = new SubEvent("SETTINGS_PATH", 1, "settings-path");
            c = new SubEvent("SETTINGS_DELETE_CACHE", 2, "delete-cache");
            d = new SubEvent("UNKNOWN", 3, "unknown");
            e = new SubEvent("PREMIUM_ONLY", 4, "premium_only");
            f = new SubEvent("NEED_ONLINE_NO_CONNECTION", 5, "need_online_no_connection");
            g = new SubEvent("NEED_ONLINE_IN_OFFLINE_MODE", 6, "need_online_in_offline_mode");
            h = new SubEvent("UNAVAILABLE", 7, "unavailable");
            i = new SubEvent("NOT_IN_REGION_IS_OFFLINE", 8, "not_in_region_is_offline");
            j = new SubEvent("UNAVAILABLE_IS_OFFLINE", 9, "unavailable_is_offline");
            k = new SubEvent("LOCAL_TRACK_UNSYNCED", 10, "local_track_unsynced");
            l = new SubEvent("COMMERCIAL_IS_PLAYING", 11, "commercial_is_playing");
            m = new SubEvent("UNABLE_TO_START_RADIO", 12, "unable_to_start_radio");
            n = new SubEvent("PLAYBACK_ERROR_CAPPING_REACHED", 13, "playback_error_alert_capping_reached");
            o = new SubEvent("SHUFFLE_NO_SKIPS_REMAINING", 14, "shuffle_no_skips_remaining");
            p = new SubEvent("SHUFFLE_PREMIUM_ONLY", 15, "shuffle_premium_only");
            q = new SubEvent("SHUFFLE_PREMIUM_ONLY_IS_OFFLINE", 16, "shuffle_premium_only_is_offline");
            r = new SubEvent("NOT_IN_REGION", 17, "not_in_region");
            s = new SubEvent("BANNED_BY_ARTIST", 18, "banned_by_artist");
            t = new SubEvent("CONTENT_NOT_SUPPORTED", 19, "content_not_supported");
            u = new SubEvent("VIDEO_MANIFEST", 20, "video_manifest");
            v = new SubEvent("VIDEO_MANIFEST_DELETED", 21, "video_manifest_deleted");
            w = new SubEvent("VIDEO_GEORESTRICTED", 22, "video_georestricted");
            x = new SubEvent("VIDEO_UNSUPPORTED_PLATFORM_VERSION", 23, "video_unsupported_platform");
            y = new SubEvent("VIDEO_UNSUPPORTED_CLIENT_VERSION", 24, "video_unsupported_client");
            dR = new SubEvent("SWITCHING_USER", 25, "switching_user");
            dS = new SubEvent("USER_CANCELLED_FACEBOOK_LOGIN", 26, "user_cancelled_facebook_login");
            dT = new SubEvent("FACEBOOK_ERROR", 27, "facebook_error");
            z = new SubEvent("SOCIAL_ERROR_TOKEN_EXPIRED", 28, "social_error_token_expired");
            A = new SubEvent("USER_ACTION", 29, "user_action");
            dU = new SubEvent("USER_PRESSED_BACK", 30, "user_pressed_back");
            B = new SubEvent("USER_DECLINED_TOS", 31, "user_declined_tos");
            C = new SubEvent("USER_ACCEPTED_TOS", 32, "user_accepted_tos");
            D = new SubEvent("USER_POSTPONED_TOS", 33, "user_postponed_tos");
            E = new SubEvent("CONTEXT_MENU", 34, "context-menu");
            F = new SubEvent("OPTIONS_MENU", 35, "options-menu");
            G = new SubEvent("ACTION_BAR", 36, "action-bar");
            dV = new SubEvent("PREVIEW_BUTTON", 37, "preview_button");
            dW = new SubEvent("LINK", 38, "link");
            H = new SubEvent("SEARCH_INTENT", 39, "search_intent");
            dX = new SubEvent("PAGE_LOAD_TIMER", 40, "page_load_timer");
            I = new SubEvent("OVERVIEW_CELL", 41, "overview_cell");
            dY = new SubEvent("CATEGORY_CELL", 42, "category_cell");
            J = new SubEvent("ALBUM_CELL", 43, "album_cell");
            dZ = new SubEvent("ARTIST_CELL", 44, "artist_cell");
            K = new SubEvent("PLAYLIST_CELL", 45, "playlist_cell");
            L = new SubEvent("RECENTLY_PLAYED", 46, "recently_played");
            M = new SubEvent("FEATURED_PLAYLISTS", 47, "featured_playlists");
            N = new SubEvent("PLAY_BUTTON", 48, "play_button");
            O = new SubEvent("ADD_TO_COLLECTION", 49, "add-to-collection");
            P = new SubEvent("ADD_DUPLICATES", 50, "add-duplicates");
            Q = new SubEvent("SKIP_DUPLICATES", 51, "skip-duplicates");
            R = new SubEvent("COMPLETE_COLLECTION", 52, "complete-collection");
            S = new SubEvent("REMOVE_FROM_COLLECTION", 53, "remove-from-collection");
            T = new SubEvent("INSUFFICIENT_STORAGE_IN_COLLECTION", 54, "insufficient-storage-in-collection");
            ea = new SubEvent("PLAY_BUTTON_LARGE", 55, "play_button_large");
            U = new SubEvent("SHUFFLE_BUTTON", 56, "shuffle_button");
            eb = new SubEvent("REPEAT_BUTTON", 57, "repeat_button");
            V = new SubEvent("STORY", 58, "story");
            ec = new SubEvent("LOAD_FAIL", 59, "load_fail");
            ed = new SubEvent("GET_PREMIUM", 60, "get_premium");
            ee = new SubEvent("GET_PLUS", 61, "get_plus");
            W = new SubEvent("START_TRIAL", 62, "start_trial");
            X = new SubEvent("SHUFFLE_PLAY", 63, "shuffle_play");
            Y = new SubEvent("CLOSE", 64, "close");
            Z = new SubEvent("CANCEL", 65, "cancel");
            ef = new SubEvent("LOGIN", 66, "login");
            aa = new SubEvent("RATE_APP", 67, "rate_app");
            ab = new SubEvent("PLAY_PAUSE", 68, "play_pause");
            ac = new SubEvent("NEXT_BUTTON", 69, "next_button");
            eg = new SubEvent("PREVIOUS_BUTTON", 70, "previous_button");
            ad = new SubEvent("DEVICE", 71, "device");
            eh = new SubEvent("CONNECT_BUTTON", 72, "connect-button");
            ae = new SubEvent("CONTINUE", 73, "continue");
            af = new SubEvent("PLAY_HERE", 74, "play-here");
            ag = new SubEvent("SELF_DISMISSAL", 75, "self-dismissal");
            ei = new SubEvent("PLAY_NOW", 76, "play-now");
            ej = new SubEvent("NOT_NOW", 77, "not-now");
            ah = new SubEvent("TRACK", 78, "track");
            ai = new SubEvent("INERT_TRACK", 79, "inert_track");
            aj = new SubEvent("SHOW", 80, "show");
            ak = new SubEvent("EPISODE", 81, "episode");
            al = new SubEvent("VOLUME_CHANGED", 82, "volume-changed");
            am = new SubEvent("PICKER_OPENED_NPB", 83, "picker-opened-NPB");
            an = new SubEvent("PICKER_OPENED_NPV", 84, "picker-opened-NPV");
            ao = new SubEvent("PICKER_OPENED_SETTINGS", 85, "picker-opened-settings");
            ap = new SubEvent("PICKER_OPENED_ONBOARDING_FLOW_A", 86, "picker-opened-onboarding-flow-A");
            aq = new SubEvent("PICKER_OPENED_ONBOARDING_FLOW_B", 87, "picker-opened-onboarding-flow-B");
            ar = new SubEvent("BROWSE_ARTIST", 88, "browse-artist");
            as = new SubEvent("ALBUM", 89, "album");
            at = new SubEvent("ARTIST", 90, "artist");
            au = new SubEvent("PLAYLIST", 91, "playlist");
            ek = new SubEvent("VIEW_ALL", 92, "view-all");
            el = new SubEvent("SHOW_ALL", 93, "see_all");
            av = new SubEvent("CREATE_PLAYLIST", 94, "create-playlist");
            aw = new SubEvent("RENAME_PLAYLIST", 95, "rename-playlist");
            ax = new SubEvent("FILTERING", 96, "filtering");
            ay = new SubEvent("FILTERING_CLEAR", 97, "filtering-clear");
            az = new SubEvent("SORT_SET", 98, "sort-set");
            aA = new SubEvent("SHOW_SORT", 99, "show-sort");
            aB = new SubEvent("UI_FOREGROUNDED", 100, "ui_foregrounded");
            aC = new SubEvent("UI_BACKGROUNDED", 101, "ui_backgrounded");
            aD = new SubEvent("AD_SKIP_ATTEMPTED", 102, "ad_skip_attempted");
            aE = new SubEvent("SEARCH_HISTORY_ITEM", 103, "historyItem");
            aF = new SubEvent("SEARCH_HISTORY_ITEM_REMOVED", 104, "historyItemRemoved");
            aG = new SubEvent("SEARCH_HISTORY_CLEAR", 105, "clearHistory");
            aH = new SubEvent("SEARCH_GO_ONLINE", 106, "goOnline");
            aI = new SubEvent("SEARCH_RETRY", 107, "retrySearch");
            em = new SubEvent("UNINSTALL_DIALOG_SHOWN", 108, "uninstall-dialog-shown");
            en = new SubEvent("UNINSTALL_RELEASE_VERSION_DIALOG_SHOWN", 109, "uninstall-release-version-dialog-shown");
            eo = new SubEvent("UNINSTALL_LATER", 110, "uninstall-later");
            ep = new SubEvent("RELEASE_VERSION_UNINSTALL", 111, "release-version-uninstall");
            eq = new SubEvent("UNINSTALL_RELEASE_VERSION_LATER", 112, "uninstall-release-version-later");
            aJ = new SubEvent("LINK_PROCESSED", 113, "link-processed");
            aK = new SubEvent("START_PLAYING", 114, "start-playing");
            aL = new SubEvent("SIGNED_IN", 115, "signed-in");
            aM = new SubEvent("SIGNED_UP", 116, "signed-up");
            er = new SubEvent("UNEXPECTED_SERVICE_CRASH", 117, "unexpected-service-crash");
            es = new SubEvent("SERVICE_RECONNECTED_FROM_CRASH", 118, "service-reconnected-from-crash");
            et = new SubEvent("TOP_HITS", 119, "topHits");
            aN = new SubEvent("ARTISTS", 120, "artists");
            aO = new SubEvent("ALBUMS", 121, "albums");
            aP = new SubEvent("PLAYLISTS", 122, "playlists");
            aQ = new SubEvent("STATIONS", 123, "stations");
            aR = new SubEvent("SHOWS", 124, "shows");
            aS = new SubEvent("SHOWS_UNPLAYED", 125, "shows-unplayed");
            aT = new SubEvent("SHOWS_OFFFLINED", 126, "shows-offlined");
            eu = new SubEvent("PROFILES", 127, "profiles");
            ev = new SubEvent("GENRES", 128, "genres");
            ew = new SubEvent("SUGGESTIONS", 129, "suggestions");
            aU = new SubEvent("TRACKS", 130, "tracks");
            ex = new SubEvent("TRACKS_OTHER", 131, "soundalikeTracks");
            aV = new SubEvent("SEARCH_RESULT", 132, "searchResult");
            aW = new SubEvent("OPEN_ACCESS_ARTIST", 133, "open_access_artist");
            aX = new SubEvent("OPEN_ACCESS_ALBUM", 134, "open_access_album");
            aY = new SubEvent("WELCOME", 135, "welcome-screen");
            aZ = new SubEvent("TINKERBELL_ACTION", 136, "action");
            ba = new SubEvent("TINKERBELL_DISMISS", 137, "dismiss");
            bb = new SubEvent("TINKERBELL_CLOSE", 138, "close");
            ey = new SubEvent("TINKERBELL_ACTION_BUTTON", 139, "action-button");
            bc = new SubEvent("ARTIST_RELATED_ARTISTS", 140, "related-artist");
            bd = new SubEvent("ARTIST_BIOGRAPHY", 141, "biography");
            be = new SubEvent("ARTIST_CONCERT", 142, "concert");
            bf = new SubEvent("ARTIST_MERCH_ITEM", 143, "merch-item");
            ez = new SubEvent("ARTIST_RELEASE", 144, "release");
            bg = new SubEvent("CHARTS_CHARTS_BLOCK", 145, "charts-block");
            bh = new SubEvent("CHARTS_CHARTS_OVERVIEW", 146, "charts-overview");
            bi = new SubEvent("CHARTS_CHART", 147, "chart");
            bj = new SubEvent("CHARTS_ITEM_CARD", 148, "item-card");
            bk = new SubEvent("CHARTS_ITEM_TEXT", 149, "item-text");
            bl = new SubEvent("SETTING_ACCESS_POINT", 150, "ap");
            bm = new SubEvent("SETTING_BROADCAST_PLAY_STATE", 151, "broadcast_play_state");
            bn = new SubEvent("SETTING_DOWNLOAD_OVER_3G", 152, "download_over_3g");
            bo = new SubEvent("SETTING_DOWNLOAD_QUALITY", 153, "download_quality");
            bp = new SubEvent("SETTING_CONNECTED_TO_FACEBOOK", 154, "facebook_connected");
            bq = new SubEvent("SETTING_CROSSFADE", 155, "crossfade");
            br = new SubEvent("SETTING_NORMALIZE", 156, "normalize");
            bs = new SubEvent("SETTING_CROSSFADE_DURATION", 157, "crossfade-duration");
            bt = new SubEvent("SETTING_GAPLESS", 158, "gapless");
            bu = new SubEvent("SHOW_UNAVAILABLE_TRACKS", 159, "show_unavailable_tracks");
            bv = new SubEvent("SETTING_LASTFM_USERNAME", 160, "lastfm_username");
            bw = new SubEvent("SETTING_LASTFM_PASSWORD", 161, "lastfm_password");
            bx = new SubEvent("SETTING_OFFLINE_MODE", 162, "offline-mode");
            by = new SubEvent("SETTING_PRIVATE_SESSION", 163, "private_session");
            bz = new SubEvent("SETTING_SCROBBLE_TO_FACEBOOK", 164, "facebook-scrobbling");
            bA = new SubEvent("SETTING_SECONDS_TO_OFFLINE_EXPIRY", 165, "seconds_to_offline_expiry");
            bB = new SubEvent("SETTING_STREAM_QUALITY", 166, "stream_quality");
            bC = new SubEvent("SETTING_MARKETING_OPT_IN", 167, "marketing_opt_in");
            bD = new SubEvent("SETTING_SUPPORT", 168, "support");
            bE = new SubEvent("SETTING_TERMS_AND_CONDITIONS", 169, "terms_and_conditions");
            bF = new SubEvent("SETTING_PRIVACY_POLICY", 170, "privacy_policy");
            bG = new SubEvent("SETTING_NIELSEN_OCR", 171, "nielsen_ocr");
            bH = new SubEvent("AUTO_FOLLOWING", 172, "auto-following");
            bI = new SubEvent("FOLLOWING", 173, "following");
            bJ = new SubEvent("UNFOLLOWING", 174, "unfollowing");
            bK = new SubEvent("SHOW_ONLY_OFFLINED_CONTENT", 175, "show-only-offlined-content");
            bL = new SubEvent("SHOW_ALL_CONTENT", 176, "show-all-content");
            bM = new SubEvent("HIDE_INCOMPLETE_ALBUMS", 177, "hide-incomplete-albums");
            bN = new SubEvent("SHOW_INCOMPLETE_ALBUMS", 178, "show-incomplete-albums");
            bO = new SubEvent("GO_TO_FOLLOW_BUTTON", 179, "go_to_follow_button");
            bP = new SubEvent("PULL_TO_REFRESH", 180, "pull_to_refresh");
            bQ = new SubEvent("LOADED_ACTIVITIES", 181, "loaded_activities");
            bR = new SubEvent("LOADED_OLDER_ACTIVITIES", 182, "loaded_older_activities");
            bS = new SubEvent("VIEW_ACTIVITY", 183, "view_activity");
            bT = new SubEvent("USER_LINK", 184, "user_link");
            bU = new SubEvent("ITEM_SECTION_LINK", 185, "item_section_link");
            bV = new SubEvent("REPLAYS_LINK", 186, "replays_link");
            bW = new SubEvent("TEMP_AUTOMOTIVE", 187, "temp-automotive");
            eA = new SubEvent("CONTEXT_RECOGNITION_LOCATION", 188, "location");
            eB = new SubEvent("CONTEXT_RECOGNITION_ACTIVITY", 189, "activity");
            bX = new SubEvent("CONTEXT_RECOGNITION_TIMEZONE", 190, "timezone_info");
            bY = new SubEvent("TIME_FROM_RESPONSE_TO_RENDER", 191, "time_from_response_to_render");
            bZ = new SubEvent("TIME_FROM_REQUEST_TO_RENDER", 192, "time_from_request_to_render");
            ca = new SubEvent("SOCIAL_CHART_SCREEN", 193, "chart-screen");
            cb = new SubEvent("SOCIAL_CHART_NUX_SCREEN", 194, "nux-screen");
            cc = new SubEvent("SOCIAL_CHART_USER", 195, "user");
            cd = new SubEvent("SEE_LISTENERS", 196, "see-listeners");
            ce = new SubEvent("FINDFRIENDS", 197, "find_friends");
            cf = new SubEvent("FINDFRIENDS_FRIEND_TAB", 198, "friend_tab");
            cg = new SubEvent("FINDFRIENDS_FEATURED_TAB", 199, "featured_tab");
            ch = new SubEvent("FINDFRIENDS_ADD", 200, "add-button");
            ci = new SubEvent("FINDFRIENDS_REMOVE", 201, "remove-button");
            cj = new SubEvent("FINDFRIENDS_FOLLOW_ALL", 202, "follow_all_button");
            ck = new SubEvent("FINDFRIENDS_FOLLOW_ALL_CONFIRM", 203, "follow_all_confirm");
            cl = new SubEvent("FINDFRIENDS_FOLLOW_ALL_CANCEL", 204, "follow_all_cancel");
            eC = new SubEvent("FINDFRIENDS_USERNAME_CLICK", 205, "user_name");
            eD = new SubEvent("FINDFRIENDS_USERIMAGE_CLICK", 206, "user_image");
            cm = new SubEvent("FINDFRIENDS_CONNECT_FB", 207, "connect_to_facebook");
            cn = new SubEvent("FINDFRIENDS_TIME_TO_LOAD", 208, "time_to_load");
            co = new SubEvent("FINDFRIENDS_FRIENDS_TAB_FAILED", 209, "friends_tab_failed");
            cp = new SubEvent("FINDFRIENDS_SEARCH", 210, "search_field_input");
            cq = new SubEvent("FINDFRIENDS_EXIT", 211, "exit");
            eE = new SubEvent("FINDFRIENDS_DONE", 212, "done_button");
            cr = new SubEvent("ANNOTATE_SAVE", 213, "save");
            cs = new SubEvent("ANNOTATE_GALLERY", 214, "gallery");
            ct = new SubEvent("ANNOTATE_CAMERA", 215, "camera");
            cu = new SubEvent("ANNOTATE_REMOVE", 216, "remove");
            cv = new SubEvent("ANNOTATE_MORE_OPTIONS", 217, "more_options");
            cw = new SubEvent("SHARE", 218, "share");
            cx = new SubEvent("SHARE_BUTTON_BACK", 219, "back_button");
            cy = new SubEvent("SHARE_BUTTON_CLIPBOARD", 220, "pasteboard_button");
            cz = new SubEvent("SHARE_BUTTON_EMAIL", 221, "email_button");
            cA = new SubEvent("SHARE_BUTTON_FACEBOOK", 222, "facebook_button");
            cB = new SubEvent("SHARE_BUTTON_OTHER", 223, "other_button");
            cC = new SubEvent("SHARE_BUTTON_POST_TO", 224, "post_to_button");
            cD = new SubEvent("SHARE_BUTTON_SEND_TO", 225, "sent_to_button");
            cE = new SubEvent("SHARE_BUTTON_MMS", 226, "mms_button");
            cF = new SubEvent("SHARE_BUTTON_MORE", 227, "more_button");
            cG = new SubEvent("SHARE_BUTTON_SMS", 228, "sms_button");
            cH = new SubEvent("SHARE_BUTTON_TUMBLR", 229, "tumblr_button");
            cI = new SubEvent("SHARE_BUTTON_TWITTER", 230, "twitter_button");
            cJ = new SubEvent("SHARE_BUTTON_WHATSAPP", 231, "whatsapp_button");
            cK = new SubEvent("SHARE_CANCEL", 232, "cancel");
            cL = new SubEvent("SHARE_COPY_SONG_LINK", 233, "copy_song_link");
            cM = new SubEvent("SHARE_EMAIL", 234, "email");
            cN = new SubEvent("SHARE_POST_TO", 235, "post_to");
            cO = new SubEvent("SHARE_SEND_TO", 236, "send_to");
            cP = new SubEvent("SHARE_SELECT_RECIPIENTS", 237, "select_recipients");
            cQ = new SubEvent("SHARE_SMS", 238, "sms");
            cR = new SubEvent("SHARE_NETWORK_TOGGLE", 239, "network_toggle");
            cS = new SubEvent("PREROLL", 240, "preroll");
            cT = new SubEvent("STREAM", 241, "stream");
            cU = new SubEvent("WATCHNOW", 242, "watchnow");
            eF = new SubEvent("WATCHNOW_VIDEO", 243, "watchnow-video");
            eG = new SubEvent("WATCHNOW_AUDIO", 244, "watchnow-audio");
            cV = new SubEvent("FORMAT_AUDIO", 245, "format-audio");
            cW = new SubEvent("FORMAT_VIDEO", 246, "format-video");
            cX = new SubEvent("FORMAT_BANNER", 247, "format-banner");
            eH = new SubEvent("STREAM_AUDIO", 248, "stream-audio");
            eI = new SubEvent("PREROLL_AUDIO", 249, "preroll-audio");
            cY = new SubEvent("PREROLL_ENABLED", 250, "preroll-enabled");
            cZ = new SubEvent("PREROLL_DISABLED", 251, "preroll-disabled");
            da = new SubEvent("MIDROLL_ENABLED", 252, "midroll-enabled");
            db = new SubEvent("MIDROLL_DISABLED", 253, "midroll-disabled");
            dc = new SubEvent("MOBILE_SCREENSAVER", 254, "mobile-screensaver");
            dd = new SubEvent("BARTENDER_REQUEST", 255, "bartender-request");
            de = new SubEvent("SERVICE_PAUSED_WAITING_FOR_SHUTDOWN", 256, "paused-waiting-for-shutdown");
            df = new SubEvent("SERVICE_RESUMED", 257, "service-resumed");
            dg = new SubEvent("SHUTTING_DOWN_CORE", 258, "shutting-down-core");
            dh = new SubEvent("STARTING_CORE", 259, "starting-core");
            di = new SubEvent("LOCAL_PLAYBACK_STARTED", 260, "local-playback-started");
            dj = new SubEvent("LOCAL_PLAYBACK_STOPPED", 261, "local-playback-stopped");
            dk = new SubEvent("DOCKED", 262, "docked");
            dl = new SubEvent("NOT_DOCKED", 263, "not-docked");
            dm = new SubEvent("SYNCING", 264, "syncing");
            dn = new SubEvent("NOT_SYNCING", 265, "not-syncing");
            _flddo = new SubEvent("CAR_CONNECTED", 266, "car-connected");
            dp = new SubEvent("CAR_DISCONNECTED", 267, "car-disconnected");
            dq = new SubEvent("DOWNLOAD", 268, "download");
            dr = new SubEvent("MARK_AS_PLAYED", 269, "mark-as-played");
            ds = new SubEvent("REMOVE_ALL", 270, "remove-all");
            dt = new SubEvent("REMOVE_PLAYED", 271, "removed-played");
            du = new SubEvent("EDIT_MODE", 272, "edit-mode");
            eJ = new SubEvent("CONSUMABLE_CONFIRM", 273, "consumable-confirm");
            eK = new SubEvent("MATCHED", 274, "matched");
            dv = new SubEvent("NO_MATCH", 275, "no-match");
            dw = new SubEvent("RUNNING_CHOOSE_PLAYLIST", 276, "choose_playlist");
            dx = new SubEvent("RUNNING_START_PLAYING", 277, "start_playing");
            dy = new SubEvent("RUNNING_STEP_CHANGE", 278, "step_change");
            dz = new SubEvent("RUNNING_CHANGED_MANUAL_TEMPO", 279, "changed_manual_tempo");
            dA = new SubEvent("ARTIST_FEEDBACK_CHANNEL_VIEW", 280, "artist-feedback-channel-view");
            dB = new SubEvent("ARTIST_FEEDBACK_CHANNEL_SHARE", 281, "artist-feedback-channel-share");
            dC = new SubEvent("ARTIST_FEEDBACK_CHANNEL_CANCEL", 282, "artist-feedback-channel-cancel");
            dD = new SubEvent("CREATOR_EXTERNAL_LINK", 283, "creator-external-link");
            dE = new SubEvent("EVENTS_LIST", 284, "list");
            dF = new SubEvent("EVENTS_EVENT", 285, "event");
            dG = new SubEvent("NO_LOCATION_SELECTED", 286, "no-location-selected");
            dH = new SubEvent("LOCATION_SELECTED", 287, "location-selected");
            dI = new SubEvent("DYNAMIC_UPSELL_SHOW_PLUS", 288, "dynamic-upsell-not-shown-show-plus");
            dJ = new SubEvent("DYNAMIC_UPSELL_SHOW_CONSUMABLE", 289, "dynamic-upsell-not-shown-show-consumable");
            dK = new SubEvent("DYNAMIC_UPSELL_WRONG_CONFIG_TYPE", 290, "dynamic-upsell-not-shown-wrong-config-type");
            dL = new SubEvent("DYNAMIC_UPSELL_NO_CONFIG_FOR_REASON", 291, "dynamic-upsell-not-shown-no-config-for-reason");
            dM = new SubEvent("DYNAMIC_UPSELL_NO_CONFIG_LOADED", 292, "dynamic-upsell-not-shown-no-config-loaded");
            dN = new SubEvent("NOW_PLAYING_BAR", 293, "now-playing-bar");
            dO = new SubEvent("OPERATOR_ACTIVATION_SUCCESS", 294, "operator-activation-successful");
            dP = new SubEvent("OPERATOR_ACTIVATION_FAILURE", 295, "operator-activation-failed");
            dQ = new SubEvent("ACTIVATE_OPT_IN_TRIAL_IN_BACKGROUND", 296, "activate-trial-in-background");
            eL = (new SubEvent[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r, s, t, 
                u, v, w, x, y, dR, dS, dT, z, A, 
                dU, B, C, D, E, F, G, dV, dW, H, 
                dX, I, dY, J, dZ, K, L, M, N, O, 
                P, Q, R, S, T, ea, U, eb, V, ec, 
                ed, ee, W, X, Y, Z, ef, aa, ab, ac, 
                eg, ad, eh, ae, af, ag, ei, ej, ah, ai, 
                aj, ak, al, am, an, ao, ap, aq, ar, as, 
                at, au, ek, el, av, aw, ax, ay, az, aA, 
                aB, aC, aD, aE, aF, aG, aH, aI, em, en, 
                eo, ep, eq, aJ, aK, aL, aM, er, es, et, 
                aN, aO, aP, aQ, aR, aS, aT, eu, ev, ew, 
                aU, ex, aV, aW, aX, aY, aZ, ba, bb, ey, 
                bc, bd, be, bf, ez, bg, bh, bi, bj, bk, 
                bl, bm, bn, bo, bp, bq, br, bs, bt, bu, 
                bv, bw, bx, by, bz, bA, bB, bC, bD, bE, 
                bF, bG, bH, bI, bJ, bK, bL, bM, bN, bO, 
                bP, bQ, bR, bS, bT, bU, bV, bW, eA, eB, 
                bX, bY, bZ, ca, cb, cc, cd, ce, cf, cg, 
                ch, ci, cj, ck, cl, eC, eD, cm, cn, co, 
                cp, cq, eE, cr, cs, ct, cu, cv, cw, cx, 
                cy, cz, cA, cB, cC, cD, cE, cF, cG, cH, 
                cI, cJ, cK, cL, cM, cN, cO, cP, cQ, cR, 
                cS, cT, cU, eF, eG, cV, cW, cX, eH, eI, 
                cY, cZ, da, db, dc, dd, de, df, dg, dh, 
                di, dj, dk, dl, dm, dn, _flddo, dp, dq, dr, 
                ds, dt, du, eJ, eK, dv, dw, dx, dy, dz, 
                dA, dB, dC, dD, dE, dF, dG, dH, dI, dJ, 
                dK, dL, dM, dN, dO, dP, dQ
            });
        }

        private SubEvent(String s1, int i1, String s2)
        {
            super(s1, i1);
            mEvent = s2;
        }
    }


    private class Event extends Enum
    {

        public static final Event A;
        public static final Event B;
        public static final Event C;
        public static final Event D;
        public static final Event E;
        public static final Event F;
        public static final Event G;
        public static final Event H;
        public static final Event I;
        public static final Event J;
        public static final Event K;
        public static final Event L;
        public static final Event M;
        public static final Event N;
        public static final Event O;
        public static final Event P;
        public static final Event Q;
        public static final Event R;
        public static final Event S;
        public static final Event T;
        public static final Event U;
        public static final Event V;
        public static final Event W;
        public static final Event X;
        public static final Event Y;
        public static final Event Z;
        public static final Event a;
        public static final Event aA;
        public static final Event aB;
        public static final Event aC;
        public static final Event aD;
        public static final Event aE;
        public static final Event aF;
        public static final Event aG;
        public static final Event aH;
        public static final Event aI;
        public static final Event aJ;
        private static Event aK;
        private static Event aL;
        private static Event aM;
        private static Event aN;
        private static Event aO;
        private static Event aP;
        private static Event aQ;
        private static Event aR;
        private static Event aS;
        private static Event aT;
        private static Event aU;
        private static Event aV;
        private static Event aW;
        private static Event aX;
        private static Event aY;
        private static Event aZ;
        public static final Event aa;
        public static final Event ab;
        public static final Event ac;
        public static final Event ad;
        public static final Event ae;
        public static final Event af;
        public static final Event ag;
        public static final Event ah;
        public static final Event ai;
        public static final Event aj;
        public static final Event ak;
        public static final Event al;
        public static final Event am;
        public static final Event an;
        public static final Event ao;
        public static final Event ap;
        public static final Event aq;
        public static final Event ar;
        public static final Event as;
        public static final Event at;
        public static final Event au;
        public static final Event av;
        public static final Event aw;
        public static final Event ax;
        public static final Event ay;
        public static final Event az;
        public static final Event b;
        private static Event ba;
        private static Event bb;
        private static final Event bc[];
        public static final Event c;
        public static final Event d;
        public static final Event e;
        public static final Event f;
        public static final Event g;
        public static final Event h;
        public static final Event i;
        public static final Event j;
        public static final Event k;
        public static final Event l;
        public static final Event m;
        public static final Event n;
        public static final Event o;
        public static final Event p;
        public static final Event q;
        public static final Event r;
        public static final Event s;
        public static final Event t;
        public static final Event u;
        public static final Event v;
        public static final Event w;
        public static final Event x;
        public static final Event y;
        public static final Event z;
        private final String mEvent;

        public static Event valueOf(String s1)
        {
            return (Event)Enum.valueOf(com/spotify/mobile/android/util/ClientEvent$Event, s1);
        }

        public static Event[] values()
        {
            return (Event[])bc.clone();
        }

        public final String toString()
        {
            return mEvent;
        }

        static 
        {
            a = new Event("SETTING_CHANGED", 0, "setting-changed");
            b = new Event("PLAYBACK_ERROR", 1, "playback-error");
            c = new Event("GET_PREMIUM", 2, "get-premium");
            d = new Event("LOGGING_OUT", 3, "logging-out");
            e = new Event("SETTINGS_INFO", 4, "settings-info");
            f = new Event("PRESENTED", 5, "presented");
            g = new Event("DISMISSED", 6, "dismissed");
            h = new Event("NAVIGATE", 7, "navigate");
            aK = new Event("STAR", 8, "star");
            aL = new Event("UNSTAR", 9, "unstar");
            i = new Event("SUBSCRIBE", 10, "subscribe");
            j = new Event("DOWNLOAD", 11, "download");
            k = new Event("MOBILE_DATA_USAGE", 12, "mobile-data-usage");
            l = new Event("UNDOWNLOAD", 13, "undownload");
            m = new Event("REMOVE", 14, "remove");
            n = new Event("ADD_TO_PLAYLIST", 15, "add-to-playlist");
            o = new Event("SHARE", 16, "share");
            p = new Event("ADD_TO_QUEUE", 17, "add-to-queue");
            q = new Event("BROWSE_ALBUM", 18, "browse-album");
            r = new Event("BROWSE_ARTIST", 19, "browse-artist");
            s = new Event("BROWSE_PLAYLIST", 20, "browse-playlist");
            t = new Event("BROWSE_SHOW", 21, "browse-show");
            u = new Event("BROWSE_USER", 22, "browse-user");
            v = new Event("START_RADIO", 23, "start-radio");
            w = new Event("DELETE_STATION", 24, "delete-station");
            x = new Event("FOLLOW_STATION", 25, "follow-station");
            y = new Event("UNFOLLOW_STATION", 26, "unfollow-station");
            aM = new Event("CREATE_STATION", 27, "create-station");
            z = new Event("CREATE_PLAYLIST", 28, "create-playlist");
            A = new Event("SEARCH", 29, "search");
            B = new Event("RENAME", 30, "rename");
            C = new Event("REMOVE_FROM_QUEUE", 31, "remove-from-queue");
            aN = new Event("SET_UNSEEN", 32, "unseen");
            aO = new Event("SET_SEEN", 33, "seen");
            D = new Event("UNSET_COLLABORATIVE", 34, "unset-collaborative");
            E = new Event("SET_COLLABORATIVE", 35, "set-collaborative");
            F = new Event("UNSET_PUBLISHED", 36, "unset-published");
            G = new Event("SET_PUBLISHED", 37, "set-published");
            H = new Event("ACCEPTED", 38, "accepted");
            I = new Event("CACHE_DELETED", 39, "cache-deleted");
            J = new Event("CHOOSE_CACHE_PATH", 40, "choose-cache-path");
            K = new Event("ADD_TO_COLLECTION", 41, "add-to-collection");
            L = new Event("COMPLETE_ALBUM_IN_COLLECTION", 42, "complete-album-in-collection");
            aP = new Event("ADD_TO_COLLECTION_FROM_QUICK_ACTION", 43, "add-to-collection-from-quick-action");
            aQ = new Event("ADDED_TO_COLLECTION_FROM_QUICK_ACTION", 44, "added-to-collection-from-quick-action");
            M = new Event("REMOVE_FROM_COLLECTION", 45, "remove-from-collection");
            aR = new Event("SEARCH_HISTORY", 46, "history");
            N = new Event("ITEM_CLICK", 47, "item-click");
            aS = new Event("PLAY_INLINE", 48, "play-inline");
            O = new Event("USER_HIT", 49, "user:hit");
            aT = new Event("USER_HOLD", 50, "user:hold");
            P = new Event("INFO_TIMER", 51, "info:timer");
            Q = new Event("INFO_DEFAULT", 52, "info:default");
            R = new Event("USER_IMPRESSION", 53, "user:impression");
            S = new Event("USER_DISMISSED", 54, "user:dismissed");
            T = new Event("GCM_AVAILABILITY", 55, "gcm:availability");
            U = new Event("PUSH_NOTIFICATION_WEB", 56, "pushnotif:web");
            V = new Event("ERROR_DEFAULT", 57, "error:default");
            W = new Event("STARTUP", 58, "startup");
            aU = new Event("STARTUP_UI", 59, "startup-ui");
            aV = new Event("STARTUP_NIGHTLY_UI", 60, "startup-nightly-ui");
            aW = new Event("BROWSE_GENRE", 61, "browse-genre");
            aX = new Event("BROWSE_SUBGENRE", 62, "browse-subgenre");
            aY = new Event("USER_SWIPE", 63, "user-swipe");
            X = new Event("DEVICE_INFO", 64, "device:info");
            Y = new Event("LINK_TRACKING", 65, "link-tracking");
            Z = new Event("FILTER", 66, "filter");
            aa = new Event("SORT", 67, "filter");
            ab = new Event("SHUFFLE_PLAY", 68, "shuffle-play");
            ac = new Event("FOLLOW", 69, "follow");
            ad = new Event("UNFOLLOW", 70, "unfollow");
            ae = new Event("SIGNUP_SUCCESSFUL", 71, "signup-successful");
            af = new Event("USER_SUBMITTED_SURVEY_FORM", 72, "User submitted survey form");
            ag = new Event("USER_VIEWED_SURVEY", 73, "User viewed survey");
            aZ = new Event("CLOSE_SURVEY_WITHOUT_SUBMITTING", 74, "Close survey without submitting");
            ah = new Event("PLAYLIST_ANNOTATION_UPLOAD", 75, "playlist-annotation-upload");
            ai = new Event("REPORT_ABUSE", 76, "playlist-annotation-report-abuse");
            aj = new Event("EDIT_MODE", 77, "edit-mode");
            ak = new Event("BACK", 78, "back");
            al = new Event("HIDE_FROM_RECENTLY_PLAYED", 79, "hide-from-recently-played");
            am = new Event("AD_SUBSCRIPTIONS_CREATED", 80, "ad-subscriptions-created");
            an = new Event("AD_SUBSCRIPTIONS_PUB", 81, "ad-subscriptions-pub");
            ba = new Event("AD_SUBSCRIPTIONS_COMPLETE", 82, "ad-subscriptions-complete");
            ao = new Event("AD_SUBSCRIPTIONS_FLAG", 83, "ad-subscriptions-flag-change");
            ap = new Event("AD_METADATA_STATUS", 84, "ad-metadata-status");
            aq = new Event("INSTALL_REFERRER", 85, "install-referrer");
            ar = new Event("MARK_AS_PLAYED", 86, "mark-as-played");
            bb = new Event("MARK_AS_UNPLAYED", 87, "mark-as-unplayed");
            as = new Event("SPOTIFY_SERVICE", 88, "spotify-service");
            at = new Event("STATE_HANDLER", 89, "state-handler");
            au = new Event("DONE", 90, "done");
            av = new Event("CANCEL_SUBSCRIPTION", 91, "cancel-subscription");
            aw = new Event("INTRO_VIDEO_UNKNOWN_FAILURE", 92, "intro-video-unknown-failure");
            ax = new Event("SIM_INFORMATION", 93, "sim-information");
            ay = new Event("MSISDN_LOOKUP", 94, "msisdn-lookup");
            az = new Event("OPERATOR_ACTIVATION", 95, "operator-activation");
            aA = new Event("DYNAMIC_UPSELL_NOT_SHOWN", 96, "dynamic-upsell-not-shown");
            aB = new Event("OPT_IN_BANNER_ACCEPT", 97, "opt-in-banner-accept");
            aC = new Event("OPT_IN_BANNER_DISMISSED", 98, "opt-in-banner-dismissed");
            aD = new Event("OPT_IN_CONFIRM_ACCEPT", 99, "opt-in-confirm-accept");
            aE = new Event("OPT_IN_CONFIRM_DISMISSED", 100, "opt-in-confirm-dismissed");
            aF = new Event("OPT_IN_ERROR_ACCEPT", 101, "opt-in-error-accept");
            aG = new Event("OPT_IN_ERROR_DISMISSED", 102, "opt-in-error-dismissed");
            aH = new Event("OPT_IN_SUCCESS", 103, "opt-in-success");
            aI = new Event("OPT_IN_ERROR", 104, "opt-in-error");
            aJ = new Event("OPT_IN_NO_RESTART_FLOW_TOO_SLOW", 105, "opt-in-no-restart-flow-too-slow");
            bc = (new Event[] {
                a, b, c, d, e, f, g, h, aK, aL, 
                i, j, k, l, m, n, o, p, q, r, 
                s, t, u, v, w, x, y, aM, z, A, 
                B, C, aN, aO, D, E, F, G, H, I, 
                J, K, L, aP, aQ, M, aR, N, aS, O, 
                aT, P, Q, R, S, T, U, V, W, aU, 
                aV, aW, aX, aY, X, Y, Z, aa, ab, ac, 
                ad, ae, af, ag, aZ, ah, ai, aj, ak, al, 
                am, an, ba, ao, ap, aq, ar, bb, as, at, 
                au, av, aw, ax, ay, az, aA, aB, aC, aD, 
                aE, aF, aG, aH, aI, aJ
            });
        }

        private Event(String s1, int i1, String s2)
        {
            super(s1, i1);
            mEvent = s2;
        }
    }

}
