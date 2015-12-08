// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import android.graphics.Point;
import android.view.Display;

public class a
{

    public static Point a(Display display)
    {
        Point point = new Point();
        if (android.os.Build.VERSION.SDK_INT >= 13)
        {
            display.getSize(point);
        }
        return point;
    }
}
