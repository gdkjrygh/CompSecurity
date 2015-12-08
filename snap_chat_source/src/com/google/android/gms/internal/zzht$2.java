// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal:
//            zzht, zzhx

class zzzD
    implements Callable
{

    final String zzzC;
    final a zzzD;
    final zzht zzzE;

    public Object call()
    {
        Object obj;
        HttpURLConnection httpurlconnection;
        Object obj2;
        obj2 = null;
        obj = null;
        httpurlconnection = null;
        HttpURLConnection httpurlconnection1 = zzzE.zzW(zzzC);
        httpurlconnection = httpurlconnection1;
        obj2 = httpurlconnection1;
        obj = httpurlconnection1;
        httpurlconnection1.connect();
        httpurlconnection = httpurlconnection1;
        obj2 = httpurlconnection1;
        obj = httpurlconnection1;
        int i = httpurlconnection1.getResponseCode();
        if (i < 200 || i > 299)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        httpurlconnection = httpurlconnection1;
        obj2 = httpurlconnection1;
        obj = httpurlconnection1;
        Object obj3 = zzzD.zzb(httpurlconnection1.getInputStream());
        if (httpurlconnection1 != null)
        {
            httpurlconnection1.disconnect();
        }
        return obj3;
        if (httpurlconnection1 != null)
        {
            httpurlconnection1.disconnect();
        }
_L2:
        return zzzD.zzdQ();
        obj2;
        obj = httpurlconnection;
        zzhx.zzd("Error making HTTP request.", ((Throwable) (obj2)));
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
        }
        continue; /* Loop/switch isn't completed */
        Object obj1;
        obj1;
        obj = obj2;
        zzhx.zzd("Error making HTTP request.", ((Throwable) (obj1)));
        if (obj2 != null)
        {
            ((HttpURLConnection) (obj2)).disconnect();
        }
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
        throw obj1;
    }

    a(zzht zzht1, String s, a a)
    {
        zzzE = zzht1;
        zzzC = s;
        zzzD = a;
        super();
    }
}
