// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.sharedlinks;

import am;
import android.os.Bundle;
import ay;
import b;
import ce;
import dhb;
import dhc;
import dsu;
import fpj;
import iis;
import mnk;
import msi;
import nwn;
import nws;
import oka;
import olm;
import ome;
import pwz;

public final class SharedLinksActivity extends ome
    implements nwn
{

    public SharedLinksActivity()
    {
        Object obj = new mnk(this, g);
        obj.a = true;
        ((mnk) (obj)).a(f);
        (new oka(this, g)).a(f);
        (new msi(pwz.k)).a(f);
        obj = new iis(g);
        f.b(dhc, obj);
        new dsu(g, (byte)0);
        (new dhb(this, g)).a(f);
        (new nws(this, g, this)).a(f);
        (new fpj(g)).a(f);
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(b.zx);
    }

    public final am u()
    {
        return c().a(ce.z);
    }
}
