// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.b;

import android.app.Application;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.n;
import com.roidapp.photogrid.common.az;
import java.io.File;
import java.io.InputStream;

// Referenced classes of package com.roidapp.photogrid.b:
//            c, k, b, a

public final class e extends com.cm.kinfoc.a.e
{

    public e()
    {
    }

    public final String a(File file)
    {
        return com.roidapp.photogrid.b.c.a(file);
    }

    public final String a(InputStream inputstream)
    {
        return com.roidapp.photogrid.b.c.a(inputstream);
    }

    public final String a(String s)
    {
        return com.roidapp.photogrid.b.k.a().a((new StringBuilder("ifcpds_")).append(s).toString(), "");
    }

    public final void a(String s, String s1)
    {
        k k1 = com.roidapp.photogrid.b.k.a();
        if (s == null || s.equals("") || s1 == null || s1.equals(""))
        {
            return;
        } else
        {
            k1.b((new StringBuilder("ifcpds_")).append(s).toString(), s1);
            return;
        }
    }

    public final Application b()
    {
        return aj.a();
    }

    public final File c()
    {
        return com.roidapp.photogrid.b.b.a(aj.a().getApplicationContext());
    }

    public final boolean d()
    {
        return az.i;
    }

    public final boolean e()
    {
        return com.roidapp.photogrid.b.k.a().a("isAllowedReportInfo");
    }

    public final String f()
    {
        return com.roidapp.baselib.c.n.d(aj.a().getApplicationContext());
    }

    public final double g()
    {
        return com.roidapp.photogrid.b.a.b();
    }

    public final String h()
    {
        return com.roidapp.photogrid.b.a.a();
    }

    public final int i()
    {
        return com.roidapp.photogrid.b.a.c();
    }

    public final String j()
    {
        return com.roidapp.photogrid.b.a.d();
    }

    public final String k()
    {
        return com.roidapp.photogrid.b.a.f();
    }

    public final String l()
    {
        return com.roidapp.photogrid.b.a.e();
    }

    public final String m()
    {
        return com.roidapp.photogrid.b.a.g();
    }

    public final String n()
    {
        return com.roidapp.photogrid.b.a.h();
    }
}
