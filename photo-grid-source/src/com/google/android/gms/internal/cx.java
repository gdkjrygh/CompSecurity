// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.GooglePlayServicesUtil;

// Referenced classes of package com.google.android.gms.internal:
//            cq

public final class cx
{

    private final Object a = new Object();
    private boolean b;
    private SharedPreferences c;

    public cx()
    {
        b = false;
        c = null;
    }

    public final Object a(cq cq1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (b)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        cq1 = ((cq) (cq1.b()));
        return cq1;
        obj;
        JVM INSTR monitorexit ;
        return cq1.a(c);
        cq1;
        obj;
        JVM INSTR monitorexit ;
        throw cq1;
    }

    public final void a(Context context)
    {
label0:
        {
            synchronized (a)
            {
                if (!b)
                {
                    break label0;
                }
            }
            return;
        }
        context = GooglePlayServicesUtil.getRemoteContext(context);
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        zzp.zzbC();
        c = context.getSharedPreferences("google_ads_flags", 1);
        b = true;
        obj;
        JVM INSTR monitorexit ;
    }
}
