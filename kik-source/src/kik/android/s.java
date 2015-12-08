// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import android.os.Handler;
import com.kik.android.a;
import com.kik.g.p;
import com.kik.m.h;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeoutException;
import kik.a.f.g;
import kik.android.util.bf;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.android:
//            t, u, v

public final class s
{
    private final class a extends bf
    {

        boolean a;
        final s b;
        private String c;
        private File d;
        private byte e[];
        private String f;
        private int g;

        private transient String a()
        {
            Object obj3;
            Object obj4;
            Object obj7;
            Timer timer;
            timer = new Timer();
            timer.schedule(new u(this), 60000L);
            obj4 = null;
            obj7 = null;
            obj3 = null;
            Object obj;
            Object obj1;
            obj1 = new URL(c);
            obj = (HttpURLConnection)((URL) (obj1)).openConnection();
            if (e == null) goto _L2; else goto _L1
_L1:
            File file = new File(d.getParentFile(), (new StringBuilder()).append(d.getName()).append("_temp").toString());
_L4:
            long l = file.length();
            if (l <= 0L)
            {
                break MISSING_BLOCK_LABEL_146;
            }
            ((HttpURLConnection) (obj)).setRequestProperty("Range", (new StringBuilder("bytes=")).append(l).append("-").toString());
            int i = ((HttpURLConnection) (obj)).getResponseCode();
            if (i != 500 && i != 416)
            {
                break MISSING_BLOCK_LABEL_185;
            }
            ((HttpURLConnection) (obj)).disconnect();
            obj1 = (HttpURLConnection)((URL) (obj1)).openConnection();
            obj = obj1;
            Object obj2;
            SocketTimeoutException sockettimeoutexception;
            boolean flag;
            long l1;
            if (i == 206 && l > 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            double d1;
            Exception exception;
            Object obj5;
            Object obj6;
            Exception exception1;
            boolean flag1;
            if (!flag)
            {
                l = 0L;
            }
            l1 = ((HttpURLConnection) (obj)).getContentLength();
            if (flag)
            {
                l1 += l;
            }
            if (l1 >= (long)g)
            {
                throw new v();
            }
              goto _L3
            sockettimeoutexception;
            obj3 = null;
            sockettimeoutexception = null;
            obj2 = obj;
            obj = obj3;
_L18:
            kik.android.s.a(b, this);
            timer.cancel();
            if (obj2 != null)
            {
                ((HttpURLConnection) (obj2)).disconnect();
            }
            h.a(sockettimeoutexception);
            h.a(((java.io.Closeable) (obj)));
_L14:
            return null;
_L2:
            file = d;
              goto _L4
_L3:
            publishProgress(new Double[] {
                Double.valueOf(((double)l / (double)l1) * 100D)
            });
            ((HttpURLConnection) (obj)).setReadTimeout(60000);
            ((HttpURLConnection) (obj)).setConnectTimeout(60000);
            obj2 = new BufferedInputStream(((HttpURLConnection) (obj)).getInputStream(), 51200);
            obj6 = obj2;
            obj5 = obj;
            obj4 = new RandomAccessFile(file, "rw");
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_393;
            }
            ((RandomAccessFile) (obj4)).seek(l);
            sockettimeoutexception = new byte[51200];
_L6:
            flag = ((BufferedInputStream) (obj2)).read(sockettimeoutexception);
            if (flag == -1)
            {
                break MISSING_BLOCK_LABEL_512;
            }
            ((RandomAccessFile) (obj4)).write(sockettimeoutexception, 0, flag);
            l += flag;
            if (l >= (long)g)
            {
                throw new v();
            }
            publishProgress(new Double[] {
                Double.valueOf(((double)l / (double)l1) * 100D)
            });
            flag1 = isCancelled();
            if (!flag1) goto _L6; else goto _L5
_L5:
            timer.cancel();
            if (obj != null)
            {
                ((HttpURLConnection) (obj)).disconnect();
            }
            h.a(((java.io.Closeable) (obj2)));
            h.a(((java.io.Closeable) (obj4)));
            return null;
            timer.cancel();
            l = System.currentTimeMillis();
            sockettimeoutexception = e;
            if (sockettimeoutexception == null) goto _L8; else goto _L7
_L7:
            obj5 = null;
            obj3 = new FileOutputStream(d);
            sockettimeoutexception = new kik.android.net.a.a(file, "r", e, new byte[16], false);
            obj5 = new byte[51200];
_L11:
            flag = sockettimeoutexception.a(((byte []) (obj5)), 51200);
            if (flag <= 0) goto _L10; else goto _L9
_L9:
            ((FileOutputStream) (obj3)).write(((byte []) (obj5)), 0, flag);
              goto _L11
            obj5;
_L20:
            kik.android.s.a(b, c, ((Exception) (obj5)));
            file.delete();
            h.a(((java.io.Closeable) (obj3)));
            h.a(sockettimeoutexception);
            timer.cancel();
            if (obj != null)
            {
                ((HttpURLConnection) (obj)).disconnect();
            }
            h.a(((java.io.Closeable) (obj2)));
            h.a(((java.io.Closeable) (obj4)));
            return null;
_L10:
            ((FileOutputStream) (obj3)).flush();
            file.delete();
            h.a(((java.io.Closeable) (obj3)));
            h.a(sockettimeoutexception);
_L8:
            d1 = System.currentTimeMillis() - l;
            if (f == null) goto _L13; else goto _L12
_L12:
            sockettimeoutexception = kik.android.s.b(b).b("Content Downloaded");
            if (e != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            sockettimeoutexception.a("Is Encrypted", flag1).a("Decryption Time", d1 / 1000D).a("Content Size", file.length()).a("App ID", f).b();
_L13:
            a = true;
            timer.cancel();
            if (obj != null)
            {
                ((HttpURLConnection) (obj)).disconnect();
            }
            h.a(((java.io.Closeable) (obj2)));
            h.a(((java.io.Closeable) (obj4)));
              goto _L14
            sockettimeoutexception;
            obj3 = null;
_L19:
            file.delete();
            h.a(((java.io.Closeable) (obj3)));
            h.a(((java.io.Closeable) (obj5)));
            throw sockettimeoutexception;
            sockettimeoutexception;
            obj3 = obj4;
_L17:
            obj7 = obj3;
            obj6 = obj2;
            obj5 = obj;
            kik.android.s.a(b, c, sockettimeoutexception);
            timer.cancel();
            if (obj != null)
            {
                ((HttpURLConnection) (obj)).disconnect();
            }
            h.a(((java.io.Closeable) (obj2)));
            h.a(((java.io.Closeable) (obj3)));
              goto _L14
            sockettimeoutexception;
            obj2 = null;
            obj = null;
            obj3 = obj4;
_L16:
            timer.cancel();
            if (obj != null)
            {
                ((HttpURLConnection) (obj)).disconnect();
            }
            h.a(((java.io.Closeable) (obj2)));
            h.a(((java.io.Closeable) (obj3)));
            throw sockettimeoutexception;
            sockettimeoutexception;
            obj2 = null;
            obj3 = obj4;
            continue; /* Loop/switch isn't completed */
            sockettimeoutexception;
            obj2 = null;
            obj3 = obj4;
            continue; /* Loop/switch isn't completed */
            sockettimeoutexception;
            obj3 = obj7;
            obj2 = obj6;
            obj = obj5;
            continue; /* Loop/switch isn't completed */
            sockettimeoutexception;
            obj3 = obj4;
            continue; /* Loop/switch isn't completed */
            exception;
            obj4 = sockettimeoutexception;
            obj5 = obj2;
            sockettimeoutexception = exception;
            exception = ((Exception) (obj));
            obj2 = obj4;
            obj = obj5;
            if (true) goto _L16; else goto _L15
_L15:
            sockettimeoutexception;
            obj2 = null;
            obj = null;
              goto _L17
            sockettimeoutexception;
            obj2 = null;
              goto _L17
            sockettimeoutexception;
            obj2 = null;
              goto _L17
            sockettimeoutexception;
              goto _L17
            obj;
            obj = null;
            obj2 = null;
            sockettimeoutexception = null;
              goto _L18
            sockettimeoutexception;
            sockettimeoutexception = null;
            obj2 = obj;
            obj = null;
              goto _L18
            sockettimeoutexception;
            exception = null;
            sockettimeoutexception = ((SocketTimeoutException) (obj2));
            obj2 = obj;
            obj = exception;
              goto _L18
            sockettimeoutexception;
              goto _L19
            exception1;
            obj5 = sockettimeoutexception;
            sockettimeoutexception = exception1;
              goto _L19
            exception1;
            obj5 = sockettimeoutexception;
            sockettimeoutexception = exception1;
              goto _L19
            obj5;
            exception = null;
            sockettimeoutexception = null;
              goto _L20
            obj5;
            sockettimeoutexception = null;
              goto _L20
            SocketTimeoutException sockettimeoutexception1;
            sockettimeoutexception1;
            sockettimeoutexception1 = ((SocketTimeoutException) (obj2));
            obj2 = obj;
            obj = obj4;
              goto _L18
        }

        static String a(a a1)
        {
            return a1.c;
        }

        static String b(a a1)
        {
            return a1.f;
        }

        static File c(a a1)
        {
            return a1.d;
        }

        static byte[] d(a a1)
        {
            return a1.e;
        }

        static int e(a a1)
        {
            return a1.g;
        }

        protected final Object doInBackground(Object aobj[])
        {
            return a();
        }

        protected final void onPostExecute(Object obj)
        {
            if (a)
            {
                kik.android.s.a(b, c, d);
            }
        }

        protected final void onProgressUpdate(Object aobj[])
        {
            aobj = (Double[])aobj;
            if (kik.android.s.a(b).containsKey(c) && kik.android.s.a(b).get(c) != null)
            {
                for (Iterator iterator = ((List)kik.android.s.a(b).get(c)).iterator(); iterator.hasNext(); ((kik.a.e.s)iterator.next()).a(((Double) (aobj[0])).intValue())) { }
            }
        }

        public a(String s2, String s3, File file, byte abyte0[], int i)
        {
            b = s.this;
            super();
            a = false;
            c = s2;
            f = s3;
            d = file;
            e = abyte0;
            g = i;
        }
    }


