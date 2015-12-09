// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.radio.service;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.IBinder;
import android.text.TextUtils;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.ParserException;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.music.spotlets.radio.model.ClusterRadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.model.SavedStationModel;
import com.spotify.music.spotlets.radio.model.ThumbState;
import ctz;
import dmz;
import dvk;
import dwx;
import dxc;
import dxd;
import eda;
import edb;
import eot;
import eov;
import eqm;
import geh;
import gex;
import ggc;
import ghq;
import gox;
import gpa;
import gpc;
import gpd;
import gpe;
import gpg;
import gph;
import gpk;
import gpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class RadioActionsService extends Service
{

    private final gpc a = new gpc(this);
    private gox b;
    private edb c;
    private boolean d;
    private final eda e = new eda() {

        private RadioActionsService a;

        public final void a(SessionState sessionstate)
        {
label0:
            {
                boolean flag;
                if (sessionstate.e && !sessionstate.g)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag != RadioActionsService.a(a))
                {
                    RadioActionsService.a(a, flag);
                    if (!RadioActionsService.a(a))
                    {
                        break label0;
                    }
                    sessionstate = RadioActionsService.b(a);
                    ((gox) (sessionstate)).a.connect();
                    gph gph1 = ((gox) (sessionstate)).e;
                    Player player = ((gox) (sessionstate)).b;
                    player.registerPlayerStateObserver(gph1.c);
                    gph1.f = player;
                    sessionstate.b();
                    RadioActionsService.c(a).a();
                    Intent intent;
                    for (sessionstate = RadioActionsService.d(a).iterator(); sessionstate.hasNext(); a.startService(intent))
                    {
                        intent = (Intent)sessionstate.next();
                    }

                    RadioActionsService.d(a).clear();
                }
                return;
            }
            RadioActionsService.b(a).a();
            RadioActionsService.c(a).b();
            a.stopSelf();
        }

            
            {
                a = RadioActionsService.this;
                super();
            }
    };
    private ServiceConnection f;
    private dxc g;
    private final dwx h = new dwx() {

        private RadioActionsService a;

        public final void a(Flags flags)
        {
            RadioActionsService.b(a).h = gex.a(flags);
            RadioActionsService.b(a).g = gpl.a(flags);
        }

            
            {
                a = RadioActionsService.this;
                super();
            }
    };
    private final List i = new ArrayList();
    private boolean j;

    public RadioActionsService()
    {
        f = new ServiceConnection() {

            private RadioActionsService a;

            public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                RadioActionsService.e(a);
                RadioActionsService.f(a);
            }

            public final void onServiceDisconnected(ComponentName componentname)
            {
            }

            
            {
                a = RadioActionsService.this;
                super();
            }
        };
    }

    public static Intent a(Context context, RadioStationModel radiostationmodel, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
    {
        context = new Intent(context, com/spotify/music/spotlets/radio/service/RadioActionsService);
        context.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.FOLLOW_STATION");
        context.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.station", radiostationmodel);
        context.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.viewUri", verified);
        context.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.subViewUri", subview);
        return context;
    }

    public static Intent a(Context context, RadioStationModel radiostationmodel, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, int k)
    {
        context = new Intent(context, com/spotify/music/spotlets/radio/service/RadioActionsService);
        context.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.PLAY_STATION_ENTITY");
        context.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.station", radiostationmodel);
        context.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.viewUri", verified);
        context.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.subViewUri", subview);
        context.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.startIndex", k);
        return context;
    }

    public static Intent a(Context context, ThumbState thumbstate)
    {
        context = new Intent(context, com/spotify/music/spotlets/radio/service/RadioActionsService);
        context.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.THUMB_TRACK");
        context.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.thumbState", thumbstate);
        return context;
    }

    public static Intent a(Context context, String s, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
    {
        context = new Intent(context, com/spotify/music/spotlets/radio/service/RadioActionsService);
        context.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.REMOVE_STATION");
        context.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.station_uri", s);
        context.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.viewUri", verified);
        context.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.subViewUri", subview);
        return context;
    }

    public static Intent a(Context context, String as[], Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, boolean flag)
    {
        context = new Intent(context, com/spotify/music/spotlets/radio/service/RadioActionsService);
        context.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.PLAY_STATION");
        context.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.seeds", as);
        context.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.viewUri", verified);
        context.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.subViewUri", subview);
        context.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.followState", flag);
        return context;
    }

    private static RadioStationModel a(Intent intent)
    {
        return (RadioStationModel)intent.getParcelableExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.station");
    }

    public static void a(Context context)
    {
        context.stopService(new Intent(context, com/spotify/music/spotlets/radio/service/RadioActionsService));
    }

    static boolean a(RadioActionsService radioactionsservice)
    {
        return radioactionsservice.d;
    }

    static boolean a(RadioActionsService radioactionsservice, boolean flag)
    {
        radioactionsservice.d = flag;
        return flag;
    }

    public static Intent b(Context context, RadioStationModel radiostationmodel, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
    {
        return a(context, radiostationmodel, verified, subview, -1);
    }

    public static Intent b(Context context, String s, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
    {
        context = new Intent(context, com/spotify/music/spotlets/radio/service/RadioActionsService);
        context.setAction("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.UNFOLLOW_STATION");
        context.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.station_uri", s);
        context.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.viewUri", verified);
        context.putExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.subViewUri", subview);
        return context;
    }

    private static ClusterRadioStationModel b(Intent intent)
    {
        return (ClusterRadioStationModel)intent.getParcelableExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.station");
    }

    public static gox b(RadioActionsService radioactionsservice)
    {
        return radioactionsservice.b;
    }

    private static com.spotify.mobile.android.util.viewuri.ViewUri.SubView c(Intent intent)
    {
        return (com.spotify.mobile.android.util.viewuri.ViewUri.SubView)intent.getSerializableExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.subViewUri");
    }

    static dxc c(RadioActionsService radioactionsservice)
    {
        return radioactionsservice.g;
    }

    private static Verified d(Intent intent)
    {
        return (Verified)intent.getParcelableExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.viewUri");
    }

    static List d(RadioActionsService radioactionsservice)
    {
        return radioactionsservice.i;
    }

    static boolean e(RadioActionsService radioactionsservice)
    {
        radioactionsservice.j = true;
        return true;
    }

    static void f(RadioActionsService radioactionsservice)
    {
        if (radioactionsservice.j)
        {
            radioactionsservice.c.a(radioactionsservice.e);
            radioactionsservice.c.a();
        }
    }

    public IBinder onBind(Intent intent)
    {
        return a;
    }

    public void onCreate()
    {
        super.onCreate();
        b = new gox(getApplicationContext());
        c = new edb(this);
        SpotifyService.a(getApplicationContext(), f, getClass().getSimpleName());
        dmz.a(dxd);
        g = dxd.a(this);
        g.a(h);
    }

    public void onDestroy()
    {
        super.onDestroy();
        g.b();
        c.b();
        Object obj = b;
        ((gox) (obj)).a();
        ((gox) (obj)).a.destroy();
        obj = ((gox) (obj)).d;
        ((gpd) (obj)).a.a();
        ((gpd) (obj)).b.a();
        ((gpd) (obj)).c.a();
        ((gpd) (obj)).d.a();
        ((gpd) (obj)).e.a();
        dvk.a(getApplicationContext(), f, getClass().getSimpleName());
    }

    public int onStartCommand(Intent intent, int k, int l)
    {
        Object obj;
        if (intent == null)
        {
            return 2;
        }
        if (!j)
        {
            i.add(intent);
            return 2;
        }
        obj = intent.getAction();
        if (!"com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.GET_ALL_STATIONS".equals(obj)) goto _L2; else goto _L1
_L1:
        b.b();
_L8:
        return 2;
_L2:
        String s;
        if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.REMOVE_STATION".equals(obj))
        {
            obj = intent.getStringExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.station_uri");
            Verified verified5 = d(intent);
            Object obj3 = c(intent);
            Object obj1 = b;
            RadioStationModel radiostationmodel = ((gox) (obj1)).e.a(((String) (obj)));
            intent = "";
            if (radiostationmodel != null)
            {
                intent = Arrays.toString(radiostationmodel.seeds);
            }
            ((gox) (obj1)).a(com.spotify.mobile.android.util.ClientEvent.Event.w, ((String) (obj)), intent, verified5, ((com.spotify.mobile.android.util.viewuri.ViewUri.SubView) (obj3)));
            intent = ((gox) (obj1)).e;
            obj3 = intent.a(((String) (obj)));
            if (obj3 != null)
            {
                ArrayList arraylist = new ArrayList(((gph) (intent)).b.userStations.length);
                RadioStationModel aradiostationmodel1[] = ((gph) (intent)).b.userStations;
                l = aradiostationmodel1.length;
                for (k = 0; k < l; k++)
                {
                    RadioStationModel radiostationmodel1 = aradiostationmodel1[k];
                    if (radiostationmodel1 != obj3)
                    {
                        arraylist.add(radiostationmodel1);
                    }
                }

                RadioStationModel aradiostationmodel[] = new RadioStationModel[arraylist.size()];
                arraylist.toArray(aradiostationmodel);
                intent.b = new RadioStationsModel(aradiostationmodel, ((gph) (intent)).b.recommendedStations, ((gph) (intent)).b.genreStations, ((gph) (intent)).b.savedStations, ((gph) (intent)).b.clusterStations);
                intent.b();
            }
            intent = ((gox) (obj1)).d;
            obj1 = ((gox) (obj1)).f;
            geh.a(((CharSequence) (obj)), "stationUri can not be empty.");
            ctz.a(obj1);
            obj = String.format(Locale.US, "hm://radio-apollo/v3/stations/%s", new Object[] {
                obj
            });
            ((gpd) (intent)).e.a(RequestBuilder.delete(((String) (obj))).build(), 15000L).a(gpd.a(((gpf) (obj1)), ((String) (obj))));
            continue; /* Loop/switch isn't completed */
        }
        if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.FOLLOW_STATION".equals(obj))
        {
            obj = a(intent);
            Verified verified = d(intent);
            intent = c(intent);
            b.a(((RadioStationModel) (obj)), verified, intent);
            continue; /* Loop/switch isn't completed */
        }
        if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.FOLLOW_MULTIPLE_STATIONS".equals(obj))
        {
            intent = intent.getParcelableArrayListExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.stations_list");
            b.a(intent);
            continue; /* Loop/switch isn't completed */
        }
        if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.UNFOLLOW_STATION".equals(obj))
        {
            obj = intent.getStringExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.station_uri");
            Object obj2 = d(intent);
            com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview2 = c(intent);
            gox gox1 = b;
            if (gox1.g)
            {
                intent = gpl.d(((String) (obj)));
                gox1.a(com.spotify.mobile.android.util.ClientEvent.Event.y, ((String) (obj)), intent, ((Verified) (obj2)), subview2);
                obj2 = gox1.d;
                obj = new gox._cls7(gox1, ((String) (obj)));
                geh.a(intent, "seedUri can not be empty.");
                ctz.a(obj);
                intent = new SavedStationModel(intent);
                try
                {
                    ((gpd) (obj2)).e.a(RequestBuilder.delete("hm://radio-apollo/v3/saved-station", intent).build(), 15000L).a(gpd.a(((gpf) (obj)), "hm://radio-apollo/v3/saved-station"));
                }
                // Misplaced declaration of an exception variable
                catch (Intent intent)
                {
                    Logger.a(intent, "Failed to parse SavedStationModel object for '%s' backend action.", new Object[] {
                        "hm://radio-apollo/v3/saved-station"
                    });
                    ((gpe) (obj)).a();
                }
            }
            continue; /* Loop/switch isn't completed */
        }
        if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.PLAY_STATION".equals(obj))
        {
            obj = intent.getStringArrayExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.seeds");
            Verified verified1 = d(intent);
            com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview = c(intent);
            boolean flag = intent.getBooleanExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.followState", false);
            b.a(((String []) (obj)), verified1, subview, flag);
            continue; /* Loop/switch isn't completed */
        }
        if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.PLAY_STATION_ENTITY".equals(obj))
        {
            obj = a(intent);
            Verified verified2 = d(intent);
            com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview1 = c(intent);
            k = intent.getIntExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.startIndex", -1);
            b.a(((RadioStationModel) (obj)), verified2, subview1, k);
            continue; /* Loop/switch isn't completed */
        }
        if (!"com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.THUMB_TRACK".equals(obj))
        {
            break MISSING_BLOCK_LABEL_1268;
        }
        intent = (ThumbState)intent.getSerializableExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.thumbState");
        Object obj4 = b;
        obj = ((gox) (obj4)).e.d;
        if (!gpl.f(((gpg) (obj)).c))
        {
            Logger.b("Thumb operation could not be executed if we are not playing radio.", new Object[0]);
            dmz.a(ggc);
            ggc.e(((gox) (obj4)).c);
            continue; /* Loop/switch isn't completed */
        }
        String s1 = ((gpg) (obj)).d;
        if (TextUtils.isEmpty(s1))
        {
            Logger.b("Thumb operation could not be executed, since the player has not yet started playing.", new Object[0]);
            dmz.a(ggc);
            ggc.e(((gox) (obj4)).c);
            continue; /* Loop/switch isn't completed */
        }
        ((gox) (obj4)).e.a(intent);
        if (((gpg) (obj)).b())
        {
            ((gox) (obj4)).e.c();
            continue; /* Loop/switch isn't completed */
        }
        gpk gpk1 = ((gpg) (obj)).b;
        RadioStationModel radiostationmodel2 = ((gpg) (obj)).a;
        gpd gpd1 = ((gox) (obj4)).d;
        s = radiostationmodel2.uri;
        boolean flag1;
        if (!((gox) (obj4)).g)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (gpk1.g.size() == 0)
        {
            obj = "";
        } else
        {
            obj = Uri.parse(gpk1.b.nextPageUrl).getQueryParameter("salt");
            String s2 = TextUtils.join(",", gpk1.g);
            obj = (new StringBuilder("salt=")).append(((String) (obj))).append("&prev_tracks=").append(s2).toString();
        }
        obj4 = new gpa(((gox) (obj4)), radiostationmodel2, intent, gpk1.e, gpk1.f);
        geh.a(s, "stationUri can not be empty.");
        ctz.a(intent);
        geh.a(s1, "trackUri can not be empty.");
        ctz.a(s1.startsWith("spotify:track:"), "trackUri should have 'spotify:track:' prefix.");
        ctz.a(obj4);
        if (!intent.equals(ThumbState.a))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ctz.a(flag1, "thumbState can not be NONE");
        gpd._cls2.a[intent.ordinal()];
        JVM INSTR tableswitch 1 2: default 1032
    //                   1 1218
    //                   2 1225;
           goto _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_1225;
_L3:
        intent = "none";
_L6:
        s1 = s1.substring(14);
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = Request.EMPTY_BODY;
        } else
        {
            obj = String.format(Locale.US, "hm://radio-apollo/v3/tracks/%s?%s", new Object[] {
                s, obj
            }).getBytes();
        }
        if (k != 0)
        {
            k = 15;
        } else
        {
            k = 0;
        }
        intent = String.format(Locale.US, "hm://radio-apollo/v3/stations/%s/%s/%s?language=%s&count=%s", new Object[] {
            s, intent, s1, ghq.a(Locale.getDefault()), Integer.valueOf(k)
        });
        gpd1.b.a(RequestBuilder.postBytes(intent, ((byte []) (obj))).build(), 15000L).a(gpd.a(((gpf) (obj4)), intent));
        continue; /* Loop/switch isn't completed */
_L4:
        intent = "ups";
          goto _L6
        intent = "downs";
          goto _L6
        if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.ADD_PLAYING_CLUSTER_STATIONS".equals(obj))
        {
            obj = b(intent);
            Verified verified3 = d(intent);
            intent = c(intent);
            b.a(((ClusterRadioStationModel) (obj)), verified3, intent);
            continue; /* Loop/switch isn't completed */
        }
        if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.REMOVE_PLAYING_CLUSTER_STATIONS".equals(obj))
        {
            intent = b(intent);
            b.a(intent);
            continue; /* Loop/switch isn't completed */
        }
        if ("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.ADD_MULTIPLE_CLUSTER_STATIONS".equals(obj))
        {
            obj = intent.getParcelableArrayListExtra("com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.intent_keys.cluster_stations_list");
            Verified verified4 = d(intent);
            intent = c(intent);
            b.a(((List) (obj)), verified4, intent);
            continue; /* Loop/switch isn't completed */
        }
        if (!"com.spotify.music.spotlets.radio.service..RADIO_ACTIONS_INTENT_SERVICE.REMOVE_ALL_CLUSTER_STATIONS".equals(obj))
        {
            break; /* Loop/switch isn't completed */
        }
        b.c();
        if (true) goto _L8; else goto _L7
_L7:
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L8; else goto _L9
_L9:
        throw new IllegalArgumentException((new StringBuilder("RadioActionsService does not know the action ")).append(((String) (obj))).toString());
    }
}
