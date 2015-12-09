// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class cli extends ckx
{

    public cli(ckw ckw1, boolean flag)
    {
        super(ckw1, flag);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webview, String s)
    {
        ckx ckx1;
        if (!"mraid.js".equalsIgnoreCase((new File(s)).getName()))
        {
            return super.shouldInterceptRequest(webview, s);
        }
        if (!(webview instanceof ckw))
        {
            bka.e("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return super.shouldInterceptRequest(webview, s);
        }
        obj1 = (ckw)webview;
        ckx1 = ((ckw) (obj1)).k();
        synchronized (ckx1.c)
        {
            ckx1.f = false;
            ckx1.g = true;
            cjj.a(new ckx._cls1(ckx1));
        }
        if (!((ckw) (obj1)).j().e) goto _L2; else goto _L1
_L1:
        obj = cbb.t;
        obj = (String)bkv.n().a(((cax) (obj)));
_L3:
        bka.d((new StringBuilder("shouldInterceptRequest(")).append(((String) (obj))).append(")").toString());
        Object obj2 = ((ckw) (obj1)).getContext();
        String s1 = a.n().b;
        obj1 = new HashMap();
        ((Map) (obj1)).put("User-Agent", bkv.e().a(((android.content.Context) (obj2)), s1));
        ((Map) (obj1)).put("Cache-Control", "max-stale=3600");
        new cjx(((android.content.Context) (obj2)));
        obj2 = new cka((byte)0);
        obj = new cjx._cls3(((String) (obj)), ((cnd) (obj2)), new cjx._cls2(((String) (obj)), ((cka) (obj2))), ((Map) (obj1)));
        cjx.a.a(((com.google.android.gms.internal.zzk) (obj)));
        obj = (String)((ckk) (obj2)).get(60L, TimeUnit.SECONDS);
        if (obj == null)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_367;
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
        bka.e((new StringBuilder("Could not fetch MRAID JS. ")).append(((Exception) (obj)).getMessage()).toString());
        return super.shouldInterceptRequest(webview, s);
_L2:
label0:
        {
            if (!((ckw) (obj1)).o())
            {
                break label0;
            }
            obj = cbb.s;
            obj = (String)bkv.n().a(((cax) (obj)));
        }
          goto _L3
        obj = cbb.r;
        obj = (String)bkv.n().a(((cax) (obj)));
          goto _L3
        obj = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(((String) (obj)).getBytes("UTF-8")));
        return ((WebResourceResponse) (obj));
    }
}
