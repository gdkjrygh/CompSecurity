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

public final class kyn extends kxv
{

    public kyn(kxu kxu1, boolean flag)
    {
        super(kxu1, flag);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webview, String s)
    {
        kxv kxv1;
        if (!"mraid.js".equalsIgnoreCase((new File(s)).getName()))
        {
            return super.shouldInterceptRequest(webview, s);
        }
        if (!(webview instanceof kxu))
        {
            b.m("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return super.shouldInterceptRequest(webview, s);
        }
        obj1 = (kxu)webview;
        kxv1 = ((kxu) (obj1)).j();
        synchronized (kxv1.c)
        {
            kxv1.i = false;
            kxv1.k = true;
            kwz.a(new kxw(kxv1));
        }
        if (!((kxu) (obj1)).i().e) goto _L2; else goto _L1
_L1:
        obj = ktk.f;
        obj = (String)jqc.i().a(((ktd) (obj)));
_L3:
        (new StringBuilder("shouldInterceptRequest(")).append(((String) (obj))).append(")").toString();
        b.p(2);
        Object obj2 = ((kxu) (obj1)).getContext();
        Object obj3 = a.m().b;
        obj1 = new HashMap();
        ((Map) (obj1)).put("User-Agent", jqc.c().a(((android.content.Context) (obj2)), ((String) (obj3))));
        ((Map) (obj1)).put("Cache-Control", "max-stale=3600");
        obj3 = new kxm(((android.content.Context) (obj2)));
        obj2 = new kxp(((kxm) (obj3)));
        obj = new kxo(((kxm) (obj3)), ((String) (obj)), ((lac) (obj2)), new kxn(((kxm) (obj3)), ((String) (obj)), ((kxp) (obj2))), ((Map) (obj1)));
        kxm.a.a(((kyw) (obj)));
        obj = (String)((kxs) (obj2)).get(60L, TimeUnit.SECONDS);
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
        b.m((new StringBuilder("Could not fetch MRAID JS. ")).append(((Exception) (obj)).getMessage()).toString());
        return super.shouldInterceptRequest(webview, s);
_L2:
label0:
        {
            if (!((kxu) (obj1)).n())
            {
                break label0;
            }
            obj = ktk.e;
            obj = (String)jqc.i().a(((ktd) (obj)));
        }
          goto _L3
        obj = ktk.d;
        obj = (String)jqc.i().a(((ktd) (obj)));
          goto _L3
        obj = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(((String) (obj)).getBytes("UTF-8")));
        return ((WebResourceResponse) (obj));
    }
}
