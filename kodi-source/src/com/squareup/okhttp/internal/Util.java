// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
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
import okio.Buffer;
import okio.ByteString;
import okio.Source;
import okio.Timeout;

public final class Util
{

    public static final byte EMPTY_BYTE_ARRAY[] = new byte[0];
    public static final String EMPTY_STRING_ARRAY[] = new String[0];
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    public static void checkOffsetAndCount(long l, long l1, long l2)
    {
        if ((l1 | l2) < 0L || l1 > l || l - l1 < l2)
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            return;
        }
    }

    public static void closeAll(Closeable closeable, Closeable closeable1)
        throws IOException
    {
        Object obj = null;
        closeable.close();
        closeable = obj;
_L1:
        closeable1.close();
        closeable1 = closeable;
_L2:
        if (closeable1 == null)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_39;
        closeable;
          goto _L1
        Throwable throwable;
        throwable;
        closeable1 = closeable;
        if (closeable == null)
        {
            closeable1 = throwable;
        }
          goto _L2
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
    }

    public static void closeQuietly(Closeable closeable)
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

    public static void closeQuietly(Socket socket)
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

    public static boolean discard(Source source, int i, TimeUnit timeunit)
    {
        boolean flag;
        try
        {
            flag = skipAll(source, i, timeunit);
        }
        // Misplaced declaration of an exception variable
        catch (Source source)
        {
            return false;
        }
        return flag;
    }

    public static boolean equal(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public static int getDefaultPort(String s)
    {
        if ("http".equals(s))
        {
            return 80;
        }
        return !"https".equals(s) ? -1 : 443;
    }

    private static int getEffectivePort(String s, int i)
    {
        if (i != -1)
        {
            return i;
        } else
        {
            return getDefaultPort(s);
        }
    }

    public static int getEffectivePort(URI uri)
    {
        return getEffectivePort(uri.getScheme(), uri.getPort());
    }

    public static int getEffectivePort(URL url)
    {
        return getEffectivePort(url.getProtocol(), url.getPort());
    }

    public static List immutableList(List list)
    {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static transient List immutableList(Object aobj[])
    {
        return Collections.unmodifiableList(Arrays.asList((Object[])((Object []) (aobj)).clone()));
    }

    public static Map immutableMap(Map map)
    {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    private static List intersect(Object aobj[], Object aobj1[])
    {
        ArrayList arraylist = new ArrayList();
        int k = aobj.length;
        int i = 0;
label0:
        do
        {
            if (i < k)
            {
                Object obj = aobj[i];
                int l = aobj1.length;
                int j = 0;
                do
                {
label1:
                    {
                        if (j < l)
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
            return arraylist;
        } while (true);
    }

    public static Object[] intersect(Class class1, Object aobj[], Object aobj1[])
    {
        aobj = intersect(aobj, aobj1);
        return ((List) (aobj)).toArray((Object[])(Object[])Array.newInstance(class1, ((List) (aobj)).size()));
    }

    public static String md5Hex(String s)
    {
        s = ByteString.of(MessageDigest.getInstance("MD5").digest(s.getBytes("UTF-8"))).hex();
        return s;
        s;
_L2:
        throw new AssertionError(s);
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static ByteString sha1(ByteString bytestring)
    {
        try
        {
            bytestring = ByteString.of(MessageDigest.getInstance("SHA-1").digest(bytestring.toByteArray()));
        }
        // Misplaced declaration of an exception variable
        catch (ByteString bytestring)
        {
            throw new AssertionError(bytestring);
        }
        return bytestring;
    }

    public static boolean skipAll(Source source, int i, TimeUnit timeunit)
        throws IOException
    {
        long l;
        long l1;
        l1 = System.nanoTime();
        if (source.timeout().hasDeadline())
        {
            l = source.timeout().deadlineNanoTime() - l1;
        } else
        {
            l = 0x7fffffffffffffffL;
        }
        source.timeout().deadlineNanoTime(Math.min(l, timeunit.toNanos(i)) + l1);
        try
        {
            for (timeunit = new Buffer(); source.read(timeunit, 2048L) != -1L; timeunit.clear()) { }
        }
        // Misplaced declaration of an exception variable
        catch (TimeUnit timeunit)
        {
            if (l == 0x7fffffffffffffffL)
            {
                source.timeout().clearDeadline();
            } else
            {
                source.timeout().deadlineNanoTime(l1 + l);
            }
            return false;
        }
        finally
        {
            if (l != 0x7fffffffffffffffL) goto _L0; else goto _L0
        }
        if (l == 0x7fffffffffffffffL)
        {
            source.timeout().clearDeadline();
        } else
        {
            source.timeout().deadlineNanoTime(l1 + l);
        }
        return true;
        source.timeout().clearDeadline();
_L2:
        throw timeunit;
        source.timeout().deadlineNanoTime(l1 + l);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static ThreadFactory threadFactory(String s, boolean flag)
    {
        return new ThreadFactory(s, flag) {

            final boolean val$daemon;
            final String val$name;

            public Thread newThread(Runnable runnable)
            {
                runnable = new Thread(runnable, name);
                runnable.setDaemon(daemon);
                return runnable;
            }

            
            {
                name = s;
                daemon = flag;
                super();
            }
        };
    }

}
