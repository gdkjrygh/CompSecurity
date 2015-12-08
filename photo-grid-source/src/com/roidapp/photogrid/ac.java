// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.widget.ImageView;
import com.roidapp.baselib.c.n;
import com.roidapp.photogrid.common.bq;
import com.roidapp.photogrid.common.o;
import com.roidapp.photogrid.common.q;
import com.roidapp.photogrid.release.HelpActivity;
import com.roidapp.photogrid.release.ParentActivity;
import com.roidapp.photogrid.release.qi;

// Referenced classes of package com.roidapp.photogrid:
//            bh, MainPage, ba

final class ac
    implements bh
{

    final MainPage a;

    ac(MainPage mainpage)
    {
        a = mainpage;
        super();
    }

    public final void a()
    {
        MainPage.E(a).a();
        MainPage.F(a);
    }

    public final void a(int j)
    {
        if (MainPage.G(a) != null && MainPage.G(a).getVisibility() == 0)
        {
            MainPage.G(a).setVisibility(8);
            PreferenceManager.getDefaultSharedPreferences(a).edit().putBoolean("show_new_premium", false).apply();
        }
        if (j == 1)
        {
            bq.a(a.p(), a).c();
        } else
        {
            MainPage mainpage = a;
            qi qi1 = new qi();
            qi1.setStyle(0, 0x7f0b0027);
            n.a(mainpage.getSupportFragmentManager(), qi1, "PremiumDialog");
        }
        MainPage.E(a).a();
    }

    public final void b()
    {
        bq.a(a.p(), a).a();
        MainPage.E(a).a();
    }

    public final void c()
    {
        Uri uri = Uri.parse("https://www.facebook.com/photogridorg");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(0x10000000);
        intent.setData(uri);
        a.startActivity(intent);
        MainPage.E(a).a();
    }

    public final void d()
    {
        bq.a(a.p(), a).c();
        MainPage.E(a).a();
    }

    public final void e()
    {
        (new o(a)).a();
        MainPage.E(a).a();
    }

    public final void f()
    {
        (new o(a)).b();
        MainPage.E(a).a();
    }

    public final void g()
    {
        HelpActivity.a(a, "help");
        MainPage.E(a).a();
    }

    public final void h()
    {
        MainPage.H(a);
    }

    public final void i()
    {
        q.a(a);
        if (MainPage.G(a) != null && MainPage.G(a).getVisibility() == 0)
        {
            MainPage.G(a).setVisibility(8);
            PreferenceManager.getDefaultSharedPreferences(a).edit().putBoolean("show_new_premium", false).apply();
        }
        MainPage.E(a).a();
    }
}
