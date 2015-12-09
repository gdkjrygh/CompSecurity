// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;

public abstract class ahz
{

    private static final aid b = aid.a("kju.remoting");
    public String a;
    private Set c;

    public ahz()
    {
    }

    public static Object a(Intent intent, String s, Type type)
    {
        if (type == Integer.TYPE)
        {
            return Integer.valueOf(intent.getIntExtra(s, 0));
        }
        if (type == [I)
        {
            return intent.getIntArrayExtra(s);
        }
        if (type == Double.TYPE)
        {
            return Double.valueOf(intent.getDoubleExtra(s, 0.0D));
        }
        if (type == Boolean.TYPE)
        {
            return Boolean.valueOf(intent.getBooleanExtra(s, false));
        }
        if (type == [B)
        {
            return intent.getByteArrayExtra(s);
        }
        if (type == java/lang/String)
        {
            return intent.getStringExtra(s);
        }
        if (type == [Ljava/lang/String;)
        {
            return intent.getStringArrayExtra(s);
        } else
        {
            return null;
        }
    }

    public static void o()
    {
    }

    public final void a(BroadcastReceiver broadcastreceiver)
    {
        Context context;
        context = aia.a(a).a.getApplicationContext();
        b.a("unsubscribe(%s, %s)...", new Object[] {
            context, broadcastreceiver
        });
        if (!c.contains(broadcastreceiver)) goto _L2; else goto _L1
_L1:
        context.unregisterReceiver(broadcastreceiver);
        b.a("unsubscribe(%s) OK!", new Object[] {
            broadcastreceiver
        });
_L4:
        c.remove(broadcastreceiver);
        return;
_L2:
        b.a("Trying to unregister missing receiver %s", new Object[] {
            broadcastreceiver
        });
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        obj;
        b.b("Error unregistering receiver: %s", new Object[] {
            broadcastreceiver
        });
        c.remove(broadcastreceiver);
        return;
        obj;
        c.remove(broadcastreceiver);
        throw obj;
    }

    public final void a(String s, BroadcastReceiver broadcastreceiver)
    {
        Context context = aia.a(a).a.getApplicationContext();
        b.a("subscribe(%s, %s, %s)...", new Object[] {
            context, s, broadcastreceiver
        });
        context.registerReceiver(broadcastreceiver, new IntentFilter(s));
        if (c == null)
        {
            c = new HashSet();
        }
        c.add(broadcastreceiver);
        b.a("subscribe(%s) OK!", new Object[] {
            s
        });
    }

    public abstract void m();

    public abstract void n();

}
