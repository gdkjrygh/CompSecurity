// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.zzd;
import com.google.android.gms.analytics.internal.zzf;

// Referenced classes of package com.google.android.gms.analytics:
//            Tracker

private class zzIX extends zzd
{

    final Tracker zzIU;
    private long zzIX;
    private boolean zzIY;

    protected void zzhn()
    {
    }

    public boolean zzhq()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        flag = zzIY;
        zzIY = false;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    protected (Tracker tracker, zzf zzf)
    {
        zzIU = tracker;
        super(zzf);
        zzIX = -1L;
    }
}
