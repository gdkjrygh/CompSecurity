// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.sdk.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.qihoo360.i.v1.main.pt.IPtManager;
import com.qihoo360.mobilesafe.support.a;
import com.qihoo360.mobilesafe.support.a.f;
import java.util.ArrayList;
import java.util.List;

public class b
    implements IPtManager
{

    private Context a;
    private boolean b;
    private com.qihoo360.mobilesafe.support.a.b c;
    private f d;
    private ServiceConnection e;

    public b(Context context)
    {
        a = null;
        b = false;
        c = null;
        d = new f();
        e = new ServiceConnection() {

            final b a;

            public void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                com.qihoo.security.clearengine.sdk.a.b.a(a, com.qihoo360.mobilesafe.support.a.a.a(ibinder));
                com.qihoo.security.clearengine.sdk.a.b.a(a).a(b.b(a));
                synchronized (com.qihoo.security.clearengine.sdk.a.b.a(a))
                {
                    if (b.c(a))
                    {
                        com.qihoo.security.clearengine.sdk.a.b.a(a).notify();
                        com.qihoo.security.clearengine.sdk.a.b.a(a, false);
                    }
                }
                return;
                ibinder;
                componentname;
                JVM INSTR monitorexit ;
                throw ibinder;
            }

            public void onServiceDisconnected(ComponentName componentname)
            {
            }

            
            {
                a = b.this;
                super();
            }
        };
        a = context;
    }

    static f a(b b1)
    {
        return b1.d;
    }

    private void a()
        throws InterruptedException
    {
        synchronized (d)
        {
            if (c == null)
            {
                b = true;
                d.wait();
            }
        }
        return;
        exception;
        f1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void a(b b1, com.qihoo360.mobilesafe.support.a.b b2)
    {
        b1.c = b2;
    }

    static void a(b b1, boolean flag)
    {
        b1.b = flag;
    }

    static com.qihoo360.mobilesafe.support.a.b b(b b1)
    {
        return b1.c;
    }

    static boolean c(b b1)
    {
        return b1.b;
    }

    public boolean bindRtService(Context context, ServiceConnection serviceconnection)
    {
        return com.qihoo360.mobilesafe.support.a.a(a, e);
    }

    public void dismissConn(Context context, IBinder ibinder)
    {
        com.qihoo360.mobilesafe.support.a.b(a, e);
    }

    public byte[] exec(IBinder ibinder, String s, List list, List list1)
    {
        ibinder = com.qihoo360.mobilesafe.support.a.a.a(ibinder);
        if (ibinder != null)
        {
            return com.qihoo360.mobilesafe.support.a.b(ibinder, s, list, list1, 0L);
        } else
        {
            return null;
        }
    }

    public byte[] execp(IBinder ibinder, String s, ArrayList arraylist)
    {
        ibinder = com.qihoo360.mobilesafe.support.a.a.a(ibinder);
        if (ibinder != null)
        {
            return com.qihoo360.mobilesafe.support.a.a(ibinder, s, arraylist, 0L);
        } else
        {
            return null;
        }
    }

    public int execve(IBinder ibinder, String s, List list, List list1)
    {
        ibinder = com.qihoo360.mobilesafe.support.a.a.a(ibinder);
        if (ibinder != null)
        {
            return com.qihoo360.mobilesafe.support.a.a(ibinder, s, list, list1, 0L);
        } else
        {
            return 0;
        }
    }

    public int execvp(IBinder ibinder, String s, List list)
    {
        ibinder = com.qihoo360.mobilesafe.support.a.a.a(ibinder);
        if (ibinder != null)
        {
            return com.qihoo360.mobilesafe.support.a.b(ibinder, s, list, 0L);
        } else
        {
            return 0;
        }
    }

    public IBinder getRtConn(Context context)
        throws Exception
    {
        com.qihoo360.mobilesafe.support.a.b(context);
        return d.d().asBinder();
    }

    public transient Object invoke(Object aobj[])
    {
        return null;
    }

    public boolean isPhoneRted()
    {
        return com.qihoo360.mobilesafe.support.a.a();
    }

    public boolean isRtServiceRunning()
    {
        if (com.qihoo360.mobilesafe.support.a.c(a))
        {
            bindRtService(null, null);
            try
            {
                a();
            }
            catch (InterruptedException interruptedexception)
            {
                interruptedexception.printStackTrace();
            }
            if (!b && c != null)
            {
                return true;
            }
        }
        return false;
    }

    public void requestRtAuth(Context context)
    {
    }

    public void unBindRtService(Context context, ServiceConnection serviceconnection)
    {
        com.qihoo360.mobilesafe.support.a.b(a, e);
    }
}
