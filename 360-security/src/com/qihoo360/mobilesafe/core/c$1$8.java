// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.core;

import android.os.Handler;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.qihoo360.common.utils.PermissionUtil;
import com.qihoo360.mobilesafe.core.b.d;
import com.qihoo360.mobilesafe.core.b.e;
import com.qihoo360.mobilesafe.core.c.a;
import com.qihoo360.mobilesafe.core.d.h;
import com.qihoo360.mobilesafe.service.ProcessInfo;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo360.mobilesafe.core:
//            c

class a
    implements Runnable
{

    final a a;

    public void run()
    {
        e.a(c.g(com.qihoo360.mobilesafe.core.a(a))).f();
    }

    <init>(<init> <init>1)
    {
        a = <init>1;
        super();
    }

    // Unreferenced inner class com/qihoo360/mobilesafe/core/c$1

/* anonymous class */
    class c._cls1 extends com.qihoo360.mobilesafe.core.c.c.a
    {

        final c a;

        static c a(c._cls1 _pcls1)
        {
            return _pcls1.a;
        }

        public List a()
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), a(a));
            return com.qihoo360.mobilesafe.core.b.e.a(com.qihoo360.mobilesafe.core.c.g(a)).b();
        }

        public void a(a a1)
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), a(a));
            if (com.qihoo360.mobilesafe.core.c.b(a) != null)
            {
                com.qihoo360.mobilesafe.core.c.b(a).post(new c._cls1._cls5(a1));
            }
        }

        public void a(String s, boolean flag)
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), a(a));
            if (com.qihoo360.mobilesafe.core.c.b(a) != null)
            {
                com.qihoo360.mobilesafe.core.c.b(a).post(new c._cls1._cls7(flag, s));
            }
        }

        public void a(List list)
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), a(a));
            if (com.qihoo360.mobilesafe.core.c.b(a) != null)
            {
                com.qihoo360.mobilesafe.core.c.b(a).post(new c._cls1._cls4(list));
            }
        }

        public void a(boolean flag)
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), a(a));
            if (com.qihoo360.mobilesafe.core.c.b(a) != null)
            {
                com.qihoo360.mobilesafe.core.c.b(a).post(new c._cls1._cls1(flag));
            }
        }

        public List b()
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), a(a));
            return com.qihoo360.mobilesafe.core.b.e.a(com.qihoo360.mobilesafe.core.c.g(a)).e();
        }

        public void b(a a1)
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), a(a));
            if (com.qihoo360.mobilesafe.core.c.b(a) != null)
            {
                com.qihoo360.mobilesafe.core.c.b(a).post(new c._cls1._cls6(a1));
            }
        }

        public void b(List list)
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), a(a));
            if (com.qihoo360.mobilesafe.core.c.b(a) != null)
            {
                com.qihoo360.mobilesafe.core.c.b(a).post(new c._cls1._cls2(list));
            }
        }

        public void b(boolean flag)
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), a(a));
            if (com.qihoo360.mobilesafe.core.c.b(a) != null)
            {
                com.qihoo360.mobilesafe.core.c.b(a).post(new c._cls1._cls3(flag));
            }
        }

        public void c()
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), a(a));
            if (com.qihoo360.mobilesafe.core.c.b(a) != null)
            {
                com.qihoo360.mobilesafe.core.c.b(a).post(new c._cls1._cls8(this));
            }
        }

        public void d()
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), a(a));
            if (com.qihoo360.mobilesafe.core.c.b(a) != null)
            {
                com.qihoo360.mobilesafe.core.c.b(a).post(new c._cls1._cls9());
            }
        }

        public void e()
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), a(a));
            if (com.qihoo360.mobilesafe.core.c.b(a) != null)
            {
                com.qihoo360.mobilesafe.core.c.b(a).post(new c._cls1._cls10());
            }
        }

        public boolean f()
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), a(a));
            return com.qihoo360.mobilesafe.core.c.i(a) && com.qihoo360.mobilesafe.core.c.j(a);
        }

        public boolean g()
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), a(a));
            return com.qihoo360.mobilesafe.core.c.j(a);
        }

        public List h()
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), a(a));
            return com.qihoo360.mobilesafe.core.c.k(a);
        }

        public long i()
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionBySignature(com.qihoo360.mobilesafe.core.c.e(), a(a));
            return com.qihoo360.mobilesafe.core.d.h.b(com.qihoo360.mobilesafe.core.c.g(a));
        }

            
            {
                a = c1;
                super();
            }

        // Unreferenced inner class com/qihoo360/mobilesafe/core/c$1$1

