// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.android.Subscription;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.music.spotlets.FeatureIdentifier;
import ctw;
import dmz;
import fxy;
import gng;
import gni;
import java.util.ArrayList;
import java.util.List;

public class CosmosTestFragment extends Fragment
    implements fxy
{

    private static boolean av;
    private Player Y;
    private String Z;
    private Handler a;
    private String aa;
    private String ab;
    private String ac;
    private String ad;
    private Button ae;
    private String af;
    private Button ag;
    private Button ah;
    private Spinner ai;
    private Spinner aj;
    private CheckBox ak;
    private TextView al;
    private ScrollView am;
    private Subscription an;
    private ObjectMapper ao;
    private final List ap = new ArrayList();
    private boolean aq;
    private boolean ar;
    private boolean as;
    private com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver at;
    private com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver au;
    private Resolver b;

    public CosmosTestFragment()
    {
        ao = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        at = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            private CosmosTestFragment a;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                Object obj = a;
                boolean flag;
                if (playerstate.isPlaying() && !playerstate.isPaused())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                CosmosTestFragment.a(((CosmosTestFragment) (obj)), flag);
                obj = CosmosTestFragment.d(a);
                if (CosmosTestFragment.a(a))
                {
                    playerstate = CosmosTestFragment.b(a);
                } else
                {
                    playerstate = CosmosTestFragment.c(a);
                }
                ((Button) (obj)).setText(playerstate);
            }

            
            {
                a = CosmosTestFragment.this;
                super();
            }
        };
        au = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            private CosmosTestFragment a;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                try
                {
                    playerstate = CosmosTestFragment.e(a).writerWithDefaultPrettyPrinter().writeValueAsString(playerstate);
                    CosmosTestFragment.a(a, "player", playerstate);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (PlayerState playerstate)
                {
                    CosmosTestFragment.a(a, playerstate);
                }
            }

            
            {
                a = CosmosTestFragment.this;
                super();
            }
        };
    }

    private void a()
    {
        Y.pause();
        a("player", "paused");
    }

    static void a(CosmosTestFragment cosmostestfragment, String s, String s1)
    {
        cosmostestfragment.a(s, s1);
    }

    static void a(CosmosTestFragment cosmostestfragment, Throwable throwable)
    {
        cosmostestfragment.a("ERROR", throwable.getLocalizedMessage());
    }

    private void a(String s, String s1)
    {
        if (!TextUtils.isEmpty(al.getText()))
        {
            al.append("\n");
        }
        al.append((new StringBuilder("[")).append(s).append("] ").append(s1).toString());
        am.post(new Runnable() {

            private CosmosTestFragment a;

            public final void run()
            {
                CosmosTestFragment.n(a).fullScroll(130);
            }

            
            {
                a = CosmosTestFragment.this;
                super();
            }
        });
    }

    static boolean a(CosmosTestFragment cosmostestfragment)
    {
        return cosmostestfragment.ar;
    }

    static boolean a(CosmosTestFragment cosmostestfragment, boolean flag)
    {
        cosmostestfragment.ar = flag;
        return flag;
    }

    static String b(CosmosTestFragment cosmostestfragment)
    {
        return cosmostestfragment.ac;
    }

    static void b(CosmosTestFragment cosmostestfragment, boolean flag)
    {
        cosmostestfragment.as = flag;
    }

    static String c(CosmosTestFragment cosmostestfragment)
    {
        return cosmostestfragment.ab;
    }

    static Button d(CosmosTestFragment cosmostestfragment)
    {
        return cosmostestfragment.ah;
    }

    static ObjectMapper e(CosmosTestFragment cosmostestfragment)
    {
        return cosmostestfragment.ao;
    }

    static void f(CosmosTestFragment cosmostestfragment)
    {
        com.spotify.cosmos.router.Request request = RequestBuilder.postBytes("sp://echo", "Hello, world!".getBytes()).build();
        cosmostestfragment.b.resolve(request, cosmostestfragment. new com.spotify.cosmos.android.Resolver.CallbackReceiver(cosmostestfragment.a) {

            private CosmosTestFragment a;

            protected final void onError(Throwable throwable)
            {
                CosmosTestFragment.a(a, throwable);
            }

            protected final void onResolved(Response response)
            {
                CosmosTestFragment.a(a, "sp://echo", new String(response.getBody()));
            }

            
            {
                a = CosmosTestFragment.this;
                super(handler);
            }
        });
    }

    static void g(CosmosTestFragment cosmostestfragment)
    {
        if (cosmostestfragment.an == null)
        {
            com.spotify.cosmos.router.Request request = RequestBuilder.subscribeBytes("sp://echo", "Hello, world!".getBytes()).build();
            cosmostestfragment.an = cosmostestfragment.b.subscribe(request, cosmostestfragment. new com.spotify.cosmos.android.Resolver.CallbackReceiver(cosmostestfragment.a) {

                private CosmosTestFragment a;

                protected final void onError(Throwable throwable)
                {
                    CosmosTestFragment.a(a, throwable);
                }

                protected final void onResolved(Response response)
                {
                    CosmosTestFragment.a(a, "sp://echo", new String(response.getBody()));
                }

            
            {
                a = CosmosTestFragment.this;
                super(handler);
            }
            });
            cosmostestfragment.ag.setText(cosmostestfragment.aa);
            return;
        } else
        {
            cosmostestfragment.an.unsubscribe();
            cosmostestfragment.an = null;
            cosmostestfragment.ag.setText(cosmostestfragment.Z);
            return;
        }
    }

    static void h(CosmosTestFragment cosmostestfragment)
    {
        if (cosmostestfragment.aq)
        {
            cosmostestfragment.ae.setText(cosmostestfragment.ad);
            cosmostestfragment.Y.registerPlayerStateObserver(cosmostestfragment.au);
            cosmostestfragment.aq = false;
            return;
        } else
        {
            cosmostestfragment.ae.setText(cosmostestfragment.af);
            cosmostestfragment.Y.unregisterPlayerStateObserver(cosmostestfragment.au);
            cosmostestfragment.aq = true;
            return;
        }
    }

    static void i(CosmosTestFragment cosmostestfragment)
    {
        if (cosmostestfragment.ar)
        {
            cosmostestfragment.a();
            return;
        }
        if (cosmostestfragment.as)
        {
            cosmostestfragment.Y.resume();
            cosmostestfragment.a("player", "resumed");
            return;
        }
        final class _cls10
        {

            static final int a[];

            static 
            {
                a = new int[PlaybackTypes.values().length];
                try
                {
                    a[PlaybackTypes.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[PlaybackTypes.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[PlaybackTypes.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[PlaybackTypes.a.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        PlaybackTypes playbacktypes;
        try
        {
            playbacktypes = PlaybackTypes.values()[cosmostestfragment.ai.getSelectedItemPosition()];
        }
        catch (Exception exception)
        {
            exception = PlaybackTypes.e;
        }
        _cls10.a[playbacktypes.ordinal()];
        JVM INSTR tableswitch 1 4: default 88
    //                   1 103
    //                   2 225
    //                   3 242
    //                   4 259;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        Assertion.b("Unrecognized playback type. Shouldn't happen.");
        return;
_L2:
        String s;
        PlayerContext playercontext;
        playercontext = PlayerContext.create("spotify:album:2LFstTk3PGSZ8KbGknoFzE", "spotify:album:2LFstTk3PGSZ8KbGknoFzE");
        s = "played uri: spotify:album:2LFstTk3PGSZ8KbGknoFzE";
_L6:
        int i1 = Integer.parseInt((String)cosmostestfragment.aj.getSelectedItem());
        Integer integer = Integer.valueOf(i1);
_L7:
        com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder builder = new com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder();
        if (integer != null)
        {
            builder.skipToIndex(0, integer.intValue());
            cosmostestfragment.a("player", (new StringBuilder("index: ")).append(integer).toString());
        }
        builder.playerOptionsOverride(cosmostestfragment.ak.isChecked(), false, false);
        cosmostestfragment.Y.play(playercontext, builder.build(), cosmostestfragment. new com.spotify.mobile.android.cosmos.player.v2.Player.PlayCallback(s) {

            private String a;
            private CosmosTestFragment b;

            public final void onPlayForbidden(List list)
            {
                CosmosTestFragment.a(b, "player", (new StringBuilder("playback forbidden: ")).append(ctw.a(',').a(list)).toString());
            }

            public final void onPlaySuccess()
            {
                CosmosTestFragment.b(b, true);
                CosmosTestFragment.a(b, "player", a);
            }

            
            {
                b = CosmosTestFragment.this;
                a = s;
                super();
            }
        });
        return;
_L3:
        playercontext = PlayerContext.create("spotify:artist:12VaqyEhgwDRuFfEqbnrpz", "spotify:artist:12VaqyEhgwDRuFfEqbnrpz");
        s = "played uri: spotify:artist:12VaqyEhgwDRuFfEqbnrpz";
          goto _L6
_L4:
        playercontext = PlayerContext.create("spotify:user:napstersean:playlist:3vxotOnOGDlZXyzJPLFnm2", "spotify:user:napstersean:playlist:3vxotOnOGDlZXyzJPLFnm2");
        s = "played uri: spotify:user:napstersean:playlist:3vxotOnOGDlZXyzJPLFnm2";
          goto _L6
_L5:
        playercontext = PlayerContext.create("spotify:album:5NrFMOprmnMEf4gMnLaHcq", (PlayerTrack[])cosmostestfragment.ap.toArray(new PlayerTrack[cosmostestfragment.ap.size()]));
        s = (new StringBuilder("played tracks: ")).append(TextUtils.join("\n", cosmostestfragment.ap)).toString();
          goto _L6
        NumberFormatException numberformatexception;
        numberformatexception;
        numberformatexception = null;
          goto _L7
    }

    static void j(CosmosTestFragment cosmostestfragment)
    {
        cosmostestfragment.a();
    }

    static void k(CosmosTestFragment cosmostestfragment)
    {
        cosmostestfragment.Y.skipToNextTrack();
        cosmostestfragment.a("player", "skipped to next");
    }

    static void l(CosmosTestFragment cosmostestfragment)
    {
        cosmostestfragment.Y.skipToPreviousTrack();
        cosmostestfragment.a("player", "skipped to prev");
    }

    static void m(CosmosTestFragment cosmostestfragment)
    {
        cosmostestfragment.al.setText(null);
    }

    static ScrollView n(CosmosTestFragment cosmostestfragment)
    {
        return cosmostestfragment.am;
    }

    public final void B()
    {
        Y.unregisterPlayerStateObserver(at);
        Y.unregisterPlayerStateObserver(au);
        b.destroy();
        super.B();
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "cosmos_test";
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03007e, viewgroup, false);
        if (!av && layoutinflater == null)
        {
            throw new AssertionError();
        } else
        {
            Z = b(0x7f08063a);
            aa = b(0x7f08063c);
            ad = b(0x7f080637);
            af = b(0x7f080636);
            layoutinflater.findViewById(0x7f110358).setOnClickListener(new android.view.View.OnClickListener() {

                private CosmosTestFragment a;

                public final void onClick(View view)
                {
                    CosmosTestFragment.f(a);
                }

            
            {
                a = CosmosTestFragment.this;
                super();
            }
            });
            ag = (Button)layoutinflater.findViewById(0x7f110359);
            ag.setOnClickListener(new android.view.View.OnClickListener() {

                private CosmosTestFragment a;

                public final void onClick(View view)
                {
                    CosmosTestFragment.g(a);
                }

            
            {
                a = CosmosTestFragment.this;
                super();
            }
            });
            ae = (Button)layoutinflater.findViewById(0x7f110361);
            ae.setOnClickListener(new android.view.View.OnClickListener() {

                private CosmosTestFragment a;

                public final void onClick(View view)
                {
                    CosmosTestFragment.h(a);
                }

            
            {
                a = CosmosTestFragment.this;
                super();
            }
            });
            ab = b(0x7f080634);
            ac = b(0x7f080631);
            ah = (Button)layoutinflater.findViewById(0x7f11035c);
            ah.setOnClickListener(new android.view.View.OnClickListener() {

                private CosmosTestFragment a;

                public final void onClick(View view)
                {
                    CosmosTestFragment.i(a);
                }

            
            {
                a = CosmosTestFragment.this;
                super();
            }
            });
            ai = (Spinner)layoutinflater.findViewById(0x7f11035f);
            viewgroup = ArrayAdapter.createFromResource(k(), 0x7f100002, 0x1090009);
            viewgroup.setDropDownViewResource(0x1090009);
            ai.setAdapter(viewgroup);
            ai.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

                private CosmosTestFragment a;

                public final void onItemSelected(AdapterView adapterview, View view, int i1, long l1)
                {
                    CosmosTestFragment.b(a, false);
                }

                public final void onNothingSelected(AdapterView adapterview)
                {
                }

            
            {
                a = CosmosTestFragment.this;
                super();
            }
            });
            aj = (Spinner)layoutinflater.findViewById(0x7f110360);
            viewgroup = ArrayAdapter.createFromResource(k(), 0x7f100001, 0x1090009);
            aj.setAdapter(viewgroup);
            aj.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

                private CosmosTestFragment a;

                public final void onItemSelected(AdapterView adapterview, View view, int i1, long l1)
                {
                    if (CosmosTestFragment.a(a))
                    {
                        CosmosTestFragment.j(a);
                    }
                    CosmosTestFragment.b(a, false);
                }

                public final void onNothingSelected(AdapterView adapterview)
                {
                }

            
            {
                a = CosmosTestFragment.this;
                super();
            }
            });
            layoutinflater.findViewById(0x7f11035d).setOnClickListener(new android.view.View.OnClickListener() {

                private CosmosTestFragment a;

                public final void onClick(View view)
                {
                    CosmosTestFragment.k(a);
                }

            
            {
                a = CosmosTestFragment.this;
                super();
            }
            });
            layoutinflater.findViewById(0x7f11035b).setOnClickListener(new android.view.View.OnClickListener() {

                private CosmosTestFragment a;

                public final void onClick(View view)
                {
                    CosmosTestFragment.l(a);
                }

            
            {
                a = CosmosTestFragment.this;
                super();
            }
            });
            layoutinflater.findViewById(0x7f110362).setOnClickListener(new android.view.View.OnClickListener() {

                private CosmosTestFragment a;

                public final void onClick(View view)
                {
                    CosmosTestFragment.m(a);
                }

            
            {
                a = CosmosTestFragment.this;
                super();
            }
            });
            ak = (CheckBox)layoutinflater.findViewById(0x7f11035e);
            ak.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

                private CosmosTestFragment a;

                public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
                {
                    if (CosmosTestFragment.a(a))
                    {
                        CosmosTestFragment.j(a);
                    }
                    CosmosTestFragment.b(a, false);
                }

            
            {
                a = CosmosTestFragment.this;
                super();
            }
            });
            am = (ScrollView)layoutinflater.findViewById(0x7f110363);
            al = (TextView)layoutinflater.findViewById(0x7f110364);
            return layoutinflater;
        }
    }

    public final String a(Context context, Flags flags)
    {
        return "Cosmos Test";
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a = new Handler(Looper.getMainLooper());
        b = Cosmos.getResolver(k());
        Y = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(b, "spotify:internal:cosmos-test", FeatureIdentifier.a, FeatureIdentifier.a);
        b.registerConnectionCallback(new com.spotify.cosmos.android.Resolver.ConnectionCallback() {

            public final void onServiceConnected(Resolver resolver)
            {
                Logger.a("Connected to service", new Object[0]);
            }

            public final void onServiceConnectionFailed(Resolver resolver, com.spotify.cosmos.android.Resolver.ConnectionError connectionerror)
            {
                Logger.c("Connection to service failed: %s", new Object[] {
                    connectionerror.name()
                });
            }

            public final void onServiceDisconnected(Resolver resolver)
            {
                Logger.a("Service disconnected", new Object[0]);
            }

        });
        Y.registerPlayerStateObserver(at);
        b.connect();
        ap.add(PlayerTrack.create("spotify:track:7vzczp2f2qK3YywNkZ2uo5", "spotify:album:5NrFMOprmnMEf4gMnLaHcq", "spotify:artist:163tK9Wjr9P9DmM0AVK7lm"));
        ap.add(PlayerTrack.create("spotify:track:5z2YdsdkDtaYNbbNLguNlC", "spotify:album:5NrFMOprmnMEf4gMnLaHcq", "spotify:artist:163tK9Wjr9P9DmM0AVK7lm"));
        ap.add(PlayerTrack.create("spotify:track:4zztp85oS36ijgAWwyhX8p", "spotify:album:5NrFMOprmnMEf4gMnLaHcq", "spotify:artist:163tK9Wjr9P9DmM0AVK7lm"));
        ap.add(PlayerTrack.create("spotify:track:1n46BBFHozz6jDufJ81BDT", "spotify:album:5NrFMOprmnMEf4gMnLaHcq", "spotify:artist:163tK9Wjr9P9DmM0AVK7lm"));
        ap.add(PlayerTrack.create("spotify:track:0i7Hh51R5z3Y32tJPFV54V", "spotify:album:5NrFMOprmnMEf4gMnLaHcq", "spotify:artist:163tK9Wjr9P9DmM0AVK7lm"));
        ap.add(PlayerTrack.create("spotify:track:1RjUaJM9aKGixVZlbcFUZv", "spotify:album:5NrFMOprmnMEf4gMnLaHcq", "spotify:artist:163tK9Wjr9P9DmM0AVK7lm"));
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.a;
    }

    static 
    {
        boolean flag;
        if (!com/spotify/mobile/android/ui/fragments/CosmosTestFragment.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        av = flag;
    }

    private class PlaybackTypes extends Enum
    {

        public static final PlaybackTypes a;
        public static final PlaybackTypes b;
        public static final PlaybackTypes c;
        public static final PlaybackTypes d;
        public static final PlaybackTypes e;
        private static final PlaybackTypes f[];

        public static PlaybackTypes valueOf(String s)
        {
            return (PlaybackTypes)Enum.valueOf(com/spotify/mobile/android/ui/fragments/CosmosTestFragment$PlaybackTypes, s);
        }

        public static PlaybackTypes[] values()
        {
            return (PlaybackTypes[])f.clone();
        }

        static 
        {
            a = new PlaybackTypes("TRACKS_LIST", 0);
            b = new PlaybackTypes("ALBUM_URI", 1);
            c = new PlaybackTypes("ARTIST_URI", 2);
            d = new PlaybackTypes("PLAYLIST_URI", 3);
            e = new PlaybackTypes("UNDEFINED", 4);
            f = (new PlaybackTypes[] {
                a, b, c, d, e
            });
        }

        private PlaybackTypes(String s, int i1)
        {
            super(s, i1);
        }
    }

}
