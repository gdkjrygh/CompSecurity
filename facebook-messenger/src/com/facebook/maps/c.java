// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.maps;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.location.Location;
import com.facebook.h;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Projection;

public class c extends MyLocationOverlay
{

    private boolean a;
    private Paint b;
    private Point c;
    private Point d;
    private Drawable e;
    private int f;
    private int g;

    public c(Context context, MapView mapview)
    {
        super(context, mapview);
        a = false;
    }

    protected void drawMyLocation(Canvas canvas, MapView mapview, Location location, GeoPoint geopoint, long l)
    {
        if (!a)
        {
            try
            {
                super.drawMyLocation(canvas, mapview, location, geopoint, l);
            }
            catch (Exception exception)
            {
                a = true;
            }
        }
        if (a)
        {
            if (e == null)
            {
                b = new Paint();
                b.setAntiAlias(true);
                b.setStrokeWidth(2.0F);
                e = mapview.getContext().getResources().getDrawable(h.orca_mylocation);
                f = e.getIntrinsicWidth();
                g = e.getIntrinsicHeight();
                c = new Point();
                d = new Point();
            }
            mapview = mapview.getProjection();
            double d1 = location.getLatitude();
            double d2 = location.getLongitude();
            float f1 = location.getAccuracy();
            location = new float[1];
            Location.distanceBetween(d1, d2, d1, d2 + 1.0D, location);
            float f2 = location[0];
            mapview.toPixels(new GeoPoint((int)(d1 * 1000000D), (int)((d2 - (double)(f1 / f2)) * 1000000D)), d);
            mapview.toPixels(geopoint, c);
            int i = c.x - d.x;
            b.setColor(0xff6666ff);
            b.setStyle(android.graphics.Paint.Style.STROKE);
            canvas.drawCircle(c.x, c.y, i, b);
            b.setColor(0x186666ff);
            b.setStyle(android.graphics.Paint.Style.FILL);
            canvas.drawCircle(c.x, c.y, i, b);
            e.setBounds(c.x - f / 2, c.y - g / 2, c.x + f / 2, c.y + g / 2);
            e.draw(canvas);
        }
    }
}
