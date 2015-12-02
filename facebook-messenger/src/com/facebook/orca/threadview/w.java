// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.orca.common.ui.widgets.SlidingOutSuggestionView;
import com.facebook.orca.notify.as;
import com.facebook.orca.prefs.n;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import com.facebook.prefs.shared.f;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.orca.threadview:
//            x, y

public class w
{

    private final d a;
    private final f b = new y(this);
    private final as c;
    private final SlidingOutSuggestionView d;
    private String e;
    private ae f;

    public w(d d1, as as1, SlidingOutSuggestionView slidingoutsuggestionview)
    {
        a = d1;
        c = as1;
        d = slidingoutsuggestionview;
        slidingoutsuggestionview.setOnButtonClickListener(new x(this));
        d1.a(b);
        b();
    }

    static void a(w w1)
    {
        w1.c();
    }

    static void a(w w1, ae ae)
    {
        w1.a(ae);
    }

    private void a(ae ae)
    {
        if (Objects.equal(f, ae))
        {
            b();
        }
    }

    private void b()
    {
        if (e == null)
        {
            d.e();
            return;
        }
        com.facebook.orca.notify.NotificationSetting notificationsetting = c.a(e);
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
        a.b().a(f, 0L).a();
    }

    public void a()
    {
        b();
    }

    public void a(ThreadViewSpec threadviewspec)
    {
        if (threadviewspec.a())
        {
            e = threadviewspec.d();
            f = n.a(e);
        } else
        {
            e = null;
            f = null;
        }
        b();
    }
}
