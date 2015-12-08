// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.internal.hb;
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
//            f, z, aj, a, 
//            g, af, r, h, 
//            GoogleAnalytics, t, x

class s extends Thread
    implements f
{

    private static s yX;
    private volatile boolean mClosed;
    private final Context mContext;
    private final LinkedBlockingQueue yT = new LinkedBlockingQueue();
    private volatile boolean yU;
    private volatile List yV;
    private volatile String yW;
    private volatile af yY;

    private s(Context context)
    {
        super("GAThread");
        yU = false;
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

    static s B(Context context)
    {
        if (yX == null)
        {
            yX = new s(context);
        }
        return yX;
    }

    static String C(Context context)
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
        z.T("Too much campaign data, ignoring it.");
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
            z.U("No campaign data found.");
            return null;
        }
        catch (IOException ioexception)
        {
            z.T("Error reading campaign data.");
            context.deleteFile("gaInstallData");
            return null;
        }
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        z.W("Campaign file is empty.");
        return null;
        obj = new String(abyte0, 0, i);
        z.U((new StringBuilder()).append("Campaign found: ").append(((String) (obj))).toString());
        return ((String) (obj));
    }

    static Context a(s s1)
    {
        return s1.mContext;
    }

    static String a(s s1, String s2)
    {
        s1.yW = s2;
        return s2;
    }

    static void a(s s1, Map map)
    {
        s1.x(map);
    }

    static int ah(String s1)
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

    static String b(s s1)
    {
        return s1.yW;
    }

    static boolean b(s s1, Map map)
    {
        return s1.w(map);
    }

    static List c(s s1)
    {
        return s1.yV;
    }

    static void c(s s1, Map map)
    {
        s1.y(map);
    }

    static af d(s s1)
    {
        return s1.yY;
    }

    static String d(s s1, Map map)
    {
        return s1.v(map);
    }

    private String g(Throwable throwable)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(bytearrayoutputstream);
        throwable.printStackTrace(printstream);
        printstream.flush();
        return new String(bytearrayoutputstream.toByteArray());
    }

    private String v(Map map)
    {
        if (map.containsKey("useSecure"))
        {
            if (aj.e((String)map.get("useSecure"), true))
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

    private boolean w(Map map)
    {
        if (map.get("&sf") == null)
        {
            return false;
        }
        double d1 = aj.a((String)map.get("&sf"), 100D);
        if (d1 >= 100D)
        {
            return false;
        }
        if ((double)(ah((String)map.get("&cid")) % 10000) >= d1 * 100D)
        {
            if (map.get("&t") == null)
            {
                map = "unknown";
            } else
            {
                map = (String)map.get("&t");
            }
            z.V(String.format("%s hit sampled out", new Object[] {
                map
            }));
            return true;
        } else
        {
            return false;
        }
    }

    private void x(Map map)
    {
        l l = com.google.android.gms.analytics.a.w(mContext);
        aj.a(map, "&adid", l);
        aj.a(map, "&ate", l);
    }

    private void y(Map map)
    {
        g g1 = com.google.android.gms.analytics.g.dP();
        aj.a(map, "&an", g1);
        aj.a(map, "&av", g1);
        aj.a(map, "&aid", g1);
        aj.a(map, "&aiid", g1);
        map.put("&v", "1");
    }

    void b(Runnable runnable)
    {
        yT.add(runnable);
    }

    public void dH()
    {
        b(new Runnable() {

            final s za;

            public void run()
            {
                s.d(za).dH();
            }

            
            {
                za = s.this;
                super();
            }
        });
    }

    public void dN()
    {
        b(new Runnable() {

            final s za;

            public void run()
            {
                s.d(za).dN();
            }

            
            {
                za = s.this;
                super();
            }
        });
    }

    public LinkedBlockingQueue dO()
    {
        return yT;
    }

    public void dispatch()
    {
        b(new Runnable() {

            final s za;

            public void run()
            {
                s.d(za).dispatch();
            }

            
            {
                za = s.this;
                super();
            }
        });
    }

    public Thread getThread()
    {
        return this;
    }

    protected void init()
    {
        yY.eg();
        yV = new ArrayList();
        yV.add(new hb("appendVersion", "&_v".substring(1), "ma4.0.3"));
        yV.add(new hb("appendQueueTime", "&qt".substring(1), null));
        yV.add(new hb("appendCacheBuster", "&z".substring(1), null));
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
            z.W("sleep interrupted in GAThread initialize");
        }
        try
        {
            if (yY == null)
            {
                yY = new r(mContext, this);
            }
            init();
            yW = C(mContext);
            z.V("Initialized GA Thread");
        }
        catch (Throwable throwable)
        {
            z.T((new StringBuilder()).append("Error initializing the GAThread: ").append(g(throwable)).toString());
            z.T("Google Analytics will not start up.");
            yU = true;
        }
        if (mClosed)
        {
            break; /* Loop/switch isn't completed */
        }
        runnable = (Runnable)yT.take();
        if (!yU)
        {
            runnable.run();
        }
        continue; /* Loop/switch isn't completed */
        obj;
        try
        {
            z.U(((InterruptedException) (obj)).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            z.T((new StringBuilder()).append("Error on GAThread: ").append(g(((Throwable) (obj)))).toString());
            z.T("Google Analytics is shutting down.");
            yU = true;
        }
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_55;
_L1:
    }

    public void u(Map map)
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
        b(new Runnable(hashmap) {

            final Map yZ;
            final s za;

            public void run()
            {
                s.a(za, yZ);
                if (TextUtils.isEmpty((CharSequence)yZ.get("&cid")))
                {
                    yZ.put("&cid", h.dQ().getValue("&cid"));
                }
                if (GoogleAnalytics.getInstance(s.a(za)).getAppOptOut() || s.b(za, yZ))
                {
                    return;
                }
                if (!TextUtils.isEmpty(s.b(za)))
                {
                    t.ep().B(true);
                    yZ.putAll((new HitBuilders.HitBuilder()).setCampaignParamsFromUrl(s.b(za)).build());
                    t.ep().B(false);
                    s.a(za, null);
                }
                s.c(za, yZ);
                Map map1 = com.google.android.gms.analytics.x.z(yZ);
                s.d(za).b(map1, Long.valueOf((String)yZ.get("&ht")).longValue(), s.d(za, yZ), s.c(za));
            }

            
            {
                za = s.this;
                yZ = map;
                super();
            }
        });
        return;
        map;
        map = null;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
