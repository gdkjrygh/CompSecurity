// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import com.qihoo360.mobilesafe.support.a;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo360.mobilesafe.support.a:
//            c, a

public class e extends b.a
{
    class a
    {

        long a;
        c b;
        boolean c;
        boolean d;
        int e;
        final e f;

        a()
        {
            f = e.this;
            super();
            d = true;
            e = -1;
        }
    }


    private Context a;
    private c b;
    private Handler c;
    private int d;

    public e(Context context)
    {
        d = 0;
        b(context);
    }

    public static c a(Context context)
    {
        return com.qihoo360.mobilesafe.support.a.d(context);
    }

    static c a(e e1)
    {
        return e1.b;
    }

    static boolean a(e e1, long l1)
    {
        return e1.c(l1);
    }

    static c b(e e1)
    {
        return e1.k();
    }

    private void b(Context context)
    {
        b = a(context);
        a = context;
        if (c == null)
        {
            context = new HandlerThread("root-thread");
            context.start();
            c = new Handler(context.getLooper()) {

                final e a;

                public void handleMessage(Message message)
                {
                    a a1 = (a)message.obj;
                    message.what;
                    JVM INSTR tableswitch 200 204: default 48
                //                               200 62
                //                               201 121
                //                               202 135
                //                               203 152
                //                               204 61;
                       goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
                    a1;
                    JVM INSTR monitorenter ;
                    a1.d = false;
                    a1.notify();
                    a1;
                    JVM INSTR monitorexit ;
_L6:
                    return;
_L2:
                    if (com.qihoo360.mobilesafe.support.a.e.a(a) != null && com.qihoo360.mobilesafe.support.a.e.a(a).a() || e.b(a) != null)
                    {
                        a1.c = true;
                    } else
                    {
                        a1.c = com.qihoo360.mobilesafe.support.a.e.a(a, a1.a);
                    }
                    continue; /* Loop/switch isn't completed */
_L3:
                    a1.c = e.c(a);
                    continue; /* Loop/switch isn't completed */
_L4:
                    a1.b = com.qihoo360.mobilesafe.support.a.c.a(e.d(a));
                    continue; /* Loop/switch isn't completed */
_L5:
                    a1.b = com.qihoo360.mobilesafe.support.a.c.a(e.e(a));
                    if (true) goto _L1; else goto _L7
_L7:
                    message;
                    a1;
                    JVM INSTR monitorexit ;
                    throw message;
                }

            
            {
                a = e.this;
                super(looper);
            }
            };
        }
    }

