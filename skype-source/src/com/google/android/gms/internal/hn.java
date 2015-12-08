// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.android.gms.internal:
//            hj, hi, ay, ax, 
//            gm, gq, ha

public final class hn extends hj
{

    public hn(hi hi1, boolean flag)
    {
        super(hi1, flag);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webview, String s)
    {
        Object obj2;
        if (!"mraid.js".equalsIgnoreCase((new File(s)).getName()))
        {
            return super.shouldInterceptRequest(webview, s);
        }
        if (!(webview instanceof hi))
        {
            b.c("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return super.shouldInterceptRequest(webview, s);
        }
        obj2 = (hi)webview;
        ((hi) (obj2)).j().g();
        if (!((hi) (obj2)).i().e) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = ay.F;
        obj = (String)p.n().a(((au) (obj)));
_L3:
        (new StringBuilder("shouldInterceptRequest(")).append(((String) (obj))).append(")");
        b.a(2);
        obj2 = ((hi) (obj2)).getContext();
        String s1 = a.m().b;
        HashMap hashmap = new HashMap();
        hashmap.put("User-Agent", p.e().a(((android.content.Context) (obj2)), s1));
        hashmap.put("Cache-Control", "max-stale=3600");
        obj = (String)(new gq(((android.content.Context) (obj2)))).a(((String) (obj)), hashmap).get(60L, TimeUnit.SECONDS);
        if (obj == null)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_259;
_L2:
label0:
        {
            if (!((hi) (obj2)).n())
            {
                break label0;
            }
            obj = ay.E;
            obj = (String)p.n().a(((au) (obj)));
        }
          goto _L3
        obj = ay.D;
        obj = (String)p.n().a(((au) (obj)));
          goto _L3
        obj = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(((String) (obj)).getBytes("UTF-8")));
        return ((WebResourceResponse) (obj));
        Object obj1;
        obj1;
_L5:
        b.c((new StringBuilder("Could not fetch MRAID JS. ")).append(((Exception) (obj1)).getMessage()).toString());
        return super.shouldInterceptRequest(webview, s);
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
