// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.internal:
//            zzid, zzic, zzhx, zzba, 
//            zzca, zzbx, zzhy, zzab, 
//            zzho

public class zzih extends zzid
{

    public zzih(zzic zzic1, boolean flag)
    {
        super(zzic1, flag);
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
            if (!(webview instanceof zzic))
            {
                zzhx.zzac("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return super.shouldInterceptRequest(webview, s);
            }
            zzic zzic1 = (zzic)webview;
            zzic1.zzeG().zzde();
            if (zzic1.zzad().zzpb)
            {
                s1 = (String)zzca.zzqx.get();
            } else
            {
                if (!zzic1.zzeK())
                {
                    break label0;
                }
                s1 = (String)zzca.zzqw.get();
            }
        }
_L1:
        zzhx.zzab((new StringBuilder("shouldInterceptRequest(")).append(s1).append(")").toString());
        return zzd(zzic1.getContext(), zzmu.zzeJ().zzzH, s1);
        try
        {
            s1 = (String)zzca.zzqv.get();
        }
        catch (IOException ioexception)
        {
            zzhx.zzac((new StringBuilder("Could not fetch MRAID JS. ")).append(ioexception.getMessage()).toString());
            return super.shouldInterceptRequest(webview, s);
        }
          goto _L1
    }

    protected WebResourceResponse zzd(Context context, String s, String s1)
    {
        s1 = (HttpURLConnection)(new URL(s1)).openConnection();
        zzab.zzaM().zza(context, s, true, s1, true);
        s1.addRequestProperty("Cache-Control", "max-stale=3600");
        s1.connect();
        context = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(zzab.zzaM().zza(new InputStreamReader(s1.getInputStream())).getBytes("UTF-8")));
        s1.disconnect();
        return context;
        context;
        s1.disconnect();
        throw context;
    }
}
