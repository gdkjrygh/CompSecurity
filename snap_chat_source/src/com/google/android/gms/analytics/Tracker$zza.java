// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.internal.zzlv;
import com.google.android.gms.internal.zzlx;

// Referenced classes of package com.google.android.gms.analytics:
//            Tracker

class zzmW
{

    private long zzFm;
    private boolean zzFn;
    final Tracker zzFp;
    private zzlv zzmW;

    public boolean zzgG()
    {
        boolean flag = zzFn;
        zzFn = false;
        return flag;
    }

    public (Tracker tracker)
    {
        zzFp = tracker;
        super();
        zzFm = -1L;
        zzmW = zzlx.zzkc();
    }
}
