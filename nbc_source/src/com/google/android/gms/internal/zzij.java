// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.android.gms.internal:
//            zzie, zzid, zzbz, zzbv, 
//            zzhl, zzho, zzhv

public class zzij extends zzie
{

    public zzij(zzid zzid1, boolean flag)
    {
        super(zzid1, flag);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webview, String s)
    {
        String s1;
label0:
        {
            if (!"mraid.js".equalsIgnoreCase((new File(s)).getName()))
            {
                return super.shouldInterceptRequest(webview, s);
            }
            if (!(webview instanceof zzid))
            {
                zzb.zzaC("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return super.shouldInterceptRequest(webview, s);
            }
            zzid zzid1 = (zzid)webview;
            zzid1.zzgF().zzet();
            if (zzid1.zzaN().zzsn)
            {
                s1 = (String)zzbz.zztX.get();
            } else
            {
                if (!zzid1.zzgJ())
                {
                    break label0;
                }
                s1 = (String)zzbz.zztW.get();
            }
        }
_L1:
        zzb.zzaB((new StringBuilder()).append("shouldInterceptRequest(").append(s1).append(")").toString());
        return zzd(zzid1.getContext(), zzoA.zzgI().zzGG, s1);
        s1 = (String)zzbz.zztV.get();
          goto _L1
        Object obj;
        obj;
_L3:
        zzb.zzaC((new StringBuilder()).append("Could not fetch MRAID JS. ").append(((Exception) (obj)).getMessage()).toString());
        return super.shouldInterceptRequest(webview, s);
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L3; else goto _L2
_L2:
    }

    protected WebResourceResponse zzd(Context context, String s, String s1)
        throws IOException, ExecutionException, InterruptedException, TimeoutException
    {
        HashMap hashmap = new HashMap();
        hashmap.put("User-Agent", zzo.zzbv().zzf(context, s));
        hashmap.put("Cache-Control", "max-stale=3600");
        context = (String)(new zzho(context)).zzb(s1, hashmap).get(60L, TimeUnit.SECONDS);
        if (context == null)
        {
            return null;
        } else
        {
            return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(context.getBytes("UTF-8")));
        }
    }
}
