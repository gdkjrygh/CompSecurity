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
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.b;

// Referenced classes of package com.google.android.gms.internal:
//            hp, hi, gm

public final class ey
    implements Runnable
{
    protected final class a extends AsyncTask
    {

        final ey a;
        private final WebView b;
        private Bitmap c;

        private transient Boolean a()
        {
            this;
            JVM INSTR monitorenter ;
            int j1;
            int k1;
            j1 = c.getWidth();
            k1 = c.getHeight();
            if (j1 != 0 && k1 != 0) goto _L2; else goto _L1
_L1:
            Boolean boolean1 = Boolean.valueOf(false);
_L3:
            this;
            JVM INSTR monitorexit ;
            return boolean1;
_L2:
            int j;
            int k;
            j = 0;
            k = 0;
_L4:
            int l;
            if (j < j1)
            {
                l = 0;
                break MISSING_BLOCK_LABEL_52;
            }
            boolean flag;
            if ((double)k / ((double)(j1 * k1) / 100D) > 0.10000000000000001D)
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
            if (c.getPixel(j, l) != 0)
            {
                i1 = k + 1;
            }
            l += 10;
            k = i1;
            int i1;
            if (l < k1)
            {
                i1 = k;
                break MISSING_BLOCK_LABEL_62;
            }
            j += 10;
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
            c = Bitmap.createBitmap(ey.a(a), com.google.android.gms.internal.ey.b(a), android.graphics.Bitmap.Config.ARGB_8888);
            b.setVisibility(0);
            b.measure(android.view.View.MeasureSpec.makeMeasureSpec(ey.a(a), 0), android.view.View.MeasureSpec.makeMeasureSpec(com.google.android.gms.internal.ey.b(a), 0));
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

        public a(WebView webview)
        {
            a = ey.this;
            super();
            b = webview;
        }
    }


    protected final hi a;
    protected boolean b;
    protected boolean c;
    private final Handler d;
    private final long e;
    private long f;
    private hj.a g;
    private final int h;
    private final int i;

    private ey(hj.a a1, hi hi1, int j, int k)
    {
        e = 200L;
        f = 50L;
        d = new Handler(Looper.getMainLooper());
        a = hi1;
        g = a1;
        b = false;
        c = false;
        h = k;
        i = j;
    }

    public ey(hj.a a1, hi hi1, int j, int k, byte byte0)
    {
        this(a1, hi1, j, k);
    }

    static int a(ey ey1)
    {
        return ey1.i;
    }

    static int b(ey ey1)
    {
        return ey1.h;
    }

    static long c(ey ey1)
    {
        long l = ey1.f - 1L;
        ey1.f = l;
        return l;
    }

    static long d(ey ey1)
    {
        return ey1.f;
    }

    static hj.a e(ey ey1)
    {
        return ey1.g;
    }

    static long f(ey ey1)
    {
        return ey1.e;
    }

    static Handler g(ey ey1)
    {
        return ey1.d;
    }

    public final void a()
    {
        d.postDelayed(this, e);
    }

    public final void a(AdResponseParcel adresponseparcel)
    {
        Object obj = new hp(this, a, adresponseparcel.q);
        a.setWebViewClient(((android.webkit.WebViewClient) (obj)));
        hi hi1 = a;
        if (TextUtils.isEmpty(adresponseparcel.b))
        {
            obj = null;
        } else
        {
            p.e();
            obj = gm.a(adresponseparcel.b);
        }
        hi1.loadDataWithBaseURL(((String) (obj)), adresponseparcel.c, "text/html", "UTF-8", null);
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        b = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean d()
    {
        return c;
    }

    public final void run()
    {
        if (a == null || c())
        {
            g.a(a, true);
            return;
        } else
        {
            (new a(a.a())).execute(new Void[0]);
            return;
        }
    }
}
