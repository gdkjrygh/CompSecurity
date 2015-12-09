// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.orbit;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;

public abstract class OrbitServiceObserver
{

    public static final int FEATURE_ADD_TO_QUEUE = 1;
    public static final int FEATURE_TOGGLE_SHUFFLE = 2;
    public static final int FEATURE_UNKNOWN = 0;
    public static final int PLAYBACK_ERROR_BANNED_BY_ARTIST = 19;
    public static final int PLAYBACK_ERROR_CAPPING_REACHED = 14;
    public static final int PLAYBACK_ERROR_COMMERCIAL_IS_PLAYING = 10;
    public static final int PLAYBACK_ERROR_CONTENT_NOT_SUPPORTED = 25;
    public static final int PLAYBACK_ERROR_LOCAL_TRACK_UNSYNCED = 9;
    public static final int PLAYBACK_ERROR_NEED_ONLINE_IN_OFFLINE_MODE = 5;
    public static final int PLAYBACK_ERROR_NEED_ONLINE_NO_CONNECTION = 3;
    public static final int PLAYBACK_ERROR_NONE = 0;
    public static final int PLAYBACK_ERROR_NOT_IN_REGION = 18;
    public static final int PLAYBACK_ERROR_NOT_IN_REGION_IS_OFFLINE = 7;
    public static final int PLAYBACK_ERROR_PREMIUM_ONLY = 2;
    public static final int PLAYBACK_ERROR_SHUFFLE_NO_SKIPS_REMAINING = 15;
    public static final int PLAYBACK_ERROR_SHUFFLE_PREMIUM_ONLY = 16;
    public static final int PLAYBACK_ERROR_SHUFFLE_PREMIUM_ONLY_IS_OFFLINE = 17;
    public static final int PLAYBACK_ERROR_UNABLE_TO_START_RADIO = 11;
    public static final int PLAYBACK_ERROR_UNAVAILABLE = 6;
    public static final int PLAYBACK_ERROR_UNAVAILABLE_IS_OFFLINE = 8;
    public static final int PLAYBACK_ERROR_UNKNOWN = 99;
    public static final int PLAYBACK_ERROR_VIDEO = 20;
    public static final int PLAYBACK_ERROR_VIDEO_GEORESTRICTED = 21;
    public static final int PLAYBACK_ERROR_VIDEO_MANIFEST_DELETED = 24;
    public static final int PLAYBACK_ERROR_VIDEO_UNSUPPORTED_CLIENT_VERSION = 23;
    public static final int PLAYBACK_ERROR_VIDEO_UNSUPPORTED_PLATFORM_VERSION = 22;
    public static final int SOCIAL_ERROR_FAILED_TO_CONNECT = 1;
    public static final int SOCIAL_ERROR_NONE = 0;
    public static final int SOCIAL_ERROR_PERMISSIONS = 5;
    public static final int SOCIAL_ERROR_SERVICE_CONNECT_NOT_PERMITTED = 7;
    public static final int SOCIAL_ERROR_TOKEN_EXPIRED = 6;
    public static final int SOCIAL_ERROR_USER_DATA_FAIL = 2;
    public static final int SOCIAL_ERROR_USER_NOT_SOCIAL = 3;

    public OrbitServiceObserver()
    {
    }

    public static ClientEvent getPlaybackErrorAsClientEvent(int i)
    {
        com.spotify.mobile.android.util.ClientEvent.SubEvent subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.d;
        i;
        JVM INSTR lookupswitch 23: default 200
    //                   0: 231
    //                   2: 238
    //                   3: 245
    //                   5: 252
    //                   6: 259
    //                   7: 266
    //                   8: 273
    //                   9: 280
    //                   10: 287
    //                   11: 294
    //                   14: 301
    //                   15: 308
    //                   16: 315
    //                   17: 322
    //                   18: 329
    //                   19: 336
    //                   20: 343
    //                   21: 350
    //                   22: 357
    //                   23: 364
    //                   24: 371
    //                   25: 378
    //                   99: 385;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24
_L1:
        Assertion.a((new StringBuilder("Unhandled playback error: ")).append(i).toString());
_L26:
        return new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.b, subevent);
_L2:
        subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.a;
        continue; /* Loop/switch isn't completed */
_L3:
        subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.e;
        continue; /* Loop/switch isn't completed */
_L4:
        subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.f;
        continue; /* Loop/switch isn't completed */
_L5:
        subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.g;
        continue; /* Loop/switch isn't completed */
_L6:
        subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.h;
        continue; /* Loop/switch isn't completed */
_L7:
        subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.i;
        continue; /* Loop/switch isn't completed */
_L8:
        subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.j;
        continue; /* Loop/switch isn't completed */
_L9:
        subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.k;
        continue; /* Loop/switch isn't completed */
_L10:
        subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.l;
        continue; /* Loop/switch isn't completed */
_L11:
        subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.m;
        continue; /* Loop/switch isn't completed */
_L12:
        subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.n;
        continue; /* Loop/switch isn't completed */
_L13:
        subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.o;
        continue; /* Loop/switch isn't completed */
_L14:
        subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.p;
        continue; /* Loop/switch isn't completed */
_L15:
        subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.q;
        continue; /* Loop/switch isn't completed */
_L16:
        subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.r;
        continue; /* Loop/switch isn't completed */
_L17:
        subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.s;
        continue; /* Loop/switch isn't completed */
_L18:
        subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.u;
        continue; /* Loop/switch isn't completed */
_L19:
        subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.w;
        continue; /* Loop/switch isn't completed */
_L20:
        subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.x;
        continue; /* Loop/switch isn't completed */
_L21:
        subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.y;
        continue; /* Loop/switch isn't completed */
_L22:
        subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.v;
        continue; /* Loop/switch isn't completed */
_L23:
        subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.t;
        continue; /* Loop/switch isn't completed */
_L24:
        subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.d;
        if (true) goto _L26; else goto _L25
_L25:
    }

    public static String getSocialErrorAsString(int i)
    {
        switch (i)
        {
        case 4: // '\004'
        default:
            return (new StringBuilder("Unknown error: ")).append(i).toString();

        case 0: // '\0'
            return "kSocialErrorNone";

        case 1: // '\001'
            return "kSocialErrorFailedToConnect";

        case 2: // '\002'
            return "kSocialErrorUserDataFail";

        case 3: // '\003'
            return "kSocialErrorUserNotSocial";

        case 5: // '\005'
            return "kSocialErrorPermissions";

        case 6: // '\006'
            return "kSocialErrorTokenExpired";

        case 7: // '\007'
            return "kSocialErrorServiceConnectNotPermitted";
        }
    }

    public abstract void onConnectionError(int i);

    public abstract void onFeatureError(int i, int j);

    public abstract void onIncognitoModeDisabledByTimer();

    public abstract void onLastFmAuthenticationError();

    public abstract void onLoginError(int i);

    public abstract void onOfflineSyncError(int i);

    public abstract void onOrbitStarted();

    public abstract void onOrbitStopped();

    public abstract void onPlayTokenLost();

    public abstract void onPlaybackError(int i, String s);

    public abstract void onSessionIdle(boolean flag);

    public abstract void onSocialError(int i, String s);

    public abstract void onSyncActive(boolean flag);

    public abstract void onUpdateAvailable(String s);
}
