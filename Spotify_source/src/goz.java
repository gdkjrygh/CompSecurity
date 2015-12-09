// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel;
import java.util.Arrays;

final class goz
    implements gpf
{

    private final Verified a;
    private final com.spotify.mobile.android.util.viewuri.ViewUri.SubView b;
    private final boolean c;
    private final String d[];
    private gox e;

    public goz(gox gox1, String as[], Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, boolean flag)
    {
        e = gox1;
        super();
        d = as;
        a = verified;
        b = subview;
        c = flag;
    }

    public final void a()
    {
        Logger.b("Failed to create station with seeds %s", new Object[] {
            Arrays.toString(d)
        });
        dmz.a(ggc);
        ggc.d(gox.b(e));
        gox.a(e).a();
    }

    public final void a(Object obj)
    {
        obj = (TracksAndRadioStationModel)obj;
        RadioStationModel radiostationmodel = ((TracksAndRadioStationModel) (obj)).station;
        String s = radiostationmodel.uri;
        Arrays.toString(d);
        int i = ((TracksAndRadioStationModel) (obj)).tracks.length;
        s = ((TracksAndRadioStationModel) (obj)).nextPageUrl;
        gox.a(e).a(radiostationmodel);
        gox.a(e, radiostationmodel, ((com.spotify.music.spotlets.radio.model.RadioStationTracksModel) (obj)), a, b, false);
        if (c)
        {
            e.a(radiostationmodel, a, b);
        }
    }
}
