// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.l.j;
import com.facebook.orca.common.ui.widgets.f;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import com.facebook.push.b.a;
import com.facebook.widget.animatablelistview.AnimatingItemView;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            g

public class DivebarChatAvailabilityWarning extends f
{

    private final d a;
    private final Button b;
    private final javax.inject.a c;
    private final av d;

    public DivebarChatAvailabilityWarning(Context context)
    {
        this(context, null, 0);
    }

    public DivebarChatAvailabilityWarning(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DivebarChatAvailabilityWarning(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        context = getInjector();
        a = (d)context.a(com/facebook/prefs/shared/d);
        c = context.b(com/facebook/l/j);
        d = (av)context.a(com/facebook/analytics/av);
        setContentView(k.orca_divebar_chat_availability_warning);
        setContainer((AnimatingItemView)c(i.warning_container));
        b = (Button)c(i.chat_availability_turn_on_button);
        b.setOnClickListener(new g(this));
        a();
    }

    static void a(DivebarChatAvailabilityWarning divebarchatavailabilitywarning)
    {
        divebarchatavailabilitywarning.b();
    }

    private void b()
    {
        f();
        cb cb1 = (new cb("click")).f("button").g("divebar_availability_warning_turn_on");
        d.a(cb1);
        cb1 = (new cb("chat_bar_online_status_change")).e("chat_bar").a("state", true).b("source", "divebar_warning");
        d.b(cb1);
        a.b().a(a.a, true).a();
    }

    void a()
    {
        if ((j)c.b() == j.DISABLED)
        {
            d();
            return;
        } else
        {
            e();
            return;
        }
    }
}
