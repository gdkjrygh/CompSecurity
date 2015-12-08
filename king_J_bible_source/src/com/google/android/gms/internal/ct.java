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
//            dz, cz, dq, ee, 
//            dw

public class ct
    implements Runnable
{
    protected final class a extends AsyncTask
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
            pa = Bitmap.createBitmap(ct.a(pb), ct.b(pb), android.graphics.Bitmap.Config.ARGB_8888);
            oZ.setVisibility(0);
            oZ.measure(android.view.View.MeasureSpec.makeMeasureSpec(ct.a(pb), 0), android.view.View.MeasureSpec.makeMeasureSpec(ct.b(pb), 0));
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

        public a(WebView webview)
        {
            pb = ct.this;
            super();
            oZ = webview;
        }
    }


    private final int kr;
    private final int ks;
    protected final dz lC;
    private final Handler oT;
    private final long oU;
    private long oV;
    private ea.a oW;
    protected boolean oX;
    protected boolean oY;

    public ct(ea.a a1, dz dz1, int i, int j)
    {
        this(a1, dz1, i, j, 200L, 50L);
    }

    public ct(ea.a a1, dz dz1, int i, int j, long l, long l1)
    {
        oU = l;
        oV = l1;
        oT = new Handler(Looper.getMainLooper());
        lC = dz1;
        oW = a1;
        oX = false;
        oY = false;
        ks = j;
        kr = i;
    }

    static int a(ct ct1)
    {
        return ct1.kr;
    }

    static int b(ct ct1)
    {
        return ct1.ks;
    }

    static long c(ct ct1)
    {
        long l = ct1.oV - 1L;
        ct1.oV = l;
        return l;
    }

    static long d(ct ct1)
    {
        return ct1.oV;
    }

    static ea.a e(ct ct1)
    {
        return ct1.oW;
    }

    static long f(ct ct1)
    {
        return ct1.oU;
    }

    static Handler g(ct ct1)
    {
        return ct1.oT;
    }

    public void a(cz cz1, ee ee1)
    {
        lC.setWebViewClient(ee1);
        dz dz1 = lC;
        if (TextUtils.isEmpty(cz1.ol))
        {
            ee1 = null;
        } else
        {
            ee1 = dq.r(cz1.ol);
        }
        dz1.loadDataWithBaseURL(ee1, cz1.pm, "text/html", "UTF-8", null);
    }

    public void b(cz cz1)
    {
        a(cz1, new ee(this, lC, cz1.pv));
    }

    public void ba()
    {
        oT.postDelayed(this, oU);
    }

    public void bb()
    {
        this;
        JVM INSTR monitorenter ;
        oX = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean bc()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = oX;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean bd()
    {
        return oY;
    }

    public void run()
    {
        if (lC == null || bc())
        {
            oW.a(lC);
            return;
        } else
        {
            (new a(lC)).execute(new Void[0]);
            return;
        }
    }
}
