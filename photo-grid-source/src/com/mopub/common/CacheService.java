// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import android.content.Context;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.DeviceUtils;
import com.mopub.common.util.Streams;
import com.mopub.common.util.Utils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.mopub.common:
//            DiskLruCache, a, b

public class CacheService
{

    private static DiskLruCache a;

    public CacheService()
    {
    }

    public static void clearAndNullCaches()
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        a.delete();
        a = null;
        return;
        IOException ioexception;
        ioexception;
        a = null;
        return;
    }

    public static boolean containsKeyDiskCache(String s)
    {
        if (a != null)
        {
            try
            {
                s = a.get(createValidDiskCacheKey(s));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return false;
            }
            if (s != null)
            {
                return true;
            }
        }
        return false;
    }

    public static String createValidDiskCacheKey(String s)
    {
        return Utils.sha1(s);
    }

    public static File getDiskCacheDirectory(Context context)
    {
        context = context.getCacheDir().getPath();
        return new File((new StringBuilder()).append(context).append(File.separator).append("mopub-cache").toString());
    }

    public static DiskLruCache getDiskLruCache()
    {
        return a;
    }

    public static String getFilePathDiskCache(String s)
    {
        if (a == null)
        {
            return null;
        } else
        {
            return (new StringBuilder()).append(a.getDirectory()).append(File.separator).append(createValidDiskCacheKey(s)).append(".0").toString();
        }
    }

    public static byte[] getFromDiskCache(String s)
    {
        Object obj;
        byte abyte0[];
        Object obj1;
        abyte0 = null;
        obj1 = null;
        obj = null;
        if (a != null) goto _L2; else goto _L1
_L1:
        return ((byte []) (obj));
_L2:
        s = a.get(createValidDiskCacheKey(s));
        if (s != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s != null)
        {
            s.close();
            return null;
        }
        if (true) goto _L1; else goto _L3
_L3:
        obj = s;
        InputStream inputstream = s.getInputStream(0);
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        obj = s;
        abyte0 = new byte[(int)s.getLength(0)];
        obj = s;
        obj1 = new BufferedInputStream(inputstream);
        Streams.readStream(((InputStream) (obj1)), abyte0);
        obj = s;
        Streams.closeStream(((java.io.Closeable) (obj1)));
        obj = abyte0;
        if (s == null) goto _L1; else goto _L4
_L4:
        s.close();
        return abyte0;
        Exception exception1;
        exception1;
        obj = s;
        Streams.closeStream(((java.io.Closeable) (obj1)));
        obj = s;
        try
        {
            throw exception1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        finally { }
_L6:
        obj = s;
        MoPubLog.d("Unable to get from DiskLruCache", ((Throwable) (obj1)));
        obj = abyte0;
        if (s == null) goto _L1; else goto _L5
_L5:
        s.close();
        return abyte0;
        s;
        obj = null;
        if (obj != null)
        {
            ((DiskLruCache.Snapshot) (obj)).close();
        }
        throw s;
        Exception exception;
        exception;
        s = null;
        abyte0 = ((byte []) (obj1));
        obj1 = exception;
          goto _L6
        exception;
        abyte0 = ((byte []) (obj1));
        obj1 = exception;
          goto _L6
    }

    public static void getFromDiskCacheAsync(String s, DiskLruCacheGetListener disklrucachegetlistener)
    {
        (new a(s, disklrucachegetlistener)).execute(new Void[0]);
    }

    public static void initialize(Context context)
    {
        initializeDiskCache(context);
    }

    public static boolean initializeDiskCache(Context context)
    {
        boolean flag = true;
        if (context == null)
        {
            flag = false;
        } else
        if (a == null)
        {
            context = getDiskCacheDirectory(context);
            long l = DeviceUtils.diskCacheSizeBytes(context);
            try
            {
                a = DiskLruCache.open(context, 1, 1, l);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                MoPubLog.d("Unable to create DiskLruCache", context);
                return true;
            }
            return true;
        }
        return flag;
    }

    public static boolean putToDiskCache(String s, InputStream inputstream)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        String s1 = null;
        s = a.edit(createValidDiskCacheKey(s));
        if (s == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s1 = s;
        BufferedOutputStream bufferedoutputstream = new BufferedOutputStream(s.newOutputStream(0));
        s1 = s;
        Streams.copyContent(inputstream, bufferedoutputstream);
        s1 = s;
        bufferedoutputstream.flush();
        s1 = s;
        bufferedoutputstream.close();
        s1 = s;
        a.flush();
        s1 = s;
        s.commit();
        return true;
        s;
        MoPubLog.d("Unable to put to DiskLruCache", s);
        if (s1 != null)
        {
            try
            {
                s1.abort();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return false;
            }
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static boolean putToDiskCache(String s, byte abyte0[])
    {
        return putToDiskCache(s, ((InputStream) (new ByteArrayInputStream(abyte0))));
    }

    public static void putToDiskCacheAsync(String s, byte abyte0[])
    {
        (new b(s, abyte0)).execute(new Void[0]);
    }
}
