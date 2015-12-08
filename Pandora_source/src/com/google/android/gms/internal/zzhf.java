// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.Path;
import android.net.Uri;
import android.widget.ImageView;

public final class zzhf extends ImageView
{
    public static interface zza
    {

        public abstract Path zzi(int i, int j);
    }


    private Uri zzSJ;
    private int zzSK;
    private int zzSL;
    private zza zzSM;
    private int zzSN;
    private float zzSO;

    protected void onDraw(Canvas canvas)
    {
        if (zzSM != null)
        {
            canvas.clipPath(zzSM.zzi(getWidth(), getHeight()));
        }
        super.onDraw(canvas);
        if (zzSL != 0)
        {
            canvas.drawColor(zzSL);
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        zzSN;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 33
    //                   2 54;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        i = getMeasuredHeight();
        j = (int)((float)i * zzSO);
_L5:
        setMeasuredDimension(j, i);
        return;
_L3:
        j = getMeasuredWidth();
        i = (int)((float)j / zzSO);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void zzaK(int i)
    {
        zzSK = i;
    }

    public void zzi(Uri uri)
    {
        zzSJ = uri;
    }

    public int zzlC()
    {
        return zzSK;
    }
}
