// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.graphics.Canvas;
import android.support.v4.view.ViewCompat;
import android.view.View;
import java.lang.reflect.Method;

public final class bl
{

    private static bl a = null;

    private bl()
    {
    }

    public static bl a()
    {
        if (a == null)
        {
            a = new bl();
        }
        return a;
    }

    public static void a(View view)
    {
        ViewCompat.setLayerType(view, 1, null);
    }

    public static void a(View view, float f)
    {
        view.setAlpha(f);
    }

    public static boolean a(Canvas canvas)
    {
        Method method = android/graphics/Canvas.getMethod("isHardwareAccelerated", new Class[0]);
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        boolean flag = ((Boolean)method.invoke(canvas, null)).booleanValue();
        return flag;
        canvas;
        canvas.printStackTrace();
        return false;
    }

    public static void b(View view)
    {
        ViewCompat.setLayerType(view, 2, null);
    }

}
