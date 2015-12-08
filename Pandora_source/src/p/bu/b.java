// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bu;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p.cw.c;
import p.df.a;

// Referenced classes of package p.bu:
//            d

public class b
    implements Runnable
{
    static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a e[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/bu/b$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("INITIALIZED", 0);
            b = new a("FETCHING", 1);
            c = new a("COMPLETED", 2);
            d = new a("FAILED", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private final String a;
    private File b;
    private d c;
    private a d;
    private Future e;

    public b(String s, File file)
    {
        d = p.bu.a.a;
        a = s;
        b = file;
    }

    private d a(URL url)
    {
        url = (HttpURLConnection)url.openConnection();
        if (url == null)
        {
            if (url != null)
            {
                url.disconnect();
            }
            return null;
        }
        d d1;
        url.setRequestMethod("HEAD");
        url.setInstanceFollowRedirects(true);
        url.connect();
        if (url.getResponseCode() != 200)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        d1 = new d(url.getHeaderFields());
        if (url != null)
        {
            url.disconnect();
        }
        return d1;
        if (url != null)
        {
            url.disconnect();
        }
_L1:
        return null;
        Object obj;
        obj;
        url = null;
_L4:
        p.df.a.d("PrefetchRequest", "IO Error, unable to fetch headers", ((Throwable) (obj)));
        if (url != null)
        {
            url.disconnect();
        }
          goto _L1
        obj;
        url = null;
_L3:
        if (url != null)
        {
            url.disconnect();
        }
        throw obj;
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L3; else goto _L2
_L2:
        obj;
          goto _L4
    }

    private void a(String s, File file)
    {
        byte abyte0[];
        Object obj1;
        Object obj2;
        abyte0 = null;
        obj2 = null;
        obj1 = null;
_L2:
        Object obj = obj2;
        if (com.pandora.android.provider.b.a.b().D())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj2;
        p.df.a.d("PrefetchRequest", "Sleeping - Can't prefetch video.");
        obj = obj2;
        Thread.sleep(250L);
        if (true) goto _L2; else goto _L1
        file;
        s = obj1;
_L20:
        obj = s;
        d = a.d;
        obj = s;
        p.df.a.a("PrefetchRequest", "IO Error, cannot prefetch video", file);
        if (s != null)
        {
            s.disconnect();
        }
_L4:
        return;
_L1:
        obj = obj2;
        s = new URL(s);
        obj = obj2;
        c = a(((URL) (s)));
        obj = obj2;
        if (c != null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj2;
        d = a.d;
        if (false)
        {
            throw new NullPointerException();
        }
        if (true) goto _L4; else goto _L3
_L3:
        obj = obj2;
        boolean flag = d();
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (false)
        {
            throw new NullPointerException();
        }
        if (true) goto _L4; else goto _L5
_L5:
        obj = obj2;
        d = a.b;
        obj = obj2;
        p.df.a.d("PrefetchRequest", (new StringBuilder()).append("Received headers, starting download : ").append(a).toString());
        obj = obj2;
        long l = c.a();
        obj = obj2;
        s = (HttpURLConnection)s.openConnection();
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        d = a.d;
        if (s == null) goto _L4; else goto _L6
_L6:
        s.disconnect();
        return;
        int i;
        s.setRequestMethod("GET");
        s.setRequestProperty("Range", (new StringBuilder()).append("bytes=0-").append(l / 4L).toString());
        s.connect();
        i = s.getResponseCode();
        if (i != 200 && i != 206) goto _L8; else goto _L7
_L7:
        obj = new BufferedInputStream(s.getInputStream());
        file = new FileOutputStream(file);
        abyte0 = new byte[4096];
_L11:
        i = ((InputStream) (obj)).read(abyte0);
        if (i == -1) goto _L10; else goto _L9
_L9:
        file.write(abyte0, 0, i);
          goto _L11
        obj;
_L18:
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_372;
        }
        file.flush();
        file.close();
        throw obj;
_L10:
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_386;
        }
        file.flush();
        file.close();
        d = p.bu.a.c;
        p.df.a.d("PrefetchRequest", (new StringBuilder()).append("Video prefetch completed : ").append(a).toString());
_L13:
        if (s == null) goto _L4; else goto _L12
_L12:
        s.disconnect();
        return;
_L8:
        d = a.d;
          goto _L13
        file;
_L17:
        obj = s;
        d = a.d;
        obj = s;
        p.df.a.a("PrefetchRequest", "Thread Interrupted while waiting to start prefetching", file);
        if (s == null) goto _L4; else goto _L14
_L14:
        s.disconnect();
        return;
        file;
        s = ((String) (obj));
_L16:
        if (s != null)
        {
            s.disconnect();
        }
        throw file;
        file;
        if (true) goto _L16; else goto _L15
_L15:
        file;
        s = abyte0;
          goto _L17
        obj;
        file = null;
          goto _L18
        file;
        if (true) goto _L20; else goto _L19
_L19:
    }

    public File a()
    {
        return b;
    }

    public void a(ExecutorService executorservice)
    {
        e = executorservice.submit(this);
    }

    public d b()
    {
        return c;
    }

    public a c()
    {
        return d;
    }

    protected boolean d()
    {
        return e != null && e.isCancelled();
    }

    public void e()
    {
        if (e != null)
        {
            e.cancel(true);
        }
    }

    public void run()
    {
        a(a, b);
    }
}
