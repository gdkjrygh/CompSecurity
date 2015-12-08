// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewDebug;
import android.view.Window;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p.df.a;

public class ah
    implements Runnable
{
    private static class a extends ah
    {

        public void a(Activity activity)
        {
        }

        public void a(View view)
        {
        }

        public void a(View view, String s)
        {
        }

        public boolean a()
            throws IOException
        {
            return false;
        }

        public void b(Activity activity)
        {
        }

        public void b(View view)
        {
        }

        public boolean b()
        {
            return false;
        }

        public void c(Activity activity)
        {
        }

        public void run()
        {
        }

        private a()
        {
        }

    }

    private static class b extends OutputStream
    {

        private final OutputStream a;

        public void close()
            throws IOException
        {
        }

        public boolean equals(Object obj)
        {
            return a.equals(obj);
        }

        public void flush()
            throws IOException
        {
            a.flush();
        }

        public int hashCode()
        {
            return a.hashCode();
        }

        public String toString()
        {
            return a.toString();
        }

        public void write(int k)
            throws IOException
        {
            a.write(k);
        }

        public void write(byte abyte0[])
            throws IOException
        {
            a.write(abyte0);
        }

        public void write(byte abyte0[], int k, int l)
            throws IOException
        {
            a.write(abyte0, k, l);
        }

        b(OutputStream outputstream)
        {
            a = outputstream;
        }
    }

    private class c
        implements d, Runnable
    {

        final ah a;
        private Socket b;
        private boolean c;
        private boolean d;
        private final Object e[] = new Object[0];

        private View a(int k)
        {
            if (k != -1)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            com.pandora.android.util.ah.a(a).readLock().lock();
            Object obj = ah.b(a);
            com.pandora.android.util.ah.a(a).readLock().unlock();
            return ((View) (obj));
            Exception exception;
            exception;
            com.pandora.android.util.ah.a(a).readLock().unlock();
            throw exception;
            com.pandora.android.util.ah.a(a).readLock().lock();
            exception = ah.c(a).entrySet().iterator();
            java.util.Map.Entry entry;
            do
            {
                if (!exception.hasNext())
                {
                    break MISSING_BLOCK_LABEL_143;
                }
                entry = (java.util.Map.Entry)exception.next();
            } while (System.identityHashCode(entry.getKey()) != k);
            exception = (View)entry.getKey();
            com.pandora.android.util.ah.a(a).readLock().unlock();
            return exception;
            com.pandora.android.util.ah.a(a).readLock().unlock();
            return null;
            exception;
            com.pandora.android.util.ah.a(a).readLock().unlock();
            throw exception;
        }

        private boolean a(Socket socket)
        {
            Object obj = null;
            com.pandora.android.util.ah.a(a).readLock().lock();
            socket = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 8192);
            for (obj = ah.c(a).entrySet().iterator(); ((Iterator) (obj)).hasNext(); socket.write(10))
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                socket.write(Integer.toHexString(System.identityHashCode(entry.getKey())));
                socket.write(32);
                socket.append((CharSequence)entry.getValue());
            }

              goto _L1
            obj;
_L4:
            com.pandora.android.util.ah.a(a).readLock().unlock();
            if (socket != null)
            {
                try
                {
                    socket.close();
                }
                // Misplaced declaration of an exception variable
                catch (Socket socket)
                {
                    return false;
                }
                return false;
            } else
            {
                return false;
            }
_L1:
            socket.write("DONE.\n");
            socket.flush();
            com.pandora.android.util.ah.a(a).readLock().unlock();
            if (socket != null)
            {
                try
                {
                    socket.close();
                }
                // Misplaced declaration of an exception variable
                catch (Socket socket)
                {
                    return false;
                }
                return true;
            } else
            {
                return true;
            }
            obj;
            socket = null;
_L3:
            com.pandora.android.util.ah.a(a).readLock().unlock();
            if (socket != null)
            {
                try
                {
                    socket.close();
                }
                // Misplaced declaration of an exception variable
                catch (Socket socket) { }
            }
            throw obj;
            obj;
            if (true) goto _L3; else goto _L2
_L2:
            socket;
            socket = ((Socket) (obj));
              goto _L4
        }

        private boolean a(Socket socket, String s, String s1)
        {
            Object obj;
            Object obj1;
            Object obj2;
            Object obj3;
            boolean flag1;
            flag1 = true;
            obj3 = null;
            obj2 = null;
            obj1 = s1;
            obj = obj3;
            int l = s1.indexOf(' ');
            int k;
            k = l;
            if (l != -1)
            {
                break MISSING_BLOCK_LABEL_47;
            }
            obj1 = s1;
            obj = obj3;
            k = s1.length();
            obj1 = s1;
            obj = obj3;
            l = (int)Long.parseLong(s1.substring(0, k), 16);
            obj1 = s1;
            obj = obj3;
            if (k >= s1.length()) goto _L2; else goto _L1
_L1:
            obj1 = s1;
            obj = obj3;
            s1 = s1.substring(k + 1);
_L4:
            obj1 = s1;
            obj = obj3;
            View view = a(l);
            boolean flag;
            Method method;
            if (view == null)
            {
                if (false)
                {
                    try
                    {
                        throw new NullPointerException();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Socket socket)
                    {
                        return false;
                    }
                } else
                {
                    return false;
                }
            }
            break; /* Loop/switch isn't completed */
_L2:
            s1 = "";
            if (true) goto _L4; else goto _L3
_L3:
            obj1 = s1;
            obj = obj3;
            method = android/view/ViewDebug.getDeclaredMethod("dispatchCommand", new Class[] {
                android/view/View, java/lang/String, java/lang/String, java/io/OutputStream
            });
            obj1 = s1;
            obj = obj3;
            method.setAccessible(true);
            obj1 = s1;
            obj = obj3;
            method.invoke(null, new Object[] {
                view, s, s1, new b(socket.getOutputStream())
            });
            obj1 = s1;
            obj = obj3;
            if (socket.isOutputShutdown()) goto _L6; else goto _L5
_L5:
            obj1 = s1;
            obj = obj3;
            socket = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            socket.write("DONE\n");
            socket.flush();
_L13:
            flag = flag1;
            if (socket != null)
            {
                try
                {
                    socket.close();
                }
                // Misplaced declaration of an exception variable
                catch (Socket socket)
                {
                    flag = false;
                    continue; /* Loop/switch isn't completed */
                }
                flag = flag1;
            }
_L11:
            return flag;
            obj;
            s1 = ((String) (obj1));
            socket = obj2;
            obj1 = obj;
_L10:
            obj = socket;
            p.df.a.c("ViewServer", (new StringBuilder()).append("Could not send command ").append(s).append(" with parameters ").append(s1).toString(), ((Throwable) (obj1)));
            if (socket != null)
            {
                try
                {
                    socket.close();
                }
                // Misplaced declaration of an exception variable
                catch (Socket socket)
                {
                    flag = false;
                    continue; /* Loop/switch isn't completed */
                }
                flag = false;
                continue; /* Loop/switch isn't completed */
            }
            break MISSING_BLOCK_LABEL_420;
            socket;
_L8:
            if (obj != null)
            {
                try
                {
                    ((BufferedWriter) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (String s) { }
            }
            throw socket;
            s;
            obj = socket;
            socket = s;
            if (true) goto _L8; else goto _L7
_L7:
            obj1;
            if (true) goto _L10; else goto _L9
_L9:
            flag = false;
            if (true) goto _L11; else goto _L6
_L6:
            socket = null;
            if (true) goto _L13; else goto _L12
_L12:
        }

        private boolean b(Socket socket)
        {
            Object obj = null;
            socket = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 8192);
            ah.d(a).readLock().lock();
            obj = ah.b(a);
            ah.d(a).readLock().unlock();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_132;
            }
            com.pandora.android.util.ah.a(a).readLock().lock();
            String s = (String)ah.c(a).get(ah.b(a));
            com.pandora.android.util.ah.a(a).readLock().unlock();
            socket.write(Integer.toHexString(System.identityHashCode(obj)));
            socket.write(32);
            socket.append(s);
            socket.write(10);
            socket.flush();
            if (socket != null)
            {
                Exception exception;
                try
                {
                    socket.close();
                }
                // Misplaced declaration of an exception variable
                catch (Socket socket)
                {
                    return false;
                }
                return true;
            } else
            {
                return true;
            }
            obj;
            try
            {
                ah.d(a).readLock().unlock();
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            finally
            {
                obj = socket;
            }
_L3:
            if (socket != null)
            {
                try
                {
                    socket.close();
                }
                // Misplaced declaration of an exception variable
                catch (Socket socket)
                {
                    return false;
                }
                return false;
            } else
            {
                return false;
            }
            obj;
            com.pandora.android.util.ah.a(a).readLock().unlock();
            throw obj;
            socket = exception;
_L2:
            if (obj != null)
            {
                try
                {
                    ((BufferedWriter) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
            throw socket;
            socket;
            obj = null;
            if (true) goto _L2; else goto _L1
_L1:
            socket;
            socket = ((Socket) (obj));
              goto _L3
        }

        private boolean c()
        {
            com.pandora.android.util.ah.a(a, this);
            Object obj2 = new BufferedWriter(new OutputStreamWriter(b.getOutputStream()));
_L7:
            Object obj = obj2;
            if (Thread.interrupted()) goto _L2; else goto _L1
_L1:
            obj = obj2;
            Object obj3 = ((Object) (e));
            obj = obj2;
            obj3;
            JVM INSTR monitorenter ;
            while (!c && !d) 
            {
                ((Object) (e)).wait();
            }
              goto _L3
            Exception exception;
            exception;
            obj3;
            JVM INSTR monitorexit ;
            boolean flag;
            boolean flag1;
            obj = obj2;
            try
            {
                throw exception;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj3) { }
            finally
            {
                obj2 = obj;
            }
_L11:
            obj = obj2;
            p.df.a.c("ViewServer", "Connection error: ", ((Throwable) (obj3)));
            Object obj1;
            if (obj2 != null)
            {
                try
                {
                    ((BufferedWriter) (obj2)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1) { }
            }
            ah.b(a, this);
            return true;
_L3:
            if (!c)
            {
                break MISSING_BLOCK_LABEL_255;
            }
            c = false;
            flag = true;
_L13:
            if (!d) goto _L5; else goto _L4
_L4:
            d = false;
            flag1 = true;
_L12:
            obj3;
            JVM INSTR monitorexit ;
            if (!flag)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = obj2;
            ((BufferedWriter) (obj2)).write("LIST UPDATE\n");
            obj = obj2;
            ((BufferedWriter) (obj2)).flush();
            if (!flag1) goto _L7; else goto _L6
_L6:
            obj = obj2;
            ((BufferedWriter) (obj2)).write("FOCUS UPDATE\n");
            obj = obj2;
            ((BufferedWriter) (obj2)).flush();
            if (true) goto _L7; else goto _L8
_L8:
            obj1 = obj3;
_L10:
            if (obj2 != null)
            {
                try
                {
                    ((BufferedWriter) (obj2)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj2) { }
            }
            ah.b(a, this);
            throw obj1;
_L2:
            if (obj2 != null)
            {
                try
                {
                    ((BufferedWriter) (obj2)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1) { }
            }
            ah.b(a, this);
            return true;
            obj1;
            obj2 = null;
            if (true) goto _L10; else goto _L9
_L9:
            obj3;
            obj2 = null;
              goto _L11
_L5:
            flag1 = false;
              goto _L12
            flag = false;
              goto _L13
        }

        public void a()
        {
            synchronized (e)
            {
                c = true;
                ((Object) (e)).notifyAll();
            }
            return;
            exception;
            aobj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void b()
        {
            synchronized (e)
            {
                d = true;
                ((Object) (e)).notifyAll();
            }
            return;
            exception;
            aobj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void run()
        {
            BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(b.getInputStream()), 1024);
            Object obj = bufferedreader;
            String s = bufferedreader.readLine();
            if (s == null) goto _L2; else goto _L1
_L1:
            obj = bufferedreader;
            int k = s.indexOf(' ');
              goto _L3
_L15:
            obj = bufferedreader;
            if (!"PROTOCOL".equalsIgnoreCase(s)) goto _L5; else goto _L4
_L4:
            obj = bufferedreader;
            boolean flag = com.pandora.android.util.ah.a(b, "4");
_L6:
            if (flag)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            obj = bufferedreader;
            p.df.a.c("ViewServer", (new StringBuilder()).append("An error occurred with the command: ").append(s).toString());
            Object obj1;
            String s1;
            if (bufferedreader != null)
            {
                try
                {
                    bufferedreader.close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    ((IOException) (obj)).printStackTrace();
                }
            }
            if (b == null)
            {
                break MISSING_BLOCK_LABEL_134;
            }
            b.close();
_L8:
            return;
_L2:
            k = -1;
              goto _L3
_L13:
            obj = bufferedreader;
            obj1 = s.substring(0, k);
            obj = bufferedreader;
            s1 = s.substring(k + 1);
            s = ((String) (obj1));
            obj1 = s1;
            continue; /* Loop/switch isn't completed */
_L5:
            obj = bufferedreader;
            if (!"SERVER".equalsIgnoreCase(s))
            {
                break MISSING_BLOCK_LABEL_204;
            }
            obj = bufferedreader;
            flag = com.pandora.android.util.ah.a(b, "4");
              goto _L6
            obj = bufferedreader;
            if (!"LIST".equalsIgnoreCase(s))
            {
                break MISSING_BLOCK_LABEL_232;
            }
            obj = bufferedreader;
            flag = a(b);
              goto _L6
            obj = bufferedreader;
            if (!"GET_FOCUS".equalsIgnoreCase(s))
            {
                break MISSING_BLOCK_LABEL_260;
            }
            obj = bufferedreader;
            flag = b(b);
              goto _L6
            obj = bufferedreader;
            if (!"AUTOLIST".equalsIgnoreCase(s))
            {
                break MISSING_BLOCK_LABEL_284;
            }
            obj = bufferedreader;
            flag = c();
              goto _L6
            obj = bufferedreader;
            flag = a(b, s, ((String) (obj1)));
              goto _L6
            obj;
            ((IOException) (obj)).printStackTrace();
            return;
            obj1;
            bufferedreader = null;
_L11:
            obj = bufferedreader;
            p.df.a.c("ViewServer", "Connection error: ", ((Throwable) (obj1)));
            if (bufferedreader != null)
            {
                try
                {
                    bufferedreader.close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    ((IOException) (obj)).printStackTrace();
                }
            }
            if (b == null) goto _L8; else goto _L7
_L7:
            try
            {
                b.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
            return;
            Exception exception;
            exception;
            obj = null;
_L10:
            if (obj != null)
            {
                try
                {
                    ((BufferedReader) (obj)).close();
                }
                catch (IOException ioexception)
                {
                    ioexception.printStackTrace();
                }
            }
            if (b != null)
            {
                try
                {
                    b.close();
                }
                catch (IOException ioexception1)
                {
                    ioexception1.printStackTrace();
                }
            }
            throw exception;
            exception;
            if (true) goto _L10; else goto _L9
_L9:
            obj1;
              goto _L11
_L3:
            if (k != -1) goto _L13; else goto _L12
_L12:
            obj1 = "";
            if (true) goto _L15; else goto _L14
_L14:
        }

        public c(Socket socket)
        {
            a = ah.this;
            super();
            b = socket;
            c = false;
            d = false;
        }
    }

    private static interface d
    {

        public abstract void a();

        public abstract void b();
    }


    private static volatile ah j;
    private ServerSocket a;
    private final int b;
    private Thread c;
    private ExecutorService d;
    private final List e;
    private final HashMap f;
    private final ReentrantReadWriteLock g;
    private View h;
    private final ReentrantReadWriteLock i;

    private ah()
    {
        e = new CopyOnWriteArrayList();
        f = new HashMap();
        g = new ReentrantReadWriteLock();
        i = new ReentrantReadWriteLock();
        b = -1;
    }

    private ah(int k)
    {
        e = new CopyOnWriteArrayList();
        f = new HashMap();
        g = new ReentrantReadWriteLock();
        i = new ReentrantReadWriteLock();
        b = k;
    }


    public static ah a(Context context)
    {
        context = context.getApplicationInfo();
        if ("user".equals(Build.TYPE) && (((ApplicationInfo) (context)).flags & 2) != 0)
        {
            if (j == null)
            {
                j = new ah(4939);
            }
            if (!j.b())
            {
                try
                {
                    j.a();
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    p.df.a.c("ViewServer", "Error:", context);
                }
            }
        } else
        {
            j = new a();
        }
        return j;
    }

    static ReentrantReadWriteLock a(ah ah1)
    {
        return ah1.g;
    }

    private void a(d d1)
    {
        if (!e.contains(d1))
        {
            e.add(d1);
        }
    }

    static void a(ah ah1, d d1)
    {
        ah1.a(d1);
    }

    static boolean a(Socket socket, String s)
    {
        return b(socket, s);
    }

    static View b(ah ah1)
    {
        return ah1.h;
    }

    private void b(d d1)
    {
        e.remove(d1);
    }

    static void b(ah ah1, d d1)
    {
        ah1.b(d1);
    }

    private static boolean b(Socket socket, String s)
    {
        Object obj = null;
        socket = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 8192);
        socket.write(s);
        socket.write("\n");
        socket.flush();
        if (socket != null)
        {
            try
            {
                socket.close();
            }
            // Misplaced declaration of an exception variable
            catch (Socket socket)
            {
                return false;
            }
        }
        return true;
        socket;
        socket = obj;
_L3:
        if (socket != null)
        {
            try
            {
                socket.close();
            }
            // Misplaced declaration of an exception variable
            catch (Socket socket)
            {
                return false;
            }
            return false;
        } else
        {
            return false;
        }
        s;
        socket = null;
_L2:
        if (socket != null)
        {
            try
            {
                socket.close();
            }
            // Misplaced declaration of an exception variable
            catch (Socket socket) { }
        }
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
        s;
          goto _L3
    }

    static HashMap c(ah ah1)
    {
        return ah1.f;
    }

    private void c()
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((d)iterator.next()).a()) { }
    }

    static ReentrantReadWriteLock d(ah ah1)
    {
        return ah1.i;
    }

    private void d()
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((d)iterator.next()).b()) { }
    }

    public void a(Activity activity)
    {
        String s = activity.getTitle().toString();
        if (TextUtils.isEmpty(s))
        {
            s = (new StringBuilder()).append(activity.getClass().getCanonicalName()).append("/0x").append(System.identityHashCode(activity)).toString();
        } else
        {
            s = (new StringBuilder()).append(s).append("(").append(activity.getClass().getCanonicalName()).append(")").toString();
        }
        a(activity.getWindow().getDecorView(), s);
    }

    public void a(View view)
    {
        g.writeLock().lock();
        f.remove(view.getRootView());
        g.writeLock().unlock();
        c();
        return;
        view;
        g.writeLock().unlock();
        throw view;
    }

    public void a(View view, String s)
    {
        g.writeLock().lock();
        f.put(view.getRootView(), s);
        g.writeLock().unlock();
        c();
        return;
        view;
        g.writeLock().unlock();
        throw view;
    }

    public boolean a()
        throws IOException
    {
        if (c != null)
        {
            return false;
        } else
        {
            c = new Thread(this, (new StringBuilder()).append("Local View Server [port=").append(b).append("]").toString());
            d = Executors.newFixedThreadPool(10);
            c.start();
            return true;
        }
    }

    public void b(Activity activity)
    {
        a(activity.getWindow().getDecorView());
    }

    public void b(View view)
    {
        i.writeLock().lock();
        if (view != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        view = null;
_L1:
        h = view;
        i.writeLock().unlock();
        d();
        return;
        view = view.getRootView();
          goto _L1
        view;
        i.writeLock().unlock();
        throw view;
    }

    public boolean b()
    {
        return c != null && c.isAlive();
    }

    public void c(Activity activity)
    {
        b(activity.getWindow().getDecorView());
    }

    public void run()
    {
        Object obj;
        try
        {
            a = new ServerSocket(b, 10, InetAddress.getLocalHost());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            p.df.a.c("ViewServer", "Starting ServerSocket error: ", ((Throwable) (obj)));
        }
_L2:
        if (a == null || Thread.currentThread() != c)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = a.accept();
        if (d != null)
        {
            d.submit(new c(((Socket) (obj))));
            continue; /* Loop/switch isn't completed */
        }
        ((Socket) (obj)).close();
        continue; /* Loop/switch isn't completed */
        IOException ioexception;
        ioexception;
        try
        {
            ioexception.printStackTrace();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            p.df.a.c("ViewServer", "Connection error: ", ((Throwable) (obj)));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
