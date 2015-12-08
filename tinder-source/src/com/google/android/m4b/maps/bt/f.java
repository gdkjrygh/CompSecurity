// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bt;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.location.Location;
import com.google.android.m4b.maps.y.j;

// Referenced classes of package com.google.android.m4b.maps.bt:
//            d

public final class f
    implements com.google.android.m4b.maps.cg.ae.a
{

    final Resources a;
    boolean b;
    Paint c;
    Location d;
    Bitmap e;
    Bitmap f;
    private final d g;

    public f(d d1)
    {
        b = false;
        c = new Paint();
        g = (d)j.a(d1);
        a = d1.getResources();
    }

    public final void a()
    {
        if (!b)
        {
            g.invalidate();
        }
        b = true;
    }

    public final void a(Location location)
    {
        if (location != d)
        {
            g.invalidate();
        }
        d = location;
    }

    public final void b()
    {
        if (b)
        {
            g.invalidate();
        }
        b = false;
    }
}
