// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketImpl;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// Referenced classes of package b.a:
//            qd, eg, pk, fg, 
//            ac, pw, eu, dd, 
//            pv, eh, gt

public final class qc
    implements qd, InvocationHandler
{

    private gt a;
    private fg b;
    private SocketImpl c;
    private final Queue d = new LinkedList();
    private pv e;
    private pw f;

    public qc(gt gt1, fg fg1)
    {
        c = null;
        a = gt1;
        b = fg1;
    }

    private eg a(boolean flag)
    {
        eg eg1 = new eg();
        Object obj = c;
        obj = c();
        if (obj != null)
        {
            eg1.a(((InetAddress) (obj)));
        }
        int i = d();
        if (i > 0)
        {
            eg1.a(i);
        }
        if (flag)
        {
            eg1.a(pk.a);
        }
        if (b != null)
        {
            eg1.l = b.a();
        }
        if (ac.b())
        {
            eg1.a(ac.a());
        }
        return eg1;
    }

    private InputStream a(Object obj, Method method)
    {
        method = (InputStream)d(obj, method, new Object[0]);
        obj = method;
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        try
        {
            if (f == null)
            {
                break MISSING_BLOCK_LABEL_39;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            eu.a(((Throwable) (obj)));
            return method;
        }
        obj = method;
        if (f.a(method))
        {
            break MISSING_BLOCK_LABEL_61;
        }
        f = new pw(this, method, a);
        obj = f;
        return ((InputStream) (obj));
    }

    private static transient Object a(Object obj, Method method, Object aobj[])
    {
        boolean flag1 = false;
        try
        {
            obj = c(obj, method, aobj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            method = method.getExceptionTypes();
            int j = method.length;
            int i = 0;
            do
            {
label0:
                {
                    boolean flag = flag1;
                    if (i < j)
                    {
                        if (!method[i].isAssignableFrom(obj.getClass()))
                        {
                            break label0;
                        }
                        flag = true;
                    }
                    if (flag)
                    {
                        throw obj;
                    } else
                    {
                        throw new dd(((Throwable) (obj)));
                    }
                }
                i++;
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new dd(((Throwable) (obj)));
        }
        return obj;
    }

    private OutputStream b(Object obj, Method method)
    {
        method = (OutputStream)d(obj, method, new Object[0]);
        obj = method;
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        try
        {
            if (e == null)
            {
                break MISSING_BLOCK_LABEL_39;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            eu.a(((Throwable) (obj)));
            return method;
        }
        obj = method;
        if (e.a(method))
        {
            break MISSING_BLOCK_LABEL_57;
        }
        e = new pv(this, method);
        obj = e;
        return ((OutputStream) (obj));
    }

    private static transient Object b(Object obj, Method method, Object aobj[])
    {
        try
        {
            obj = c(obj, method, aobj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new dd(((Throwable) (obj)));
        }
        return obj;
    }

    private static transient Object c(Object obj, Method method, Object aobj[])
    {
        String s = method.getReturnType().getName();
        s = (new StringBuilder("super$")).append(method.getName()).append("$").append(s.replace('.', '_').replace('[', '_').replace(';', '_')).toString();
        try
        {
            method = obj.getClass().getDeclaredMethod(s, method.getParameterTypes());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new dd(((Throwable) (obj)));
        }
        try
        {
            obj = method.invoke(obj, aobj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new dd(((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new dd(((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            method = ((InvocationTargetException) (obj)).getCause();
            if (method == null)
            {
                throw new dd(((Throwable) (obj)));
            }
            if (method instanceof Exception)
            {
                throw (Exception)method;
            }
            if (method instanceof Error)
            {
                throw (Error)method;
            } else
            {
                throw new dd(method);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new dd(((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new dd(((Throwable) (obj)));
        }
        return obj;
    }

    private InetAddress c()
    {
        InetAddress inetaddress;
        try
        {
            inetaddress = (InetAddress)c.getClass().getDeclaredMethod("getInetAddress", new Class[0]).invoke(c, new Object[0]);
        }
        catch (RuntimeException runtimeexception)
        {
            throw runtimeexception;
        }
        catch (Throwable throwable)
        {
            throw new dd(throwable);
        }
        return inetaddress;
    }

    private int d()
    {
        int i;
        try
        {
            i = ((Integer)c.getClass().getDeclaredMethod("getPort", new Class[0]).invoke(c, new Object[0])).intValue();
        }
        catch (RuntimeException runtimeexception)
        {
            throw runtimeexception;
        }
        catch (Throwable throwable)
        {
            throw new dd(throwable);
        }
        return i;
    }

    private static transient Object d(Object obj, Method method, Object aobj[])
    {
        try
        {
            obj = c(obj, method, aobj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new dd(((Throwable) (obj)));
        }
        return obj;
    }

    public final eg a()
    {
        return a(true);
    }

    public final void a(eg eg1)
    {
        synchronized (d)
        {
            d.add(eg1);
        }
    }

    public final void a(SocketImpl socketimpl)
    {
        c = socketimpl;
    }

    public final eg b()
    {
        eg eg1;
        synchronized (d)
        {
            eg1 = (eg)d.poll();
        }
        return eg1;
    }

    public final Object invoke(Object obj, Method method, Object aobj[])
    {
        Object obj1 = method.getParameterTypes();
        if (!method.getName().equals("close")) goto _L2; else goto _L1
_L1:
        if (!Arrays.equals(((Object []) (obj1)), new Class[0])) goto _L4; else goto _L3
_L3:
        d(obj, method, new Object[0]);
        try
        {
            if (f != null)
            {
                f.d();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            eu.a(((Throwable) (obj)));
            return null;
        }
_L6:
        return null;
_L2:
        if (!method.getName().equals("connect"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (Arrays.equals(((Object []) (obj1)), new Class[] {
    java/lang/String, Integer.TYPE
}))
        {
            obj1 = (String)aobj[0];
            int i = ((Integer)aobj[1]).intValue();
            try
            {
                d(obj, method, new Object[] {
                    obj1, Integer.valueOf(i)
                });
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                if (obj1 != null)
                {
                    try
                    {
                        method = a(false);
                        method.b();
                        method.c();
                        method.e();
                        method.b(((String) (obj1)));
                        method.a(i);
                        method.a(((Throwable) (obj)));
                        a.a(method, eh.i);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        throw obj;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Method method)
                    {
                        eu.a(method);
                    }
                }
                throw obj;
            }
            return null;
        }
        if (Arrays.equals(((Object []) (obj1)), new Class[] {
    java/net/InetAddress, Integer.TYPE
}))
        {
            obj1 = (InetAddress)aobj[0];
            int j = ((Integer)aobj[1]).intValue();
            try
            {
                d(obj, method, new Object[] {
                    obj1, Integer.valueOf(j)
                });
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                if (obj1 != null)
                {
                    try
                    {
                        method = a(false);
                        method.b();
                        method.c();
                        method.e();
                        method.a(((InetAddress) (obj1)));
                        method.a(j);
                        method.a(((Throwable) (obj)));
                        a.a(method, eh.i);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        throw obj;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Method method)
                    {
                        eu.a(method);
                    }
                }
                throw obj;
            }
            return null;
        }
        if (Arrays.equals(((Object []) (obj1)), new Class[] {
    java/net/SocketAddress, Integer.TYPE
}))
        {
            obj1 = (SocketAddress)aobj[0];
            int k = ((Integer)aobj[1]).intValue();
            try
            {
                d(obj, method, new Object[] {
                    obj1, Integer.valueOf(k)
                });
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                if (obj1 != null)
                {
                    try
                    {
                        if (obj1 instanceof InetSocketAddress)
                        {
                            method = a(false);
                            aobj = (InetSocketAddress)obj1;
                            method.b();
                            method.c();
                            method.e();
                            method.a(((InetSocketAddress) (aobj)).getAddress());
                            method.a(((InetSocketAddress) (aobj)).getPort());
                            method.a(((Throwable) (obj)));
                            a.a(method, eh.i);
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        throw obj;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Method method)
                    {
                        eu.a(method);
                    }
                }
                throw obj;
            }
            return null;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (!method.getName().equals("getInputStream")) goto _L8; else goto _L7
_L7:
        if (!Arrays.equals(((Object []) (obj1)), new Class[0])) goto _L4; else goto _L9
_L9:
        obj = a(obj, method);
_L11:
        return obj;
_L8:
        if (method.getName().equals("getOutputStream"))
        {
            if (Arrays.equals(((Object []) (obj1)), new Class[0]))
            {
                obj = b(obj, method);
                continue; /* Loop/switch isn't completed */
            }
        } else
        {
            if (method.getExceptionTypes().length == 0)
            {
                obj = b(obj, method, aobj);
            } else
            {
                obj = a(obj, method, aobj);
            }
            continue; /* Loop/switch isn't completed */
        }
_L4:
        obj = null;
        if (true) goto _L11; else goto _L10
_L10:
    }
}
