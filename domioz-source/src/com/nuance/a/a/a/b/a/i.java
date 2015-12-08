// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.b.a;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// Referenced classes of package com.nuance.a.a.a.b.a:
//            d, j, k

public final class i
{

    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    private static final Constructor m;
    private static final Method n;
    private static final Method o;
    private static final Method p;
    private static final Method q;
    private static final Method r;
    private static final Method s;
    private static final Method t;
    private static final Class u;
    private static final boolean v;
    private static final Method w;
    private static final Method x;
    private Object y;
    private k z;

    public i(Context context, k k1)
    {
        z = k1;
        k1 = getClass().getClassLoader();
        Class class1 = u;
        j j1 = new j(this);
        k1 = ((k) (Proxy.newProxyInstance(k1, new Class[] {
            class1
        }, j1)));
        try
        {
            y = m.newInstance(new Object[] {
                context, k1
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    static k a(i i1)
    {
        return i1.z;
    }

    public final BluetoothDevice a()
    {
        BluetoothDevice bluetoothdevice;
        if (q == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        bluetoothdevice = (BluetoothDevice)q.invoke(y, new Object[0]);
        return bluetoothdevice;
        Exception exception;
        exception;
        exception.printStackTrace();
        return null;
    }

    public final void b()
    {
        try
        {
            t.invoke(y, new Object[0]);
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    static 
    {
        new d();
        Class class1 = com.nuance.a.a.a.b.a.d.a("android.bluetooth.BluetoothHeadset");
        Class class2 = com.nuance.a.a.a.b.a.d.a("android.bluetooth.BluetoothHeadset$ServiceListener");
        m = com.nuance.a.a.a.b.a.d.a(class1, new Class[] {
            android/content/Context, class2
        });
        Method method = com.nuance.a.a.a.b.a.d.b(class1, "getState", new Class[0]);
        Method method1;
        boolean flag;
        if (method == null)
        {
            method = com.nuance.a.a.a.b.a.d.a(class1, "getState", new Class[] {
                android/bluetooth/BluetoothDevice
            });
            flag = true;
        } else
        {
            flag = false;
        }
        n = method;
        v = flag;
        q = com.nuance.a.a.a.b.a.d.a(class1, "getCurrentHeadset", new Class[0]);
        s = com.nuance.a.a.a.b.a.d.a(class1, "connectHeadset", new Class[] {
            android/bluetooth/BluetoothDevice
        });
        method1 = com.nuance.a.a.a.b.a.d.b(class1, "disconnectHeadset", new Class[0]);
        method = method1;
        if (method1 == null)
        {
            method = com.nuance.a.a.a.b.a.d.a(class1, "disconnectHeadset", new Class[] {
                android/bluetooth/BluetoothDevice
            });
        }
        r = method;
        o = com.nuance.a.a.a.b.a.d.a(class1, "startVoiceRecognition", new Class[0]);
        p = com.nuance.a.a.a.b.a.d.a(class1, "stopVoiceRecognition", new Class[0]);
        t = com.nuance.a.a.a.b.a.d.a(class1, "close", new Class[0]);
        w = com.nuance.a.a.a.b.a.d.a(class1, "getPriority", new Class[] {
            android/bluetooth/BluetoothDevice
        });
        x = com.nuance.a.a.a.b.a.d.a(class1, "setPriority", new Class[] {
            android/bluetooth/BluetoothDevice, Integer.TYPE
        });
        u = class2;
        a = (String)com.nuance.a.a.a.b.a.d.a(class1, "ACTION_STATE_CHANGED");
        b = (String)com.nuance.a.a.a.b.a.d.a(class1, "ACTION_AUDIO_STATE_CHANGED");
        c = (String)com.nuance.a.a.a.b.a.d.a(class1, "EXTRA_STATE");
        d = (String)com.nuance.a.a.a.b.a.d.a(class1, "EXTRA_AUDIO_STATE");
        e = ((Integer)com.nuance.a.a.a.b.a.d.a(class1, "STATE_ERROR")).intValue();
        f = ((Integer)com.nuance.a.a.a.b.a.d.a(class1, "STATE_DISCONNECTED")).intValue();
        g = ((Integer)com.nuance.a.a.a.b.a.d.a(class1, "STATE_CONNECTING")).intValue();
        h = ((Integer)com.nuance.a.a.a.b.a.d.a(class1, "STATE_CONNECTED")).intValue();
        i = ((Integer)com.nuance.a.a.a.b.a.d.a(class1, "AUDIO_STATE_DISCONNECTED")).intValue();
        j = ((Integer)com.nuance.a.a.a.b.a.d.a(class1, "AUDIO_STATE_CONNECTED")).intValue();
        k = ((Integer)com.nuance.a.a.a.b.a.d.a(class1, "PRIORITY_OFF")).intValue();
        l = ((Integer)com.nuance.a.a.a.b.a.d.a(class1, "PRIORITY_UNDEFINED", Integer.valueOf(-1))).intValue();
    }
}
