// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.enginehelper.clean;

import android.util.Log;
import com.qihoo.security.clearengine.TrashType;
import com.qihoo.security.clearengine.sdk.b;
import com.qihoo.security.clearengine.surface.a;
import com.qihoo.security.opti.trashclear.ui.e;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.qihoo.security.enginehelper.clean:
//            a, CleanScanType

class a
    implements a
{

    final com.qihoo.security.enginehelper.clean.a a;
    private int b;
    private int c;

    static int a(a a1)
    {
        return a1.c;
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
        c c1;
        if (com.qihoo.security.enginehelper.clean.a.h(a) == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        c1 = (a)com.qihoo.security.enginehelper.clean.a.h(a).get();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        c1.a();
        a1;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        a1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(int i)
    {
        if (c < i)
        {
            c = i;
        }
        if (com.qihoo.security.enginehelper.clean.a.h())
        {
            Log.i(com.qihoo.security.enginehelper.clean.a.i(), "clean trash finished");
        }
        com.qihoo.security.enginehelper.clean.a.o(a).execute(new Runnable() {

            final a._cls3 a;

            public void run()
            {
                com.qihoo.security.enginehelper.clean.a a1 = a.a;
                a1;
                JVM INSTR monitorenter ;
                a.a a2;
                if (com.qihoo.security.enginehelper.clean.a.p(a.a) == null)
                {
                    break MISSING_BLOCK_LABEL_56;
                }
                a2 = (a.a)com.qihoo.security.enginehelper.clean.a.p(a.a).get();
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
                a = a._cls3.this;
                super();
            }
        });
    }

    public void a(int i, int j, TrashType trashtype, TrashInfo trashinfo, Map map)
    {
        if (c < i)
        {
            c = i;
        }
        if (com.qihoo.security.enginehelper.clean.a.h())
        {
            Log.i(com.qihoo.security.enginehelper.clean.a.i(), (new StringBuilder()).append("clean trash progress:").append(c).toString());
        }
        com.qihoo.security.enginehelper.clean.a.o(a).execute(new Runnable(map) {

            final Map a;
            final a._cls3 b;

            public void run()
            {
                com.qihoo.security.enginehelper.clean.a a1 = b.a;
                a1;
                JVM INSTR monitorenter ;
                a.a a2;
                if (com.qihoo.security.enginehelper.clean.a.p(b.a) == null)
                {
                    break MISSING_BLOCK_LABEL_61;
                }
                a2 = (a.a)com.qihoo.security.enginehelper.clean.a.p(b.a).get();
                if (a2 == null)
                {
                    break MISSING_BLOCK_LABEL_61;
                }
                a2.a(com.qihoo.security.enginehelper.clean.a._cls3.a(b), a);
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
                b = a._cls3.this;
                a = map;
                super();
            }
        });
    }

    public void a(int i, String s, Map map)
    {
        if (com.qihoo.security.enginehelper.clean.a.i(a) == 22)
        {
            return;
        }
        if (b < i)
        {
            b = i;
        }
        if (com.qihoo.security.enginehelper.clean.a.h())
        {
            Log.i(com.qihoo.security.enginehelper.clean.a.i(), (new StringBuilder()).append("scan trash progress:").append(b).toString());
        }
        s = a;
        s;
        JVM INSTR monitorenter ;
        _cls3.a a1;
        if (com.qihoo.security.enginehelper.clean.a.h(a) == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        a1 = (a)com.qihoo.security.enginehelper.clean.a.h(a).get();
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        a1.a(b, map);
        s;
        JVM INSTR monitorexit ;
        return;
        map;
        s;
        JVM INSTR monitorexit ;
        throw map;
    }

    public void a(int i, Map map, b b1)
    {
        if (b < i)
        {
            b = i;
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
        b2 = (a)com.qihoo.security.enginehelper.clean.a.h(a).get();
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
        com.qihoo.security.enginehelper.clean.a.o(a).execute(new Runnable(map) {

            final Map a;
            final a._cls3 b;

            public void run()
            {
                com.qihoo.security.enginehelper.clean.a a1 = b.a;
                a1;
                JVM INSTR monitorenter ;
                a.b b1;
                if (com.qihoo.security.enginehelper.clean.a.h(b.a) == null)
                {
                    break MISSING_BLOCK_LABEL_60;
                }
                b1 = (a.b)com.qihoo.security.enginehelper.clean.a.h(b.a).get();
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
                b = a._cls3.this;
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
        com.qihoo.security.enginehelper.clean.a.o(a).execute(new Runnable() {

            final a._cls3 a;

            public void run()
            {
                com.qihoo.security.enginehelper.clean.a a1 = a.a;
                a1;
                JVM INSTR monitorenter ;
                a.a a2;
                if (com.qihoo.security.enginehelper.clean.a.p(a.a) == null)
                {
                    break MISSING_BLOCK_LABEL_50;
                }
                a2 = (a.a)com.qihoo.security.enginehelper.clean.a.p(a.a).get();
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
                a = a._cls3.this;
                super();
            }
        });
    }

    public void b(int i)
    {
        com.qihoo.security.enginehelper.clean.a.o(a).execute(new Runnable(i) {

            final int a;
            final a._cls3 b;

            public void run()
            {
                com.qihoo.security.enginehelper.clean.a a1 = b.a;
                a1;
                JVM INSTR monitorenter ;
                a;
                JVM INSTR tableswitch 1 4: default 317
            //                           1 111
            //                           2 111
            //                           3 159
            //                           4 159;
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
                Object obj = (a.b)com.qihoo.security.enginehelper.clean.a.h(b.a).get();
                if (obj == null) goto _L1; else goto _L7
_L7:
                ((a.b) (obj)).c();
                  goto _L1
                Exception exception;
                exception;
                a1;
                JVM INSTR monitorexit ;
                throw exception;
_L3:
                if (com.qihoo.security.enginehelper.clean.a.p(b.a) == null) goto _L1; else goto _L8
_L8:
                exception = (a.a)com.qihoo.security.enginehelper.clean.a.p(b.a).get();
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
                b = a._cls3.this;
                a = i;
                super();
            }
        });
    }

    _cls5.a(com.qihoo.security.enginehelper.clean.a a1)
    {
        a = a1;
        super();
    }
}
