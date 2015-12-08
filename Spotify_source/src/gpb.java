// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;

final class gpb
    implements gpf
{

    private final RadioStationModel a;
    private final Verified b;
    private final com.spotify.mobile.android.util.viewuri.ViewUri.SubView c;
    private gox d;

    public gpb(gox gox1, RadioStationModel radiostationmodel, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
    {
        d = gox1;
        super();
        a = radiostationmodel;
        b = verified;
        c = subview;
    }

    public final void a()
    {
        dmz.a(ggc);
        ggc.d(gox.b(d));
        Logger.b("Failed to load tracks from the backend for %s", new Object[] {
            a.uri
        });
    }

    public final volatile void a(Object obj)
    {
        obj = (RadioStationTracksModel)obj;
        gox.a(d, a, ((RadioStationTracksModel) (obj)), b, c, true);
    }
}
