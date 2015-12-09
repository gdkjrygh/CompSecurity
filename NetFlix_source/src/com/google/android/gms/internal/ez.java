// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.net.Uri;
import android.widget.ImageView;

public final class ez extends ImageView
{

    private Uri CO;
    private int CP;
    private int CQ;

    public void L(int i)
    {
        CP = i;
    }

    public void e(Uri uri)
    {
        CO = uri;
    }

    public int eB()
    {
        return CP;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (CQ != 0)
        {
            canvas.drawColor(CQ);
        }
    }
}
