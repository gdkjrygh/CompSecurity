// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.upsell;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.ImageButton;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.c.s;
import com.facebook.common.time.a;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import com.facebook.widget.CustomRelativeLayout;

// Referenced classes of package com.facebook.orca.upsell:
//            a, b, d

public class InstallMessengerChatHeadPromoView extends CustomRelativeLayout
{

    private final s a;
    private final d b;
    private final av c;
    private final a d;
    private Button e;
    private ImageButton f;

    public InstallMessengerChatHeadPromoView(Context context)
    {
        this(context, null);
    }

    public InstallMessengerChatHeadPromoView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public InstallMessengerChatHeadPromoView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        context = getInjector();
        a = (s)context.a(com/facebook/c/s);
        b = (d)context.a(com/facebook/prefs/shared/d);
        c = (av)context.a(com/facebook/analytics/av);
        d = (a)context.a(com/facebook/common/time/a);
        setContentView(k.install_messenger_chat_heads_promotion);
        e = (Button)a(i.chat_heads_megaphone_install);
        f = (ImageButton)a(i.chat_heads_megaphone_x_button);
        e.setOnClickListener(new com.facebook.orca.upsell.a(this));
        f.setOnClickListener(new b(this));
    }

    static void a(InstallMessengerChatHeadPromoView installmessengerchatheadpromoview)
    {
        installmessengerchatheadpromoview.d();
    }

    private void a(String s1)
    {
        s1 = new cb(s1);
        c.a(s1);
    }

    static void b(InstallMessengerChatHeadPromoView installmessengerchatheadpromoview)
    {
        installmessengerchatheadpromoview.h();
    }

    private void d()
    {
        g();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.facebook.orca"));
        intent.addFlags(0x10000000);
        a.b(intent, getContext());
        setVisibility(8);
    }

    private void e()
    {
        a("install_messenger_chat_head_inbox_promo_impression");
        f();
        int j = b.a(d.b, 0);
        int l = b.a(d.c, 0);
        b.b().a(d.b, j + 1).a(d.c, l + 1).a();
    }

    private void f()
    {
        long l = b.a(com.facebook.orca.upsell.d.d, -1L);
        if (d.a() - l > 0x5265c00L)
        {
            b.b().a(com.facebook.orca.upsell.d.d, d.a()).a(d.c, 0).a();
        }
    }

    private void g()
    {
        a("install_messenger_chat_head_inbox_promo_conversion");
        b.b().a(com.facebook.orca.upsell.d.e, d.a()).a();
    }

    private void h()
    {
        i();
        setVisibility(8);
    }

    private void i()
    {
        a("install_messenger_chat_head_inbox_promo_dismiss");
        b.b().a(d.b, 10).a();
    }

    public void a()
    {
        e();
        setVisibility(0);
    }
}
