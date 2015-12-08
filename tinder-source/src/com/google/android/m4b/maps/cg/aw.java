// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.m4b.maps.StreetViewPanoramaOptions;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.ag;
import com.google.android.m4b.maps.da.b;
import com.google.android.m4b.maps.da.d;
import com.google.android.m4b.maps.df.f;
import com.google.android.m4b.maps.df.i;
import com.google.android.m4b.maps.g.g;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            at, bj

public final class aw extends com.google.android.m4b.maps.df.k.a
{

    private at a;
    private final Context b;
    private final StreetViewPanoramaOptions c;
    private final bj d;

    public aw(Context context, StreetViewPanoramaOptions streetviewpanoramaoptions, bj bj)
    {
        b = context;
        if (streetviewpanoramaoptions == null)
        {
            streetviewpanoramaoptions = new StreetViewPanoramaOptions();
        }
        c = streetviewpanoramaoptions;
        d = bj;
    }

    public final i a()
    {
        if (g.e(b))
        {
            ab.a("This device does not support the use of StreetViewPanoramaView.getStreetViewPanorama(). Please use StreetViewPanoramaView.getStreetViewPanoramaAsync() instead.");
            return null;
        } else
        {
            return a;
        }
    }

    public final void a(Bundle bundle)
    {
        if (b instanceof Activity)
        {
            ag.a((Activity)b);
        }
        a = at.a(c, d);
        a.a(bundle);
    }

    public final void a(f f)
    {
        if (a != null)
        {
            a.a(f);
        }
    }

    public final void b()
    {
        a.c();
    }

    public final void b(Bundle bundle)
    {
        a.b(bundle);
    }

    public final void c()
    {
        a.a();
    }

    public final void d()
    {
        a.b();
    }

    public final b e()
    {
        return com.google.android.m4b.maps.da.d.a(a.b);
    }
}
