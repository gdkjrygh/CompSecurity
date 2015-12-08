// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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

public final class afe
    implements afh, InvocationHandler
{

    private abW a;
    private abv b;
    private final Queue c = new LinkedList();
    private SSLSocket d;
    private aeZ e;
    private afa f;

    public afe(abW abw, abv abv1, SSLSocket sslsocket)
    {
        d = null;
        a = abw;
        b = abv1;
        d = sslsocket;
    }

    private abb a(boolean flag)
    {
        abb abb1 = new abb();
        java.net.InetAddress inetaddress = d.getInetAddress();
        if (inetaddress != null)
        {
            abb1.a(inetaddress);
        }
        if (flag)
        {
            abb1.a(d.getPort());
        }
        abb1.a(aeU.a.b);
        if (b != null)
        {
            abb1.l = b.a();
        }
        ZT.a();
        return abb1;
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
                        throw new aaB(((Throwable) (aobj)));
                    }
                }
                i++;
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            throw new aaB(method);
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
            throw new aaB(method);
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
        afa afa1;
        if (f != null && f.a(((InputStream) (obj))))
        {
            return f;
        }
        f = new afa(this, ((InputStream) (obj)), a);
        afa1 = f;
        return afa1;
        obj;
        throw obj;
        Throwable throwable;
        throwable;
        abk.a(throwable);
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
            throw new aaB(method);
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            throw new aaB(method);
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            aobj = method.getCause();
            if (aobj == null)
            {
                throw new aaB(method);
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
                throw new aaB(((Throwable) (aobj)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            throw new aaB(method);
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            throw method;
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            throw new aaB(method);
        }
        return method;
    }

    private OutputStream d()
    {
        Object obj;
        obj = d.getOutputStream();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        aeZ aez;
        if (e != null && e.a(((OutputStream) (obj))))
        {
            return e;
        }
        e = new aeZ(this, ((OutputStream) (obj)));
        aez = e;
        return aez;
        obj;
        throw obj;
        Throwable throwable;
        throwable;
        abk.a(throwable);
        return ((OutputStream) (obj));
    }

    public final abb a()
    {
        return a(false);
    }

    public final void a(abb abb1)
    {
        synchronized (c)
        {
            c.add(abb1);
        }
    }

    public final abb b()
    {
        abb abb1;
        synchronized (c)
        {
            abb1 = (abb)c.poll();
        }
        return abb1;
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
                abk.a(((Throwable) (obj)));
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
                    method.f();
                    method.a(((Throwable) (obj)));
                    a.a(method, abb.a.e);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                // Misplaced declaration of an exception variable
                catch (Method method)
                {
                    abk.a(method);
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
