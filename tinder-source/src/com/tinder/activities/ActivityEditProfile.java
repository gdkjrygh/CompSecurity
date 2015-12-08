// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.m;
import com.facebook.AccessToken;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.c.r;
import com.tinder.f.ak;
import com.tinder.fragments.w;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ae;
import com.tinder.managers.f;

public class ActivityEditProfile extends ActivitySignedInBase
    implements com.tinder.c.r.a
{

    f a;
    ae b;
    private r c;
    private w d;
    private int e;

    public ActivityEditProfile()
    {
    }

    public final void b()
    {
        AccessToken accesstoken = AccessToken.a();
        (new StringBuilder("facebook token=")).append(accesstoken);
        if (accesstoken.d != null && !accesstoken.c())
        {
            a.a(this, new String[0]);
        }
    }

    public void onBackPressed()
    {
        d.a(true);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        AccessToken.b();
        ManagerApp.h().a(this);
        if (bundle == null)
        {
            if (getIntent().getExtras() != null && getIntent().getExtras().get("instagramConnectValue") != null)
            {
                e = getIntent().getExtras().getInt("instagramConnectValue");
            }
            d = new w();
            bundle = new Bundle();
            bundle.putInt("instagramConnectValue", e);
            d.setArguments(bundle);
            b(d, "fragment edit profile");
        } else
        {
            d = (w)getSupportFragmentManager().a("fragment edit profile");
        }
        if (!a.a("user_photos") && (c == null || !c.isShowing()))
        {
            c = new r(this, this);
            c.show();
        }
    }

    public final boolean w_()
    {
        return false;
    }

    public final void x_()
    {
        ae.q();
    }
}
