// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.tagmanager.zzbf;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzvs, zzvo, zzvt, zzvj, 
//            zzvr, zzlz

public class zzvu
    implements Runnable
{

    private final Context mContext;
    private final zzvj zzaCG;
    private final zzvt zzaCN;
    private final zzvo zzaCO;
    private final zzvs zzazL;

    public zzvu(Context context, zzvj zzvj1, zzvt zzvt1)
    {
        this(context, zzvj1, zzvt1, new zzvs(), new zzvo());
    }

    zzvu(Context context, zzvj zzvj1, zzvt zzvt1, zzvs zzvs1, zzvo zzvo1)
    {
        zzx.zzl(context);
        zzx.zzl(zzvt1);
        mContext = context;
        zzaCG = zzvj1;
        zzaCN = zzvt1;
        zzazL = zzvs1;
        zzaCO = zzvo1;
    }

    public zzvu(Context context, zzvj zzvj1, zzvt zzvt1, String s)
    {
        this(context, zzvj1, zzvt1, new zzvs(), new zzvo());
        zzaCO.zzdx(s);
    }

    public void run()
    {
        zzdo();
    }

    boolean zzdI(String s)
    {
        return mContext.getPackageManager().checkPermission(s, mContext.getPackageName()) == 0;
    }

    void zzdo()
    {
        zzvr zzvr1;
        if (!zzuQ())
        {
            zzaCN.zza(zzvt.zza.zzaCI);
            return;
        }
        zzbf.zzab("NetworkLoader: Starting to load resource from Network.");
        zzvr1 = zzazL.zzuO();
        String s = zzaCO.zzv(zzaCG.zzun());
        java.io.InputStream inputstream = zzvr1.zzdG(s);
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        zzlz.zza(inputstream, bytearrayoutputstream);
        zzaCN.zzo(bytearrayoutputstream.toByteArray());
        zzvr1.close();
        zzbf.zzab("NetworkLoader: Resource loaded.");
        return;
        Object obj;
        obj;
        zzbf.zzZ((new StringBuilder("NetworkLoader: No data is retrieved from the given url: ")).append(s).toString());
        zzaCN.zza(zzvt.zza.zzaCK);
        zzvr1.close();
        return;
        obj;
        zzbf.zzb((new StringBuilder("NetworkLoader: Error when loading resource from url: ")).append(s).append(" ").append(((IOException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        zzaCN.zza(zzvt.zza.zzaCJ);
        zzvr1.close();
        return;
        obj;
        zzbf.zzb((new StringBuilder("NetworkLoader: Error when parsing downloaded resources from url: ")).append(s).append(" ").append(((IOException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        zzaCN.zza(zzvt.zza.zzaCK);
        zzvr1.close();
        return;
        Exception exception;
        exception;
        zzvr1.close();
        throw exception;
    }

    boolean zzuQ()
    {
        if (!zzdI("android.permission.INTERNET"))
        {
            zzbf.zzZ("Missing android.permission.INTERNET. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.INTERNET\" />");
            return false;
        }
        if (!zzdI("android.permission.ACCESS_NETWORK_STATE"))
        {
            zzbf.zzZ("Missing android.permission.ACCESS_NETWORK_STATE. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />");
            return false;
        }
        NetworkInfo networkinfo = ((ConnectivityManager)mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            zzbf.zzac("NetworkLoader: No network connectivity - Offline");
            return false;
        } else
        {
            return true;
        }
    }
}
