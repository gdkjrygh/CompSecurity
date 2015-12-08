// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;
import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzat, zzap, zzfl

public class zzau
{

    private Context mContext;
    private String zzoc;
    private boolean zzrY;
    private int zzrZ;
    private int zzsa;
    private int zzsb;
    private int zzsc;
    private String zzsd;
    private Map zzse;

    public zzau()
    {
        mContext = null;
        zzoc = null;
        zzrY = ((Boolean)zzat.zzrC.get()).booleanValue();
        zzsd = (String)zzat.zzrE.get();
        zzsa = 30;
        zzsb = 3;
        zzsc = 100;
        zzrZ = ((Integer)zzat.zzrD.get()).intValue();
        zzse = new LinkedHashMap();
        zzse.put("s", "gmob_sdk");
        zzse.put("v", "3");
        zzse.put("os", android.os.Build.VERSION.RELEASE);
        zzse.put("sdk", android.os.Build.VERSION.SDK);
        zzse.put("device", zzh.zzaQ().zzfc());
    }

    Context getContext()
    {
        return mContext;
    }

    public zzau zzb(Context context, String s)
    {
        mContext = context;
        zzoc = s;
        zzse.put("ua", zzh.zzaQ().zzf(context, s));
        try
        {
            zzse.put("app", context.getApplicationContext().getPackageName());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Cannot get the application name. Set to null.");
            zzse.put("app", null);
            return this;
        }
        return this;
    }

    String zzbd()
    {
        return zzoc;
    }

    boolean zzch()
    {
        return zzrY;
    }

    String zzci()
    {
        return zzsd;
    }

    int zzcj()
    {
        return zzsa;
    }

    int zzck()
    {
        return zzsb;
    }

    int zzcl()
    {
        return zzsc;
    }

    int zzcm()
    {
        return zzrZ;
    }

    Map zzcn()
    {
        return zzse;
    }
}
