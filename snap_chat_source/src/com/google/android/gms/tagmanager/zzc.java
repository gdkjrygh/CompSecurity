// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzaj, zza, zzde

class zzc extends zzaj
{

    private static final String ID;
    private final com.google.android.gms.tagmanager.zza zzaxm;

    public zzc(Context context)
    {
        this(zza.zzaj(context));
    }

    zzc(com.google.android.gms.tagmanager.zza zza1)
    {
        super(ID, new String[0]);
        zzaxm = zza1;
    }

    public com.google.android.gms.internal.zzd.zza zzH(Map map)
    {
        boolean flag;
        if (!zzaxm.isLimitAdTrackingEnabled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return zzde.zzx(Boolean.valueOf(flag));
    }

    public boolean zzsD()
    {
        return false;
    }

    static 
    {
        ID = zza.zzv.toString();
    }
}
