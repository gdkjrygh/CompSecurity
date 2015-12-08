// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.zzvl;
import com.google.android.gms.internal.zzvr;
import com.google.android.gms.internal.zzvs;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbf, zzbe, zzr, zzca

class zzck
    implements Runnable
{

    private final Context mContext;
    private volatile String zzaxT;
    private final String zzaxw;
    private final zzvs zzazL;
    private final String zzazM;
    private zzbe zzazN;
    private volatile zzr zzazO;
    private volatile String zzazP;

    zzck(Context context, String s, zzvs zzvs1, zzr zzr1)
    {
        mContext = context;
        zzazL = zzvs1;
        zzaxw = s;
        zzazO = zzr1;
        zzazM = (new StringBuilder("/r?id=")).append(s).toString();
        zzaxT = zzazM;
        zzazP = null;
    }

    public zzck(Context context, String s, zzr zzr1)
    {
        this(context, s, new zzvs(), zzr1);
    }

    private boolean zztA()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            zzbf.zzab("...no network connectivity");
            return false;
        } else
        {
            return true;
        }
    }

    private void zztB()
    {
        zzvr zzvr1;
        String s;
        if (!zztA())
        {
            zzazN.zza(zzbe.zza.zzazg);
            return;
        }
        zzbf.zzab("Start loading resource from network ...");
        s = zztC();
        zzvr1 = zzazL.zzuO();
        Object obj = zzvr1.zzdG(s);
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        zzvl.zzc(((java.io.InputStream) (obj)), bytearrayoutputstream);
        obj = com.google.android.gms.internal.zzc.zzj.zzb(bytearrayoutputstream.toByteArray());
        zzbf.zzab((new StringBuilder("Successfully loaded supplemented resource: ")).append(obj).toString());
        if (((com.google.android.gms.internal.zzc.zzj) (obj)).zzgs == null && ((com.google.android.gms.internal.zzc.zzj) (obj)).zzgr.length == 0)
        {
            zzbf.zzab((new StringBuilder("No change for container: ")).append(zzaxw).toString());
        }
        zzazN.zzo(obj);
        zzvr1.close();
        zzbf.zzab("Load resource from network finished.");
        return;
        Object obj1;
        obj1;
        zzbf.zzac((new StringBuilder("No data is retrieved from the given url: ")).append(s).append(". Make sure container_id: ").append(zzaxw).append(" is correct.").toString());
        zzazN.zza(zzbe.zza.zzazi);
        zzvr1.close();
        return;
        obj1;
        zzbf.zzd((new StringBuilder("Error when loading resources from url: ")).append(s).append(" ").append(((IOException) (obj1)).getMessage()).toString(), ((Throwable) (obj1)));
        zzazN.zza(zzbe.zza.zzazh);
        zzvr1.close();
        return;
        obj1;
        zzbf.zzd((new StringBuilder("Error when parsing downloaded resources from url: ")).append(s).append(" ").append(((IOException) (obj1)).getMessage()).toString(), ((Throwable) (obj1)));
        zzazN.zza(zzbe.zza.zzazi);
        zzvr1.close();
        return;
        Exception exception;
        exception;
        zzvr1.close();
        throw exception;
    }

    public void run()
    {
        if (zzazN == null)
        {
            throw new IllegalStateException("callback must be set before execute");
        } else
        {
            zzazN.zzsR();
            zztB();
            return;
        }
    }

    void zza(zzbe zzbe1)
    {
        zzazN = zzbe1;
    }

    void zzcT(String s)
    {
        if (s == null)
        {
            zzaxT = zzazM;
            return;
        } else
        {
            zzbf.zzY((new StringBuilder("Setting CTFE URL path: ")).append(s).toString());
            zzaxT = s;
            return;
        }
    }

    void zzdg(String s)
    {
        zzbf.zzY((new StringBuilder("Setting previous container version: ")).append(s).toString());
        zzazP = s;
    }

    String zztC()
    {
        String s1 = (new StringBuilder()).append(zzazO.zzsT()).append(zzaxT).append("&v=a65833898").toString();
        String s = s1;
        if (zzazP != null)
        {
            s = s1;
            if (!zzazP.trim().equals(""))
            {
                s = (new StringBuilder()).append(s1).append("&pv=").append(zzazP).toString();
            }
        }
        s1 = s;
        if (zzca.zztx().zzty().equals(zzca.zza.zzazD))
        {
            s1 = (new StringBuilder()).append(s).append("&gtm_debug=x").toString();
        }
        return s1;
    }
}
