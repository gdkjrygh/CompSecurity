// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.d;
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
//            cx, cw, cl, v, 
//            u, co, df, ct

public final class dd extends cx
{

    public dd(cw cw1, boolean flag)
    {
        super(cw1, flag);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webview, String s)
    {
        cx cx1;
        if (!"mraid.js".equalsIgnoreCase((new File(s)).getName()))
        {
            return super.shouldInterceptRequest(webview, s);
        }
        if (!(webview instanceof cw))
        {
            b.e("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return super.shouldInterceptRequest(webview, s);
        }
        obj1 = (cw)webview;
        cx1 = ((cw) (obj1)).i();
        synchronized (cx1.c)
        {
            cx1.i = false;
            cx1.k = true;
            cl.a(new cx._cls1(cx1));
        }
        if (!((cw) (obj1)).h().e) goto _L2; else goto _L1
_L1:
        obj = v.F;
        obj = (String)d.i().a(((r) (obj)));
_L3:
        b.d((new StringBuilder("shouldInterceptRequest(")).append(((String) (obj))).append(")").toString());
        Object obj2 = ((cw) (obj1)).getContext();
        Object obj3 = a.l().b;
        obj1 = new HashMap();
        ((Map) (obj1)).put("User-Agent", d.c().a(((android.content.Context) (obj2)), ((String) (obj3))));
        ((Map) (obj1)).put("Cache-Control", "max-stale=3600");
        obj3 = new co(((android.content.Context) (obj2)));
        obj2 = new co.b(((co) (obj3)), (byte)0);
        obj = new co._cls3(((co) (obj3)), ((String) (obj)), ((dv.b) (obj2)), new co._cls2(((co) (obj3)), ((String) (obj)), ((co.b) (obj2))), ((Map) (obj1)));
        co.a.a(((zzk) (obj)));
        obj = (String)((ct) (obj2)).get(60L, TimeUnit.SECONDS);
        if (obj == null)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_374;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        b.e((new StringBuilder("Could not fetch MRAID JS. ")).append(((Exception) (obj)).getMessage()).toString());
        return super.shouldInterceptRequest(webview, s);
_L2:
label0:
        {
            if (!((cw) (obj1)).m())
            {
                break label0;
            }
            obj = v.E;
            obj = (String)d.i().a(((r) (obj)));
        }
          goto _L3
        obj = v.D;
        obj = (String)d.i().a(((r) (obj)));
          goto _L3
        obj = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(((String) (obj)).getBytes("UTF-8")));
        return ((WebResourceResponse) (obj));
    }
}
