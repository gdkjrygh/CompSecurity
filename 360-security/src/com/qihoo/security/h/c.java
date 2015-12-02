// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.h;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.service.LoadingPermissionDataService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

// Referenced classes of package com.qihoo.security.h:
//            f

public class c
{
    public static interface a
    {

        public abstract void a(int i);
    }


    private static final String a = com/qihoo/security/h/c.getSimpleName();
    private static c e;
    private int b;
    private boolean c;
    private Context d;
    private Handler f;
    private final ArrayList g = new ArrayList();

    private c(Context context)
    {
        b = 1;
        c = false;
        f = new Handler(Looper.getMainLooper()) {

            final c a;

            public void handleMessage(Message message)
            {
                switch (message.what)
                {
                default:
                    return;

                case 0: // '\0'
                    c.a(a).startService((new Intent(c.a(a), com/qihoo/security/service/LoadingPermissionDataService)).setAction("com.qihoo360.mobilesafe.shield.loading"));
                    return;

                case 1: // '\001'
                    c.a(a, message.arg1);
                    break;
                }
            }

            
            {
                a = c.this;
                super(looper);
            }
        };
        d = context.getApplicationContext();
    }

    static Context a(c c1)
    {
        return c1.d;
    }

    public static c a()
    {
        com/qihoo/security/h/c;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            e = new c(SecurityApplication.a());
        }
        com/qihoo/security/h/c;
        JVM INSTR monitorexit ;
        return e;
        Exception exception;
        exception;
        com/qihoo/security/h/c;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(int i)
    {
        int j = g.size();
        int k = 0;
        while (k < j) 
        {
            a a1 = (a)((WeakReference)g.get(k)).get();
            if (a1 == null)
            {
                g.remove(k);
                k--;
                j--;
            } else
            {
                a1.a(i);
            }
            k++;
        }
    }

    static void a(c c1, int i)
    {
        c1.a(i);
    }

    public boolean a(boolean flag)
    {
        if (b == 4)
        {
            return false;
        }
        Handler handler = f;
        long l;
        if (flag)
        {
            l = 10L;
        } else
        {
            l = 2200L;
        }
        handler.sendEmptyMessageDelayed(0, l);
        return true;
    }

    public int b()
    {
        return b;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        int i = b;
        if (i != 4) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f f1;
        boolean flag;
        b = 2;
        f.obtainMessage(1, b, 0).sendToTarget();
        f1 = com.qihoo.security.h.f.a();
        f1.d();
        c = true;
        flag = f1.b();
        b = 3;
        f.obtainMessage(1, b, 0).sendToTarget();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        f1.c();
        b = 4;
        f.obtainMessage(1, b, 0).sendToTarget();
        com/qihoo/security/h/c;
        JVM INSTR monitorenter ;
        com/qihoo/security/h/c.notifyAll();
        com/qihoo/security/h/c;
        JVM INSTR monitorexit ;
        System.gc();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
        exception;
        com/qihoo/security/h/c;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
