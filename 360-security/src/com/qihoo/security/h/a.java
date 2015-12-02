// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.h;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.qihoo.security.SecurityApplication;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class com.qihoo.security.h.a
    implements android.os.Handler.Callback
{
    private class a
    {

        public int a;
        public boolean b;
        ApplicationInfo c;

        public String toString()
        {
            return null;
        }
    }


    private static final String a = com/qihoo/security/h/a.getSimpleName();
    private static com.qihoo.security.h.a e;
    private final Context b;
    private final PackageManager c;
    private final Drawable d;
    private final ConcurrentHashMap f;
    private final ConcurrentHashMap g;
    private final Handler h;
    private boolean i;

    private com.qihoo.security.h.a(Context context)
    {
        f = new ConcurrentHashMap();
        g = new ConcurrentHashMap();
        h = new Handler(Looper.getMainLooper(), this);
        i = false;
        b = context.getApplicationContext();
        c = b.getPackageManager();
        context = null;
        Drawable drawable = b.getResources().getDrawable(0x7f020043);
        context = drawable;
_L2:
        d = context;
        return;
        Exception exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static com.qihoo.security.h.a a()
    {
        com/qihoo/security/h/a;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            e = new com.qihoo.security.h.a(SecurityApplication.a());
        }
        com/qihoo/security/h/a;
        JVM INSTR monitorexit ;
        return e;
        Exception exception;
        exception;
        com/qihoo/security/h/a;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static boolean b()
    {
        return e != null;
    }

    private void c()
    {
        Iterator iterator = f.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a1 = (a)iterator.next();
            if (a1 == null)
            {
                iterator.remove();
            } else
            if (a1.b || a1.c == null)
            {
                iterator.remove();
            } else
            if (a1.a < 5)
            {
                iterator.remove();
            }
        } while (true);
        System.gc();
    }

    public void a(String s, int j)
    {
        f.remove(s);
        g.remove(Integer.valueOf(j));
    }

    public void b(String s, int j)
    {
        f.remove(s);
        g.remove(Integer.valueOf(j));
    }

    public boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            h.removeMessages(0);
            c();
            i = false;
            h.sendEmptyMessageDelayed(1, 5000L);
            h.sendEmptyMessageDelayed(1, 15000L);
            return false;

        case 1: // '\001'
            System.gc();
            break;
        }
        return false;
    }

}
