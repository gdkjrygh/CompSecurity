// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzv;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zze, zzae, zzx, zzl, 
//            zzn

public class zzq
{

    private final zze zzEb;
    private Boolean zzGS;
    private String zzGT;
    private Set zzGU;

    protected zzq(zze zze1)
    {
        zzv.zzr(zze1);
        zzEb = zze1;
    }

    public boolean zzhP()
    {
        return zzd.zzSV;
    }

    public boolean zzhQ()
    {
        if (zzGS != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (zzGS != null) goto _L4; else goto _L3
_L3:
        Object obj;
        Object obj1;
        obj1 = zzEb.getContext();
        obj = ((Context) (obj1)).getApplicationInfo();
        if (obj == null) goto _L6; else goto _L5
_L5:
        obj = ((ApplicationInfo) (obj)).processName;
        obj1 = (ActivityManager)((Context) (obj1)).getSystemService("activity");
        if (obj1 == null) goto _L6; else goto _L7
_L7:
        int i;
        i = Process.myPid();
        obj1 = ((ActivityManager) (obj1)).getRunningAppProcesses().iterator();
_L10:
        if (!((Iterator) (obj1)).hasNext()) goto _L6; else goto _L8
_L8:
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj1)).next();
        if (i != runningappprocessinfo.pid) goto _L10; else goto _L9
_L9:
        if (obj == null) goto _L12; else goto _L11
_L11:
        if (!((String) (obj)).equals(runningappprocessinfo.processName)) goto _L12; else goto _L13
_L13:
        boolean flag = true;
_L15:
        zzGS = Boolean.valueOf(flag);
_L6:
        if (zzGS == null)
        {
            zzGS = Boolean.TRUE;
            zzEb.zzgH().zzaJ("My process not in the list of running processes");
        }
_L4:
        this;
        JVM INSTR monitorexit ;
_L2:
        return zzGS.booleanValue();
_L12:
        flag = false;
        if (true) goto _L15; else goto _L14
_L14:
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean zzhR()
    {
        return ((Boolean)zzx.zzHe.get()).booleanValue();
    }

    public int zzhS()
    {
        return ((Integer)zzx.zzHx.get()).intValue();
    }

    public int zzhT()
    {
        return ((Integer)zzx.zzHB.get()).intValue();
    }

    public int zzhU()
    {
        return ((Integer)zzx.zzHC.get()).intValue();
    }

    public int zzhV()
    {
        return ((Integer)zzx.zzHD.get()).intValue();
    }

    public long zzhW()
    {
        return ((Long)zzx.zzHm.get()).longValue();
    }

    public long zzhX()
    {
        return ((Long)zzx.zzHl.get()).longValue();
    }

    public long zzhY()
    {
        return ((Long)zzx.zzHp.get()).longValue();
    }

    public long zzhZ()
    {
        return ((Long)zzx.zzHq.get()).longValue();
    }

    public int zzia()
    {
        return ((Integer)zzx.zzHr.get()).intValue();
    }

    public int zzib()
    {
        return ((Integer)zzx.zzHs.get()).intValue();
    }

    public long zzic()
    {
        return (long)((Integer)zzx.zzHF.get()).intValue();
    }

    public String zzid()
    {
        return (String)zzx.zzHu.get();
    }

    public String zzie()
    {
        return (String)zzx.zzHt.get();
    }

    public String zzif()
    {
        return (String)zzx.zzHv.get();
    }

    public String zzig()
    {
        return (String)zzx.zzHw.get();
    }

    public zzl zzih()
    {
        return zzl.zzaO((String)zzx.zzHy.get());
    }

    public zzn zzii()
    {
        return zzn.zzaP((String)zzx.zzHz.get());
    }

    public Set zzij()
    {
        String s = (String)zzx.zzHE.get();
        if (zzGU == null || zzGT == null || !zzGT.equals(s))
        {
            String as[] = TextUtils.split(s, ",");
            HashSet hashset = new HashSet();
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                String s1 = as[i];
                try
                {
                    hashset.add(Integer.valueOf(Integer.parseInt(s1)));
                }
                catch (NumberFormatException numberformatexception) { }
                i++;
            }
            zzGT = s;
            zzGU = hashset;
        }
        return zzGU;
    }

    public long zzik()
    {
        return ((Long)zzx.zzHN.get()).longValue();
    }

    public long zzil()
    {
        return ((Long)zzx.zzHO.get()).longValue();
    }

    public long zzim()
    {
        return ((Long)zzx.zzHR.get()).longValue();
    }

    public int zzin()
    {
        return ((Integer)zzx.zzHi.get()).intValue();
    }

    public int zzio()
    {
        return ((Integer)zzx.zzHk.get()).intValue();
    }

    public String zzip()
    {
        return "google_analytics_v4.db";
    }

    public String zziq()
    {
        return "google_analytics2_v4.db";
    }

    public long zzir()
    {
        return 0x5265c00L;
    }

    public int zzis()
    {
        return ((Integer)zzx.zzHH.get()).intValue();
    }

    public int zzit()
    {
        return ((Integer)zzx.zzHI.get()).intValue();
    }

    public long zziu()
    {
        return ((Long)zzx.zzHJ.get()).longValue();
    }

    public long zziv()
    {
        return ((Long)zzx.zzHS.get()).longValue();
    }
}
