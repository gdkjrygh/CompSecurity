// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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

final class do
    implements ServiceConnection, android.os.Handler.Callback
{

    final Handler a;
    private final Context b;
    private final HandlerThread c = new HandlerThread("NotificationManagerCompat");
    private final Map d = new HashMap();
    private Set e;

    public do(Context context)
    {
        e = new HashSet();
        b = context;
        c.start();
        a = new Handler(c.getLooper(), this);
    }

    private void a(dp dp1)
    {
        if (dp1.b)
        {
            b.unbindService(this);
            dp1.b = false;
        }
        dp1.c = null;
    }

    private void b(dp dp1)
    {
        if (a.hasMessages(3, dp1.a))
        {
            return;
        }
        dp1.e = dp1.e + 1;
        if (dp1.e > 6)
        {
            Log.w("NotifManCompat", (new StringBuilder("Giving up on delivering ")).append(dp1.d.size()).append(" tasks to ").append(dp1.a).append(" after ").append(dp1.e).append(" retries").toString());
            dp1.d.clear();
            return;
        }
        int i = (1 << dp1.e - 1) * 1000;
        if (Log.isLoggable("NotifManCompat", 3))
        {
            (new StringBuilder("Scheduling retry for ")).append(i).append(" ms");
        }
        dp1 = a.obtainMessage(3, dp1.a);
        a.sendMessageDelayed(dp1, i);
    }

    private void c(dp dp1)
    {
        if (Log.isLoggable("NotifManCompat", 3))
        {
            (new StringBuilder("Processing component ")).append(dp1.a).append(", ").append(dp1.d.size()).append(" queued tasks");
        }
        if (!dp1.d.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        if (dp1.b)
        {
            flag = true;
        } else
        {
            Intent intent = (new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL")).setComponent(dp1.a);
            dp1.b = b.bindService(intent, this, dh.a());
            if (dp1.b)
            {
                dp1.e = 0;
            } else
            {
                Log.w("NotifManCompat", (new StringBuilder("Unable to bind to listener ")).append(dp1.a).toString());
                b.unbindService(this);
            }
            flag = dp1.b;
        }
        if (!flag || dp1.c == null)
        {
            b(dp1);
            return;
        }
_L4:
        dq dq1;
        dq1 = (dq)dp1.d.peek();
        if (dq1 == null)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        if (Log.isLoggable("NotifManCompat", 3))
        {
            (new StringBuilder("Sending task ")).append(dq1);
        }
        dq1.a(dp1.c);
        dp1.d.remove();
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        obj;
        if (Log.isLoggable("NotifManCompat", 3))
        {
            (new StringBuilder("Remote service has died: ")).append(dp1.a);
        }
_L5:
        if (!dp1.d.isEmpty())
        {
            b(dp1);
            return;
        }
          goto _L1
        obj;
        Log.w("NotifManCompat", (new StringBuilder("RemoteException communicating with ")).append(dp1.a).toString(), ((Throwable) (obj)));
          goto _L5
    }

    public final boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            message = (dq)message.obj;
            Object obj1 = dh.b(b);
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
                            (new StringBuilder("Adding listener record for ")).append(componentname);
                        }
                        d.put(componentname, new dp(componentname));
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
                            (new StringBuilder("Removing listener record for ")).append(entry.getKey());
                        }
                        a((dp)entry.getValue());
                        ((Iterator) (obj1)).remove();
                    }
                } while (true);
            }
            dp dp1;
            for (Iterator iterator = d.values().iterator(); iterator.hasNext(); c(dp1))
            {
                dp1 = (dp)iterator.next();
                dp1.d.add(message);
            }

            return true;

        case 1: // '\001'
            Object obj = (dn)message.obj;
            message = ((dn) (obj)).a;
            obj = ((dn) (obj)).b;
            message = (dp)d.get(message);
            if (message != null)
            {
                message.c = bx.a(((IBinder) (obj)));
                message.e = 0;
                c(message);
            }
            return true;

        case 2: // '\002'
            message = (ComponentName)message.obj;
            message = (dp)d.get(message);
            if (message != null)
            {
                a(message);
            }
            return true;

        case 3: // '\003'
            message = (ComponentName)message.obj;
            message = (dp)d.get(message);
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
        a.obtainMessage(1, new dn(componentname, ibinder)).sendToTarget();
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        if (Log.isLoggable("NotifManCompat", 3))
        {
            (new StringBuilder("Disconnected from service ")).append(componentname);
        }
        a.obtainMessage(2, componentname).sendToTarget();
    }
}
