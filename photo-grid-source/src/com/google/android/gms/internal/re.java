// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            qa, qd

public final class re
{

    private Activity a;
    private boolean b;
    private boolean c;
    private boolean d;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener e;
    private android.view.ViewTreeObserver.OnScrollChangedListener f;

    public re(Activity activity, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
    {
        a = activity;
        e = ongloballayoutlistener;
        f = onscrollchangedlistener;
    }

    private void e()
    {
        while (a == null || b) 
        {
            return;
        }
        if (e != null)
        {
            zzp.zzbv();
            qa.a(a, e);
        }
        if (f != null)
        {
            zzp.zzbv();
            qa.a(a, f);
        }
        b = true;
    }

    private void f()
    {
        while (a == null || !b) 
        {
            return;
        }
        if (e != null)
        {
            zzp.zzbx().a(a, e);
        }
        if (f != null)
        {
            zzp.zzbv();
            qa.b(a, f);
        }
        b = false;
    }

    public final void a()
    {
        d = true;
        if (c)
        {
            e();
        }
    }

    public final void a(Activity activity)
    {
        a = activity;
    }

    public final void b()
    {
        d = false;
        f();
    }

    public final void c()
    {
        c = true;
        if (d)
        {
            e();
        }
    }

    public final void d()
    {
        c = false;
        f();
    }
}
