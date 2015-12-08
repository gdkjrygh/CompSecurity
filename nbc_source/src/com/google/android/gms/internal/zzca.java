// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzbz, zzbv, zzhl

public class zzca
{

    private Context mContext;
    private String zzqr;
    private int zzuA;
    private int zzuB;
    private int zzuC;
    private String zzuD;
    private Map zzuE;
    private boolean zzuy;
    private int zzuz;

    public zzca()
    {
        mContext = null;
        zzqr = null;
        zzuy = ((Boolean)zzbz.zztY.get()).booleanValue();
        zzuD = (String)zzbz.zzua.get();
        zzuA = 30;
        zzuB = 3;
        zzuC = 100;
        zzuz = ((Integer)zzbz.zztZ.get()).intValue();
        zzuE = new LinkedHashMap();
        zzuE.put("s", "gmob_sdk");
        zzuE.put("v", "3");
        zzuE.put("os", android.os.Build.VERSION.RELEASE);
        zzuE.put("sdk", android.os.Build.VERSION.SDK);
        zzuE.put("device", zzo.zzbv().zzgo());
    }

    Context getContext()
    {
        return mContext;
    }

    public zzca zzb(Context context, String s)
    {
        mContext = context;
        zzqr = s;
        zzuE.put("ua", zzo.zzbv().zzf(context, s));
        try
        {
            zzuE.put("app", context.getApplicationContext().getPackageName());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Cannot get the application name. Set to null.");
            zzuE.put("app", null);
            return this;
        }
        return this;
    }

    String zzbR()
    {
        return zzqr;
    }

    boolean zzdc()
    {
        return zzuy;
    }

    String zzdd()
    {
        return zzuD;
    }

    int zzde()
    {
        return zzuA;
    }

    int zzdf()
    {
        return zzuB;
    }

    int zzdg()
    {
        return zzuC;
    }

    int zzdh()
    {
        return zzuz;
    }

    Map zzdi()
    {
        return zzuE;
    }
}
