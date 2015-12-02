// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import com.qihoo.security.engine.FileInfo;
import com.qihoo.security.engine.cloudscan.NetQuery;
import com.qihoo.security.engine.d.b;
import com.qihoo.security.env.QVSEnv;
import com.qihoo.security.services.DeepScanItem;
import com.qihoo.security.services.ScanProgress;
import com.qihoo.security.services.ScanResult;
import com.qihoo.security.services.a;
import com.qihoo.security.services.d;
import com.qihoo360.common.utils.SysInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.qihoo.security.engine.b:
//            e, b, d, g, 
//            a

public class c
    implements com.qihoo.security.engine.a.a, e.a
{

    public static boolean c = false;
    public static boolean n = false;
    final RemoteCallbackList a = new RemoteCallbackList();
    boolean b;
    public final Context d;
    public volatile d e;
    public final com.qihoo.security.engine.e.c f = new com.qihoo.security.engine.e.c(this);
    public final e g = new e(this);
    public final com.qihoo.security.engine.b.d h;
    public final g i;
    public final com.qihoo.security.engine.b.b j;
    public volatile boolean k;
    public volatile boolean l;
    public com.qihoo360.common.d.a m;
    private final Runnable o = new Runnable() {

        final c a;

        public void run()
        {
            while (!a.j.e || a.f.e() && a.f.f() || a.f.d() || !a.g.e()) 
            {
                return;
            }
            a.h.b();
        }

            
            {
                a = c.this;
                super();
            }
    };
    private final ConcurrentHashMap p = new ConcurrentHashMap();
    private final ConcurrentHashMap q = new ConcurrentHashMap();
    private final AtomicInteger r = new AtomicInteger(0);
    private volatile boolean s;
    private volatile boolean t;
    private final Handler u;

    public c(Context context, Handler handler)
    {
        b = false;
        k = false;
        l = false;
        s = false;
        t = false;
        m = null;
        d = context;
        j = new com.qihoo.security.engine.b.b(context, this);
        h = new com.qihoo.security.engine.b.d(this, handler);
        i = new g(this, handler);
        u = handler;
    }

    private void p()
    {
        String as[];
        int i1;
        int k1;
        as = NetQuery.COMMON_OPTIONS;
        k1 = as.length;
        i1 = 0;
_L2:
        String s1;
        String s2;
        if (i1 >= k1)
        {
            return;
        }
        s1 = as[i1];
        s2 = (String)q.get(s1);
        if (!TextUtils.isEmpty(s2))
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        int ai[] = new int[2];
        ai;
        ai[0] = 2;
        ai[1] = 7;
        int l1 = ai.length;
        int j1 = 0;
        while (j1 < l1) 
        {
            int i2 = ai[j1];
            if (a(i2))
            {
                try
                {
                    e.e().a(i2, s1, s2);
                }
                catch (Exception exception) { }
            }
            j1++;
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    private void q()
    {
        boolean flag = QVSEnv.bEvalMode;
    }

    public int a()
    {
        r.incrementAndGet();
        if (!e.d()) goto _L2; else goto _L1
_L1:
        if (!s) goto _L4; else goto _L3
_L3:
        m();
_L6:
        return 0;
_L4:
        c();
        return 0;
_L2:
        if (!e.a())
        {
            return 0x80004005;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int a(List list)
    {
        if (!e.d())
        {
            return 0x8000ffff;
        }
        if (list == null || list.isEmpty())
        {
            return 0x80070057;
        }
        if (l)
        {
            return 0x8000000a;
        }
        l = true;
        QVSEnv.LAST_UPDATE_TIME_STAMP = com.qihoo.security.env.QVSEnv.a.a(d);
        q();
        h.a();
        j.a();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                j.b();
                return 0;
            }
            DeepScanItem deepscanitem = (DeepScanItem)list.next();
            j.a(deepscanitem);
        } while (true);
    }

    public String a(String s1)
    {
        int i1;
        if (!s1.startsWith("engine.enabled"))
        {
            break MISSING_BLOCK_LABEL_54;
        }
        i1 = s1.lastIndexOf(':');
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        boolean flag;
        i1 = Integer.parseInt(s1.substring(i1 + 1));
        flag = f.b.get(i1, false);
        return String.valueOf(flag);
        s1;
        return null;
        Object obj;
        if (!"query.network.stat".equals(s1))
        {
            break MISSING_BLOCK_LABEL_89;
        }
        obj = e.e();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        obj = ((a) (obj)).a("network");
        return ((String) (obj));
        Exception exception;
        exception;
        return (String)p.get(s1);
    }

    public String a(String s1, String s2)
    {
        if ("engine.enabled".equals(s1))
        {
            int i1 = s2.indexOf(':');
            if (i1 > 0)
            {
                int j1 = Integer.parseInt(s2.substring(0, i1));
                f.a(j1, "1".equals(s2.substring(i1 + 1)));
                return String.valueOf(f.b.get(j1, false));
            } else
            {
                return null;
            }
        } else
        {
            return (String)p.put(s1, s2);
        }
    }

    public void a(int i1, int j1, List list)
    {
        if (k)
        {
            return;
        } else
        {
            f.a(i1, j1, list);
            return;
        }
    }

    public void a(int i1, String s1, String s2)
    {
        RemoteCallbackList remotecallbacklist = a;
        remotecallbacklist;
        JVM INSTR monitorenter ;
        int k1 = a.beginBroadcast();
        int j1 = 0;
_L2:
        if (j1 < k1)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        a.finishBroadcast();
        remotecallbacklist;
        JVM INSTR monitorexit ;
        return;
        try
        {
            ((com.qihoo.security.services.c)a.getBroadcastItem(j1)).a(i1, s1, s2);
        }
        catch (Exception exception) { }
        finally { }
        j1++;
        if (true) goto _L2; else goto _L1
_L1:
        remotecallbacklist;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public void a(int i1, List list)
    {
        a a1 = e.e();
        if (a1 == null) goto _L2; else goto _L1
_L1:
        list = list.iterator();
_L5:
        if (list.hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        ScanResult scanresult = (ScanResult)list.next();
        try
        {
            a1.a(scanresult);
        }
        catch (Exception exception) { }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void a(int i1, List list, String s1)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                return;
            }
            ScanResult scanresult = (ScanResult)list.next();
            boolean flag = QVSEnv.bEvalMode;
            a(i1, scanresult.fileInfo.filePath, s1);
        } while (true);
    }

    public void a(com.qihoo.security.engine.a a1)
    {
        if (k)
        {
            return;
        } else
        {
            g.a(a1);
            return;
        }
    }

    void a(ScanProgress scanprogress, boolean flag)
    {
        RemoteCallbackList remotecallbacklist = a;
        remotecallbacklist;
        JVM INSTR monitorenter ;
        ScanResult scanresult = scanprogress.result;
        int i1;
        int j1;
        if (n)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        scanresult.rescan = i1;
        flag = QVSEnv.bEvalMode;
        j1 = a.beginBroadcast();
        i1 = 0;
_L2:
        if (i1 < j1)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        a.finishBroadcast();
        remotecallbacklist;
        JVM INSTR monitorexit ;
        return;
        try
        {
            ((com.qihoo.security.services.c)a.getBroadcastItem(i1)).a(scanprogress);
        }
        catch (Exception exception) { }
        finally { }
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        remotecallbacklist;
        JVM INSTR monitorexit ;
        throw scanprogress;
    }

    public void a(boolean flag)
    {
        try
        {
            e.e().a(flag);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public boolean a(int i1)
    {
        return f.b.get(i1, false);
    }

    public boolean a(com.qihoo.security.services.c c1)
    {
        return a.register(c1);
    }

    public int b()
    {
        if (r.decrementAndGet() <= 0)
        {
            if (!i.d())
            {
                i.a(0x1d4c0L);
            }
            a a1 = e.e();
            if (a1 != null)
            {
                try
                {
                    if (a(1))
                    {
                        a1.d(1);
                    }
                    if (a(2))
                    {
                        a1.d(2);
                    }
                    if (a(6))
                    {
                        a1.d(6);
                    }
                }
                catch (Exception exception) { }
                if (i.d())
                {
                    e.c();
                }
            }
        }
        return 0;
    }

    public String b(String s1)
    {
        return (String)q.get(s1);
    }

    public String b(String s1, String s2)
    {
        return (String)q.put(s1, s2);
    }

    public void b(com.qihoo.security.services.c c1)
    {
        a.unregister(c1);
    }

    void b(List list)
    {
        Object obj;
        boolean flag = QVSEnv.bEvalMode;
        f.c();
        i.c();
        l = false;
        obj = list.iterator();
_L5:
        if (((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        obj = a;
        obj;
        JVM INSTR monitorenter ;
        int j2 = a.beginBroadcast();
        int k1 = 0;
_L7:
        if (k1 < j2) goto _L4; else goto _L3
_L3:
        a.finishBroadcast();
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        ScanResult scanresult = (ScanResult)((Iterator) (obj)).next();
        int i1;
        if (n)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        scanresult.rescan = i1;
          goto _L5
_L4:
        int i2 = list.size();
        int l1 = 0;
_L9:
        int j1;
        boolean flag1;
        j1 = l1 + 200;
        boolean flag2;
        if (i2 > j1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
            j1 = i2;
        }
        flag2 = b;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        obj;
        JVM INSTR monitorexit ;
        throw list;
label0:
        {
            try
            {
                ((com.qihoo.security.services.c)a.getBroadcastItem(k1)).a(list.subList(l1, j1), flag1);
            }
            catch (Exception exception) { }
            finally { }
            if (flag1)
            {
                break label0;
            }
            k1++;
        }
        if (true) goto _L7; else goto _L6
_L6:
        l1 = j1;
        if (true) goto _L9; else goto _L8
_L8:
          goto _L7
    }

    public int c(String s1)
    {
        q();
        PackageManager packagemanager = d.getPackageManager();
        int i1;
        try
        {
            s1 = packagemanager.getPackageInfo(s1, 64);
            b b1 = new b(3, 1);
            b1.c = new FileInfo(packagemanager, s1);
            h.c(1);
            i1 = f.a(b1);
            if (g.e() && f.e())
            {
                f.f();
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return 0x80070057;
        }
        return i1;
    }

    public void c()
    {
        if (!(new com.qihoo.security.engine.b.a(d, this)).a()) goto _L2; else goto _L1
_L1:
        Object obj;
        DeepScanItem deepscanitem;
        try
        {
            a a1 = e.e();
            if (a(1))
            {
                a1.a(1);
                a1.c(1);
            }
            if (a(2))
            {
                a1.a(2);
                a1.c(2);
            }
            if (a(6))
            {
                a1.a(6);
                a1.c(6);
                a1.a(6, "workmode", "ds");
            }
            if (a(7))
            {
                a1.a(7);
                a1.c(7);
            }
        }
        catch (Exception exception) { }
        obj = SysInfo.getIMEI(d);
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            b("1", ((String) (obj)));
        }
        b("5", Build.MANUFACTURER);
        b("6", Build.MODEL);
        b("7", android.os.Build.VERSION.SDK);
        b("8", (new StringBuilder(String.valueOf(android.os.Build.VERSION.RELEASE))).append("||").append(Build.FINGERPRINT).toString());
        p();
        if (!b)
        {
            break MISSING_BLOCK_LABEL_370;
        }
        g.b();
        f.b();
        b = false;
        n = true;
        q();
        n();
        obj = new ArrayList(2);
        ((ArrayList) (obj)).add(new DeepScanItem(4, null));
        ((ArrayList) (obj)).add(new DeepScanItem(3, null));
        j.a();
        obj = ((ArrayList) (obj)).iterator();
        if (((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        j.b();
_L6:
        s = true;
_L2:
        return;
_L4:
        deepscanitem = (DeepScanItem)((Iterator) (obj)).next();
        j.a(deepscanitem);
        break MISSING_BLOCK_LABEL_327;
        m();
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int d()
    {
        g.c();
        h.e();
        return 0;
    }

    public int d(String s1)
    {
        q();
        int i1;
        try
        {
            b b1 = new b(3, 1);
            b1.c = new FileInfo(s1, 1, -1);
            h.c(1);
            i1 = f.a(b1);
            if (g.e() && f.e())
            {
                f.f();
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return 0x80070057;
        }
        return i1;
    }

    public int e()
    {
        g.d();
        h.f();
        return 0;
    }

    public int f()
    {
        b = false;
        k = true;
        t = false;
        f.a();
        j.c();
        g.a();
        h.c();
        i.a(100L);
        if (h())
        {
            o();
            return 1;
        } else
        {
            return 0;
        }
    }

    public void g()
    {
        k = false;
        g.b();
        f.b();
    }

    public boolean h()
    {
        return j.e && g.e() && !f.e() && !f.d();
    }

    public void i()
    {
        u.postDelayed(o, 200L);
    }

    public void j()
    {
        if (j.e && !f.e() && !f.d())
        {
            o();
        }
    }

    void k()
    {
        if (g.e())
        {
            if (f.e())
            {
                f.f();
            } else
            if (!f.d())
            {
                h.b();
                return;
            }
        }
    }

    void l()
    {
        if (g.e() && !f.e() && !f.d())
        {
            o();
        }
    }

    public void m()
    {
        RemoteCallbackList remotecallbacklist = a;
        remotecallbacklist;
        JVM INSTR monitorenter ;
        int j1 = a.beginBroadcast();
        int i1 = 0;
_L2:
        if (i1 < j1)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        a.finishBroadcast();
        remotecallbacklist;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        try
        {
            ((com.qihoo.security.services.c)a.getBroadcastItem(i1)).a();
        }
        catch (Exception exception1) { }
        finally { }
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        remotecallbacklist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void n()
    {
        RemoteCallbackList remotecallbacklist = a;
        remotecallbacklist;
        JVM INSTR monitorenter ;
        int j1 = a.beginBroadcast();
        int i1 = 0;
_L2:
        if (i1 < j1)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        a.finishBroadcast();
        remotecallbacklist;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        remotecallbacklist;
        JVM INSTR monitorexit ;
        throw exception;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void o()
    {
        if (b)
        {
            return;
        }
        l = false;
        RemoteCallbackList remotecallbacklist = a;
        remotecallbacklist;
        JVM INSTR monitorenter ;
        if (t || !k) goto _L2; else goto _L1
_L1:
        int j1 = a.beginBroadcast();
        int i1 = 0;
_L6:
        if (i1 < j1) goto _L4; else goto _L3
_L3:
        a.finishBroadcast();
        t = true;
_L2:
        remotecallbacklist;
        JVM INSTR monitorexit ;
        Exception exception;
        return;
        remotecallbacklist;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        try
        {
            ((com.qihoo.security.services.c)a.getBroadcastItem(i1)).b();
        }
        catch (Exception exception1) { }
        finally { }
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

}
