// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;
import java.math.BigInteger;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            zzfl, zzau, zzaw, zzav

public final class zzfg
{

    private static zzav zzCe;
    private static String zzCf;
    private static final Object zznu = new Object();

    public static String zza(Context context, String s, String s1)
    {
        synchronized (zznu)
        {
            if (zzCf == null && !TextUtils.isEmpty(s))
            {
                zzb(context, s, s1);
            }
            context = zzCf;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static void zzb(Context context, String s, String s1)
    {
        Class class1;
        String as[];
        try
        {
            s1 = context.createPackageContext(s1, 3).getClassLoader();
            class1 = Class.forName("com.google.ads.mediation.MediationAdapter", false, s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzCf = "err";
            return;
        }
        context = new BigInteger(new byte[1]);
        as = s.split(",");
        for (int i = 0; i < as.length;)
        {
            s = context;
            if (zzh.zzaQ().zza(s1, class1, as[i]))
            {
                s = context.setBit(i);
            }
            i++;
            context = s;
        }

        zzCf = String.format(Locale.US, "%X", new Object[] {
            context
        });
    }

    public static void zze(Context context, String s)
    {
        Object obj = zznu;
        obj;
        JVM INSTR monitorenter ;
        zzau zzau1;
        if (zzCe != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        zzau1 = new zzau();
        zzau1.zzb(context, s);
        zzCe = zzh.zzaV().zzb(zzau1);
_L1:
        return;
        context;
        com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("Cannot initialize CSI reporter.").append(context.getMessage()).toString());
          goto _L1
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static zzav zzeM()
    {
        zzav zzav;
        synchronized (zznu)
        {
            zzav = zzCe;
        }
        return zzav;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String zzeV()
    {
        String s;
        synchronized (zznu)
        {
            s = zzCf;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
