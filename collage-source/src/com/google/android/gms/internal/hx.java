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
import com.google.android.gms.ads.internal.zzp;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.android.gms.internal:
//            ht, gw, ha, hk, 
//            hs, ay, au

public class hx extends ht
{

    public hx(hs hs1, boolean flag)
    {
        super(hs1, flag);
    }

    protected WebResourceResponse a(Context context, String s, String s1)
        throws IOException, ExecutionException, InterruptedException, TimeoutException
    {
        HashMap hashmap = new HashMap();
        hashmap.put("User-Agent", zzp.zzbx().a(context, s));
        hashmap.put("Cache-Control", "max-stale=3600");
        context = (String)(new ha(context)).a(s1, hashmap).get(60L, TimeUnit.SECONDS);
        if (context == null)
        {
            return null;
        } else
        {
            return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(context.getBytes("UTF-8")));
        }
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
            if (!(webview instanceof hs))
            {
                zzb.zzaE("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return super.shouldInterceptRequest(webview, s);
            }
            hs hs1 = (hs)webview;
            hs1.i().g();
            if (hs1.h().zzsH)
            {
                s1 = (String)ay.F.c();
            } else
            {
                if (!hs1.m())
                {
                    break label0;
                }
                s1 = (String)ay.E.c();
            }
        }
_L1:
        zzb.v((new StringBuilder()).append("shouldInterceptRequest(").append(s1).append(")").toString());
        return a(hs1.getContext(), a.l().zzIz, s1);
        s1 = (String)ay.D.c();
          goto _L1
        Object obj;
        obj;
_L3:
        zzb.zzaE((new StringBuilder()).append("Could not fetch MRAID JS. ").append(((Exception) (obj)).getMessage()).toString());
        return super.shouldInterceptRequest(webview, s);
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L3; else goto _L2
_L2:
    }
}
