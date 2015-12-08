// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.ParserException;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.spotify.music.spotlets.radio.model.ClusterRadioStationModel;
import com.spotify.music.spotlets.radio.model.CreateRadioStationModel;
import com.spotify.music.spotlets.radio.model.MultiSaveStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.model.SavedStationModel;
import com.spotify.music.spotlets.radio.model.StationEntitySession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class gox
{

    private static final Set i = new HashSet(Collections.singletonList("disallow-mft-radio"));
    private static final Set j = new HashSet(Collections.singletonList("disallow-radio"));
    public final Resolver a;
    public final Player b;
    public final Context c;
    public final gpd d;
    public final gph e;
    public final gpe f = new gpe() {

        private gox a;

        public final void a()
        {
            Logger.b("Got an error from the backend. Maybe our model is not synced? Refreshing", new Object[0]);
            a.b();
        }

        public final volatile void a(Object obj)
        {
        }

            
            {
                a = gox.this;
                super();
            }
    };
    public boolean g;
    public boolean h;
    private final gpf k = new gpf() {

        public final void a()
        {
        }

        public final volatile void a(Object obj)
        {
        }

    };
    private final gpf l = new gpf() {

        private gox a;

        public final void a()
        {
            gox.a(a).a();
        }

        public final void a(Object obj)
        {
            obj = (RadioStationsModel)obj;
            gph gph1 = gox.a(a);
            if (obj != null && !gph1.b.equals(obj))
            {
                RadioStationModel aradiostationmodel[] = ((RadioStationsModel) (obj)).genreStations;
                int j1 = aradiostationmodel.length;
                for (int i1 = 0; i1 < j1; i1++)
                {
                    RadioStationModel radiostationmodel = aradiostationmodel[i1];
                    if (radiostationmodel.seeds.length > 0)
                    {
                        gdr.b(radiostationmodel.seeds[0], radiostationmodel.title);
                        gdr.a(radiostationmodel.seeds[0], radiostationmodel.imageUri);
                    }
                }

                gph1.b = ((RadioStationsModel) (obj));
                gph1.b();
            }
        }

            
            {
                a = gox.this;
                super();
            }
    };

    public gox(Context context)
    {
        dmz.a(fop);
        ctz.a(context);
        c = context;
        a = Cosmos.getResolver(c);
        d = new gpd(a);
        b = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(a, "radio", FeatureIdentifier.U, "apollo", FeatureIdentifier.U);
        e = new gph(context);
    }

    private PlayerContext a(RadioStationModel radiostationmodel, RadioStationTracksModel radiostationtracksmodel)
    {
        PlayerContextPage playercontextpage = new PlayerContextPage(null, radiostationtracksmodel.nextPageUrl, radiostationtracksmodel.tracks, null);
        HashMap hashmap = new HashMap();
        radiostationtracksmodel = radiostationmodel.title;
        if (radiostationtracksmodel == null)
        {
            radiostationtracksmodel = "";
        }
        hashmap.put("context_description", radiostationtracksmodel);
        radiostationtracksmodel = radiostationmodel.imageUri;
        if (radiostationtracksmodel == null)
        {
            radiostationtracksmodel = "";
        }
        hashmap.put("image_url", radiostationtracksmodel);
        radiostationtracksmodel = radiostationmodel.getPlayerContextUri();
        if (h)
        {
            radiostationmodel = new PlayerRestrictions(Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), j, j, j, Collections.emptySet(), Collections.emptySet(), Collections.emptySet());
        } else
        {
            radiostationmodel = new PlayerRestrictions(Collections.emptySet(), Collections.emptySet(), i, Collections.emptySet(), i, Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), j, j, j, i, Collections.emptySet(), Collections.emptySet());
        }
        return new PlayerContext(radiostationtracksmodel, hashmap, radiostationmodel, new PlayerContextPage[] {
            playercontextpage
        }, null);
    }

    static PlayerContext a(gox gox1, RadioStationModel radiostationmodel, RadioStationTracksModel radiostationtracksmodel)
    {
        return gox1.a(radiostationmodel, radiostationtracksmodel);
    }

    static gph a(gox gox1)
    {
        return gox1.e;
    }

    private void a(RadioStationModel radiostationmodel, RadioStationTracksModel radiostationtracksmodel, int i1, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, boolean flag)
    {
        e.a(radiostationmodel, radiostationtracksmodel, verified, subview);
        radiostationtracksmodel = a(radiostationmodel, radiostationtracksmodel);
        com.spotify.mobile.android.cosmos.player.v2.PlayOptions playoptions = (new com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder()).skipToIndex(0, i1).playerOptionsOverride(false, false, false).build();
        String s = Arrays.toString(radiostationmodel.seeds);
        b.playWithViewUri(radiostationtracksmodel, playoptions, radiostationmodel.getPlayerContextUri(), new com.spotify.mobile.android.cosmos.player.v2.Player.PlayCallback(radiostationmodel, s, verified, subview) {

            private RadioStationModel a;
            private String b;
            private Verified c;
            private com.spotify.mobile.android.util.viewuri.ViewUri.SubView d;
            private gox e;

            public final void onPlayForbidden(List list)
            {
                gox.a(e, com.spotify.mobile.android.util.ClientEvent.Event.b, a.uri, b, c, d);
                Logger.b("Play Forbidden when starting Radio station %s with seed %s. Reasons: %s", new Object[] {
                    a.uri, b, TextUtils.join(",", list)
                });
            }

            public final void onPlaySuccess()
            {
                gox.a(e, com.spotify.mobile.android.util.ClientEvent.Event.v, a.uri, b, c, d);
            }

            
            {
                e = gox.this;
                a = radiostationmodel;
                b = s;
                c = verified;
                d = subview;
                super();
            }
        });
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        radiostationtracksmodel = d;
        subview = new CreateRadioStationModel(radiostationmodel);
        radiostationmodel = k;
        ctz.a(subview);
        ctz.a(radiostationmodel);
        verified = String.format(Locale.US, "hm://radio-apollo/v3/stations?count=0&send_station=false&language=%s", new Object[] {
            ghq.a(Locale.getDefault())
        });
        ((gpd) (radiostationtracksmodel)).a.a(RequestBuilder.post(verified, subview).build(), 15000L).a(gpd.a(radiostationmodel, verified));
        return;
        radiostationtracksmodel;
        Logger.a(radiostationtracksmodel, "Failed to parse NewRadioStationModel object for '%s' backend action.", new Object[] {
            verified
        });
        radiostationmodel.a();
        return;
    }

    static void a(gox gox1, com.spotify.mobile.android.util.ClientEvent.Event event, String s, String s1, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
    {
        gox1.a(event, s, s1, verified, subview);
    }

    static void a(gox gox1, RadioStationModel radiostationmodel, RadioStationTracksModel radiostationtracksmodel, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, boolean flag)
    {
        gox1.a(radiostationmodel, radiostationtracksmodel, 0, verified, subview, flag);
    }

    static Context b(gox gox1)
    {
        return gox1.c;
    }

    private void b(String as[], Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, boolean flag)
    {
        ctz.a(as);
        CreateRadioStationModel createradiostationmodel;
        gpd gpd1;
        boolean flag1;
        if (as.length > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ctz.b(flag1);
        createradiostationmodel = new CreateRadioStationModel(as);
        gpd1 = d;
        as = new goz(this, as, verified, subview, flag);
        ctz.a(createradiostationmodel);
        ctz.a(as);
        verified = String.format(Locale.US, "hm://radio-apollo/v3/stations?language=%s", new Object[] {
            ghq.a(Locale.getDefault())
        });
        try
        {
            gpd1.a.a(RequestBuilder.post(verified, createradiostationmodel).build(), 15000L).a(gpd.a(as, verified));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
        {
            Logger.a(subview, "Failed to parse NewRadioStationModel object for '%s' backend action.", new Object[] {
                verified
            });
        }
        as.a();
    }

    static Player c(gox gox1)
    {
        return gox1.b;
    }

    static boolean d(gox gox1)
    {
        return gox1.g;
    }

    public final void a()
    {
        a.disconnect();
        gph gph1 = e;
        b.unregisterPlayerStateObserver(gph1.c);
        gph1.f = null;
    }

    public final void a(com.spotify.mobile.android.util.ClientEvent.Event event, String s, String s1, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
    {
        event = new ClientEvent(event);
        if (!TextUtils.isEmpty(s))
        {
            event.a("station-id", s);
        }
        if (!TextUtils.isEmpty(s1))
        {
            event.a("seeds", s1);
        }
        fop.a(c, verified, subview, event);
    }

    public final void a(ClusterRadioStationModel clusterradiostationmodel)
    {
        gph gph1;
        Iterator iterator;
        e.a(clusterradiostationmodel, false);
        gph1 = e;
        iterator = gph1.h.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        ClusterRadioStationModel clusterradiostationmodel1 = (ClusterRadioStationModel)iterator.next();
        if (!clusterradiostationmodel1.uri.equals(clusterradiostationmodel.uri)) goto _L4; else goto _L3
_L3:
        int i1;
        if (clusterradiostationmodel1 == null)
        {
            i1 = 0;
        } else
        {
            ArrayList arraylist1 = new ArrayList(Arrays.asList(gph1.g.seeds));
            int j1 = 0;
            i1 = 0;
            if (gph1.h.size() > 1)
            {
                ArrayList arraylist = new ArrayList(Arrays.asList(gph1.g.tracks));
                arraylist1.remove(clusterradiostationmodel.seeds[0]);
                clusterradiostationmodel = clusterradiostationmodel1.tracks;
                int k1 = clusterradiostationmodel.length;
                for (j1 = 0; j1 < k1; j1++)
                {
                    if (clusterradiostationmodel[j1].uri().equals(gph1.d.d))
                    {
                        i1 = 1;
                    }
                }

                arraylist.removeAll(Arrays.asList(clusterradiostationmodel1.tracks));
                clusterradiostationmodel = (String[])arraylist1.toArray(new String[arraylist1.size()]);
                PlayerTrack aplayertrack[] = (PlayerTrack[])arraylist.toArray(new PlayerTrack[arraylist.size()]);
                gph1.g = new ClusterRadioStationModel(gph1.g.uri, gph1.g.title, gph1.g.titleUri, gph1.g.imageUri, gph1.g.subtitle, gph1.g.subtitleUri, clusterradiostationmodel, gph1.g.relatedArtists, aplayertrack, gph1.g.nextPageUrl, gph1.g.explicitSave, gph1.g.username, gph1.g.clusterType, gph1.g.description);
            } else
            {
                gph1.g = null;
                i1 = j1;
            }
            gph1.h.remove(clusterradiostationmodel1);
        }
        clusterradiostationmodel = e.g;
        if (clusterradiostationmodel != null)
        {
            clusterradiostationmodel = a(((RadioStationModel) (clusterradiostationmodel)), new RadioStationTracksModel(clusterradiostationmodel.tracks, clusterradiostationmodel.nextPageUrl));
            b.updateWithContext(clusterradiostationmodel);
            if (i1 != 0)
            {
                b.skipToNextTrack();
            }
            return;
        } else
        {
            b.pause();
            return;
        }
_L2:
        clusterradiostationmodel1 = null;
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final void a(ClusterRadioStationModel clusterradiostationmodel, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
    {
        if (clusterradiostationmodel == null)
        {
            return;
        } else
        {
            e.a(clusterradiostationmodel, true);
            d.a(clusterradiostationmodel.uri, new goy(this, clusterradiostationmodel, verified, subview));
            return;
        }
    }

    public final void a(RadioStationModel radiostationmodel, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
    {
        if (!g)
        {
            return;
        }
        String s = gpl.d(radiostationmodel.uri);
        a(com.spotify.mobile.android.util.ClientEvent.Event.x, radiostationmodel.uri, s, verified, subview);
        verified = d;
        radiostationmodel = new gpe(radiostationmodel) {

            private RadioStationModel a;
            private gox b;

            public final void a()
            {
                dmz.a(ggc);
                ggc.h(gox.b(b));
            }

            public final void a(Object obj)
            {
                obj = gox.a(b);
                RadioStationModel radiostationmodel1 = a;
                ((gph) (obj)).a(radiostationmodel1, true);
                ((gph) (obj)).a(Collections.singletonList(radiostationmodel1));
            }

            
            {
                b = gox.this;
                a = radiostationmodel;
                super();
            }
        };
        geh.a(s, "seedUri can not be empty.");
        ctz.a(radiostationmodel);
        subview = new SavedStationModel(s);
        try
        {
            ((gpd) (verified)).e.a(RequestBuilder.put("hm://radio-apollo/v3/saved-station", subview).build(), 15000L).a(gpd.a(radiostationmodel, "hm://radio-apollo/v3/saved-station"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Verified verified)
        {
            Logger.a(verified, "Failed to parse SavedStationModel object for '%s' backend action.", new Object[] {
                "hm://radio-apollo/v3/saved-station"
            });
        }
        radiostationmodel.a();
    }

    public final void a(RadioStationModel radiostationmodel, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, int i1)
    {
        if (i1 < 0)
        {
            StationEntitySession stationentitysession = e.a(radiostationmodel.stationUri);
            if (stationentitysession != null)
            {
                radiostationmodel = stationentitysession.getRadioStationModel();
                i1 = stationentitysession.getIndex();
            }
            i1 = Math.max(i1, 0);
        }
        e.a(radiostationmodel);
        if (radiostationmodel.tracks.length == 0 || TextUtils.isEmpty(radiostationmodel.nextPageUrl))
        {
            d.a(radiostationmodel.uri, new gpb(this, radiostationmodel, verified, subview));
            return;
        } else
        {
            a(radiostationmodel, new RadioStationTracksModel(radiostationmodel.tracks, radiostationmodel.nextPageUrl), i1, verified, subview, true);
            return;
        }
    }

    public final void a(List list)
    {
        if (!g)
        {
            return;
        }
        String as[] = new String[((List)ctz.a(list)).size()];
        for (int i1 = 0; i1 < list.size(); i1++)
        {
            as[i1] = ((RadioStationModel)ctz.a(list.get(i1))).getStationSeed();
        }

        gpd gpd1 = d;
        list = new gpe(list) {

            private List a;
            private gox b;

            public final void a()
            {
                dmz.a(ggc);
                ggc.h(gox.b(b));
                gox.a(b).a();
            }

            public final volatile void a(Object obj)
            {
                gox.a(b).a(a);
            }

            
            {
                b = gox.this;
                a = list;
                super();
            }
        };
        ctz.a(as);
        ctz.a(list);
        MultiSaveStationModel multisavestationmodel = new MultiSaveStationModel(as);
        try
        {
            gpd1.e.a(RequestBuilder.put("hm://radio-apollo/v3/saved-station-multi", multisavestationmodel).build(), 15000L).a(gpd.a(list, "hm://radio-apollo/v3/saved-station-multi"));
            return;
        }
        catch (ParserException parserexception)
        {
            Logger.a(parserexception, "Failed to parse MultiSaveStationModel object for '%s' backend action.", new Object[] {
                "hm://radio-apollo/v3/saved-station-multi"
            });
        }
        list.a();
    }

    public final void a(List list, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
    {
        e.a(true);
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            ClusterRadioStationModel clusterradiostationmodel = (ClusterRadioStationModel)list.next();
            if (!clusterradiostationmodel.getPlaying())
            {
                d.a(clusterradiostationmodel.uri, new goy(this, clusterradiostationmodel, verified, subview));
            }
        } while (true);
    }

    public final void a(String as[], Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, boolean flag)
    {
        RadioStationModel aradiostationmodel[];
        int i1;
        int j1;
        int k1;
        boolean flag1;
        flag1 = false;
        j1 = 0;
        if (g)
        {
            Object obj = ViewUri.V.a(gpl.b(as[0]));
            obj = e.a(((Verified) (obj)));
            if (obj != null)
            {
                as = ((StationEntitySession) (obj)).getRadioStationModel();
                a(((RadioStationModel) (as)), verified, subview, -1);
                if (flag && !((RadioStationModel) (as)).explicitSave)
                {
                    a(((RadioStationModel) (as)), verified, subview);
                }
                return;
            } else
            {
                b(as, verified, subview, flag);
                return;
            }
        }
        gph gph1 = e;
        ctz.a(gph1.b.userStations);
        aradiostationmodel = gph1.b.userStations;
        k1 = aradiostationmodel.length;
        i1 = 0;
_L4:
        RadioStationModel radiostationmodel;
        if (i1 >= k1)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        radiostationmodel = aradiostationmodel[i1];
        ctz.a(radiostationmodel);
        if (!Arrays.equals(as, radiostationmodel.seeds)) goto _L2; else goto _L1
_L1:
        if (radiostationmodel == null)
        {
            break MISSING_BLOCK_LABEL_353;
        }
        as = (gpk)e.e.get(radiostationmodel.uri);
        if (as != null)
        {
            if (((gpk) (as)).d || ((gpk) (as)).b.tracks.length == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 == 0)
            {
                if (((gpk) (as)).b.tracks.length == 0)
                {
                    i1 = j1;
                } else
                {
                    flag = flag1;
                    if (((gpk) (as)).c >= 0)
                    {
                        flag = flag1;
                        if (((gpk) (as)).c < ((gpk) (as)).b.tracks.length)
                        {
                            flag = true;
                        }
                    }
                    Assertion.a(flag, "mIndex is out of mTracksModel.tracks range");
                    i1 = ((gpk) (as)).c;
                }
                j1 = ((gpk) (as)).b.tracks.length;
                a(radiostationmodel, ((gpk) (as)).b, (i1 + 1) % j1, verified, subview, true);
                return;
            }
        }
        break MISSING_BLOCK_LABEL_328;
_L2:
        i1++;
        continue; /* Loop/switch isn't completed */
        radiostationmodel = null;
          goto _L1
        d.a(radiostationmodel.uri, new gpb(this, radiostationmodel, verified, subview));
        return;
        b(as, verified, subview, false);
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b()
    {
        gpd gpd1 = d;
        gpf gpf1 = l;
        ctz.a(gpf1);
        String s = String.format(Locale.US, "hm://radio-apollo/v3/all?language=%s", new Object[] {
            ghq.a(Locale.getDefault())
        });
        gpd1.d.a(RequestBuilder.get(s).build(), 15000L).a(gpd.a(gpf1, s));
    }

    public final void c()
    {
        e.a(false);
        ClusterRadioStationModel clusterradiostationmodel = e.g;
        String s = clusterradiostationmodel.nextPageUrl;
        b.fetchState(new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver(s, clusterradiostationmodel) {

            private String a;
            private ClusterRadioStationModel b;
            private gox c;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                playerstate = playerstate.track();
                String s1 = a;
                playerstate = new RadioStationTracksModel(new PlayerTrack[] {
                    playerstate
                }, s1);
                playerstate = gox.a(c, b, playerstate);
                gox.c(c).updateWithContext(playerstate);
                playerstate = gox.a(c);
                ((gph) (playerstate)).h.clear();
                playerstate.g = null;
            }

            
            {
                c = gox.this;
                a = s;
                b = clusterradiostationmodel;
                super();
            }
        });
    }


    // Unreferenced inner class gox$7

/* anonymous class */
    public final class _cls7
        implements gpe
    {

        private String a;
        private gox b;

        public final void a()
        {
            dmz.a(ggc);
            ggc.a(gox.b(b), 0x7f080571, 0, new Object[0]);
        }

        public final void a(Object obj)
        {
            obj = gox.a(b);
            RadioStationModel radiostationmodel = ((gph) (obj)).b(a);
            if (radiostationmodel != null)
            {
                ArrayList arraylist = new ArrayList(((gph) (obj)).b.savedStations.length);
                RadioStationModel aradiostationmodel[] = ((gph) (obj)).b.savedStations;
                int j1 = aradiostationmodel.length;
                for (int i1 = 0; i1 < j1; i1++)
                {
                    RadioStationModel radiostationmodel1 = aradiostationmodel[i1];
                    if (radiostationmodel1 != radiostationmodel)
                    {
                        arraylist.add(radiostationmodel1);
                    }
                }

                aradiostationmodel = new RadioStationModel[arraylist.size()];
                arraylist.toArray(aradiostationmodel);
                obj.b = new RadioStationsModel(((gph) (obj)).b.userStations, ((gph) (obj)).b.recommendedStations, ((gph) (obj)).b.genreStations, aradiostationmodel, ((gph) (obj)).b.clusterStations);
                ((gph) (obj)).a(radiostationmodel, false);
                ((gph) (obj)).b();
                ((gph) (obj)).a(radiostationmodel.stationUri, false);
            }
        }

            public 
            {
                b = gox.this;
                a = s;
                super();
            }
    }

}
