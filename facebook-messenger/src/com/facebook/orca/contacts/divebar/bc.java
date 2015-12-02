// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.analytics.i.c;
import com.facebook.c.s;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.orca.common.ui.titlebar.a;
import com.facebook.orca.common.ui.titlebar.m;
import com.facebook.orca.creation.CreateThreadActivity;
import com.facebook.widget.e;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            bd

public class bc extends e
{

    private a a;
    private s b;
    private av c;

    public bc(Context context)
    {
        this(context, null);
    }

    public bc(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setOrientation(1);
        setContentView(k.orca_divebar_new_group);
        context = t.a(context);
        c = (av)context.a(com/facebook/analytics/av);
        a = (a)context.a(com/facebook/orca/common/ui/titlebar/a);
        b = (s)context.a(com/facebook/c/s);
        setOnClickListener(new bd(this));
    }

    private void a()
    {
        com.facebook.analytics.i.c.a(getContext()).a("tap_chat_bar_compose_button");
        c.a((new cb("click")).f("button").g("divebar_compose_btn").b("divebar_state", a.d().toString()));
        Intent intent = new Intent(getContext(), com/facebook/orca/creation/CreateThreadActivity);
        intent.putExtra(CreateThreadActivity.r, true);
        intent.putExtra("trigger", "divebar_compose_btn");
        b.a(intent, getContext());
        a.l();
    }

    static void a(bc bc1)
    {
        bc1.a();
    }

    protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return generateDefaultLayoutParams();
    }

    protected android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams()
    {
        return new android.widget.LinearLayout.LayoutParams(-1, -2);
    }
}
