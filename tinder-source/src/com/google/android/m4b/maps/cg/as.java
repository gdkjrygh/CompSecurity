// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.m4b.maps.StreetViewPanoramaOptions;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.da.b;
import com.google.android.m4b.maps.da.d;
import com.google.android.m4b.maps.df.f;
import com.google.android.m4b.maps.df.i;
import com.google.android.m4b.maps.df.n;
import com.google.android.m4b.maps.g.g;
import com.google.android.m4b.maps.y.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            at, bj

public final class as extends com.google.android.m4b.maps.df.j.a
{
    public static interface a
    {

        public abstract at a(StreetViewPanoramaOptions streetviewpanoramaoptions);
    }


    private final a a;
    private at b;
    private StreetViewPanoramaOptions c;
    private final List d = new ArrayList();
    private Context e;

    public as(a a1, Context context)
    {
        a = (a)j.a(a1);
        e = context;
    }

    public final b a(b b1, Bundle bundle)
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        com.google.android.m4b.maps.da.d.a(b1);
        b = a.a(c);
        b.a(bundle);
        b1 = b.b;
        f f1;
        for (bundle = d.iterator(); bundle.hasNext(); b.a(f1))
        {
            f1 = (f)bundle.next();
        }

        d.clear();
_L4:
        return com.google.android.m4b.maps.da.d.a(b1);
_L2:
        b1 = b.b;
        bundle = (ViewGroup)b1.getParent();
        if (bundle != null)
        {
            bundle.removeView(b1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final i a()
    {
        if (g.e(e))
        {
            ab.a("This device does not support the use of StreetViewPanoramaFragment.getStreetViewPanorama(). Please use StreetViewPanoramaFragment.getStreetViewPanoramaAsync() instead.");
            return null;
        } else
        {
            return b;
        }
    }

    public final void a(Bundle bundle)
    {
        if (c == null)
        {
            c = (StreetViewPanoramaOptions)n.a(bundle, "StreetViewPanoramaOptions");
        }
        if (c == null)
        {
            c = new StreetViewPanoramaOptions();
        }
    }

    public final void a(StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        c = streetviewpanoramaoptions;
    }

    public final void a(f f1)
    {
        if (b != null)
        {
            b.a(f1);
            return;
        } else
        {
            d.add(f1);
            return;
        }
    }

    public final void b()
    {
        b.a();
    }

    public final void b(Bundle bundle)
    {
        if (b == null)
        {
            if (c != null)
            {
                n.a(bundle, "StreetViewPanoramaOptions", c);
            }
            return;
        } else
        {
            b.b(bundle);
            return;
        }
    }

    public final void c()
    {
        b.b();
    }

    public final void d()
    {
        at at1 = b;
        boolean flag;
        if (at1.a.j != null && at1.a.j.booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            b.c();
            b = null;
        }
    }

    public final void e()
    {
        if (b != null)
        {
            b.c();
            b = null;
        }
        c = null;
    }

    public final boolean f()
    {
        return b != null;
    }

    // Unreferenced inner class com/google/android/m4b/maps/cg/as$1

/* anonymous class */
    public final class _cls1
        implements a
    {

        private boolean a;
        private bj b;

        public final at a(StreetViewPanoramaOptions streetviewpanoramaoptions)
        {
            return at.a(streetviewpanoramaoptions, b);
        }

            public 
            {
                a = flag;
                b = bj;
                super();
            }
    }

}
