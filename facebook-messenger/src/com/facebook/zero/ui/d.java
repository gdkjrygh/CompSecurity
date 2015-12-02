// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.view.ViewStub;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.base.broadcast.q;
import com.facebook.c.s;
import com.facebook.common.h.a;
import com.facebook.debug.log.b;
import com.facebook.prefs.shared.e;
import com.facebook.zero.a.c;
import java.util.UUID;

// Referenced classes of package com.facebook.zero.ui:
//            e, f, o, CarrierBottomBanner, 
//            c

public class d
{

    private static final Class a = com/facebook/zero/ui/d;
    private final Context b;
    private final com.facebook.zero.d.a c;
    private final o d;
    private final com.facebook.zero.ui.c e = new com.facebook.zero.ui.e(this);
    private final com.facebook.prefs.shared.d f;
    private final s g;
    private final q h;
    private final av i;
    private final javax.inject.a j;
    private final String k = com.facebook.common.h.a.a().toString();
    private ViewStub l;
    private CarrierBottomBanner m;

    public d(Context context, com.facebook.zero.d.a a1, o o1, com.facebook.prefs.shared.d d1, s s1, av av1, javax.inject.a a2)
    {
        b = context;
        c = a1;
        d = o1;
        f = d1;
        g = s1;
        i = av1;
        j = a2;
        context = new IntentFilter();
        context.addAction("com.facebook.orca.ZERO_RATING_BOTTOM_BANNER_DATA_CHANGED");
        context.addAction("com.facebook.orca.ZERO_RATING_STATE_CHANGED");
        h = new f(this, b, context);
    }

    static void a(d d1)
    {
        d1.f();
    }

    static void a(d d1, String s1)
    {
        d1.a(s1);
    }

    private void a(String s1)
    {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(s1));
        i.a((new cb("click")).h(k).e("carrier_bottom_banner").g("carrier_bottom_banner_goto"));
        try
        {
            g.b(intent, b);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            com.facebook.debug.log.b.e(a, "Activity not found for opening url: [%s]", new Object[] {
                s1
            });
        }
    }

    private void e()
    {
        CarrierBottomBannerData carrierbottombannerdata;
        if (d.a(c.m))
        {
            if ((carrierbottombannerdata = c.d()) != null)
            {
                if (l != null && m == null)
                {
                    m = (CarrierBottomBanner)l.inflate();
                    m.setListener(e);
                    m.setBottomBannerData(carrierbottombannerdata);
                    i.a((new cb("view")).h(k).e("carrier_bottom_banner").g("carrier_bottom_banner_show"));
                    return;
                }
                if (m != null)
                {
                    m.setVisibility(0);
                    m.setBottomBannerData(carrierbottombannerdata);
                    i.a((new cb("view")).h(k).e("carrier_bottom_banner").g("carrier_bottom_banner_show"));
                    return;
                }
            }
        }
    }

    private void f()
    {
        d();
        i.a((new cb("dismiss")).h(k).e("carrier_bottom_banner").g("carrier_bottom_banner_close"));
        f.b().a(c.m, false).a();
    }

    public d a(ViewStub viewstub)
    {
        l = viewstub;
        return this;
    }

    public void a()
    {
        h.a();
        c();
    }

    public void b()
    {
        h.b();
    }

    public void c()
    {
        if (j.b() == com.facebook.common.w.q.YES)
        {
            e();
            return;
        } else
        {
            d();
            return;
        }
    }

    public void d()
    {
        if (m == null)
        {
            return;
        } else
        {
            m.setVisibility(8);
            return;
        }
    }

}
