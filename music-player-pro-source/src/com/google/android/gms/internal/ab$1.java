// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            ab, u

class mB
    implements Runnable
{

    private final WeakReference mA;
    final u mB;
    final ab mC;

    public void run()
    {
        ab.a(mC, false);
        u u1 = (u)mA.get();
        if (u1 != null)
        {
            u1.b(ab.a(mC));
        }
    }

    (ab ab1, u u1)
    {
        mC = ab1;
        mB = u1;
        super();
        mA = new WeakReference(mB);
    }
}