    private static final b a = org.c.c.a("FileDownloadHandler");
    private Map b;
    private Map c;
    private Map d;
    private com.kik.android.a e;

    public s(com.kik.android.a a1)
    {
        b = new ConcurrentHashMap();
        c = new ConcurrentHashMap();
        d = new ConcurrentHashMap();
        e = a1;
    }

    static Map a(s s1)
    {
        return s1.d;
    }

    static void a(s s1, String s2, File file)
    {
        p p1 = (p)s1.b.get(s2);
        if (p1 != null)
        {
            s1.b.remove(s2);
            p1.a(file);
        }
    }

    static void a(s s1, String s2, Exception exception)
    {
        p p1 = (p)s1.b.get(s2);
        if (p1 != null)
        {
            a.a((new StringBuilder("Download failed: ")).append(s2).append(" ").append(exception.toString()).toString());
            s1.b.remove(s2);
            p1.a(exception);
        }
    }

    static void a(s s1, a a1)
    {
        String s2 = kik.android.a.a(a1);
        a.a((new StringBuilder("Download timed out: ")).append(s2).toString());
        Object obj = (Integer)s1.c.get(s2);
        Integer integer;
        int i;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = ((Integer) (obj)).intValue();
        }
        integer = Integer.valueOf(i);
        if (integer.intValue() < 5)
        {
            obj = s1.c;
            integer = Integer.valueOf(integer.intValue() + 1);
            ((Map) (obj)).put(s2, integer);
            s1.b(s2, kik.android.a.b(a1), kik.android.a.c(a1), a.d(a1), a.e(a1));
            a.a((new StringBuilder("Retrying download, attempt #")).append(integer.intValue() + 1).append(": ").append(s2).toString());
        } else
        {
            a1 = (p)s1.b.get(s2);
            if (a1 != null)
            {
                a.a((new StringBuilder("Download failed, too many retries: ")).append(s2).toString());
                s1.b.remove(s2);
                s1.c.remove(s2);
                a1.a(new TimeoutException());
                return;
            }
        }
    }

    static com.kik.android.a b(s s1)
    {
        return s1.e;
    }

    private void b(String s1, String s2, File file, byte abyte0[], int i)
    {
        s1 = new a(s1, s2, file, abyte0, i);
        try
        {
            s1.a(new String[0]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s2)
        {
            s2 = new Handler();
        }
        s2.postDelayed(new t(this, s1, s2), 200L);
    }

    public final p a(String s1, String s2, File file, byte abyte0[], int i)
    {
        if (s1 == null)
        {
            return com.kik.g.s.a(new Throwable("null url"));
        }
        if (b.containsKey(s1))
        {
            return (p)b.get(s1);
        } else
        {
            b(s1, s2, file, abyte0, i);
            s2 = new p();
            b.put(s1, s2);
            return s2;
        }
    }

    public final void a(String s1)
    {
        if (d.containsKey(s1))
        {
            d.remove(s1);
        }
    }

    public final void a(kik.a.e.s s1, String s2)
    {
        if (!d.containsKey(s2) || d.get(s2) == null)
        {
            d.put(s2, new ArrayList());
            ((List)d.get(s2)).add(s1);
            return;
        } else
        {
            ((List)d.get(s2)).add(s1);
            return;
        }
    }

}
