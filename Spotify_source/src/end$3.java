// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.util.ClientEventFactory;

final class ang.Object
    implements android.widget.rView.OnItemClickListener
{

    private end a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        int j = end.f(a).getHeaderViewsCount();
        switch (end.i(a).b(i - j))
        {
        default:
            return;

        case 0: // '\0'
            adapterview = (enw)view.getTag();
            break;
        }
        if (gex.a(((emz) (a)).Z))
        {
            a.a(ClientEventFactory.a("tracks", com.spotify.mobile.android.util.Event.SubEvent.ah, adapterview.getUri(), Long.valueOf(l)));
            adapterview = (new com.spotify.mobile.android.cosmos.player.v2.tions.Builder()).skipToIndex(0, (int)l).build();
            ((epi)end.s(a)).a(adapterview, end.w(a));
            return;
        }
        a.a(ClientEventFactory.a("tracks", com.spotify.mobile.android.util.Event.SubEvent.ai, adapterview.getUri(), Long.valueOf(l)));
        if (end.x(a) instanceof ShufflePlayHeaderView)
        {
            ((ShufflePlayHeaderView)end.x(a)).a();
            return;
        } else
        {
            ShufflePlayHeaderView.a(end.y(a), end.x(a));
            return;
        }
    }

    (end end1)
    {
        a = end1;
        super();
    }
}