    private boolean b(long l1)
    {
        a a1;
        a1 = new a();
        Message message = c.obtainMessage();
        message.what = 200;
        a1.a = l1;
        message.obj = a1;
        message.sendToTarget();
        a1;
        JVM INSTR monitorenter ;
        Exception exception;
        try
        {
            if (a1.d)
            {
                a1.wait();
            }
        }
        catch (InterruptedException interruptedexception) { }
        a1;
        JVM INSTR monitorexit ;
        boolean flag = false;
        if (a1 != null)
        {
            flag = a1.c;
        }
        return flag;
        exception;
        a1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private boolean c(long l1)
    {
        if (!h())
        {
            if (b == null || !b.a())
            {
                b = a(a);
                if (!c.hasMessages(204))
                {
                    boolean flag;
                    if (com.qihoo360.common.c.a.a(a) != 0x30e12 && com.qihoo360.mobilesafe.support.a.a(a))
                    {
                        flag = b.a(l1);
                    } else
                    {
                        flag = false;
                    }
                    if (!flag)
                    {
                        d = d + 1;
                        h();
                    } else
                    {
                        d = 0;
                    }
                    c.sendEmptyMessageDelayed(204, 3000L);
                    return flag;
                }
            } else
            {
                return true;
            }
        }
        return false;
    }

    static boolean c(e e1)
    {
        return e1.f();
    }

    static c d(e e1)
    {
        return e1.j();
    }

    static c e(e e1)
    {
        return e1.m();
    }

    private boolean e()
    {
        a a1;
        a1 = new a();
        Message message = c.obtainMessage();
        message.what = 201;
        message.obj = a1;
        message.sendToTarget();
        a1;
        JVM INSTR monitorenter ;
        Exception exception;
        try
        {
            if (a1.d)
            {
                a1.wait();
            }
        }
        catch (InterruptedException interruptedexception) { }
        a1;
        JVM INSTR monitorexit ;
        boolean flag = false;
        if (a1 != null)
        {
            flag = a1.c;
        }
        return flag;
        exception;
        a1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private boolean f()
    {
        return m().a();
    }

    private boolean g()
    {
        Object obj = a.getPackageManager();
        obj = ((PackageManager) (obj)).getInstalledApplications(0).iterator();
_L2:
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_66;
        }
        ApplicationInfo applicationinfo = (ApplicationInfo)((Iterator) (obj)).next();
        if (applicationinfo == null) goto _L2; else goto _L1
_L1:
        boolean flag = "com.lbe.security.miui".equals(applicationinfo.packageName);
        if (flag)
        {
            return true;
        }
          goto _L2
        Object obj1;
        obj1;
        break MISSING_BLOCK_LABEL_66;
        obj1;
        return false;
    }

    private boolean h()
    {
        return g() && d >= 3;
    }

    private void i()
        throws RemoteException
    {
        if (Binder.getCallingUid() != Process.myUid())
        {
            throw new RemoteException();
        } else
        {
            return;
        }
    }

    private c j()
    {
        if (b != null && b.a())
        {
            return b;
        }
        if (b == null)
        {
            b = k();
            if (b != null)
            {
                return b;
            }
        }
        if (b != null)
        {
            b.f();
        }
        b = null;
        c(17000L);
        return b;
    }

    private c k()
    {
        c c1 = a(a);
        if (c1.a())
        {
            b = c1;
            return c1;
        } else
        {
            return null;
        }
    }

    private c l()
    {
        a a1;
        a1 = new a();
        Message message = c.obtainMessage();
        message.what = 203;
        message.obj = a1;
        message.sendToTarget();
        a1;
        JVM INSTR monitorenter ;
        Exception exception;
        try
        {
            if (a1.d)
            {
                a1.wait();
            }
        }
        catch (InterruptedException interruptedexception) { }
        a1;
        JVM INSTR monitorexit ;
        c c1 = null;
        if (a1 != null)
        {
            c1 = a1.b;
        }
        return c1;
        exception;
        a1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private c m()
    {
        if (b != null)
        {
            return b;
        } else
        {
            b = a(a);
            return b;
        }
    }

    public void a(String s, List list, List list1, com.qihoo360.mobilesafe.support.a.a a1)
        throws RemoteException
    {
        i();
        (new Thread(s, list, list1, a1) {

            final e a;
            private final String b;
            private final List c;
            private final List d;
            private final com.qihoo360.mobilesafe.support.a.a e;

            public void run()
            {
                c c1 = a.d();
                if (c1 != null)
                {
                    c1.a(b, c, d, e);
                } else
                if (e != null)
                {
                    try
                    {
                        e.a(1, false, null);
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        return;
                    }
                }
            }

            
            {
                a = e.this;
                b = s;
                c = list;
                d = list1;
                e = a1;
                super();
            }
        }).start();
    }

    public boolean a()
        throws RemoteException
    {
        i();
        return e();
    }

    public boolean a(int i1, int j1, long l1)
        throws RemoteException
    {
        i();
        c c1 = d();
        if (c1 != null)
        {
            return c1.a(i1, j1, l1);
        } else
        {
            return false;
        }
    }

    public boolean a(long l1)
        throws RemoteException
    {
        i();
        return b(l1);
    }

    public boolean a(String s, int i1, int j1, long l1)
        throws RemoteException
    {
        i();
        c c1 = d();
        if (c1 != null)
        {
            return c1.a(s, i1, j1, l1);
        } else
        {
            return false;
        }
    }

    public boolean a(String s, int i1, long l1)
        throws RemoteException
    {
        i();
        c c1 = d();
        if (c1 != null)
        {
            return c1.a(s, i1, l1);
        } else
        {
            return false;
        }
    }

    public boolean a(String s, long l1)
        throws RemoteException
    {
        i();
        c c1 = d();
        if (c1 != null)
        {
            return c1.a(s, l1);
        } else
        {
            return false;
        }
    }

    public boolean a(String s, String s1, long l1)
        throws RemoteException
    {
        i();
        c c1 = d();
        if (c1 != null)
        {
            return c1.a(s, s1, l1);
        } else
        {
            return false;
        }
    }

    public boolean a(String s, String s1, String s2, long l1, String s3, long l2)
        throws RemoteException
    {
        i();
        c c1 = d();
        if (c1 != null)
        {
            return c1.a(s, s1, s2, l1, s3, l2);
        } else
        {
            return false;
        }
    }

    public boolean a(String s, List list, List list1, long l1)
        throws RemoteException
    {
        i();
        c c1 = d();
        if (c1 != null)
        {
            return c1.a(s, list, list1, l1);
        } else
        {
            return false;
        }
    }

    public int b(String s, List list, List list1, long l1)
        throws RemoteException
    {
        i();
        c c1 = d();
        if (c1 != null)
        {
            return c1.b(s, list, list1, l1);
        } else
        {
            return -1;
        }
    }

    public void b(String s, List list, List list1, com.qihoo360.mobilesafe.support.a.a a1)
        throws RemoteException
    {
        i();
        (new Thread(s, list, list1, a1) {

            final e a;
            private final String b;
            private final List c;
            private final List d;
            private final com.qihoo360.mobilesafe.support.a.a e;

            public void run()
            {
                c c1 = a.d();
                if (c1 != null)
                {
                    c1.b(b, c, d, e);
                } else
                if (e != null)
                {
                    try
                    {
                        e.a(2, false, null);
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        return;
                    }
                }
            }

            
            {
                a = e.this;
                b = s;
                c = list;
                d = list1;
                e = a1;
                super();
            }
        }).start();
    }

    public boolean b()
        throws RemoteException
    {
        if (Binder.getCallingUid() != Process.myUid())
        {
            return false;
        }
        c c1 = l();
        if (c1 != null)
        {
            return c1.b();
        } else
        {
            return true;
        }
    }

    public int c()
        throws RemoteException
    {
        i();
        c c1 = d();
        if (c1 != null)
        {
            return c1.c();
        } else
        {
            return -1;
        }
    }

    public byte[] c(String s, List list, List list1, long l1)
        throws RemoteException
    {
        i();
        c c1 = d();
        if (c1 != null)
        {
            return c1.c(s, list, list1, l1);
        } else
        {
            return null;
        }
    }

    c d()
    {
        a a1;
        a1 = new a();
        Message message = c.obtainMessage();
        message.what = 202;
        message.obj = a1;
        message.sendToTarget();
        a1;
        JVM INSTR monitorenter ;
        Exception exception;
        try
        {
            if (a1.d)
            {
                a1.wait();
            }
        }
        catch (InterruptedException interruptedexception) { }
        a1;
        JVM INSTR monitorexit ;
        c c1 = null;
        if (a1 != null)
        {
            c1 = a1.b;
        }
        return c1;
        exception;
        a1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void finalize()
        throws Throwable
    {
        if (c != null)
        {
            c.getLooper().quit();
        }
        super.finalize();
    }
}
