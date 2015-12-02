// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.t.a;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;

public class b
{

    public b()
    {
    }

    public static Rect a(View view, PointF pointf)
    {
        Rect rect = new Rect();
        view.getHitRect(rect);
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        int i;
        int j;
        if (pointf != null)
        {
            i = (int)pointf.x;
        } else
        {
            i = 0;
        }
        if (pointf != null)
        {
            j = (int)pointf.y;
        } else
        {
            j = 0;
        }
        rect.offsetTo(ai[0] + i, j + ai[1]);
        return rect;
    }
}
