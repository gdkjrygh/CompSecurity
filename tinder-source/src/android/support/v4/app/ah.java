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
//            aa, s

public final class ah
{
    static interface a
    {

        public abstract int a();

        public abstract void a(NotificationManager notificationmanager, String s, int j);

        public abstract void a(NotificationManager notificationmanager, String s, int j, Notification notification);
    }

    static class b
        implements a
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

        b()
        {
        }
    }

    static class c extends b
    {

        public final void a(NotificationManager notificationmanager, String s, int j)
        {
            notificationmanager.cancel(s, j);
        }

        public final void a(NotificationManager notificationmanager, String s, int j, Notification notification)
        {
            notificationmanager.notify(s, j, notification);
        }

        c()
        {
        }
    }

    static final class d extends c
    {

        public final int a()
        {
            return 33;
        }

        d()
        {
        }
    }

    private static final class e
        implements h
    {

        final String a;
        final int b;
        final String c;
        final Notification d;

        public final void a(s s1)
            throws RemoteException
        {
            s1.a(a, b, c, d);
        }

        public final String toString()
        {
            StringBuilder stringbuilder = new StringBuilder("NotifyTask[");
            stringbuilder.append("packageName:").append(a);
            stringbuilder.append(", id:").append(b);
            stringbuilder.append(", tag:").append(c);
            stringbuilder.append("]");
            return stringbuilder.toString();
        }

        public e(String s1, int j, String s2, Notification notification)
        {
            a = s1;
            b = j;
            c = s2;
            d = notification;
        }
    }

    private static final class f
    {

        final ComponentName a;
        final IBinder b;

        public f(ComponentName componentname, IBinder ibinder)
        {
            a = componentname;
            b = ibinder;
        }
    }

    private static final class g
        implements ServiceConnection, android.os.Handler.Callback
    {

        final Handler a;
        private final Context b;
        private final HandlerThread c = new HandlerThread("NotificationManagerCompat");
        private final Map d = new HashMap();
        private Set e;

        private void a(a a1)
        {
            if (a1.b)
            {
                b.unbindService(this);
                a1.b = false;
            }
            a1.c = null;
        }

        private void b(a a1)
        {
            if (a.hasMessages(3, a1.a))
            {
                return;
            }
            a1.e = a1.e + 1;
            if (a1.e > 6)
            {
                Log.w("NotifManCompat", (new StringBuilder("Giving up on delivering ")).append(a1.d.size()).append(" tasks to ").append(a1.a).append(" after ").append(a1.e).append(" retries").toString());
                a1.d.clear();
                return;
            }
            int j = (1 << a1.e - 1) * 1000;
            if (Log.isLoggable("NotifManCompat", 3))
            {
                Log.d("NotifManCompat", (new StringBuilder("Scheduling retry for ")).append(j).append(" ms").toString());
            }
            a1 = a.obtainMessage(3, a1.a);
            a.sendMessageDelayed(a1, j);
        }

        private void c(a a1)
        {
            if (Log.isLoggable("NotifManCompat", 3))
            {
                Log.d("NotifManCompat", (new StringBuilder("Processing component ")).append(a1.a).append(", ").append(a1.d.size()).append(" queued tasks").toString());
            }
            if (!a1.d.isEmpty()) goto _L2; else goto _L1
_L1:
            return;
_L2:
            boolean flag;
            if (a1.b)
            {
                flag = true;
            } else
            {
                Intent intent = (new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL")).setComponent(a1.a);
                a1.b = b.bindService(intent, this, ah.a());
                if (a1.b)
                {
                    a1.e = 0;
                } else
                {
                    Log.w("NotifManCompat", (new StringBuilder("Unable to bind to listener ")).append(a1.a).toString());
                    b.unbindService(this);
                }
                flag = a1.b;
            }
            if (!flag || a1.c == null)
            {
                b(a1);
                return;
            }
_L4:
            h h1;
            h1 = (h)a1.d.peek();
            if (h1 == null)
            {
                break MISSING_BLOCK_LABEL_282;
            }
            if (Log.isLoggable("NotifManCompat", 3))
            {
                Log.d("NotifManCompat", (new StringBuilder("Sending task ")).append(h1).toString());
            }
            h1.a(a1.c);
            a1.d.remove();
            if (true) goto _L4; else goto _L3
_L3:
            Object obj;
            obj;
            if (Log.isLoggable("NotifManCompat", 3))
            {
                Log.d("NotifManCompat", (new StringBuilder("Remote service has died: ")).append(a1.a).toString());
            }
_L5:
            if (!a1.d.isEmpty())
            {
                b(a1);
                return;
            }
              goto _L1
            obj;
            Log.w("NotifManCompat", (new StringBuilder("RemoteException communicating with ")).append(a1.a).toString(), ((Throwable) (obj)));
              goto _L5
        }

        public final boolean handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return false;

            case 0: // '\0'
                message = (h)message.obj;
                Object obj1 = ah.b(b);
                if (!((Set) (obj1)).equals(e))
                {
                    e = ((Set) (obj1));
                    Object obj2 = b.getPackageManager().queryIntentServices((new Intent()).setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 4);
                    HashSet hashset = new HashSet();
                    obj2 = ((List) (obj2)).iterator();
                    do
                    {
                        if (!((Iterator) (obj2)).hasNext())
                        {
                            break;
                        }
                        ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (obj2)).next();
                        if (((Set) (obj1)).contains(resolveinfo.serviceInfo.packageName))
                        {
                            ComponentName componentname1 = new ComponentName(resolveinfo.serviceInfo.packageName, resolveinfo.serviceInfo.name);
                            if (resolveinfo.serviceInfo.permission != null)
                            {
                                Log.w("NotifManCompat", (new StringBuilder("Permission present on component ")).append(componentname1).append(", not adding listener record.").toString());
                            } else
                            {
                                hashset.add(componentname1);
                            }
                        }
                    } while (true);
                    obj1 = hashset.iterator();
                    do
                    {
                        if (!((Iterator) (obj1)).hasNext())
                        {
                            break;
                        }
                        ComponentName componentname = (ComponentName)((Iterator) (obj1)).next();
                        if (!d.containsKey(componentname))
                        {
                            if (Log.isLoggable("NotifManCompat", 3))
                            {
                                Log.d("NotifManCompat", (new StringBuilder("Adding listener record for ")).append(componentname).toString());
                            }
                            d.put(componentname, new a(componentname));
                        }
                    } while (true);
                    obj1 = d.entrySet().iterator();
                    do
                    {
                        if (!((Iterator) (obj1)).hasNext())
                        {
                            break;
                        }
                        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
                        if (!hashset.contains(entry.getKey()))
                        {
                            if (Log.isLoggable("NotifManCompat", 3))
                            {
                                Log.d("NotifManCompat", (new StringBuilder("Removing listener record for ")).append(entry.getKey()).toString());
                            }
                            a((a)entry.getValue());
                            ((Iterator) (obj1)).remove();
                        }
                    } while (true);
                }
                a a1;
                for (Iterator iterator = d.values().iterator(); iterator.hasNext(); c(a1))
                {
                    a1 = (a)iterator.next();
                    a1.d.add(message);
                }

                return true;

            case 1: // '\001'
                Object obj = (f)message.obj;
                message = ((f) (obj)).a;
                obj = ((f) (obj)).b;
                message = (a)d.get(message);
                if (message != null)
                {
                    message.c = s.a.a(((IBinder) (obj)));
                    message.e = 0;
                    c(message);
                }
                return true;

            case 2: // '\002'
                message = (ComponentName)message.obj;
                message = (a)d.get(message);
                if (message != null)
                {
                    a(message);
                }
                return true;

            case 3: // '\003'
                message = (ComponentName)message.obj;
                message = (a)d.get(message);
                break;
            }
            if (message != null)
            {
                c(message);
            }
            return true;
        }

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            if (Log.isLoggable("NotifManCompat", 3))
            {
                Log.d("NotifManCompat", (new StringBuilder("Connected to service ")).append(componentname).toString());
            }
            a.obtainMessage(1, new f(componentname, ibinder)).sendToTarget();
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
            if (Log.isLoggable("NotifManCompat", 3))
            {
                Log.d("NotifManCompat", (new StringBuilder("Disconnected from service ")).append(componentname).toString());
            }
            a.obtainMessage(2, componentname).sendToTarget();
        }

        public g(Context context)
        {
            e = new HashSet();
            b = context;
            c.start();
            a = new Handler(c.getLooper(), this);
        }
    }

    private static final class g.a
    {

        public final ComponentName a;
        public boolean b;
        public s c;
        public LinkedList d;
        public int e;

        public g.a(ComponentName componentname)
        {
            b = false;
            d = new LinkedList();
            e = 0;
            a = componentname;
        }
    }

    private static interface h
    {

        public abstract void a(s s)
            throws RemoteException;
    }


    private static final int a;
    private static final Object b = new Object();
    private static String c;
    private static Set d = new HashSet();
    private static final Object g = new Object();
    private static g h;
    private static final a i;
    private final Context e;
    private final NotificationManager f;

    private ah(Context context)
    {
        e = context;
        f = (NotificationManager)e.getSystemService("notification");
    }

    static int a()
    {
        return a;
    }

    public static ah a(Context context)
    {
        return new ah(context);
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

    public final void a(String s, int j, Notification notification)
    {
        Bundle bundle = aa.getExtras(notification);
        boolean flag;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            e e1 = new e(e.getPackageName(), j, s, notification);
            synchronized (g)
            {
                if (h == null)
                {
                    h = new g(e.getApplicationContext());
                }
            }
            h.a.obtainMessage(0, e1).sendToTarget();
            i.a(f, s, j);
            return;
        } else
        {
            i.a(f, s, j, notification);
            return;
        }
        s;
        notification;
        JVM INSTR monitorexit ;
        throw s;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            i = new d();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 5)
        {
            i = new c();
        } else
        {
            i = new b();
        }
        a = i.a();
    }
}
