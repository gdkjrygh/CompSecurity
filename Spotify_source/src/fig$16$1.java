// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.ListView;
import android.widget.TextView;
import com.spotify.mobile.android.util.ClientEvent;
import java.util.Iterator;
import java.util.List;

final class .Object
    implements Runnable
{

    private a a;

    public final void run()
    {
label0:
        {
            if (fig.g(a.a).getFirstVisiblePosition() >= fig.g(a.a).getHeaderViewsCount())
            {
                if (!fig.T(a.a))
                {
                    break label0;
                }
                fig.g(a.a).setSelection(0);
            }
            return;
        }
        fig.u(a.a).b(false);
    }

    .Object(.Object obj)
    {
        a = obj;
        super();
    }

    // Unreferenced inner class fig$16

/* anonymous class */
    final class fig._cls16
        implements gdl
    {

        final fig a;

        public final void a(Context context, gdk gdk1)
        {
            for (context = fig.X(a).iterator(); context.hasNext();)
            {
                ((gdk)context.next()).a = false;
            }

            if (gdk1.c == fig.Y(a).c)
            {
                fig.a(a, fig.Z(a));
            } else
            {
                fig.a(a, gdk1);
            }
            fig.Y(a).a = true;
            fig.aa(a).setText(fig.Y(a).b);
            fig.b(a).a(fig.B(a).a, fig.D(a).a, fig.C(a).a);
            fig.b(a).b(a.a);
            context = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.Z);
            context.a("saved", String.valueOf(fig.B(a).a));
            context.a("offlined", String.valueOf(fig.D(a).a));
            context.a("unplayed", String.valueOf(fig.C(a).a));
            fig.W(a);
            fop.a(a.k(), fig.V(a), context);
            fig.u(a).c().post(new fig._cls16._cls1(this));
        }

            
            {
                a = fig1;
                super();
            }
    }

}
