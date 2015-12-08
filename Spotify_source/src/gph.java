// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContextIndex;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.radio.model.ClusterRadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.model.StationEntitySession;
import com.spotify.music.spotlets.radio.model.ThumbState;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class gph
{

    private static gip i = gip.b("radio-session-state-station");
    private static gip j = gip.b("radio-session-state-tracks");
    private static gip k = gip.b("radio-session-state-entity");
    final List a;
    public RadioStationsModel b;
    public final com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver c;
    public final gpg d;
    final Map e;
    public Player f;
    ClusterRadioStationModel g;
    List h;
    private final ObjectMapper l;
    private final gin m;
    private Map n;

    gph(Context context)
    {
        a = new ArrayList();
        b = new RadioStationsModel(new RadioStationModel[0], new RadioStationModel[0], new RadioStationModel[0], new RadioStationModel[0], new ClusterRadioStationModel[0]);
        c = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            private gph a;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                if (playerstate != null) goto _L2; else goto _L1
_L1:
                return;
_L2:
                Object obj2;
                int i1;
                boolean flag1;
                boolean flag2;
                if (gpl.f(playerstate.entityUri()))
                {
                    gph.a(a, playerstate);
                }
                String s;
                gpg gpg1;
                int j1;
                if (playerstate.track() == null)
                {
                    s = "";
                } else
                {
                    s = playerstate.track().uri();
                }
                if (playerstate.index() == null || playerstate.index().track() < 0)
                {
                    i1 = 0;
                } else
                {
                    i1 = playerstate.index().track();
                }
                gpg1 = gph.a(a);
                obj2 = playerstate.entityUri();
                if (!cty.a(obj2, gpg1.c))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (!cty.a(s, gpg1.d))
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                flag2 = flag1 | flag2;
                gpg1.c = ((String) (obj2));
                gpg1.d = s;
                if (!flag2) goto _L4; else goto _L3
_L3:
                obj2 = gpg1.b;
                if (s.length() > 14)
                {
                    ((gpk) (obj2)).g.add(s.substring(14));
                }
                if (((gpk) (obj2)).b.tracks.length == 0) goto _L6; else goto _L5
_L5:
                j1 = i1 % ((gpk) (obj2)).b.tracks.length;
                flag1 = false;
                i1 = j1;
_L9:
                if (s.equals(((gpk) (obj2)).b.tracks[i1].uri()))
                {
                    break MISSING_BLOCK_LABEL_378;
                }
                if (!flag1 || j1 != i1) goto _L8; else goto _L7
_L7:
                Logger.b("Could not find track uri %s. Keeping stuff as is.", new Object[] {
                    s
                });
_L6:
                gpg1.e = false;
_L4:
                int k1;
                if (gpl.f(gph.a(a).c) && !gph.a(a).b())
                {
                    if (playerstate.track() == null || TextUtils.isEmpty(playerstate.track().uri()))
                    {
                        i1 = gph.a(a, true) | flag2;
                    } else
                    {
                        i1 = gph.a(a, false) | flag2;
                    }
                } else
                {
                    i1 = ((flag2) ? 1 : 0);
                }
                if (i1 != 0)
                {
                    gph.b(a);
                    return;
                }
                  goto _L1
_L8:
                k1 = i1 + 1;
                i1 = k1;
                if (k1 == ((gpk) (obj2)).b.tracks.length)
                {
                    flag1 = true;
                    i1 = 0;
                }
                  goto _L9
                obj2.c = i1;
                if ((double)((gpk) (obj2)).c > (double)((gpk) (obj2)).b.tracks.length * 0.75D)
                {
                    obj2.d = true;
                }
                  goto _L6
            }

            
            {
                a = gph.this;
                super();
            }
        };
        e = new HashMap();
        n = new HashMap();
        ctz.a(context);
        m = ((giq)dmz.a(giq)).b(context);
        l = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        d = new gpg();
        g = null;
        h = new ArrayList();
        Object obj;
        Object obj1;
        obj = m.a(i, "");
        obj1 = m.a(j, "");
        context = m.a(k, "");
        if (TextUtils.isEmpty(((CharSequence) (obj))) || TextUtils.isEmpty(((CharSequence) (obj1)))) goto _L2; else goto _L1
