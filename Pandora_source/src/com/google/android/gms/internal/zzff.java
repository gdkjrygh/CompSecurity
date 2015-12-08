// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzh;

// Referenced classes of package com.google.android.gms.internal:
//            zzfc

public class zzff
{

    private final String zzBC;
    private int zzCc;
    private int zzCd;
    private final zzfc zznQ;
    private final Object zzoe;

    zzff(zzfc zzfc1, String s)
    {
        zzoe = new Object();
        zznQ = zzfc1;
        zzBC = s;
    }

    public zzff(String s)
    {
        this(zzh.zzaT(), s);
    }

    public Bundle toBundle()
    {
        Bundle bundle;
        synchronized (zzoe)
        {
            bundle = new Bundle();
            bundle.putInt("pmnli", zzCc);
            bundle.putInt("pmnll", zzCd);
        }
        return bundle;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzf(int i, int j)
    {
        synchronized (zzoe)
        {
            zzCc = i;
            zzCd = j;
            zznQ.zza(zzBC, this);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
