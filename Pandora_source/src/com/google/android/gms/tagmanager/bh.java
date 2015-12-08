// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzmw;
import com.google.android.gms.internal.zzmx;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbg, zzbf, cn, ax

class bh
    implements Runnable
{

    private final Context a;
    private final zzmx b;
    private final String c;
    private final String d;
    private zzbf e;
    private volatile cn f;
    private volatile String g;
    private volatile String h;

    bh(Context context, String s, zzmx zzmx1, cn cn1)
    {
        a = context;
        b = zzmx1;
        c = s;
        f = cn1;
        d = (new StringBuilder()).append("/r?id=").append(s).toString();
        g = d;
        h = null;
    }

    public bh(Context context, String s, cn cn1)
    {
        this(context, s, new zzmx(), cn1);
    }

    private boolean b()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            zzbg.zzam("...no network connectivity");
            return false;
        } else
        {
            return true;
        }
    }

    private void c()
    {
        zzmw zzmw1;
        String s;
        if (!b())
        {
            e.a(zzbf.zza.zzaDU);
            return;
        }
        zzbg.zzam("Start loading resource from network ...");
        s = a();
        zzmw1 = b.zzyM();
        Object obj = zzmw1.zzev(s);
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        zzmq.zzc(((java.io.InputStream) (obj)), bytearrayoutputstream);
        obj = com.google.android.gms.internal.zzc.zzj.zzb(bytearrayoutputstream.toByteArray());
        zzbg.zzam((new StringBuilder()).append("Successfully loaded supplemented resource: ").append(obj).toString());
        if (((com.google.android.gms.internal.zzc.zzj) (obj)).zzhh == null && ((com.google.android.gms.internal.zzc.zzj) (obj)).zzhg.length == 0)
        {
            zzbg.zzam((new StringBuilder()).append("No change for container: ").append(c).toString());
        }
        e.a(obj);
        zzmw1.close();
        zzbg.zzam("Load resource from network finished.");
        return;
        Object obj1;
        obj1;
        zzbg.zzan((new StringBuilder()).append("No data is retrieved from the given url: ").append(s).append(". Make sure container_id: ").append(c).append(" is correct.").toString());
        e.a(zzbf.zza.zzaDW);
        zzmw1.close();
        return;
        obj1;
        zzbg.zzd((new StringBuilder()).append("Error when loading resources from url: ").append(s).append(" ").append(((IOException) (obj1)).getMessage()).toString(), ((Throwable) (obj1)));
        e.a(zzbf.zza.zzaDV);
        zzmw1.close();
        return;
        obj1;
        zzbg.zzd((new StringBuilder()).append("Error when parsing downloaded resources from url: ").append(s).append(" ").append(((IOException) (obj1)).getMessage()).toString(), ((Throwable) (obj1)));
        e.a(zzbf.zza.zzaDW);
        zzmw1.close();
        return;
        Exception exception;
        exception;
        zzmw1.close();
        throw exception;
    }

    String a()
    {
        String s1 = (new StringBuilder()).append(f.a()).append(g).append("&v=a65833898").toString();
        String s = s1;
        if (h != null)
        {
            s = s1;
            if (!h.trim().equals(""))
            {
                s = (new StringBuilder()).append(s1).append("&pv=").append(h).toString();
            }
        }
        s1 = s;
        if (ax.a().b().equals(ax.a.c))
        {
            s1 = (new StringBuilder()).append(s).append("&gtm_debug=x").toString();
        }
        return s1;
    }

    void a(zzbf zzbf1)
    {
        e = zzbf1;
    }

    void a(String s)
    {
        if (s == null)
        {
            g = d;
            return;
        } else
        {
            zzbg.zzaj((new StringBuilder()).append("Setting CTFE URL path: ").append(s).toString());
            g = s;
            return;
        }
    }

    void b(String s)
    {
        zzbg.zzaj((new StringBuilder()).append("Setting previous container version: ").append(s).toString());
        h = s;
    }

    public void run()
    {
        if (e == null)
        {
            throw new IllegalStateException("callback must be set before execute");
        } else
        {
            e.a();
            c();
            return;
        }
    }
}
