// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import com.facebook.orca.common.ui.widgets.SlidingOutSuggestionView;
import com.facebook.orca.notify.as;
import com.facebook.orca.prefs.n;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;

// Referenced classes of package com.facebook.orca.threadlist:
//            g, h

public class f
{

    private final d a;
    private final com.facebook.prefs.shared.f b = new h(this);
    private final as c;
    private final SlidingOutSuggestionView d;

    public f(d d1, as as1, SlidingOutSuggestionView slidingoutsuggestionview)
    {
        a = d1;
        c = as1;
        d = slidingoutsuggestionview;
        slidingoutsuggestionview.setOnButtonClickListener(new g(this));
        d1.a(b);
        b();
    }

    static void a(f f1)
    {
        f1.c();
    }

    static void a(f f1, ae ae1)
    {
        f1.a(ae1);
    }

    private void a(ae ae1)
    {
        if (n.o.equals(ae1))
        {
            b();
        }
    }

    private void b()
    {
        com.facebook.orca.notify.NotificationSetting notificationsetting = c.a();
        if (!c.a(notificationsetting))
        {
            d.d();
            return;
        } else
        {
            d.e();
            return;
        }
    }

    private void c()
    {
        d.f();
        a.b().a(n.o, 0L).a();
    }

    public void a()
    {
        b();
    }
}
