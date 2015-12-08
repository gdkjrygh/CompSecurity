// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import android.content.res.Resources;
import android.location.Location;
import com.google.android.m4b.maps.bo.f;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bx.d;
import com.google.android.m4b.maps.y.j;

// Referenced classes of package com.google.android.m4b.maps.aq:
//            v

public final class k
    implements com.google.android.m4b.maps.cg.ae.a
{

    private final v a;
    private final Resources b;
    private d c;

    public k(v v1)
    {
        a = (v)j.a(v1);
        b = v1.getResources();
    }

    public final void a()
    {
        if (c == null)
        {
            c = a.n();
            d d1 = c;
            float f1 = b.getDimension(com.google.android.m4b.maps.h.d.maps_vm_mylocation_dot_size);
            int i = b.getInteger(com.google.android.m4b.maps.h.f.maps_vm_mylocation_dot_opaque_percent);
            int l = b.getInteger(com.google.android.m4b.maps.h.f.maps_vm_mylocation_chevron_opaque_percent);
            d1.a = f1 * 0.5F;
            d1.b = (float)i / 100F;
            d1.c = (float)l / 100F;
        }
        a.a(c);
    }

    public final void a(Location location)
    {
        g g1 = g.a(location.getLatitude(), location.getLongitude());
        f f1 = new f(g1, location.getBearing(), (int)location.getAccuracy());
        f1.d = g1;
        f1.e = location.hasBearing();
        c.a(f1);
        a.a(true, true);
    }

    public final void b()
    {
        a.b(c);
    }
}
