// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ListView;
import com.spotify.android.paste.widget.prettylist.StickyListView;
import com.spotify.mobile.android.spotlets.show.adapter.EpisodeAdapter;
import com.spotify.mobile.android.util.ClientEvent;

final class .Object
    implements Runnable
{

    private a a;

    public final void run()
    {
        fig.u(a.a).b(false);
    }

    .Object(.Object obj)
    {
        a = obj;
        super();
    }

    // Unreferenced inner class fig$13

/* anonymous class */
    final class fig._cls13
        implements fzs
    {

        final fig a;

        public final void a()
        {
            if (fig.q(a))
            {
                return;
            }
            fig.d(a, true);
            fig.A(a).a(true);
            fig.u(a).c().post(new fig._cls13._cls1(this));
            if (!fig.T(a))
            {
                fig.u(a).a().a(null);
            }
            fig.U(a);
            ((fpe)a.k()).P_();
            fig.W(a);
            fop.a(a.k(), fig.V(a), new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.du));
        }

            
            {
                a = fig1;
                super();
            }
    }

}
