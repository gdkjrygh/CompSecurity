// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal:
//            gr, cn, fv, fj, 
//            fs, fh, av, fr, 
//            bm, gq, fu, fw, 
//            gs, ft, gi, ay, 
//            gu, gv, cc

public final class fq extends fl.a
{

    private static final Object ut = new Object();
    private static fq uu;
    private final Context mContext;
    private final fw uv;
    private final cn uw;
    private final bm ux;

    fq(Context context, bm bm1, cn cn1, fw fw1)
    {
        mContext = context;
        uv = fw1;
        uw = cn1;
        ux = bm1;
    }

    private static gv.a I(String s)
    {
        return new gv.a(s) {

            final String uC;

            public void a(gu gu1)
            {
                String s1 = String.format("javascript:%s(%s);", new Object[] {
                    "AFMA_buildAdURL", uC
                });
                gr.V((new StringBuilder()).append("About to execute: ").append(s1).toString());
                gu1.loadUrl(s1);
            }

            
            {
                uC = s;
                super();
            }
        };
    }

    private static fj a(Context context, bm bm1, cn cn1, fw fw1, fh fh1)
    {
        fs fs1;
        gr.S("Starting ad request from service.");
        cn1.init();
        fv fv1 = new fv(context);
        if (fv1.vr == -1)
        {
            gr.S("Device is offline.");
            return new fj(2);
        }
        fs1 = new fs(fh1.applicationInfo.packageName);
        if (fh1.tL.extras != null)
        {
            String s = fh1.tL.extras.getString("_ad");
            if (s != null)
            {
                return fr.a(context, fh1, s);
            }
        }
        android.location.Location location = cn1.a(250L);
        cn1 = bm1.bu();
        bm1 = fr.a(fh1, fv1, location, bm1.bv(), bm1.bw(), bm1.bx());
        if (bm1 == null)
        {
            return new fj(0);
        }
        bm1 = I(bm1);
        gq.wR.post(new Runnable(context, fh1, fs1, bm1, cn1) {

            final Context nf;
            final gv.a uA;
            final String uB;
            final fh uy;
            final fs uz;

            public void run()
            {
                gu gu1 = gu.a(nf, new ay(), false, false, null, uy.lO);
                gu1.setWillNotDraw(true);
                uz.b(gu1);
                gv gv1 = gu1.dD();
                gv1.a("/invalidRequest", uz.uG);
                gv1.a("/loadAdURL", uz.uH);
                gv1.a("/log", cc.pX);
                gv1.a(uA);
                gr.S("Loading the JS library.");
                gu1.loadUrl(uB);
            }

            
            {
                nf = context;
                uy = fh1;
                uz = fs1;
                uA = a1;
                uB = s;
                super();
            }
        });
        cn1 = (fu)fs1.cR().get(10L, TimeUnit.SECONDS);
        if (cn1 != null)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        context = new fj(0);
        gq.wR.post(new Runnable(fs1) {

            final fs uz;

            public void run()
            {
                uz.cS();
            }

            
            {
                uz = fs1;
                super();
            }
        });
        return context;
        context;
        context = new fj(0);
        gq.wR.post(new _cls2(fs1));
        return context;
        if (cn1.getErrorCode() == -2)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        context = new fj(cn1.getErrorCode());
        gq.wR.post(new _cls2(fs1));
        return context;
        bm1 = null;
        if (cn1.cV())
        {
            bm1 = fw1.K(fh1.tM.packageName);
        }
        context = a(context, fh1.lO.wS, cn1.getUrl(), ((String) (bm1)), ((fu) (cn1)));
        gq.wR.post(new _cls2(fs1));
        return context;
        context;
        gq.wR.post(new _cls2(fs1));
        throw context;
    }

