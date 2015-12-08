// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.androidquery.util;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.androidquery.util:
//            Common, Progress

public class a
{

    public static boolean a;
    private static boolean b;
    private static Object c;
    private static Thread.UncaughtExceptionHandler d;
    private static Map e;
    private static Handler f;
    private static ScheduledExecutorService g;
    private static File h;
    private static File i;
    private static final char j[];
    private static final byte k[];

    public a()
    {
    }

    public static File a(Context context)
    {
        if (h == null)
        {
            h = new File(context.getCacheDir(), "aquery");
            h.mkdirs();
        }
        return h;
    }

    public static File a(Context context, int l)
    {
        if (l == 1)
        {
            if (i != null)
            {
                return i;
            } else
            {
                i = new File(a(context), "persistent");
                i.mkdirs();
                return i;
            }
        } else
        {
            return a(context);
        }
    }

    public static File a(File file, String s)
    {
        if (s == null)
        {
            return null;
        }
        if (s.startsWith(File.separator))
        {
            return new File(s);
        } else
        {
            return c(file, b(s));
        }
    }

    public static transient Object a(Object obj, String s, boolean flag, boolean flag1, Class aclass[], Class aclass1[], Object aobj[])
    {
        try
        {
            obj = a(obj, s, flag, aclass, aclass1, aobj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (flag1)
            {
                b(((Throwable) (obj)));
            } else
            {
                a(((Throwable) (obj)));
            }
            return null;
        }
        return obj;
    }

    public static transient Object a(Object obj, String s, boolean flag, boolean flag1, Class aclass[], Object aobj[])
    {
        return a(obj, s, flag, flag1, aclass, null, aobj);
    }

    private static transient Object a(Object obj, String s, boolean flag, Class aclass[], Class aclass1[], Object aobj[])
        throws Exception
    {
        if (obj != null && s != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Class aclass2[];
        aclass2 = aclass;
        if (aclass != null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        aclass2 = new Class[0];
        aclass = ((Class []) (obj.getClass().getMethod(s, aclass2).invoke(obj, aobj)));
        return aclass;
        aclass;
        if (!flag) goto _L1; else goto _L3
_L3:
        if (aclass1 != null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        return obj.getClass().getMethod(s, new Class[0]).invoke(obj, new Object[0]);
        obj = obj.getClass().getMethod(s, aclass1).invoke(obj, aobj);
        return obj;
        obj;
        return null;
    }

    private static String a(String s)
    {
        return (new BigInteger(a(s.getBytes()))).abs().toString(36);
    }

    public static void a()
    {
        if (!b || c == null)
        {
            return;
        }
        synchronized (c)
        {
            c.notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void a(Context context, long l, long l1)
    {
        try
        {
            context = a(context);
            context = (new Common()).a(2, new Object[] {
                context, Long.valueOf(l), Long.valueOf(l1)
            });
            e().schedule(context, 0L, TimeUnit.MILLISECONDS);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            b(context);
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
    }

    public static void a(File file, long l, long l1)
    {
        file = file.listFiles();
        if (file == null)
        {
            return;
        }
        Arrays.sort(file, new Common());
        if (a(((File []) (file)), l))
        {
            b(file, l1);
        }
        file = d();
        if (file != null)
        {
            try
            {
                if (file.exists())
                {
                    b(file.listFiles(), 0L);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                b(file);
            }
        }
        return;
    }

    public static void a(File file, byte abyte0[])
    {
        boolean flag = file.exists();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        file.createNewFile();
_L1:
        Exception exception;
        try
        {
            file = new FileOutputStream(file);
            file.write(abyte0);
            file.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            b(file);
        }
        break MISSING_BLOCK_LABEL_52;
        exception;
        b("file create fail", file);
        b(exception);
          goto _L1
    }

    public static void a(File file, byte abyte0[], long l)
    {
        e().schedule((new Common()).a(1, new Object[] {
            file, abyte0
        }), l, TimeUnit.MILLISECONDS);
    }

    public static void a(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        a(inputstream, outputstream, 0, null);
    }

    public static void a(InputStream inputstream, OutputStream outputstream, int l, Progress progress)
        throws IOException
    {
        if (progress != null)
        {
            progress.a();
            progress.a(l);
        }
        byte abyte0[] = new byte[4096];
        l = 0;
        do
        {
            int i1;
            int j1;
            do
            {
                j1 = inputstream.read(abyte0);
                if (j1 == -1)
                {
                    if (progress != null)
                    {
                        progress.b();
                    }
                    return;
                }
                outputstream.write(abyte0, 0, j1);
                i1 = l + 1;
                if (a && i1 > 2)
                {
                    a("simulating internet error");
                    throw new IOException();
                }
                l = i1;
            } while (progress == null);
            progress.b(j1);
            l = i1;
        } while (true);
    }

    public static void a(Object obj)
    {
        if (b)
        {
            Log.w("AQuery", (new StringBuilder()).append(obj).toString());
        }
    }

    public static void a(Object obj, Object obj1)
    {
        Log.w("AQuery", (new StringBuilder()).append(obj).append(":").append(obj1).toString());
    }

    public static void a(Runnable runnable)
    {
        c().post(runnable);
    }

    public static void a(Throwable throwable)
    {
        if (b)
        {
            Log.w("AQuery", Log.getStackTraceString(throwable));
        }
    }

    private static boolean a(File afile[], long l)
    {
        long l1 = 0L;
        int j1 = afile.length;
        int i1 = 0;
        do
        {
            if (i1 >= j1)
            {
                return false;
            }
            l1 += afile[i1].length();
            if (l1 > l)
            {
                return true;
            }
            i1++;
        } while (true);
    }

    public static byte[] a(InputStream inputstream)
    {
        byte abyte0[];
        ByteArrayOutputStream bytearrayoutputstream;
        abyte0 = null;
        bytearrayoutputstream = new ByteArrayOutputStream();
        byte abyte1[];
        a(inputstream, ((OutputStream) (bytearrayoutputstream)));
        abyte1 = bytearrayoutputstream.toByteArray();
        abyte0 = abyte1;
_L2:
        a(((Closeable) (inputstream)));
        return abyte0;
        IOException ioexception;
        ioexception;
        b(ioexception);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static byte[] a(byte abyte0[])
    {
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update(abyte0);
            abyte0 = messagedigest.digest();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            b(abyte0);
            return null;
        }
        return abyte0;
    }

    public static File b(File file, String s)
    {
label0:
        {
            s = a(file, s);
            if (s != null && s.exists())
            {
                file = s;
                if (s.length() != 0L)
                {
                    break label0;
                }
            }
            file = null;
        }
        return file;
    }

    private static String b(String s)
    {
        return a(s);
    }

    public static void b(Context context)
    {
        a(context, 0x2dc6c0L, 0x1e8480L);
    }

    public static void b(File file, byte abyte0[])
    {
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_9;
        }
        a(file, abyte0);
        return;
        file;
        b(((Throwable) (file)));
        return;
    }

    public static void b(Object obj, Object obj1)
    {
        if (b)
        {
            Log.w("AQuery", (new StringBuilder()).append(obj).append(":").append(obj1).toString());
        }
    }

    public static void b(Throwable throwable)
    {
        if (throwable != null)
        {
            try
            {
                a("reporting", Log.getStackTraceString(throwable));
                if (d != null)
                {
                    d.uncaughtException(Thread.currentThread(), throwable);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable)
            {
                throwable.printStackTrace();
                return;
            }
        }
    }

    private static void b(File afile[], long l)
    {
        int i1 = 0;
        long l2 = 0L;
        int j1 = 0;
        do
        {
            if (i1 >= afile.length)
            {
                b("deleted", Integer.valueOf(j1));
                return;
            }
            File file = afile[i1];
            int k1 = j1;
            long l1 = l2;
            if (file.isFile())
            {
                l2 += file.length();
                k1 = j1;
                l1 = l2;
                if (l2 >= l)
                {
                    file.delete();
                    k1 = j1 + 1;
                    l1 = l2;
                }
            }
            i1++;
            j1 = k1;
            l2 = l1;
        } while (true);
    }

    public static boolean b()
    {
        return Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId();
    }

    public static Handler c()
    {
        if (f == null)
        {
            f = new Handler(Looper.getMainLooper());
        }
        return f;
    }

    private static File c(File file, String s)
    {
        return new File(file, s);
    }

    public static File d()
    {
        File file;
label0:
        {
            File file1 = new File(Environment.getExternalStorageDirectory(), "aquery/temp");
            file1.mkdirs();
            if (file1.exists())
            {
                file = file1;
                if (file1.canWrite())
                {
                    break label0;
                }
            }
            file = null;
        }
        return file;
    }

    private static ScheduledExecutorService e()
    {
        if (g == null)
        {
            g = Executors.newSingleThreadScheduledExecutor();
        }
        return g;
    }

    static 
    {
        char c1;
        int l;
        boolean flag;
        flag = false;
        b = false;
        e = new HashMap();
        a = false;
        j = new char[64];
        c1 = 'A';
        l = 0;
_L9:
        if (c1 <= 'Z') goto _L2; else goto _L1
_L1:
        c1 = 'a';
_L10:
        if (c1 <= 'z') goto _L4; else goto _L3
_L3:
        c1 = '0';
_L11:
        if (c1 <= '9') goto _L6; else goto _L5
_L5:
        char ac[] = j;
        int i1 = l + 1;
        ac[l] = '+';
        j[i1] = '/';
        k = new byte[128];
        l = 0;
_L12:
        if (l < k.length) goto _L8; else goto _L7
_L7:
        l = ((flag) ? 1 : 0);
_L13:
        if (l >= 64)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_172;
_L2:
        j[l] = c1;
        c1++;
        l++;
          goto _L9
_L4:
        j[l] = c1;
        c1++;
        l++;
          goto _L10
_L6:
        j[l] = c1;
        c1++;
        l++;
          goto _L11
_L8:
        k[l] = -1;
        l++;
          goto _L12
        k[j[l]] = (byte)l;
        l++;
          goto _L13
    }

    // Unreferenced inner class com/androidquery/util/AQUtility$1

/* anonymous class */
    class AQUtility._cls1
        implements Runnable
    {

        private final Object a;
        private final String b;
        private final Class c[];
        private final Object d[];

        public void run()
        {
            a.a(a, b, false, true, c, d);
        }
    }


    // Unreferenced inner class com/androidquery/util/AQUtility$3

/* anonymous class */
    class AQUtility._cls3
        implements Runnable
    {

        private final Object a;
        private final String b;
        private final Class c[];
        private final Object d[];

        public void run()
        {
            a.a(a, b, false, true, c, d);
        }
    }

}
