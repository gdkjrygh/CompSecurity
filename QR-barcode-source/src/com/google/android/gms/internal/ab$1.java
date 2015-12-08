// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            ab, u

class mq
    implements Runnable
{

    private final WeakReference mp;
    final u mq;
    final ab mr;

    public void run()
    {
        ab.a(mr, false);
        u u1 = (u)mp.get();
        if (u1 != null)
        {
            u1.b(ab.a(mr));
        }
    }

    (ab ab1, u u1)
    {
        mr = ab1;
        mq = u1;
        super();
        mp = new WeakReference(mq);
    }
}
