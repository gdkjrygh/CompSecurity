// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.settings;

import android.os.Bundle;
import android.view.MenuItem;
import b;
import fnl;
import fno;
import fnt;
import ibf;
import mmr;
import mnk;
import mov;
import moy;
import moz;
import obk;
import oka;
import olm;
import ome;
import p;
import rv;

public class PhotosAboutSettingsActivity extends ome
    implements moy, obk
{

    private mmr d;

    public PhotosAboutSettingsActivity()
    {
        mnk mnk1 = (new mnk(this, g)).a(f);
        mnk1.a = false;
        d = mnk1;
        new oka(this, g);
        new ibf(this, this, g);
        (new fnt(this, g)).a(f);
        new fno(g, p.aN, fnl.i);
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        (new mov(this, g, b.yC)).a(f).c(this);
        f.a(obk, this);
    }

    public final void a(String s)
    {
        if ("about_terms_pref_key".equals(s) && d.f())
        {
            d.d();
        }
    }

    public final void a(moz moz)
    {
    }

    public final void a(rv rv)
    {
    }

    public final boolean a(MenuItem menuitem)
    {
        return false;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(b.yz);
    }
}
