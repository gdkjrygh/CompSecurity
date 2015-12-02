// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.qihoo.security.service.SecurityService;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.a.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class c
{
    public static class a
    {

        public String a;
        public String b;
        public boolean c;
        public boolean d;
        public int e;
        ApplicationInfo f;

        public a()
        {
            a = null;
            b = null;
            c = false;
            d = false;
            e = 0;
            f = null;
        }
    }

    public static interface b
    {

        public abstract void a();

        public abstract void b();

        public abstract void c();
    }


    private static final String a = com/qihoo/security/opti/a/c.getSimpleName();
    private PackageManager b;
    private com.qihoo360.mobilesafe.core.c.c c;
    private Context d;
    private List e;
    private List f;
    private b g;
    private boolean h;
    private Thread i;
    private final ServiceConnection j = new ServiceConnection() {

        final c a;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            com.qihoo.security.opti.a.c.a(a, com.qihoo360.mobilesafe.core.c.a.a(ibinder));
            if (com.qihoo.security.opti.a.c.a(a) == null)
            {
                com.qihoo.security.opti.a.c.a(a, new Thread(new Runnable(this) {

                    final _cls1 a;

                    public void run()
                    {
                        c.b(a.a);
                        c.c(a.a);
                    }

            
            {
                a = _pcls1;
                super();
            }
                }));
                com.qihoo.security.opti.a.c.a(a).start();
            }
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            com.qihoo.security.opti.a.c.a(a, null);
        }

            
            {
                a = c.this;
                super();
            }
    };
    private Comparator k;

    public c(Context context)
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = false;
        i = null;
        k = new Comparator() {

            final c a;

            public final int a(a a1, a a2)
            {
                boolean flag = false;
                int l = ((flag) ? 1 : 0);
                if (a1 != null)
                {
                    l = ((flag) ? 1 : 0);
                    if (a2 != null)
                    {
                        l = ((flag) ? 1 : 0);
                        if (!TextUtils.isEmpty(a1.b))
                        {
                            l = ((flag) ? 1 : 0);
                            if (!TextUtils.isEmpty(a2.b))
                            {
                                a1 = a1.b;
                                a2 = a2.b;
                                if (a1.compareTo(a2) > 0)
                                {
                                    l = 1;
                                } else
                                {
                                    l = ((flag) ? 1 : 0);
                                    if (a1.compareTo(a2) < 0)
                                    {
                                        return -1;
                                    }
                                }
                            }
                        }
                    }
                }
                return l;
            }

            public int compare(Object obj, Object obj1)
            {
                return a((a)obj, (a)obj1);
            }

            
            {
                a = c.this;
                super();
            }
        };
        d = context;
        b = context.getPackageManager();
        e = new ArrayList();
        f = new ArrayList();
    }

    static com.qihoo360.mobilesafe.core.c.c a(c c1, com.qihoo360.mobilesafe.core.c.c c2)
    {
        c1.c = c2;
        return c2;
    }

    private String a(ApplicationInfo applicationinfo)
    {
        String s1 = applicationinfo.loadLabel(b).toString().trim();
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = applicationinfo.packageName;
        }
        return s;
    }

    static Thread a(c c1)
    {
        return c1.i;
    }

    static Thread a(c c1, Thread thread)
    {
        c1.i = thread;
        return thread;
    }

    private List a(List list)
    {
        if (list != null && !list.isEmpty() && list != null && !list.isEmpty())
        {
            int l = list.size();
            CountDownLatch countdownlatch = new CountDownLatch(1);
            CountDownLatch countdownlatch1 = new CountDownLatch(l);
            ExecutorService executorservice = Executors.newFixedThreadPool(5);
            for (Iterator iterator = list.iterator(); iterator.hasNext(); executorservice.submit(new Runnable(countdownlatch, (a)iterator.next(), countdownlatch1) {

        final CountDownLatch a;
        final a b;
        final CountDownLatch c;
        final c d;

        public void run()
        {
            Exception exception1;
            try
            {
                a.await();
                com.qihoo.security.opti.a.c.a(d, b);
            }
            catch (InterruptedException interruptedexception)
            {
                c.countDown();
                return;
            }
            finally
            {
                c.countDown();
            }
            c.countDown();
            return;
            throw exception1;
        }

            
            {
                d = c.this;
                a = countdownlatch;
                b = a1;
                c = countdownlatch1;
                super();
            }
    })) { }
            countdownlatch.countDown();
            try
            {
                countdownlatch1.await();
            }
            catch (Exception exception) { }
            executorservice.shutdown();
        }
        return list;
    }

    private void a(a a1)
    {
        ApplicationInfo applicationinfo = a1.f;
        a1.b = a(applicationinfo);
        boolean flag;
        if (com.qihoo360.mobilesafe.a.a.a(applicationinfo.packageName, b) == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a1.d = flag;
    }

    static void a(c c1, a a1)
    {
        c1.a(a1);
    }

    static void b(c c1)
    {
        c1.e();
    }

    static void c(c c1)
    {
        c1.f();
    }

    private void e()
    {
        f.clear();
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        List list = c.b();
        f.addAll(list);
        return;
        Exception exception;
        exception;
    }

    private void f()
    {
        ArrayList arraylist;
        Object obj;
        arraylist = new ArrayList();
        obj = com.qihoo360.mobilesafe.a.a.a(b);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((List) (obj)).iterator();
_L9:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L3
_L3:
        Object obj1 = (ApplicationInfo)((Iterator) (obj)).next();
        if (!h) goto _L5; else goto _L4
_L4:
        Log.d(a, "task cancelled return");
        if (g != null)
        {
            g.c();
        }
_L7:
        return;
_L5:
        a a1 = new a();
        a1.a = ((ApplicationInfo) (obj1)).packageName;
        a1.f = ((ApplicationInfo) (obj1));
        if ("com.qihoo.security.lite".equals(((ApplicationInfo) (obj1)).packageName))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = f.iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            String s = (String)((Iterator) (obj1)).next();
            if (!a1.a.equals(s))
            {
                continue;
            }
            a1.c = true;
            break;
        } while (true);
        arraylist.add(a1);
        continue; /* Loop/switch isn't completed */
_L2:
        e.clear();
        e.addAll(a(arraylist));
        if (k != null)
        {
            try
            {
                Collections.sort(e, k);
            }
            catch (Exception exception) { }
        }
        if (g == null) goto _L7; else goto _L6
_L6:
        g.b();
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void a()
    {
        if (g != null)
        {
            g.a();
        }
        h = false;
        Utils.bindService(d, com/qihoo/security/service/SecurityService, com.qihoo.security.env.a.f, j, 1);
    }

    public void a(b b1)
    {
        g = b1;
    }

    public void a(String s, boolean flag)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        c.a(s, flag);
        return;
        s;
    }

    public void b()
    {
        d = null;
        b = null;
        c = null;
        h = true;
        if (i != null && i.isAlive())
        {
            try
            {
                i.stop();
            }
            catch (Exception exception) { }
        }
        e.clear();
        f.clear();
        Utils.unbindService(a, d, j);
    }

    public List c()
    {
        return e;
    }

    public void d()
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        c.d();
        return;
        Exception exception;
        exception;
    }

}
