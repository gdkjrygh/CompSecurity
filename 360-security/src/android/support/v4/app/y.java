// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package android.support.v4.app:
//            q, i, z

public class y
{
    private static class a
        implements i
    {

        final String a;
        final int b;
        final String c;
        final boolean d = false;

        public void a(android.support.v4.app.i j)
            throws RemoteException
        {
            if (d)
            {
                j.a(a);
                return;
            } else
            {
                j.a(a, b, c);
                return;
            }
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder("CancelTask[");
            stringbuilder.append("packageName:").append(a);
            stringbuilder.append(", id:").append(b);
            stringbuilder.append(", tag:").append(c);
            stringbuilder.append(", all:").append(d);
            stringbuilder.append("]");
            return stringbuilder.toString();
        }

        public a(String s, int j, String s1)
        {
            a = s;
            b = j;
            c = s1;
        }
    }

    static interface b
    {

        public abstract int a();

        public abstract void a(NotificationManager notificationmanager, String s, int j);

        public abstract void a(NotificationManager notificationmanager, String s, int j, Notification notification);
    }

    static class c
        implements b
    {

        public int a()
        {
            return 1;
        }

        public void a(NotificationManager notificationmanager, String s, int j)
        {
            notificationmanager.cancel(j);
        }

        public void a(NotificationManager notificationmanager, String s, int j, Notification notification)
        {
            notificationmanager.notify(j, notification);
        }

        c()
        {
        }
    }

    static class d extends c
    {

        public void a(NotificationManager notificationmanager, String s, int j)
        {
            z.a(notificationmanager, s, j);
        }

        public void a(NotificationManager notificationmanager, String s, int j, Notification notification)
        {
            z.a(notificationmanager, s, j, notification);
        }

        d()
        {
        }
    }

    static class e extends d
    {

        public int a()
        {
            return 33;
        }

        e()
        {
        }
    }

    private static class f
        implements i
    {

        final String a;
        final int b;
        final String c;
        final Notification d;

        public void a(android.support.v4.app.i j)
            throws RemoteException
        {
            j.a(a, b, c, d);
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder("NotifyTask[");
            stringbuilder.append("packageName:").append(a);
            stringbuilder.append(", id:").append(b);
            stringbuilder.append(", tag:").append(c);
            stringbuilder.append("]");
            return stringbuilder.toString();
        }

        public f(String s, int j, String s1, Notification notification)
        {
            a = s;
            b = j;
            c = s1;
            d = notification;
        }
    }

    private static class g
    {

        final ComponentName a;
        final IBinder b;

        public g(ComponentName componentname, IBinder ibinder)
        {
            a = componentname;
            b = ibinder;
        }
    }

