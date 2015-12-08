// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.b.a;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.nuance.a.a.a.a.d.a.d;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

// Referenced classes of package com.nuance.a.a.a.b.a:
//            l, d, m, i, 
//            f, h, g

public final class e
{

    public static String a;
    public static String b;
    public static int c;
    private static final com.nuance.a.a.a.a.d.a.e d = com.nuance.a.a.a.a.d.a.d.a(com/nuance/a/a/a/b/a/l);
    private Context e;
    private boolean f;
    private i g;
    private boolean h;
    private boolean i;
    private Object j;
    private final com.nuance.a.a.a.b.a.d k;
    private Object l;

    public e(Context context)
    {
        Object obj;
        g = null;
        h = false;
        i = false;
        j = null;
        l = new Object();
        e = context;
        k = new com.nuance.a.a.a.b.a.d();
        if (m.a > 10)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        f = true;
        a = i.b;
        b = com.nuance.a.a.a.b.a.i.d;
        c = i.j;
        obj = new f(this);
        context = ((Context) (l));
        context;
        JVM INSTR monitorenter ;
        long l1;
        l1 = System.currentTimeMillis();
        g = new i(e, ((k) (obj)));
        l.wait(1000L);
_L4:
        if (i) goto _L2; else goto _L1
_L1:
        if (d.e())
        {
            d.b("BluetoothHeadsetOEM reflected service NOT connected in time. Gave up!!!");
        }
        h = true;
        d();
_L6:
        return;
        Object obj1;
        obj1;
        if (!d.e()) goto _L4; else goto _L3
_L3:
        d.b((new StringBuilder("BluetoothHeadsetOEM reflected mHeadsetSyncObj.wait() threw exception:")).append(obj1).toString());
          goto _L4
        obj1;
        throw obj1;
_L2:
        if (!d.c()) goto _L6; else goto _L5
_L5:
        (new StringBuilder("BluetoothHeadsetOEM reflected service connection took ")).append(System.currentTimeMillis() - l1).append("ms");
          goto _L6
        Object obj2;
        Object obj3;
        Object obj4;
        Class class1;
        Class class2;
        f = false;
        obj1 = com.nuance.a.a.a.b.a.d.a("android.bluetooth.BluetoothHeadset");
        a = (String)com.nuance.a.a.a.b.a.d.a(((Class) (obj1)), "ACTION_AUDIO_STATE_CHANGED");
        b = (String)com.nuance.a.a.a.b.a.d.a(((Class) (obj1)), "EXTRA_STATE");
        c = ((Integer)com.nuance.a.a.a.b.a.d.a(((Class) (obj1)), "STATE_AUDIO_CONNECTED")).intValue();
        boolean flag;
        if (m.a == 11 || m.a == 12 || m.a == 13)
        {
            Object aobj[] = new Object[2];
            (new Thread(new h(aobj))).start();
            while (aobj[0] == null) 
            {
                try
                {
                    Thread.sleep(10L);
                }
                catch (Exception exception) { }
            }
            aobj = (BluetoothAdapter)aobj[1];
        } else
        {
            aobj = BluetoothAdapter.getDefaultAdapter();
        }
        obj3 = com.nuance.a.a.a.b.a.d.a("android.bluetooth.BluetoothProfile$ServiceListener");
        obj2 = getClass().getClassLoader();
        obj4 = new g(this);
        obj4 = Proxy.newProxyInstance(((ClassLoader) (obj2)), new Class[] {
            obj3
        }, ((java.lang.reflect.InvocationHandler) (obj4)));
        obj2 = l;
        obj2;
        JVM INSTR monitorenter ;
        l1 = System.currentTimeMillis();
        class1 = com.nuance.a.a.a.b.a.d.a("android.bluetooth.BluetoothProfile");
        class2 = com.nuance.a.a.a.b.a.d.a("android.bluetooth.BluetoothAdapter");
        flag = ((Boolean)com.nuance.a.a.a.b.a.d.a(class2, "isEnabled", new Class[0]).invoke(((Object) (aobj)), new Object[0])).booleanValue();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_486;
        }
        obj2;
        JVM INSTR monitorexit ;
        return;
        context;
        obj2;
        JVM INSTR monitorexit ;
        throw context;
        Exception exception1;
        exception1;
        exception1.printStackTrace();
        obj3 = com.nuance.a.a.a.b.a.d.a(class2, "getProfileProxy", new Class[] {
            android/content/Context, obj3, Integer.TYPE
        });
        ((Method) (obj3)).invoke(((Object) (aobj)), new Object[] {
            context, obj4, com.nuance.a.a.a.b.a.d.a(class1, "HEADSET")
        });
_L9:
        l.wait(1000L);
_L11:
        if (i) goto _L8; else goto _L7
_L7:
        if (d.e())
        {
            d.b("BluetoothHeadsetOEM native service NOT connected in time. Gave up!!!");
        }
        h = true;
_L13:
        obj2;
        JVM INSTR monitorexit ;
        return;
        context;
        context.printStackTrace();
          goto _L9
        context;
        if (!d.e()) goto _L11; else goto _L10
_L10:
        d.b((new StringBuilder("BluetoothHeadsetOEM native mHeadsetSyncObj.wait() threw exception:")).append(context).toString());
          goto _L11
_L8:
        if (!d.c()) goto _L13; else goto _L12
_L12:
        (new StringBuilder("BluetoothHeadsetOEM native service connection took ")).append(System.currentTimeMillis() - l1).append("ms");
          goto _L13
    }

    static Object a(e e1)
    {
        return e1.l;
    }

    static Object a(e e1, Object obj)
    {
        e1.j = obj;
        return obj;
    }

    static void a(Object obj)
    {
        b(obj);
    }

    private static void b(Object obj)
    {
        Class class1 = com.nuance.a.a.a.b.a.d.a("android.bluetooth.BluetoothProfile");
        Method method = com.nuance.a.a.a.b.a.d.b(com.nuance.a.a.a.b.a.d.a("android.bluetooth.BluetoothAdapter"), "closeProfileProxy", new Class[] {
            Integer.TYPE, class1
        });
        BluetoothAdapter bluetoothadapter = BluetoothAdapter.getDefaultAdapter();
        try
        {
            method.invoke(bluetoothadapter, new Object[] {
                (Integer)com.nuance.a.a.a.b.a.d.a(class1, "HEADSET"), obj
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
        }
    }

    static boolean b(e e1)
    {
        return e1.h;
    }

    static com.nuance.a.a.a.a.d.a.e c()
    {
        return d;
    }

    static boolean c(e e1)
    {
        e1.i = true;
        return true;
    }

    private void d()
    {
        if (g != null)
        {
            g.b();
            g = null;
        }
    }

    static void d(e e1)
    {
        e1.d();
    }

    public final BluetoothDevice a()
    {
        if (f && g != null)
        {
            return g.a();
        }
        if (!f && j != null)
        {
            Object obj = com.nuance.a.a.a.b.a.d.b(com.nuance.a.a.a.b.a.d.a("android.bluetooth.BluetoothProfile"), "getConnectedDevices", new Class[0]);
            try
            {
                obj = (List)((Method) (obj)).invoke(j, new Object[0]);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                exception = null;
            }
            if (obj != null && ((List) (obj)).size() > 0)
            {
                return (BluetoothDevice)((List) (obj)).get(0);
            } else
            {
                return null;
            }
        } else
        {
            return null;
        }
    }

    public final void b()
    {
        if (f)
        {
            d();
        } else
        if (j != null)
        {
            b(j);
            j = null;
            return;
        }
    }

}
