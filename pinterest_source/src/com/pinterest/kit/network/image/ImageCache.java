// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.network.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import com.pinterest.kit.application.CommonApplication;
import com.pinterest.kit.utils.FileUtils;
import com.pinterest.kit.utils.NetworkUtils;
import com.pinterest.reporting.CrashReporting;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Downloader;
import com.squareup.picasso.LruCache;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoUtil;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.Transformation;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.pinterest.kit.network.image:
//            CachableImage

public class ImageCache
{

    private static final long MAX_PERSISTENT_DISK_CACHE_SIZE = 0x1f400000L;
    private static boolean _allowPersistentCache;
    private static ImageCache _defaultInstance;
    private static ImageCache _persistentInstance;
    private static LruCache _sharedMemoryCache;
    private static Object _syncDefaultInstance = new Object();
    private static Object _syncPersistentInstance = new Object();
    public static Transformation safeCropTransformation = new _cls1();
    private Cache _diskCache;
    private Downloader _downloader;
    private OkHttpClient _okHttpClient;
    private final Picasso _picasso;

    public ImageCache(Context context, Type type)
    {
        Context context1 = context.getApplicationContext();
        if (_sharedMemoryCache == null)
        {
            _sharedMemoryCache = new LruCache(context);
        }
        if (type == Type.PERSISTENT)
        {
            _diskCache = new Cache(PicassoUtil.c(context1), 0x1f400000L);
        } else
        {
            _diskCache = new Cache(PicassoUtil.a(context1), PicassoUtil.b(context1));
        }
        _okHttpClient = PicassoUtil.a(_diskCache);
        _downloader = new OkHttpDownloader(_okHttpClient);
        _picasso = (new com.squareup.picasso.Picasso.Builder(context1)).a(_downloader).a(_sharedMemoryCache).a();
        if (type != Type.DEFAULT)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        Picasso.a(_picasso);
        return;
        context;
        CrashReporting.a(context);
        return;
    }

    public static void cancelLoadImage(CachableImage cachableimage)
    {
        getDefault().getPicasso().a(cachableimage);
    }

    public static void clean(CachableImage cachableimage)
    {
        getDefault().getPicasso().a(cachableimage);
    }

    public static Bitmap getBitmapBlocking(String s)
    {
        return getBitmapBlocking(s, false, null);
    }

    public static Bitmap getBitmapBlocking(String s, boolean flag)
    {
        return getBitmapBlocking(s, flag, null);
    }

