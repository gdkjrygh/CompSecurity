// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.localmedia.ui;

import aa;
import android.content.Intent;
import android.os.Bundle;
import ay;
import b;
import bp;
import dhb;
import dhq;
import ehr;
import ekk;
import ekm;
import ekq;
import ekw;
import fnt;
import fpg;
import fpj;
import fwl;
import fxk;
import fxn;
import gaj;
import ggi;
import gnw;
import gog;
import gqy;
import hfo;
import hyu;
import hyy;
import hzh;
import hzj;
import hzr;
import hzv;
import iae;
import iwd;
import java.util.Set;
import mmr;
import mnk;
import nws;
import oka;
import olm;
import ome;

public class LocalPhotosActivity extends ome
    implements dhq
{

    private static final ekk d;
    private final mmr e;
    private hzh h;
    private hyy i;
    private ehr j;

    public LocalPhotosActivity()
    {
        Object obj = new mnk(this, g);
        obj.a = false;
        e = ((mnk) (obj)).a(f);
        new iae(this, g);
        (new dhb(this, g)).a(f);
        (new fnt(this, g)).a(f);
        obj = (new gog(this, g, aa.q, aa.w)).a(f);
        (new nws(this, g, ((nwn) (obj)))).a(f);
        new ggi(this, g);
        (new fpj(g)).a(f);
        new fpg(this, g, aa.q);
        (new iwd(this, aa.F)).a(f);
        (new hzr(this, g)).a(f);
        new hfo(this, g);
        (new gaj(this, g, aa.t, d)).a(f);
        (new gqy()).a(f);
        (new oka(this, g)).a(f);
        new hyu(g);
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        h = (hzh)f.a(hzh);
        i = (hyy)f.a(hyy);
        bundle = getIntent();
        j = new ehr((ekq)bundle.getParcelableExtra("com.google.android.apps.photos.core.media_collection"), (ekw)bundle.getParcelableExtra("com.google.android.apps.photos.core.query_options"));
        bundle = f;
        bundle.a(hzv, new fwl(e));
        bundle.a(dhq, this);
    }

    public final void ag_()
    {
        if (h.b.a.size() <= 0)
        {
            setResult(0);
        } else
        {
            Intent intent = new Intent();
            h.a(intent);
            setResult(-1, intent);
        }
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(b.qA);
        if (bundle == null)
        {
            Object obj = new fxn();
            obj.a = j.a;
            obj.b = j.b;
            obj.c = i.b();
            bundle = new Bundle();
            bundle.putParcelable("com.google.android.apps.photos.core.media_collection", ((fxn) (obj)).a);
            bundle.putParcelable("com.google.android.apps.photos.core.query_options", ((fxn) (obj)).b);
            bundle.putBoolean("is_picker", ((fxn) (obj)).c);
            obj = new fxk();
            ((fxk) (obj)).f(bundle);
            c().a().a(aa.q, ((am) (obj))).b();
        }
    }

    static 
    {
        d = (new ekm()).a(gnw.a).a(fxk.a).a();
    }
}
