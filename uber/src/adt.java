// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class adt
{

    private static final Set a = Collections.synchronizedSet(new HashSet());
    private akk b;
    private File c;
    private boolean d;

    public adt(akk akk1)
    {
        b = akk1;
        akk1 = akk1.getContext().getCacheDir();
        if (akk1 == null)
        {
            of.e("Context.getCacheDir() returned null");
        } else
        {
            c = new File(akk1, "admobVideoStreams");
            if (!c.mkdirs() && !c.isDirectory())
            {
                of.e((new StringBuilder("Could not create preload cache directory at ")).append(c.getAbsolutePath()).toString());
                c = null;
                return;
            }
        }
    }

    static akk a(adt adt1)
    {
        return adt1.b;
    }

    private File a(File file)
    {
        return new File(c, (new StringBuilder()).append(file.getName()).append(".done").toString());
    }

    private void a(String s, File file)
    {
        oe.a.post(new _cls3(s, file));
    }

    private void a(String s, File file, int i)
    {
        oe.a.post(new _cls2(s, file, i));
    }

    private void a(String s, File file, int i, int j)
    {
        oe.a.post(new _cls1(s, file, i, j));
    }

    private int b()
    {
        int i;
        int k;
        i = 0;
        k = 0;
        if (c != null) goto _L2; else goto _L1
_L1:
        return k;
_L2:
        File afile[] = c.listFiles();
        int l = afile.length;
        int j = 0;
        do
        {
            k = i;
            if (j >= l)
            {
                continue;
            }
            k = i;
            if (!afile[j].getName().endsWith(".done"))
            {
                k = i + 1;
            }
            j++;
            i = k;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    private static String b(String s)
    {
        kx.a();
        return oe.a(s);
    }

    private static void b(File file)
    {
        if (file.isFile())
        {
            file.setLastModified(System.currentTimeMillis());
            return;
        }
        try
        {
            file.createNewFile();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return;
        }
    }

    private boolean c()
    {
        if (c == null)
        {
            return false;
        }
        File file = null;
        long l = 0x7fffffffffffffffL;
        File afile[] = c.listFiles();
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            File file1 = afile[i];
            if (file1.getName().endsWith(".done"))
            {
                continue;
            }
            long l1 = file1.lastModified();
            if (l1 < l)
            {
                file = file1;
                l = l1;
            }
        }

        boolean flag;
        if (file != null)
        {
            boolean flag1 = file.delete();
            file = a(file);
            flag = flag1;
            if (file.isFile())
            {
                flag = flag1 & file.delete();
            }
        } else
        {
            flag = false;
        }
        return flag;
    }

    public final void a()
    {
        d = true;
    }

    public final boolean a(String s)
    {
        Object obj;
        String s1;
        Object obj1;
        if (c == null)
        {
            a(s, null);
            return false;
        }
        while (b() > ((Integer)abn.m.c()).intValue()) 
        {
            if (!c())
            {
                of.e("Unable to expire stream cache");
                a(s, null);
                return false;
            }
        }
        obj = b(s);
        obj = new File(c, ((String) (obj)));
        obj1 = a(((File) (obj)));
        if (((File) (obj)).isFile() && ((File) (obj1)).isFile())
        {
            int i = (int)((File) (obj)).length();
            of.a((new StringBuilder("Stream cache hit at ")).append(s).toString());
            a(s, ((File) (obj)), i);
            return true;
        }
        s1 = (new StringBuilder()).append(c.getAbsolutePath()).append(s).toString();
        synchronized (a)
        {
            if (!a.contains(s1))
            {
                break MISSING_BLOCK_LABEL_211;
            }
            of.e((new StringBuilder("Stream cache already in progress at ")).append(s).toString());
            a(s, ((File) (obj)));
        }
        return false;
        s;
        set;
        JVM INSTR monitorexit ;
        throw s;
        a.add(s1);
        set;
        JVM INSTR monitorexit ;
        Object obj2;
        int j;
        obj2 = (new URL(s)).openConnection();
        j = ((Integer)abn.q.c()).intValue();
        ((URLConnection) (obj2)).setConnectTimeout(j);
        ((URLConnection) (obj2)).setReadTimeout(j);
        if (!(obj2 instanceof HttpURLConnection))
        {
            break MISSING_BLOCK_LABEL_414;
        }
        j = ((HttpURLConnection)obj2).getResponseCode();
        if (j >= 400)
        {
            try
            {
                throw new IOException((new StringBuilder("HTTP status code ")).append(j).append(" at ").append(s).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            Object obj3;
            FileChannel filechannel;
            ByteBuffer bytebuffer;
            alm alm1;
            ajq ajq1;
            int k;
            int l;
            int i1;
            long l1;
            long l2;
            if (d)
            {
                of.e((new StringBuilder("Preload aborted for URL \"")).append(s).append("\"").toString());
            } else
            {
                of.d((new StringBuilder("Preload failed for URL \"")).append(s).append("\"").toString(), ((Throwable) (obj1)));
            }
            if (((File) (obj)).exists() && !((File) (obj)).delete())
            {
                of.e((new StringBuilder("Could not delete partial cache file at ")).append(((File) (obj)).getAbsolutePath()).toString());
            }
            a(s, ((File) (obj)));
            a.remove(s1);
            return false;
        }
        l = ((URLConnection) (obj2)).getContentLength();
        if (l >= 0)
        {
            break MISSING_BLOCK_LABEL_464;
        }
        of.e((new StringBuilder("Stream cache aborted, missing content-length header at ")).append(s).toString());
        a(s, ((File) (obj)));
        a.remove(s1);
        return false;
        obj3 = (new DecimalFormat("#,###")).format(l);
        i1 = ((Integer)abn.n.c()).intValue();
        if (l <= i1)
        {
            break MISSING_BLOCK_LABEL_552;
        }
        of.e((new StringBuilder("Content length ")).append(((String) (obj3))).append(" exceeds limit at ").append(s).toString());
        a(s, ((File) (obj)));
        a.remove(s1);
        return false;
        of.a((new StringBuilder("Caching ")).append(((String) (obj3))).append(" bytes from ").append(s).toString());
        obj2 = Channels.newChannel(((URLConnection) (obj2)).getInputStream());
        obj3 = new FileOutputStream(((File) (obj)));
        filechannel = ((FileOutputStream) (obj3)).getChannel();
        bytebuffer = ByteBuffer.allocate(0x100000);
        alm1 = ot.i();
        l1 = alm1.a();
        ajq1 = new ajq(((Long)abn.p.c()).longValue());
        l2 = ((Long)abn.o.c()).longValue();
        j = 0;
_L2:
        k = ((ReadableByteChannel) (obj2)).read(bytebuffer);
        if (k < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        k = j + k;
        if (k <= i1)
        {
            break MISSING_BLOCK_LABEL_711;
        }
        throw new IOException("stream cache file size limit exceeded");
        bytebuffer.flip();
        while (filechannel.write(bytebuffer) > 0) ;
        bytebuffer.clear();
        if (alm1.a() - l1 > 1000L * l2)
        {
            throw new IOException("stream cache time limit exceeded");
        }
        if (d)
        {
            throw new IOException("abort requested");
        }
        j = k;
        if (!ajq1.a())
        {
            continue; /* Loop/switch isn't completed */
        }
        a(s, ((File) (obj)), k, l);
        j = k;
        if (true) goto _L2; else goto _L1
_L1:
        ((FileOutputStream) (obj3)).close();
        if (of.a(3))
        {
            obj2 = (new DecimalFormat("#,###")).format(j);
            of.a((new StringBuilder("Preloaded ")).append(((String) (obj2))).append(" bytes from ").append(s).toString());
        }
        b(((File) (obj1)));
        a(s, ((File) (obj)), j);
        a.remove(s1);
        return true;
    }


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