    private static class h
        implements ServiceConnection, android.os.Handler.Callback
    {

        private final Context a;
        private final HandlerThread b = new HandlerThread("NotificationManagerCompat");
        private final Handler c;
        private final Map d = new HashMap();
        private Set e;

        private void a()
        {
            Object obj = y.b(a);
            if (!obj.equals(e))
            {
                e = ((Set) (obj));
                Object obj1 = a.getPackageManager().queryIntentServices((new Intent()).setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 4);
                HashSet hashset = new HashSet();
                obj1 = ((List) (obj1)).iterator();
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break;
                    }
                    ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (obj1)).next();
                    if (((Set) (obj)).contains(resolveinfo.serviceInfo.packageName))
                    {
                        ComponentName componentname1 = new ComponentName(resolveinfo.serviceInfo.packageName, resolveinfo.serviceInfo.name);
                        if (resolveinfo.serviceInfo.permission != null)
                        {
                            Log.w("NotifManCompat", (new StringBuilder()).append("Permission present on component ").append(componentname1).append(", not adding listener record.").toString());
                        } else
                        {
                            hashset.add(componentname1);
                        }
                    }
                } while (true);
                obj = hashset.iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    ComponentName componentname = (ComponentName)((Iterator) (obj)).next();
                    if (!d.containsKey(componentname))
                    {
                        if (Log.isLoggable("NotifManCompat", 3))
                        {
                            Log.d("NotifManCompat", (new StringBuilder()).append("Adding listener record for ").append(componentname).toString());
                        }
                        d.put(componentname, new a(componentname));
                    }
                } while (true);
                obj = d.entrySet().iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                    if (!hashset.contains(entry.getKey()))
                    {
                        if (Log.isLoggable("NotifManCompat", 3))
                        {
                            Log.d("NotifManCompat", (new StringBuilder()).append("Removing listener record for ").append(entry.getKey()).toString());
                        }
                        b((a)entry.getValue());
                        ((Iterator) (obj)).remove();
                    }
                }
            }
        }

        private void a(ComponentName componentname)
        {
            componentname = (a)d.get(componentname);
            if (componentname != null)
            {
                b(componentname);
            }
        }

        private void a(ComponentName componentname, IBinder ibinder)
        {
            componentname = (a)d.get(componentname);
            if (componentname != null)
            {
                componentname.c = android.support.v4.app.i.a.a(ibinder);
                componentname.e = 0;
                d(componentname);
            }
        }

        private boolean a(a a1)
        {
            if (a1.b)
            {
                return true;
            }
            Intent intent = (new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL")).setComponent(a1.a);
            a1.b = a.bindService(intent, this, y.a());
            if (a1.b)
            {
                a1.e = 0;
            } else
            {
                Log.w("NotifManCompat", (new StringBuilder()).append("Unable to bind to listener ").append(a1.a).toString());
                a.unbindService(this);
            }
            return a1.b;
        }

        private void b(ComponentName componentname)
        {
            componentname = (a)d.get(componentname);
            if (componentname != null)
            {
                d(componentname);
            }
        }

        private void b(a a1)
        {
            if (a1.b)
            {
                a.unbindService(this);
                a1.b = false;
            }
            a1.c = null;
        }

        private void b(i j)
        {
            a();
            a a1;
            for (Iterator iterator = d.values().iterator(); iterator.hasNext(); d(a1))
            {
                a1 = (a)iterator.next();
                a1.d.add(j);
            }

        }

        private void c(a a1)
        {
            if (c.hasMessages(3, a1.a))
            {
                return;
            }
            a1.e = a1.e + 1;
            if (a1.e > 6)
            {
                Log.w("NotifManCompat", (new StringBuilder()).append("Giving up on delivering ").append(a1.d.size()).append(" tasks to ").append(a1.a).append(" after ").append(a1.e).append(" retries").toString());
                a1.d.clear();
                return;
            }
            int j = (1 << a1.e - 1) * 1000;
            if (Log.isLoggable("NotifManCompat", 3))
            {
                Log.d("NotifManCompat", (new StringBuilder()).append("Scheduling retry for ").append(j).append(" ms").toString());
            }
            a1 = c.obtainMessage(3, a1.a);
            c.sendMessageDelayed(a1, j);
        }

        private void d(a a1)
        {
            if (Log.isLoggable("NotifManCompat", 3))
            {
                Log.d("NotifManCompat", (new StringBuilder()).append("Processing component ").append(a1.a).append(", ").append(a1.d.size()).append(" queued tasks").toString());
            }
            if (!a1.d.isEmpty()) goto _L2; else goto _L1
_L1:
            return;
_L2:
            if (!a(a1) || a1.c == null)
            {
                c(a1);
                return;
            }
              goto _L3
_L5:
            i j;
            if (Log.isLoggable("NotifManCompat", 3))
            {
                Log.d("NotifManCompat", (new StringBuilder()).append("Sending task ").append(j).toString());
            }
            j.a(a1.c);
            a1.d.remove();
_L3:
            if ((j = (i)a1.d.peek()) != null) goto _L5; else goto _L4
_L4:
            if (!a1.d.isEmpty())
            {
                c(a1);
                return;
            }
            if (true) goto _L1; else goto _L6
_L6:
            Object obj;
            obj;
            if (Log.isLoggable("NotifManCompat", 3))
            {
                Log.d("NotifManCompat", (new StringBuilder()).append("Remote service has died: ").append(a1.a).toString());
            }
              goto _L4
            obj;
            Log.w("NotifManCompat", (new StringBuilder()).append("RemoteException communicating with ").append(a1.a).toString(), ((Throwable) (obj)));
              goto _L4
        }

        public void a(i j)
        {
            c.obtainMessage(0, j).sendToTarget();
        }

        public boolean handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return false;

            case 0: // '\0'
                b((i)message.obj);
                return true;

            case 1: // '\001'
                message = (g)message.obj;
                a(((g) (message)).a, ((g) (message)).b);
                return true;

            case 2: // '\002'
                a((ComponentName)message.obj);
                return true;

            case 3: // '\003'
                b((ComponentName)message.obj);
                break;
            }
            return true;
        }

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            if (Log.isLoggable("NotifManCompat", 3))
            {
                Log.d("NotifManCompat", (new StringBuilder()).append("Connected to service ").append(componentname).toString());
            }
            c.obtainMessage(1, new g(componentname, ibinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            if (Log.isLoggable("NotifManCompat", 3))
            {
                Log.d("NotifManCompat", (new StringBuilder()).append("Disconnected from service ").append(componentname).toString());
            }
            c.obtainMessage(2, componentname).sendToTarget();
        }

        public h(Context context)
        {
            e = new HashSet();
            a = context;
            b.start();
            c = new Handler(b.getLooper(), this);
        }
    }

    private static class h.a
    {

        public final ComponentName a;
        public boolean b;
        public android.support.v4.app.i c;
        public LinkedList d;
        public int e;

        public h.a(ComponentName componentname)
        {
            b = false;
            d = new LinkedList();
            e = 0;
            a = componentname;
        }
    }

    private static interface i
    {

        public abstract void a(android.support.v4.app.i j)
            throws RemoteException;
    }


    private static final int a;
    private static final Object b = new Object();
    private static String c;
    private static Set d = new HashSet();
    private static final Object g = new Object();
    private static h h;
    private static final b i;
    private final Context e;
    private final NotificationManager f;

    private y(Context context)
    {
        e = context;
        f = (NotificationManager)e.getSystemService("notification");
    }

    static int a()
    {
        return a;
    }

    public static y a(Context context)
    {
        return new y(context);
    }

    private void a(i j)
    {
        synchronized (g)
        {
            if (h == null)
            {
                h = new h(e.getApplicationContext());
            }
        }
        h.a(j);
        return;
        j;
        obj;
        JVM INSTR monitorexit ;
        throw j;
    }

    private static boolean a(Notification notification)
    {
        notification = q.a(notification);
        return notification != null && notification.getBoolean("android.support.useSideChannel");
    }

    public static Set b(Context context)
    {
        context = android.provider.Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        if (context != null && !context.equals(c))
        {
            String as[] = context.split(":");
            HashSet hashset = new HashSet(as.length);
            int k = as.length;
            for (int j = 0; j < k; j++)
            {
                ComponentName componentname = ComponentName.unflattenFromString(as[j]);
                if (componentname != null)
                {
                    hashset.add(componentname.getPackageName());
                }
            }

            synchronized (b)
            {
                d = hashset;
                c = context;
            }
        }
        return d;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void a(int j)
    {
        a(((String) (null)), j);
    }

    public void a(int j, Notification notification)
    {
        a(null, j, notification);
    }

    public void a(String s, int j)
    {
        i.a(f, s, j);
        a(((i) (new a(e.getPackageName(), j, s))));
    }

    public void a(String s, int j, Notification notification)
    {
        if (a(notification))
        {
            a(((i) (new f(e.getPackageName(), j, s, notification))));
            return;
        } else
        {
            i.a(f, s, j, notification);
            return;
        }
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            i = new e();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 5)
        {
            i = new d();
        } else
        {
            i = new c();
        }
        a = i.a();
    }
}
