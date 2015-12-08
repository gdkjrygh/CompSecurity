// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.spotify.android.paste.widget.prettylist.StickyListView;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;

final class ang.Object
    implements android.widget.rView.OnItemClickListener
{

    private goo a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        i -= goo.a(a).e().a().getHeaderViewsCount();
        if (i < 0)
        {
            return;
        }
        int j = goo.b(a).b(i);
        switch (j)
        {
        default:
            return;

        case 1: // '\001'
            j = goo.b(a).a(i, j);
            break;
        }
        if (gex.a(goo.c(a)))
        {
            Assertion.a(goo.d(a));
            view = goo.d(a);
            adapterview = new PlayerTrack[((gon) (view)).c.getCount()];
            for (i = 0; i < ((gon) (view)).c.getCount(); i++)
            {
                adapterview[i] = (PlayerTrack)((gon) (view)).c.getItem(i);
            }

            view = (RadioStationModel)goo.e(a);
            view = new RadioStationModel(view, new RadioStationTracksModel(adapterview, gpl.a(((RadioStationModel) (view)).nextPageUrl, adapterview)));
            goo.a(a, view);
            goo.g(a);
            fop.a(a.k(), goo.f(a), ClientEventFactory.a("station", com.spotify.mobile.android.util.Event.SubEvent.ah, adapterview[j].uri(), Long.valueOf(l)));
            goo.h(a);
            fos.a(a.k(), view, goo.f(a), com.spotify.mobile.android.util.viewuri.i.SubView.a, j);
            return;
        } else
        {
            ShufflePlayHeaderView.a(goo.i(a), goo.j(a).a(false));
            return;
        }
    }

    (goo goo1)
    {
        a = goo1;
        super();
    }
}
