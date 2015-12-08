// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import java.util.ArrayList;

public final class ang.Object
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
            int j = aradiostationmodel.length;
            for (int i = 0; i < j; i++)
            {
                RadioStationModel radiostationmodel1 = aradiostationmodel[i];
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

    public (gox gox1, String s)
    {
        b = gox1;
        a = s;
        super();
    }
}
