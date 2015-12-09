// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.pandora.radio.data.u;
import com.pandora.radio.provider.f;
import com.pandora.radio.util.NetworkUtil;
import com.pandora.radio.util.i;
import com.pandora.radio.util.k;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;
import p.cw.b;
import p.cw.c;
import p.dd.ab;
import p.dd.q;
import p.dd.r;
import p.df.a;

// Referenced classes of package p.cx:
//            x, y, q, n, 
//            o, d, z, h

public class m
{

    private static final Lock a = new ReentrantLock();
    private static Handler b;

    public static void a()
    {
        if (d().C())
        {
            d(0);
            return;
        } else
        {
            a(3004, true);
            return;
        }
    }

    private static transient void a(int j, d d1, Object aobj[])
    {
        if (!a.tryLock())
        {
            break MISSING_BLOCK_LABEL_41;
        }
        p.df.a.b("ExceptionHandler", "Partner login expired, starting re-auth");
        d().e().d();
_L1:
        a(d1, aobj);
        a.unlock();
        return;
        a.lock();
          goto _L1
        d1;
        if (!d().C())
        {
            break MISSING_BLOCK_LABEL_79;
        }
        i.a(d1.getMessage(), 0);
        a.unlock();
        return;
        a(j, true);
        a.unlock();
        return;
        d1;
        a.unlock();
        throw d1;
    }

    public static void a(int j, boolean flag)
    {
        d().a(new p.dd.c(j, flag));
    }

    private static void a(Context context, y y1)
    {
        JSONObject jsonobject;
        context = y1.b();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        jsonobject = context.optJSONObject("result");
        if (jsonobject == null) goto _L2; else goto _L1
_L1:
        jsonobject = jsonobject.optJSONObject("fieldErrors");
        if (jsonobject == null || jsonobject.length() != 1) goto _L2; else goto _L3
_L3:
        Iterator iterator = jsonobject.keys();
_L4:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        String s = (String)iterator.next();
        try
        {
            c(jsonobject.getInt(s));
            return;
        }
        catch (JSONException jsonexception)
        {
            try
            {
                p.df.a.b("ExceptionHandler", (new StringBuilder()).append("ExceptionHandler: Unexpected JSON exception : ").append(jsonexception).toString());
            }
            catch (ClassCastException classcastexception)
            {
                p.df.a.b("ExceptionHandler", (new StringBuilder()).append("ExceptionHandler: Unexpected error: ").append(classcastexception).toString());
            }
        }
        if (true) goto _L4; else goto _L2
_L2:
        if (!i.a(context.optString("message")))
        {
            c(3002);
            return;
        }
        c(y1.a());
        return;
    }

