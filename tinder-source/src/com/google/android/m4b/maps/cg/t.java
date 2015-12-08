// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.internal.i;
import com.google.android.m4b.maps.model.internal.j;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            y

public final class t extends com.google.android.m4b.maps.model.internal.i.a
{

    public final y a;
    String b;
    String c;
    private final String d;
    private final LatLng e;

    public t(y y, String s, LatLng latlng)
    {
        b = null;
        c = null;
        a = y;
        d = s;
        e = latlng;
    }

    public final j a()
    {
        return a;
    }

    public final boolean a(i i)
    {
        return equals(i);
    }

    public final String b()
    {
        return d;
    }

    public final LatLng c()
    {
        return e;
    }

    public final String d()
    {
        return b;
    }

    public final String e()
    {
        return c;
    }

    public final int f()
    {
        return hashCode();
    }
}
