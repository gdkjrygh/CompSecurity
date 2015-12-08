// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Rect;
import android.view.View;

class ViewCompatJellybeanMr2
{

    ViewCompatJellybeanMr2()
    {
    }

    public static Rect getClipBounds(View view)
    {
        return view.getClipBounds();
    }

    public static void setClipBounds(View view, Rect rect)
    {
        view.setClipBounds(rect);
    }
}
