// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.enginehelper.clean;

import android.content.Context;
import android.util.Log;
import com.qihoo.security.clearengine.TrashType;
import com.qihoo.security.opti.trashclear.ui.e;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;
import com.qihoo360.mobilesafe.opti.i.whitelist.UserBWRecord;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.qihoo.security.enginehelper.clean:
//            CleanScanType, CleanTrashType

public class com.qihoo.security.enginehelper.clean.a
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(int i1, Map map);

        public abstract void b();

        public abstract void c();

        public abstract void d();
    }

    public static interface b
    {

        public abstract void a();

        public abstract void a(int i1, Map map);

        public abstract void a(Map map);

        public abstract void b();

        public abstract void b(int i1, Map map);

        public abstract void c();
    }


    private static boolean a;
    private static String b;
    private static com.qihoo.security.enginehelper.clean.a h;
    private int c;
    private int d;
    private int e;
    private int f;
    private com.qihoo.security.clearengine.b.a g;
    private Context i;
    private CleanScanType j;
    private CleanScanType k;
    private CleanTrashType l[];
    private ArrayList m;
    private WeakReference n;
    private WeakReference o;
    private WeakReference p;
    private List q;
    private e r;
    private ExecutorService s;
    private byte t[];
    private com.qihoo.security.clearengine.surface.a u;

    private com.qihoo.security.enginehelper.clean.a(Context context)
    {
        c = 0;
        d = 0;
        e = 0;
        f = 100;
        g = null;
        s = Executors.newSingleThreadExecutor();
        t = new byte[0];
        u = new com.qihoo.security.clearengine.surface.a() {

            final com.qihoo.security.enginehelper.clean.a a;
            private int b;
            private int c;

            static int a(_cls3 _pcls3)
            {
                return _pcls3.c;
            }

            public void a()
            {
                b = 0;
                if (com.qihoo.security.enginehelper.clean.a.h())
                {
                    Log.i(com.qihoo.security.enginehelper.clean.a.i(), "scan trash start");
                }
                com.qihoo.security.enginehelper.clean.a a1 = a;
                a1;
                JVM INSTR monitorenter ;
                b b1;
                if (com.qihoo.security.enginehelper.clean.a.h(a) == null)
                {
                    break MISSING_BLOCK_LABEL_61;
                }
                b1 = (b)com.qihoo.security.enginehelper.clean.a.h(a).get();
                if (b1 == null)
                {
                    break MISSING_BLOCK_LABEL_61;
                }
                b1.a();
                a1;
                JVM INSTR monitorexit ;
                return;
                Exception exception;
                exception;
                a1;
                JVM INSTR monitorexit ;
                throw exception;
            }

            public void a(int i1)
            {
                if (c < i1)
                {
                    c = i1;
                }
                if (com.qihoo.security.enginehelper.clean.a.h())
                {
                    Log.i(com.qihoo.security.enginehelper.clean.a.i(), "clean trash finished");
                }
                com.qihoo.security.enginehelper.clean.a.o(a).execute(new Runnable(this) {

                    final _cls3 a;

                    public void run()
                    {
                        com.qihoo.security.enginehelper.clean.a a1 = a.a;
                        a1;
                        JVM INSTR monitorenter ;
                        a a2;
                        if (com.qihoo.security.enginehelper.clean.a.p(a.a) == null)
                        {
                            break MISSING_BLOCK_LABEL_56;
                        }
                        a2 = (a)com.qihoo.security.enginehelper.clean.a.p(a.a).get();
                        if (a2 == null)
                        {
                            break MISSING_BLOCK_LABEL_56;
                        }
                        a2.c();
                        a2.b();
                        a1;
                        JVM INSTR monitorexit ;
                        a1 = a.a;
                        a1;
                        JVM INSTR monitorenter ;
                        com.qihoo.security.enginehelper.clean.a.b(a.a, 0);
                        if (com.qihoo.security.enginehelper.clean.a.n(a.a) != 1 && com.qihoo.security.enginehelper.clean.a.i(a.a) != 1) goto _L2; else goto _L1
_L1:
                        com.qihoo.security.enginehelper.clean.a.b(a.a, 1);
_L3:
                        return;
                        Exception exception;
                        exception;
                        a1;
                        JVM INSTR monitorexit ;
                        throw exception;
_L2:
                        if (com.qihoo.security.enginehelper.clean.a.n(a.a) != 31)
                        {
                            break MISSING_BLOCK_LABEL_173;
                        }
                        com.qihoo.security.enginehelper.clean.a.c(a.a, 0);
                        com.qihoo.security.enginehelper.clean.a.g(a.a);
                          goto _L3
                        exception;
                        a1;
                        JVM INSTR monitorexit ;
                        throw exception;
                        if (com.qihoo.security.enginehelper.clean.a.i(a.a) != 21) goto _L5; else goto _L4
_L4:
                        com.qihoo.security.enginehelper.clean.a.a(a.a, 0);
                        com.qihoo.security.enginehelper.clean.a.d(a.a);
                          goto _L3
_L5:
                        if (com.qihoo.security.enginehelper.clean.a.i(a.a) != 22) goto _L3; else goto _L6
_L6:
                        com.qihoo.security.enginehelper.clean.a.a(a.a, 0);
                          goto _L3
                    }

            
            {
                a = _pcls3;
                super();
            }
                });
            }

            public void a(int i1, int j1, TrashType trashtype, TrashInfo trashinfo, Map map)
            {
                if (c < i1)
                {
                    c = i1;
                }
                if (com.qihoo.security.enginehelper.clean.a.h())
                {
                    Log.i(com.qihoo.security.enginehelper.clean.a.i(), (new StringBuilder()).append("clean trash progress:").append(c).toString());
                }
                com.qihoo.security.enginehelper.clean.a.o(a).execute(new Runnable(this, map) {

                    final Map a;
                    final _cls3 b;

                    public void run()
                    {
                        com.qihoo.security.enginehelper.clean.a a1 = b.a;
                        a1;
                        JVM INSTR monitorenter ;
                        a a2;
                        if (com.qihoo.security.enginehelper.clean.a.p(b.a) == null)
                        {
                            break MISSING_BLOCK_LABEL_61;
                        }
                        a2 = (a)com.qihoo.security.enginehelper.clean.a.p(b.a).get();
                        if (a2 == null)
                        {
                            break MISSING_BLOCK_LABEL_61;
                        }
                        a2.a(_cls3.a(b), a);
                        a1;
                        JVM INSTR monitorexit ;
                        return;
                        Exception exception;
                        exception;
                        a1;
                        JVM INSTR monitorexit ;
                        throw exception;
                    }

            
            {
                b = _pcls3;
                a = map;
                super();
            }
                });
            }

            public void a(int i1, String s1, Map map)
            {
                if (com.qihoo.security.enginehelper.clean.a.i(a) == 22)
                {
                    return;
                }
                if (b < i1)
                {
                    b = i1;
                }
                if (com.qihoo.security.enginehelper.clean.a.h())
                {
                    Log.i(com.qihoo.security.enginehelper.clean.a.i(), (new StringBuilder()).append("scan trash progress:").append(b).toString());
                }
                s1 = a;
                s1;
                JVM INSTR monitorenter ;
                b b1;
                if (com.qihoo.security.enginehelper.clean.a.h(a) == null)
                {
                    break MISSING_BLOCK_LABEL_110;
                }
                b1 = (b)com.qihoo.security.enginehelper.clean.a.h(a).get();
                if (b1 == null)
                {
                    break MISSING_BLOCK_LABEL_110;
                }
                b1.a(b, map);
                s1;
                JVM INSTR monitorexit ;
                return;
                map;
                s1;
                JVM INSTR monitorexit ;
                throw map;
            }

            public void a(int i1, Map map, com.qihoo.security.clearengine.sdk.b b1)
            {
                if (b < i1)
                {
                    b = i1;
                }
                if (com.qihoo.security.enginehelper.clean.a.h())
                {
                    Log.i(com.qihoo.security.enginehelper.clean.a.i(), "scan trash finished");
                }
                b1 = a;
                b1;
                JVM INSTR monitorenter ;
                b b2;
                if (com.qihoo.security.enginehelper.clean.a.h(a) == null)
                {
                    break MISSING_BLOCK_LABEL_77;
                }
                b2 = (b)com.qihoo.security.enginehelper.clean.a.h(a).get();
                if (b2 == null)
                {
                    break MISSING_BLOCK_LABEL_77;
                }
                b2.b(b, map);
                if (com.qihoo.security.enginehelper.clean.a.i(a) == 22)
                {
                    a.a();
                }
                b1;
                JVM INSTR monitorexit ;
                synchronized (com.qihoo.security.enginehelper.clean.a.e(a))
                {
                    if (com.qihoo.security.enginehelper.clean.a.j(a) == 13)
                    {
                        com.qihoo.security.enginehelper.clean.a.b(a, 14);
                        com.qihoo.security.enginehelper.clean.a.f(a);
                    }
                }
                return;
                map;
                b1;
                JVM INSTR monitorexit ;
                throw map;
                b1;
                map;
                JVM INSTR monitorexit ;
                throw b1;
            }

            public void a(Map map)
            {
                if (com.qihoo.security.enginehelper.clean.a.h())
                {
                    Log.i(com.qihoo.security.enginehelper.clean.a.i(), "get trash data finished");
                }
                if (com.qihoo.security.enginehelper.clean.a.k(a) == CleanScanType.FULL)
                {
                    com.qihoo.security.enginehelper.clean.a.a(a, new e(com.qihoo.security.enginehelper.clean.a.l(a)));
                    com.qihoo.security.enginehelper.clean.a.m(a).a(map);
                }
                com.qihoo.security.enginehelper.clean.a.o(a).execute(new Runnable(this, map) {

                    final Map a;
                    final _cls3 b;

                    public void run()
                    {
                        com.qihoo.security.enginehelper.clean.a a1 = b.a;
                        a1;
                        JVM INSTR monitorenter ;
                        b b1;
                        if (com.qihoo.security.enginehelper.clean.a.h(b.a) == null)
                        {
                            break MISSING_BLOCK_LABEL_60;
                        }
                        b1 = (b)com.qihoo.security.enginehelper.clean.a.h(b.a).get();
                        if (b1 == null)
                        {
                            break MISSING_BLOCK_LABEL_60;
                        }
                        b1.a(a);
                        b1.b();
                        a1;
                        JVM INSTR monitorexit ;
                        a1 = b.a;
                        a1;
                        JVM INSTR monitorenter ;
                        com.qihoo.security.enginehelper.clean.a.b(b.a, 0);
                        if (com.qihoo.security.enginehelper.clean.a.n(b.a) != 1 && com.qihoo.security.enginehelper.clean.a.i(b.a) != 1) goto _L2; else goto _L1
_L1:
                        com.qihoo.security.enginehelper.clean.a.b(b.a, 1);
_L3:
                        return;
                        Exception exception;
                        exception;
                        a1;
                        JVM INSTR monitorexit ;
                        throw exception;
_L2:
                        if (com.qihoo.security.enginehelper.clean.a.n(b.a) != 31)
                        {
                            break MISSING_BLOCK_LABEL_177;
                        }
                        com.qihoo.security.enginehelper.clean.a.c(b.a, 0);
                        com.qihoo.security.enginehelper.clean.a.g(b.a);
                          goto _L3
                        exception;
                        a1;
                        JVM INSTR monitorexit ;
                        throw exception;
                        if (com.qihoo.security.enginehelper.clean.a.i(b.a) != 21) goto _L5; else goto _L4
_L4:
                        com.qihoo.security.enginehelper.clean.a.a(b.a, 0);
                        com.qihoo.security.enginehelper.clean.a.d(b.a);
                          goto _L3
_L5:
                        if (com.qihoo.security.enginehelper.clean.a.i(b.a) != 22) goto _L3; else goto _L6
_L6:
                        com.qihoo.security.enginehelper.clean.a.a(b.a, 0);
                          goto _L3
                    }

            
            {
                b = _pcls3;
                a = map;
                super();
            }
                });
            }

            public void a(boolean flag)
            {
                if (com.qihoo.security.enginehelper.clean.a.h())
                {
                    Log.i(com.qihoo.security.enginehelper.clean.a.i(), (new StringBuilder()).append("init engine finished flag:").append(flag).toString());
                }
                if (flag)
                {
                    com.qihoo.security.enginehelper.clean.a.d(a, 101);
                }
            }

            public void b()
            {
                c = 0;
                if (com.qihoo.security.enginehelper.clean.a.h())
                {
                    Log.i(com.qihoo.security.enginehelper.clean.a.i(), "clean trash start");
                }
                com.qihoo.security.enginehelper.clean.a.o(a).execute(new Runnable(this) {

                    final _cls3 a;

                    public void run()
                    {
                        com.qihoo.security.enginehelper.clean.a a1 = a.a;
                        a1;
                        JVM INSTR monitorenter ;
                        a a2;
                        if (com.qihoo.security.enginehelper.clean.a.p(a.a) == null)
                        {
                            break MISSING_BLOCK_LABEL_50;
                        }
                        a2 = (a)com.qihoo.security.enginehelper.clean.a.p(a.a).get();
                        if (a2 == null)
                        {
                            break MISSING_BLOCK_LABEL_50;
                        }
                        a2.a();
                        a1;
                        JVM INSTR monitorexit ;
                        return;
                        Exception exception;
                        exception;
                        a1;
                        JVM INSTR monitorexit ;
                        throw exception;
                    }

            
            {
                a = _pcls3;
                super();
            }
                });
            }

            public void b(int i1)
            {
                com.qihoo.security.enginehelper.clean.a.o(a).execute(new Runnable(this, i1) {

                    final int a;
                    final _cls3 b;

                    public void run()
                    {
                        com.qihoo.security.enginehelper.clean.a a1 = b.a;
                        a1;
                        JVM INSTR monitorenter ;
                        a;
                        JVM INSTR tableswitch 1 4: default 317
                    //                                   1 111
                    //                                   2 111
                    //                                   3 159
                    //                                   4 159;
                           goto _L1 _L2 _L2 _L3 _L3
_L1:
                        a1 = b.a;
                        a1;
                        JVM INSTR monitorenter ;
                        com.qihoo.security.enginehelper.clean.a.b(b.a, 0);
                        if (com.qihoo.security.enginehelper.clean.a.n(b.a) != 1 && com.qihoo.security.enginehelper.clean.a.i(b.a) != 1) goto _L5; else goto _L4
_L4:
                        com.qihoo.security.enginehelper.clean.a.b(b.a, 1);
_L12:
                        return;
_L2:
                        if (com.qihoo.security.enginehelper.clean.a.h(b.a) == null) goto _L1; else goto _L6
_L6:
                        Object obj = (b)com.qihoo.security.enginehelper.clean.a.h(b.a).get();
                        if (obj == null) goto _L1; else goto _L7
_L7:
                        ((b) (obj)).c();
                          goto _L1
                        Exception exception;
                        exception;
                        a1;
                        JVM INSTR monitorexit ;
                        throw exception;
_L3:
                        if (com.qihoo.security.enginehelper.clean.a.p(b.a) == null) goto _L1; else goto _L8
_L8:
                        exception = (a)com.qihoo.security.enginehelper.clean.a.p(b.a).get();
                        if (exception == null) goto _L1; else goto _L9
_L9:
                        exception.d();
                          goto _L1
_L5:
                        if (com.qihoo.security.enginehelper.clean.a.n(b.a) != 31) goto _L11; else goto _L10
_L10:
                        com.qihoo.security.enginehelper.clean.a.c(b.a, 0);
                        com.qihoo.security.enginehelper.clean.a.g(b.a);
                          goto _L12
                        exception;
                        a1;
                        JVM INSTR monitorexit ;
                        throw exception;
_L11:
                        if (com.qihoo.security.enginehelper.clean.a.i(b.a) != 21) goto _L14; else goto _L13
_L13:
                        com.qihoo.security.enginehelper.clean.a.a(b.a, 0);
                        com.qihoo.security.enginehelper.clean.a.d(b.a);
                          goto _L12
_L14:
                        if (com.qihoo.security.enginehelper.clean.a.i(b.a) != 22) goto _L12; else goto _L15
_L15:
                        com.qihoo.security.enginehelper.clean.a.a(b.a, 0);
                          goto _L12
                    }

            
            {
                b = _pcls3;
                a = i1;
                super();
            }
                });
            }

            
            {
                a = com.qihoo.security.enginehelper.clean.a.this;
                super();
            }
        };
        i = context;
        j();
    }

    static int a(com.qihoo.security.enginehelper.clean.a a1, int i1)
    {
        a1.d = i1;
        return i1;
    }

    static CleanScanType a(com.qihoo.security.enginehelper.clean.a a1, CleanScanType cleanscantype)
    {
        a1.j = cleanscantype;
        return cleanscantype;
    }

    public static final com.qihoo.security.enginehelper.clean.a a(Context context)
    {
        if (h != null) goto _L2; else goto _L1
_L1:
        com/qihoo/security/enginehelper/clean/a;
        JVM INSTR monitorenter ;
        if (h == null)
        {
            h = new com.qihoo.security.enginehelper.clean.a(context);
        }
        com/qihoo/security/enginehelper/clean/a;
        JVM INSTR monitorexit ;
_L2:
        return h;
        context;
        com/qihoo/security/enginehelper/clean/a;
        JVM INSTR monitorexit ;
        throw context;
    }

    static e a(com.qihoo.security.enginehelper.clean.a a1, e e1)
    {
        a1.r = e1;
        return e1;
    }

    static WeakReference a(com.qihoo.security.enginehelper.clean.a a1, WeakReference weakreference)
    {
        a1.n = weakreference;
        return weakreference;
    }

    static ArrayList a(com.qihoo.security.enginehelper.clean.a a1, ArrayList arraylist)
    {
        a1.m = arraylist;
        return arraylist;
    }

    static List a(com.qihoo.security.enginehelper.clean.a a1, List list)
    {
        a1.q = list;
        return list;
    }

    private void a(Exception exception)
    {
        a(exception, true);
    }

    private void a(Exception exception, boolean flag)
    {
        if (a)
        {
            Log.i(b, "use a release engine", exception);
        }
        e = 1;
        d = 1;
        c = 1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        this;
        JVM INSTR monitorenter ;
        if (n == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        exception = (b)n.get();
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        exception.c();
        if (p == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        exception = (a)p.get();
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        exception.d();
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static boolean a(com.qihoo.security.enginehelper.clean.a a1)
    {
        return a1.o();
    }

    static CleanTrashType[] a(com.qihoo.security.enginehelper.clean.a a1, CleanTrashType acleantrashtype[])
    {
        a1.l = acleantrashtype;
        return acleantrashtype;
    }

    static int b(com.qihoo.security.enginehelper.clean.a a1, int i1)
    {
        a1.c = i1;
        return i1;
    }

    static CleanScanType b(com.qihoo.security.enginehelper.clean.a a1, CleanScanType cleanscantype)
    {
        a1.k = cleanscantype;
        return cleanscantype;
    }

    static WeakReference b(com.qihoo.security.enginehelper.clean.a a1, WeakReference weakreference)
    {
        a1.o = weakreference;
        return weakreference;
    }

    static void b(com.qihoo.security.enginehelper.clean.a a1)
    {
        a1.l();
    }

    static int c(com.qihoo.security.enginehelper.clean.a a1, int i1)
    {
        a1.e = i1;
        return i1;
    }

    static void c(com.qihoo.security.enginehelper.clean.a a1)
    {
        a1.n();
    }

    static int d(com.qihoo.security.enginehelper.clean.a a1, int i1)
    {
        a1.f = i1;
        return i1;
    }

    static void d(com.qihoo.security.enginehelper.clean.a a1)
    {
        a1.k();
    }

    static byte[] e(com.qihoo.security.enginehelper.clean.a a1)
    {
        return a1.t;
    }

    static void f(com.qihoo.security.enginehelper.clean.a a1)
    {
        a1.p();
    }

    static void g(com.qihoo.security.enginehelper.clean.a a1)
    {
        a1.q();
    }

    static WeakReference h(com.qihoo.security.enginehelper.clean.a a1)
    {
        return a1.n;
    }

    static boolean h()
    {
        return a;
    }

    static int i(com.qihoo.security.enginehelper.clean.a a1)
    {
        return a1.d;
    }

    static String i()
    {
        return b;
    }

    static int j(com.qihoo.security.enginehelper.clean.a a1)
    {
        return a1.c;
    }

    private void j()
    {
        g = new com.qihoo.security.clearengine.b.a(i);
        c = 0;
        d = 0;
        e = 0;
    }

    static CleanScanType k(com.qihoo.security.enginehelper.clean.a a1)
    {
        return a1.j;
    }

    private void k()
    {
        byte byte0;
        int i1;
        byte byte1;
        i1 = 0;
        byte1 = 11;
        c = 12;
        j = k;
        byte0 = byte1;
        if (j == null) goto _L2; else goto _L1
_L1:
        byte0 = byte1;
        static class _cls6
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[CleanTrashType.values().length];
                try
                {
                    b[CleanTrashType.APK.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[CleanTrashType.BIGFILE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[CleanTrashType.CACHE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[CleanTrashType.PROCESS.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[CleanTrashType.SYSTEM.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[CleanTrashType.UNINSTALLED.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                a = new int[CleanScanType.values().length];
                try
                {
                    a[CleanScanType.FULL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[CleanScanType.NOTIFICATION.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[CleanScanType.PREPOSE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls6.a[j.ordinal()];
        JVM INSTR tableswitch 1 3: default 72
    //                   1 76
    //                   2 76
    //                   3 209;
           goto _L3 _L4 _L4 _L5
_L4:
        break; /* Loop/switch isn't completed */
_L3:
        byte0 = byte1;
_L2:
        Object obj;
        CleanTrashType acleantrashtype[];
        CleanTrashType cleantrashtype;
        int j1;
        int k1;
        try
        {
            g.b(byte0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a(((Exception) (obj)));
            return;
        }
        acleantrashtype = null;
        obj = acleantrashtype;
        if (l == null) goto _L7; else goto _L6
_L6:
        obj = acleantrashtype;
        if (l.length <= 0) goto _L7; else goto _L8
_L8:
        obj = new int[l.length];
        acleantrashtype = l;
        k1 = acleantrashtype.length;
        j1 = 0;
_L17:
        if (i1 >= k1) goto _L7; else goto _L9
_L9:
        cleantrashtype = acleantrashtype[i1];
        _cls6.b[cleantrashtype.ordinal()];
        JVM INSTR tableswitch 1 6: default 184
    //                   1 223
    //                   2 230
    //                   3 237
    //                   4 244
    //                   5 251
    //                   6 258;
           goto _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L10:
        byte0 = 36;
_L18:
        obj[j1] = byte0;
        j1++;
        i1++;
          goto _L17
_L5:
        byte0 = 14;
        continue; /* Loop/switch isn't completed */
_L11:
        byte0 = 34;
          goto _L18
_L12:
        byte0 = 35;
          goto _L18
_L13:
        byte0 = 32;
          goto _L18
_L14:
        byte0 = 31;
          goto _L18
_L15:
        byte0 = 36;
          goto _L18
_L16:
        byte0 = 33;
          goto _L18
_L7:
        g.a(((int []) (obj)));
        g.a(m);
        g.b();
        m();
        return;
        Exception exception;
        exception;
        a(exception);
        return;
        if (true) goto _L2; else goto _L19
_L19:
    }

    static Context l(com.qihoo.security.enginehelper.clean.a a1)
    {
        return a1.i;
    }

    private void l()
    {
        if (a && a)
        {
            Log.i(b, "check engine state");
        }
        if (!g.f())
        {
            f = 100;
        }
        if (f == 101) goto _L2; else goto _L1
_L1:
        int i1;
        e();
        i1 = 0;
_L8:
        if (f != 101) goto _L4; else goto _L3
_L3:
        if (a)
        {
            Log.i(b, (new StringBuilder()).append("check engine state success used time:").append((long)i1 * 50L).toString());
        }
_L6:
        return;
_L2:
        if (!a) goto _L6; else goto _L5
_L5:
        Log.i(b, "check engine state success");
        return;
_L4:
        int j1;
        try
        {
            Thread.sleep(50L);
        }
        catch (InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
        j1 = i1 + 1;
        i1 = j1;
        if ((long)j1 == 40L)
        {
            Log.i(b, "check engine state fail");
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    static e m(com.qihoo.security.enginehelper.clean.a a1)
    {
        return a1.r;
    }

    private void m()
    {
        if (a)
        {
            Log.d(b, "scantest cleanEngineHelper startScanTrash");
        }
        c = 13;
        n = o;
        if (j == CleanScanType.FULL)
        {
            r = null;
        }
        try
        {
            g.c();
            return;
        }
        catch (Exception exception)
        {
            a(exception);
        }
    }

    static int n(com.qihoo.security.enginehelper.clean.a a1)
    {
        return a1.e;
    }

    private void n()
    {
        c = 15;
        try
        {
            g.d();
            return;
        }
        catch (Exception exception)
        {
            a(exception, false);
        }
    }

    static ExecutorService o(com.qihoo.security.enginehelper.clean.a a1)
    {
        return a1.s;
    }

    private boolean o()
    {
        return c != 0 && c != 1;
    }

    static WeakReference p(com.qihoo.security.enginehelper.clean.a a1)
    {
        return a1.p;
    }

    private void p()
    {
        try
        {
            g.a(TrashType.ALL_TRASH_TYPES);
            return;
        }
        catch (Exception exception)
        {
            a(exception);
        }
    }

    static com.qihoo.security.clearengine.surface.a q(com.qihoo.security.enginehelper.clean.a a1)
    {
        return a1.u;
    }

    private void q()
    {
        c = 12;
        r();
    }

    static com.qihoo.security.clearengine.b.a r(com.qihoo.security.enginehelper.clean.a a1)
    {
        return a1.g;
    }

    private void r()
    {
        c = 41;
        try
        {
            g.a(q);
            return;
        }
        catch (Exception exception)
        {
            a(exception);
        }
    }

    public List a(int i1)
    {
        List list;
        try
        {
            list = g.a(i1);
        }
        catch (Exception exception)
        {
            a(exception);
            return null;
        }
        return list;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        s.execute(new Runnable() {

            final com.qihoo.security.enginehelper.clean.a a;

            public void run()
            {
                com.qihoo.security.enginehelper.clean.a.a(a, null);
                com.qihoo.security.enginehelper.clean.a.b(a, null);
            }

            
            {
                a = com.qihoo.security.enginehelper.clean.a.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(int i1, UserBWRecord userbwrecord)
    {
        try
        {
            g.a(i1, userbwrecord);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (UserBWRecord userbwrecord)
        {
            a(((Exception) (userbwrecord)));
        }
    }

    public void a(CleanScanType cleanscantype)
    {
        this;
        JVM INSTR monitorenter ;
        s.execute(new Runnable(cleanscantype) {

            final CleanScanType a;
            final com.qihoo.security.enginehelper.clean.a b;

            public void run()
            {
                if (!com.qihoo.security.enginehelper.clean.a.a(b))
                {
                    com.qihoo.security.enginehelper.clean.a.a(b, a);
                }
                com.qihoo.security.enginehelper.clean.a.b(b, a);
            }

            
            {
                b = com.qihoo.security.enginehelper.clean.a.this;
                a = cleanscantype;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        cleanscantype;
        throw cleanscantype;
    }

    public void a(b b1)
    {
        this;
        JVM INSTR monitorenter ;
        s.execute(new Runnable(b1) {

            final b a;
            final com.qihoo.security.enginehelper.clean.a b;

            public void run()
            {
                if (!com.qihoo.security.enginehelper.clean.a.a(b))
                {
                    com.qihoo.security.enginehelper.clean.a.a(b, new WeakReference(a));
                }
                com.qihoo.security.enginehelper.clean.a.b(b, new WeakReference(a));
            }

            
            {
                b = com.qihoo.security.enginehelper.clean.a.this;
                a = b1;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        b1;
        throw b1;
    }

    public void a(ArrayList arraylist)
    {
        this;
        JVM INSTR monitorenter ;
        s.execute(new Runnable(arraylist) {

            final ArrayList a;
            final com.qihoo.security.enginehelper.clean.a b;

            public void run()
            {
                com.qihoo.security.enginehelper.clean.a.a(b, a);
            }

            
            {
                b = com.qihoo.security.enginehelper.clean.a.this;
                a = arraylist;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        arraylist;
        throw arraylist;
    }

    public void a(List list)
    {
        this;
        JVM INSTR monitorenter ;
        s.execute(new Runnable(list) {

            final List a;
            final com.qihoo.security.enginehelper.clean.a b;

            public void run()
            {
                com.qihoo.security.enginehelper.clean.a.b(b);
                com.qihoo.security.enginehelper.clean.a.c(b, 31);
                com.qihoo.security.enginehelper.clean.a.a(b, a);
                if (!com.qihoo.security.enginehelper.clean.a.a(b))
                {
                    com.qihoo.security.enginehelper.clean.a.c(b, 0);
                    com.qihoo.security.enginehelper.clean.a.g(b);
                }
            }

            
            {
                b = com.qihoo.security.enginehelper.clean.a.this;
                a = list;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        throw list;
    }

    public void a(CleanTrashType acleantrashtype[])
    {
        this;
        JVM INSTR monitorenter ;
        s.execute(new Runnable(acleantrashtype) {

            final CleanTrashType a[];
            final com.qihoo.security.enginehelper.clean.a b;

            public void run()
            {
                com.qihoo.security.enginehelper.clean.a.a(b, a);
            }

            
            {
                b = com.qihoo.security.enginehelper.clean.a.this;
                a = acleantrashtype;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        acleantrashtype;
        throw acleantrashtype;
    }

    public boolean a(TrashInfo trashinfo)
    {
        boolean flag;
        try
        {
            flag = g.a(trashinfo);
        }
        // Misplaced declaration of an exception variable
        catch (TrashInfo trashinfo)
        {
            a(((Exception) (trashinfo)));
            return false;
        }
        return flag;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        s.execute(new Runnable() {

            final com.qihoo.security.enginehelper.clean.a a;

            public void run()
            {
                if (com.qihoo.security.enginehelper.clean.a.h())
                {
                    Log.i(com.qihoo.security.enginehelper.clean.a.i(), "scantest target start");
                }
                com.qihoo.security.enginehelper.clean.a.b(a);
                com.qihoo.security.enginehelper.clean.a.a(a, 21);
                if (com.qihoo.security.enginehelper.clean.a.a(a))
                {
                    com.qihoo.security.enginehelper.clean.a.c(a);
                    return;
                } else
                {
                    com.qihoo.security.enginehelper.clean.a.a(a, 0);
                    com.qihoo.security.enginehelper.clean.a.d(a);
                    return;
                }
            }

            
            {
                a = com.qihoo.security.enginehelper.clean.a.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void b(TrashInfo trashinfo)
    {
        try
        {
            g.d(trashinfo);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TrashInfo trashinfo)
        {
            a(trashinfo);
        }
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        s.execute(new Runnable() {

            final com.qihoo.security.enginehelper.clean.a a;

            public void run()
            {
                if (com.qihoo.security.enginehelper.clean.a.h())
                {
                    Log.i(com.qihoo.security.enginehelper.clean.a.i(), "target stop");
                }
                com.qihoo.security.enginehelper.clean.a.b(a);
                com.qihoo.security.enginehelper.clean.a.a(a, 22);
                if (com.qihoo.security.enginehelper.clean.a.a(a))
                {
                    synchronized (com.qihoo.security.enginehelper.clean.a.e(a))
                    {
                        com.qihoo.security.enginehelper.clean.a.b(a, 15);
                        com.qihoo.security.enginehelper.clean.a.f(a);
                    }
                    com.qihoo.security.enginehelper.clean.a.c(a);
                    return;
                } else
                {
                    com.qihoo.security.enginehelper.clean.a.a(a, 0);
                    return;
                }
                exception1;
                abyte0;
                JVM INSTR monitorexit ;
                throw exception1;
            }

            
            {
                a = com.qihoo.security.enginehelper.clean.a.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public e d()
    {
        return r;
    }

    public void e()
    {
        this;
        JVM INSTR monitorenter ;
        (new Thread() {

            final com.qihoo.security.enginehelper.clean.a a;

            public void run()
            {
                com.qihoo.security.enginehelper.clean.a.r(a).a(com.qihoo.security.enginehelper.clean.a.q(a));
                com.qihoo.security.enginehelper.clean.a.r(a).g();
            }

            
            {
                a = com.qihoo.security.enginehelper.clean.a.this;
                super();
            }
        }).start();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void f()
    {
        this;
        JVM INSTR monitorenter ;
        s.execute(new Runnable() {

            final com.qihoo.security.enginehelper.clean.a a;

            public void run()
            {
                if (com.qihoo.security.enginehelper.clean.a.h())
                {
                    Log.i(com.qihoo.security.enginehelper.clean.a.i(), "release");
                }
            }

            
            {
                a = com.qihoo.security.enginehelper.clean.a.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean g()
    {
        return o();
    }

    static 
    {
        a = false;
        String s1;
        if (a)
        {
            s1 = "CleanEngineHelper";
        } else
        {
            s1 = "";
        }
        b = s1;
    }
}
