// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketImpl;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;

// Referenced classes of package crittercism.android:
//            ae, j, cj, c, 
//            d, bc, e, x, 
//            dx, w

public final class ac extends SocketImpl
    implements ae
{

    private static Field a;
    private static Field b;
    private static Field c;
    private static Field d;
    private static Method e[];
    private static boolean f;
    private static Throwable g;
    private final Queue h = new LinkedList();
    private e i;
    private d j;
    private SocketImpl k;
    private w l;
    private x m;

    public ac(e e1, d d1, SocketImpl socketimpl)
    {
        if (e1 == null)
        {
            throw new NullPointerException("dispatch was null");
        }
        if (socketimpl == null)
        {
            throw new NullPointerException("delegate was null");
        } else
        {
            i = e1;
            j = d1;
            k = socketimpl;
            f();
            return;
        }
    }

    private c a(boolean flag)
    {
        c c1 = new c();
        InetAddress inetaddress = getInetAddress();
        if (inetaddress != null)
        {
            c1.a(inetaddress);
        }
        int i1 = getPort();
        if (i1 > 0)
        {
            c1.a(i1);
        }
        if (flag)
        {
            c1.a(k.a.a);
        }
        if (j != null)
        {
            c1.j = j.a();
        }
        if (bc.b())
        {
            c1.a(bc.a());
        }
        return c1;
    }

    private transient Object a(int i1, Object aobj[])
    {
        try
        {
            a.set(k, address);
            b.set(k, fd);
            c.setInt(k, localport);
            d.setInt(k, port);
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            throw new cj(((Throwable) (aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            throw new cj(((Throwable) (aobj)));
        }
        aobj = ((Object []) (e[i1].invoke(k, aobj)));
        f();
        return ((Object) (aobj));
        aobj;
        throw new cj(((Throwable) (aobj)));
        aobj;
        f();
        throw aobj;
        aobj;
        throw new cj(((Throwable) (aobj)));
        aobj;
        Throwable throwable = ((InvocationTargetException) (aobj)).getTargetException();
        if (throwable != null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        throw new cj(((Throwable) (aobj)));
        if (throwable instanceof Exception)
        {
            throw (Exception)throwable;
        }
        if (throwable instanceof Error)
        {
            throw (Error)throwable;
        } else
        {
            throw new cj(throwable);
        }
        aobj;
        throw new cj(((Throwable) (aobj)));
        aobj;
        throw new cj(((Throwable) (aobj)));
    }

    private transient Object b(int i1, Object aobj[])
    {
        try
        {
            aobj = ((Object []) (a(i1, aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            throw aobj;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            throw new cj(((Throwable) (aobj)));
        }
        return ((Object) (aobj));
    }

    private transient Object c(int i1, Object aobj[])
    {
        try
        {
            aobj = ((Object []) (a(i1, aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            throw aobj;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            throw aobj;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            throw new cj(((Throwable) (aobj)));
        }
        return ((Object) (aobj));
    }

    public static boolean c()
    {
        return f;
    }

    public static Throwable d()
    {
        return g;
    }

    public static void e()
    {
        if (!f)
        {
            throw new cj(g);
        }
        Object obj = new SocketImpl() {

            protected final void accept(SocketImpl socketimpl)
            {
            }

            protected final int available()
            {
                return 0;
            }

            protected final void bind(InetAddress inetaddress, int i1)
            {
            }

            protected final void close()
            {
            }

            protected final void connect(String s, int i1)
            {
            }

            protected final void connect(InetAddress inetaddress, int i1)
            {
            }

            protected final void connect(SocketAddress socketaddress, int i1)
            {
            }

            protected final void create(boolean flag)
            {
            }

            protected final FileDescriptor getFileDescriptor()
            {
                return null;
            }

            protected final InetAddress getInetAddress()
            {
                return null;
            }

            protected final InputStream getInputStream()
            {
                return null;
            }

            protected final int getLocalPort()
            {
                return 0;
            }

            public final Object getOption(int i1)
            {
                return null;
            }

            protected final OutputStream getOutputStream()
            {
                return null;
            }

            protected final int getPort()
            {
                return 0;
            }

            protected final void listen(int i1)
            {
            }

            protected final void sendUrgentData(int i1)
            {
            }

            public final void setOption(int i1, Object obj2)
            {
            }

            protected final void setPerformancePreferences(int i1, int j1, int k1)
            {
            }

            protected final void shutdownInput()
            {
            }

            protected final void shutdownOutput()
            {
            }

            protected final boolean supportsUrgentData()
            {
                return false;
            }

            public final String toString()
            {
                return null;
            }

        };
        obj = new ac(new e(new Executor() {

            public final void execute(Runnable runnable)
            {
            }

        }), null, ((SocketImpl) (obj)));
        Object obj1 = new Object();
        try
        {
            ((ac) (obj)).setOption(0, obj1);
            ((ac) (obj)).getOption(0);
            ((ac) (obj)).sendUrgentData(0);
            ((ac) (obj)).listen(0);
            ((ac) (obj)).getOutputStream();
            ((ac) (obj)).getInputStream();
            ((ac) (obj)).create(false);
            ((ac) (obj)).connect(((SocketAddress) (null)), 0);
            ((ac) (obj)).connect(((InetAddress) (null)), 0);
            ((ac) (obj)).connect(((String) (null)), 0);
            ((ac) (obj)).close();
            ((ac) (obj)).bind(null, 0);
            ((ac) (obj)).available();
            ((ac) (obj)).accept(((SocketImpl) (obj)));
            ((ac) (obj)).getFileDescriptor();
            ((ac) (obj)).getInetAddress();
            ((ac) (obj)).getLocalPort();
            ((ac) (obj)).getPort();
            ((ac) (obj)).setPerformancePreferences(0, 0, 0);
            ((ac) (obj)).shutdownInput();
            ((ac) (obj)).shutdownOutput();
            ((ac) (obj)).supportsUrgentData();
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
        catch (cj cj1)
        {
            throw cj1;
        }
        catch (Throwable throwable)
        {
            throw new cj(throwable);
        }
    }

    private void f()
    {
        try
        {
            address = (InetAddress)a.get(k);
            fd = (FileDescriptor)b.get(k);
            localport = c.getInt(k);
            port = d.getInt(k);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw new cj(illegalargumentexception);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new cj(illegalaccessexception);
        }
    }

    public final c a()
    {
        return a(true);
    }

    public final void a(c c1)
    {
        synchronized (h)
        {
            h.add(c1);
        }
    }

    public final void accept(SocketImpl socketimpl)
    {
        c(0, new Object[] {
            socketimpl
        });
    }

    public final int available()
    {
        Integer integer = (Integer)c(1, new Object[0]);
        if (integer == null)
        {
            throw new cj("Received a null Integer");
        } else
        {
            return integer.intValue();
        }
    }

    public final c b()
    {
        c c1;
        synchronized (h)
        {
            c1 = (c)h.poll();
        }
        return c1;
    }

    public final void bind(InetAddress inetaddress, int i1)
    {
        c(2, new Object[] {
            inetaddress, Integer.valueOf(i1)
        });
    }

    public final void close()
    {
        c(3, new Object[0]);
        try
        {
            if (m != null)
            {
                m.d();
            }
            return;
        }
        catch (ThreadDeath threaddeath)
        {
            throw threaddeath;
        }
        catch (Throwable throwable)
        {
            dx.a(throwable);
        }
    }

    public final void connect(String s, int i1)
    {
        try
        {
            c(6, new Object[] {
                s, Integer.valueOf(i1)
            });
            return;
        }
        catch (IOException ioexception)
        {
            if (s != null)
            {
                try
                {
                    c c1 = a(false);
                    c1.f();
                    c1.b(s);
                    c1.a(i1);
                    c1.a(ioexception);
                    i.a(c1, c.a.i);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    dx.a(s);
                }
            }
        }
        throw ioexception;
    }

    public final void connect(InetAddress inetaddress, int i1)
    {
        try
        {
            c(4, new Object[] {
                inetaddress, Integer.valueOf(i1)
            });
            return;
        }
        catch (IOException ioexception)
        {
            if (inetaddress != null)
            {
                try
                {
                    c c1 = a(false);
                    c1.f();
                    c1.a(inetaddress);
                    c1.a(i1);
                    c1.a(ioexception);
                    i.a(c1, c.a.i);
                }
                // Misplaced declaration of an exception variable
                catch (InetAddress inetaddress)
                {
                    throw inetaddress;
                }
                // Misplaced declaration of an exception variable
                catch (InetAddress inetaddress)
                {
                    dx.a(inetaddress);
                }
            }
        }
        throw ioexception;
    }

    public final void connect(SocketAddress socketaddress, int i1)
    {
        try
        {
            c(5, new Object[] {
                socketaddress, Integer.valueOf(i1)
            });
            return;
        }
        catch (IOException ioexception)
        {
            if (socketaddress != null)
            {
                try
                {
                    if (socketaddress instanceof InetSocketAddress)
                    {
                        c c1 = a(false);
                        socketaddress = (InetSocketAddress)socketaddress;
                        c1.f();
                        c1.a(socketaddress.getAddress());
                        c1.a(socketaddress.getPort());
                        c1.a(ioexception);
                        i.a(c1, c.a.i);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (SocketAddress socketaddress)
                {
                    throw socketaddress;
                }
                // Misplaced declaration of an exception variable
                catch (SocketAddress socketaddress)
                {
                    dx.a(socketaddress);
                }
            }
        }
        throw ioexception;
    }

    public final void create(boolean flag)
    {
        c(7, new Object[] {
            Boolean.valueOf(flag)
        });
    }

    public final FileDescriptor getFileDescriptor()
    {
        return (FileDescriptor)b(8, new Object[0]);
    }

    public final InetAddress getInetAddress()
    {
        return (InetAddress)b(9, new Object[0]);
    }

    public final InputStream getInputStream()
    {
        Object obj;
        obj = (InputStream)c(10, new Object[0]);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        x x1;
        if (m != null && m.a(((InputStream) (obj))))
        {
            return m;
        }
        m = new x(this, ((InputStream) (obj)), i);
        x1 = m;
        return x1;
        obj;
        throw obj;
        Throwable throwable;
        throwable;
        dx.a(throwable);
        return ((InputStream) (obj));
    }

    public final int getLocalPort()
    {
        return ((Integer)b(11, new Object[0])).intValue();
    }

    public final Object getOption(int i1)
    {
        return k.getOption(i1);
    }

    public final OutputStream getOutputStream()
    {
        Object obj;
        obj = (OutputStream)c(12, new Object[0]);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        w w1;
        if (l != null && l.a(((OutputStream) (obj))))
        {
            return l;
        }
        l = new w(this, ((OutputStream) (obj)));
        w1 = l;
        return w1;
        obj;
        throw obj;
        Throwable throwable;
        throwable;
        dx.a(throwable);
        return ((OutputStream) (obj));
    }

    public final int getPort()
    {
        return ((Integer)b(13, new Object[0])).intValue();
    }

    public final void listen(int i1)
    {
        c(14, new Object[] {
            Integer.valueOf(i1)
        });
    }

    public final void sendUrgentData(int i1)
    {
        c(15, new Object[] {
            Integer.valueOf(i1)
        });
    }

    public final void setOption(int i1, Object obj)
    {
        k.setOption(i1, obj);
    }

    public final void setPerformancePreferences(int i1, int j1, int k1)
    {
        b(16, new Object[] {
            Integer.valueOf(i1), Integer.valueOf(j1), Integer.valueOf(k1)
        });
    }

    public final void shutdownInput()
    {
        c(17, new Object[0]);
    }

    public final void shutdownOutput()
    {
        c(18, new Object[0]);
    }

    public final boolean supportsUrgentData()
    {
        return ((Boolean)b(19, new Object[0])).booleanValue();
    }

    public final String toString()
    {
        return k.toString();
    }

    static 
    {
        e = new Method[20];
        f = false;
        g = null;
        Object obj;
        AccessibleObject aaccessibleobject[];
        a = java/net/SocketImpl.getDeclaredField("address");
        b = java/net/SocketImpl.getDeclaredField("fd");
        c = java/net/SocketImpl.getDeclaredField("localport");
        d = java/net/SocketImpl.getDeclaredField("port");
        obj = a;
        aaccessibleobject = new AccessibleObject[3];
        aaccessibleobject[0] = b;
        aaccessibleobject[1] = c;
        aaccessibleobject[2] = d;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        ((AccessibleObject) (obj)).setAccessible(true);
        if (aaccessibleobject.length > 0)
        {
            crittercism.android.j.a(aaccessibleobject);
        }
        e[0] = java/net/SocketImpl.getDeclaredMethod("accept", new Class[] {
            java/net/SocketImpl
        });
        e[1] = java/net/SocketImpl.getDeclaredMethod("available", new Class[0]);
        e[2] = java/net/SocketImpl.getDeclaredMethod("bind", new Class[] {
            java/net/InetAddress, Integer.TYPE
        });
        e[3] = java/net/SocketImpl.getDeclaredMethod("close", new Class[0]);
        e[4] = java/net/SocketImpl.getDeclaredMethod("connect", new Class[] {
            java/net/InetAddress, Integer.TYPE
        });
        e[5] = java/net/SocketImpl.getDeclaredMethod("connect", new Class[] {
            java/net/SocketAddress, Integer.TYPE
        });
        e[6] = java/net/SocketImpl.getDeclaredMethod("connect", new Class[] {
            java/lang/String, Integer.TYPE
        });
        e[7] = java/net/SocketImpl.getDeclaredMethod("create", new Class[] {
            Boolean.TYPE
        });
        e[8] = java/net/SocketImpl.getDeclaredMethod("getFileDescriptor", new Class[0]);
        e[9] = java/net/SocketImpl.getDeclaredMethod("getInetAddress", new Class[0]);
        e[10] = java/net/SocketImpl.getDeclaredMethod("getInputStream", new Class[0]);
        e[11] = java/net/SocketImpl.getDeclaredMethod("getLocalPort", new Class[0]);
        e[12] = java/net/SocketImpl.getDeclaredMethod("getOutputStream", new Class[0]);
        e[13] = java/net/SocketImpl.getDeclaredMethod("getPort", new Class[0]);
        e[14] = java/net/SocketImpl.getDeclaredMethod("listen", new Class[] {
            Integer.TYPE
        });
        e[15] = java/net/SocketImpl.getDeclaredMethod("sendUrgentData", new Class[] {
            Integer.TYPE
        });
        e[16] = java/net/SocketImpl.getDeclaredMethod("setPerformancePreferences", new Class[] {
            Integer.TYPE, Integer.TYPE, Integer.TYPE
        });
        e[17] = java/net/SocketImpl.getDeclaredMethod("shutdownInput", new Class[0]);
        e[18] = java/net/SocketImpl.getDeclaredMethod("shutdownOutput", new Class[0]);
        e[19] = java/net/SocketImpl.getDeclaredMethod("supportsUrgentData", new Class[0]);
        crittercism.android.j.a(e);
        f = true;
        return;
        Object obj1;
        obj1;
        f = false;
        g = ((Throwable) (obj1));
        return;
        obj1;
        int i1;
        f = false;
        i1 = 0;
_L3:
        if (i1 >= 20)
        {
            break MISSING_BLOCK_LABEL_688;
        }
        if (e[i1] != null) goto _L2; else goto _L1
_L1:
        g = new cj((new StringBuilder("Bad method: ")).append(i1).toString(), ((Throwable) (obj1)));
        return;
_L2:
        i1++;
          goto _L3
        NoSuchFieldException nosuchfieldexception;
        nosuchfieldexception;
        f = false;
        obj1 = "unknown";
        if (a != null) goto _L5; else goto _L4
_L4:
        obj1 = "address";
_L7:
        g = new cj((new StringBuilder("No such field: ")).append(((String) (obj1))).toString(), nosuchfieldexception);
        return;
_L5:
        if (b == null)
        {
            obj1 = "fd";
        } else
        if (c == null)
        {
            obj1 = "localport";
        } else
        if (d == null)
        {
            obj1 = "port";
        }
        if (true) goto _L7; else goto _L6
_L6:
        obj1;
        f = false;
        g = ((Throwable) (obj1));
        return;
        i1 = 20;
          goto _L1
    }
}
