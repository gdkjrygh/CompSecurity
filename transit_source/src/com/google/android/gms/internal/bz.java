// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
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
//            cn, al, cd, bw, 
//            cb, ca, cm, bu, 
//            co, cc, ci, x, 
//            cq, cr, ah

public final class bz extends by.a
{

    private static final Object gL = new Object();
    private static bz gM;
    private final al gN;
    private final Context mContext;

    private bz(Context context, al al1)
    {
        mContext = context;
        gN = al1;
    }

    private static bw a(Context context, al al1, bu bu1)
    {
        cn.m("Starting ad request from service.");
        al1.init();
        cd cd1 = new cd(context);
        if (cd1.hs == -1)
        {
            cn.m("Device is offline.");
            return new bw(2);
        }
        cb cb1 = new cb();
        al1 = ca.a(bu1, cd1, al1.a(250L));
        if (al1 == null)
        {
            return new bw(0);
        }
        cm.hO.post(new Runnable(context, bu1, cb1, al1) {

            final Context gO;
            final bu gP;
            final cb gQ;
            final String gR;

            public void run()
            {
                cq cq1 = cq.a(gO, new x(), false, false, null, gP.eg);
                cq1.setWillNotDraw(true);
                gQ.b(cq1);
                cr cr1 = cq1.aw();
                cr1.a("/invalidRequest", gQ.gU);
                cr1.a("/loadAdURL", gQ.gV);
                cr1.a("/log", ah.eE);
                cn.m("Getting the ad request URL.");
                cq1.loadDataWithBaseURL("http://googleads.g.doubleclick.net", (new StringBuilder()).append("<!DOCTYPE html><html><head><script src=\"http://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-v40.js\"></script><script>AFMA_buildAdURL(").append(gR).append(");</script></head><body></body></html>").toString(), "text/html", "UTF-8", null);
            }

            
            {
                gO = context;
                gP = bu1;
                gQ = cb1;
                gR = s;
                super();
            }
        });
        al1 = cb1.aj();
        if (TextUtils.isEmpty(al1))
        {
            return new bw(cb1.getErrorCode());
        } else
        {
            return a(context, bu1.eg.hP, ((String) (al1)));
        }
    }

    private static bw a(Context context, String s, String s1)
    {
        HttpURLConnection httpurlconnection;
        cc cc1;
        Map map;
        int i;
        int j;
        try
        {
            cc1 = new cc();
            s1 = new URL(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            cn.q((new StringBuilder()).append("Error while connecting to ad server: ").append(context.getMessage()).toString());
            return new bw(2);
        }
        i = 0;
        httpurlconnection = (HttpURLConnection)s1.openConnection();
        ci.a(context, s, false, httpurlconnection);
        j = httpurlconnection.getResponseCode();
        map = httpurlconnection.getHeaderFields();
        if (j < 200 || j >= 300)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        context = s1.toString();
        s = ci.a(new InputStreamReader(httpurlconnection.getInputStream()));
        a(((String) (context)), map, s, j);
        cc1.a(context, map, s);
        context = cc1.ak();
        httpurlconnection.disconnect();
        return context;
        a(s1.toString(), map, null, j);
        if (j < 300 || j >= 400)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        s1 = httpurlconnection.getHeaderField("Location");
        if (!TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_176;
        }
        cn.q("No location header to follow redirect.");
        context = new bw(0);
        httpurlconnection.disconnect();
        return context;
        s1 = new URL(s1);
        i++;
        if (i <= 5)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        cn.q("Too many redirects.");
        context = new bw(0);
        httpurlconnection.disconnect();
        return context;
        cn.q((new StringBuilder()).append("Received error HTTP response code: ").append(j).toString());
        context = new bw(0);
        httpurlconnection.disconnect();
        return context;
        cc1.d(map);
        httpurlconnection.disconnect();
        break MISSING_BLOCK_LABEL_21;
        context;
        httpurlconnection.disconnect();
        throw context;
    }

    public static bz a(Context context, al al1)
    {
        synchronized (gL)
        {
            if (gM == null)
            {
                gM = new bz(context.getApplicationContext(), al1);
            }
            context = gM;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static void a(String s, Map map, String s1, int i)
    {
        if (cn.k(2))
        {
            cn.p((new StringBuilder()).append("Http Response: {\n  URL:\n    ").append(s).append("\n  Headers:").toString());
            if (map != null)
            {
                for (s = map.keySet().iterator(); s.hasNext();)
                {
                    Object obj = (String)s.next();
                    cn.p((new StringBuilder()).append("    ").append(((String) (obj))).append(":").toString());
                    obj = ((List)map.get(obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        String s2 = (String)((Iterator) (obj)).next();
                        cn.p((new StringBuilder()).append("      ").append(s2).toString());
                    }
                }

            }
            cn.p("  Body:");
            if (s1 != null)
            {
                for (int j = 0; j < Math.min(s1.length(), 0x186a0); j += 1000)
                {
                    cn.p(s1.substring(j, Math.min(s1.length(), j + 1000)));
                }

            } else
            {
                cn.p("    null");
            }
            cn.p((new StringBuilder()).append("  Response Code:\n    ").append(i).append("\n}").toString());
        }
    }

    public bw a(bu bu1)
    {
        return a(mContext, gN, bu1);
    }

}
