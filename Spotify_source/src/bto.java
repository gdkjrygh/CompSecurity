// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Process;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;

public final class bto
{

    private static final Object a = new Object();
    private static bto b;
    private static Integer c;

    private bto()
    {
        if (b() == btr.b)
        {
            java.util.List list = Collections.EMPTY_LIST;
            list = Collections.EMPTY_LIST;
            list = Collections.EMPTY_LIST;
            list = Collections.EMPTY_LIST;
            return;
        }
        Object obj = (String)btq.a.b();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            Arrays.asList(((String) (obj)).split(","));
        }
        obj = (String)btq.b.b();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            Arrays.asList(((String) (obj)).split(","));
        }
        obj = (String)btq.c.b();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            Arrays.asList(((String) (obj)).split(","));
        }
        obj = (String)btq.d.b();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            Arrays.asList(((String) (obj)).split(","));
        }
        ((Long)btq.e.b()).longValue();
        new bts((byte)0);
        ((Long)btq.e.b()).longValue();
        new bts((byte)0);
    }

    public static bto a()
    {
        synchronized (a)
        {
            if (b == null)
            {
                b = new bto();
            }
        }
        return b;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String a(ServiceConnection serviceconnection)
    {
        return String.valueOf((long)Process.myPid() << 32 | (long)System.identityHashCode(serviceconnection));
    }

    public static void a(Context context, ServiceConnection serviceconnection)
    {
        context.unbindService(serviceconnection);
        a(serviceconnection);
    }

    public static boolean a(Context context, Intent intent, ServiceConnection serviceconnection, int i)
    {
        boolean flag1 = false;
        ComponentName componentname = intent.getComponent();
        boolean flag;
        if (componentname == null)
        {
            flag = false;
        } else
        {
            flag = cno.a(context, componentname.getPackageName());
        }
        if (flag)
        {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            flag = flag1;
        } else
        {
            boolean flag2 = context.bindService(intent, serviceconnection, i);
            flag = flag2;
            if (flag2)
            {
                a(serviceconnection);
                return flag2;
            }
        }
        return flag;
    }

    private static int b()
    {
        if (c == null)
        {
            try
            {
                c = Integer.valueOf(btr.b);
            }
            catch (SecurityException securityexception)
            {
                c = Integer.valueOf(btr.b);
            }
        }
        return c.intValue();
    }

    public static boolean b(Context context, Intent intent, ServiceConnection serviceconnection, int i)
    {
        context.getClass().getName();
        return a(context, intent, serviceconnection, i);
    }

}
