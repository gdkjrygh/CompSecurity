// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.lyft.animation;

import me.lyft.android.domain.location.Location;
import me.lyft.android.map.core.markers.IMarker;

interface LatLngInterpolator
{

    public static final LatLngInterpolator LINEAR = new LatLngInterpolator() {

        public void interpolate(IMarker imarker, float f, Location location, Location location1)
        {
            imarker.setPosition((location1.getLat().doubleValue() - location.getLat().doubleValue()) * (double)f + location.getLat().doubleValue(), (location1.getLng().doubleValue() - location.getLng().doubleValue()) * (double)f + location.getLng().doubleValue());
        }

    };
    public static final LatLngInterpolator LINEAR_FIXED = new LatLngInterpolator() {

        public void interpolate(IMarker imarker, float f, Location location, Location location1)
        {
            double d2 = location1.getLat().doubleValue();
            double d3 = location.getLat().doubleValue();
            double d4 = f;
            double d5 = location.getLat().doubleValue();
            double d1 = location1.getLng().doubleValue() - location.getLng().doubleValue();
            double d = d1;
            if (Math.abs(d1) > 180D)
            {
                d = d1 - Math.signum(d1) * 360D;
            }
            imarker.setPosition(d5 + (d2 - d3) * d4, d * (double)f + location.getLng().doubleValue());
        }

    };
    public static final LatLngInterpolator SPHERICAL = new LatLngInterpolator() {

        double computeAngleBetween(double d, double d1, double d2, double d3)
        {
            double d4 = Math.pow(Math.sin((d - d2) / 2D), 2D);
            d = Math.cos(d);
            d2 = Math.cos(d2);
            return Math.asin(Math.sqrt(d4 + Math.pow(Math.sin((d1 - d3) / 2D), 2D) * (d * d2))) * 2D;
        }

        public void interpolate(IMarker imarker, float f, Location location, Location location1)
        {
            double d2 = Math.toRadians(location.getLat().doubleValue());
            double d4 = Math.toRadians(location.getLng().doubleValue());
            double d = Math.toRadians(location1.getLat().doubleValue());
            double d5 = Math.toRadians(location1.getLng().doubleValue());
            double d6 = Math.cos(d2);
            double d7 = Math.cos(d);
            double d3 = computeAngleBetween(d2, d4, d, d5);
            double d8 = Math.sin(d3);
            if (d8 < 9.9999999999999995E-07D)
            {
                imarker.setPosition(location.getLat().doubleValue(), location.getLng().doubleValue());
                return;
            } else
            {
                double d1 = Math.sin((double)(1.0F - f) * d3) / d8;
                d8 = Math.sin(d3 * (double)f) / d8;
                d3 = d1 * d6 * Math.cos(d4) + d8 * d7 * Math.cos(d5);
                d4 = Math.sin(d4) * (d6 * d1) + Math.sin(d5) * (d8 * d7);
                d2 = Math.sin(d2);
                d = Math.atan2(d8 * Math.sin(d) + d2 * d1, Math.sqrt(d3 * d3 + d4 * d4));
                d1 = Math.atan2(d4, d3);
                imarker.setPosition(Math.toDegrees(d), Math.toDegrees(d1));
                return;
            }
        }

    };

    public abstract void interpolate(IMarker imarker, float f, Location location, Location location1);

}
