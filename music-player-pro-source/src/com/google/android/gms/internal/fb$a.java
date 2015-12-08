// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.Handler;
import android.webkit.WebView;

// Referenced classes of package com.google.android.gms.internal:
//            fb, gr

protected final class tx extends AsyncTask
{

    private final WebView tx;
    private Bitmap ty;
    final fb tz;

    protected void a(Boolean boolean1)
    {
        fb.c(tz);
        if (boolean1.booleanValue() || tz.cH() || fb.d(tz) <= 0L)
        {
            tz.tw = boolean1.booleanValue();
            fb.e(tz).a(tz.mo);
        } else
        if (fb.d(tz) > 0L)
        {
            if (gr.v(2))
            {
                gr.S("Ad not detected, scheduling another run.");
            }
            fb.g(tz).postDelayed(tz, fb.f(tz));
            return;
        }
    }

    protected transient Boolean b(Void avoid[])
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        int j1;
        i1 = ty.getWidth();
        j1 = ty.getHeight();
        if (i1 != 0 && j1 != 0) goto _L2; else goto _L1
_L1:
        avoid = Boolean.valueOf(false);
_L3:
        this;
        JVM INSTR monitorexit ;
        return avoid;
_L2:
        int i;
        int j;
        i = 0;
        j = 0;
_L4:
        int k;
        if (i < i1)
        {
            k = 0;
            break MISSING_BLOCK_LABEL_52;
        }
        boolean flag;
        if ((double)j / ((double)(i1 * j1) / 100D) > 0.10000000000000001D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        avoid = Boolean.valueOf(flag);
          goto _L3
        avoid;
        throw avoid;
        if (ty.getPixel(i, k) != 0)
        {
            l = j + 1;
        }
        k += 10;
        j = l;
        int l;
        if (k < j1)
        {
            l = j;
            break MISSING_BLOCK_LABEL_62;
        }
        i += 10;
          goto _L4
    }

    protected Object doInBackground(Object aobj[])
    {
        return b((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }

    protected void onPreExecute()
    {
        this;
        JVM INSTR monitorenter ;
        ty = Bitmap.createBitmap(fb.a(tz), fb.b(tz), android.graphics.p.Config.ARGB_8888);
        tx.setVisibility(0);
        tx.measure(android.view.MeasureSpec.makeMeasureSpec(fb.a(tz), 0), android.view.MeasureSpec.makeMeasureSpec(fb.b(tz), 0));
        tx.layout(0, 0, fb.a(tz), fb.b(tz));
        Canvas canvas = new Canvas(ty);
        tx.draw(canvas);
        tx.invalidate();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public (fb fb1, WebView webview)
    {
        tz = fb1;
        super();
        tx = webview;
    }
}
