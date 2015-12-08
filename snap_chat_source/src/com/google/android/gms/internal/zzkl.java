// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.ImageView;

public final class zzkl extends ImageView
{
    public static interface zza
    {

        public abstract Path zzk(int i, int j);
    }


    private int zzPg;
    private zza zzPh;
    private int zzPi;
    private float zzPj;

    protected final void onDraw(Canvas canvas)
    {
        if (zzPh != null)
        {
            canvas.clipPath(zzPh.zzk(getWidth(), getHeight()));
        }
        super.onDraw(canvas);
        if (zzPg != 0)
        {
            canvas.drawColor(zzPg);
        }
    }

    protected final void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        zzPi;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 33
    //                   2 54;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        i = getMeasuredHeight();
        j = (int)((float)i * zzPj);
_L5:
        setMeasuredDimension(j, i);
        return;
_L3:
        j = getMeasuredWidth();
        i = (int)((float)j / zzPj);
        if (true) goto _L5; else goto _L4
_L4:
    }
}
