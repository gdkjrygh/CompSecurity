// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice.richmedia;

import android.content.Context;
import com.baidu.android.pushservice.util.PushDatabase;
import com.baidu.frontia.a.b.a.a;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

// Referenced classes of package com.baidu.android.pushservice.richmedia:
//            l, p, q, n, 
//            a, m

public class b extends Thread
    implements Comparable
{

    public static int e = 1;
    public static int f = 2;
    private static HashSet h = new HashSet();
    protected q a;
    public WeakReference b;
    protected long c;
    public n d;
    private l g;
    private boolean i;

    public b(Context context, q q1, n n1)
    {
        g = com.baidu.android.pushservice.richmedia.l.a(com/baidu/android/pushservice/richmedia/b.getName());
        i = false;
        a = q1;
        b = new WeakReference(context);
        c = System.currentTimeMillis();
        d = n1;
    }

    private int a(String s)
    {
        int j = ((HttpURLConnection)(new URL(s)).openConnection()).getContentLength();
        return j;
        s;
        com.baidu.frontia.a.b.a.a.d("HttpTask", (new StringBuilder("error ")).append(s.getMessage()).toString());
_L2:
        return 0;
        s;
        com.baidu.frontia.a.b.a.a.d("HttpTask", (new StringBuilder("error ")).append(s.getMessage()).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    private com.baidu.android.pushservice.util.PushDatabase.g a(Context context, String s)
    {
        context = PushDatabase.selectFileDownloadingInfo(context);
        if (context != null)
        {
            for (int j = 0; j < context.size(); j++)
            {
                if (((com.baidu.android.pushservice.util.PushDatabase.g)context.get(j)).b.equalsIgnoreCase(s))
                {
                    return (com.baidu.android.pushservice.util.PushDatabase.g)context.get(j);
                }
            }

        }
        return null;
    }

    private void a(p p1)
    {
        q q1 = a;
        if (q1 == null || p1 == null)
        {
            b(d);
            return;
        }
        if (p1.c != 0) goto _L2; else goto _L1
_L1:
        Object obj = p1.e;
        if (p1.a != com.baidu.android.pushservice.richmedia.n.a.a || obj == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        String s = ((String) (obj)).substring(0, ((String) (obj)).lastIndexOf("."));
        obj = new File(((String) (obj)));
        a(((File) (obj)), s);
        ((File) (obj)).delete();
        p1.e = s;
        a.a(this, p1);
_L3:
        b(d);
        return;
_L2:
        if (p1.c != 1)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        a.a(this, new Throwable((new StringBuilder("error: response http error errorCode=")).append(p1.b).toString()));
          goto _L3
        p1;
        b(d);
        throw p1;
label0:
        {
            if (p1.c != 3)
            {
                break label0;
            }
            a.a(this, new Throwable("error: request error,request is null or fileName is null."));
        }
          goto _L3
        if (p1.c != 2) goto _L5; else goto _L4
_L4:
        a.b(this);
          goto _L3
_L5:
        if (p1.c != -1) goto _L3; else goto _L6
_L6:
        a.a(this, new Throwable("IOException"));
          goto _L3
    }

    private static void a(File file, String s)
    {
        FileInputStream fileinputstream;
        ZipInputStream zipinputstream;
        fileinputstream = new FileInputStream(file);
        zipinputstream = new ZipInputStream(new BufferedInputStream(fileinputstream));
_L2:
        Object obj = zipinputstream.getNextEntry();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_277;
        }
        byte abyte0[];
        String s1;
        com.baidu.frontia.a.b.a.a.a("DownloadCompleteReceiver: ", (new StringBuilder("unzip----=")).append(obj).toString());
        abyte0 = new byte[4096];
        s1 = ((ZipEntry) (obj)).getName();
        file = null;
        if (s1.length() > 0)
        {
            file = s1.split("/");
        }
        file = new File((new StringBuilder()).append(s).append("/").append(file[file.length - 1]).toString());
        if (((ZipEntry) (obj)).isDirectory()) goto _L2; else goto _L1
_L1:
        obj = new File(file.getParent());
        if (!((File) (obj)).exists())
        {
            ((File) (obj)).mkdirs();
        }
        if (!file.exists())
        {
            file.createNewFile();
        }
        file = new FileOutputStream(file);
        obj = new BufferedOutputStream(file, 4096);
_L3:
        int j = zipinputstream.read(abyte0, 0, 4096);
        if (j == -1)
        {
            break MISSING_BLOCK_LABEL_260;
        }
        ((BufferedOutputStream) (obj)).write(abyte0, 0, j);
          goto _L3
        try
        {
            ((BufferedOutputStream) (obj)).flush();
            ((BufferedOutputStream) (obj)).close();
            file.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            try
            {
                file.printStackTrace();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                com.baidu.frontia.a.b.a.a.d("HttpTask", (new StringBuilder("error ")).append(file.getMessage()).toString());
                return;
            }
        }
          goto _L2
        fileinputstream.close();
        zipinputstream.close();
        return;
    }

    private static boolean a(n n1)
    {
        com/baidu/android/pushservice/richmedia/b;
        JVM INSTR monitorenter ;
        boolean flag = h.add(n1);
        com/baidu/android/pushservice/richmedia/b;
        JVM INSTR monitorexit ;
        return flag;
        n1;
        throw n1;
    }

    private p b()
    {
        p p1;
        p1 = new p();
        p1.d = d;
        if (d == null) goto _L2; else goto _L1
_L1:
        Object obj;
        com.baidu.android.pushservice.richmedia.a a1;
        p1.a = d.b();
        if (d.b == null)
        {
            break MISSING_BLOCK_LABEL_975;
        }
        if (!a(d))
        {
            g.c((new StringBuilder("Request url: ")).append(d.d()).append(" failed, already in queue").toString());
            a = null;
            d = null;
            return null;
        }
        obj = a((Context)b.get(), d.d());
        if (obj == null)
        {
            obj = new com.baidu.android.pushservice.util.PushDatabase.g();
            obj.b = d.d();
            obj.a = d.a;
            obj.c = d.c;
            obj.d = d.d;
            obj.g = 0;
            obj.h = a(((com.baidu.android.pushservice.util.PushDatabase.g) (obj)).b);
            obj.i = e;
            obj.f = ((com.baidu.android.pushservice.util.PushDatabase.g) (obj)).b.substring(((com.baidu.android.pushservice.util.PushDatabase.g) (obj)).b.lastIndexOf('/') + 1);
            obj.e = d.b;
            try
            {
                PushDatabase.insertFileDownloadingInfo((Context)b.get(), ((com.baidu.android.pushservice.util.PushDatabase.g) (obj)));
            }
            catch (Exception exception)
            {
                com.baidu.frontia.a.b.a.a.b("HttpTask", "HttpTask insertFileDownloadingInfo");
            }
        } else
        {
            obj.h = a(((com.baidu.android.pushservice.util.PushDatabase.g) (obj)).b);
        }
        if (((com.baidu.android.pushservice.util.PushDatabase.g) (obj)).i == f)
        {
            p1.c = 0;
            p1.d = d;
            p1.e = (new StringBuilder()).append(((com.baidu.android.pushservice.util.PushDatabase.g) (obj)).e).append("/").append(((com.baidu.android.pushservice.util.PushDatabase.g) (obj)).f).toString();
            return p1;
        }
        g.b((new StringBuilder("Request url: ")).append(d.d()).append(" success").toString());
        if (a != null)
        {
            a.a(this);
        }
        a1 = new com.baidu.android.pushservice.richmedia.a();
        Object obj1 = a1.a(d.c(), d.d(), d.a(), d.f);
        if (((HttpResponse) (obj1)).getStatusLine().getStatusCode() != 200) goto _L4; else goto _L3
_L3:
        Object obj2;
        File file;
        byte abyte0[];
        int j;
        obj1 = ((HttpResponse) (obj1)).getEntity().getContent();
        obj2 = new File(((com.baidu.android.pushservice.util.PushDatabase.g) (obj)).e);
        if (!((File) (obj2)).exists())
        {
            ((File) (obj2)).mkdirs();
        }
        file = new File((new StringBuilder()).append(((com.baidu.android.pushservice.util.PushDatabase.g) (obj)).e).append("/").append(((com.baidu.android.pushservice.util.PushDatabase.g) (obj)).f).toString());
        if (!file.exists())
        {
            file.createNewFile();
        }
        obj2 = new RandomAccessFile(file, "rw");
        ((RandomAccessFile) (obj2)).seek(((com.baidu.android.pushservice.util.PushDatabase.g) (obj)).g);
        abyte0 = new byte[0x19000];
        j = ((com.baidu.android.pushservice.util.PushDatabase.g) (obj)).g;
        m m1 = new m();
        m1.b = ((com.baidu.android.pushservice.util.PushDatabase.g) (obj)).h;
        m1.a = j;
        a(m1);
_L6:
        int k;
        int i1;
        i1 = j;
        k = j;
        if (i)
        {
            break; /* Loop/switch isn't completed */
        }
        k = j;
        int j1 = ((InputStream) (obj1)).read(abyte0);
        i1 = j;
        if (j1 == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        k = j;
        ((RandomAccessFile) (obj2)).write(abyte0, 0, j1);
        i1 = j + j1;
        k = i1;
        m m2 = new m();
        k = i1;
        m2.b = ((com.baidu.android.pushservice.util.PushDatabase.g) (obj)).h;
        k = i1;
        m2.a = i1;
        k = i1;
        a(m2);
        k = i1;
        j1 = ((com.baidu.android.pushservice.util.PushDatabase.g) (obj)).h;
        j = i1;
        if (i1 != j1) goto _L6; else goto _L5
_L5:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_752;
        }
        ((InputStream) (obj1)).close();
        ((RandomAccessFile) (obj2)).close();
        k = i1;
_L9:
        if (i) goto _L8; else goto _L7
_L7:
        obj.g = k;
        obj.i = f;
        PushDatabase.updateFileDownloadingInfo((Context)b.get(), ((com.baidu.android.pushservice.util.PushDatabase.g) (obj)).b, ((com.baidu.android.pushservice.util.PushDatabase.g) (obj)));
        p1.c = 0;
        p1.e = file.getAbsolutePath();
_L10:
        a1.a();
_L2:
        return p1;
        IOException ioexception;
        ioexception;
        com.baidu.frontia.a.b.a.a.d("HttpTask", ioexception.getMessage());
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_842;
        }
        ((InputStream) (obj1)).close();
        ((RandomAccessFile) (obj2)).close();
          goto _L9
        obj;
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("HttpTask", (new StringBuilder("download file Exception:")).append(((Exception) (obj)).getMessage()).toString());
        }
        p1.c = -1;
        a1.a();
          goto _L2
        obj;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_905;
        }
        ((InputStream) (obj1)).close();
        ((RandomAccessFile) (obj2)).close();
        throw obj;
        obj;
        a1.a();
        throw obj;
_L8:
        PushDatabase.deleteFileDownloadingInfo((Context)b.get(), ((com.baidu.android.pushservice.util.PushDatabase.g) (obj)).b);
        p1.c = 2;
        file.delete();
          goto _L10
_L4:
        p1.c = 1;
        p1.b = ((HttpResponse) (obj1)).getStatusLine().getStatusCode();
          goto _L10
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b("HttpTask", (new StringBuilder("download file Request error: ")).append(d).toString());
        }
        p1.c = 3;
          goto _L2
    }

    private static boolean b(n n1)
    {
        com/baidu/android/pushservice/richmedia/b;
        JVM INSTR monitorenter ;
        boolean flag = h.remove(n1);
        com/baidu/android/pushservice/richmedia/b;
        JVM INSTR monitorexit ;
        return flag;
        n1;
        throw n1;
    }

    public int a(b b1)
    {
        long l1;
        if (b1 != null)
        {
            if (c <= (l1 = b1.a()))
            {
                return c >= l1 ? 0 : 1;
            }
        }
        return -1;
    }

    public long a()
    {
        return c;
    }

    protected void a(m m1)
    {
        if (a != null)
        {
            a.a(this, m1);
        }
    }

    public int compareTo(Object obj)
    {
        return a((b)obj);
    }

    public void run()
    {
        a(b());
    }

}
