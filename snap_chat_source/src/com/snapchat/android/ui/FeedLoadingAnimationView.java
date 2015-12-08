// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import In;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;

public class FeedLoadingAnimationView extends View
{

    private Bitmap a;
    private Bitmap b;
    private final long c = SystemClock.elapsedRealtime();
    private final Rect d = new Rect();

    public FeedLoadingAnimationView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void onDraw(Canvas canvas)
    {
        this;
        JVM INSTR monitorenter ;
        double d1;
        double d2;
        int l;
        int i1;
        if (a == null)
        {
            a = In.a(getContext(), 0x7f020048, canvas.getWidth(), canvas.getHeight());
        }
        if (b == null)
        {
            b = In.a(getContext(), 0x7f020047, canvas.getWidth(), canvas.getHeight());
        }
        invalidate();
        l = a.getWidth();
        i1 = a.getHeight();
        int i = (int)(SystemClock.elapsedRealtime() - c);
        d1 = Math.sin(((double)i * 6.2831853071795862D) / 1000D);
        d2 = Math.cos(((double)i * 6.2831853071795862D) / 1000D);
        if (d1 <= 0.0D) goto _L2; else goto _L1
_L1:
        Bitmap bitmap = a;
_L7:
        if (d2 <= 0.0D) goto _L4; else goto _L3
_L3:
        d2 = l;
        int k = (int)(Math.abs(d1) * d2);
        int j = i1;
_L5:
        d.set((l - k) / 2, (i1 - j) / 2, (k + l) / 2, (j + i1) / 2);
        canvas.drawBitmap(bitmap, null, d, null);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        bitmap = b;
        continue; /* Loop/switch isn't completed */
_L4:
        d2 = i1;
        d1 = Math.abs(d1);
        j = (int)(d1 * d2);
        k = l;
          goto _L5
        canvas;
        throw canvas;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
