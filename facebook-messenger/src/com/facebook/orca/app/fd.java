// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.preference.PreferenceActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.auth.b.b;
import com.facebook.bugreporter.g;
import com.facebook.bugreporter.x;
import com.facebook.c.s;
import com.facebook.common.c.f;
import com.facebook.common.w.q;
import com.facebook.i;
import com.facebook.l;
import com.facebook.orca.prefs.OrcaRootPreferenceActivity;
import com.facebook.ui.f.a;
import com.google.common.a.ik;
import java.util.Locale;
import java.util.Map;

public class fd
    implements a
{

    private final Context a;
    private final g b;
    private final javax.inject.a c;
    private final av d;
    private final com.facebook.orca.h.b e;
    private final javax.inject.a f;
    private final b g;
    private final s h;
    private final com.facebook.orca.h.a i;

    public fd(Context context, g g1, javax.inject.a a1, av av1, com.facebook.orca.h.b b1, javax.inject.a a2, b b2, 
            s s1, com.facebook.orca.h.a a3)
    {
        a = context;
        b = g1;
        c = a1;
        d = av1;
        e = b1;
        f = a2;
        g = b2;
        h = s1;
        i = a3;
    }

    private void a(String s1)
    {
        d.a((new cb("click")).f("opt_menu_item").g(s1));
    }

    public void a()
    {
        Object obj = Uri.parse("http://m.facebook.com/mobile/messenger/help").buildUpon();
        ((android.net.Uri.Builder) (obj)).appendQueryParameter("locale", com.facebook.common.k.a.a(Locale.getDefault()));
        obj = new Intent("android.intent.action.VIEW", ((android.net.Uri.Builder) (obj)).build());
        h.b(((Intent) (obj)), a);
    }

    public void a(Menu menu, MenuInflater menuinflater)
    {
        if (g.b())
        {
            menuinflater.inflate(l.messenger_menu, menu);
            if (f.b() != q.YES)
            {
                menu.removeItem(i.internal);
                menu.removeItem(i.send_log_menu_item);
                menu.removeItem(i.force_crash_menu_item);
            }
            if (a instanceof PreferenceActivity)
            {
                menu.removeItem(i.preferences);
            }
            if (a instanceof x)
            {
                menu.removeItem(i.report_bug);
            }
            if (!((Boolean)c.b()).booleanValue())
            {
                menu.removeItem(i.report_bug);
            }
            return;
        } else
        {
            menuinflater.inflate(l.messenger_menu_logged_out, menu);
            return;
        }
    }

    public boolean a(MenuItem menuitem)
    {
        int j = menuitem.getItemId();
        if (j == i.help)
        {
            a("help");
            a();
            return true;
        }
        if (j == i.preferences)
        {
            a("preferences");
            b();
            return true;
        }
        if (j == i.report_bug)
        {
            menuitem = ik.a();
            f f1 = i.a();
            if (f1 != null)
            {
                menuitem.put("device_logs.log", Uri.fromFile(f1.a()).toString());
            }
            b.a(a, menuitem);
            return true;
        }
        if (j == i.send_log_menu_item)
        {
            a("send_log_menu_item");
            e.a();
            return true;
        }
        if (j == i.force_crash_menu_item)
        {
            a("force_crash_menu_item");
            throw new RuntimeException("Forcing crash (internal)");
        } else
        {
            return false;
        }
    }

    public void b()
    {
        Intent intent = new Intent(a, com/facebook/orca/prefs/OrcaRootPreferenceActivity);
        a.startActivity(intent);
    }
}
