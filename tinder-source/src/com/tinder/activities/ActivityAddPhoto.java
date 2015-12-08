// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.c.r;
import com.tinder.f.ak;
import com.tinder.fragments.a;
import com.tinder.fragments.e;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ae;
import com.tinder.managers.f;
import com.tinder.utils.ad;
import com.tinder.views.CustomActionBar;

public class ActivityAddPhoto extends ActivitySignedInBase
    implements com.tinder.c.r.a
{

    ae a;
    f b;
    public a c;
    public e d;
    public boolean e;
    private r f;

    public ActivityAddPhoto()
    {
    }

    private void e()
    {
        c(d);
        H().setMenu(d);
        e = true;
    }

    public final void b()
    {
        AccessToken accesstoken = AccessToken.a();
        (new StringBuilder("facebook token=")).append(accesstoken);
        if (accesstoken.d != null && !accesstoken.c())
        {
            b.a(this, new String[0]);
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (e)
        {
            d.a();
        }
    }

    public void onBackPressed()
    {
        if (e)
        {
            super.onBackPressed();
            return;
        } else
        {
            e();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        (new StringBuilder("savedInstanceState=")).append(bundle);
        super.onCreate(bundle);
        ManagerApp.h().a(this);
        F();
        c = new a();
        d = new e();
        e();
        if (!b.a("user_photos") && (f == null || !f.isShowing()))
        {
            f = new r(this, this);
            f.show();
        }
    }

    public void onDestroy()
    {
        ad.c(f);
        super.onDestroy();
    }

    public final boolean w_()
    {
        return true;
    }

    public final void x_()
    {
        ae.q();
    }
}
