// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.graphics.Point;
import android.view.View;
import com.google.android.m4b.maps.df.b;
import com.google.android.m4b.maps.df.c;
import com.google.android.m4b.maps.df.d;
import com.google.android.m4b.maps.df.e;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.StreetViewPanoramaCamera;
import com.google.android.m4b.maps.model.StreetViewPanoramaLocation;
import com.google.android.m4b.maps.model.StreetViewPanoramaOrientation;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            ay

public interface av
{

    public abstract Point a(StreetViewPanoramaOrientation streetviewpanoramaorientation);

    public abstract StreetViewPanoramaOrientation a(int l, int i1);

    public abstract void a();

    public abstract void a(at.a a1);

    public abstract void a(b b1);

    public abstract void a(c c1);

    public abstract void a(d d1);

    public abstract void a(e e1);

    public abstract void a(LatLng latlng);

    public abstract void a(LatLng latlng, int l);

    public abstract void a(StreetViewPanoramaCamera streetviewpanoramacamera, long l);

    public abstract void a(StreetViewPanoramaCamera streetviewpanoramacamera, String s);

    public abstract void a(String s);

    public abstract void a(String s, LatLng latlng, Integer integer, ay ay);

    public abstract void a(boolean flag);

    public abstract void b();

    public abstract void b(boolean flag);

    public abstract void c(boolean flag);

    public abstract StreetViewPanoramaLocation d();

    public abstract void d(boolean flag);

    public abstract StreetViewPanoramaCamera e();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract View k();
}
