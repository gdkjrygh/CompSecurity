// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.e;

import android.graphics.Point;
import android.view.Display;
import android_src.e.a;
import com.google.common.base.Preconditions;

public class s
{

    private final a a;

    public s(a a1)
    {
        a = a1;
    }

    private static void a(Display display, Point point)
    {
        Preconditions.checkNotNull(point);
        if (android.os.Build.VERSION.SDK_INT >= 13)
        {
            display.getSize(point);
            return;
        } else
        {
            point.x = display.getWidth();
            point.y = display.getHeight();
            return;
        }
    }

    public boolean a(Display display)
    {
        Point point = new Point();
        a(display, point);
        int i = point.x;
        if (point.y * i < 0x96000)
        {
            a.a();
            if (a.b() < 0x20000000L)
            {
                return false;
            }
        }
        return true;
    }
}