    public static void a(RemoteException remoteexception, Class class1)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("Unexpected Remote error occurred");
        if (remoteexception.getMessage() != null)
        {
            remoteexception = (new StringBuilder()).append(": ").append(remoteexception.getMessage()).toString();
        } else
        {
            remoteexception = "";
        }
        remoteexception = stringbuilder.append(remoteexception).append(" while ").append(class1.getSimpleName()).toString();
        p.df.a.c("ExceptionHandler", (new StringBuilder()).append("Remote Error: ").append(remoteexception).toString());
        c(3006);
    }

    private static void a(u u1, boolean flag, z z)
    {
        int j;
        u1 = u1.b();
        j = 0;
        static class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[com.pandora.radio.data.u.a.values().length];
                try
                {
                    a[com.pandora.radio.data.u.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.pandora.radio.data.u.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.pandora.radio.data.u.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        p.cx._cls3.a[u1.ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 71
    //                   2 104
    //                   3 111;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_111;
_L1:
        throw new IllegalStateException((new StringBuilder()).append("unhandled RadioState.Error ").append(u1).toString());
_L2:
        char c1;
        c1 = '\u0BBB';
        j = 0x186a1;
_L5:
        d().t().a(u1);
        if (d().C())
        {
            c(j);
            return;
        } else
        {
            d().a(new r(c1, flag, z));
            return;
        }
_L3:
        c1 = '\u0BBD';
          goto _L5
        c1 = '\u0BBA';
          goto _L5
    }

    static void a(Exception exception)
    {
        b(exception);
    }

    public static transient void a(d d1, Object aobj[])
    {
        u u1;
        if (d() == null)
        {
            u1 = null;
        } else
        {
            u1 = d().t();
        }
        if (u1 == null)
        {
            return;
        }
        if (u1.a())
        {
            a(u1, true, new z(d1, aobj) {

                final d a;
                final Object b[];

                public void a()
                {
                    p.cx.m.a(a, b);
                }

            
            {
                a = d1;
                b = aobj;
                super();
            }
            });
            return;
        }
        if (!d().u().b())
        {
            i.d();
        }
        c().post(new Runnable(d1, aobj) {

            final d a;
            final Object b[];

            public void run()
            {
                Object obj;
                Class class1;
                class1 = a.getClass();
                p.df.a.c("ExceptionHandler", (new StringBuilder()).append("Retrying Api Request: ").append(class1.getSimpleName()).toString());
                if (!(a instanceof h))
                {
                    break MISSING_BLOCK_LABEL_88;
                }
                obj = ((h)a).b();
_L1:
                class1.getMethod("execute", new Class[] {
                    [Ljava/lang/Object;
                }).invoke(obj, new Object[] {
                    b
                });
                return;
                try
                {
                    obj = class1.getConstructor(new Class[0]).newInstance(new Object[0]);
                }
                catch (NoSuchMethodException nosuchmethodexception)
                {
                    p.cx.m.a(nosuchmethodexception);
                    return;
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    p.cx.m.a(illegalargumentexception);
                    return;
                }
                catch (IllegalAccessException illegalaccessexception)
                {
                    p.cx.m.a(illegalaccessexception);
                    return;
                }
                catch (InvocationTargetException invocationtargetexception)
                {
                    p.cx.m.a(invocationtargetexception);
                    return;
                }
                catch (InstantiationException instantiationexception)
                {
                    p.cx.m.a(instantiationexception);
                    return;
                }
                  goto _L1
            }

            
            {
                a = d1;
                b = aobj;
                super();
            }
        });
    }

    public static boolean a(int j)
    {
        return j == 1001 || j == 13;
    }

    public static boolean a(Exception exception, Class class1)
    {
        boolean flag1 = false;
        String s = "";
        String s1 = exception.getMessage();
        boolean flag;
        int j;
        if (exception instanceof p.cx.q)
        {
            exception = com.pandora.radio.data.u.a.a;
            flag = false;
            j = 0;
        } else
        {
            if (!(exception instanceof n))
            {
                continue;
            }
            com.pandora.radio.data.u.a a1 = com.pandora.radio.data.u.a.b;
            s = ((n)exception).b();
            j = ((n)exception).a();
            flag = true;
            s1 = String.valueOf(j);
            j = 3005;
            exception = a1;
        }
        do
        {
            d().t().b(exception);
            p.df.a.c("ExceptionHandler", "%s Error: %s while %s", new Object[] {
                exception.name(), s1, class1.getSimpleName()
            });
            if (flag)
            {
                d().o().a(j, s, s1);
            }
            flag1 = true;
            do
            {
                return flag1;
            } while (!(exception instanceof JSONException));
            com.pandora.radio.data.u.a a2 = com.pandora.radio.data.u.a.c;
            j = 3002;
            if (exception instanceof o)
            {
                s = ((o)exception).a();
                flag = true;
                exception = a2;
            } else
            {
                flag = true;
                exception = a2;
            }
        } while (true);
    }

    public static transient boolean a(y y1, d d1, Object aobj[])
    {
        y1.a();
        JVM INSTR lookupswitch 6: default 64
    //                   12: 66
    //                   13: 129
    //                   1001: 129
    //                   1003: 140
    //                   1015: 177
    //                   1023: 169;
           goto _L1 _L2 _L3 _L3 _L4 _L5 _L6
_L1:
        return false;
_L2:
        b();
        if (d().C())
        {
            d(12);
        } else
        {
            a(y1.a(), true);
            if (d().d().u() == p.cw.b.a.a)
            {
                d().a(new q(8));
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        a(y1.a(), d1, aobj);
        return true;
_L4:
        if (d().C())
        {
            d(y1.a());
            return true;
        }
        a(y1.a(), true);
        continue; /* Loop/switch isn't completed */
_L6:
        b(d1, aobj);
        continue; /* Loop/switch isn't completed */
_L5:
        b(d1, aobj);
        if (true) goto _L1; else goto _L7
_L7:
    }

    private static void b()
    {
        d().x().a("CHECK_LICENSING", Boolean.valueOf(false));
    }

    private static void b(Exception exception)
    {
        p.df.a.b("ExceptionHandler", "ApiTask retry error: ", exception);
    }

    private static transient void b(d d1, Object aobj[])
    {
        if (d().l().h())
        {
            break MISSING_BLOCK_LABEL_46;
        }
        d().e().b();
        d().e().c();
        a(d1, aobj);
        d().l().a(true);
        return;
        d1;
        c(d1, null, new Object[0]);
        d().l().a(true);
        return;
        d1;
        if (!d().C())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        d(0);
        d().l().a(true);
        return;
        a(0, true);
        d().l().a(true);
        return;
        d1;
        d().l().a(true);
        throw d1;
    }

    public static transient void b(y y1, d d1, Object aobj[])
    {
        d1 = d().s();
        if (b(y1.a()))
        {
            return;
        }
        switch (y1.a())
        {
        default:
            d1 = y1.getMessage();
            if (d1 != null && d1.indexOf("STATION_CODE_INVALID") > 0)
            {
                c(3001);
                return;
            } else
            {
                c(y1.a());
                return;
            }

        case 10: // '\n'
            a(d1, y1);
            return;

        case 1000: 
        case 1005: 
        case 1006: 
        case 1007: 
        case 1026: 
        case 1035: 
        case 1036: 
        case 1037: 
        case 1038: 
        case 1039: 
        case 3000: 
            c(y1.a());
            return;
        }
    }

    public static boolean b(int j)
    {
        switch (j)
        {
        default:
            return false;

        case 12: // '\f'
        case 13: // '\r'
        case 1001: 
        case 1003: 
        case 1015: 
        case 1023: 
            return true;
        }
    }

    private static Handler c()
    {
        p/cx/m;
        JVM INSTR monitorenter ;
        Handler handler;
        if (b == null)
        {
            b = new Handler(Looper.getMainLooper());
        }
        handler = b;
        p/cx/m;
        JVM INSTR monitorexit ;
        return handler;
        Exception exception;
        exception;
        throw exception;
    }

    public static void c(int j)
    {
        d().a(new p.dd.c(j));
    }

    public static transient void c(y y1, d d1, Object aobj[])
    {
        a(y1, d1, aobj);
        b(y1, d1, aobj);
    }

    private static c d()
    {
        return c.z;
    }

    public static void d(int j)
    {
        d().a(new ab(j));
    }

}
