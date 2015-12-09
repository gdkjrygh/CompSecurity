// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.internal.hf;
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
//            f, ac, v, ai, 
//            al, a, g, k, 
//            GoogleAnalytics, w, aa

final class GAThread extends Thread
    implements f
{
    final class b
        implements Runnable
    {

        final GAThread zO;

        public final void run()
        {
            GAThread.d(zO).dispatch();
        }

        private b()
        {
            zO = GAThread.this;
            super();
        }

    }

    final class c
        implements Runnable
    {

        final GAThread zO;

        public final void run()
        {
            GAThread.d(zO).setForceLocalDispatch();
        }

        private c()
        {
            zO = GAThread.this;
            super();
        }

    }

    final class d
        implements Runnable
    {

        final GAThread zO;
        private final Map zP;

        private static String u(Map map)
        {
            if (map.containsKey("useSecure"))
            {
                if (al.f((String)map.get("useSecure"), true))
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

        private void v(Map map)
        {
            q q = com.google.android.gms.analytics.a.w(GAThread.a(zO));
            al.a(map, "&adid", q);
            al.a(map, "&ate", q);
        }

        private static void w(Map map)
        {
            g g1 = com.google.android.gms.analytics.g.dV();
            al.a(map, "&an", g1);
            al.a(map, "&av", g1);
            al.a(map, "&aid", g1);
            al.a(map, "&aiid", g1);
            map.put("&v", "1");
        }

        private static boolean x(Map map)
        {
            if (map.get("&sf") == null)
            {
                return false;
            }
            double d1 = al.a((String)map.get("&sf"), 100D);
            if (d1 >= 100D)
            {
                return false;
            }
            if ((double)(GAThread.ag((String)map.get("&cid")) % 10000) >= d1 * 100D)
            {
                if (map.get("&t") == null)
                {
                    map = "unknown";
                } else
                {
                    map = (String)map.get("&t");
                }
                ac.v(String.format("%s hit sampled out", new Object[] {
                    map
                }));
                return true;
            } else
            {
                return false;
            }
        }

        public final void run()
        {
            v(zP);
            if (TextUtils.isEmpty((CharSequence)zP.get("&cid")))
            {
                zP.put("&cid", k.eh().getValue("&cid"));
            }
            if (GoogleAnalytics.getInstance(GAThread.a(zO)).getAppOptOut() || x(zP))
            {
                return;
            }
            if (!TextUtils.isEmpty(GAThread.b(zO)))
            {
                com.google.android.gms.analytics.w.eF().D(true);
                zP.putAll((new HitBuilders.HitBuilder()).setCampaignParamsFromUrl(GAThread.b(zO)).build());
                com.google.android.gms.analytics.w.eF().D(false);
                GAThread.a(zO, null);
            }
            w(zP);
            Map map = aa.y(zP);
            GAThread.d(zO).b(map, Long.valueOf((String)zP.get("&ht")).longValue(), u(zP), GAThread.c(zO));
        }

        d(Map map)
        {
            zO = GAThread.this;
            super();
            zP = new HashMap(map);
            map = (String)map.get("&ht");
            gathread = map;
            if (map == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            Long.valueOf(map);
            gathread = map;
_L2:
            if (GAThread.this == null)
            {
                long l = System.currentTimeMillis();
                zP.put("&ht", Long.toString(l));
            }
            return;
            gathread;
            gathread = null;
            if (true) goto _L2; else goto _L1
_L1:
        }
    }


    private static GAThread zK;
    private volatile boolean mClosed;
    private final Context mContext;
    private final LinkedBlockingQueue zH = new LinkedBlockingQueue();
    private volatile boolean zI;
    private volatile String zJ;
    private volatile ai zL;
    private final Lock zM = new ReentrantLock();
    private final List zN = new ArrayList();

    private GAThread(Context context)
    {
        super("GAThread");
        zI = false;
        mClosed = false;
        if (context != null)
        {
            mContext = context.getApplicationContext();
        } else
        {
            mContext = context;
        }
        zN.add(new hf("appendVersion", "&_v".substring(1), "ma4.0.4"));
        start();
    }

    private static String A(Context context)
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
        ac.e("Too much campaign data, ignoring it.");
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
            ac.i("No campaign data found.");
            return null;
        }
        catch (IOException ioexception)
        {
            ac.e("Error reading campaign data.");
            context.deleteFile("gaInstallData");
            return null;
        }
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        ac.w("Campaign file is empty.");
        return null;
        obj = new String(abyte0, 0, i);
        ac.i((new StringBuilder("Campaign found: ")).append(((String) (obj))).toString());
        return ((String) (obj));
    }

    static Context a(GAThread gathread)
    {
        return gathread.mContext;
    }

    static String a(GAThread gathread, String s)
    {
        gathread.zJ = s;
        return s;
    }

    static int ag(String s)
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

    static String b(GAThread gathread)
    {
        return gathread.zJ;
    }

    private void b(Runnable runnable)
    {
        zH.add(runnable);
    }

    static List c(GAThread gathread)
    {
        return gathread.zN;
    }

    static ai d(GAThread gathread)
    {
        return gathread.zL;
    }

    private static String g(Throwable throwable)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(bytearrayoutputstream);
        throwable.printStackTrace(printstream);
        printstream.flush();
        return new String(bytearrayoutputstream.toByteArray());
    }

    static GAThread getInstance(Context context)
    {
        if (zK == null)
        {
            zK = new GAThread(context);
        }
        return zK;
    }

    private void init()
    {
        this;
        JVM INSTR monitorenter ;
        ai ai1 = zL;
        if (ai1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zL = new v(mContext, this);
        zL.ew();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void dispatch()
    {
        b(new b());
    }

    public final void forceDispatch()
    {
        Object obj;
        init();
        obj = new ArrayList();
        zH.drainTo(((java.util.Collection) (obj)));
        zM.lock();
        zI = true;
        obj = ((List) (obj)).iterator();
_L1:
        Runnable runnable;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_94;
        }
        runnable = (Runnable)((Iterator) (obj)).next();
        runnable.run();
          goto _L1
        Object obj1;
        obj1;
        ac.e((new StringBuilder("Error dispatching all events on exit, giving up: ")).append(g(((Throwable) (obj1)))).toString());
        zM.unlock();
        return;
        obj1;
        zM.unlock();
        throw obj1;
    }

    public final LinkedBlockingQueue getQueue()
    {
        return zH;
    }

    public final Thread getThread()
    {
        return this;
    }

    public final void run()
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
            ac.w("sleep interrupted in GAThread initialize");
        }
        try
        {
            init();
            zJ = A(mContext);
            ac.v("Initialized GA Thread");
        }
        catch (Throwable throwable)
        {
            ac.e((new StringBuilder("Error initializing the GAThread: ")).append(g(throwable)).toString());
            ac.e("Google Analytics will not start up.");
            zI = true;
        }
        if (mClosed)
        {
            break; /* Loop/switch isn't completed */
        }
        runnable = (Runnable)zH.take();
        zM.lock();
        if (!zI)
        {
            runnable.run();
        }
        zM.unlock();
        continue; /* Loop/switch isn't completed */
        obj;
        try
        {
            ac.i(((InterruptedException) (obj)).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ac.e((new StringBuilder("Error on GAThread: ")).append(g(((Throwable) (obj)))).toString());
            ac.e("Google Analytics is shutting down.");
            zI = true;
        }
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_32;
        Exception exception;
        exception;
        zM.unlock();
        throw exception;
_L1:
    }

    public final void sendHit(Map map)
    {
        b(new d(map));
    }

    public final void setForceLocalDispatch()
    {
        b(new c());
    }
}
