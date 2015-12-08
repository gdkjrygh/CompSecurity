// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import android.widget.VideoView;

public class do extends VideoView
{

    private int a;
    private int b;
    private int c;

    do(Context context, int i, int j, int k)
    {
        super(context);
        a = 0;
        a = i;
        b = j;
        c = k;
    }

    public int getId()
    {
        return 48879;
    }

    protected void onMeasure(int i, int j)
    {
        Display display = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
        float f = display.getWidth();
        float f2 = display.getHeight() - a;
        float f3 = b;
        float f1 = c;
        float f4 = f - f3;
        float f5 = f2 - f1;
        if (f4 >= 0.0F && f5 >= 0.0F)
        {
            if (f4 < f5)
            {
                f2 = f / f3;
                setMeasuredDimension(Math.round(f), Math.round(f2 * f1));
                return;
            } else
            {
                setMeasuredDimension(Math.round((f2 / f1) * f3), Math.round(f2));
                return;
            }
        }
        if (f4 < f5)
        {
            f2 = f / f3;
            setMeasuredDimension(Math.round(f), Math.round(f2 * f1));
            return;
        } else
        {
            setMeasuredDimension(Math.round((f2 / f1) * f3), Math.round(f2));
            return;
        }
    }
}
