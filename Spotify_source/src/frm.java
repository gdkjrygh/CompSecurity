// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.mobile.android.util.viewuri.Verified;
import java.lang.ref.WeakReference;

public final class frm
    implements eda
{

    Offer a;
    public boolean b;
    private final Verified c;
    private final com.spotify.mobile.android.util.viewuri.ViewUri.SubView d;
    private final String e;
    private frn f;
    private frp g;
    private fri h;
    private fry i;
    private boolean j;
    private String k;

    public frm(frn frn1, frp frp1, fri fri1, fry fry1, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, boolean flag, 
            String s)
    {
        k = "";
        cvp.a(frn1);
        cvp.a(frp1);
        cvp.a(fri1);
        cvp.a(fry1);
        cvp.a(verified);
        f = frn1;
        g = frp1;
        h = fri1;
        i = fry1;
        c = verified;
        frn1 = subview;
        if (subview == null)
        {
            frn1 = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a;
        }
        d = frn1;
        j = flag;
        e = s;
    }

    public final void a()
    {
        if (!g.a(a))
        {
            f.a(false);
        } else
        {
            f.a();
            f.a(fss.a(a, i));
            f.b();
            f.a(true);
            if (j)
            {
                j = false;
                h.a(a, k, Reason.g, "info", e, c);
                return;
            }
        }
    }

    public final void a(SessionState sessionstate)
    {
        f.a(false);
        k = sessionstate.m;
        h.a(sessionstate);
        h.a(new frj() {

            private frm a;

            public final void a()
            {
            }

            public final void a(Offer offer)
            {
                a.a = offer;
                if (a.b)
                {
                    a.a();
                }
            }

            
            {
                a = frm.this;
                super();
            }
        });
    }

    public final void b()
    {
        f.a(false);
        h.a(a, Reason.g, k, "info", e, c);
    }

    public final void c()
    {
        h.a(Reason.g, k, "info", c, d, a, e);
    }

    public final void d()
    {
        h.a();
        i.a.clear();
    }
}
