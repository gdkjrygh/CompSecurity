// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.os.Looper;
import com.google.android.gms.internal.zzns;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzt, zzf

class a
    implements Runnable
{

    final zzt a;

    public void run()
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            zzt.a(a).h().a(this);
        } else
        {
            boolean flag = a.c();
            zzt.a(a, 0L);
            if (flag && !zzt.b(a))
            {
                a.a();
                return;
            }
        }
    }

    (zzt zzt1)
    {
        a = zzt1;
        super();
    }
}
