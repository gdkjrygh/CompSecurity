// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            z, v

class lk
    implements Runnable
{

    private final WeakReference lj;
    final v lk;
    final z ll;

    public void run()
    {
        z.a(ll, false);
        v v1 = (v)lj.get();
        if (v1 != null)
        {
            v1.b(z.a(ll));
        }
    }

    (z z1, v v1)
    {
        ll = z1;
        lk = v1;
        super();
        lj = new WeakReference(lk);
    }
}
