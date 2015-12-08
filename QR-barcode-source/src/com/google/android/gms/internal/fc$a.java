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
//            fc, gs

protected final class tj extends AsyncTask
{

    private final WebView tj;
    private Bitmap tk;
    final fc tl;

    protected transient Boolean a(Void avoid[])
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        int j1;
        i1 = tk.getWidth();
        j1 = tk.getHeight();
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
        if (tk.getPixel(i, k) != 0)
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

    protected void a(Boolean boolean1)
    {
        fc.c(tl);
        if (boolean1.booleanValue() || tl.cA() || fc.d(tl) <= 0L)
        {
            tl.ti = boolean1.booleanValue();
            fc.e(tl).a(tl.md);
        } else
        if (fc.d(tl) > 0L)
        {
            if (gs.u(2))
            {
                gs.S("Ad not detected, scheduling another run.");
            }
            fc.g(tl).postDelayed(tl, fc.f(tl));
            return;
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }

    protected void onPreExecute()
    {
        this;
        JVM INSTR monitorenter ;
        tk = Bitmap.createBitmap(fc.a(tl), fc.b(tl), android.graphics.p.Config.ARGB_8888);
        tj.setVisibility(0);
        tj.measure(android.view.MeasureSpec.makeMeasureSpec(fc.a(tl), 0), android.view.MeasureSpec.makeMeasureSpec(fc.b(tl), 0));
        tj.layout(0, 0, fc.a(tl), fc.b(tl));
        Canvas canvas = new Canvas(tk);
        tj.draw(canvas);
        tj.invalidate();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public (fc fc1, WebView webview)
    {
        tl = fc1;
        super();
        tj = webview;
    }
}
