// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            ck

class oN
    implements Runnable
{

    private final WeakReference oM;
    final ck oN;
    final  oO;

    public void run()
    {
        ck ck1 = (ck)oM.get();
        if (!oM(oO) && ck1 != null)
        {
            ck1.aW();
            oO.();
        }
    }

    ( , ck ck1)
    {
        oO = ;
        oN = ck1;
        super();
        oM = new WeakReference(oN);
    }
}
