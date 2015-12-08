// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.timemachine;

import android.content.Intent;
import android.os.Bundle;
import b;
import cn;
import dhb;
import ejz;
import ekk;
import ekm;
import eko;
import ekq;
import fnt;
import fpg;
import fpj;
import gaj;
import gnw;
import gog;
import gqy;
import hfo;
import hzr;
import hzv;
import iae;
import ivp;
import iwd;
import mnk;
import nws;
import oka;
import olm;
import ome;

// Referenced classes of package com.google.android.apps.photos.timemachine:
//            TimeMachineFragment

public final class TimeMachineActivity extends ome
{

    private static final ekk d;
    private final gog e;

    public TimeMachineActivity()
    {
        e = (new gog(this, g, cn.H, cn.z)).a(f);
        (new nws(this, g, e)).a(f);
        new iae(this, g);
        (new dhb(this, g)).a(f);
        mnk mnk1 = new mnk(this, g);
        mnk1.a = true;
        mnk1.a(f);
        (new fnt(this, g)).a(f);
        new hfo(this, g);
        (new hzr(this, g)).a(f);
        (new fpj(g)).a(f);
        new fpg(this, g, cn.H);
        (new iwd(this, cn.J)).a(f);
        (new gaj(this, g, cn.D, d)).a(f);
        (new oka(this, g)).a(f);
        (new gqy()).a(f);
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        bundle = (ekq)getIntent().getExtras().get("com.google.android.apps.photos.core.media_collection");
        f.a(ejz, new eko(bundle));
        bundle = new ivp();
        f.a(hzv, bundle);
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(b.AZ);
    }

    static 
    {
        d = (new ekm()).a(gnw.a).a(TimeMachineFragment.a).a();
    }
}
