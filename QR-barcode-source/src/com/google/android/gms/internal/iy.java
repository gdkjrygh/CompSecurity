// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.Path;
import android.net.Uri;
import android.widget.ImageView;

public final class iy extends ImageView
{
    public static interface a
    {

        public abstract Path g(int i, int j);
    }


    private Uri Lj;
    private int Lk;
    private int Ll;
    private a Lm;
    private int Ln;
    private float Lo;

    public void ay(int i)
    {
        Lk = i;
    }

    public void g(Uri uri)
    {
        Lj = uri;
    }

    public int gM()
    {
        return Lk;
    }

    protected void onDraw(Canvas canvas)
    {
        if (Lm != null)
        {
            canvas.clipPath(Lm.g(getWidth(), getHeight()));
        }
        super.onDraw(canvas);
        if (Ll != 0)
        {
            canvas.drawColor(Ll);
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        Ln;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 33
    //                   2 54;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        i = getMeasuredHeight();
        j = (int)((float)i * Lo);
_L5:
        setMeasuredDimension(j, i);
        return;
_L3:
        j = getMeasuredWidth();
        i = (int)((float)j / Lo);
        if (true) goto _L5; else goto _L4
_L4:
    }
}
