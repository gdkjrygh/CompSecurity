// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.n;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.internal.util.client.b;
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

// Referenced classes of package com.google.android.gms.internal:
//            cq, hi, ay, ax, 
//            io, gu

public final class ct extends cq
{

    private static final Set b = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat c = new DecimalFormat("#,###");
    private File d;
    private boolean e;

    public ct(hi hi1)
    {
        super(hi1);
        hi1 = hi1.getContext().getCacheDir();
        if (hi1 == null)
        {
            com.google.android.gms.ads.internal.util.client.b.c("Context.getCacheDir() returned null");
        } else
        {
            d = new File(hi1, "admobVideoStreams");
            if (!d.isDirectory() && !d.mkdirs())
            {
                com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("Could not create preload cache directory at ")).append(d.getAbsolutePath()).toString());
                d = null;
                return;
            }
            if (!d.setReadable(true, false) || !d.setExecutable(true, false))
            {
                com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("Could not set cache file permissions at ")).append(d.getAbsolutePath()).toString());
                d = null;
                return;
            }
        }
    }

    private File a(File file)
    {
        return new File(d, (new StringBuilder()).append(file.getName()).append(".done").toString());
    }

    public final boolean a(String s)
    {
        Object obj;
        File file2;
        String s1;
        if (d == null)
        {
            a(s, null);
            return false;
        }
        do
        {
            au au;
            int i;
            boolean flag;
            if (d == null)
            {
                i = 0;
            } else
            {
                File afile[] = d.listFiles();
                int l2 = afile.length;
                i = 0;
                int k1 = 0;
                while (k1 < l2) 
                {
                    int j2 = i;
                    if (!afile[k1].getName().endsWith(".done"))
                    {
                        j2 = i + 1;
                    }
                    k1++;
                    i = j2;
                }
            }
            au = ay.o;
            if (i <= ((Integer)p.n().a(au)).intValue())
            {
                break;
            }
            if (d == null)
            {
                flag = false;
            } else
            {
                File file = null;
                long l3 = 0x7fffffffffffffffL;
                File afile1[] = d.listFiles();
                int l1 = afile1.length;
                for (int j = 0; j < l1; j++)
                {
                    File file1 = afile1[j];
                    if (file1.getName().endsWith(".done"))
                    {
                        continue;
                    }
                    long l5 = file1.lastModified();
                    if (l5 < l3)
                    {
                        file = file1;
                        l3 = l5;
                    }
                }

                flag = false;
                if (file != null)
                {
                    boolean flag1 = file.delete();
                    file = a(file);
                    flag = flag1;
                    if (file.isFile())
                    {
                        flag = flag1 & file.delete();
                    }
                }
            }
            if (!flag)
            {
                com.google.android.gms.ads.internal.util.client.b.c("Unable to expire stream cache");
                a(s, null);
                return false;
            }
        } while (true);
        n.a();
        obj = com.google.android.gms.ads.internal.util.client.a.a(s);
        file2 = new File(d, ((String) (obj)));
        obj = a(file2);
        if (file2.isFile() && ((File) (obj)).isFile())
        {
            int k = (int)file2.length();
            com.google.android.gms.ads.internal.util.client.b.a(3);
            a(s, file2.getAbsolutePath(), k);
            return true;
        }
        s1 = (new StringBuilder()).append(d.getAbsolutePath()).append(s).toString();
        synchronized (b)
        {
            if (!b.contains(s1))
            {
                break MISSING_BLOCK_LABEL_416;
            }
            com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("Stream cache already in progress at ")).append(s).toString());
            a(s, file2.getAbsolutePath());
        }
        return false;
        s;
        set;
        JVM INSTR monitorexit ;
        throw s;
        b.add(s1);
        set;
        JVM INSTR monitorexit ;
        Object obj1;
        obj1 = (new URL(s)).openConnection();
        au au1 = ay.t;
        int l = ((Integer)p.n().a(au1)).intValue();
        ((URLConnection) (obj1)).setConnectTimeout(l);
        ((URLConnection) (obj1)).setReadTimeout(l);
        if (!(obj1 instanceof HttpURLConnection)) goto _L2; else goto _L1
_L1:
        int i1 = ((HttpURLConnection)obj1).getResponseCode();
        if (i1 < 400) goto _L2; else goto _L3
