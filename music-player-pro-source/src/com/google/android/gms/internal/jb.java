// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.Path;
import android.net.Uri;
import android.widget.ImageView;

public final class jb extends ImageView
{
    public static interface a
    {

        public abstract Path g(int i, int j);
    }


    private Uri Mn;
    private int Mo;
    private int Mp;
    private a Mq;
    private int Mr;
    private float Ms;

    public void aB(int i)
    {
        Mo = i;
    }

    public void g(Uri uri)
    {
        Mn = uri;
    }

    public int hj()
    {
        return Mo;
    }

    protected void onDraw(Canvas canvas)
    {
        if (Mq != null)
        {
            canvas.clipPath(Mq.g(getWidth(), getHeight()));
        }
        super.onDraw(canvas);
        if (Mp != 0)
        {
            canvas.drawColor(Mp);
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        Mr;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 33
    //                   2 54;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        i = getMeasuredHeight();
        j = (int)((float)i * Ms);
_L5:
        setMeasuredDimension(j, i);
        return;
_L3:
        j = getMeasuredWidth();
        i = (int)((float)j / Ms);
        if (true) goto _L5; else goto _L4
_L4:
    }
}