    public static fj a(Context context, String s, String s1, String s2, fu fu1)
    {
        HttpURLConnection httpurlconnection;
        ft ft1;
        byte abyte0[];
        Map map;
        BufferedOutputStream bufferedoutputstream;
        int i;
        int j;
        long l;
        try
        {
            ft1 = new ft();
            gr.S((new StringBuilder()).append("AdRequestServiceImpl: Sending request: ").append(s1).toString());
            s1 = new URL(s1);
            l = SystemClock.elapsedRealtime();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            gr.W((new StringBuilder()).append("Error while connecting to ad server: ").append(context.getMessage()).toString());
            return new fj(2);
        }
        i = 0;
        httpurlconnection = (HttpURLConnection)s1.openConnection();
        gi.a(context, s, false, httpurlconnection);
        if (!TextUtils.isEmpty(s2))
        {
            httpurlconnection.addRequestProperty("x-afma-drt-cookie", s2);
        }
        if (fu1 == null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        if (!TextUtils.isEmpty(fu1.cU()))
        {
            httpurlconnection.setDoOutput(true);
            abyte0 = fu1.cU().getBytes();
            httpurlconnection.setFixedLengthStreamingMode(abyte0.length);
            bufferedoutputstream = new BufferedOutputStream(httpurlconnection.getOutputStream());
            bufferedoutputstream.write(abyte0);
            bufferedoutputstream.close();
        }
        j = httpurlconnection.getResponseCode();
        map = httpurlconnection.getHeaderFields();
        if (j < 200 || j >= 300)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        context = s1.toString();
        s = gi.a(new InputStreamReader(httpurlconnection.getInputStream()));
        a(((String) (context)), map, s, j);
        ft1.a(context, map, s);
        context = ft1.i(l);
        httpurlconnection.disconnect();
        return context;
        a(s1.toString(), map, ((String) (null)), j);
        if (j < 300 || j >= 400)
        {
            break MISSING_BLOCK_LABEL_340;
        }
        s1 = httpurlconnection.getHeaderField("Location");
        if (!TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_297;
        }
        gr.W("No location header to follow redirect.");
        context = new fj(0);
        httpurlconnection.disconnect();
        return context;
        s1 = new URL(s1);
        i++;
        if (i <= 5)
        {
            break MISSING_BLOCK_LABEL_380;
        }
        gr.W("Too many redirects.");
        context = new fj(0);
        httpurlconnection.disconnect();
        return context;
        gr.W((new StringBuilder()).append("Received error HTTP response code: ").append(j).toString());
        context = new fj(0);
        httpurlconnection.disconnect();
        return context;
        ft1.e(map);
        httpurlconnection.disconnect();
        break MISSING_BLOCK_LABEL_48;
        context;
        httpurlconnection.disconnect();
        throw context;
    }

    public static fq a(Context context, bm bm1, cn cn1, fw fw1)
    {
        synchronized (ut)
        {
            if (uu == null)
            {
                uu = new fq(context.getApplicationContext(), bm1, cn1, fw1);
            }
            context = uu;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static void a(String s, Map map, String s1, int i)
    {
        if (gr.v(2))
        {
            gr.V((new StringBuilder()).append("Http Response: {\n  URL:\n    ").append(s).append("\n  Headers:").toString());
            if (map != null)
            {
                for (s = map.keySet().iterator(); s.hasNext();)
                {
                    Object obj = (String)s.next();
                    gr.V((new StringBuilder()).append("    ").append(((String) (obj))).append(":").toString());
                    obj = ((List)map.get(obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        String s2 = (String)((Iterator) (obj)).next();
                        gr.V((new StringBuilder()).append("      ").append(s2).toString());
                    }
                }

            }
            gr.V("  Body:");
            if (s1 != null)
            {
                for (int j = 0; j < Math.min(s1.length(), 0x186a0); j += 1000)
                {
                    gr.V(s1.substring(j, Math.min(s1.length(), j + 1000)));
                }

            } else
            {
                gr.V("    null");
            }
            gr.V((new StringBuilder()).append("  Response Code:\n    ").append(i).append("\n}").toString());
        }
    }

    public fj b(fh fh1)
    {
        return a(mContext, ux, uw, uv, fh1);
    }

}
