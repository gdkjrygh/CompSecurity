// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import com.google.android.m4b.maps.model.LatLng;

public interface s
{
    public static final class a
        implements s
    {

        public final LatLng a(float f, LatLng latlng, LatLng latlng1)
        {
            return new LatLng((latlng1.b - latlng.b) * (double)f + latlng.b, (latlng1.c - latlng.c) * (double)f + latlng.c);
        }

        public a()
        {
        }
    }


    public abstract LatLng a(float f, LatLng latlng, LatLng latlng1);
}
