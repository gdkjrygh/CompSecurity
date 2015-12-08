// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.onboarding;

import android.content.Intent;
import android.os.Bundle;
import ay;
import b;
import bp;
import dtk;
import fnt;
import ghs;
import gia;
import gil;
import mtj;
import nfw;
import omr;
import s;

public final class IntroActivity extends omr
{

    public IntroActivity()
    {
        (new nfw(this, e)).a(d);
        new gil(this, e);
        (new fnt(this, e)).a(d);
        (new gia()).a(d);
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle == null)
        {
            if (getIntent().getExtras() == null)
            {
                bundle = new ghs();
            } else
            {
                bundle = ghs.r();
            }
            c().a().b(s.X, bundle, "intro_fragment").a(0).c();
            c().b();
            mtj.a(this, new dtk());
        }
        setContentView(b.rM);
    }
}
