// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.graphics.PointF;
import android.media.ExifInterface;
import android.support.v4.view.MotionEventCompat;
import android.util.FloatMath;
import android.view.MotionEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class bp
{

    private static bp a = null;

    private bp()
    {
    }

    public static float a(MotionEvent motionevent, int i)
    {
        return MotionEventCompat.getX(motionevent, i);
    }

    public static int a(MotionEvent motionevent)
    {
        return MotionEventCompat.getPointerCount(motionevent);
    }

    public static bp a()
    {
        if (a == null)
        {
            a = new bp();
        }
        return a;
    }

    public static void a(String s)
    {
        try
        {
            s = new ExifInterface(s);
            s.setAttribute("DateTime", (new SimpleDateFormat("yyyy:MM:dd HH:mm:ss")).format(new Date()));
            s.setAttribute("Make", "http://photogrid.org");
            s.saveAttributes();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    public static void a(String s, String s1)
    {
        try
        {
            s = new ExifInterface(s);
            s1 = new ExifInterface(s1);
            s1.setAttribute("DateTime", (new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.ENGLISH)).format(new Date()));
            if (s.getAttribute("Flash") != null)
            {
                s1.setAttribute("Flash", s.getAttribute("Flash"));
            }
            if (s.getAttribute("GPSLatitude") != null)
            {
                s1.setAttribute("GPSLatitude", s.getAttribute("GPSLatitude"));
            }
            if (s.getAttribute("GPSLatitudeRef") != null)
            {
                s1.setAttribute("GPSLatitudeRef", s.getAttribute("GPSLatitudeRef"));
            }
            if (s.getAttribute("GPSLongitude") != null)
            {
                s1.setAttribute("GPSLongitude", s.getAttribute("GPSLongitude"));
            }
            if (s.getAttribute("GPSLongitudeRef") != null)
            {
                s1.setAttribute("GPSLongitudeRef", s.getAttribute("GPSLongitudeRef"));
            }
            if (android.os.Build.VERSION.SDK_INT >= 9)
            {
                if (s.getAttribute("GPSAltitude") != null)
                {
                    s1.setAttribute("GPSAltitude", s.getAttribute("GPSAltitude"));
                }
                if (s.getAttribute("GPSAltitudeRef") != null)
                {
                    s1.setAttribute("GPSAltitudeRef", s.getAttribute("GPSAltitudeRef"));
                }
            }
            if (s.getAttribute("Make") != null)
            {
                s1.setAttribute("Make", s.getAttribute("Make"));
            }
            if (s.getAttribute("Model") != null)
            {
                s1.setAttribute("Model", s.getAttribute("Model"));
            }
            if (s.getAttribute("WhiteBalance") != null)
            {
                s1.setAttribute("WhiteBalance", s.getAttribute("WhiteBalance"));
            }
            s1.saveAttributes();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    public static float b(MotionEvent motionevent)
    {
        float f2 = (int)MotionEventCompat.getX(motionevent, 0);
        float f = (int)MotionEventCompat.getY(motionevent, 0);
        float f3 = (int)MotionEventCompat.getX(motionevent, 1);
        float f1 = (int)MotionEventCompat.getY(motionevent, 1);
        f2 -= f3;
        f -= f1;
        return FloatMath.sqrt(f2 * f2 + f * f);
    }

    public static float b(MotionEvent motionevent, int i)
    {
        return MotionEventCompat.getY(motionevent, i);
    }

    public static float c(MotionEvent motionevent)
    {
        double d = 1.0D;
        PointF pointf = new PointF((int)MotionEventCompat.getX(motionevent, 0), (int)MotionEventCompat.getY(motionevent, 0));
        motionevent = new PointF((int)MotionEventCompat.getX(motionevent, 1), (int)MotionEventCompat.getY(motionevent, 1));
        float f = pointf.x - ((PointF) (motionevent)).x;
        float f1 = pointf.y - ((PointF) (motionevent)).y;
        double d1 = (double)f / Math.sqrt(f * f + f1 * f1);
        float f2;
        if (d1 <= 1.0D)
        {
            if (d1 < -1D)
            {
                d = -1D;
            } else
            {
                d = d1;
            }
        }
        f2 = (float)((Math.asin(d) * 180D) / 3.1415926535897931D);
        if (f >= 0.0F && f1 <= 0.0F)
        {
            return 360F - f2;
        }
        if (f <= 0.0F && f1 <= 0.0F)
        {
            return -f2;
        }
        if (f <= 0.0F && f1 >= 0.0F)
        {
            return f2 + 180F;
        }
        if (f >= 0.0F && f1 >= 0.0F)
        {
            return f2 + 180F;
        } else
        {
            return 0.0F;
        }
    }

}
