// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.kik.cards.web.plugin.JavascriptGlue;
import com.kik.cards.web.plugin.h;
import com.kik.g.e;
import com.kik.g.f;
import com.kik.g.i;
import com.kik.g.k;
import com.kik.m.a;
import kik.a.e.q;
import org.c.b;

// Referenced classes of package com.kik.cards.web:
//            aq, be, ba, au, 
//            az

public final class bd extends aq
{

    private final k c;
    private JavascriptGlue d;
    private h e;
    private final i f;
    private k g;

    public bd(Context context, au au, a a, az az, kik.a.f.k k1, q q1)
    {
        super(context, q1);
        c = new k(this);
        f = new be(this);
        g = new k(this);
        context = "dev";
        q1 = getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 0).versionName;
        context = q1;
_L2:
        e = new h(a, context, k1);
        d = JavascriptGlue.a(this, e, au, az);
        l().a(d.a().a(), g);
        l().a(e.a(), f);
        return;
        q1;
        a.b("Could not retrieve app version");
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void destroy()
    {
        v();
        super.destroy();
    }

    public final e q()
    {
        return g.a();
    }

    public final h r()
    {
        return e;
    }

    public final JavascriptGlue s()
    {
        return d;
    }

    public final e t()
    {
        return d.a().c();
    }

    public final e u()
    {
        return d.a().b();
    }

    public final void v()
    {
        if (d != null)
        {
            d.b();
            d = null;
        }
        if (e != null)
        {
            e.c();
            e = null;
        }
    }

    public final boolean w()
    {
        return e.b();
    }
}
