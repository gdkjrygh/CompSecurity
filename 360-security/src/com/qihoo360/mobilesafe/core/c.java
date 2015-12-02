// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.qihoo.security.service.a;
import com.qihoo360.common.utils.PermissionUtil;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.core.b.d;
import com.qihoo360.mobilesafe.core.b.e;
import com.qihoo360.mobilesafe.core.d.h;
import com.qihoo360.mobilesafe.service.KillBean;
import com.qihoo360.mobilesafe.service.ProcessInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo360.mobilesafe.core:
//            b, a

public class c
{
    class a
        implements com.qihoo360.mobilesafe.core.a.a, d
    {

        final c a;
        private final List b;

        public void a()
        {
            c.l(a);
        }

        public void a(int i1, int j1)
        {
            com.qihoo360.mobilesafe.core.c.a(a, i1, j1);
        }

        public void a(List list)
        {
        }

        public void a(List list, List list1)
        {
            if (com.qihoo360.mobilesafe.core.c.e(a) != null)
            {
                com.qihoo360.mobilesafe.core.c.e(a).a(list, b, this);
            }
        }

        public void b()
        {
        }

        public void b(List list)
        {
        }

        public void c()
        {
        }

        a(List list)
        {
            a = c.this;
            b = list;
            super();
        }
    }


    private static final String a = com/qihoo360/mobilesafe/core/c.getSimpleName();
    private static volatile c k = null;
    private final RemoteCallbackList b = new RemoteCallbackList();
    private List c;
    private List d;
    private List e;
    private boolean f;
    private PackageManager g;
    private b h;
    private com.qihoo360.mobilesafe.core.a i;
    private Handler j;
    private Context l;
    private com.qihoo.security.service.a m;
    private long n;
    private com.qihoo360.mobilesafe.core.c.a o;

    private c(Context context, com.qihoo.security.service.a a1)
    {
        f = false;
        l = null;
        m = null;
        o = new com.qihoo360.mobilesafe.core.c.a() {

            final c a;

            static c a(_cls1 _pcls1)
            {
                return _pcls1.a;
            }

            public List a()
                throws RemoteException
            {
                PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), com.qihoo360.mobilesafe.core.c.a(a));
                return com.qihoo360.mobilesafe.core.b.e.a(c.g(a)).b();
            }

