// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.search.peoplelabeling;

import am;
import android.content.Intent;
import android.os.Bundle;
import au;
import ay;
import b;
import bp;
import dhb;
import fpj;
import hrr;
import hrs;
import htq;
import hum;
import huo;
import iwd;
import mnk;
import mtj;
import nwn;
import nws;
import oka;
import olm;
import ome;

public final class PeopleLabelingActivity extends ome
    implements nwn
{

    private hum d;
    private hrr e;

    public PeopleLabelingActivity()
    {
        (new mnk(this, g)).a(f);
        (new nws(this, g, this)).a(f);
        (new dhb(this, g)).a(f);
        (new iwd(this, au.u)).a(f);
        new oka(this, g);
        (new fpj(g)).a(f);
        (new mtj(this, g)).a(f);
        (new hrs(g)).a(f);
        htq htq1 = new htq(this, g);
        f.a(htq, htq1);
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        e = (hrr)getIntent().getParcelableExtra("com.google.android.apps.photos.search.core.suggestions.autocompletesuggestion");
        setContentView(b.xK);
        ay ay1 = c();
        if (bundle == null)
        {
            Object obj = new huo();
            obj.a = e;
            bundle = new Bundle();
            bundle.putParcelable("com.google.android.apps.photos.search.core.suggestions.autocompletesuggestion", ((huo) (obj)).a);
            obj = new hum();
            ((hum) (obj)).f(bundle);
            d = ((hum) (obj));
            ay1.a().a(au.u, d, "PeopleLabelingFragment").b();
            return;
        } else
        {
            d = (hum)ay1.a("PeopleLabelingFragment");
            return;
        }
    }

    public final am u()
    {
        return d;
    }
}
