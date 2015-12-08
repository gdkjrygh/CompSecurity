// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            cj

class oP
    implements Runnable
{

    private final WeakReference oO;
    final cj oP;
    final  oQ;

    public void run()
    {
        cj cj1 = (cj)oO.get();
        if (!oO(oQ) && cj1 != null)
        {
            cj1.bb();
            oQ.();
        }
    }

    ( , cj cj1)
    {
        oQ = ;
        oP = cj1;
        super();
        oO = new WeakReference(oP);
    }
}
