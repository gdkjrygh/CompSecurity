// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class chl
    implements chr, cky
{

    protected final Context a;
    protected final ckw b;
    protected AdResponseParcel c;
    AtomicBoolean d;
    private chq e;
    private ciu f;
    private Runnable g;

    protected chl(Context context, ciu ciu1, ckw ckw1, chq chq1)
    {
        new Object();
        d = new AtomicBoolean(true);
        a = context;
        f = ciu1;
        c = f.b;
        b = ckw1;
        e = chq1;
    }

    protected abstract void a();

    protected void a(int i)
    {
        if (i != -2)
        {
            c = new AdResponseParcel(i, c.k);
        }
        chq chq1 = e;
        Object obj = f.a;
        com.google.android.gms.ads.internal.client.AdRequestParcel adrequestparcel = ((AdRequestInfoParcel) (obj)).c;
        ckw ckw1 = b;
        java.util.List list = c.d;
        java.util.List list1 = c.f;
        java.util.List list2 = c.j;
        int j = c.l;
        long l = c.k;
        obj = ((AdRequestInfoParcel) (obj)).i;
        boolean flag = c.h;
        long l1 = c.i;
        com.google.android.gms.ads.internal.client.AdSizeParcel adsizeparcel = f.d;
        l1 = c.g;
        chq1.b(new cit(adrequestparcel, ckw1, list, i, list1, list2, j, l, ((String) (obj)), flag, null, null, null, null, null, adsizeparcel, f.f, c.n, c.o, f.h, null));
    }

    public final void a(ckw ckw1, boolean flag)
    {
        bka.a("WebView finished loading.");
        if (!d.getAndSet(false))
        {
            return;
        }
        int i;
        if (flag)
        {
            i = b();
        } else
        {
            i = -1;
        }
        a(i);
        cjj.a.removeCallbacks(g);
    }

    protected int b()
    {
        return -2;
    }

    public void c()
    {
        if (!d.getAndSet(false))
        {
            return;
        } else
        {
            b.stopLoading();
            bkv.g();
            cjl.a(b.a());
            a(-1);
            cjj.a.removeCallbacks(g);
            return;
        }
    }

    public final Object f_()
    {
        btl.b("Webview render task needs to be called on UI thread.");
        g = new Runnable() {

            private chl a;

            public final void run()
            {
                if (!a.d.get())
                {
                    return;
                } else
                {
                    bka.b("Timed out waiting for WebView to finish loading.");
                    a.c();
                    return;
                }
            }

            
            {
                a = chl.this;
                super();
            }
        };
        Handler handler = cjj.a;
        Runnable runnable = g;
        cax cax = cbb.T;
        handler.postDelayed(runnable, ((Long)bkv.n().a(cax)).longValue());
        a();
        return null;
    }
}
