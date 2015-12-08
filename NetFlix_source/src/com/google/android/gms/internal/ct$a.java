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
//            ct, dw

protected final class oZ extends AsyncTask
{

    private final WebView oZ;
    private Bitmap pa;
    final ct pb;

    protected transient Boolean a(Void avoid[])
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        int j1;
        i1 = pa.getWidth();
        j1 = pa.getHeight();
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
        if (pa.getPixel(i, k) != 0)
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
        ct.c(pb);
        if (boolean1.booleanValue() || pb.bc() || ct.d(pb) <= 0L)
        {
            pb.oY = boolean1.booleanValue();
            ct.e(pb).a(pb.lC);
        } else
        if (ct.d(pb) > 0L)
        {
            if (dw.n(2))
            {
                dw.v("Ad not detected, scheduling another run.");
            }
            ct.g(pb).postDelayed(pb, ct.f(pb));
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
        pa = Bitmap.createBitmap(ct.a(pb), ct.b(pb), android.graphics.p.Config.ARGB_8888);
        oZ.setVisibility(0);
        oZ.measure(android.view.MeasureSpec.makeMeasureSpec(ct.a(pb), 0), android.view.MeasureSpec.makeMeasureSpec(ct.b(pb), 0));
        oZ.layout(0, 0, ct.a(pb), ct.b(pb));
        Canvas canvas = new Canvas(pa);
        oZ.draw(canvas);
        oZ.invalidate();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public (ct ct1, WebView webview)
    {
        pb = ct1;
        super();
        oZ = webview;
    }
}
