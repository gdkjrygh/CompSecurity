// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.os.Looper;
import com.google.android.gms.internal.zzof;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            ah, t

class a
    implements Runnable
{

    final ah a;

    public void run()
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            ah.a(a).h().a(this);
        } else
        {
            boolean flag = a.c();
            ah.a(a, 0L);
            if (flag && !ah.b(a))
            {
                a.a();
                return;
            }
        }
    }

    (ah ah1)
    {
        a = ah1;
        super();
    }
}
