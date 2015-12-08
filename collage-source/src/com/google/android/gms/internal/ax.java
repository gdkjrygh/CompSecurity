// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.e;

// Referenced classes of package com.google.android.gms.internal:
//            au, aw

public class ax
{

    private final Object a = new Object();
    private boolean b;
    private SharedPreferences c;

    public ax()
    {
        b = false;
        c = null;
    }

    public Object a(au au1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (b)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        au1 = ((au) (au1.b()));
        return au1;
        obj;
        JVM INSTR monitorexit ;
        return au1.a(c);
        au1;
        obj;
        JVM INSTR monitorexit ;
        throw au1;
    }

    public void a(Context context)
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
        context = e.e(context);
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
        c = zzp.zzbE().a(context);
        b = true;
        obj;
        JVM INSTR monitorexit ;
    }
}
