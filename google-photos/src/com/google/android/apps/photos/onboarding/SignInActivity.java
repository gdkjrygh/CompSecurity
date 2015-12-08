// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.onboarding;

import android.content.Intent;
import android.os.Bundle;
import ay;
import b;
import bp;
import gia;
import gil;
import gip;
import omr;
import s;

public class SignInActivity extends omr
{

    public SignInActivity()
    {
        new gil(this, e);
        (new gia()).a(d);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle == null)
        {
            bundle = getIntent().getExtras();
            if (bundle == null)
            {
                bundle = new gip();
            } else
            {
                bundle = gip.a(bundle.getBoolean("timed_out", false));
            }
            c().a().b(s.au, bundle, "sign_in_fragment").a(0).c();
            c().b();
        }
        setContentView(b.rO);
    }
}
