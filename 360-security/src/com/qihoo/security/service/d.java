// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.service;

import android.content.Context;
import android.os.Process;
import com.qihoo.security.SecurityApplication;
import com.qihoo360.mobilesafe.b.j;
import com.qihoo360.mobilesafe.b.o;
import java.util.ArrayList;
import java.util.List;

public class d
{

    private static d a;
    private final List b = new ArrayList();
    private Thread c;
    private final Runnable d = new Runnable() {

        final d a;

        public void run()
        {
            try
            {
                Thread.sleep(10000L);
                if (d.a(a).size() == 0)
                {
                    String s = o.a();
                    if (!s.equals(SecurityApplication.a().getPackageName()))
                    {
                        com.qihoo.security.locale.d.a().b();
                        if (s.equals((new StringBuilder()).append(SecurityApplication.a().getPackageName()).append(":ui").toString()))
                        {
                            j.a();
                        }
                        Process.killProcess(Process.myPid());
                    }
                }
                return;
            }
            catch (Exception exception)
            {
                return;
            }
        }

            
            {
                a = d.this;
                super();
            }
    };

    private d()
    {
    }

    private static final d a()
    {
        com/qihoo/security/service/d;
        JVM INSTR monitorenter ;
        d d1;
        if (a == null)
        {
            a = new d();
        }
        d1 = a;
        com/qihoo/security/service/d;
        JVM INSTR monitorexit ;
        return d1;
        Exception exception;
        exception;
        throw exception;
    }

    static List a(d d1)
    {
        return d1.b;
    }

    public static void a(String s, Integer integer)
    {
        com/qihoo/security/service/d;
        JVM INSTR monitorenter ;
        a().b.add(integer);
        com/qihoo/security/service/d;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    private void b()
    {
        if (b.size() == 0)
        {
            if (c != null)
            {
                c.interrupt();
            }
            c = new Thread(d);
            c.start();
        }
    }

    public static void b(String s, Integer integer)
    {
        com/qihoo/security/service/d;
        JVM INSTR monitorenter ;
        s = a();
        ((d) (s)).b.remove(integer);
        s.b();
        com/qihoo/security/service/d;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }
}
