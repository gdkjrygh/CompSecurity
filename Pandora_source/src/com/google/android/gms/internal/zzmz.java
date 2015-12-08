// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.tagmanager.zzbg;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzmx, zzmt, zzmy, zzmo, 
//            zzmw, zzhy

public class zzmz
    implements Runnable
{

    private final Context mContext;
    private final zzmx zzaEE;
    private final zzmo zzaHH;
    private final zzmy zzaHO;
    private final zzmt zzaHP;

    public zzmz(Context context, zzmo zzmo1, zzmy zzmy1)
    {
        this(context, zzmo1, zzmy1, new zzmx(), new zzmt());
    }

    zzmz(Context context, zzmo zzmo1, zzmy zzmy1, zzmx zzmx1, zzmt zzmt1)
    {
        zzv.zzr(context);
        zzv.zzr(zzmy1);
        mContext = context;
        zzaHH = zzmo1;
        zzaHO = zzmy1;
        zzaEE = zzmx1;
        zzaHP = zzmt1;
    }

    public zzmz(Context context, zzmo zzmo1, zzmy zzmy1, String s)
    {
        this(context, zzmo1, zzmy1, new zzmx(), new zzmt());
        zzaHP.zzem(s);
    }

    public void run()
    {
        zzdF();
    }

    boolean zzaM(String s)
    {
        return mContext.getPackageManager().checkPermission(s, mContext.getPackageName()) == 0;
    }

    void zzdF()
    {
        zzmw zzmw1;
        if (!zzyO())
        {
            zzaHO.zza(zzmy.zza.zzaHJ);
            return;
        }
        zzbg.zzam("NetworkLoader: Starting to load resource from Network.");
        zzmw1 = zzaEE.zzyM();
        String s = zzaHP.zzu(zzaHH.zzyl());
        java.io.InputStream inputstream = zzmw1.zzev(s);
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        zzhy.zza(inputstream, bytearrayoutputstream);
        zzaHO.zzq(bytearrayoutputstream.toByteArray());
        zzmw1.close();
        zzbg.zzam("NetworkLoader: Resource loaded.");
        return;
        Object obj;
        obj;
        zzbg.zzak((new StringBuilder()).append("NetworkLoader: No data is retrieved from the given url: ").append(s).toString());
        zzaHO.zza(zzmy.zza.zzaHL);
        zzmw1.close();
        return;
        obj;
        zzbg.zzb((new StringBuilder()).append("NetworkLoader: Error when loading resource from url: ").append(s).append(" ").append(((IOException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        zzaHO.zza(zzmy.zza.zzaHK);
        zzmw1.close();
        return;
        obj;
        zzbg.zzb((new StringBuilder()).append("NetworkLoader: Error when parsing downloaded resources from url: ").append(s).append(" ").append(((IOException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        zzaHO.zza(zzmy.zza.zzaHL);
        zzmw1.close();
        return;
        Exception exception;
        exception;
        zzmw1.close();
        throw exception;
    }

    boolean zzyO()
    {
        if (!zzaM("android.permission.INTERNET"))
        {
            zzbg.zzak("Missing android.permission.INTERNET. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.INTERNET\" />");
            return false;
        }
        if (!zzaM("android.permission.ACCESS_NETWORK_STATE"))
        {
            zzbg.zzak("Missing android.permission.ACCESS_NETWORK_STATE. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />");
            return false;
        }
        NetworkInfo networkinfo = ((ConnectivityManager)mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            zzbg.zzan("NetworkLoader: No network connectivity - Offline");
            return false;
        } else
        {
            return true;
        }
    }
}
