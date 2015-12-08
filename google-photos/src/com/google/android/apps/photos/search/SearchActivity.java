// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.search;

import am;
import android.os.Bundle;
import android.view.Window;
import android.widget.EditText;
import ay;
import b;
import bp;
import c;
import com.google.android.libraries.social.ui.views.expandingscrollview.ExpandingScrollView;
import dfo;
import dhb;
import dht;
import did;
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
import hrh;
import hri;
import hrj;
import hrl;
import hrs;
import hry;
import hvk;
import hwd;
import hxh;
import hxw;
import hyy;
import hzr;
import hzv;
import iae;
import iwd;
import jdv;
import mnk;
import nud;
import nug;
import nws;
import ojm;
import oka;
import olm;
import ome;
import p;

public class SearchActivity extends ome
{

    private static final ekk d;
    private hwd e;
    private ExpandingScrollView h;
    private hrl i;
    private gog j;
    private did k;
    private hyy l;
    private nug m;
    private hxh n;
    private nug o;

    public SearchActivity()
    {
        j = (new gog(this, g, p.ar, p.al)).a(f);
        m = new hrh(this);
        Object obj = new hxh(g);
        f.a(hxh, obj);
        n = ((hxh) (obj));
        o = new hri(this);
        (new mnk(this, g)).a(f);
        (new dhb(this, g)).a(f);
        new iae(this, g);
        (new fnt(this, g)).a(f);
        obj = new hry(g);
        f.a(hry, obj);
        (new hzr(this, g)).a(f);
        (new nws(this, g, j)).a(f);
        (new fpj(g)).a(f);
        new fpg(this, g, p.ar);
        (new iwd(this, p.au)).a(f);
        new hfo(this, g);
        (new gaj(this, g, p.am, d)).a(f);
        (new hrs(g)).a(f);
        (new gqy()).a(f);
        (new oka(this, g)).a(f);
    }

    public static ExpandingScrollView a(SearchActivity searchactivity)
    {
        return searchactivity.h;
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        e = new hwd();
        f.a(hwd, e);
        f.a(hzv, e);
        bundle = new hvk();
        f.a(dht, bundle);
        f.a(hvk, bundle);
        k = (did)f.a(did);
        l = (hyy)f.a(hyy);
    }

    public void finish()
    {
        super.finish();
        overridePendingTransition(0, c.ev);
    }

    public void onBackPressed()
    {
        boolean flag2 = false;
        boolean flag1 = true;
        if (k.d())
        {
            super.onBackPressed();
        } else
        if (!j.d())
        {
            hrl hrl1 = i;
            hxw hxw1 = hrl1.a;
            boolean flag;
            if (hxw1.a.hasFocus())
            {
                hxw1.e();
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                flag = flag1;
            } else
            {
                if (hrl1.h().e() == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    flag = flag2;
                    if (hrl1.h().e() == 2)
                    {
                        flag = true;
                    }
                    if (flag && ((am) (hrl1.b)).R != null)
                    {
                        dfo.a(Boolean.valueOf(true), ((am) (hrl1.b)).R);
                    }
                    hrl1.h().c();
                    flag = flag1;
                } else
                {
                    flag = false;
                }
            }
            if (!flag)
            {
                super.onBackPressed();
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(b.xg);
        getWindow().clearFlags(0x10100);
        h = (ExpandingScrollView)findViewById(p.ap);
        j.e = h.findViewById(p.as);
        h.a(ojm.b, 0.0F);
        h.a(ExpandingScrollView.a);
        h.a(ojm.c, 100F);
        h.a(ojm.c, false);
        h.a(new hrj(this));
        ay ay1 = c();
        if (bundle == null)
        {
            i = new hrl();
            ay1.a().a(p.ar, i, "SearchFragment").b();
            ay1.b();
            return;
        } else
        {
            i = (hrl)ay1.a("SearchFragment");
            return;
        }
    }

    public void onStart()
    {
        super.onStart();
        l.a.a(m, true);
        n.a.a(o, true);
    }

    protected void onStop()
    {
        super.onStop();
        l.a.a(m);
        n.a.a(o);
    }

    static 
    {
        d = (new ekm()).a(gnw.a).b(jdv).a();
    }
}
