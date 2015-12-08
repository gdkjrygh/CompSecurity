// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.os.Looper;
import com.google.android.gms.internal.je;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            ag, s

final class a
    implements Runnable
{

    final ag a;

    public final void run()
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            ag.a(a).g().a(this);
        } else
        {
            boolean flag = a.c();
            ag.b(a);
            if (flag && !ag.c(a))
            {
                a.a();
                return;
            }
        }
    }

    (ag ag1)
    {
        a = ag1;
        super();
    }
}
