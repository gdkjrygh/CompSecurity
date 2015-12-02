// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.facebook.common.w.o;
import com.facebook.orca.common.ui.widgets.SlidingOutSuggestionView;
import com.facebook.orca.nux.SmsNuxDetailActivity;
import com.facebook.orca.prefs.n;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import com.facebook.prefs.shared.f;
import com.facebook.widget.text.CustomUrlLikeSpan;

// Referenced classes of package com.facebook.orca.threadview:
//            al, am, an

public class ak
{

    private final d a;
    private final f b = new am(this);
    private final SlidingOutSuggestionView c;

    public ak(d d1, SlidingOutSuggestionView slidingoutsuggestionview)
    {
        a = d1;
        c = slidingoutsuggestionview;
        slidingoutsuggestionview.setOnButtonClickListener(new al(this));
        d1.a(b);
        b();
        e();
    }

    static void a(ak ak1)
    {
        ak1.d();
    }

    static void a(ak ak1, ae ae1)
    {
        ak1.a(ae1);
    }

    private void a(ae ae1)
    {
        if (n.i.equals(ae1))
        {
            e();
        }
    }

    private void b()
    {
        CustomUrlLikeSpan customurllikespan = new CustomUrlLikeSpan();
        customurllikespan.a(new an(this));
        Resources resources = c.getResources();
        o o1 = new o(resources);
        o1.a(resources.getString(com.facebook.o.sms_upsell));
        o1.a("[[learn_more_link]]", resources.getString(com.facebook.o.sms_nux_learn_more_link), customurllikespan, 33);
        c.a();
        c.setSuggestionText(o1.b());
    }

    static void b(ak ak1)
    {
        ak1.c();
    }

    private void c()
    {
        Intent intent = new Intent(c.getContext(), com/facebook/orca/nux/SmsNuxDetailActivity);
        c.getContext().startActivity(intent);
    }

    private void d()
    {
        c.f();
        a.b().a(n.i, true).a();
    }

    private void e()
    {
        if (a.a(n.i, true))
        {
            c.e();
            return;
        } else
        {
            c.d();
            return;
        }
    }

    public void a()
    {
        e();
    }
}
