// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.StationEntitySession;
import com.spotify.music.spotlets.radio.service.RadioActionsService;
import java.util.List;
import java.util.Locale;

public final class gou extends dwj
{

    private final gpi f;
    private final Context g;

    public gou(Context context, gpi gpi1)
    {
        super(context, com/spotify/music/spotlets/radio/service/RadioActionsService);
        g = context;
        f = gpi1;
    }

    public final void a(Verified verified, gov gov)
    {
        Object obj = (gpc)f();
        gov = new gpf(gov) {

            private gov a;

            public final void a()
            {
                a.a();
            }

            public final volatile void a(Object obj1)
            {
                obj1 = (RadioStationModel)obj1;
                a.a(((RadioStationModel) (obj1)));
            }

            
            {
                a = gov1;
                super();
            }
        };
        StationEntitySession stationentitysession = RadioActionsService.b(((gpc) (obj)).a).e.a(verified);
        if (stationentitysession != null)
        {
            gov.a(stationentitysession.getRadioStationModel());
            return;
        } else
        {
            verified = gpl.d(verified.toString());
            obj = RadioActionsService.b(((gpc) (obj)).a).d;
            geh.a(verified, "seed can not be empty.");
            ctz.a(gov);
            verified = String.format(Locale.US, "hm://radio-apollo/v3/stations/%s?count=15", new Object[] {
                verified
            });
            ((gpd) (obj)).c.a(RequestBuilder.get(verified).build(), 15000L).a(gpd.a(gov, verified));
            return;
        }
    }

    public final void b()
    {
        if (c())
        {
            gpc gpc1 = (gpc)f();
            gpi gpi1 = f;
            RadioActionsService.b(gpc1.a).e.a.remove(gpi1);
        }
        super.b();
    }

    public final void d()
    {
        super.d();
        g.startService(new Intent(g, com/spotify/music/spotlets/radio/service/RadioActionsService));
    }

    protected final void e()
    {
        super.e();
        Object obj = (gpc)f();
        gpi gpi1 = f;
        obj = RadioActionsService.b(((gpc) (obj)).a).e;
        ((gph) (obj)).a.add(gpi1);
        gpi1.a(((gph) (obj)).b);
        gpi1.a(((gph) (obj)).d);
    }
}
