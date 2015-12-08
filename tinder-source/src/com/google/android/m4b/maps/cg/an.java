// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.model.LatLng;

public final class an
{

    public final double a;
    public final double b;
    public final double c;

    public an(double d, double d1, double d2)
    {
        a = d;
        b = d1;
        c = d2;
    }

    public static an a(LatLng latlng)
    {
        double d = Math.toRadians(latlng.b);
        double d1 = Math.toRadians(latlng.c);
        double d2 = Math.cos(d);
        return new an(Math.cos(d1) * d2, Math.sin(d1) * d2, Math.sin(d));
    }
}
