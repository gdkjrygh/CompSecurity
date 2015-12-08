// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;

final class ViewCompatJellybeanMr1
{

    public static int getLayoutDirection(View view)
    {
        return view.getLayoutDirection();
    }

    public static int getWindowSystemUiVisibility(View view)
    {
        return view.getWindowSystemUiVisibility();
    }

    public static void setLayerPaint(View view, Paint paint)
    {
        view.setLayerPaint(paint);
    }
}
