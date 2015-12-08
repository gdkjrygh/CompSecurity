// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            zzeq

class zzuH
    implements Runnable
{

    private final WeakReference zzuG;
    final zzeq zzuH;
    final dq zzuI;

    public void run()
    {
        zzeq zzeq1 = (zzeq)zzuG.get();
        if (!a(zzuI) && zzeq1 != null)
        {
            zzeq1.zzdp();
            zzuI.dq();
        }
    }

    ( , zzeq zzeq1)
    {
        zzuI = ;
        zzuH = zzeq1;
        super();
        zzuG = new WeakReference(zzuH);
    }
}
