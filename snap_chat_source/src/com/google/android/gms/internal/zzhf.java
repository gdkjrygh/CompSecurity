// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.internal:
//            zzab, zzhg, zzhh, zzax

public class zzhf
{
    static final class zza
    {

        private long zzyJ;
        private long zzyK;

        public final Bundle toBundle()
        {
            Bundle bundle = new Bundle();
            bundle.putLong("topen", zzyJ);
            bundle.putLong("tclose", zzyK);
            return bundle;
        }

        public final long zzea()
        {
            return zzyK;
        }

        public final void zzeb()
        {
            zzyK = SystemClock.elapsedRealtime();
        }

        public final void zzec()
        {
            zzyJ = SystemClock.elapsedRealtime();
        }

        public zza()
        {
            zzyJ = -1L;
            zzyK = -1L;
        }
    }


    private final zzhg zzmV;
    private final Object zznh;
    private boolean zzxJ;
    private final LinkedList zzyA;
    private final String zzyB;
    private final String zzyC;
    private long zzyD;
    private long zzyE;
    private long zzyF;
    private long zzyG;
    private long zzyH;
    private long zzyI;

    public zzhf(zzhg zzhg1, String s, String s1)
    {
        zznh = new Object();
        zzyD = -1L;
        zzyE = -1L;
        zzxJ = false;
        zzyF = -1L;
        zzyG = 0L;
        zzyH = -1L;
        zzyI = -1L;
        zzmV = zzhg1;
        zzyB = s;
        zzyC = s1;
        zzyA = new LinkedList();
    }

    public zzhf(String s, String s1)
    {
        this(zzab.zzaP(), s, s1);
    }

    public Bundle toBundle()
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        ArrayList arraylist;
        obj1 = new Bundle();
        ((Bundle) (obj1)).putString("seq_num", zzyB);
        ((Bundle) (obj1)).putString("slotid", zzyC);
        ((Bundle) (obj1)).putBoolean("ismediation", zzxJ);
        ((Bundle) (obj1)).putLong("treq", zzyH);
        ((Bundle) (obj1)).putLong("tresponse", zzyI);
        ((Bundle) (obj1)).putLong("timp", zzyE);
        ((Bundle) (obj1)).putLong("tload", zzyF);
        ((Bundle) (obj1)).putLong("pcc", zzyG);
        ((Bundle) (obj1)).putLong("tfetch", zzyD);
        arraylist = new ArrayList();
        for (Iterator iterator = zzyA.iterator(); iterator.hasNext(); arraylist.add(((zza)iterator.next()).toBundle())) { }
        break MISSING_BLOCK_LABEL_158;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        ((Bundle) (obj1)).putParcelableArrayList("tclick", arraylist);
        obj;
        JVM INSTR monitorexit ;
        return ((Bundle) (obj1));
    }

    public void zzdX()
    {
        synchronized (zznh)
        {
            if (zzyI != -1L && zzyE == -1L)
            {
                zzyE = SystemClock.elapsedRealtime();
                zzmV.zza(this);
            }
            zzmV.zzef().zzdX();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzdY()
    {
        synchronized (zznh)
        {
            if (zzyI != -1L)
            {
                zza zza1 = new zza();
                zza1.zzec();
                zzyA.add(zza1);
                zzyG = zzyG + 1L;
                zzmV.zzef().zzdY();
                zzmV.zza(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzdZ()
    {
        synchronized (zznh)
        {
            if (zzyI != -1L && !zzyA.isEmpty())
            {
                zza zza1 = (zza)zzyA.getLast();
                if (zza1.zzea() == -1L)
                {
                    zza1.zzeb();
                    zzmV.zza(this);
                }
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zze(zzax zzax)
    {
        synchronized (zznh)
        {
            zzyH = SystemClock.elapsedRealtime();
            zzmV.zzef().zzb(zzax, zzyH);
        }
        return;
        zzax;
        obj;
        JVM INSTR monitorexit ;
        throw zzax;
    }

    public void zzj(long l)
    {
        synchronized (zznh)
        {
            zzyI = l;
            if (zzyI != -1L)
            {
                zzmV.zza(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzk(long l)
    {
        synchronized (zznh)
        {
            if (zzyI != -1L)
            {
                zzyD = l;
                zzmV.zza(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzx(boolean flag)
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        if (zzyI == -1L)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        zzyF = SystemClock.elapsedRealtime();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        zzyE = zzyF;
        zzmV.zza(this);
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzy(boolean flag)
    {
        synchronized (zznh)
        {
            if (zzyI != -1L)
            {
                zzxJ = flag;
                zzmV.zza(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
