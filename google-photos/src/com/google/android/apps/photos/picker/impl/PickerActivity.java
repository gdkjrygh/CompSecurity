// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.picker.impl;

import am;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import ay;
import b;
import bp;
import dhb;
import dhq;
import ehr;
import ekq;
import ekw;
import fmi;
import hfo;
import hyl;
import hyu;
import hyv;
import hzg;
import hzh;
import hzj;
import iae;
import iwc;
import iwd;
import java.util.Set;
import mmr;
import mnk;
import nwn;
import nws;
import olm;
import ome;
import rv;
import ss;
import su;
import u;

public final class PickerActivity extends ome
    implements dhq, nwn
{

    private final mmr d;
    private final hzg e;
    private hzh h;
    private hyv i;

    public PickerActivity()
    {
        d = (new mnk(this, g)).a(f);
        new iae(this, g);
        (new nws(this, g, this)).a(f);
        (new dhb(this, g)).a(f);
        new hfo(this, g);
        new hyu(g);
        new hyl(this, g, "scroll_to_media");
        e = new hzg(g, (byte)0);
    }

    private boolean f()
    {
        return g() > 1;
    }

    private int g()
    {
        return getIntent().getIntExtra("com.google.android.apps.photos.selection.cabmode.extra_min_selection_count", 1);
    }

    private boolean h()
    {
        return i() < 500;
    }

    private int i()
    {
        return getIntent().getIntExtra("com.google.android.apps.photos.selection.cabmode.extra_max_selection_count", 0x7fffffff);
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        h = (hzh)f.a(hzh);
        i = (hyv)f.a(hyv);
        f.a(dhq, this);
        f.a(iwc, new iwd(this, u.r));
    }

    public final void ag_()
    {
        Object obj = e().a();
        if (obj != null)
        {
            ((rv) (obj)).a("");
        }
        if (h.b.a.size() <= 0)
        {
            finish();
            return;
        }
        obj = new Intent();
        if (getIntent().getBooleanExtra("use_large_selection", false))
        {
            i.a(u.p, h.b.a());
        } else
        {
            h.a(((Intent) (obj)));
        }
        setResult(-1, ((Intent) (obj)));
        finish();
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(b.vF);
        a((Toolbar)findViewById(u.q));
        TextView textview = (TextView)findViewById(u.n);
        int j;
        if (f() || h())
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != 0)
        {
            j = g();
            int k = i();
            Object obj;
            if (f() && h())
            {
                obj = getString(b.vI, new Object[] {
                    Integer.valueOf(j), Integer.valueOf(k)
                });
            } else
            if (f())
            {
                obj = getString(b.vH, new Object[] {
                    Integer.valueOf(j)
                });
            } else
            if (h())
            {
                obj = getString(b.vG, new Object[] {
                    Integer.valueOf(k)
                });
            } else
            {
                obj = null;
            }
            textview.setText(((CharSequence) (obj)));
        } else
        {
            textview.setVisibility(8);
        }
        if (bundle == null)
        {
            bundle = (ekw)getIntent().getParcelableExtra("com.google.android.apps.photos.core.query_options");
            obj = new fmi();
            obj.d = b.a(d.d(), null);
            obj.a = bundle;
            obj.c = true;
            obj = ((fmi) (obj)).a();
            c().a().b(u.o, ((am) (obj)), "photos_fragment").b();
            if (getIntent().hasExtra("com.google.android.apps.photos.core.media_collection"))
            {
                bundle = new ehr((ekq)getIntent().getParcelableExtra("com.google.android.apps.photos.core.media_collection"), bundle);
                e.a(bundle);
            }
        }
    }

    public final am u()
    {
        return c().a(u.o);
    }
}
