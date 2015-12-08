// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzb;

public class zzm extends com.google.android.gms.ads.internal.client.zzw.zza
{

    private static final Object b = new Object();
    private static zzm c;
    private final Context a;
    private boolean d;

    private zzm(Context context)
    {
        a = context;
        d = false;
    }

    public static zzm zzq(Context context)
    {
        synchronized (b)
        {
            if (c == null)
            {
                c = new zzm(context.getApplicationContext());
            }
            context = c;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void zza()
    {
label0:
        {
            synchronized (b)
            {
                if (!d)
                {
                    break label0;
                }
                zzb.zzaH("Mobile ads is initialized already.");
            }
            return;
        }
        d = true;
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
