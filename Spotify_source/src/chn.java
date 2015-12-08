// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.Handler;
import android.webkit.WebView;

public final class chn extends AsyncTask
{

    private final WebView a;
    private Bitmap b;
    private chm c;

    public chn(chm chm1, WebView webview)
    {
        c = chm1;
        super();
        a = webview;
    }

    private transient Boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        int j1;
        i1 = b.getWidth();
        j1 = b.getHeight();
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
        if (b.getPixel(i, k) != 0)
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
        chm.c(c);
        if (((Boolean) (obj)).booleanValue() || c.b() || chm.d(c) <= 0L)
        {
            c.c = ((Boolean) (obj)).booleanValue();
            chm.e(c).a(c.b, true);
        } else
        if (chm.d(c) > 0L)
        {
            if (bka.a(2))
            {
                bka.a("Ad not detected, scheduling another run.");
            }
            chm.f(c).postDelayed(c, 200L);
            return;
        }
    }

    protected final void onPreExecute()
    {
        this;
        JVM INSTR monitorenter ;
        b = Bitmap.createBitmap(chm.a(c), chm.b(c), android.graphics.Bitmap.Config.ARGB_8888);
        a.setVisibility(0);
        a.measure(android.view.View.MeasureSpec.makeMeasureSpec(chm.a(c), 0), android.view.View.MeasureSpec.makeMeasureSpec(chm.b(c), 0));
        a.layout(0, 0, chm.a(c), chm.b(c));
        Canvas canvas = new Canvas(b);
        a.draw(canvas);
        a.invalidate();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
