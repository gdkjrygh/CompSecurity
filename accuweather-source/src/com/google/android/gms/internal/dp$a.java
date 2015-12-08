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
//            dp, ev

protected final class pO extends AsyncTask
{

    private final WebView pO;
    private Bitmap pP;
    final dp pQ;

    protected transient Boolean a(Void avoid[])
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        int j1;
        i1 = pP.getWidth();
        j1 = pP.getHeight();
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
        if (pP.getPixel(i, k) != 0)
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
        dp.c(pQ);
        if (boolean1.booleanValue() || pQ.bl() || dp.d(pQ) <= 0L)
        {
            pQ.pN = boolean1.booleanValue();
            dp.e(pQ).a(pQ.lL);
        } else
        if (dp.d(pQ) > 0L)
        {
            if (ev.p(2))
            {
                ev.z("Ad not detected, scheduling another run.");
            }
            dp.g(pQ).postDelayed(pQ, dp.f(pQ));
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
        pP = Bitmap.createBitmap(dp.a(pQ), dp.b(pQ), android.graphics.p.Config.ARGB_8888);
        pO.setVisibility(0);
        pO.measure(android.view.MeasureSpec.makeMeasureSpec(dp.a(pQ), 0), android.view.MeasureSpec.makeMeasureSpec(dp.b(pQ), 0));
        pO.layout(0, 0, dp.a(pQ), dp.b(pQ));
        Canvas canvas = new Canvas(pP);
        pO.draw(canvas);
        pO.invalidate();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public (dp dp1, WebView webview)
    {
        pQ = dp1;
        super();
        pO = webview;
    }
}
