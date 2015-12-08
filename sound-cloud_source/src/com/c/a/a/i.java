// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a;

import c.e;
import c.y;
import c.z;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Array;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.c.a.a:
//            j

public final class i
{

    public static final byte a[] = new byte[0];
    public static final String b[] = new String[0];
    public static final Charset c = Charset.forName("UTF-8");

    public static int a(String s)
    {
        if ("http".equals(s))
        {
            return 80;
        }
        return !"https".equals(s) ? -1 : 443;
    }

    private static int a(String s, int k)
    {
        if (k != -1)
        {
            return k;
        } else
        {
            return a(s);
        }
    }

    public static int a(URI uri)
    {
        return a(uri.getScheme(), uri.getPort());
    }

    public static int a(URL url)
    {
        return a(url.getProtocol(), url.getPort());
    }

    public static c.i a(c.i k)
    {
        try
        {
            k = c.i.a(MessageDigest.getInstance("SHA-1").digest(k.d()));
        }
        // Misplaced declaration of an exception variable
        catch (c.i k)
        {
            throw new AssertionError(k);
        }
        return k;
    }

    public static List a(List list)
    {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static transient List a(Object aobj[])
    {
        return Collections.unmodifiableList(Arrays.asList((Object[])((Object []) (aobj)).clone()));
    }

    public static Map a(Map map)
    {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static void a(long l, long l1, long l2)
    {
        if ((l1 | l2) < 0L || l1 > l || l - l1 < l2)
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            return;
        }
    }

    public static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
        throw closeable;
        closeable;
    }

    public static void a(Closeable closeable, Closeable closeable1)
        throws IOException
    {
        Object obj = null;
        closeable.close();
        closeable = obj;
_L4:
        closeable1.close();
        closeable1 = closeable;
_L2:
        if (closeable1 == null)
        {
            return;
        }
        break; /* Loop/switch isn't completed */
        Throwable throwable;
        throwable;
        closeable1 = closeable;
        if (closeable == null)
        {
            closeable1 = throwable;
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (closeable1 instanceof IOException)
        {
            throw (IOException)closeable1;
        }
        if (closeable1 instanceof RuntimeException)
        {
            throw (RuntimeException)closeable1;
        }
        if (closeable1 instanceof Error)
        {
            throw (Error)closeable1;
        } else
        {
            throw new AssertionError(closeable1);
        }
        closeable;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(Socket socket)
    {
        if (socket == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        socket.close();
        return;
        socket;
        throw socket;
        socket;
    }

    public static boolean a(y y1, int k, TimeUnit timeunit)
        throws IOException
    {
        long l;
        long l1;
        l1 = System.nanoTime();
        if (y1.timeout().c)
        {
            l = y1.timeout().f() - l1;
        } else
        {
            l = 0x7fffffffffffffffL;
        }
        y1.timeout().a(Math.min(l, timeunit.toNanos(k)) + l1);
        try
        {
            for (timeunit = new e(); y1.a(timeunit, 2048L) != -1L; timeunit.n()) { }
        }
        // Misplaced declaration of an exception variable
        catch (TimeUnit timeunit)
        {
            if (l == 0x7fffffffffffffffL)
            {
                y1.timeout().c = false;
            } else
            {
                y1.timeout().a(l + l1);
            }
            return false;
        }
        finally
        {
            if (l != 0x7fffffffffffffffL) goto _L0; else goto _L0
        }
        if (l == 0x7fffffffffffffffL)
        {
            y1.timeout().c = false;
        } else
        {
            y1.timeout().a(l + l1);
        }
        return true;
        y1.timeout().c = false;
_L2:
        throw timeunit;
        y1.timeout().a(l + l1);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean a(y y1, TimeUnit timeunit)
    {
        boolean flag;
        try
        {
            flag = a(y1, 100, timeunit);
        }
        // Misplaced declaration of an exception variable
        catch (y y1)
        {
            return false;
        }
        return flag;
    }

    public static boolean a(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public static Object[] a(Class class1, Object aobj[], Object aobj1[])
    {
        ArrayList arraylist = new ArrayList();
        int i1 = aobj.length;
        int k = 0;
label0:
        do
        {
            if (k < i1)
            {
                Object obj = aobj[k];
                int j1 = aobj1.length;
                int l = 0;
                do
                {
label1:
                    {
                        if (l < j1)
                        {
                            Object obj1 = aobj1[l];
                            if (!obj.equals(obj1))
                            {
                                break label1;
                            }
                            arraylist.add(obj1);
                        }
                        k++;
                        continue label0;
                    }
                    l++;
                } while (true);
            }
            return arraylist.toArray((Object[])(Object[])Array.newInstance(class1, arraylist.size()));
        } while (true);
    }

    public static ThreadFactory b(String s)
    {
        return new j(s);
    }

}
