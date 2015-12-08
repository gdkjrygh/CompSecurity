// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.b.i;
import com.google.android.gms.ads.internal.formats.c;
import com.google.android.gms.b.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            bk

public final class dq extends dl.a
{

    private final i a;

    public dq(i k)
    {
        a = k;
    }

    public final String a()
    {
        return a.f();
    }

    public final void a(com.google.android.gms.b.c c1)
    {
        com.google.android.gms.b.d.a(c1);
    }

    public final List b()
    {
        Object obj = a.g();
        if (obj != null)
        {
            ArrayList arraylist = new ArrayList();
            com.google.android.gms.ads.formats.a.a a1;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(new c(a1.a(), a1.b())))
            {
                a1 = (com.google.android.gms.ads.formats.a.a)((Iterator) (obj)).next();
            }

            return arraylist;
        } else
        {
            return null;
        }
    }

    public final void b(com.google.android.gms.b.c c1)
    {
        a.a((View)com.google.android.gms.b.d.a(c1));
    }

    public final String c()
    {
        return a.h();
    }

    public final bk d()
    {
        com.google.android.gms.ads.formats.a.a a1 = a.i();
        if (a1 != null)
        {
            return new c(a1.a(), a1.b());
        } else
        {
            return null;
        }
    }

    public final String e()
    {
        return a.j();
    }

    public final String f()
    {
        return a.k();
    }

    public final void g()
    {
    }

    public final boolean h()
    {
        return a.c();
    }

    public final boolean i()
    {
        return a.d();
    }

    public final Bundle j()
    {
        return a.e();
    }
}
