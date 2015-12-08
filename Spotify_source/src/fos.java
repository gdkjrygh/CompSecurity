// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.spotify.mobile.android.ui.activity.PlayerActivity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.music.internal.provider.SpotifyProvider;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.ThumbState;
import com.spotify.music.spotlets.radio.service.RadioActionsService;
import java.util.List;

public class fos
    implements dmx
{

    public fos()
    {
    }

    public static void a(Activity activity)
    {
        ctz.a(activity);
        com.spotify.mobile.android.ui.actions.PlayerActions._cls1 _lcls1 = new com.spotify.mobile.android.ui.actions.PlayerActions._cls1(new Handler(), activity);
        Intent intent = dvv.a(activity, "com.spotify.mobile.android.service.action.player.REQUEST_AUDIO_SESSION");
        intent.putExtra("callback", _lcls1);
        activity.startService(intent);
    }

    public static void a(Context context)
    {
        ctz.a(context);
        Intent intent = dvv.a(context, "com.spotify.mobile.android.service.action.player.PREVIOUS");
        intent.putExtra("force_previous", false);
        context.startService(intent);
    }

    public static void a(Context context, int i)
    {
        ctz.a(context);
        Intent intent = dvv.a(context, "com.spotify.mobile.android.service.action.player.SKIP_N_TRACKS_FORWARDS");
        intent.putExtra("n_tracks_to_skip", i);
        context.startService(intent);
    }

    public static void a(Context context, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, FeatureIdentifier featureidentifier, FeatureIdentifier featureidentifier1, Uri uri)
    {
        com.spotify.mobile.android.util.ClientEvent.SubEvent subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.a;
        ctz.a(context);
        ctz.a(verified);
        ctz.a(subview);
        ctz.a(featureidentifier1);
        ctz.a(uri);
        ctz.a(subevent);
        Intent intent = dvv.a(context, "com.spotify.mobile.android.service.action.player.PLAY_CONTENT");
        intent.setData(uri);
        intent.putExtra("shuffle", true);
        a(intent, verified, subview, featureidentifier, featureidentifier1, subevent);
        context.startService(intent);
    }

    public static void a(Context context, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, FeatureIdentifier featureidentifier, FeatureIdentifier featureidentifier1, Uri uri, long l, 
            Flags flags)
    {
        a(context, verified, subview, featureidentifier, featureidentifier1, uri, l, com.spotify.mobile.android.util.ClientEvent.SubEvent.a, flags);
    }

    private static void a(Context context, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, FeatureIdentifier featureidentifier, FeatureIdentifier featureidentifier1, Uri uri, long l, 
            com.spotify.mobile.android.util.ClientEvent.SubEvent subevent, Flags flags)
    {
        ctz.a(context);
        ctz.a(uri);
        ctz.a(featureidentifier1);
        ctz.a(subevent);
        if (!gex.a(flags) && l != -1L)
        {
            if (fyj.a())
            {
                verified = new Intent("com.spotify.mobile.android.service.broadcast.session.PLAYBACK_ERROR");
                verified.putExtra("error_code", 16);
                verified.putExtra("content_uri", uri.toString());
                context.sendBroadcast(verified);
                return;
            } else
            {
                verified = new Intent("com.spotify.mobile.android.service.broadcast.session.PLAYBACK_ERROR");
                verified.putExtra("error_code", 17);
                verified.putExtra("content_uri", uri.toString());
                context.sendBroadcast(verified);
                return;
            }
        }
        ctz.a(verified);
        ctz.a(subview);
        ctz.a(uri);
        if (!SpotifyProvider.a.equals(uri.getAuthority()))
        {
            break MISSING_BLOCK_LABEL_217;
        }
        flags = uri.getPathSegments();
        if (flags.size() != 2 || !((String)flags.get(0)).equals("radio"))
        {
            break MISSING_BLOCK_LABEL_217;
        }
        flags = (String)flags.get(1);
_L1:
        if (!TextUtils.isEmpty(flags))
        {
            a(context, ((String) (flags)), verified, subview);
            return;
        } else
        {
            flags = dvv.a(context, "com.spotify.mobile.android.service.action.player.PLAY_CONTENT");
            flags.setData(uri);
            flags.putExtra("row_id", l);
            a(((Intent) (flags)), verified, subview, featureidentifier, featureidentifier1, subevent);
            context.startService(flags);
            return;
        }
        flags = null;
          goto _L1
    }

    public static void a(Context context, Verified verified, FeatureIdentifier featureidentifier, FeatureIdentifier featureidentifier1, Uri uri, Flags flags)
    {
        a(context, verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, featureidentifier, featureidentifier1, uri, -1L, com.spotify.mobile.android.util.ClientEvent.SubEvent.a, flags);
    }

    public static void a(Context context, RadioStationModel radiostationmodel, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
    {
        ctz.a(context);
        ctz.a(radiostationmodel);
        ctz.a(verified);
        context.startService(RadioActionsService.b(context, radiostationmodel, verified, subview));
    }

    public static void a(Context context, RadioStationModel radiostationmodel, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, int i)
    {
        ctz.a(context);
        ctz.a(radiostationmodel);
        ctz.a(verified);
        context.startService(RadioActionsService.a(context, radiostationmodel, verified, subview, i));
    }

    public static void a(Context context, String s)
    {
        ctz.a(context);
        context.startActivity(PlayerActivity.a(context, s));
    }

    public static void a(Context context, String s, Verified verified)
    {
        a(context, s, verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a);
    }

    private static void a(Context context, String s, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
    {
        a(context, new String[] {
            s
        }, verified, subview);
    }

    public static void a(Context context, boolean flag)
    {
        ctz.a(context);
        ThumbState thumbstate;
        if (flag)
        {
            thumbstate = ThumbState.b;
        } else
        {
            thumbstate = ThumbState.c;
        }
        context.startService(RadioActionsService.a(context, thumbstate));
    }

    public static void a(Context context, String as[], Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
    {
        a(context, as, verified, subview, false);
    }

    public static void a(Context context, String as[], Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, boolean flag)
    {
        ctz.a(context);
        ctz.a(as);
        boolean flag1;
        if (as.length > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ctz.a(flag1);
        ctz.a(verified);
        ctz.a(subview);
        context.startService(RadioActionsService.a(context, as, verified, subview, flag));
    }

    private static void a(Intent intent, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, FeatureIdentifier featureidentifier, FeatureIdentifier featureidentifier1, com.spotify.mobile.android.util.ClientEvent.SubEvent subevent)
    {
        intent.putExtra("uri", verified);
        intent.putExtra("context", subview.toString());
        intent.putExtra("feature_identifier", featureidentifier.a());
        intent.putExtra("referer", featureidentifier1.a());
        intent.putExtra("event_version", subevent.toString());
    }

    public static void b(Context context)
    {
        ctz.a(context);
        context.startService(dvv.a(context, "com.spotify.mobile.android.service.action.player.NEXT"));
    }

    public static void b(Context context, String s)
    {
        ctz.a(context);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("uri", s);
        context.getContentResolver().insert(dts.a, contentvalues);
    }

    public static void c(Context context)
    {
        ctz.a(context);
        context.startService(dvv.a(context, "com.spotify.mobile.android.service.action.player.TOGGLE_PAUSED"));
    }

    public static void d(Context context)
    {
        ctz.a(context);
        context.startService(dvv.a(context, "com.spotify.mobile.android.service.action.player.PLAYER_PLAY"));
    }

    public static void e(Context context)
    {
        ctz.a(context);
        context.startService(dvv.a(context, "com.spotify.mobile.android.service.action.player.PLAYER_PAUSE"));
    }

    public final void a(Context context, Verified verified, FeatureIdentifier featureidentifier, FeatureIdentifier featureidentifier1, Uri uri, long l, 
            Flags flags)
    {
        a(context, verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, featureidentifier, featureidentifier1, uri, l, flags);
    }
}
