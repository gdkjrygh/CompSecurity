// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class zb
{

    public static ze a;
    private static final boolean d = Log.isLoggable("MediaRouter", 3);
    final Context b;
    final ArrayList c = new ArrayList();

    zb(Context context)
    {
        b = context;
    }

    public static List a()
    {
        e();
        return a.c;
    }

    public static zb a(Context context)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("context must not be null");
        }
        e();
        if (a == null)
        {
            Object obj = new ze(context.getApplicationContext());
            a = ((ze) (obj));
            obj.i = new aac(((ze) (obj)).a, ((aaf) (obj)));
            obj = ((ze) (obj)).i;
            if (!((aac) (obj)).c)
            {
                obj.c = true;
                IntentFilter intentfilter = new IntentFilter();
                intentfilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentfilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentfilter.addAction("android.intent.action.PACKAGE_CHANGED");
                intentfilter.addAction("android.intent.action.PACKAGE_REPLACED");
                intentfilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                intentfilter.addDataScheme("package");
                ((aac) (obj)).a.registerReceiver(((aac) (obj)).d, intentfilter, null, ((aac) (obj)).b);
                ((aac) (obj)).b.post(((aac) (obj)).e);
            }
        }
        return a.a(context);
    }

    public static void a(zk zk)
    {
        if (zk == null)
        {
            throw new IllegalArgumentException("route must not be null");
        }
        e();
        if (d)
        {
            (new StringBuilder("selectRoute: ")).append(zk);
        }
        a.a(zk, 3);
    }

    static boolean a(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj1 != null && obj.equals(obj1);
    }

    public static boolean a(yz yz1, int i)
    {
        if (yz1 == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        } else
        {
            e();
            return a.a(yz1, 1);
        }
    }

    private int b(zc zc)
    {
        int j = c.size();
        for (int i = 0; i < j; i++)
        {
            if (((zd)c.get(i)).b == zc)
            {
                return i;
            }
        }

        return -1;
    }

    public static zk b()
    {
        e();
        return a.a();
    }

    public static zk c()
    {
        e();
        return a.b();
    }

    public static hq d()
    {
        ze ze1 = a;
        return null;
    }

    public static void e()
    {
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        } else
        {
            return;
        }
    }

    static boolean f()
    {
        return d;
    }

    public final void a(yz yz1, zc zc, int i)
    {
        boolean flag = true;
        boolean flag1 = false;
        if (yz1 == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (zc == null)
        {
            throw new IllegalArgumentException("callback must not be null");
        }
        e();
        if (d)
        {
            (new StringBuilder("addCallback: selector=")).append(yz1).append(", callback=").append(zc).append(", flags=").append(Integer.toHexString(i));
        }
        int j = b(zc);
        yz yz2;
        if (j < 0)
        {
            zc = new zd(this, zc);
            c.add(zc);
        } else
        {
            zc = (zd)c.get(j);
        }
        if ((~((zd) (zc)).d & i) != 0)
        {
            zc.d = ((zd) (zc)).d | i;
            i = 1;
        } else
        {
            i = 0;
        }
        yz2 = ((zd) (zc)).c;
        if (yz1 != null)
        {
            yz2.b();
            yz1.b();
            flag1 = yz2.b.containsAll(yz1.b);
        }
        if (!flag1)
        {
            zc.c = (new za(((zd) (zc)).c)).a(yz1).a();
            i = ((flag) ? 1 : 0);
        }
        if (i != 0)
        {
            a.c();
        }
    }

    public final void a(zc zc)
    {
        if (zc == null)
        {
            throw new IllegalArgumentException("callback must not be null");
        }
        e();
        if (d)
        {
            (new StringBuilder("removeCallback: callback=")).append(zc);
        }
        int i = b(zc);
        if (i >= 0)
        {
            c.remove(i);
            a.c();
        }
    }

}
