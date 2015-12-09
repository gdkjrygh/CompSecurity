// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.music.spotlets.radio.model.ClusterRadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class goy
    implements gpf
{

    private ClusterRadioStationModel a;
    private final Verified b;
    private final com.spotify.mobile.android.util.viewuri.ViewUri.SubView c;
    private gox d;

    public goy(gox gox1, ClusterRadioStationModel clusterradiostationmodel, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
    {
        d = gox1;
        super();
        a = clusterradiostationmodel;
        b = verified;
        c = subview;
    }

    public final void a()
    {
        gox.a(d).a(a, false);
        dmz.a(ggc);
        ggc.d(gox.b(d));
        Logger.b("Failed to load tracks from the backend for station %s", new Object[] {
            a.uri
        });
    }

    public final void a(Object obj)
    {
        Object obj1 = (RadioStationTracksModel)obj;
        obj = gox.a(d);
        Object obj2 = a;
        ArrayList arraylist = new ArrayList(Arrays.asList(((RadioStationTracksModel) (obj1)).tracks));
        ((gph) (obj)).h.add(new ClusterRadioStationModel(((ClusterRadioStationModel) (obj2)), ((RadioStationTracksModel) (obj1))));
        if (((gph) (obj)).g != null)
        {
            ArrayList arraylist1 = new ArrayList(Arrays.asList(((gph) (obj)).g.tracks));
            obj1 = new ArrayList(Arrays.asList(((gph) (obj)).g.seeds));
            int k = ((gph) (obj)).g.seeds.length + 1;
            int j = k - 1;
            ((List) (obj1)).add(j, ((ClusterRadioStationModel) (obj2)).seeds[0]);
            obj2 = arraylist.iterator();
            int i = 0;
            do
            {
                if (!((Iterator) (obj2)).hasNext())
                {
                    break;
                }
                PlayerTrack playertrack = (PlayerTrack)((Iterator) (obj2)).next();
                if (j > arraylist1.size())
                {
                    break;
                }
                arraylist1.add(j, playertrack);
                j += k;
                i++;
            } while (true);
            if (i < arraylist.size())
            {
                arraylist1.addAll(arraylist.subList(i, arraylist.size()));
            }
            PlayerTrack aplayertrack[] = new PlayerTrack[arraylist1.size()];
            arraylist1.toArray(aplayertrack);
            String as[] = new String[((List) (obj1)).size()];
            ((List) (obj1)).toArray(as);
            obj.g = new ClusterRadioStationModel(((gph) (obj)).g.uri, ((gph) (obj)).g.title, ((gph) (obj)).g.titleUri, ((gph) (obj)).g.imageUri, ((gph) (obj)).g.subtitle, ((gph) (obj)).g.subtitleUri, as, ((gph) (obj)).g.relatedArtists, aplayertrack, ((gph) (obj)).g.nextPageUrl, ((gph) (obj)).g.explicitSave, ((gph) (obj)).g.username, ((gph) (obj)).g.clusterType, ((gph) (obj)).g.description);
        } else
        {
            obj.g = new ClusterRadioStationModel(((ClusterRadioStationModel) (obj2)), ((RadioStationTracksModel) (obj1)));
        }
        obj = gox.a(d).g;
        obj1 = new RadioStationTracksModel(((ClusterRadioStationModel) (obj)).tracks, ((ClusterRadioStationModel) (obj)).nextPageUrl);
        if (((ClusterRadioStationModel) (obj)).seeds.length > 1)
        {
            obj = gox.a(d, ((com.spotify.music.spotlets.radio.model.RadioStationModel) (obj)), ((RadioStationTracksModel) (obj1)));
            gox.c(d).updateWithContext(((com.spotify.mobile.android.cosmos.player.v2.PlayerContext) (obj)));
            return;
        } else
        {
            gox.a(d, ((com.spotify.music.spotlets.radio.model.RadioStationModel) (obj)), ((RadioStationTracksModel) (obj1)), b, c, false);
            return;
        }
    }
}
