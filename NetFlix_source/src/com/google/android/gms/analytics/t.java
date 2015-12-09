// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.internal.ef;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.android.gms.analytics:
//            f, aa, ak, a, 
//            m, g, ag, s, 
//            h, GoogleAnalytics, u, y

class t extends Thread
    implements f
{

    private static t tA;
    private volatile boolean mClosed;
    private final Context mContext;
    private volatile String su;
    private volatile ag tB;
    private final LinkedBlockingQueue tw = new LinkedBlockingQueue();
    private volatile boolean tx;
    private volatile List ty;
    private volatile String tz;

    private t(Context context)
    {
        super("GAThread");
        tx = false;
        mClosed = false;
        if (context != null)
        {
            mContext = context.getApplicationContext();
        } else
        {
            mContext = context;
        }
        start();
    }

    static int H(String s1)
    {
        int k = 1;
        if (!TextUtils.isEmpty(s1))
        {
            int j = s1.length();
            int i = 0;
            j--;
            do
            {
                k = i;
                if (j < 0)
                {
                    break;
                }
                k = s1.charAt(j);
                k = (i << 6 & 0xfffffff) + k + (k << 14);
                int l = 0xfe00000 & k;
                i = k;
                if (l != 0)
                {
                    i = k ^ l >> 21;
                }
                j--;
            } while (true);
        }
        return k;
    }

    static String a(t t1)
    {
        return t1.su;
    }

    static String a(t t1, String s1)
    {
        t1.tz = s1;
        return s1;
    }

    private String a(Throwable throwable)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(bytearrayoutputstream);
        throwable.printStackTrace(printstream);
        printstream.flush();
        return new String(bytearrayoutputstream.toByteArray());
    }

    static boolean a(t t1, Map map)
    {
        return t1.s(map);
    }

    static Context b(t t1)
    {
        return t1.mContext;
    }

    static void b(t t1, Map map)
    {
        t1.u(map);
    }

    static String c(t t1)
    {
        return t1.tz;
    }

    static void c(t t1, Map map)
    {
        t1.t(map);
    }

    static String d(t t1, Map map)
    {
        return t1.r(map);
    }

    static List d(t t1)
    {
        return t1.ty;
    }

    static ag e(t t1)
    {
        return t1.tB;
    }

    static t q(Context context)
    {
        if (tA == null)
        {
            tA = new t(context);
        }
        return tA;
    }

    static String r(Context context)
    {
        Object obj;
        byte abyte0[];
        int i;
        obj = context.openFileInput("gaInstallData");
        abyte0 = new byte[8192];
        i = ((FileInputStream) (obj)).read(abyte0, 0, 8192);
        if (((FileInputStream) (obj)).available() <= 0)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        aa.w("Too much campaign data, ignoring it.");
        ((FileInputStream) (obj)).close();
        context.deleteFile("gaInstallData");
        return null;
        try
        {
            ((FileInputStream) (obj)).close();
            context.deleteFile("gaInstallData");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            aa.x("No campaign data found.");
            return null;
        }
        catch (IOException ioexception)
        {
            aa.w("Error reading campaign data.");
            context.deleteFile("gaInstallData");
            return null;
        }
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        aa.z("Campaign file is empty.");
        return null;
        obj = new String(abyte0, 0, i);
        aa.x((new StringBuilder()).append("Campaign found: ").append(((String) (obj))).toString());
        return ((String) (obj));
    }

    private String r(Map map)
    {
        if (map.containsKey("useSecure"))
        {
            if (ak.d((String)map.get("useSecure"), true))
            {
                return "https:";
            } else
            {
                return "http:";
            }
        } else
        {
            return "https:";
        }
    }

    private boolean s(Map map)
    {
        if (map.get("&sf") == null)
        {
            return false;
        }
        double d1 = ak.a((String)map.get("&sf"), 100D);
        if (d1 >= 100D)
        {
            return false;
        }
        if ((double)(H((String)map.get("&cid")) % 10000) >= d1 * 100D)
        {
            if (map.get("&t") == null)
            {
                map = "unknown";
            } else
            {
                map = (String)map.get("&t");
            }
            aa.y(String.format("%s hit sampled out", new Object[] {
                map
            }));
            return true;
        } else
        {
            return false;
        }
    }

    private void t(Map map)
    {
        m m1 = com.google.android.gms.analytics.a.m(mContext);
        ak.a(map, "&adid", m1.getValue("&adid"));
        ak.a(map, "&ate", m1.getValue("&ate"));
    }

    private void u(Map map)
    {
        g g1 = g.ca();
        ak.a(map, "&an", g1.getValue("&an"));
        ak.a(map, "&av", g1.getValue("&av"));
        ak.a(map, "&aid", g1.getValue("&aid"));
        ak.a(map, "&aiid", g1.getValue("&aiid"));
        map.put("&v", "1");
    }

    void a(Runnable runnable)
    {
        tw.add(runnable);
    }

    public void bR()
    {
        a(new Runnable() {

            final t tD;

            public void run()
            {
                t.e(tD).bR();
            }

            
            {
                tD = t.this;
                super();
            }
        });
    }

    public void bW()
    {
        a(new Runnable() {

            final t tD;

            public void run()
            {
                t.e(tD).bW();
            }

            
            {
                tD = t.this;
                super();
            }
        });
    }

    public void bY()
    {
        a(new Runnable() {

            final t tD;

            public void run()
            {
                t.e(tD).bY();
            }

            
            {
                tD = t.this;
                super();
            }
        });
    }

    public LinkedBlockingQueue bZ()
    {
        return tw;
    }

    public Thread getThread()
    {
        return this;
    }

    protected void init()
    {
        tB.cp();
        ty = new ArrayList();
        ty.add(new ef("appendVersion", "&_v".substring(1), "ma4.0.1"));
        ty.add(new ef("appendQueueTime", "&qt".substring(1), null));
        ty.add(new ef("appendCacheBuster", "&z".substring(1), null));
    }

    public void q(Map map)
    {
        String s1;
        HashMap hashmap;
        hashmap = new HashMap(map);
        s1 = (String)map.get("&ht");
        map = s1;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        Long.valueOf(s1);
        map = s1;
_L2:
        if (map == null)
        {
            hashmap.put("&ht", Long.toString(System.currentTimeMillis()));
        }
        a(new Runnable(hashmap) {

            final Map tC;
            final t tD;

            public void run()
            {
                if (TextUtils.isEmpty((CharSequence)tC.get("&cid")))
                {
                    tC.put("&cid", t.a(tD));
                }
                if (GoogleAnalytics.getInstance(t.b(tD)).getAppOptOut() || t.a(tD, tC))
                {
                    return;
                }
                if (!TextUtils.isEmpty(t.c(tD)))
                {
                    com.google.android.gms.analytics.u.cy().t(true);
                    tC.putAll((new HitBuilders.HitBuilder()).setCampaignParamsFromUrl(t.c(tD)).build());
                    com.google.android.gms.analytics.u.cy().t(false);
                    t.a(tD, null);
                }
                t.b(tD, tC);
                t.c(tD, tC);
                Map map1 = y.v(tC);
                t.e(tD).b(map1, Long.valueOf((String)tC.get("&ht")).longValue(), t.d(tD, tC), t.d(tD));
            }

            
            {
                tD = t.this;
                tC = map;
                super();
            }
        });
        return;
        map;
        map = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void run()
    {
        Process.setThreadPriority(10);
        Runnable runnable;
        Object obj;
        try
        {
            Thread.sleep(5000L);
        }
        catch (InterruptedException interruptedexception)
        {
            aa.z("sleep interrupted in GAThread initialize");
        }
        try
        {
            if (tB == null)
            {
                tB = new s(mContext, this);
            }
            init();
            su = h.cb().getValue("&cid");
            if (su == null)
            {
                tx = true;
            }
            tz = r(mContext);
            aa.y("Initialized GA Thread");
        }
        catch (Throwable throwable)
        {
            aa.w((new StringBuilder()).append("Error initializing the GAThread: ").append(a(throwable)).toString());
            aa.w("Google Analytics will not start up.");
            tx = true;
        }
        if (mClosed)
        {
            break; /* Loop/switch isn't completed */
        }
        runnable = (Runnable)tw.take();
        if (!tx)
        {
            runnable.run();
        }
        continue; /* Loop/switch isn't completed */
        obj;
        try
        {
            aa.x(((InterruptedException) (obj)).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            aa.w((new StringBuilder()).append("Error on GAThread: ").append(a(((Throwable) (obj)))).toString());
            aa.w("Google Analytics is shutting down.");
            tx = true;
        }
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_79;
_L1:
    }
}
