// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.os.Looper;
import com.google.android.gms.internal.zzkk;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            h, zze

class a
    implements Runnable
{

    final h a;

    public void run()
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            h.a(a).zzgJ().zze(this);
        } else
        {
            boolean flag = a.c();
            h.a(a, 0L);
            if (flag && !h.b(a))
            {
                a.a();
                return;
            }
        }
    }

    (h h1)
    {
        a = h1;
        super();
    }
}
