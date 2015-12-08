// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            zzab, zzho, zzcb, zzcd, 
//            zzhx, zzcc

public final class zzhk
{

    private static final Object zzmz = new Object();
    private static zzcc zzzg;
    private static String zzzh;

    public static String zza(Context context, String s, String s1)
    {
        synchronized (zzmz)
        {
            if (zzzh == null && !TextUtils.isEmpty(s))
            {
                zzb(context, s, s1);
            }
            context = zzzh;
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
            zzzh = "err";
            return;
        }
        context = new BigInteger(new byte[1]);
        as = s.split(",");
        for (int i = 0; i < as.length;)
        {
            s = context;
            if (zzab.zzaM().zza(s1, class1, as[i]))
            {
                s = context.setBit(i);
            }
            i++;
            context = s;
        }

        zzzh = String.format(Locale.US, "%X", new Object[] {
            context
        });
    }

    public static void zzd(Context context, String s)
    {
        Object obj = zzmz;
        obj;
        JVM INSTR monitorenter ;
        zzcb zzcb1;
        if (zzzg != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        zzcb1 = new zzcb();
        zzcb1.zzb(context, s);
        zzzg = zzab.zzaR().zzb(zzcb1);
_L1:
        return;
        context;
        zzhx.zzac((new StringBuilder("Cannot initialize CSI reporter.")).append(context.getMessage()).toString());
          goto _L1
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static zzcc zzeg()
    {
        zzcc zzcc;
        synchronized (zzmz)
        {
            zzcc = zzzg;
        }
        return zzcc;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String zzep()
    {
        String s;
        synchronized (zzmz)
        {
            s = zzzh;
        }
        return s;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
