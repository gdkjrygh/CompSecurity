// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.mobile.android.util.viewuri.Verified;
import java.lang.ref.WeakReference;

public class fsc
    implements eda
{

    Verified a;
    fsv b;
    fri c;
    fry d;
    Offer e;
    final Reason f;
    final String g;
    final String h;
    boolean i;
    String j;
    private final com.spotify.mobile.android.util.viewuri.ViewUri.SubView k;
    private frj l;

    public fsc(Reason reason, String s, boolean flag, fsv fsv1, fri fri1, fry fry1, Verified verified, 
            com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, String s1)
    {
        l = new frj() {

            private fsc a;

            public final void a()
            {
                a.b.a(8);
            }

            public final void a(Offer offer)
            {
                a.e = offer;
                String s2 = fss.a(a.e, a.d);
                a.b.a(s2);
                a.b.a(0);
                if (a.i)
                {
                    a.i = false;
                    a.c.a(offer, a.j, a.f, a.g, a.h, a.a);
                }
            }

            
            {
                a = fsc.this;
                super();
            }
        };
        d = (fry)cvp.a(fry1);
        c = (fri)cvp.a(fri1);
        f = (Reason)cvp.a(reason);
        i = flag;
        h = (String)cvp.a(s1);
        k = (com.spotify.mobile.android.util.viewuri.ViewUri.SubView)cvp.a(subview);
        g = (String)cvp.a(s);
        b = (fsv)cvp.a(fsv1);
        a = (Verified)cvp.a(verified);
    }

    public void a()
    {
        c.a(e, f, j, g, h, a);
    }

    public void a(SessionState sessionstate)
    {
        j = sessionstate.m;
        c.a(sessionstate);
        e();
    }

    public void c()
    {
        c.a(f, j, g, a, k, e, h);
    }

    public void d()
    {
        b = null;
        c.a();
        c = null;
        d.a.clear();
        d = null;
        l = null;
    }

    public final void e()
    {
        c.a(l);
    }
}
