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
//            ey, dv, ep, fd, 
//            ev

public class dp
    implements Runnable
{
    protected final class a extends AsyncTask
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
            pP = Bitmap.createBitmap(dp.a(pQ), dp.b(pQ), android.graphics.Bitmap.Config.ARGB_8888);
            pO.setVisibility(0);
            pO.measure(android.view.View.MeasureSpec.makeMeasureSpec(dp.a(pQ), 0), android.view.View.MeasureSpec.makeMeasureSpec(dp.b(pQ), 0));
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

        public a(WebView webview)
        {
            pQ = dp.this;
            super();
            pO = webview;
        }
    }


    private final int ks;
    private final int kt;
    protected final ey lL;
    private final Handler pI;
    private final long pJ;
    private long pK;
    private ez.a pL;
    protected boolean pM;
    protected boolean pN;

    public dp(ez.a a1, ey ey1, int i, int j)
    {
        this(a1, ey1, i, j, 200L, 50L);
    }

    public dp(ez.a a1, ey ey1, int i, int j, long l, long l1)
    {
        pJ = l;
        pK = l1;
        pI = new Handler(Looper.getMainLooper());
        lL = ey1;
        pL = a1;
        pM = false;
        pN = false;
        kt = j;
        ks = i;
    }

    static int a(dp dp1)
    {
        return dp1.ks;
    }

    static int b(dp dp1)
    {
        return dp1.kt;
    }

    static long c(dp dp1)
    {
        long l = dp1.pK - 1L;
        dp1.pK = l;
        return l;
    }

    static long d(dp dp1)
    {
        return dp1.pK;
    }

    static ez.a e(dp dp1)
    {
        return dp1.pL;
    }

    static long f(dp dp1)
    {
        return dp1.pJ;
    }

    static Handler g(dp dp1)
    {
        return dp1.pI;
    }

    public void a(dv dv1, fd fd1)
    {
        lL.setWebViewClient(fd1);
        ey ey1 = lL;
        if (TextUtils.isEmpty(dv1.oy))
        {
            fd1 = null;
        } else
        {
            fd1 = ep.v(dv1.oy);
        }
        ey1.loadDataWithBaseURL(fd1, dv1.qb, "text/html", "UTF-8", null);
    }

    public void b(dv dv1)
    {
        a(dv1, new fd(this, lL, dv1.qk));
    }

    public void bj()
    {
        pI.postDelayed(this, pJ);
    }

    public void bk()
    {
        this;
        JVM INSTR monitorenter ;
        pM = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean bl()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = pM;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean bm()
    {
        return pN;
    }

    public void run()
    {
        if (lL == null || bl())
        {
            pL.a(lL);
            return;
        } else
        {
            (new a(lL)).execute(new Void[0]);
            return;
        }
    }
}
