// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzri, zzrh, zzrd

public class zzre
{
    public static interface zza
    {

        public abstract void zza(zzrh zzrh1);

        public abstract void zza(zzrh zzrh1, Activity activity);
    }


    private static final zza zzash[] = new zza[0];
    private static zzre zzasi;
    private final Application zzasj;
    private zzrh zzask;
    private final List zzasl = new ArrayList();
    private zzri zzasm;

    private zzre(Application application)
    {
        zzx.zzl(application);
        zzasj = application;
    }

    public static zzre zzag(Context context)
    {
        zzx.zzl(context);
        context = (Application)context.getApplicationContext();
        zzx.zzl(context);
        com/google/android/gms/internal/zzre;
        JVM INSTR monitorenter ;
        if (zzasi == null)
        {
            zzasi = new zzre(context);
        }
        context = zzasi;
        com/google/android/gms/internal/zzre;
        JVM INSTR monitorexit ;
        return context;
        context;
        com/google/android/gms/internal/zzre;
        JVM INSTR monitorexit ;
        throw context;
    }

    private zza[] zzqZ()
    {
label0:
        {
            zza azza[];
            synchronized (zzasl)
            {
                if (!zzasl.isEmpty())
                {
                    break label0;
                }
                azza = zzash;
            }
            return azza;
        }
        zza azza1[] = (zza[])zzasl.toArray(new zza[zzasl.size()]);
        list;
        JVM INSTR monitorexit ;
        return azza1;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzZ(boolean flag)
    {
        while (android.os.Build.VERSION.SDK_INT < 14 || zzqY() == flag) 
        {
            return;
        }
        if (flag)
        {
            zzasm = new zzri(this);
            zzasj.registerActivityLifecycleCallbacks(zzasm);
            return;
        } else
        {
            zzasj.unregisterActivityLifecycleCallbacks(zzasm);
            zzasm = null;
            return;
        }
    }

    public void zza(zza zza1)
    {
        zzx.zzl(zza1);
        synchronized (zzasl)
        {
            zzasl.remove(zza1);
            zzasl.add(zza1);
        }
        return;
        zza1;
        list;
        JVM INSTR monitorexit ;
        throw zza1;
    }

    public void zzb(zzrh zzrh1, Activity activity)
    {
        zza azza[];
        boolean flag;
        flag = false;
        zzx.zzl(zzrh1);
        azza = null;
        if (!zzrh1.isMutable()) goto _L2; else goto _L1
_L1:
        if (activity instanceof zzrd)
        {
            ((zzrd)activity).zzb(zzrh1);
        }
        if (zzask != null)
        {
            zzrh1.zzgr(zzask.zzaF());
            zzrh1.zzcv(zzask.zzre());
        }
        azza = zzqZ();
        for (int i = 0; i < azza.length; i++)
        {
            azza[i].zza(zzrh1, activity);
        }

        zzrh1.zzrh();
        if (!TextUtils.isEmpty(zzrh1.zzre())) goto _L2; else goto _L3
_L3:
        return;
_L2:
        if (zzask != null && zzask.zzaF() == zzrh1.zzaF())
        {
            zzask = zzrh1;
            return;
        }
        zzqX();
        zzask = zzrh1;
        activity = azza;
        int j = ((flag) ? 1 : 0);
        if (azza == null)
        {
            activity = zzqZ();
            j = ((flag) ? 1 : 0);
        }
        while (j < activity.length) 
        {
            activity[j].zza(zzrh1);
            j++;
        }
        if (true) goto _L3; else goto _L4
_L4:
    }

    public zzrh zzqW()
    {
        return zzask;
    }

    public void zzqX()
    {
        zzask = null;
    }

    public boolean zzqY()
    {
        return zzasm != null;
    }

}
