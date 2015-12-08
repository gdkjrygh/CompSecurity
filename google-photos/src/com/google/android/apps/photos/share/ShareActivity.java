// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.share;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import ay;
import b;
import bp;
import ce;
import com.google.android.libraries.social.ui.views.expandingscrollview.ExpandingScrollView;
import dhx;
import dsu;
import ekq;
import fjg;
import fpj;
import hyv;
import iec;
import java.util.Collection;
import mnk;
import msi;
import olm;
import ome;
import p;
import pwt;

public final class ShareActivity extends ome
{

    private hyv d;
    private final fjg e;

    public ShareActivity()
    {
        e = (new fjg(this, 0.0F, 60F)).a(f);
        (new msi(pwt.I)).a(f);
        new dsu(g, (byte)0);
        mnk mnk1 = new mnk(this, g);
        mnk1.a = false;
        mnk1.a(f);
        (new fpj(g)).a(f);
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        d = (hyv)f.a(hyv);
    }

    public final void finish()
    {
        super.finish();
        overridePendingTransition(0, p.bx);
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(b.yI);
        getWindow().clearFlags(0x10100);
        if (bundle == null)
        {
            ay ay1 = c();
            bundle = d.a(ce.e);
            ekq ekq1 = (ekq)getIntent().getParcelableExtra("com.google.android.apps.photos.core.media_collection");
            if (ekq1 == null && (bundle == null || bundle.isEmpty()))
            {
                throw new IllegalStateException("ShareActivity must be provided with either a collection or a non-empty media list.");
            }
            Object obj = getIntent();
            dhx dhx1 = (dhx)((Intent) (obj)).getParcelableExtra("share_method_constraints");
            boolean flag = ((Intent) (obj)).getBooleanExtra("is_time_machine_share", false);
            obj = new iec();
            obj.c = dhx1;
            obj.d = flag;
            if (ay1.a("fragment_share") == null)
            {
                if (bundle != null && !bundle.isEmpty())
                {
                    boolean flag1;
                    if (!bundle.isEmpty())
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    p.a(flag1, "media must be non-empty");
                    obj.a = bundle;
                    bundle = ((iec) (obj)).a();
                } else
                {
                    obj.b = ekq1;
                    bundle = ((iec) (obj)).a();
                }
                ay1.a().a(ce.b, bundle, "fragment_share").b();
            }
        }
        e.a((ExpandingScrollView)findViewById(ce.l));
    }
}
