// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.util;

import android.graphics.Point;
import android.os.Handler;
import android.os.SystemClock;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

public class DropMarkerAnimator
    implements Runnable
{

    private static final long DURATION = 300L;
    private LatLng endLatLng;
    private final Handler handler = new Handler();
    private final Interpolator interpolator = new AccelerateInterpolator();
    private final Marker marker;
    private long start;
    private LatLng startLatLng;

    public DropMarkerAnimator(Marker marker1, Projection projection)
    {
        marker = marker1;
        Point point = projection.toScreenLocation(marker1.getPosition());
        point.set(point.x, -500);
        startLatLng = projection.fromScreenLocation(point);
        endLatLng = marker1.getPosition();
    }

    public void drop()
    {
        start = SystemClock.uptimeMillis();
        handler.post(this);
    }

    public void run()
    {
        long l = SystemClock.uptimeMillis();
        long l1 = start;
        float f = interpolator.getInterpolation((float)(l - l1) / 300F);
        double d = f;
        double d1 = endLatLng.longitude;
        double d2 = 1.0F - f;
        double d3 = startLatLng.longitude;
        double d4 = f;
        double d5 = endLatLng.latitude;
        double d6 = 1.0F - f;
        double d7 = startLatLng.latitude;
        marker.setPosition(new LatLng(d4 * d5 + d6 * d7, d * d1 + d2 * d3));
        marker.setVisible(true);
        if ((double)f < 1.0D)
        {
            handler.postDelayed(this, 16L);
            return;
        } else
        {
            marker.setPosition(endLatLng);
            return;
        }
    }
}
