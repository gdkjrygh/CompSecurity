// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.m;
import android.view.View;
import android.view.Window;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.base.a;
import com.tinder.c.u;
import com.tinder.events.EventLoggedOut;
import com.tinder.f.ak;
import com.tinder.fragments.bh;
import com.tinder.fragments.bj;
import com.tinder.fragments.bk;
import com.tinder.fragments.c;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ae;
import com.tinder.managers.d;
import com.tinder.managers.g;
import com.tinder.managers.i;
import com.tinder.model.SparksEvent;
import com.tinder.utils.ad;

// Referenced classes of package com.tinder.activities:
//            ActivityMain, ActivityLogin

public class ActivityVerification extends ActivitySignedInBase
{

    private u C;
    i a;
    d b;
    ae c;
    g d;
    public bk e;
    public bh f;
    public boolean g;
    public boolean h;
    public boolean i;
    public String j;
    private bj k;

    public ActivityVerification()
    {
        super(true);
    }

    public final void e()
    {
        if (C == null)
        {
            C = new u(this);
        }
        C.show();
    }

    public final void f()
    {
        ad.c(C);
    }

    public final void g()
    {
        c c1 = new c();
        if (g)
        {
            a(e);
            return;
        }
        if (h && i)
        {
            Bundle bundle1 = new Bundle();
            bundle1.putBoolean("is_age_verification_needed", true);
            bundle1.putBoolean("is_gender_verification_needed", true);
            c1.setArguments(bundle1);
            a(c1);
            return;
        }
        if (h)
        {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("is_age_verification_needed", true);
            bundle2.putBoolean("is_gender_verification_needed", false);
            c1.setArguments(bundle2);
            a(c1);
            return;
        }
        if (i)
        {
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("is_age_verification_needed", false);
            bundle3.putBoolean("is_gender_verification_needed", true);
            c1.setArguments(bundle3);
            a(c1);
            return;
        } else
        {
            b.a(true);
            a.a(true);
            Bundle bundle = new Bundle();
            bundle.putString("extra_show_loading", "");
            ae.m();
            Intent intent = new Intent(getApplicationContext(), com/tinder/activities/ActivityMain);
            intent.addFlags(0x10000000);
            intent.addFlags(0x4000000);
            intent.putExtras(bundle);
            startActivity(intent);
            finish();
            overridePendingTransition(0x7f040013, 0x7f040016);
            finish();
            return;
        }
    }

    public void onBackPressed()
    {
        m m1 = getSupportFragmentManager();
        (new StringBuilder("BACK STACK CHANGED, BACK STACK SIZE: ")).append(m1.e());
        for (int l = 0; l < m1.e(); l++)
        {
            (new StringBuilder("BACK STACK ")).append(l).append(" : ").append(m1.c(l).e());
        }

        if (getSupportFragmentManager().e() < 2)
        {
            e();
            b.d();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        ManagerApp.h().a(this);
        (new StringBuilder("savedInstanceState=")).append(bundle);
        super.onCreate(bundle);
        bundle = getIntent().getExtras();
        if (bundle != null)
        {
            g = bundle.getBoolean("is_banned", false);
            h = bundle.getBoolean("is_age_verification_needed", false);
            i = bundle.getBoolean("is_gender_verification_needed", false);
        }
        e = new bk();
        f = new bh();
        k = new bj();
        g();
    }

    public void onEventMainThread(EventLoggedOut eventloggedout)
    {
        com.tinder.managers.a.b(new SparksEvent("Account.FbLogout"));
        eventloggedout = new Intent(this, com/tinder/activities/ActivityLogin);
        eventloggedout.setFlags(32768);
        eventloggedout.putExtra("extra_show_intro", "");
        startActivity(eventloggedout);
        finish();
        f();
    }

    public void onPause()
    {
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
    }

    public void showCountrySelection(View view)
    {
        ad.a(getWindow().getDecorView().getWindowToken(), this);
        a(k);
    }

    public final boolean w_()
    {
        return false;
    }
}
