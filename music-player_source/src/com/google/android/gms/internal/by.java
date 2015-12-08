// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            bw, bx

final class by
    implements Runnable
{

    final bw a;
    final bx b;
    private final WeakReference c;

    by(bx bx1, bw bw1)
    {
        b = bx1;
        a = bw1;
        super();
        c = new WeakReference(a);
    }

    public final void run()
    {
        bw bw1 = (bw)c.get();
        if (!bx.a(b) && bw1 != null)
        {
            bw1.e();
            b.b();
        }
    }
}
