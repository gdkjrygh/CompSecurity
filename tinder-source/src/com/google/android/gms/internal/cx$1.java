// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.overlay.zzd;

// Referenced classes of package com.google.android.gms.internal:
//            cx, cw

final class a
    implements Runnable
{

    final cx a;

    public final void run()
    {
        a.a.t();
        zzd zzd1 = a.a.f();
        if (zzd1 != null)
        {
            zzd1.l.removeView(zzd1.f);
            zzd1.a(true);
        }
        if (cx.d(a) != null)
        {
            cx.d(a);
            cx.e(a);
        }
    }

    verlay.zzd(cx cx1)
    {
        a = cx1;
        super();
    }
}
