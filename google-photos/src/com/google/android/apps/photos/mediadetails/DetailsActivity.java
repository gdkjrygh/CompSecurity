// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.mediadetails;

import android.content.Intent;
import android.os.Bundle;
import ay;
import b;
import bp;
import ekp;
import fyp;
import fyr;
import iwd;
import mnk;
import oka;
import ome;
import q;
import rv;
import ss;
import su;

public final class DetailsActivity extends ome
{

    public DetailsActivity()
    {
        mnk mnk1 = new mnk(this, g);
        mnk1.a = false;
        mnk1.a(f);
        (new iwd(this, q.ar)).a(f);
        (new oka(this, g)).a(new fyp(this));
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(b.rd);
        if (bundle == null)
        {
            bundle = (ekp)getIntent().getParcelableExtra("com.google.android.apps.photos.core.media");
            c().a().a(q.ag, fyr.a(bundle)).b();
        }
        e().a().a(0.0F);
    }
}
