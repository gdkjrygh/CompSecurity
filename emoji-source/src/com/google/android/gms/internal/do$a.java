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
//            do, eu

protected final class pQ extends AsyncTask
{

    private final WebView pQ;
    private Bitmap pR;
    final do pS;

    protected transient Boolean a(Void avoid[])
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        int j1;
        i1 = pR.getWidth();
        j1 = pR.getHeight();
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
        if (pR.getPixel(i, k) != 0)
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
        com.google.android.gms.internal.do.c(pS);
        if (boolean1.booleanValue() || pS.bq() || com.google.android.gms.internal.do.d(pS) <= 0L)
        {
            pS.pP = boolean1.booleanValue();
            com.google.android.gms.internal.do.e(pS).a(pS.lN);
        } else
        if (com.google.android.gms.internal.do.d(pS) > 0L)
        {
            if (eu.p(2))
            {
                eu.z("Ad not detected, scheduling another run.");
            }
            com.google.android.gms.internal.do.g(pS).postDelayed(pS, com.google.android.gms.internal.do.f(pS));
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
        pR = Bitmap.createBitmap(com.google.android.gms.internal.do.a(pS), com.google.android.gms.internal.do.b(pS), android.graphics.p.Config.ARGB_8888);
        pQ.setVisibility(0);
        pQ.measure(android.view.MeasureSpec.makeMeasureSpec(com.google.android.gms.internal.do.a(pS), 0), android.view.MeasureSpec.makeMeasureSpec(com.google.android.gms.internal.do.b(pS), 0));
        pQ.layout(0, 0, com.google.android.gms.internal.do.a(pS), com.google.android.gms.internal.do.b(pS));
        Canvas canvas = new Canvas(pR);
        pQ.draw(canvas);
        pQ.invalidate();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public (do do1, WebView webview)
    {
        pS = do1;
        super();
        pQ = webview;
    }
}