    public static Bitmap getBitmapBlocking(String s, boolean flag, Rect rect)
    {
        if (!isValidImageUrl(s))
        {
            return null;
        }
        try
        {
            s = getDefault().getPicasso().a(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            CrashReporting.a(s);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            CrashReporting.a(s);
            return null;
        }
        if (rect == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        s.a(rect.width(), rect.height());
        s.b();
        s = s.c();
        return s;
    }

    public static ImageCache getDefault()
    {
        if (_defaultInstance == null)
        {
            synchronized (_syncDefaultInstance)
            {
                _defaultInstance = new ImageCache(CommonApplication.context(), Type.DEFAULT);
            }
        }
        return _defaultInstance;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static ImageCache getPersistent()
    {
        if (_persistentInstance == null)
        {
            synchronized (_syncPersistentInstance)
            {
                _persistentInstance = new ImageCache(CommonApplication.context(), Type.PERSISTENT);
            }
        }
        return _persistentInstance;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void initDefault()
    {
        (new _cls2(getDefault())).execute();
    }

    private static boolean isValidImageUrl(String s)
    {
        return s != null && s.length() > 0 && !"null".equals(s);
    }

    public static boolean loadImage(CachableImage cachableimage, File file, boolean flag)
    {
        return loadImage(cachableimage, file, flag, 0, 0);
    }

    public static boolean loadImage(CachableImage cachableimage, File file, boolean flag, int i, int j)
    {
        if (cachableimage == null || !file.exists())
        {
            return false;
        }
        if (flag)
        {
            cachableimage.setBitmap(null, false);
        }
        Transformation transformation = cachableimage.getTransformation();
        Object obj1 = getDefault();
        Object obj = obj1;
        if (_allowPersistentCache)
        {
            obj = obj1;
            if (!NetworkUtils.getInstance().hasInternet())
            {
                obj = getPersistent();
            }
        }
        if (j != 0 && i != 0)
        {
            obj = ((ImageCache) (obj)).getPicasso().a(file).a(i, j).b();
        } else
        {
            obj = ((ImageCache) (obj)).getPicasso().a(file);
        }
        file = ((File) (obj));
        if (transformation != null)
        {
            file = ((RequestCreator) (obj)).a(transformation);
        }
        obj1 = cachableimage.getImageTag();
        obj = file;
        if (obj1 != null)
        {
            obj = file.a(obj1);
        }
        ((RequestCreator) (obj)).a(safeCropTransformation).a(cachableimage);
        return false;
    }

    public static boolean loadImage(CachableImage cachableimage, String s)
    {
        return loadImage(cachableimage, s, true);
    }

    public static boolean loadImage(CachableImage cachableimage, String s, boolean flag)
    {
        if (cachableimage == null || !isValidImageUrl(s))
        {
            return false;
        }
        if (flag)
        {
            cachableimage.setBitmap(null, false);
        }
        Transformation transformation = cachableimage.getTransformation();
        Object obj1 = getDefault();
        Object obj = obj1;
        if (_allowPersistentCache)
        {
            obj = obj1;
            if (!NetworkUtils.getInstance().hasInternet())
            {
                obj = getPersistent();
            }
        }
        obj = ((ImageCache) (obj)).getPicasso().a(s);
        s = ((String) (obj));
        if (transformation != null)
        {
            s = ((RequestCreator) (obj)).a(transformation);
        }
        obj1 = cachableimage.getImageTag();
        obj = s;
        if (obj1 != null)
        {
            obj = s.a(obj1);
        }
        ((RequestCreator) (obj)).a(safeCropTransformation).a(cachableimage);
        return false;
    }

    public static void setAllowPersistentCache(boolean flag)
    {
        _allowPersistentCache = flag;
    }

    public void cancelTag(Object obj)
    {
        getPicasso().a(obj);
    }

    public void clearAllCache()
    {
        PicassoUtil.c(_picasso);
    }

    public void clearDiskCache()
    {
        PicassoUtil.b(_picasso);
    }

    public void clearMemoryCache()
    {
        PicassoUtil.a(_picasso);
    }

    public Picasso getPicasso()
    {
        return _picasso;
    }

    public long getSizeOnDisk()
    {
        return FileUtils.getFileSize(PicassoUtil.d(_picasso));
    }

    public boolean inMemory(String s)
    {
        if (!isValidImageUrl(s))
        {
            return false;
        } else
        {
            return PicassoUtil.a(getDefault().getPicasso(), s);
        }
    }

    public void pauseTag(Object obj)
    {
        getPicasso().b(obj);
    }

    public void preloadImage(String s)
    {
        preloadImage(s, null, false, null);
    }

    public void preloadImage(String s, Callback callback, boolean flag, String s1)
    {
        if (!isValidImageUrl(s))
        {
            return;
        }
        s = getPicasso().a(s);
        if (s1 != null)
        {
            s.a(s1);
        }
        if (flag)
        {
            s.a(MemoryPolicy.a, new MemoryPolicy[] {
                MemoryPolicy.b
            });
        }
        if (callback != null)
        {
            s.a(callback);
            return;
        } else
        {
            s.a(null);
            return;
        }
    }

    public void removeImages(HashMap hashmap)
    {
        if (_diskCache == null || hashmap == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = _diskCache.a();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        String s = (String)iterator.next();
        if (!hashmap.containsKey(s)) goto _L5; else goto _L4
_L4:
        Picasso picasso;
        iterator.remove();
        picasso = getPicasso();
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        try
        {
            throw new IllegalArgumentException("path == null");
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap)
        {
            hashmap.printStackTrace();
        }
_L2:
        return;
        picasso.a(Uri.parse(s));
          goto _L5
    }

    public void resumeTag(Object obj)
    {
        getPicasso().c(obj);
    }



    /* member class not found */
    class Type {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
