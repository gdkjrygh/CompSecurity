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
//            zzja, ry, cy, cx, 
//            qa, qr, rl

public class zzjg extends zzja
{

    public zzjg(ry ry1, boolean flag)
    {
        super(ry1, flag);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webview, String s)
    {
        Object obj;
label0:
        {
            if (!"mraid.js".equalsIgnoreCase((new File(s)).getName()))
            {
                return super.shouldInterceptRequest(webview, s);
            }
            if (!(webview instanceof ry))
            {
                zzb.zzaH("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return super.shouldInterceptRequest(webview, s);
            }
            ry ry1 = (ry)webview;
            ry1.k().zzeG();
            if (ry1.j().zztf)
            {
                obj = cy.F;
                obj = (String)zzp.zzbE().a(((cq) (obj)));
            } else
            {
                if (!ry1.o())
                {
                    break label0;
                }
                obj = cy.E;
                obj = (String)zzp.zzbE().a(((cq) (obj)));
            }
        }
_L1:
        zzb.v((new StringBuilder("shouldInterceptRequest(")).append(((String) (obj))).append(")").toString());
        return zzd(ry1.getContext(), a.n().zzJu, ((String) (obj)));
        obj = cy.D;
        obj = (String)zzp.zzbE().a(((cq) (obj)));
          goto _L1
        Object obj1;
        obj1;
_L3:
        zzb.zzaH((new StringBuilder("Could not fetch MRAID JS. ")).append(((Exception) (obj1)).getMessage()).toString());
        return super.shouldInterceptRequest(webview, s);
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L3; else goto _L2
_L2:
    }

    protected WebResourceResponse zzd(Context context, String s, String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("User-Agent", zzp.zzbv().a(context, s));
        hashmap.put("Cache-Control", "max-stale=3600");
        context = (String)(new qr(context)).a(s1, hashmap).get(60L, TimeUnit.SECONDS);
        if (context == null)
        {
            return null;
        } else
        {
            return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(context.getBytes("UTF-8")));
        }
    }
}
