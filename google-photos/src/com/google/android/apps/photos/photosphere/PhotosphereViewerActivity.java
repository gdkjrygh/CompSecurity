// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.photosphere;

import al;
import ame;
import amh;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;
import ay;
import ayt;
import azh;
import b;
import ejm;
import ejn;
import ekp;
import elt;
import fli;
import gap;
import hdy;
import hdz;
import hea;
import heb;
import hec;
import hed;
import hfx;
import java.util.Map;
import lzn;
import mfg;
import mjw;
import mnk;
import nvt;
import nww;
import olm;
import ome;

public class PhotosphereViewerActivity extends ome
{

    public final hfx d;
    public boolean e;
    private final hdy h;
    private final azh i = new hdz(this);
    private ejn j;
    private ekp k;
    private amh l;
    private fli m;

    public PhotosphereViewerActivity()
    {
        d = new hfx(this, g, new hed(this));
        h = new hdy(g, new hec(this));
        new nww(this, g);
        (new mnk(this, g)).a(f).a = false;
    }

    public static void a(PhotosphereViewerActivity photospherevieweractivity)
    {
        photospherevieweractivity.f();
    }

    public static boolean a(PhotosphereViewerActivity photospherevieweractivity, boolean flag)
    {
        photospherevieweractivity.e = true;
        return true;
    }

    public static void b(PhotosphereViewerActivity photospherevieweractivity)
    {
        Toast.makeText(photospherevieweractivity, b.vm, 0).show();
    }

    public static hfx c(PhotosphereViewerActivity photospherevieweractivity)
    {
        return photospherevieweractivity.d;
    }

    private void f()
    {
        android.net.Uri uri = j.a(k, ejm.c);
        hdy hdy1 = h;
        hdy1.a.a(uri, hdy1);
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        j = (ejn)f.a(ejn);
        l = (amh)f.a(amh);
        m = (fli)f.a(fli);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        int i1 = ((lzn)olm.a(this, lzn)).a(this);
        if (i1 != 0)
        {
            nvt.a(this).b.clear();
            bundle = c();
            if (bundle.a("GMS_error") == null)
            {
                heb.b(i1).a(bundle, "GMS_error");
            }
            return;
        }
        k = (ekp)getIntent().getParcelableExtra("com.google.android.apps.photos.core.media");
        bundle = ((elt)k.a(elt)).e();
        if (!bundle.e())
        {
            l.b(bundle).a(ayt.b(m.a(), (new mjw()).b())).a(i);
        } else
        {
            f();
        }
        (new Handler()).postDelayed(new hea(this), 200L);
    }
}
