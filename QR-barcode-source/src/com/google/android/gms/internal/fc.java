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
//            gv, fk, gj, ha, 
//            gs

public class fc
    implements Runnable
{
    protected final class a extends AsyncTask
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
            tk = Bitmap.createBitmap(fc.a(tl), fc.b(tl), android.graphics.Bitmap.Config.ARGB_8888);
            tj.setVisibility(0);
            tj.measure(android.view.View.MeasureSpec.makeMeasureSpec(fc.a(tl), 0), android.view.View.MeasureSpec.makeMeasureSpec(fc.b(tl), 0));
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

        public a(WebView webview)
        {
            tl = fc.this;
            super();
            tj = webview;
        }
    }


    private final int lf;
    private final int lg;
    protected final gv md;
    private final Handler td;
    private final long te;
    private long tf;
    private gw.a tg;
    protected boolean th;
    protected boolean ti;

    public fc(gw.a a1, gv gv1, int i, int j)
    {
        this(a1, gv1, i, j, 200L, 50L);
    }

    public fc(gw.a a1, gv gv1, int i, int j, long l, long l1)
    {
        te = l;
        tf = l1;
        td = new Handler(Looper.getMainLooper());
        md = gv1;
        tg = a1;
        th = false;
        ti = false;
        lg = j;
        lf = i;
    }

    static int a(fc fc1)
    {
        return fc1.lf;
    }

    static int b(fc fc1)
    {
        return fc1.lg;
    }

    static long c(fc fc1)
    {
        long l = fc1.tf - 1L;
        fc1.tf = l;
        return l;
    }

    static long d(fc fc1)
    {
        return fc1.tf;
    }

    static gw.a e(fc fc1)
    {
        return fc1.tg;
    }

    static long f(fc fc1)
    {
        return fc1.te;
    }

    static Handler g(fc fc1)
    {
        return fc1.td;
    }

    public void a(fk fk1, ha ha1)
    {
        md.setWebViewClient(ha1);
        gv gv1 = md;
        if (TextUtils.isEmpty(fk1.rP))
        {
            ha1 = null;
        } else
        {
            ha1 = gj.L(fk1.rP);
        }
        gv1.loadDataWithBaseURL(ha1, fk1.tG, "text/html", "UTF-8", null);
    }

    public void b(fk fk1)
    {
        a(fk1, new ha(this, md, fk1.tP));
    }

    public boolean cA()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = th;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean cB()
    {
        return ti;
    }

    public void cy()
    {
        td.postDelayed(this, te);
    }

    public void cz()
    {
        this;
        JVM INSTR monitorenter ;
        th = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void run()
    {
        if (md == null || cA())
        {
            tg.a(md);
            return;
        } else
        {
            (new a(md)).execute(new Void[0]);
            return;
        }
    }
}
