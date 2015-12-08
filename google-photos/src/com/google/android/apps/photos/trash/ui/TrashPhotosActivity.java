// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.trash.ui;

import android.os.Bundle;
import ay;
import b;
import bp;
import co;
import dhb;
import ekk;
import ekm;
import fnt;
import fpg;
import fpj;
import gaj;
import gnw;
import gog;
import gqy;
import hfo;
import hzv;
import iae;
import iwd;
import jbm;
import jbr;
import mnk;
import nws;
import oka;
import olm;
import ome;

public class TrashPhotosActivity extends ome
{

    private static final ekk d;

    public TrashPhotosActivity()
    {
        (new dhb(this, g)).a(f);
        new iae(this, g);
        Object obj = new mnk(this, g);
        obj.a = true;
        ((mnk) (obj)).a(f);
        (new fnt(this, g)).a(f);
        new hfo(this, g);
        (new fpj(g)).a(f);
        new fpg(this, g, co.c);
        obj = (new gog(this, g, co.c, co.e)).a(f);
        (new nws(this, g, ((nwn) (obj)))).a(f);
        (new iwd(this, co.i)).a(f);
        (new gaj(this, g, co.d, d)).a(f);
        (new oka(this, g)).a(f);
        (new gqy()).a(f);
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        f.a(hzv, new jbm());
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(b.BC);
        if (bundle == null)
        {
            c().a().a(co.c, new jbr()).b();
        }
    }

    static 
    {
        d = (new ekm()).a(gnw.a).a(jbr.a).a();
    }
}
