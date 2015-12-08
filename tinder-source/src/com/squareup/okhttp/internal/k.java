// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import com.squareup.okhttp.p;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.Socket;
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
import okio.ByteString;
import okio.b;
import okio.c;
import okio.r;
import okio.s;

public final class k
{

    public static final byte a[] = new byte[0];
    public static final String b[] = new String[0];
    public static final Charset c = Charset.forName("UTF-8");

    public static String a(p p1)
    {
        if (p1.d != p.a(p1.a))
        {
            return (new StringBuilder()).append(p1.c).append(":").append(p1.d).toString();
        } else
        {
            return p1.c;
        }
    }

    public static String a(String s1)
    {
        s1 = ByteString.a(MessageDigest.getInstance("MD5").digest(s1.getBytes("UTF-8"))).b();
        return s1;
        s1;
_L2:
        throw new AssertionError(s1);
        s1;
        if (true) goto _L2; else goto _L1
_L1:
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

    public static ThreadFactory a(String s1, boolean flag)
    {
        return new ThreadFactory(s1, flag) {

            final String a;
            final boolean b;

            public final Thread newThread(Runnable runnable)
            {
                runnable = new Thread(runnable, a);
                runnable.setDaemon(b);
                return runnable;
            }

            
            {
                a = s1;
                b = flag;
                super();
            }
        };
    }

    public static ByteString a(ByteString bytestring)
    {
        try
        {
            bytestring = ByteString.a(MessageDigest.getInstance("SHA-1").digest(bytestring.d()));
        }
        // Misplaced declaration of an exception variable
        catch (ByteString bytestring)
        {
            throw new AssertionError(bytestring);
        }
        return bytestring;
    }

    public static void a(long l, long l1)
    {
        if ((0L | l1) < 0L || 0L > l || l - 0L < l1)
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
_L1:
        return;
        socket;
        if (!a(((AssertionError) (socket))))
        {
            throw socket;
        }
          goto _L1
        socket;
        throw socket;
        socket;
    }

    public static boolean a(AssertionError assertionerror)
    {
        return assertionerror.getCause() != null && assertionerror.getMessage() != null && assertionerror.getMessage().contains("getsockname failed");
    }

    public static boolean a(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public static boolean a(r r1, int i, TimeUnit timeunit)
        throws IOException
    {
        long l;
        long l1;
        l1 = System.nanoTime();
        if (r1.q_().u_())
        {
            l = r1.q_().c() - l1;
        } else
        {
            l = 0x7fffffffffffffffL;
        }
        r1.q_().a(Math.min(l, timeunit.toNanos(i)) + l1);
        try
        {
            for (timeunit = new c(); r1.a(timeunit, 2048L) != -1L; timeunit.r()) { }
        }
        // Misplaced declaration of an exception variable
        catch (TimeUnit timeunit)
        {
            if (l == 0x7fffffffffffffffL)
            {
                r1.q_().v_();
            } else
            {
                r1.q_().a(l + l1);
            }
            return false;
        }
        finally
        {
            if (l != 0x7fffffffffffffffL) goto _L0; else goto _L0
        }
        if (l == 0x7fffffffffffffffL)
        {
            r1.q_().v_();
        } else
        {
            r1.q_().a(l + l1);
        }
        return true;
        r1.q_().v_();
_L2:
        throw timeunit;
        r1.q_().a(l + l1);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean a(r r1, TimeUnit timeunit)
    {
        boolean flag;
        try
        {
            flag = a(r1, 100, timeunit);
        }
        // Misplaced declaration of an exception variable
        catch (r r1)
        {
            return false;
        }
        return flag;
    }

    public static Object[] a(Class class1, Object aobj[], Object aobj1[])
    {
        ArrayList arraylist = new ArrayList();
        int l = aobj.length;
        int i = 0;
label0:
        do
        {
            if (i < l)
            {
                Object obj = aobj[i];
                int i1 = aobj1.length;
                int j = 0;
                do
                {
label1:
                    {
                        if (j < i1)
                        {
                            Object obj1 = aobj1[j];
                            if (!obj.equals(obj1))
                            {
                                break label1;
                            }
                            arraylist.add(obj1);
                        }
                        i++;
                        continue label0;
                    }
                    j++;
                } while (true);
            }
            return arraylist.toArray((Object[])(Object[])Array.newInstance(class1, arraylist.size()));
        } while (true);
    }

    public static String b(String s1)
    {
        s1 = okio.b.a(ByteString.a(MessageDigest.getInstance("SHA-1").digest(s1.getBytes("UTF-8"))).c);
        return s1;
        s1;
_L2:
        throw new AssertionError(s1);
        s1;
        if (true) goto _L2; else goto _L1
_L1:
    }

}
