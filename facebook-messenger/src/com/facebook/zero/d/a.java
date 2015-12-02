// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.d;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.base.c;
import com.facebook.common.e.h;
import com.facebook.common.w.n;
import com.facebook.common.w.q;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import com.facebook.zero.protocol.CarrierAndSimMccMnc;
import com.facebook.zero.server.FetchZeroTokenParams;
import com.facebook.zero.server.FetchZeroTokenResult;
import com.facebook.zero.ui.CarrierBottomBannerData;
import com.facebook.zero.ui.p;
import com.google.common.a.es;
import com.google.common.a.fi;
import com.google.common.base.Objects;
import com.google.common.d.a.i;
import com.google.common.d.a.s;
import java.io.IOException;

// Referenced classes of package com.facebook.zero.d:
//            c, d, b

public class a
    implements c
{

    private static final Class a = com/facebook/zero/d/a;
    private final Context b;
    private final com.facebook.common.time.a c;
    private final d d;
    private final com.facebook.zero.server.d e;
    private final k f;
    private final com.facebook.base.broadcast.a g;
    private final h h;
    private final com.facebook.zero.b.d i;
    private final com.facebook.zero.ui.h j;
    private final p k;
    private final com.facebook.zero.rewrite.e l;
    private final javax.inject.a m;
    private final javax.inject.a n;
    private volatile CarrierBottomBannerData o;
    private volatile fi p;
    private volatile es q;
    private com.facebook.base.broadcast.q r;

    public a(Context context, com.facebook.common.time.a a1, d d1, com.facebook.zero.server.d d2, k k1, com.facebook.base.broadcast.a a2, h h1, 
            com.facebook.zero.b.d d3, com.facebook.zero.ui.h h2, p p1, com.facebook.zero.rewrite.e e1, javax.inject.a a3, javax.inject.a a4)
    {
        b = context;
        c = a1;
        d = d1;
        e = d2;
        f = k1;
        g = a2;
        h = h1;
        i = d3;
        j = h2;
        k = p1;
        l = e1;
        m = a3;
        n = a4;
    }

    static void a(a a1, CarrierBottomBannerData carrierbottombannerdata)
    {
        a1.a(carrierbottombannerdata);
    }

    static void a(a a1, Throwable throwable)
    {
        a1.a(throwable);
    }

    private void a(CarrierBottomBannerData carrierbottombannerdata)
    {
        if (!Objects.equal(o, carrierbottombannerdata))
        {
            o = carrierbottombannerdata;
            d.b().a(com.facebook.zero.a.c.m, true).a();
            g.a("com.facebook.orca.ZERO_RATING_BOTTOM_BANNER_DATA_CHANGED");
        }
    }

    private void a(String s)
    {
        q q1 = (q)n.b();
        d.b().a(com.facebook.zero.a.c.e, s).a();
        if (q1 != n.b())
        {
            n();
        }
    }

    private void a(Throwable throwable)
    {
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Exception fetching zero token: ").append(throwable.getMessage()).toString());
        h.a("zero_rating", "Error fetching zero token", throwable);
    }

    private void g()
    {
        try
        {
            String s = i.a(com.facebook.zero.a.a.a);
            if (!com.facebook.common.w.n.a(s))
            {
                o = j.a(s);
            }
            return;
        }
        catch (IOException ioexception)
        {
            com.facebook.debug.log.b.e(a, "Error deserializing bottom banner data %s: ", new Object[] {
                ioexception.getMessage()
            });
            o = null;
            return;
        }
        catch (com.facebook.common.json.jsonmirror.e e1)
        {
            com.facebook.debug.log.b.e(a, "Error deserializing bottom banner data: %s", new Object[] {
                e1.getMessage()
            });
        }
        o = null;
    }

    private void h()
    {
        try
        {
            String s = i.a(com.facebook.zero.a.a.b);
            if (!com.facebook.common.w.n.a(s))
            {
                p = fi.a(k.a(s));
            }
            return;
        }
        catch (IOException ioexception)
        {
            com.facebook.debug.log.b.e(a, "Error deserializing enabled interstitials %s: ", new Object[] {
                ioexception.getMessage()
            });
            p = fi.d();
            return;
        }
        catch (com.facebook.common.json.jsonmirror.e e1)
        {
            com.facebook.debug.log.b.e(a, "Error deserializing enabled interstitials %s: ", new Object[] {
                e1.getMessage()
            });
        }
        p = fi.d();
    }

    private void i()
    {
        String s = i.a(com.facebook.zero.a.a.c);
        if (!com.facebook.common.w.n.a(s))
        {
            try
            {
                q = l.a(s);
                return;
            }
            catch (IOException ioexception)
            {
                com.facebook.debug.log.b.e(a, "Error deserializing rewrite rules: %s", new Object[] {
                    ioexception.getMessage()
                });
            }
            q = es.d();
            return;
        } else
        {
            q = es.d();
            return;
        }
    }

    private void j()
    {
        if (!((Boolean)m.b()).booleanValue())
        {
            return;
        } else
        {
            a("unknown");
            d.b().a(com.facebook.zero.a.c.d, c.a()).a();
            com.facebook.zero.d.c c1 = new com.facebook.zero.d.c(this);
            com.google.common.d.a.i.a(l(), c1);
            return;
        }
    }

    private void k()
    {
        com.google.common.d.a.i.a(m(), new com.facebook.zero.d.d(this));
    }

    private s l()
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("fetchZeroTokenParams", new FetchZeroTokenParams(e.a(), e.b()));
        return f.a(com.facebook.zero.server.e.a, bundle).a();
    }

    private s m()
    {
        Bundle bundle = new Bundle();
        bundle.putString(com.facebook.zero.a.c.f.a(), d.a(com.facebook.zero.a.c.f, ""));
        return f.a(com.facebook.zero.server.e.b, bundle).a();
    }

    private void n()
    {
        com.facebook.debug.log.b.b(a, "Broadcasting zero rating state change");
        g.a("com.facebook.orca.ZERO_RATING_STATE_CHANGED");
    }

    public void a()
    {
        g();
        h();
        i();
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED");
        r = new com.facebook.zero.d.b(this, b, intentfilter);
        r.a();
    }

    public void a(FetchZeroTokenResult fetchzerotokenresult)
    {
        d.b().a(com.facebook.zero.a.c.f, fetchzerotokenresult.a()).a();
        p = fi.a(fetchzerotokenresult.d());
        com.facebook.debug.log.b.b(a, "New enabled ui features: %s", new Object[] {
            p
        });
        q = fetchzerotokenresult.c();
        com.facebook.debug.log.b.b(a, "New rewrite rules: %s", new Object[] {
            q
        });
        if (!com.facebook.common.w.n.a(d.a(com.facebook.zero.a.c.f, "")))
        {
            k();
        }
        a(fetchzerotokenresult.b());
    }

    public void b()
    {
        com.facebook.debug.log.b.b(a, "Clearing Zero Rating preferences");
        q q1 = (q)n.b();
        d.b().b(com.facebook.zero.a.c.a).a();
        if (q1 != n.b())
        {
            n();
        }
        j();
    }

    void c()
    {
        com.facebook.zero.server.c c1 = e.b();
        com.facebook.debug.log.b.b(a, "Changing connectivity to: %s", new Object[] {
            c1
        });
        if (!c1.equals(com.facebook.zero.a.b.a))
        {
            if (c1.equals(com.facebook.zero.a.b.i))
            {
                a("disabled");
                return;
            }
            if (c1.equals(com.facebook.zero.a.b.d))
            {
                CarrierAndSimMccMnc carrierandsimmccmnc = new CarrierAndSimMccMnc(d.a(com.facebook.zero.a.c.b, "0:0:0:0"));
                CarrierAndSimMccMnc carrierandsimmccmnc1 = e.a();
                if (!carrierandsimmccmnc1.equals(carrierandsimmccmnc))
                {
                    d.b().a(com.facebook.zero.a.c.b, carrierandsimmccmnc1.c()).a();
                    j();
                    return;
                }
                if (!com.facebook.common.w.n.a(d.a(com.facebook.zero.a.c.f, "")))
                {
                    a("enabled");
                    return;
                }
            }
        }
    }

    public CarrierBottomBannerData d()
    {
        return o;
    }

    public es e()
    {
        return q;
    }

    public fi f()
    {
        return p;
    }

}
