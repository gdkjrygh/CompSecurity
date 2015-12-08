// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            cw, cx

final class cy
    implements Runnable
{

    final cw a;
    final cx b;
    private final WeakReference c;

    cy(cx cx1, cw cw1)
    {
        b = cx1;
        a = cw1;
        super();
        c = new WeakReference(a);
    }

    public final void run()
    {
        cw cw1 = (cw)c.get();
        if (!cx.a(b) && cw1 != null)
        {
            cw1.e();
            b.b();
        }
    }
}
