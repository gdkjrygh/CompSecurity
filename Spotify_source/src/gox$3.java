// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;

final class ang.Object
    implements gpf
{

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
            int j = aradiostationmodel.length;
            for (int i = 0; i < j; i++)
            {
                RadioStationModel radiostationmodel = aradiostationmodel[i];
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

    (gox gox1)
    {
        a = gox1;
        super();
    }
}
