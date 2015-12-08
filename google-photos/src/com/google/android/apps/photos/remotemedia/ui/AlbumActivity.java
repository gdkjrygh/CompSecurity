// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.remotemedia.ui;

import ag;
import android.content.Intent;
import android.os.Bundle;
import ay;
import b;
import bp;
import dhb;
import ejz;
import ekk;
import ekm;
import eko;
import ekq;
import fia;
import fiu;
import fnt;
import fpg;
import fpj;
import gaj;
import ggi;
import gnw;
import gog;
import gqy;
import hfo;
import hhq;
import hkl;
import hli;
import hlj;
import hls;
import hmg;
import hmj;
import hmn;
import hmz;
import hyu;
import hzo;
import hzr;
import hzv;
import iae;
import ikq;
import iwd;
import iwq;
import iwu;
import mnk;
import nws;
import oka;
import olm;
import ome;

public class AlbumActivity extends ome
    implements fia, fiu
{

    private static final ekk d;
    private final gog e;

    public AlbumActivity()
    {
        e = (new gog(this, g, ag.l, ag.D)).a(f);
        (new hkl(g)).a(f);
        (new nws(this, g, e)).a(f);
        new oka(this, g);
        new iae(this, g);
        new hmg(g);
        (new dhb(this, g)).a(f);
        mnk mnk1 = new mnk(this, g);
        mnk1.a = true;
        mnk1.a(f);
        (new fnt(this, g)).a(f);
        new hfo(this, g);
        (new hzr(this, g)).a(f);
        (new hzo(this, g)).a(f);
        (new fpj(g)).a(f);
        new fpg(this, g, ag.l);
        (new iwd(this, ag.aa)).a(f);
        (new gaj(this, g, ag.K, d)).a(f);
        (new gqy()).a(f);
        (new hli(g)).a(f);
        (new hlj(g)).a(f);
        new hyu(g);
        new ggi(this, g);
        (new oka(this, g)).a(f);
        (new hls(g)).a(f);
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        bundle = (ekq)getIntent().getExtras().get("com.google.android.apps.photos.core.media_collection");
        olm olm1 = f;
        olm1.a(iwq, new iwu(this, ag.Z));
        olm1.a(hzv, new hmj());
        olm1.a(hhq, new hhq());
        olm1.a(ejz, new eko(bundle));
        olm1.a(fia, this);
        olm1.a(fiu, this);
    }

    public final void a(ikq ikq)
    {
    }

    public final void h()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(b.wJ);
        if (bundle == null)
        {
            bundle = (ekq)getIntent().getExtras().get("com.google.android.apps.photos.core.media_collection");
            hmz hmz1 = hmz.a();
            c().a().b(ag.l, hmn.a(bundle, hmz1)).b();
            c().b();
        }
    }

    static 
    {
        d = (new ekm()).a(gnw.a).a(hmn.a).a();
    }
}
