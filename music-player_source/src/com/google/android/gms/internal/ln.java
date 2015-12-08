// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            lm, lk

final class ln
    implements Runnable
{

    final lk a;
    final lm b;
    private final WeakReference c;

    ln(lm lm1, lk lk1)
    {
        b = lm1;
        a = lk1;
        super();
        c = new WeakReference(a);
    }

    public final void run()
    {
        lm.a(b);
        lk lk1 = (lk)c.get();
        if (lk1 != null)
        {
            lk1.b(lm.b(b));
        }
    }
}
