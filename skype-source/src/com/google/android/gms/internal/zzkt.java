// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.ImageView;

public final class zzkt extends ImageView
{
    public static interface a
    {

        public abstract Path a();
    }


    private int a;
    private a b;
    private int c;
    private float d;

    protected final void onDraw(Canvas canvas)
    {
        if (b != null)
        {
            a a1 = b;
            getWidth();
            getHeight();
            canvas.clipPath(a1.a());
        }
        super.onDraw(canvas);
        if (a != 0)
        {
            canvas.drawColor(a);
        }
    }

    protected final void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        c;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 33
    //                   2 54;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        i = getMeasuredHeight();
        j = (int)((float)i * d);
_L5:
        setMeasuredDimension(j, i);
        return;
_L3:
        j = getMeasuredWidth();
        i = (int)((float)j / d);
        if (true) goto _L5; else goto _L4
_L4:
    }
}