_L3:
        try
        {
            throw new IOException((new StringBuilder("HTTP status code ")).append(i1).append(" at ").append(s).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj1 = null;
        }
_L8:
        Object obj2;
        Object obj3;
        ByteBuffer bytebuffer;
        io io1;
        Object obj4;
        Object obj5;
        int j1;
        int i2;
        int k2;
        int i3;
        long l4;
        long l6;
        try
        {
            ((FileOutputStream) (obj1)).close();
        }
        catch (IOException ioexception) { }
        catch (NullPointerException nullpointerexception) { }
        if (e)
        {
            com.google.android.gms.ads.internal.util.client.b.b((new StringBuilder("Preload aborted for URL \"")).append(s).append("\"").toString());
        } else
        {
            com.google.android.gms.ads.internal.util.client.b.b((new StringBuilder("Preload failed for URL \"")).append(s).append("\"").toString(), ((Throwable) (obj)));
        }
        if (file2.exists() && !file2.delete())
        {
            com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("Could not delete partial cache file at ")).append(file2.getAbsolutePath()).toString());
        }
        a(s, file2.getAbsolutePath());
        b.remove(s1);
        return false;
_L2:
        k2 = ((URLConnection) (obj1)).getContentLength();
        if (k2 >= 0)
        {
            break MISSING_BLOCK_LABEL_685;
        }
        com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("Stream cache aborted, missing content-length header at ")).append(s).toString());
        a(s, file2.getAbsolutePath());
        b.remove(s1);
        return false;
        obj2 = c.format(k2);
        obj3 = com.google.android.gms.internal.ay.p;
        i3 = ((Integer)p.n().a(((au) (obj3)))).intValue();
        if (k2 <= i3)
        {
            break MISSING_BLOCK_LABEL_778;
        }
        com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("Content length ")).append(((String) (obj2))).append(" exceeds limit at ").append(s).toString());
        a(s, file2.getAbsolutePath());
        b.remove(s1);
        return false;
        (new StringBuilder("Caching ")).append(((String) (obj2))).append(" bytes from ").append(s);
        com.google.android.gms.ads.internal.util.client.b.a(3);
        obj2 = Channels.newChannel(((URLConnection) (obj1)).getInputStream());
        obj1 = new FileOutputStream(file2);
        obj3 = ((FileOutputStream) (obj1)).getChannel();
        bytebuffer = ByteBuffer.allocate(0x100000);
        io1 = p.i();
        j1 = 0;
        l4 = io1.a();
        obj4 = ay.s;
        obj4 = new gu(((Long)p.n().a(((au) (obj4)))).longValue());
        obj5 = ay.r;
        l6 = ((Long)p.n().a(((au) (obj5)))).longValue();
_L5:
        i2 = ((ReadableByteChannel) (obj2)).read(bytebuffer);
        if (i2 < 0)
        {
            break MISSING_BLOCK_LABEL_1068;
        }
        i2 = j1 + i2;
        if (i2 <= i3)
        {
            break MISSING_BLOCK_LABEL_949;
        }
        throw new IOException("stream cache file size limit exceeded");
        bytebuffer.flip();
        while (((FileChannel) (obj3)).write(bytebuffer) > 0) ;
        bytebuffer.clear();
        if (io1.a() - l4 > 1000L * l6)
        {
            throw new IOException("stream cache time limit exceeded");
        }
        if (e)
        {
            throw new IOException("abort requested");
        }
        j1 = i2;
        if (!((gu) (obj4)).a()) goto _L5; else goto _L4
_L4:
        obj5 = file2.getAbsolutePath();
        a.a.post(new cq._cls1(this, s, ((String) (obj5)), i2, k2));
        j1 = i2;
          goto _L5
        ((FileOutputStream) (obj1)).close();
        if (com.google.android.gms.ads.internal.util.client.b.a(3))
        {
            obj2 = c.format(j1);
            (new StringBuilder("Preloaded ")).append(((String) (obj2))).append(" bytes from ").append(s);
            com.google.android.gms.ads.internal.util.client.b.a(3);
        }
        file2.setReadable(true, false);
        if (!((File) (obj)).isFile())
        {
            break MISSING_BLOCK_LABEL_1169;
        }
        ((File) (obj)).setLastModified(System.currentTimeMillis());
_L6:
        a(s, file2.getAbsolutePath(), j1);
        b.remove(s1);
        return true;
        try
        {
            ((File) (obj)).createNewFile();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
          goto _L6
        obj;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void b()
    {
        e = true;
    }

}
