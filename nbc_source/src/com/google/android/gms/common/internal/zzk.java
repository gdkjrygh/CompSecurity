// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzl

public abstract class zzk
{

    private static final Object zzaaJ = new Object();
    private static zzk zzaaK;

    public zzk()
    {
    }

    public static zzk zzah(Context context)
    {
        synchronized (zzaaJ)
        {
            if (zzaaK == null)
            {
                zzaaK = new zzl(context.getApplicationContext());
            }
        }
        return zzaaK;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public abstract boolean zza(String s, ServiceConnection serviceconnection, String s1);

    public abstract void zzb(String s, ServiceConnection serviceconnection, String s1);

}
