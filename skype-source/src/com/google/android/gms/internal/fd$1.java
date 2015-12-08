// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.b;

// Referenced classes of package com.google.android.gms.internal:
//            fd, hi, hj, gm

final class a
    implements Runnable
{

    final fd a;

    public final void run()
    {
label0:
        {
            synchronized (a.e)
            {
                if (a.h.e == -2)
                {
                    break label0;
                }
            }
            return;
        }
        a.d.j().a(a);
        a.c();
        b.a(2);
        hi hi1 = a.d;
        p.e();
        hi1.loadDataWithBaseURL(gm.a(a.h.b), a.h.c, "text/html", "UTF-8", null);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (fd fd1)
    {
        a = fd1;
        super();
    }
}
