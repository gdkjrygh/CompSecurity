// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.internal.fe;
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
//            f, ak, aa, a, 
//            m, g, ag, s, 
//            h, GoogleAnalytics, u, y

class t extends Thread
    implements f
{

    private static t uL;
    private volatile boolean mClosed;
    private final Context mContext;
    private final LinkedBlockingQueue uH = new LinkedBlockingQueue();
    private volatile boolean uI;
    private volatile List uJ;
    private volatile String uK;
    private volatile ag uM;

    private t(Context context)
    {
        super("GAThread");
        uI = false;
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

    static int O(String s1)
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

    static Context a(t t1)
    {
        return t1.mContext;
    }

    static String a(t t1, String s1)
    {
        t1.uK = s1;
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

    static void a(t t1, Map map)
    {
        t1.s(map);
    }

    static String b(t t1)
    {
        return t1.uK;
    }

    static boolean b(t t1, Map map)
    {
        return t1.r(map);
    }

    static List c(t t1)
    {
        return t1.uJ;
    }

    static void c(t t1, Map map)
    {
        t1.t(map);
    }

    static ag d(t t1)
    {
        return t1.uM;
    }

    static String d(t t1, Map map)
    {
        return t1.q(map);
    }

    private String q(Map map)
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

    private boolean r(Map map)
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
        if ((double)(O((String)map.get("&cid")) % 10000) >= d1 * 100D)
        {
            if (map.get("&t") == null)
            {
                map = "unknown";
            } else
            {
                map = (String)map.get("&t");
            }
            aa.C(String.format("%s hit sampled out", new Object[] {
                map
            }));
            return true;
        } else
        {
            return false;
        }
    }

    private void s(Map map)
    {
        m m1 = com.google.android.gms.analytics.a.p(mContext);
        ak.a(map, "&adid", m1.getValue("&adid"));
        ak.a(map, "&ate", m1.getValue("&ate"));
    }

    private void t(Map map)
    {
        g g1 = g.cp();
        ak.a(map, "&an", g1.getValue("&an"));
        ak.a(map, "&av", g1.getValue("&av"));
        ak.a(map, "&aid", g1.getValue("&aid"));
        ak.a(map, "&aiid", g1.getValue("&aiid"));
        map.put("&v", "1");
    }

    static t u(Context context)
    {
        if (uL == null)
        {
            uL = new t(context);
        }
        return uL;
    }

    static String v(Context context)
    {
        Object obj;
        byte abyte0[];
        int i;
        obj = context.openFileInput("gaInstallData");
        abyte0 = new byte[8192];
        i = ((FileInputStream) (obj)).read(abyte0, 0, 8192);
        if (((FileInputStream) (obj)).available() <= 0)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        aa.A("Too much campaign data, ignoring it.");
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
            aa.B("No campaign data found.");
            return null;
        }
        catch (IOException ioexception)
        {
            aa.A("Error reading campaign data.");
            context.deleteFile("gaInstallData");
            return null;
        }
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        aa.D("Campaign file is empty.");
        return null;
        obj = new String(abyte0, 0, i);
        aa.B((new StringBuilder()).append("Campaign found: ").append(((String) (obj))).toString());
        return ((String) (obj));
    }

    void a(Runnable runnable)
    {
        uH.add(runnable);
    }

    public void cg()
    {
        a(new Runnable() {

            final t uO;

            public void run()
            {
                t.d(uO).cg();
            }

            
            {
                uO = t.this;
                super();
            }
        });
    }

    public void cl()
    {
        a(new Runnable() {

            final t uO;

            public void run()
            {
                t.d(uO).cl();
            }

            
            {
                uO = t.this;
                super();
            }
        });
    }

    public void cn()
    {
        a(new Runnable() {

            final t uO;

            public void run()
            {
                t.d(uO).cn();
            }

            
            {
                uO = t.this;
                super();
            }
        });
    }

    public LinkedBlockingQueue co()
    {
        return uH;
    }

    public Thread getThread()
    {
        return this;
    }

    protected void init()
    {
        uM.cG();
        uJ = new ArrayList();
        uJ.add(new fe("appendVersion", "&_v".substring(1), "ma4.0.2"));
        uJ.add(new fe("appendQueueTime", "&qt".substring(1), null));
        uJ.add(new fe("appendCacheBuster", "&z".substring(1), null));
    }

    public void p(Map map)
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

            final Map uN;
            final t uO;

            public void run()
            {
                t.a(uO, uN);
                if (TextUtils.isEmpty((CharSequence)uN.get("&cid")))
                {
                    uN.put("&cid", h.cq().getValue("&cid"));
                }
                if (GoogleAnalytics.getInstance(t.a(uO)).getAppOptOut() || t.b(uO, uN))
                {
                    return;
                }
                if (!TextUtils.isEmpty(t.b(uO)))
                {
                    com.google.android.gms.analytics.u.cP().u(true);
                    uN.putAll((new HitBuilders.HitBuilder()).setCampaignParamsFromUrl(t.b(uO)).build());
                    com.google.android.gms.analytics.u.cP().u(false);
                    t.a(uO, null);
                }
                t.c(uO, uN);
                Map map1 = y.u(uN);
                t.d(uO).b(map1, Long.valueOf((String)uN.get("&ht")).longValue(), t.d(uO, uN), t.c(uO));
            }

            
            {
                uO = t.this;
                uN = map;
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
            aa.D("sleep interrupted in GAThread initialize");
        }
        try
        {
            if (uM == null)
            {
                uM = new s(mContext, this);
            }
            init();
            uK = v(mContext);
            aa.C("Initialized GA Thread");
        }
        catch (Throwable throwable)
        {
            aa.A((new StringBuilder()).append("Error initializing the GAThread: ").append(a(throwable)).toString());
            aa.A("Google Analytics will not start up.");
            uI = true;
        }
        if (mClosed)
        {
            break; /* Loop/switch isn't completed */
        }
        runnable = (Runnable)uH.take();
        if (!uI)
        {
            runnable.run();
        }
        continue; /* Loop/switch isn't completed */
        obj;
        try
        {
            aa.B(((InterruptedException) (obj)).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            aa.A((new StringBuilder()).append("Error on GAThread: ").append(a(((Throwable) (obj)))).toString());
            aa.A("Google Analytics is shutting down.");
            uI = true;
        }
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_55;
_L1:
    }
}
