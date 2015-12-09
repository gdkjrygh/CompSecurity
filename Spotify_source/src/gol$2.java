// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.radio.model.RadioStationModel;

final class ang.Object
    implements android.view.nClickListener
{

    private gol a;

    public final void onClick(View view)
    {
        view = (RadioStationModel)view.getTag();
        if (gpl.a(a.h))
        {
            view = gms.a(a.c, ((RadioStationModel) (view)).uri).a(((RadioStationModel) (view)).title).a;
            a.c.startActivity(view);
        } else
        if (a.a(view))
        {
            fos.c(a.c);
        } else
        {
            gol gol1 = a;
            fos.a(gol1.c, ((RadioStationModel) (view)).seeds, gol1.f, gol1.g);
        }
        view = new ClientEvent(com.spotify.mobile.android.util.Event.Event.N, com.spotify.mobile.android.util.Event.SubEvent.aQ);
        view.a("station_entities_enabled", Boolean.toString(gpl.a(a.h)));
        fop.a(a.c, ViewUri.h, com.spotify.mobile.android.util.viewuri.i.SubView.a, view);
    }

    (gol gol1)
    {
        a = gol1;
        super();
    }
}
