// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlaceImpl, PlaceLocalization

public class a
{

    private int a;
    private String b;
    private Bundle c;
    private String d;
    private LatLng e;
    private float f;
    private LatLngBounds g;
    private String h;
    private Uri i;
    private boolean j;
    private float k;
    private int l;
    private long m;
    private List n;
    private String o;
    private String p;
    private String q;
    private List r;
    private boolean s;

    public a a(float f1)
    {
        f = f1;
        return this;
    }

    public f a(int i1)
    {
        l = i1;
        return this;
    }

    public l a(Uri uri)
    {
        i = uri;
        return this;
    }

    public i a(LatLng latlng)
    {
        e = latlng;
        return this;
    }

    public e a(LatLngBounds latlngbounds)
    {
        g = latlngbounds;
        return this;
    }

    public g a(String s1)
    {
        b = s1;
        return this;
    }

    public b a(List list)
    {
        n = list;
        return this;
    }

    public n a(boolean flag)
    {
        j = flag;
        return this;
    }

    public PlaceImpl a()
    {
        return new PlaceImpl(a, b, n, Collections.emptyList(), c, d, o, p, q, r, e, f, g, h, i, j, k, l, m, s, PlaceLocalization.a(d, o, p, q, r));
    }

    public r b(float f1)
    {
        k = f1;
        return this;
    }

    public k b(String s1)
    {
        d = s1;
        return this;
    }

    public d b(List list)
    {
        r = list;
        return this;
    }

    public r b(boolean flag)
    {
        s = flag;
        return this;
    }

    public s c(String s1)
    {
        o = s1;
        return this;
    }

    public o d(String s1)
    {
        p = s1;
        return this;
    }

    public ion()
    {
        a = 0;
    }
}