            public void a(com.qihoo360.mobilesafe.core.c.a a2)
                throws RemoteException
            {
                PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), com.qihoo360.mobilesafe.core.c.a(a));
                if (c.b(a) != null)
                {
                    c.b(a).post(new Runnable(this, a2) {

                        final _cls1 a;
                        private final com.qihoo360.mobilesafe.core.c.a b;

                        public void run()
                        {
                            if (c.f(com.qihoo360.mobilesafe.core._cls1.a(a)) != null)
                            {
                                c.f(com.qihoo360.mobilesafe.core._cls1.a(a)).register(b);
                            }
                        }

            
            {
                a = _pcls1;
                b = a1;
                super();
            }
                    });
                }
            }

            public void a(String s, boolean flag)
                throws RemoteException
            {
                PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), com.qihoo360.mobilesafe.core.c.a(a));
                if (c.b(a) != null)
                {
                    c.b(a).post(new Runnable(this, flag, s) {

                        final _cls1 a;
                        private final boolean b;
                        private final String c;

                        public void run()
                        {
                            Iterator iterator;
                            int i1;
                            if (b)
                            {
                                i1 = 0;
                            } else
                            {
                                i1 = 1;
                            }
                            if (!b) goto _L2; else goto _L1
_L1:
                            iterator = com.qihoo360.mobilesafe.core.c.h(com.qihoo360.mobilesafe.core._cls1.a(a)).iterator();
_L4:
                            if (iterator.hasNext())
                            {
                                ProcessInfo processinfo = (ProcessInfo)iterator.next();
                                if (!c.equals(processinfo.packageName))
                                {
                                    continue; /* Loop/switch isn't completed */
                                }
                                com.qihoo360.mobilesafe.core.c.h(com.qihoo360.mobilesafe.core._cls1.a(a)).remove(processinfo);
                            }
_L2:
                            com.qihoo360.mobilesafe.core.b.e.a(c.g(com.qihoo360.mobilesafe.core._cls1.a(a))).a(c, i1);
                            return;
                            if (true) goto _L4; else goto _L3
_L3:
                        }

            
            {
                a = _pcls1;
                b = flag;
                c = s;
                super();
            }
                    });
                }
            }

            public void a(List list)
                throws RemoteException
            {
                PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), com.qihoo360.mobilesafe.core.c.a(a));
                if (c.b(a) != null)
                {
                    c.b(a).post(new Runnable(this, list) {

                        final _cls1 a;
                        private final List b;

                        public void run()
                        {
                            if (com.qihoo360.mobilesafe.core.c.e(com.qihoo360.mobilesafe.core._cls1.a(a)) != null)
                            {
                                c.b(com.qihoo360.mobilesafe.core._cls1.a(a), b);
                            }
                        }

            
            {
                a = _pcls1;
                b = list;
                super();
            }
                    });
                }
            }

            public void a(boolean flag)
                throws RemoteException
            {
                PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), com.qihoo360.mobilesafe.core.c.a(a));
                if (c.b(a) != null)
                {
                    c.b(a).post(new Runnable(this, flag) {

                        final _cls1 a;
                        private final boolean b;

                        static _cls1 a(_cls1 _pcls1)
                        {
                            return _pcls1.a;
                        }

                        public void run()
                        {
                            d d1 = new d(this, b) {

                                final _cls1 a;
                                private final boolean b;

                                public void a()
                                {
                                    c.c(com.qihoo360.mobilesafe.core._cls1.a(com.qihoo360.mobilesafe.core._cls1.a(a)));
                                }

                                public void a(List list)
                                {
                                    com.qihoo360.mobilesafe.core.c.a(com.qihoo360.mobilesafe.core._cls1.a(com.qihoo360.mobilesafe.core._cls1.a(a)), list);
                                }

                                public void a(List list, List list1)
                                {
                                    com.qihoo360.mobilesafe.core.c.a(com.qihoo360.mobilesafe.core._cls1.a(com.qihoo360.mobilesafe.core._cls1.a(a)), b, list, list1);
                                }

                                public void b()
                                {
                                    com.qihoo360.mobilesafe.core.c.d(com.qihoo360.mobilesafe.core._cls1.a(com.qihoo360.mobilesafe.core._cls1.a(a)));
                                }

            
            {
                a = _pcls1;
                b = flag;
                super();
            }
                            };
                            com.qihoo360.mobilesafe.core.c.a(com.qihoo360.mobilesafe.core._cls1.a(a), true, b, false, d1);
                        }

            
            {
                a = _pcls1;
                b = flag;
                super();
            }
                    });
                }
            }

            public List b()
                throws RemoteException
            {
                PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), com.qihoo360.mobilesafe.core.c.a(a));
                return com.qihoo360.mobilesafe.core.b.e.a(c.g(a)).e();
            }

            public void b(com.qihoo360.mobilesafe.core.c.a a2)
                throws RemoteException
            {
                PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), com.qihoo360.mobilesafe.core.c.a(a));
                if (c.b(a) != null)
                {
                    c.b(a).post(new Runnable(this, a2) {

                        final _cls1 a;
                        private final com.qihoo360.mobilesafe.core.c.a b;

                        public void run()
                        {
                            if (c.f(com.qihoo360.mobilesafe.core._cls1.a(a)) != null)
                            {
                                c.f(com.qihoo360.mobilesafe.core._cls1.a(a)).unregister(b);
                            }
                        }

            
            {
                a = _pcls1;
                b = a1;
                super();
            }
                    });
                }
            }

            public void b(List list)
                throws RemoteException
            {
                PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), com.qihoo360.mobilesafe.core.c.a(a));
                if (c.b(a) != null)
                {
                    c.b(a).post(new Runnable(this, list) {

                        final _cls1 a;
                        private final List b;

                        public void run()
                        {
                            c.c(com.qihoo360.mobilesafe.core._cls1.a(a), b);
                        }

            
            {
                a = _pcls1;
                b = list;
                super();
            }
                    });
                }
            }

            public void b(boolean flag)
                throws RemoteException
            {
                PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), com.qihoo360.mobilesafe.core.c.a(a));
                if (c.b(a) != null)
                {
                    c.b(a).post(new Runnable(this, flag) {

                        final _cls1 a;
                        private final boolean b;

                        static _cls1 a(_cls3 _pcls3)
                        {
                            return _pcls3.a;
                        }

                        public void run()
                        {
                            d d1 = new d(this, b) {

                                final _cls3 a;
                                private final boolean b;

                                public void a()
                                {
                                    c.c(com.qihoo360.mobilesafe.core._cls1.a(com.qihoo360.mobilesafe.core._cls3.a(a)));
                                }

                                public void a(List list)
                                {
                                    com.qihoo360.mobilesafe.core.c.a(com.qihoo360.mobilesafe.core._cls1.a(com.qihoo360.mobilesafe.core._cls3.a(a)), list);
                                }

                                public void a(List list, List list1)
                                {
                                    com.qihoo360.mobilesafe.core.c.a(com.qihoo360.mobilesafe.core._cls1.a(com.qihoo360.mobilesafe.core._cls3.a(a)), b, list, list1);
                                }

                                public void b()
                                {
                                    com.qihoo360.mobilesafe.core.c.d(com.qihoo360.mobilesafe.core._cls1.a(com.qihoo360.mobilesafe.core._cls3.a(a)));
                                }

            
            {
                a = _pcls3;
                b = flag;
                super();
            }
                            };
                            com.qihoo360.mobilesafe.core.c.a(com.qihoo360.mobilesafe.core._cls1.a(a), true, b, true, d1);
                        }

            
            {
                a = _pcls1;
                b = flag;
                super();
            }
                    });
                }
            }

            public void c()
                throws RemoteException
            {
                PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), com.qihoo360.mobilesafe.core.c.a(a));
                if (c.b(a) != null)
                {
                    c.b(a).post(new Runnable(this) {

                        final _cls1 a;

                        public void run()
                        {
                            com.qihoo360.mobilesafe.core.b.e.a(c.g(com.qihoo360.mobilesafe.core._cls1.a(a))).f();
                        }

            
            {
                a = _pcls1;
                super();
            }
                    });
                }
            }

            public void d()
                throws RemoteException
            {
                PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), com.qihoo360.mobilesafe.core.c.a(a));
                if (c.b(a) != null)
                {
                    c.b(a).post(new Runnable(this) {

                        final _cls1 a;

                        public void run()
                        {
                            com.qihoo360.mobilesafe.core.b.e.a(c.g(com.qihoo360.mobilesafe.core._cls1.a(a))).c(c.g(com.qihoo360.mobilesafe.core._cls1.a(a)));
                        }

            
            {
                a = _pcls1;
                super();
            }
                    });
                }
            }

            public void e()
                throws RemoteException
            {
                PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), com.qihoo360.mobilesafe.core.c.a(a));
                if (c.b(a) != null)
                {
                    c.b(a).post(new Runnable(this) {

                        final _cls1 a;

                        public void run()
                        {
                            c.c(com.qihoo360.mobilesafe.core._cls1.a(a), null);
                        }

            
            {
                a = _pcls1;
                super();
            }
                    });
                }
            }

            public boolean f()
                throws RemoteException
            {
                PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), com.qihoo360.mobilesafe.core.c.a(a));
                return c.i(a) && c.j(a);
            }

            public boolean g()
                throws RemoteException
            {
                PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), com.qihoo360.mobilesafe.core.c.a(a));
                return c.j(a);
            }

            public List h()
                throws RemoteException
            {
                PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), com.qihoo360.mobilesafe.core.c.a(a));
                return c.k(a);
            }

            public long i()
                throws RemoteException
            {
                PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), com.qihoo360.mobilesafe.core.c.a(a));
                return com.qihoo360.mobilesafe.core.d.h.b(c.g(a));
            }

            
            {
                a = c.this;
                super();
            }
        };
        System.currentTimeMillis();
        l = context;
        m = a1;
        g = context.getPackageManager();
        j = new Handler();
        h = new b(context);
        i = new com.qihoo360.mobilesafe.core.a(context);
        c = new ArrayList();
        d = new ArrayList();
        e = new ArrayList();
    }

    static PackageManager a(c c1)
    {
        return c1.g;
    }

    public static c a(Context context, com.qihoo.security.service.a a1)
    {
        if (k != null) goto _L2; else goto _L1
_L1:
        com/qihoo360/mobilesafe/core/c;
        JVM INSTR monitorenter ;
        if (k == null)
        {
            k = new c(context, a1);
        }
        com/qihoo360/mobilesafe/core/c;
        JVM INSTR monitorexit ;
_L2:
        return k;
        context;
        com/qihoo360/mobilesafe/core/c;
        JVM INSTR monitorexit ;
        throw context;
    }

    private void a(int i1)
    {
        boolean flag = true;
        if (m == null) goto _L2; else goto _L1
_L1:
        long l1;
        long l2;
        l1 = Utils.getMemoryTotalKb();
        l2 = m.d();
        l1 = l1 - l2 - (long)i1;
_L3:
        Exception exception;
        try
        {
            i1 = (int)((l1 * 100L) / Utils.getMemoryTotalKb());
        }
        catch (Exception exception1)
        {
            return;
        }
        if (i1 < 1)
        {
            i1 = ((flag) ? 1 : 0);
        }
        m.a(i1);
_L2:
        return;
        exception;
        l1 = Utils.getMemoryTotalKb() - Utils.getMemoryFreeKb() - (long)i1;
          goto _L3
    }

    private void a(int i1, int j1)
    {
        a(j1);
        if (b == null) goto _L2; else goto _L1
_L1:
        int k1;
        int l1;
        l1 = b.beginBroadcast();
        k1 = 0;
_L6:
        if (k1 < l1) goto _L4; else goto _L3
_L3:
        b.finishBroadcast();
_L2:
        if (m == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        m.b(i1, j1);
        return;
_L4:
        Exception exception;
        try
        {
            ((com.qihoo360.mobilesafe.core.c.a)b.getBroadcastItem(k1)).a(i1, j1);
        }
        catch (Exception exception1) { }
        k1++;
        if (true) goto _L6; else goto _L5
_L5:
        exception;
    }

    static void a(c c1, int i1, int j1)
    {
        c1.b(i1, j1);
    }

    static void a(c c1, List list)
    {
        c1.c(list);
    }

    static void a(c c1, boolean flag, List list, List list1)
    {
        c1.a(flag, list, list1);
    }

    static void a(c c1, boolean flag, boolean flag1, boolean flag2, d d1)
    {
        c1.a(flag, flag1, flag2, d1);
    }

    private void a(List list)
    {
        if (h != null)
        {
            list = new a(list);
            h.a(true, list);
        }
    }

    private void a(List list, boolean flag, boolean flag1)
    {
        ArrayList arraylist;
        int i1;
        arraylist = new ArrayList();
        int j1;
        if (list != null && !list.isEmpty())
        {
            if (flag1)
            {
                arraylist.addAll(list);
            } else
            {
                list = list.iterator();
                while (list.hasNext()) 
                {
                    ProcessInfo processinfo = (ProcessInfo)list.next();
                    if (processinfo.flag != 3)
                    {
                        arraylist.add(processinfo);
                    }
                }
            }
        }
        if (b == null) goto _L2; else goto _L1
_L1:
        j1 = b.beginBroadcast();
        i1 = 0;
_L6:
        if (i1 < j1) goto _L4; else goto _L3
_L3:
        b.finishBroadcast();
_L2:
        return;
_L4:
        try
        {
            ((com.qihoo360.mobilesafe.core.c.a)b.getBroadcastItem(i1)).a(arraylist, flag);
        }
        // Misplaced declaration of an exception variable
        catch (List list) { }
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(boolean flag, List list, List list1)
    {
        int i1;
        l();
        d.clear();
        c.clear();
        if (list != null && !list.isEmpty())
        {
            c.addAll(list);
        }
        if (list1 != null && !list1.isEmpty())
        {
            c.addAll(list1);
        }
        list1 = new ArrayList();
        int j1;
        if (flag)
        {
            list1.addAll(c);
        } else
        if (list != null && !list.isEmpty())
        {
            list1.addAll(list);
        }
        if (b == null) goto _L2; else goto _L1
_L1:
        j1 = b.beginBroadcast();
        i1 = 0;
_L6:
        if (i1 < j1) goto _L4; else goto _L3
_L3:
        b.finishBroadcast();
_L2:
        return;
_L4:
        try
        {
            ((com.qihoo360.mobilesafe.core.c.a)b.getBroadcastItem(i1)).a(list1, false);
        }
        // Misplaced declaration of an exception variable
        catch (List list) { }
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(boolean flag, boolean flag1, boolean flag2, d d1)
    {
        boolean flag3 = f();
        if (flag2 || !flag3)
        {
            if (h != null && !h.())
            {
                h.a(flag, d1);
            }
            return;
        }
        if (f)
        {
            a(((List) (null)), true, flag1);
            return;
        }
        d1 = new ArrayList(c);
        Iterator iterator = c.iterator();
label0:
        do
        {
            if (!iterator.hasNext())
            {
                a(((List) (d1)), false, flag1);
                return;
            }
            ProcessInfo processinfo = (ProcessInfo)iterator.next();
            Iterator iterator1 = d.iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    continue label0;
                }
            } while (!((String)iterator1.next()).equals(processinfo.packageName));
            d1.remove(processinfo);
        } while (true);
    }

    static Handler b(c c1)
    {
        return c1.j;
    }

    private void b(int i1, int j1)
    {
        a(j1);
        if (b == null) goto _L2; else goto _L1
_L1:
        int k1;
        int l1;
        l1 = b.beginBroadcast();
        k1 = 0;
_L6:
        if (k1 < l1) goto _L4; else goto _L3
_L3:
        b.finishBroadcast();
_L2:
        if (m == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        m.a(i1, j1);
        return;
_L4:
        Exception exception;
        try
        {
            ((com.qihoo360.mobilesafe.core.c.a)b.getBroadcastItem(k1)).b(i1, j1);
        }
        catch (Exception exception1) { }
        k1++;
        if (true) goto _L6; else goto _L5
_L5:
        exception;
    }

    static void b(c c1, int i1, int j1)
    {
        c1.a(i1, j1);
    }

    static void b(c c1, List list)
    {
        c1.b(list);
    }

    private void b(List list)
    {
        if (i != null)
        {
            com.qihoo360.mobilesafe.core.a.a a1 = new com.qihoo360.mobilesafe.core.a.a() {

                final c a;

                public void a(int i1, int j1)
                {
                    c.b(a, i1, j1);
                }

                public void b(List list1)
                {
                    com.qihoo360.mobilesafe.core.c.d(a, list1);
                }

                public void c()
                {
                    c.m(a);
                }

            
            {
                a = c.this;
                super();
            }
            };
            i.a(list, a1);
        }
    }

    static void c(c c1)
    {
        c1.h();
    }

    static void c(c c1, List list)
    {
        c1.a(list);
    }

    private void c(List list)
    {
        if (list != null && !list.isEmpty())
        {
            e.clear();
            e.addAll(list);
        }
    }

    static void d(c c1)
    {
        c1.i();
    }

    static void d(c c1, List list)
    {
        c1.d(list);
    }

    private void d(List list)
    {
        int i1;
        i1 = 0;
        f = false;
        g();
        list = list.iterator();
_L5:
        if (list.hasNext()) goto _L2; else goto _L1
_L1:
        if (b == null) goto _L4; else goto _L3
_L3:
        int j1 = b.beginBroadcast();
_L6:
        if (i1 < j1)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        b.finishBroadcast();
_L4:
        return;
_L2:
        KillBean killbean = (KillBean)list.next();
        d.add(killbean.packageName);
          goto _L5
        try
        {
            ((com.qihoo360.mobilesafe.core.c.a)b.getBroadcastItem(i1)).d();
        }
        // Misplaced declaration of an exception variable
        catch (List list) { }
        i1++;
          goto _L6
    }

    static com.qihoo360.mobilesafe.core.a e(c c1)
    {
        return c1.i;
    }

    static String e()
    {
        return a;
    }

    static RemoteCallbackList f(c c1)
    {
        return c1.b;
    }

    private boolean f()
    {
        return Math.abs(System.currentTimeMillis() - n) <= 60000L;
    }

    static Context g(c c1)
    {
        return c1.l;
    }

    private void g()
    {
        n = System.currentTimeMillis();
        com.qihoo360.mobilesafe.core.d.h.a(l);
    }

    static List h(c c1)
    {
        return c1.c;
    }

    private void h()
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        j1 = b.beginBroadcast();
        i1 = 0;
_L6:
        if (i1 < j1) goto _L4; else goto _L3
_L3:
        b.finishBroadcast();
_L2:
        return;
_L4:
        try
        {
            ((com.qihoo360.mobilesafe.core.c.a)b.getBroadcastItem(i1)).a();
        }
        catch (Exception exception) { }
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void i()
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        j1 = b.beginBroadcast();
        i1 = 0;
_L6:
        if (i1 < j1) goto _L4; else goto _L3
_L3:
        b.finishBroadcast();
_L2:
        return;
_L4:
        try
        {
            ((com.qihoo360.mobilesafe.core.c.a)b.getBroadcastItem(i1)).c();
        }
        catch (Exception exception) { }
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static boolean i(c c1)
    {
        return c1.f;
    }

    private void j()
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        j1 = b.beginBroadcast();
        i1 = 0;
_L6:
        if (i1 < j1) goto _L4; else goto _L3
_L3:
        b.finishBroadcast();
_L2:
        return;
_L4:
        try
        {
            ((com.qihoo360.mobilesafe.core.c.a)b.getBroadcastItem(i1)).e();
        }
        catch (Exception exception) { }
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static boolean j(c c1)
    {
        return c1.f();
    }

    static List k(c c1)
    {
        return c1.e;
    }

    private void k()
    {
        f = true;
        g();
        d.clear();
        l();
        if (b == null) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        j1 = b.beginBroadcast();
        i1 = 0;
_L6:
        if (i1 < j1) goto _L4; else goto _L3
_L3:
        b.finishBroadcast();
_L2:
        return;
_L4:
        try
        {
            ((com.qihoo360.mobilesafe.core.c.a)b.getBroadcastItem(i1)).b();
        }
        catch (Exception exception) { }
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void l()
    {
        if (m == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        m.e();
        return;
        Exception exception;
        exception;
    }

    static void l(c c1)
    {
        c1.k();
    }

    static void m(c c1)
    {
        c1.j();
    }

    public void a()
    {
        com.qihoo360.mobilesafe.core.b.e.a(l).f();
    }

    public boolean b()
    {
        boolean flag = false;
        if (o != null)
        {
            try
            {
                flag = o.f();
            }
            catch (RemoteException remoteexception)
            {
                return false;
            }
        }
        return flag;
    }

    public IBinder c()
    {
        return o;
    }

    public void d()
    {
        if (j != null)
        {
            j.removeCallbacksAndMessages(null);
        }
    }

}
