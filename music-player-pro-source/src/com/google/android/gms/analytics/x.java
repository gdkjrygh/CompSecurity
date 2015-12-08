// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.internal.ha;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.gms.analytics:
//            f, ae, w, ak, 
//            an, a, g, k, 
//            GoogleAnalytics, y, ac

class x extends Thread
    implements f
{
    private class a
        implements Runnable
    {

        final x zQ;

        public void run()
        {
            x.d(zQ).dQ();
        }

        private a()
        {
            zQ = x.this;
            super();
        }

    }

    private class b
        implements Runnable
    {

        final x zQ;

        public void run()
        {
            x.d(zQ).dispatch();
        }

        private b()
        {
            zQ = x.this;
            super();
        }

    }

    private class c
        implements Runnable
    {

        final x zQ;

        public void run()
        {
            x.d(zQ).dW();
        }

        private c()
        {
            zQ = x.this;
            super();
        }

    }

    private class d
        implements Runnable
    {

        final x zQ;
        private final Map zR;

        private String v(Map map)
        {
            if (map.containsKey("useSecure"))
            {
                if (an.f((String)map.get("useSecure"), true))
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

        private void w(Map map)
        {
            q q = com.google.android.gms.analytics.a.w(x.a(zQ));
            an.a(map, "&adid", q);
            an.a(map, "&ate", q);
        }

        private void x(Map map)
        {
            g g1 = com.google.android.gms.analytics.g.dZ();
            an.a(map, "&an", g1);
            an.a(map, "&av", g1);
            an.a(map, "&aid", g1);
            an.a(map, "&aiid", g1);
            map.put("&v", "1");
        }

        private boolean y(Map map)
        {
            if (map.get("&sf") == null)
            {
                return false;
            }
            double d1 = an.a((String)map.get("&sf"), 100D);
            if (d1 >= 100D)
            {
                return false;
            }
            if ((double)(x.ah((String)map.get("&cid")) % 10000) >= d1 * 100D)
            {
                if (map.get("&t") == null)
                {
                    map = "unknown";
                } else
                {
                    map = (String)map.get("&t");
                }
                ae.V(String.format("%s hit sampled out", new Object[] {
                    map
                }));
                return true;
            } else
            {
                return false;
            }
        }

        public void run()
        {
            w(zR);
            if (TextUtils.isEmpty((CharSequence)zR.get("&cid")))
            {
                zR.put("&cid", k.el().getValue("&cid"));
            }
            if (GoogleAnalytics.getInstance(x.a(zQ)).getAppOptOut() || y(zR))
            {
                return;
            }
            if (!TextUtils.isEmpty(x.b(zQ)))
            {
                com.google.android.gms.analytics.y.eK().D(true);
                zR.putAll((new HitBuilders.HitBuilder()).setCampaignParamsFromUrl(x.b(zQ)).build());
                com.google.android.gms.analytics.y.eK().D(false);
                x.a(zQ, null);
            }
            x(zR);
            Map map = ac.z(zR);
            x.d(zQ).b(map, Long.valueOf((String)zR.get("&ht")).longValue(), v(zR), x.c(zQ));
        }

        d(Map map)
        {
            zQ = x.this;
            super();
            zR = new HashMap(map);
            map = (String)map.get("&ht");
            x1 = map;
            if (map == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            Long.valueOf(map);
            x1 = map;
_L2:
            if (x.this == null)
            {
                long l = System.currentTimeMillis();
                zR.put("&ht", Long.toString(l));
            }
            return;
            x1;
            x1 = null;
            if (true) goto _L2; else goto _L1
_L1:
        }
    }


    private static x zM;
    private volatile boolean mClosed;
    private final Context mContext;
    private final LinkedBlockingQueue zJ = new LinkedBlockingQueue();
    private volatile boolean zK;
    private volatile String zL;
    private volatile ak zN;
    private final Lock zO = new ReentrantLock();
    private final List zP = new ArrayList();

    private x(Context context)
    {
        super("GAThread");
        zK = false;
        mClosed = false;
        if (context != null)
        {
            mContext = context.getApplicationContext();
        } else
        {
            mContext = context;
        }
        zP.add(new ha("appendVersion", "&_v".substring(1), "ma4.0.4"));
        start();
    }

    static x A(Context context)
    {
        if (zM == null)
        {
            zM = new x(context);
        }
        return zM;
    }

    static String B(Context context)
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
        ae.T("Too much campaign data, ignoring it.");
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
            ae.U("No campaign data found.");
            return null;
        }
        catch (IOException ioexception)
        {
            ae.T("Error reading campaign data.");
            context.deleteFile("gaInstallData");
            return null;
        }
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        ae.W("Campaign file is empty.");
        return null;
        obj = new String(abyte0, 0, i);
        ae.U((new StringBuilder()).append("Campaign found: ").append(((String) (obj))).toString());
        return ((String) (obj));
    }

    static Context a(x x1)
    {
        return x1.mContext;
    }

    static String a(x x1, String s)
    {
        x1.zL = s;
        return s;
    }

    static int ah(String s)
    {
        int k = 1;
        if (!TextUtils.isEmpty(s))
        {
            int j = s.length();
            int i = 0;
            j--;
            do
            {
                k = i;
                if (j < 0)
                {
                    break;
                }
                k = s.charAt(j);
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

    static String b(x x1)
    {
        return x1.zL;
    }

    private void b(Runnable runnable)
    {
        zJ.add(runnable);
    }

    static List c(x x1)
    {
        return x1.zP;
    }

    static ak d(x x1)
    {
        return x1.zN;
    }

    private String g(Throwable throwable)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(bytearrayoutputstream);
        throwable.printStackTrace(printstream);
        printstream.flush();
        return new String(bytearrayoutputstream.toByteArray());
    }

    public void dQ()
    {
        b(new a());
    }

    public void dW()
    {
        b(new c());
    }

    public LinkedBlockingQueue dX()
    {
        return zJ;
    }

    public void dY()
    {
        Object obj;
        init();
        obj = new ArrayList();
        zJ.drainTo(((java.util.Collection) (obj)));
        zO.lock();
        zK = true;
        obj = ((List) (obj)).iterator();
_L1:
        Runnable runnable;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_98;
        }
        runnable = (Runnable)((Iterator) (obj)).next();
        runnable.run();
          goto _L1
        Object obj1;
        obj1;
        ae.T((new StringBuilder()).append("Error dispatching all events on exit, giving up: ").append(g(((Throwable) (obj1)))).toString());
        zO.unlock();
        return;
        obj1;
        zO.unlock();
        throw obj1;
    }

    public void dispatch()
    {
        b(new b());
    }

    public Thread getThread()
    {
        return this;
    }

    protected void init()
    {
        this;
        JVM INSTR monitorenter ;
        ak ak1 = zN;
        if (ak1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zN = new w(mContext, this);
        zN.eB();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
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
            ae.W("sleep interrupted in GAThread initialize");
        }
        try
        {
            init();
            zL = B(mContext);
            ae.V("Initialized GA Thread");
        }
        catch (Throwable throwable)
        {
            ae.T((new StringBuilder()).append("Error initializing the GAThread: ").append(g(throwable)).toString());
            ae.T("Google Analytics will not start up.");
            zK = true;
        }
        if (mClosed)
        {
            break; /* Loop/switch isn't completed */
        }
        runnable = (Runnable)zJ.take();
        zO.lock();
        if (!zK)
        {
            runnable.run();
        }
        zO.unlock();
        continue; /* Loop/switch isn't completed */
        obj;
        try
        {
            ae.U(((InterruptedException) (obj)).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ae.T((new StringBuilder()).append("Error on GAThread: ").append(g(((Throwable) (obj)))).toString());
            ae.T("Google Analytics is shutting down.");
            zK = true;
        }
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_32;
        Exception exception;
        exception;
        zO.unlock();
        throw exception;
_L1:
    }

    public void u(Map map)
    {
        b(new d(map));
    }
}
