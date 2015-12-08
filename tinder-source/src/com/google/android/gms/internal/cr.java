// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import com.google.android.gms.ads.internal.d;

// Referenced classes of package com.google.android.gms.internal:
//            cl, cm

public final class cr
{

    Activity a;
    boolean b;
    boolean c;
    private boolean d;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener e;
    private android.view.ViewTreeObserver.OnScrollChangedListener f;

    public cr(Activity activity, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        a = activity;
        e = ongloballayoutlistener;
        f = null;
    }

    final void a()
    {
        while (a == null || d) 
        {
            return;
        }
        if (e != null)
        {
            com.google.android.gms.ads.internal.d.c();
            cl.a(a, e);
        }
        if (f != null)
        {
            com.google.android.gms.ads.internal.d.c();
            cl.a(a, f);
        }
        d = true;
    }

    final void b()
    {
        while (a == null || !d) 
        {
            return;
        }
        if (e != null)
        {
            com.google.android.gms.ads.internal.d.e().a(a, e);
        }
        if (f != null)
        {
            com.google.android.gms.ads.internal.d.c();
            cl.b(a, f);
        }
        d = false;
    }
}
