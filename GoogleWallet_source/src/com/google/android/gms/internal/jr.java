// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.ImageView;

public final class jr extends ImageView
{
    public static interface a
    {

        public abstract Path l(int i, int j);
    }


    private int Vt;
    private a Vu;
    private int Vv;
    private float Vw;

    protected final void onDraw(Canvas canvas)
    {
        if (Vu != null)
        {
            canvas.clipPath(Vu.l(getWidth(), getHeight()));
        }
        super.onDraw(canvas);
        if (Vt != 0)
        {
            canvas.drawColor(Vt);
        }
    }

    protected final void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        Vv;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 33
    //                   2 54;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        i = getMeasuredHeight();
        j = (int)((float)i * Vw);
_L5:
        setMeasuredDimension(j, i);
        return;
_L3:
        j = getMeasuredWidth();
        i = (int)((float)j / Vw);
        if (true) goto _L5; else goto _L4
_L4:
    }
}
