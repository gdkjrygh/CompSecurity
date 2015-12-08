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
import ibv;
import mnk;
import mov;
import moy;
import moz;
import oka;
import ome;
import p;
import rv;

public class PhotosTracingSettingsActivity extends ome
    implements moy
{

    public PhotosTracingSettingsActivity()
    {
        (new mnk(this, g)).a(f).a = false;
        new oka(this, g);
        new ibv(this, this, g);
        (new mov(this, g, b.yC)).a(f).c(this);
        (new fnt(this, g)).a(f);
        new fno(g, p.aN, fnl.i);
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