_L1:
        obj = (RadioStationModel)l.readValue(((String) (obj)), com/spotify/music/spotlets/radio/model/RadioStationModel);
        obj1 = (RadioStationTracksModel)l.readValue(((String) (obj1)), com/spotify/music/spotlets/radio/model/RadioStationTracksModel);
        if (obj == null || obj1 == null) goto _L4; else goto _L3
_L3:
        if (TextUtils.isEmpty(((RadioStationModel) (obj)).uri) || ((RadioStationModel) (obj)).seeds.length <= 0 || TextUtils.isEmpty(((RadioStationTracksModel) (obj1)).nextPageUrl) || ((RadioStationTracksModel) (obj1)).tracks == null || ((RadioStationTracksModel) (obj1)).tracks.length <= 0) goto _L4; else goto _L5
_L5:
        boolean flag = true;
_L8:
        if (!flag) goto _L2; else goto _L6
_L6:
        obj1 = new gpk(((RadioStationTracksModel) (obj1)), ViewUri.h, null);
        e.put(((RadioStationModel) (obj)).uri, obj1);
        d.a(((RadioStationModel) (obj)), ((gpk) (obj1)));
        b(((RadioStationModel) (obj)));
_L2:
        if (!TextUtils.isEmpty(context))
        {
            n = (Map)l.readValue(context, l.getTypeFactory().constructMapType(java/util/HashMap, java/lang/String, com/spotify/music/spotlets/radio/model/StationEntitySession));
            e();
        }
        return;
