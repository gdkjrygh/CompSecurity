// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
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
//            cs, hs, ay, au, 
//            ix, he

public class cv extends cs
{

    private static final Set b = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat c = new DecimalFormat("#,###");
    private File d;
    private boolean e;

    public cv(hs hs1)
    {
        super(hs1);
        hs1 = hs1.getContext().getCacheDir();
        if (hs1 == null)
        {
            zzb.zzaE("Context.getCacheDir() returned null");
        } else
        {
            d = new File(hs1, "admobVideoStreams");
            if (!d.isDirectory() && !d.mkdirs())
            {
                zzb.zzaE((new StringBuilder()).append("Could not create preload cache directory at ").append(d.getAbsolutePath()).toString());
                d = null;
                return;
            }
            if (!d.setReadable(true, false) || !d.setExecutable(true, false))
            {
                zzb.zzaE((new StringBuilder()).append("Could not set cache file permissions at ").append(d.getAbsolutePath()).toString());
                d = null;
                return;
            }
        }
    }

    private File a(File file)
    {
        return new File(d, (new StringBuilder()).append(file.getName()).append(".done").toString());
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

    public void a()
    {
        e = true;
    }

    public boolean a(String s)
    {
        Object obj;
        File file;
        String s1;
        if (d == null)
        {
            a(s, null);
            return false;
        }
        while (c() > ((Integer)ay.o.c()).intValue()) 
        {
            if (!d())
            {
                zzb.zzaE("Unable to expire stream cache");
                a(s, null);
                return false;
            }
        }
        obj = b(s);
        file = new File(d, ((String) (obj)));
        obj = a(file);
        if (file.isFile() && ((File) (obj)).isFile())
        {
            int i = (int)file.length();
            zzb.zzaC((new StringBuilder()).append("Stream cache hit at ").append(s).toString());
            a(s, file.getAbsolutePath(), i);
            return true;
        }
        s1 = (new StringBuilder()).append(d.getAbsolutePath()).append(s).toString();
        synchronized (b)
        {
            if (!b.contains(s1))
            {
                break MISSING_BLOCK_LABEL_226;
            }
            zzb.zzaE((new StringBuilder()).append("Stream cache already in progress at ").append(s).toString());
            a(s, file.getAbsolutePath());
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
        int j = ((Integer)ay.t.c()).intValue();
        ((URLConnection) (obj1)).setConnectTimeout(j);
        ((URLConnection) (obj1)).setReadTimeout(j);
        if (!(obj1 instanceof HttpURLConnection)) goto _L2; else goto _L1
_L1:
        int k = ((HttpURLConnection)obj1).getResponseCode();
        if (k < 400) goto _L2; else goto _L3
_L3:
        try
        {
            throw new IOException((new StringBuilder()).append("HTTP status code ").append(k).append(" at ").append(s).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj1 = null;
        }
_L7:
        Object obj2;
        FileChannel filechannel;
        ByteBuffer bytebuffer;
        ix ix1;
        he he1;
        int l;
        int i1;
        int j1;
        int k1;
        long l1;
        long l2;
        try
        {
            ((FileOutputStream) (obj1)).close();
        }
        catch (IOException ioexception) { }
        catch (NullPointerException nullpointerexception) { }
        if (e)
        {
            zzb.zzaD((new StringBuilder()).append("Preload aborted for URL \"").append(s).append("\"").toString());
        } else
        {
            zzb.zzd((new StringBuilder()).append("Preload failed for URL \"").append(s).append("\"").toString(), ((Throwable) (obj)));
        }
        if (file.exists() && !file.delete())
        {
            zzb.zzaE((new StringBuilder()).append("Could not delete partial cache file at ").append(file.getAbsolutePath()).toString());
        }
        a(s, file.getAbsolutePath());
        b.remove(s1);
        return false;
_L2:
        j1 = ((URLConnection) (obj1)).getContentLength();
        if (j1 >= 0)
        {
            break MISSING_BLOCK_LABEL_500;
        }
        zzb.zzaE((new StringBuilder()).append("Stream cache aborted, missing content-length header at ").append(s).toString());
        a(s, file.getAbsolutePath());
        b.remove(s1);
        return false;
        obj2 = c.format(j1);
        k1 = ((Integer)ay.p.c()).intValue();
        if (j1 <= k1)
        {
            break MISSING_BLOCK_LABEL_588;
        }
        zzb.zzaE((new StringBuilder()).append("Content length ").append(((String) (obj2))).append(" exceeds limit at ").append(s).toString());
        a(s, file.getAbsolutePath());
        b.remove(s1);
        return false;
        zzb.zzaC((new StringBuilder()).append("Caching ").append(((String) (obj2))).append(" bytes from ").append(s).toString());
        obj2 = Channels.newChannel(((URLConnection) (obj1)).getInputStream());
        obj1 = new FileOutputStream(file);
        filechannel = ((FileOutputStream) (obj1)).getChannel();
        bytebuffer = ByteBuffer.allocate(0x100000);
        ix1 = zzp.zzbB();
        l = 0;
        l1 = ix1.a();
        he1 = new he(((Long)ay.s.c()).longValue());
        l2 = ((Long)ay.r.c()).longValue();
_L5:
        i1 = ((ReadableByteChannel) (obj2)).read(bytebuffer);
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_853;
        }
        i1 = l + i1;
        if (i1 <= k1)
        {
            break MISSING_BLOCK_LABEL_748;
        }
        throw new IOException("stream cache file size limit exceeded");
        bytebuffer.flip();
        while (filechannel.write(bytebuffer) > 0) ;
        bytebuffer.clear();
        if (ix1.a() - l1 > 1000L * l2)
        {
            throw new IOException("stream cache time limit exceeded");
        }
        if (e)
        {
            throw new IOException("abort requested");
        }
        l = i1;
        if (!he1.a()) goto _L5; else goto _L4
_L4:
        a(s, file.getAbsolutePath(), i1, j1, false);
        l = i1;
          goto _L5
        ((FileOutputStream) (obj1)).close();
        if (zzb.zzM(3))
        {
            obj2 = c.format(l);
            zzb.zzaC((new StringBuilder()).append("Preloaded ").append(((String) (obj2))).append(" bytes from ").append(s).toString());
        }
        file.setReadable(true, false);
        b(((File) (obj)));
        a(s, file.getAbsolutePath(), l);
        b.remove(s1);
        return true;
        obj;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public int c()
    {
        int i;
        int k;
        i = 0;
        k = 0;
        if (d != null) goto _L2; else goto _L1
_L1:
        return k;
_L2:
        File afile[] = d.listFiles();
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

    public boolean d()
    {
        if (d == null)
        {
            return false;
        }
        File file = null;
        long l = 0x7fffffffffffffffL;
        File afile[] = d.listFiles();
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

}
