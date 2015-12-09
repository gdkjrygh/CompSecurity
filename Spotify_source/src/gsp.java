// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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

public final class gsp
{

    public static final byte a[] = new byte[0];
    public static final String b[] = new String[0];
    public static final Charset c = Charset.forName("UTF-8");

    public static String a(grj grj1)
    {
        if (grj1.d != grj.a(grj1.a))
        {
            return (new StringBuilder()).append(grj1.c).append(":").append(grj1.d).toString();
        } else
        {
            return grj1.c;
        }
    }

    public static String a(String s)
    {
        s = ByteString.a(MessageDigest.getInstance("MD5").digest(s.getBytes("UTF-8"))).d();
        return s;
        s;
_L2:
        throw new AssertionError(s);
        s;
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

    public static ThreadFactory a(String s, boolean flag)
    {
        return new ThreadFactory(s, flag) {

            private String a;
            private boolean b;

            public final Thread newThread(Runnable runnable)
            {
                runnable = new Thread(runnable, a);
                runnable.setDaemon(b);
                return runnable;
            }

            
            {
                a = s;
                b = flag;
                super();
            }
        };
    }

    public static ByteString a(ByteString bytestring)
    {
        try
        {
            bytestring = ByteString.a(MessageDigest.getInstance("SHA-1").digest(bytestring.g()));
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
        if ((0L | l1) < 0L || 0L > l || l < l1)
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

    public static boolean a(hcw hcw1, int i, TimeUnit timeunit)
    {
        long l;
        long l1;
        l1 = System.nanoTime();
        if (hcw1.T_().X_())
        {
            l = hcw1.T_().c() - l1;
        } else
        {
            l = 0x7fffffffffffffffL;
        }
        hcw1.T_().a(Math.min(l, timeunit.toNanos(i)) + l1);
        try
        {
            for (timeunit = new hch(); hcw1.a(timeunit, 2048L) != -1L; timeunit.s()) { }
        }
        // Misplaced declaration of an exception variable
        catch (TimeUnit timeunit)
        {
            if (l == 0x7fffffffffffffffL)
            {
                hcw1.T_().Y_();
            } else
            {
                hcw1.T_().a(l + l1);
            }
            return false;
        }
        finally
        {
            if (l != 0x7fffffffffffffffL) goto _L0; else goto _L0
        }
        if (l == 0x7fffffffffffffffL)
        {
            hcw1.T_().Y_();
        } else
        {
            hcw1.T_().a(l + l1);
        }
        return true;
        hcw1.T_().Y_();
_L2:
        throw timeunit;
        hcw1.T_().a(l + l1);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean a(hcw hcw1, TimeUnit timeunit)
    {
        boolean flag;
        try
        {
            flag = a(hcw1, 100, timeunit);
        }
        // Misplaced declaration of an exception variable
        catch (hcw hcw1)
        {
            return false;
        }
        return flag;
    }

    public static boolean a(AssertionError assertionerror)
    {
        return assertionerror.getCause() != null && assertionerror.getMessage() != null && assertionerror.getMessage().contains("getsockname failed");
    }

    public static boolean a(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public static Object[] a(Class class1, Object aobj[], Object aobj1[])
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
            return arraylist.toArray((Object[])Array.newInstance(class1, arraylist.size()));
        } while (true);
    }

    public static String b(String s)
    {
        int l = s.length();
        int i = 0;
        do
        {
            int j;
label0:
            {
                Object obj = s;
                if (i < l)
                {
                    j = s.codePointAt(i);
                    if (j > 31 && j < 127)
                    {
                        break label0;
                    }
                    obj = new hch();
                    ((hch) (obj)).a(s, 0, i);
                    while (i < l) 
                    {
                        int k = s.codePointAt(i);
                        if (k > 31 && k < 127)
                        {
                            j = k;
                        } else
                        {
                            j = 63;
                        }
                        ((hch) (obj)).a(j);
                        i = Character.charCount(k) + i;
                    }
                    obj = ((hch) (obj)).p();
                }
                return ((String) (obj));
            }
            i += Character.charCount(j);
        } while (true);
    }

}