_L4:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
        context;
        Logger.a(context, "Failed to restore radio session", new Object[0]);
        return;
    }

    static gpg a(gph gph1)
    {
        return gph1.d;
    }

    static void a(gph gph1, PlayerState playerstate)
    {
        Object obj = gpl.b(gpl.c(playerstate.entityUri()));
        obj = gph1.a(ViewUri.V.a(((String) (obj))));
        if (obj != null)
        {
            PlayerTrack playertrack = ((StationEntitySession) (obj)).getCurrentTrack();
            playerstate = playerstate.track();
            if (playerstate != null && !PlayerTrackUtil.isAd(playerstate) && gph1.f != null && (playertrack == null || !TextUtils.equals(playertrack.uid(), playerstate.uid())))
            {
                gph1.f.fetchState(gph1. new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver(((StationEntitySession) (obj))) {

                    private StationEntitySession a;
                    private gph b;

                    public final void onPlayerStateReceived(PlayerState playerstate1)
                    {
                        a.updateTracks(playerstate1);
                        gph.c(b);
                    }

            
            {
                b = gph.this;
                a = stationentitysession;
                super();
            }
                }, 14, 14);
            }
        }
    }

    static boolean a(gph gph1, boolean flag)
    {
        gpg gpg1 = gph1.d;
        boolean flag1;
        if (gpl.f(gpg1.c) && gpg1.f)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 != flag)
        {
            gph1.d.f = flag;
            return true;
        } else
        {
            return false;
        }
    }

    private void b(RadioStationModel radiostationmodel)
    {
        StationEntitySession stationentitysession = a(radiostationmodel.stationUri);
        if (stationentitysession == null)
        {
            stationentitysession = new StationEntitySession(radiostationmodel, 0, System.currentTimeMillis());
        } else
        {
            stationentitysession.updateStationModel(radiostationmodel);
        }
        n.put(radiostationmodel.uri, stationentitysession);
    }

    private void b(RadioStationModel radiostationmodel, RadioStationTracksModel radiostationtracksmodel, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
    {
        RadioStationModel radiostationmodel1 = new RadioStationModel(radiostationmodel, radiostationtracksmodel);
        radiostationmodel = (gpk)e.get(radiostationmodel1.uri);
        if (radiostationmodel == null)
        {
            radiostationmodel = new gpk(radiostationtracksmodel, verified, subview);
        } else
        {
            radiostationmodel.a(radiostationtracksmodel);
        }
        e.put(radiostationmodel1.uri, radiostationmodel);
        b(radiostationmodel1);
        verified = m.b();
        verified.a(i).a(j);
        subview = l.writeValueAsString(radiostationmodel1);
        if (radiostationtracksmodel != null)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        radiostationtracksmodel = null;
_L1:
        try
        {
            if (!TextUtils.isEmpty(subview) && !TextUtils.isEmpty(radiostationtracksmodel))
            {
                verified.a(i, subview).a(j, radiostationtracksmodel);
            }
        }
        // Misplaced declaration of an exception variable
        catch (RadioStationTracksModel radiostationtracksmodel)
        {
            Logger.a(radiostationtracksmodel, "Failed to save radio session", new Object[0]);
        }
        verified.b();
        d();
        d.a(radiostationmodel1, radiostationmodel);
        f();
        return;
        radiostationtracksmodel = l.writeValueAsString(radiostationtracksmodel);
          goto _L1
    }

    static void b(gph gph1)
    {
        gph1.f();
    }

    static void c(gph gph1)
    {
        gph1.d();
    }

    private void d()
    {
        gio gio1 = m.b();
        gio1.a(k);
        try
        {
            String s = l.writeValueAsString(n);
            if (!TextUtils.isEmpty(s))
            {
                gio1.a(k, s);
            }
        }
        catch (JsonProcessingException jsonprocessingexception)
        {
            Logger.a(jsonprocessingexception, "Failed to save radio station sessions", new Object[0]);
        }
        gio1.b();
    }

    private void e()
    {
        Iterator iterator;
        long l1;
        l1 = System.currentTimeMillis();
        iterator = n.entrySet().iterator();
_L8:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        java.util.Map.Entry entry;
        Object obj;
        entry = (java.util.Map.Entry)iterator.next();
        obj = (StationEntitySession)entry.getValue();
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj = ((StationEntitySession) (obj)).getRadioStationModel();
        if (TextUtils.isEmpty(((RadioStationModel) (obj)).uri) || TextUtils.isEmpty(((RadioStationModel) (obj)).nextPageUrl) || ((RadioStationModel) (obj)).seeds.length <= 0 || ((RadioStationModel) (obj)).tracks == null || ((RadioStationModel) (obj)).tracks.length <= 0) goto _L4; else goto _L5
_L5:
        boolean flag = true;
_L6:
        if (!flag || l1 - ((StationEntitySession)entry.getValue()).getLastUpdateTime() >= 0x1b77400L)
        {
            iterator.remove();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        flag = false;
        if (true) goto _L6; else goto _L2
_L2:
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void f()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gpi)iterator.next()).a(d)) { }
    }

    public final RadioStationModel a(String s)
    {
        RadioStationModel aradiostationmodel[] = b.userStations;
        int j1 = aradiostationmodel.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            RadioStationModel radiostationmodel = aradiostationmodel[i1];
            if (radiostationmodel.uri.equals(s))
            {
                return radiostationmodel;
            }
        }

        return null;
    }

    public final StationEntitySession a(Verified verified)
    {
        verified = (StationEntitySession)n.get(verified.toString());
        if (verified != null && System.currentTimeMillis() - verified.getLastUpdateTime() < 0x1b77400L)
        {
            return verified;
        } else
        {
            return null;
        }
    }

    public final void a()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gpi)iterator.next()).p()) { }
    }

    final void a(Verified verified, boolean flag)
    {
        verified = a(verified);
        if (verified != null)
        {
            verified.updateFollowing(flag);
            d();
        }
    }

    public final void a(ClusterRadioStationModel clusterradiostationmodel, boolean flag)
    {
        ClusterRadioStationModel aclusterradiostationmodel[] = b.clusterStations;
        int j1 = aclusterradiostationmodel.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            ClusterRadioStationModel clusterradiostationmodel1 = aclusterradiostationmodel[i1];
            if (clusterradiostationmodel1.uri.equals(clusterradiostationmodel.uri))
            {
                clusterradiostationmodel1.setPlaying(flag);
            }
        }

        b();
    }

    public final void a(RadioStationModel radiostationmodel)
    {
        ctz.a(radiostationmodel);
        ArrayList arraylist = new ArrayList(b.userStations.length + 1);
        arraylist.add(radiostationmodel);
        RadioStationModel aradiostationmodel[] = b.userStations;
        int j1 = aradiostationmodel.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            RadioStationModel radiostationmodel1 = aradiostationmodel[i1];
            if (!radiostationmodel1.uri.equals(radiostationmodel.uri))
            {
                arraylist.add(radiostationmodel1);
            }
        }

        b = new RadioStationsModel((RadioStationModel[])arraylist.toArray(new RadioStationModel[arraylist.size()]), b.recommendedStations, b.genreStations, b.savedStations, b.clusterStations);
        b();
    }

    public final void a(RadioStationModel radiostationmodel, RadioStationTracksModel radiostationtracksmodel, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
    {
        ArrayList arraylist = new ArrayList(b.userStations.length);
        RadioStationModel aradiostationmodel[] = b.userStations;
        int j1 = aradiostationmodel.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            RadioStationModel radiostationmodel1 = aradiostationmodel[i1];
            if (radiostationmodel1.getStationSeed().equals(radiostationmodel.getStationSeed()))
            {
                arraylist.add(0, radiostationmodel1);
            } else
            {
                arraylist.add(radiostationmodel1);
            }
            i1++;
        }
        aradiostationmodel = new RadioStationModel[arraylist.size()];
        arraylist.toArray(aradiostationmodel);
        b = new RadioStationsModel(aradiostationmodel, b.recommendedStations, b.genreStations, b.savedStations, b.clusterStations);
        b();
        b(radiostationmodel, radiostationtracksmodel, verified, subview);
    }

    final void a(RadioStationModel radiostationmodel, boolean flag)
    {
        ArrayList arraylist = new ArrayList(b.userStations.length);
        RadioStationModel aradiostationmodel[] = b.userStations;
        int j1 = aradiostationmodel.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            RadioStationModel radiostationmodel1 = aradiostationmodel[i1];
            if (radiostationmodel1.getStationSeed().equals(radiostationmodel.getStationSeed()))
            {
                arraylist.add(gpl.a(radiostationmodel, flag));
            } else
            {
                arraylist.add(radiostationmodel1);
            }
            i1++;
        }
        radiostationmodel = new RadioStationModel[arraylist.size()];
        arraylist.toArray(radiostationmodel);
        b = new RadioStationsModel(radiostationmodel, b.recommendedStations, b.genreStations, b.savedStations, b.clusterStations);
    }

    public final void a(ThumbState thumbstate)
    {
        Object obj;
        boolean flag1;
        flag1 = true;
        obj = d;
        if (gpl.f(((gpg) (obj)).c)) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        if (flag)
        {
            f();
        }
        return;
_L2:
        obj.e = true;
        gpk gpk1 = ((gpg) (obj)).b;
        obj = ((gpg) (obj)).d;
        flag = flag1;
        if (!cty.a(gpk1.a(((String) (obj))), thumbstate))
        {
            gpk1.a.put(obj, thumbstate);
            gpk1.d = true;
            flag = flag1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(List list)
    {
        ArrayList arraylist = new ArrayList();
        list = ((List)ctz.a(list)).iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            RadioStationModel radiostationmodel = (RadioStationModel)list.next();
            if (b(radiostationmodel.uri) == null)
            {
                arraylist.add(radiostationmodel);
                a(radiostationmodel.stationUri, true);
            }
        } while (true);
        list = (RadioStationModel[])arraylist.toArray(new RadioStationModel[b.savedStations.length + arraylist.size()]);
        System.arraycopy(b.savedStations, 0, list, arraylist.size(), b.savedStations.length);
        b = new RadioStationsModel(b.userStations, b.recommendedStations, b.genreStations, list, b.clusterStations);
        b();
    }

    public final void a(boolean flag)
    {
        ClusterRadioStationModel aclusterradiostationmodel[] = b.clusterStations;
        int j1 = aclusterradiostationmodel.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            ClusterRadioStationModel clusterradiostationmodel = aclusterradiostationmodel[i1];
            if (clusterradiostationmodel.getPlaying() != flag)
            {
                clusterradiostationmodel.setPlaying(flag);
            }
        }

        b();
    }

    public final RadioStationModel b(String s)
    {
        RadioStationModel aradiostationmodel[] = b.savedStations;
        int j1 = aradiostationmodel.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            RadioStationModel radiostationmodel = aradiostationmodel[i1];
            if (radiostationmodel.uri.equals(s))
            {
                return radiostationmodel;
            }
        }

        return null;
    }

    public final void b()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gpi)iterator.next()).a(b)) { }
    }

    public final void c()
    {
        boolean flag = false;
        gpg gpg1 = d;
        if (gpg1.e)
        {
            gpg1.e = false;
            flag = true;
        }
        if (flag)
        {
            f();
        }
    }

}
