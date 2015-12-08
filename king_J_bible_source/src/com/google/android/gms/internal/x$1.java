// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            x, v

class lc
    implements Runnable
{

    private final WeakReference lb;
    final v lc;
    final x ld;

    public void run()
    {
        x.a(ld, false);
        v v1 = (v)lb.get();
        if (v1 != null)
        {
            v1.b(x.a(ld));
        }
    }

    (x x1, v v1)
    {
        ld = x1;
        lc = v1;
        super();
        lb = new WeakReference(lc);
    }
}
