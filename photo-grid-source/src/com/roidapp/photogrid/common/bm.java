// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.graphics.Point;
import android.view.Display;

public final class bm
{

    private static bm a = null;

    private bm()
    {
    }

    public static int a(Display display)
    {
        int i;
        try
        {
            if (android.os.Build.VERSION.SDK_INT >= 13)
            {
                Point point = new Point();
                display.getSize(point);
                return point.x;
            }
            i = display.getWidth();
        }
        // Misplaced declaration of an exception variable
        catch (Display display)
        {
            return 0;
        }
        return i;
    }

    public static bm a()
    {
        if (a == null)
        {
            a = new bm();
        }
        return a;
    }

    public static int b(Display display)
    {
        int i;
        try
        {
            if (android.os.Build.VERSION.SDK_INT >= 13)
            {
                Point point = new Point();
                display.getSize(point);
                return point.y;
            }
            i = display.getHeight();
        }
        // Misplaced declaration of an exception variable
        catch (Display display)
        {
            return 0;
        }
        return i;
    }

}
