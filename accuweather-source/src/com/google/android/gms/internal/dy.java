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

// Referenced classes of package com.google.android.gms.internal:
//            ev, bj, ed, dv, 
//            ea, dt, aj, dz, 
//            az, eu, ec, ee, 
//            ew, eb, ep, am, 
//            ey, ez, bc

public final class dy extends dx.a
{

    private static final Object qm = new Object();
    private static dy qn;
    private final Context mContext;
    private final ee qo;
    private final bj qp;
    private final az qq;

    dy(Context context, az az1, bj bj1, ee ee1)
    {
        mContext = context;
        qo = ee1;
        qp = bj1;
        qq = az1;
    }

    private static dv a(Context context, az az1, bj bj1, ee ee1, dt dt1)
    {
        ev.z("Starting ad request from service.");
        bj1.init();
        ed ed1 = new ed(context);
        if (ed1.rj == -1)
        {
            ev.z("Device is offline.");
            return new dv(2);
        }
        ea ea1 = new ea(dt1.applicationInfo.packageName);
        if (dt1.pV.extras != null)
        {
            String s1 = dt1.pV.extras.getString("_ad");
            if (s1 != null)
            {
                return dz.a(context, dt1, s1);
            }
        }
        android.location.Location location = bj1.a(250L);
        bj1 = az1.aI();
        az1 = dz.a(dt1, ed1, location, az1.aJ());
        if (az1 == null)
        {
            return new dv(0);
        }
        az1 = s(az1);
        eu.ss.post(new Runnable(context, dt1, ea1, az1, bj1) {

            final Context qr;
            final dt qs;
            final ea qt;
            final ez.a qu;
            final String qv;

            public void run()
            {
                ey ey1 = ey.a(qr, new am(), false, false, null, qs.kO);
                ey1.setWillNotDraw(true);
                qt.b(ey1);
                ez ez1 = ey1.bW();
                ez1.a("/invalidRequest", qt.qA);
                ez1.a("/loadAdURL", qt.qB);
                ez1.a("/log", bc.mX);
                ez1.a(qu);
                ev.z("Loading the JS library.");
                ey1.loadUrl(qv);
            }

            
            {
                qr = context;
                qs = dt1;
                qt = ea1;
                qu = a1;
                qv = s1;
                super();
            }
        });
        bj1 = ea1.bs();
        if (bj1 == null || TextUtils.isEmpty(bj1.getUrl()))
        {
            return new dv(ea1.getErrorCode());
        }
        az1 = null;
        if (bj1.bv())
        {
            az1 = ee1.u(dt1.pW.packageName);
        }
        return a(context, dt1.kO.st, bj1.getUrl(), ((String) (az1)), ((ec) (bj1)));
    }

    public static dv a(Context context, String s1, String s2, String s3, ec ec1)
    {
        HttpURLConnection httpurlconnection;
        eb eb1;
        byte abyte0[];
        Map map;
        BufferedOutputStream bufferedoutputstream;
        int i;
        int j;
        long l;
        try
        {
            eb1 = new eb();
            s2 = new URL(s2);
            l = SystemClock.elapsedRealtime();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ev.D((new StringBuilder()).append("Error while connecting to ad server: ").append(context.getMessage()).toString());
            return new dv(2);
        }
        i = 0;
        httpurlconnection = (HttpURLConnection)s2.openConnection();
        ep.a(context, s1, false, httpurlconnection);
        if (!TextUtils.isEmpty(s3))
        {
            httpurlconnection.addRequestProperty("x-afma-drt-cookie", s3);
        }
        if (ec1 == null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        if (!TextUtils.isEmpty(ec1.bu()))
        {
            httpurlconnection.setDoOutput(true);
            abyte0 = ec1.bu().getBytes();
            httpurlconnection.setFixedLengthStreamingMode(abyte0.length);
            bufferedoutputstream = new BufferedOutputStream(httpurlconnection.getOutputStream());
            bufferedoutputstream.write(abyte0);
            bufferedoutputstream.close();
        }
        j = httpurlconnection.getResponseCode();
        map = httpurlconnection.getHeaderFields();
        if (j < 200 || j >= 300)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        context = s2.toString();
        s1 = ep.a(new InputStreamReader(httpurlconnection.getInputStream()));
        a(((String) (context)), map, s1, j);
        eb1.a(context, map, s1);
        context = eb1.i(l);
        httpurlconnection.disconnect();
        return context;
        a(s2.toString(), map, ((String) (null)), j);
        if (j < 300 || j >= 400)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        s2 = httpurlconnection.getHeaderField("Location");
        if (!TextUtils.isEmpty(s2))
        {
            break MISSING_BLOCK_LABEL_274;
        }
        ev.D("No location header to follow redirect.");
        context = new dv(0);
        httpurlconnection.disconnect();
        return context;
        s2 = new URL(s2);
        i++;
        if (i <= 5)
        {
            break MISSING_BLOCK_LABEL_357;
        }
        ev.D("Too many redirects.");
        context = new dv(0);
        httpurlconnection.disconnect();
        return context;
        ev.D((new StringBuilder()).append("Received error HTTP response code: ").append(j).toString());
        context = new dv(0);
        httpurlconnection.disconnect();
        return context;
        eb1.d(map);
        httpurlconnection.disconnect();
        break MISSING_BLOCK_LABEL_26;
        context;
        httpurlconnection.disconnect();
        throw context;
    }

    public static dy a(Context context, az az1, bj bj1, ee ee1)
    {
        synchronized (qm)
        {
            if (qn == null)
            {
                qn = new dy(context.getApplicationContext(), az1, bj1, ee1);
            }
            context = qn;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static void a(String s1, Map map, String s2, int i)
    {
        if (ev.p(2))
        {
            ev.C((new StringBuilder()).append("Http Response: {\n  URL:\n    ").append(s1).append("\n  Headers:").toString());
            if (map != null)
            {
                for (s1 = map.keySet().iterator(); s1.hasNext();)
                {
                    Object obj = (String)s1.next();
                    ev.C((new StringBuilder()).append("    ").append(((String) (obj))).append(":").toString());
                    obj = ((List)map.get(obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        String s3 = (String)((Iterator) (obj)).next();
                        ev.C((new StringBuilder()).append("      ").append(s3).toString());
                    }
                }

            }
            ev.C("  Body:");
            if (s2 != null)
            {
                for (int j = 0; j < Math.min(s2.length(), 0x186a0); j += 1000)
                {
                    ev.C(s2.substring(j, Math.min(s2.length(), j + 1000)));
                }

            } else
            {
                ev.C("    null");
            }
            ev.C((new StringBuilder()).append("  Response Code:\n    ").append(i).append("\n}").toString());
        }
    }

    private static ez.a s(String s1)
    {
        return new ez.a(s1) {

            final String qw;

            public void a(ey ey1)
            {
                String s2 = String.format("javascript:%s(%s);", new Object[] {
                    "AFMA_buildAdURL", qw
                });
                ev.C((new StringBuilder()).append("About to execute: ").append(s2).toString());
                ey1.loadUrl(s2);
            }

            
            {
                qw = s1;
                super();
            }
        };
    }

    public dv b(dt dt1)
    {
        return a(mContext, qq, qp, qo, dt1);
    }

}
