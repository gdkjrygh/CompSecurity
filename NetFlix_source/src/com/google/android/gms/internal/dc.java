// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            dw, bf, dg, cz, 
//            de, cx, ah, dd, 
//            ax, dv, dx, df, 
//            dq, ak, dz, ea, 
//            ba

public final class dc extends db.a
{

    private static final Object px = new Object();
    private static dc py;
    private final Context mContext;
    private final ax pA;
    private final bf pz;

    private dc(Context context, ax ax1, bf bf1)
    {
        mContext = context;
        pz = bf1;
        pA = ax1;
    }

    private static cz a(Context context, ax ax1, bf bf1, cx cx1)
    {
        dw.v("Starting ad request from service.");
        bf1.init();
        dg dg1 = new dg(context);
        if (dg1.qk == -1)
        {
            dw.v("Device is offline.");
            return new cz(2);
        }
        de de1 = new de(cx1.applicationInfo.packageName);
        if (cx1.pg.extras != null)
        {
            String s = cx1.pg.extras.getString("_ad");
            if (s != null)
            {
                return dd.a(context, cx1, s);
            }
        }
        android.location.Location location = bf1.a(250L);
        bf1 = ax1.aH();
        ax1 = dd.a(cx1, dg1, location, ax1.aI());
        if (ax1 == null)
        {
            return new cz(0);
        }
        ax1 = p(ax1);
        dv.rp.post(new Runnable(context, cx1, de1, ax1, bf1) {

            final Context pB;
            final cx pC;
            final de pD;
            final ea.a pE;
            final String pF;

            public void run()
            {
                dz dz1 = dz.a(pB, new ak(), false, false, null, pC.kK);
                dz1.setWillNotDraw(true);
                pD.b(dz1);
                ea ea1 = dz1.bI();
                ea1.a("/invalidRequest", pD.pK);
                ea1.a("/loadAdURL", pD.pL);
                ea1.a("/log", ba.mM);
                ea1.a(pE);
                dw.v("Loading the JS library.");
                dz1.loadUrl(pF);
            }

            
            {
                pB = context;
                pC = cx1;
                pD = de1;
                pE = a1;
                pF = s;
                super();
            }
        });
        ax1 = de1.bj();
        if (TextUtils.isEmpty(ax1))
        {
            return new cz(de1.getErrorCode());
        } else
        {
            return a(context, cx1.kK.rq, ((String) (ax1)));
        }
    }

    public static cz a(Context context, String s, String s1)
    {
        HttpURLConnection httpurlconnection;
        df df1;
        Map map;
        int i;
        int j;
        long l;
        try
        {
            df1 = new df();
            s1 = new URL(s1);
            l = SystemClock.elapsedRealtime();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            dw.z((new StringBuilder()).append("Error while connecting to ad server: ").append(context.getMessage()).toString());
            return new cz(2);
        }
        i = 0;
        httpurlconnection = (HttpURLConnection)s1.openConnection();
        dq.a(context, s, false, httpurlconnection);
        j = httpurlconnection.getResponseCode();
        map = httpurlconnection.getHeaderFields();
        if (j < 200 || j >= 300)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        context = s1.toString();
        s = dq.a(new InputStreamReader(httpurlconnection.getInputStream()));
        a(((String) (context)), map, s, j);
        df1.a(context, map, s);
        context = df1.g(l);
        httpurlconnection.disconnect();
        return context;
        a(s1.toString(), map, ((String) (null)), j);
        if (j < 300 || j >= 400)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        s1 = httpurlconnection.getHeaderField("Location");
        if (!TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_183;
        }
        dw.z("No location header to follow redirect.");
        context = new cz(0);
        httpurlconnection.disconnect();
        return context;
        s1 = new URL(s1);
        i++;
        if (i <= 5)
        {
            break MISSING_BLOCK_LABEL_262;
        }
        dw.z("Too many redirects.");
        context = new cz(0);
        httpurlconnection.disconnect();
        return context;
        dw.z((new StringBuilder()).append("Received error HTTP response code: ").append(j).toString());
        context = new cz(0);
        httpurlconnection.disconnect();
        return context;
        df1.e(map);
        httpurlconnection.disconnect();
        break MISSING_BLOCK_LABEL_26;
        context;
        httpurlconnection.disconnect();
        throw context;
    }

    public static dc a(Context context, ax ax1, bf bf1)
    {
        synchronized (px)
        {
            if (py == null)
            {
                py = new dc(context.getApplicationContext(), ax1, bf1);
            }
            context = py;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static void a(String s, Map map, String s1, int i)
    {
        if (dw.n(2))
        {
            dw.y((new StringBuilder()).append("Http Response: {\n  URL:\n    ").append(s).append("\n  Headers:").toString());
            if (map != null)
            {
                for (s = map.keySet().iterator(); s.hasNext();)
                {
                    Object obj = (String)s.next();
                    dw.y((new StringBuilder()).append("    ").append(((String) (obj))).append(":").toString());
                    obj = ((List)map.get(obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        String s2 = (String)((Iterator) (obj)).next();
                        dw.y((new StringBuilder()).append("      ").append(s2).toString());
                    }
                }

            }
            dw.y("  Body:");
            if (s1 != null)
            {
                for (int j = 0; j < Math.min(s1.length(), 0x186a0); j += 1000)
                {
                    dw.y(s1.substring(j, Math.min(s1.length(), j + 1000)));
                }

            } else
            {
                dw.y("    null");
            }
            dw.y((new StringBuilder()).append("  Response Code:\n    ").append(i).append("\n}").toString());
        }
    }

    private static ea.a p(String s)
    {
        return new ea.a(s) {

            final String pG;

            public void a(dz dz1)
            {
                String s1 = String.format("javascript:%s(%s);", new Object[] {
                    "AFMA_buildAdURL", pG
                });
                dw.y((new StringBuilder()).append("About to execute: ").append(s1).toString());
                dz1.loadUrl(s1);
            }

            
            {
                pG = s;
                super();
            }
        };
    }

    public cz b(cx cx1)
    {
        return a(mContext, pA, pz, cx1);
    }

}
