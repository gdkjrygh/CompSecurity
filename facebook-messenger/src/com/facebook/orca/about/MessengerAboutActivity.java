// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.about;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.facebook.analytics.d;
import com.facebook.base.activity.i;
import com.facebook.c.s;
import com.facebook.common.w.o;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.widget.text.CustomUrlLikeSpan;
import com.facebook.widget.titlebar.a;
import com.facebook.widget.titlebar.c;

// Referenced classes of package com.facebook.orca.about:
//            d, e, a, b, 
//            c

public class MessengerAboutActivity extends i
    implements d
{

    private s p;
    private a q;
    private TextView r;
    private TextView s;
    private TextView t;
    private TextView u;
    private View v;
    private View w;
    private View x;

    public MessengerAboutActivity()
    {
    }

    static s a(MessengerAboutActivity messengeraboutactivity)
    {
        return messengeraboutactivity.p;
    }

    private SpannableString j()
    {
        Resources resources = getResources();
        CustomUrlLikeSpan customurllikespan = new CustomUrlLikeSpan();
        customurllikespan.a(new com.facebook.orca.about.d(this));
        CustomUrlLikeSpan customurllikespan1 = new CustomUrlLikeSpan();
        customurllikespan1.a(new e(this));
        o o1 = new o(resources);
        o1.a(resources.getString(com.facebook.o.messenger_about_trademarks));
        o1.a("[[facebook_link1]]", getString(com.facebook.o.messenger_about_terms_of_service_facebook), customurllikespan, 33);
        o1.a("[[facebook_link2]]", getString(com.facebook.o.messenger_about_terms_of_service_facebook_inc), customurllikespan1, 33);
        return o1.b();
    }

    protected void b(Bundle bundle)
    {
        super.b(bundle);
        bundle = i();
        p = (s)bundle.a(com/facebook/c/s);
        setContentView(k.about);
        c.a(this);
        q = (a)b(com.facebook.i.titlebar);
        r = (TextView)b(com.facebook.i.orca_about_app_name);
        s = (TextView)b(com.facebook.i.orca_about_version);
        t = (TextView)b(com.facebook.i.orca_about_copyright);
        u = (TextView)b(com.facebook.i.orca_about_trademarks);
        v = b(com.facebook.i.orca_about_licenses);
        w = b(com.facebook.i.orca_about_privacy_and_terms);
        x = b(com.facebook.i.orca_about_terms_of_service);
        u.setMovementMethod(LinkMovementMethod.getInstance());
        u.setSaveEnabled(false);
        bundle = (com.facebook.config.b.a)bundle.a(com/facebook/config/b/a);
        bundle = (new StringBuilder()).append(bundle.a()).append("/").append(String.valueOf(bundle.b())).toString();
        s.setText(bundle);
        u.setText(j());
        v.setOnClickListener(new com.facebook.orca.about.a(this));
        w.setOnClickListener(new b(this));
        x.setOnClickListener(new com.facebook.orca.about.c(this));
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.ORCA_PREFERENCE_ACTIVITY_NAME;
    }
}
