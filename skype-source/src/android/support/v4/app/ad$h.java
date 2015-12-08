// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
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
//            ad, q

private static final class Looper
    implements ServiceConnection, android.os.er.Callback
{
    private static final class a
    {

        public final ComponentName a;
        public boolean b;
        public q c;
        public LinkedList d;
        public int e;

        public a(ComponentName componentname)
        {
            b = false;
            d = new LinkedList();
            e = 0;
            a = componentname;
        }
    }


    private final Context a;
    private final HandlerThread b = new HandlerThread("NotificationManagerCompat");
    private final Handler c;
    private final Map d = new HashMap();
    private Set e;

    private void a(a a1)
    {
        if (a1.b)
        {
            a.unbindService(this);
            a1.b = false;
        }
        a1.c = null;
    }

    private void b(a a1)
    {
        if (c.hasMessages(3, a1.a))
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
        int i = (1 << a1.e - 1) * 1000;
        if (Log.isLoggable("NotifManCompat", 3))
        {
            (new StringBuilder("Scheduling retry for ")).append(i).append(" ms");
        }
        a1 = c.obtainMessage(3, a1.a);
        c.sendMessageDelayed(a1, i);
    }

    private void c(a a1)
    {
        if (Log.isLoggable("NotifManCompat", 3))
        {
            (new StringBuilder("Processing component ")).append(a1.a).append(", ").append(a1.d.size()).append(" queued tasks");
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
            a1.b = a.bindService(intent, this, ad.b());
            if (a1.b)
            {
                a1.e = 0;
            } else
            {
                Log.w("NotifManCompat", (new StringBuilder("Unable to bind to listener ")).append(a1.a).toString());
                a.unbindService(this);
            }
            flag = a1.b;
        }
        if (!flag || a1.c == null)
        {
            b(a1);
            return;
        }
_L4:
        ction ction;
        ction = (a)a1.d.peek();
        if (ction == null)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        if (Log.isLoggable("NotifManCompat", 3))
        {
            (new StringBuilder("Sending task ")).append(ction);
        }
        ction.a(a1.c);
        a1.d.remove();
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        obj;
        if (Log.isLoggable("NotifManCompat", 3))
        {
            (new StringBuilder("Remote service has died: ")).append(a1.a);
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

    public final void a(ring ring)
    {
        c.obtainMessage(0, ring).sendToTarget();
    }

    public final boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            message = (a)message.obj;
            Object obj1 = ad.b(a);
            if (!((Set) (obj1)).equals(e))
            {
                e = ((Set) (obj1));
                Object obj2 = a.getPackageManager().queryIntentServices((new Intent()).setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 4);
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
                            (new StringBuilder("Adding listener record for ")).append(componentname);
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
                    java.util.ntry ntry = (java.util.ntry)((Iterator) (obj1)).next();
                    if (!hashset.contains(ntry.getKey()))
                    {
                        if (Log.isLoggable("NotifManCompat", 3))
                        {
                            (new StringBuilder("Removing listener record for ")).append(ntry.getKey());
                        }
                        a((a)ntry.getValue());
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
            Object obj = (a.d)message.obj;
            message = ((a.d) (obj)).a;
            obj = ((a) (obj)).b;
            message = (a)d.get(message);
            if (message != null)
            {
                message.c = (((IBinder) (obj)));
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
            (new StringBuilder("Connected to service ")).append(componentname);
        }
        c.obtainMessage(1, new <init>(componentname, ibinder)).sendToTarget();
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        if (Log.isLoggable("NotifManCompat", 3))
        {
            (new StringBuilder("Disconnected from service ")).append(componentname);
        }
        c.obtainMessage(2, componentname).sendToTarget();
    }

    public a.a(Context context)
    {
        e = new HashSet();
        a = context;
        b.start();
        c = new Handler(b.getLooper(), this);
    }
}
