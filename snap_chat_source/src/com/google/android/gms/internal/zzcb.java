// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzca, zzbx, zzab, zzho, 
//            zzhx

public class zzcb
{

    private Context mContext;
    private String zznf;
    private boolean zzqO;
    private int zzqP;
    private int zzqQ;
    private int zzqR;
    private int zzqS;
    private String zzqT;
    private Map zzqU;

    public zzcb()
    {
        mContext = null;
        zznf = null;
        zzqO = ((Boolean)zzca.zzqy.get()).booleanValue();
        zzqT = (String)zzca.zzqA.get();
        zzqQ = 30;
        zzqR = 3;
        zzqS = 100;
        zzqP = ((Integer)zzca.zzqz.get()).intValue();
        zzqU = new LinkedHashMap();
        zzqU.put("s", "gmob_sdk");
        zzqU.put("v", "3");
        zzqU.put("os", android.os.Build.VERSION.RELEASE);
        zzqU.put("sdk", android.os.Build.VERSION.SDK);
        zzqU.put("device", zzab.zzaM().zzev());
    }

    Context getContext()
    {
        return mContext;
    }

    String zzaX()
    {
        return zznf;
    }

    public zzcb zzb(Context context, String s)
    {
        mContext = context;
        zznf = s;
        zzqU.put("ua", zzab.zzaM().zze(context, s));
        try
        {
            zzqU.put("app", context.getApplicationContext().getPackageName());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzhx.zzac("Cannot get the application name. Set to null.");
            zzqU.put("app", null);
            return this;
        }
        return this;
    }

    boolean zzcd()
    {
        return zzqO;
    }

    String zzce()
    {
        return zzqT;
    }

    int zzcf()
    {
        return zzqQ;
    }

    int zzcg()
    {
        return zzqR;
    }

    int zzch()
    {
        return zzqS;
    }

    int zzci()
    {
        return zzqP;
    }

    Map zzcj()
    {
        return zzqU;
    }
}
