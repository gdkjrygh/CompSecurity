// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.Handler;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.b;

// Referenced classes of package com.google.android.gms.internal:
//            ey

protected final class b extends AsyncTask
{

    final ey a;
    private final WebView b;
    private Bitmap c;

    private transient Boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        int j1;
        i1 = c.getWidth();
        j1 = c.getHeight();
        if (i1 != 0 && j1 != 0) goto _L2; else goto _L1
_L1:
        Boolean boolean1 = Boolean.valueOf(false);
_L3:
        this;
        JVM INSTR monitorexit ;
        return boolean1;
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
        boolean1 = Boolean.valueOf(flag);
          goto _L3
        exception;
        throw exception;
        Exception exception;
        if (c.getPixel(i, k) != 0)
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

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (Boolean)obj;
        ey.c(a);
        if (((Boolean) (obj)).booleanValue() || a.c() || ey.d(a) <= 0L)
        {
            a.c = ((Boolean) (obj)).booleanValue();
            ey.e(a).a(a.a, true);
        } else
        if (ey.d(a) > 0L)
        {
            if (com.google.android.gms.ads.internal.util.client.b.a(2))
            {
                com.google.android.gms.ads.internal.util.client.b.a(3);
            }
            ey.g(a).postDelayed(a, ey.f(a));
            return;
        }
    }

    protected final void onPreExecute()
    {
        this;
        JVM INSTR monitorenter ;
        c = Bitmap.createBitmap(ey.a(a), com.google.android.gms.internal.ey.b(a), android.graphics.p.Config.ARGB_8888);
        b.setVisibility(0);
        b.measure(android.view.MeasureSpec.makeMeasureSpec(ey.a(a), 0), android.view.MeasureSpec.makeMeasureSpec(com.google.android.gms.internal.ey.b(a), 0));
        b.layout(0, 0, ey.a(a), com.google.android.gms.internal.ey.b(a));
        Canvas canvas = new Canvas(c);
        b.draw(canvas);
        b.invalidate();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public til.client.b(ey ey1, WebView webview)
    {
        a = ey1;
        super();
        b = webview;
    }
}
