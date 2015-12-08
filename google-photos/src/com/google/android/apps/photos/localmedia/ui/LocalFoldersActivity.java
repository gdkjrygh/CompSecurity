// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.localmedia.ui;

import aa;
import android.os.Bundle;
import ay;
import b;
import bp;
import dhb;
import ekk;
import ekm;
import fnt;
import fpg;
import fpj;
import fwl;
import fwu;
import gaj;
import ggi;
import gnw;
import gog;
import gqy;
import hfo;
import hyu;
import hzr;
import hzv;
import iae;
import iwd;
import iwq;
import iwu;
import mmr;
import mnk;
import nws;
import oka;
import olm;
import ome;

public final class LocalFoldersActivity extends ome
{

    private static final ekk d;
    private final mmr e;

    public LocalFoldersActivity()
    {
        Object obj = new mnk(this, g);
        obj.a = false;
        e = ((mnk) (obj)).a(f);
        new iae(this, g);
        (new dhb(this, g)).a(f);
        (new fnt(this, g)).a(f);
        (new hzr(this, g)).a(f);
        obj = (new gog(this, g, aa.q, aa.w)).a(f);
        (new nws(this, g, ((nwn) (obj)))).a(f);
        new ggi(this, g);
        new hfo(this, g);
        (new fpj(g)).a(f);
        new fpg(this, g, aa.q);
        (new iwd(this, aa.F)).a(f);
        (new gaj(this, g, aa.s, d)).a(f);
        (new gqy()).a(f);
        new hyu(g);
        (new oka(this, g)).a(f);
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        bundle = f;
        bundle.a(iwq, new iwu(this, aa.D));
        bundle.a(hzv, new fwl(e));
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(b.qA);
        if (bundle == null)
        {
            c().a().a(aa.q, fwu.a(true)).b();
        }
    }

    static 
    {
        d = (new ekm()).a(gnw.a).a();
    }
}
