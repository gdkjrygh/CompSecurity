// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ListView;
import com.spotify.android.paste.widget.HeaderView;
import com.spotify.android.paste.widget.prettylist.StickyListView;
import com.spotify.mobile.android.spotlets.show.adapter.EpisodeAdapter;
import com.spotify.mobile.android.util.ClientEvent;

final class .Object
    implements Runnable
{

    private a a;

    public final void run()
    {
        fig.u(a.a).c(false);
    }

    .Object(.Object obj)
    {
        a = obj;
        super();
    }

    // Unreferenced inner class fig$14

/* anonymous class */
    final class fig._cls14
        implements fzs
    {

        final fig a;

        public final void a()
        {
            if (!fig.q(a))
            {
                return;
            }
            fig.d(a, false);
            fig.A(a).a(false);
            if (!fig.T(a))
            {
                fig.u(a).a().a(fig.u(a).b());
            }
            fig.u(a).c().post(new fig._cls14._cls1(this));
            fig.U(a);
            fig.t(a).a(fig.s(a));
            fig.u(a).a(fig.s(a));
            ((fpe)a.k()).P_();
            fig.W(a);
            fop.a(a.k(), fig.V(a), new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.S, com.spotify.mobile.android.util.ClientEvent.SubEvent.du));
        }

            
            {
                a = fig1;
                super();
            }
    }

}
