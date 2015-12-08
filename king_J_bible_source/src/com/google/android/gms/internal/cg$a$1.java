// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            cg

class oz
    implements Runnable
{

    final  oA;
    private final WeakReference oy;
    final cg oz;

    public void run()
    {
        cg cg1 = (cg)oy.get();
        if (!oy(oA) && cg1 != null)
        {
            cg1.aV();
            oA.();
        }
    }

    ( , cg cg1)
    {
        oA = ;
        oz = cg1;
        super();
        oy = new WeakReference(oz);
    }
}
