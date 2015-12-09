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
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import javax.net.ssl.SSLSocket;

// Referenced classes of package b.a:
//            qd, eg, pk, fg, 
//            ac, dd, pw, eu, 
//            pv, eh, gt

public final class qa
    implements qd, InvocationHandler
{

    private gt a;
    private fg b;
    private final Queue c = new LinkedList();
    private SSLSocket d;
    private pv e;
    private pw f;

    public qa(gt gt1, fg fg1, SSLSocket sslsocket)
    {
        d = null;
        a = gt1;
        b = fg1;
        d = sslsocket;
    }

    private eg a(boolean flag)
    {
        eg eg1 = new eg();
        java.net.InetAddress inetaddress = d.getInetAddress();
        if (inetaddress != null)
        {
            eg1.a(inetaddress);
        }
        if (flag)
        {
            eg1.a(d.getPort());
        }
        eg1.a(pk.b);
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

    private transient Object a(Method method, Object aobj[])
    {
        boolean flag1 = false;
        try
        {
            aobj = ((Object []) (c(method, aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            throw method;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
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
                        if (!method[i].isAssignableFrom(((Object) (aobj)).getClass()))
                        {
                            break label0;
                        }
                        flag = true;
                    }
                    if (flag)
                    {
                        throw aobj;
                    } else
                    {
                        throw new dd(((Throwable) (aobj)));
                    }
                }
                i++;
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            throw new dd(method);
        }
        return ((Object) (aobj));
    }

    private transient Object b(Method method, Object aobj[])
    {
        try
        {
            method = ((Method) (c(method, aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            throw method;
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            throw new dd(method);
        }
        return method;
    }

    private InputStream c()
    {
        Object obj;
        obj = d.getInputStream();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        pw pw1;
        if (f != null && f.a(((InputStream) (obj))))
        {
            return f;
        }
        f = new pw(this, ((InputStream) (obj)), a);
        pw1 = f;
        return pw1;
        obj;
        throw obj;
        Throwable throwable;
        throwable;
        eu.a(throwable);
        return ((InputStream) (obj));
    }

    private transient Object c(Method method, Object aobj[])
    {
        try
        {
            method = ((Method) (method.invoke(d, aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            throw new dd(method);
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            throw new dd(method);
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            aobj = method.getCause();
            if (aobj == null)
            {
                throw new dd(method);
            }
            if (aobj instanceof Exception)
            {
                throw (Exception)aobj;
            }
            if (aobj instanceof Error)
            {
                throw (Error)aobj;
            } else
            {
                throw new dd(((Throwable) (aobj)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            throw new dd(method);
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            throw method;
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            throw new dd(method);
        }
        return method;
    }

    private OutputStream d()
    {
        Object obj;
        obj = d.getOutputStream();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        pv pv1;
        if (e != null && e.a(((OutputStream) (obj))))
        {
            return e;
        }
        pv1 = e;
        e = new pv(this, ((OutputStream) (obj)));
        pv1 = e;
        return pv1;
        obj;
        throw obj;
        Throwable throwable;
        throwable;
        eu.a(throwable);
        return ((OutputStream) (obj));
    }

    public final eg a()
    {
        return a(false);
    }

    public final void a(eg eg1)
    {
        synchronized (c)
        {
            c.add(eg1);
        }
    }

    public final eg b()
    {
        eg eg1;
        synchronized (c)
        {
            eg1 = (eg)c.poll();
        }
        return eg1;
    }

    public final Object invoke(Object obj, Method method, Object aobj[])
    {
        obj = method.getParameterTypes();
        if (!method.getName().equals("close")) goto _L2; else goto _L1
_L1:
        if (Arrays.equals(((Object []) (obj)), new Class[0]))
        {
            d.close();
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
        }
_L4:
        return null;
_L2:
        if (!method.getName().equals("startHandshake"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (Arrays.equals(((Object []) (obj)), new Class[0]))
        {
            try
            {
                d.startHandshake();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                try
                {
                    method = a(true);
                    method.b();
                    method.c();
                    method.e();
                    method.a(((Throwable) (obj)));
                    a.a(method, eh.j);
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
                throw obj;
            }
            return null;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!method.getName().equals("getInputStream"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (Arrays.equals(((Object []) (obj)), new Class[0]))
        {
            return c();
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (method.getName().equals("getOutputStream"))
        {
            if (Arrays.equals(((Object []) (obj)), new Class[0]))
            {
                return d();
            }
        } else
        if (method.getExceptionTypes().length == 0)
        {
            return b(method, aobj);
        } else
        {
            return a(method, aobj);
        }
        if (true) goto _L4; else goto _L6
_L6:
    }
}
