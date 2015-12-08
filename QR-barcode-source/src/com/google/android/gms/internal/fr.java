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
//            gs, ci, fw, fk, 
//            ft, fi, av, fs, 
//            bm, gr, fv, fx, 
//            gt, fu, gj, ay, 
//            gv, gw, bx

public final class fr extends fm.a
{

    private static final Object uf = new Object();
    private static fr ug;
    private final Context mContext;
    private final fx uh;
    private final ci ui;
    private final bm uj;

    fr(Context context, bm bm1, ci ci1, fx fx1)
    {
        mContext = context;
        uh = fx1;
        ui = ci1;
        uj = bm1;
    }

    private static gw.a I(String s)
    {
        return new gw.a(s) {

            final String uo;

            public void a(gv gv1)
            {
                String s1 = String.format("javascript:%s(%s);", new Object[] {
                    "AFMA_buildAdURL", uo
                });
                gs.V((new StringBuilder()).append("About to execute: ").append(s1).toString());
                gv1.loadUrl(s1);
            }

            
            {
                uo = s;
                super();
            }
        };
    }

    private static fk a(Context context, bm bm1, ci ci1, fx fx1, fi fi1)
    {
        gs.S("Starting ad request from service.");
        ci1.init();
        fw fw1 = new fw(context);
        if (fw1.vd == -1)
        {
            gs.S("Device is offline.");
            return new fk(2);
        }
        ft ft1 = new ft(fi1.applicationInfo.packageName);
        if (fi1.tx.extras != null)
        {
            String s = fi1.tx.extras.getString("_ad");
            if (s != null)
            {
                return fs.a(context, fi1, s);
            }
        }
        android.location.Location location = ci1.a(250L);
        ci1 = bm1.bp();
        bm1 = fs.a(fi1, fw1, location, bm1.bq(), bm1.br());
        if (bm1 == null)
        {
            return new fk(0);
        }
        bm1 = I(bm1);
        gr.wC.post(new Runnable(context, fi1, ft1, bm1, ci1) {

            final Context mV;
            final fi uk;
            final ft ul;
            final gw.a um;
            final String un;

            public void run()
            {
                gv gv1 = gv.a(mV, new ay(), false, false, null, uk.lD);
                gv1.setWillNotDraw(true);
                ul.b(gv1);
                gw gw1 = gv1.du();
                gw1.a("/invalidRequest", ul.us);
                gw1.a("/loadAdURL", ul.ut);
                gw1.a("/log", bx.pG);
                gw1.a(um);
                gs.S("Loading the JS library.");
                gv1.loadUrl(un);
            }

            
            {
                mV = context;
                uk = fi1;
                ul = ft1;
                um = a1;
                un = s;
                super();
            }
        });
        try
        {
            ci1 = (fv)ft1.cK().get(10L, TimeUnit.SECONDS);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new fk(0);
        }
        if (ci1 == null)
        {
            return new fk(0);
        }
        if (ci1.getErrorCode() != -2)
        {
            return new fk(ci1.getErrorCode());
        }
        bm1 = null;
        if (ci1.cN())
        {
            bm1 = fx1.K(fi1.ty.packageName);
        }
        return a(context, fi1.lD.wD, ci1.getUrl(), ((String) (bm1)), ((fv) (ci1)));
    }

    public static fk a(Context context, String s, String s1, String s2, fv fv1)
    {
        HttpURLConnection httpurlconnection;
        fu fu1;
        byte abyte0[];
        Map map;
        BufferedOutputStream bufferedoutputstream;
        int i;
        int j;
        long l;
        try
        {
            fu1 = new fu();
            gs.S((new StringBuilder()).append("AdRequestServiceImpl: Sending request: ").append(s1).toString());
            s1 = new URL(s1);
            l = SystemClock.elapsedRealtime();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            gs.W((new StringBuilder()).append("Error while connecting to ad server: ").append(context.getMessage()).toString());
            return new fk(2);
        }
        i = 0;
        httpurlconnection = (HttpURLConnection)s1.openConnection();
        gj.a(context, s, false, httpurlconnection);
        if (!TextUtils.isEmpty(s2))
        {
            httpurlconnection.addRequestProperty("x-afma-drt-cookie", s2);
        }
        if (fv1 == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        if (!TextUtils.isEmpty(fv1.cM()))
        {
            httpurlconnection.setDoOutput(true);
            abyte0 = fv1.cM().getBytes();
            httpurlconnection.setFixedLengthStreamingMode(abyte0.length);
            bufferedoutputstream = new BufferedOutputStream(httpurlconnection.getOutputStream());
            bufferedoutputstream.write(abyte0);
            bufferedoutputstream.close();
        }
        j = httpurlconnection.getResponseCode();
        map = httpurlconnection.getHeaderFields();
        if (j < 200 || j >= 300)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        context = s1.toString();
        s = gj.a(new InputStreamReader(httpurlconnection.getInputStream()));
        a(((String) (context)), map, s, j);
        fu1.a(context, map, s);
        context = fu1.i(l);
        httpurlconnection.disconnect();
        return context;
        a(s1.toString(), map, ((String) (null)), j);
        if (j < 300 || j >= 400)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        s1 = httpurlconnection.getHeaderField("Location");
        if (!TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_296;
        }
        gs.W("No location header to follow redirect.");
        context = new fk(0);
        httpurlconnection.disconnect();
        return context;
        s1 = new URL(s1);
        i++;
        if (i <= 5)
        {
            break MISSING_BLOCK_LABEL_379;
        }
        gs.W("Too many redirects.");
        context = new fk(0);
        httpurlconnection.disconnect();
        return context;
        gs.W((new StringBuilder()).append("Received error HTTP response code: ").append(j).toString());
        context = new fk(0);
        httpurlconnection.disconnect();
        return context;
        fu1.e(map);
        httpurlconnection.disconnect();
        break MISSING_BLOCK_LABEL_48;
        context;
        httpurlconnection.disconnect();
        throw context;
    }

    public static fr a(Context context, bm bm1, ci ci1, fx fx1)
    {
        synchronized (uf)
        {
            if (ug == null)
            {
                ug = new fr(context.getApplicationContext(), bm1, ci1, fx1);
            }
            context = ug;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static void a(String s, Map map, String s1, int i)
    {
        if (gs.u(2))
        {
            gs.V((new StringBuilder()).append("Http Response: {\n  URL:\n    ").append(s).append("\n  Headers:").toString());
            if (map != null)
            {
                for (s = map.keySet().iterator(); s.hasNext();)
                {
                    Object obj = (String)s.next();
                    gs.V((new StringBuilder()).append("    ").append(((String) (obj))).append(":").toString());
                    obj = ((List)map.get(obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        String s2 = (String)((Iterator) (obj)).next();
                        gs.V((new StringBuilder()).append("      ").append(s2).toString());
                    }
                }

            }
            gs.V("  Body:");
            if (s1 != null)
            {
                for (int j = 0; j < Math.min(s1.length(), 0x186a0); j += 1000)
                {
                    gs.V(s1.substring(j, Math.min(s1.length(), j + 1000)));
                }

            } else
            {
                gs.V("    null");
            }
            gs.V((new StringBuilder()).append("  Response Code:\n    ").append(i).append("\n}").toString());
        }
    }

    public fk b(fi fi1)
    {
        return a(mContext, uj, ui, uh, fi1);
    }

}
