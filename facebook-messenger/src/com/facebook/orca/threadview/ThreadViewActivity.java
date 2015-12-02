// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.q;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.analytics.d;
import com.facebook.b.a.f;
import com.facebook.base.activity.i;
import com.facebook.inject.t;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.orca.activity.k;
import com.facebook.orca.common.ui.titlebar.a;
import com.facebook.orca.d.af;
import com.facebook.orca.d.m;
import com.facebook.orca.intents.e;
import com.facebook.orca.nux.ThreadTitleNuxView;
import com.facebook.orca.nux.u;
import com.facebook.widget.titlebar.c;

// Referenced classes of package com.facebook.orca.threadview:
//            dm, ThreadViewFragment

public class ThreadViewActivity extends i
    implements d, f, k
{

    private ThreadViewFragment p;
    private ThreadTitleNuxView q;
    private u r;
    private av s;
    private a t;
    private m u;
    private af v;

    public ThreadViewActivity()
    {
    }

    public boolean a_()
    {
        return true;
    }

    public void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(com.facebook.k.orca_thread_view);
        bundle = i();
        s = (av)bundle.a(com/facebook/analytics/av);
        t = (a)bundle.a(com/facebook/orca/common/ui/titlebar/a);
        u = (m)bundle.a(com/facebook/orca/d/m);
        v = (af)bundle.a(com/facebook/orca/d/af);
        com.facebook.widget.titlebar.c.a(this);
        q = (ThreadTitleNuxView)b(com.facebook.i.thread_title_nux);
        r = (u)bundle.a(com/facebook/orca/nux/u);
        bundle = com.facebook.orca.threadview.dm.a(getIntent());
        r.a(bundle, q);
        p = (ThreadViewFragment)f().a(com.facebook.i.thread_view_fragment);
        p.a((com.facebook.widget.titlebar.a)b(com.facebook.i.titlebar));
        p.a(bundle);
        bundle = getIntent();
        if (e.a(bundle, "from_notification", false))
        {
            p.b();
        }
        if (e.a(bundle, "focus_compose", false))
        {
            p.c();
        }
        p.a(e.a(bundle));
        t.a(this);
        getWindow().getDecorView().setBackgroundDrawable(new ColorDrawable(Color.rgb(255, 255, 255)));
    }

    public a c()
    {
        return t;
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.THREAD_VIEW_ACTIVITY_NAME;
    }

    public ThreadViewSpec j()
    {
        return p.O();
    }

    public void onBackPressed()
    {
        while (!f().c() || t.f() || p.Q()) 
        {
            return;
        }
        super.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (t != null)
        {
            t.e();
        }
    }

    public boolean onKeyDown(int l, KeyEvent keyevent)
    {
        if (keyevent.getAction() == 0 && keyevent.getKeyCode() == 4)
        {
            s.a((new cb("click")).a(g_()).f("android_button").g("back"));
        }
        return p.a(l, keyevent) || super.onKeyDown(l, keyevent);
    }

    protected void onPause()
    {
        super.onPause();
        u.a();
        v.b();
    }

    protected void onResume()
    {
        super.onResume();
        Object obj = getIntent();
        if (obj != null)
        {
            obj = e.a(((android.content.Intent) (obj)), "trigger");
            if (obj != null)
            {
                s.a((new cb("show_module")).a(g_()).h(h()).b("trigger", ((String) (obj))));
                p.a(((String) (obj)));
            }
        }
    }

    public void onUserInteraction()
    {
        super.onUserInteraction();
        if (p != null)
        {
            p.d();
        }
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        p.b(flag);
    }
}
