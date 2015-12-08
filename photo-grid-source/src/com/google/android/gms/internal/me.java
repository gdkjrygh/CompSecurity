// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.internal.bl;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.internal:
//            mp, sb, pb, pa, 
//            mo, qa, ry, qd, 
//            mf, cy, cx

public abstract class me
    implements mp, sb
{

    protected final mo a;
    protected final Context b;
    protected final ry c;
    protected final pb d;
    protected AdResponseParcel e;
    protected final Object f = new Object();
    private Runnable g;
    private AtomicBoolean h;

    protected me(Context context, pb pb1, ry ry1, mo mo1)
    {
        h = new AtomicBoolean(true);
        b = context;
        d = pb1;
        e = d.b;
        c = ry1;
        a = mo1;
    }

    static AtomicBoolean a(me me1)
    {
        return me1.h;
    }

    protected abstract void a();

    protected void a(int i)
    {
        if (i != -2)
        {
            e = new AdResponseParcel(i, e.zzzc);
        }
        mo mo1 = a;
        AdRequestInfoParcel adrequestinfoparcel = d.a;
        mo1.zzb(new pa(adrequestinfoparcel.zzEn, c, e.zzyY, i, e.zzyZ, e.zzEM, e.orientation, e.zzzc, adrequestinfoparcel.zzEq, e.zzEK, null, null, null, null, null, e.zzEL, d.d, e.zzEJ, d.f, e.zzEO, e.zzEP, d.h, null));
    }

    public final void a(ry ry1, boolean flag)
    {
        zzb.zzaF("WebView finished loading.");
        if (!h.getAndSet(false))
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
        qa.a.removeCallbacks(g);
    }

    protected int b()
    {
        return -2;
    }

    public void cancel()
    {
        if (!h.getAndSet(false))
        {
            return;
        } else
        {
            c.stopLoading();
            zzp.zzbx();
            qd.a(c.a());
            a(-1);
            qa.a.removeCallbacks(g);
            return;
        }
    }

    public Object zzfu()
    {
        bl.b("Webview render task needs to be called on UI thread.");
        g = new mf(this);
        Handler handler = qa.a;
        Runnable runnable = g;
        cq cq = cy.am;
        handler.postDelayed(runnable, ((Long)zzp.zzbE().a(cq)).longValue());
        a();
        return null;
    }
}
