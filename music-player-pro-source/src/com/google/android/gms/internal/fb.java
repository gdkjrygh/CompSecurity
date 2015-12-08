// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;

// Referenced classes of package com.google.android.gms.internal:
//            gu, fj, gi, gz, 
//            gr

public class fb
    implements Runnable
{
    protected final class a extends AsyncTask
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
            ty = Bitmap.createBitmap(fb.a(tz), fb.b(tz), android.graphics.Bitmap.Config.ARGB_8888);
            tx.setVisibility(0);
            tx.measure(android.view.View.MeasureSpec.makeMeasureSpec(fb.a(tz), 0), android.view.View.MeasureSpec.makeMeasureSpec(fb.b(tz), 0));
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

        public a(WebView webview)
        {
            tz = fb.this;
            super();
            tx = webview;
        }
    }


    private final int li;
    private final int lj;
    protected final gu mo;
    private final Handler tr;
    private final long ts;
    private long tt;
    private gv.a tu;
    protected boolean tv;
    protected boolean tw;

    public fb(gv.a a1, gu gu1, int i, int j)
    {
        this(a1, gu1, i, j, 200L, 50L);
    }

    public fb(gv.a a1, gu gu1, int i, int j, long l, long l1)
    {
        ts = l;
        tt = l1;
        tr = new Handler(Looper.getMainLooper());
        mo = gu1;
        tu = a1;
        tv = false;
        tw = false;
        lj = j;
        li = i;
    }

    static int a(fb fb1)
    {
        return fb1.li;
    }

    static int b(fb fb1)
    {
        return fb1.lj;
    }

    static long c(fb fb1)
    {
        long l = fb1.tt - 1L;
        fb1.tt = l;
        return l;
    }

    static long d(fb fb1)
    {
        return fb1.tt;
    }

    static gv.a e(fb fb1)
    {
        return fb1.tu;
    }

    static long f(fb fb1)
    {
        return fb1.ts;
    }

    static Handler g(fb fb1)
    {
        return fb1.tr;
    }

    public void a(fj fj1, gz gz1)
    {
        mo.setWebViewClient(gz1);
        gu gu1 = mo;
        if (TextUtils.isEmpty(fj1.sg))
        {
            gz1 = null;
        } else
        {
            gz1 = gi.L(fj1.sg);
        }
        gu1.loadDataWithBaseURL(gz1, fj1.tU, "text/html", "UTF-8", null);
    }

    public void b(fj fj1)
    {
        a(fj1, new gz(this, mo, fj1.ud));
    }

    public void cF()
    {
        tr.postDelayed(this, ts);
    }

    public void cG()
    {
        this;
        JVM INSTR monitorenter ;
        tv = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean cH()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = tv;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean cI()
    {
        return tw;
    }

    public void run()
    {
        if (mo == null || cH())
        {
            tu.a(mo);
            return;
        } else
        {
            (new a(mo)).execute(new Void[0]);
            return;
        }
    }
}