/* anonymous class */
        class c._cls1._cls1
            implements Runnable
        {

            final c._cls1 a;
            private final boolean b;

            static c._cls1 a(c._cls1._cls1 _pcls1)
            {
                return _pcls1.a;
            }

            public void run()
            {
                d d1 = new c._cls1._cls1._cls1(this, b);
                a(com.qihoo360.mobilesafe.core.c._cls1.a(a), true, b, false, d1);
            }

                    
                    {
                        a = c._cls1.this;
                        b = flag;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo360/mobilesafe/core/c$1$1$1

/* anonymous class */
        class c._cls1._cls1._cls1
            implements d
        {

            final c._cls1._cls1 a;
            private final boolean b;

            public void a()
            {
                com.qihoo360.mobilesafe.core.c.c(com.qihoo360.mobilesafe.core.c._cls1.a(com.qihoo360.mobilesafe.core.c._cls1._cls1.a(a)));
            }

            public void a(List list)
            {
                a(com.qihoo360.mobilesafe.core.c._cls1.a(com.qihoo360.mobilesafe.core.c._cls1._cls1.a(a)), list);
            }

            public void a(List list, List list1)
            {
                a(com.qihoo360.mobilesafe.core.c._cls1.a(com.qihoo360.mobilesafe.core.c._cls1._cls1.a(a)), b, list, list1);
            }

            public void b()
            {
                com.qihoo360.mobilesafe.core.c.d(com.qihoo360.mobilesafe.core.c._cls1.a(com.qihoo360.mobilesafe.core.c._cls1._cls1.a(a)));
            }

                    
                    {
                        a = _pcls1;
                        b = flag;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo360/mobilesafe/core/c$1$10

/* anonymous class */
        class c._cls1._cls10
            implements Runnable
        {

            final c._cls1 a;

            public void run()
            {
                com.qihoo360.mobilesafe.core.c.c(com.qihoo360.mobilesafe.core.c._cls1.a(a), null);
            }

                    
                    {
                        a = c._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo360/mobilesafe/core/c$1$2

/* anonymous class */
        class c._cls1._cls2
            implements Runnable
        {

            final c._cls1 a;
            private final List b;

            public void run()
            {
                com.qihoo360.mobilesafe.core.c.c(com.qihoo360.mobilesafe.core.c._cls1.a(a), b);
            }

                    
                    {
                        a = c._cls1.this;
                        b = list;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo360/mobilesafe/core/c$1$3

/* anonymous class */
        class c._cls1._cls3
            implements Runnable
        {

            final c._cls1 a;
            private final boolean b;

            static c._cls1 a(c._cls1._cls3 _pcls3)
            {
                return _pcls3.a;
            }

            public void run()
            {
                d d1 = new c._cls1._cls3._cls1(this, b);
                a(com.qihoo360.mobilesafe.core.c._cls1.a(a), true, b, true, d1);
            }

                    
                    {
                        a = c._cls1.this;
                        b = flag;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo360/mobilesafe/core/c$1$3$1

/* anonymous class */
        class c._cls1._cls3._cls1
            implements d
        {

            final c._cls1._cls3 a;
            private final boolean b;

            public void a()
            {
                com.qihoo360.mobilesafe.core.c.c(com.qihoo360.mobilesafe.core.c._cls1.a(com.qihoo360.mobilesafe.core.c._cls1._cls3.a(a)));
            }

            public void a(List list)
            {
                a(com.qihoo360.mobilesafe.core.c._cls1.a(com.qihoo360.mobilesafe.core.c._cls1._cls3.a(a)), list);
            }

            public void a(List list, List list1)
            {
                a(com.qihoo360.mobilesafe.core.c._cls1.a(com.qihoo360.mobilesafe.core.c._cls1._cls3.a(a)), b, list, list1);
            }

            public void b()
            {
                com.qihoo360.mobilesafe.core.c.d(com.qihoo360.mobilesafe.core.c._cls1.a(com.qihoo360.mobilesafe.core.c._cls1._cls3.a(a)));
            }

                    
                    {
                        a = _pcls3;
                        b = flag;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo360/mobilesafe/core/c$1$4

/* anonymous class */
        class c._cls1._cls4
            implements Runnable
        {

            final c._cls1 a;
            private final List b;

            public void run()
            {
                if (com.qihoo360.mobilesafe.core.c.e(com.qihoo360.mobilesafe.core.c._cls1.a(a)) != null)
                {
                    com.qihoo360.mobilesafe.core.c.b(com.qihoo360.mobilesafe.core.c._cls1.a(a), b);
                }
            }

                    
                    {
                        a = c._cls1.this;
                        b = list;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo360/mobilesafe/core/c$1$5

/* anonymous class */
        class c._cls1._cls5
            implements Runnable
        {

            final c._cls1 a;
            private final a b;

            public void run()
            {
                if (com.qihoo360.mobilesafe.core.c.f(com.qihoo360.mobilesafe.core.c._cls1.a(a)) != null)
                {
                    com.qihoo360.mobilesafe.core.c.f(com.qihoo360.mobilesafe.core.c._cls1.a(a)).register(b);
                }
            }

                    
                    {
                        a = c._cls1.this;
                        b = a1;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo360/mobilesafe/core/c$1$6

/* anonymous class */
        class c._cls1._cls6
            implements Runnable
        {

            final c._cls1 a;
            private final a b;

            public void run()
            {
                if (com.qihoo360.mobilesafe.core.c.f(com.qihoo360.mobilesafe.core.c._cls1.a(a)) != null)
                {
                    com.qihoo360.mobilesafe.core.c.f(com.qihoo360.mobilesafe.core.c._cls1.a(a)).unregister(b);
                }
            }

                    
                    {
                        a = c._cls1.this;
                        b = a1;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo360/mobilesafe/core/c$1$7

/* anonymous class */
        class c._cls1._cls7
            implements Runnable
        {

            final c._cls1 a;
            private final boolean b;
            private final String c;

            public void run()
            {
                Iterator iterator;
                int j;
                if (b)
                {
                    j = 0;
                } else
                {
                    j = 1;
                }
                if (!b) goto _L2; else goto _L1
_L1:
                iterator = com.qihoo360.mobilesafe.core.c.h(com.qihoo360.mobilesafe.core.c._cls1.a(a)).iterator();
_L4:
                if (iterator.hasNext())
                {
                    ProcessInfo processinfo = (ProcessInfo)iterator.next();
                    if (!c.equals(processinfo.packageName))
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                    com.qihoo360.mobilesafe.core.c.h(com.qihoo360.mobilesafe.core.c._cls1.a(a)).remove(processinfo);
                }
_L2:
                com.qihoo360.mobilesafe.core.b.e.a(com.qihoo360.mobilesafe.core.c.g(com.qihoo360.mobilesafe.core.c._cls1.a(a))).a(c, j);
                return;
                if (true) goto _L4; else goto _L3
_L3:
            }

                    
                    {
                        a = c._cls1.this;
                        b = flag;
                        c = s;
                        super();
                    }
        }


        // Unreferenced inner class com/qihoo360/mobilesafe/core/c$1$9

/* anonymous class */
        class c._cls1._cls9
            implements Runnable
        {

            final c._cls1 a;

            public void run()
            {
                com.qihoo360.mobilesafe.core.b.e.a(com.qihoo360.mobilesafe.core.c.g(com.qihoo360.mobilesafe.core.c._cls1.a(a))).c(com.qihoo360.mobilesafe.core.c.g(com.qihoo360.mobilesafe.core.c._cls1.a(a)));
            }

                    
                    {
                        a = c._cls1.this;
                        super();
                    }
        }

    }

}
