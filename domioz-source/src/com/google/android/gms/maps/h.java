// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.bp;
import com.google.android.gms.maps.internal.d;

// Referenced classes of package com.google.android.gms.maps:
//            c, e, g

final class h extends bp
{

    final e a;
    final g b;

    h(g g, e e1)
    {
        b = g;
        a = e1;
        super();
    }

    public final void a(d d)
    {
        a.onMapReady(new c(d));
    }
}
