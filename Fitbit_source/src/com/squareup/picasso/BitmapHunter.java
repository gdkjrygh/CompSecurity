// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;

// Referenced classes of package com.squareup.picasso:
//            Action, Transformation, Picasso, Request, 
//            ResourceBitmapHunter, ContactsPhotoBitmapHunter, MediaStoreBitmapHunter, ContentStreamBitmapHunter, 
//            AssetBitmapHunter, FileBitmapHunter, NetworkBitmapHunter, Utils, 
//            Cache, Stats, Dispatcher, StatsSnapshot, 
//            Downloader

abstract class BitmapHunter
    implements Runnable
{

    private static final Object DECODE_LOCK = new Object();
    private static final ThreadLocal NAME_BUILDER = new _cls1();
    Action action;
    List actions;
    final Cache cache;
    final Request data;
    final Dispatcher dispatcher;
    Exception exception;
    int exifRotation;
    Future future;
    final String key;
    Picasso.LoadedFrom loadedFrom;
    final Picasso picasso;
    Bitmap result;
    final boolean skipMemoryCache;
    final Stats stats;

    BitmapHunter(Picasso picasso1, Dispatcher dispatcher1, Cache cache1, Stats stats1, Action action1)
    {
        picasso = picasso1;
        dispatcher = dispatcher1;
        cache = cache1;
        stats = stats1;
        key = action1.getKey();
        data = action1.getRequest();
        skipMemoryCache = action1.skipCache;
        action = action1;
    }

    static Bitmap applyCustomTransformations(List list, Bitmap bitmap)
    {
        int j = list.size();
        for (int i = 0; i < j;)
        {
            Transformation transformation = (Transformation)list.get(i);
            Bitmap bitmap1 = transformation.transform(bitmap);
            if (bitmap1 == null)
            {
                bitmap = (new StringBuilder()).append("Transformation ").append(transformation.key()).append(" returned null after ").append(i).append(" previous transformation(s).\n\nTransformation list:\n");
                for (list = list.iterator(); list.hasNext(); bitmap.append(((Transformation)list.next()).key()).append('\n')) { }
                Picasso.HANDLER.post(new _cls2(bitmap));
                return null;
            }
            if (bitmap1 == bitmap && bitmap.isRecycled())
            {
                Picasso.HANDLER.post(new _cls3(transformation));
                return null;
            }
            if (bitmap1 != bitmap && !bitmap.isRecycled())
            {
                Picasso.HANDLER.post(new _cls4(transformation));
                return null;
            }
            i++;
            bitmap = bitmap1;
        }

        return bitmap;
    }

    static void calculateInSampleSize(int i, int j, int k, int l, android.graphics.BitmapFactory.Options options)
    {
        int i1 = 1;
        if (l > j || k > i)
        {
            i1 = (int)Math.floor((float)l / (float)j);
            i = (int)Math.floor((float)k / (float)i);
            if (i1 >= i)
            {
                i1 = i;
            }
        }
        options.inSampleSize = i1;
        options.inJustDecodeBounds = false;
    }

    static void calculateInSampleSize(int i, int j, android.graphics.BitmapFactory.Options options)
    {
        calculateInSampleSize(i, j, options.outWidth, options.outHeight, options);
    }

    static android.graphics.BitmapFactory.Options createBitmapOptions(Request request)
    {
        boolean flag1 = request.hasSize();
        android.graphics.BitmapFactory.Options options;
        boolean flag;
        if (request.config != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        options = null;
        if (flag1 || flag)
        {
            android.graphics.BitmapFactory.Options options1 = new android.graphics.BitmapFactory.Options();
            options1.inJustDecodeBounds = flag1;
            options = options1;
            if (flag)
            {
                options1.inPreferredConfig = request.config;
                options = options1;
            }
        }
        return options;
    }

    static BitmapHunter forRequest(Context context, Picasso picasso1, Dispatcher dispatcher1, Cache cache1, Stats stats1, Action action1, Downloader downloader)
    {
        if (action1.getRequest().resourceId != 0)
        {
            return new ResourceBitmapHunter(context, picasso1, dispatcher1, cache1, stats1, action1);
        }
        Uri uri = action1.getRequest().uri;
        String s = uri.getScheme();
        if ("content".equals(s))
        {
            if (android.provider.ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && !uri.getPathSegments().contains("photo"))
            {
                return new ContactsPhotoBitmapHunter(context, picasso1, dispatcher1, cache1, stats1, action1);
            }
            if ("media".equals(uri.getAuthority()))
            {
                return new MediaStoreBitmapHunter(context, picasso1, dispatcher1, cache1, stats1, action1);
            } else
            {
                return new ContentStreamBitmapHunter(context, picasso1, dispatcher1, cache1, stats1, action1);
            }
        }
        if ("file".equals(s))
        {
            if (!uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0)))
            {
                return new AssetBitmapHunter(context, picasso1, dispatcher1, cache1, stats1, action1);
            } else
            {
                return new FileBitmapHunter(context, picasso1, dispatcher1, cache1, stats1, action1);
            }
        }
        if ("android.resource".equals(s))
        {
            return new ResourceBitmapHunter(context, picasso1, dispatcher1, cache1, stats1, action1);
        } else
        {
            return new NetworkBitmapHunter(picasso1, dispatcher1, cache1, stats1, action1, downloader);
        }
    }

    static boolean requiresInSampleSize(android.graphics.BitmapFactory.Options options)
    {
        return options != null && options.inJustDecodeBounds;
    }

    static Bitmap transformResult(Request request, Bitmap bitmap, int i)
    {
        Object obj;
        int j;
        int l;
        int i1;
        i1 = 0;
        l = bitmap.getWidth();
        j = bitmap.getHeight();
        obj = new Matrix();
        if (!request.needsMatrixTransform()) goto _L2; else goto _L1
_L1:
        float f;
        int k;
        int l1;
        k = request.targetWidth;
        l1 = request.targetHeight;
        f = request.rotationDegrees;
        float f4;
        if (f != 0.0F)
        {
            if (request.hasRotationPivot)
            {
                ((Matrix) (obj)).setRotate(f, request.rotationPivotX, request.rotationPivotY);
            } else
            {
                ((Matrix) (obj)).setRotate(f);
            }
        }
        if (!request.centerCrop) goto _L4; else goto _L3
_L3:
        f = (float)k / (float)l;
        float f2 = (float)l1 / (float)j;
        if (f > f2)
        {
            f4 = j;
            l1 = (int)Math.ceil((f2 / f) * f4);
            j = (j - l1) / 2;
            k = l;
            l = l1;
        } else
        {
            float f5 = l;
            k = (int)Math.ceil((f / f2) * f5);
            i1 = (l - k) / 2;
            f = f2;
            l1 = 0;
            l = j;
            j = l1;
        }
        ((Matrix) (obj)).preScale(f, f);
        l1 = k;
        k = j;
        j = i1;
_L6:
        if (i != 0)
        {
            ((Matrix) (obj)).preRotate(i);
        }
        obj = Bitmap.createBitmap(bitmap, j, k, l1, l, ((Matrix) (obj)), true);
        request = bitmap;
        if (obj != bitmap)
        {
            bitmap.recycle();
            request = ((Request) (obj));
        }
        return request;
_L4:
        if (request.centerInside)
        {
            float f1 = (float)k / (float)l;
            float f3 = (float)l1 / (float)j;
            int j1;
            if (f1 >= f3)
            {
                f1 = f3;
            }
            ((Matrix) (obj)).preScale(f1, f1);
            k = 0;
            j1 = j;
            l1 = 0;
            j = k;
            k = l1;
            l1 = l;
            l = j1;
            continue; /* Loop/switch isn't completed */
        }
        if (k != 0 && l1 != 0 && (k != l || l1 != j))
        {
            ((Matrix) (obj)).preScale((float)k / (float)l, (float)l1 / (float)j);
        }
_L2:
        k = 0;
        int k1 = j;
        l1 = 0;
        j = k;
        k = l1;
        l1 = l;
        l = k1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static void updateThreadName(Request request)
    {
        request = request.getName();
        StringBuilder stringbuilder = (StringBuilder)NAME_BUILDER.get();
        stringbuilder.ensureCapacity("Picasso-".length() + request.length());
        stringbuilder.replace("Picasso-".length(), stringbuilder.length(), request);
        Thread.currentThread().setName(stringbuilder.toString());
    }

    void attach(Action action1)
    {
        Request request;
        boolean flag;
        flag = picasso.loggingEnabled;
        request = action1.request;
        if (action != null) goto _L2; else goto _L1
_L1:
        action = action1;
        if (!flag) goto _L4; else goto _L3
_L3:
        if (actions != null && !actions.isEmpty()) goto _L6; else goto _L5
_L5:
        Utils.log("Hunter", "joined", request.logId(), "to empty hunter");
_L4:
        return;
_L6:
        Utils.log("Hunter", "joined", request.logId(), Utils.getLogIdsForHunter(this, "to "));
        return;
_L2:
        if (actions == null)
        {
            actions = new ArrayList(3);
        }
        actions.add(action1);
        if (flag)
        {
            Utils.log("Hunter", "joined", request.logId(), Utils.getLogIdsForHunter(this, "to "));
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    boolean cancel()
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (action != null)
            {
                break label0;
            }
            if (actions != null)
            {
                flag = flag1;
                if (!actions.isEmpty())
                {
                    break label0;
                }
            }
            flag = flag1;
            if (future != null)
            {
                flag = flag1;
                if (future.cancel(false))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    abstract Bitmap decode(Request request)
        throws IOException;

    void detach(Action action1)
    {
        if (action != action1) goto _L2; else goto _L1
_L1:
        action = null;
_L4:
        if (picasso.loggingEnabled)
        {
            Utils.log("Hunter", "removed", action1.request.logId(), Utils.getLogIdsForHunter(this, "from "));
        }
        return;
_L2:
        if (actions != null)
        {
            actions.remove(action1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    Action getAction()
    {
        return action;
    }

    List getActions()
    {
        return actions;
    }

    Request getData()
    {
        return data;
    }

    Exception getException()
    {
        return exception;
    }

    String getKey()
    {
        return key;
    }

    Picasso.LoadedFrom getLoadedFrom()
    {
        return loadedFrom;
    }

    Picasso getPicasso()
    {
        return picasso;
    }

    Bitmap getResult()
    {
        return result;
    }

    Bitmap hunt()
        throws IOException
    {
        if (skipMemoryCache) goto _L2; else goto _L1
_L1:
        Bitmap bitmap1 = cache.get(key);
        if (bitmap1 == null) goto _L2; else goto _L3
_L3:
        Bitmap bitmap;
        stats.dispatchCacheHit();
        loadedFrom = Picasso.LoadedFrom.MEMORY;
        bitmap = bitmap1;
        if (picasso.loggingEnabled)
        {
            Utils.log("Hunter", "decoded", data.logId(), "from cache");
            bitmap = bitmap1;
        }
_L5:
        return bitmap;
_L2:
        bitmap1 = decode(data);
        bitmap = bitmap1;
        if (bitmap1 == null) goto _L5; else goto _L4
_L4:
        if (picasso.loggingEnabled)
        {
            Utils.log("Hunter", "decoded", data.logId());
        }
        stats.dispatchBitmapDecoded(bitmap1);
        if (data.needsTransformation())
        {
            break; /* Loop/switch isn't completed */
        }
        bitmap = bitmap1;
        if (exifRotation == 0) goto _L5; else goto _L6
_L6:
        Object obj = DECODE_LOCK;
        obj;
        JVM INSTR monitorenter ;
        if (data.needsMatrixTransform())
        {
            break MISSING_BLOCK_LABEL_167;
        }
        bitmap = bitmap1;
        if (exifRotation == 0)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        bitmap1 = transformResult(data, bitmap1, exifRotation);
        bitmap = bitmap1;
        if (!picasso.loggingEnabled)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        Utils.log("Hunter", "transformed", data.logId());
        bitmap = bitmap1;
        bitmap1 = bitmap;
        if (!data.hasCustomTransformations())
        {
            break MISSING_BLOCK_LABEL_267;
        }
        bitmap = applyCustomTransformations(data.transformations, bitmap);
        bitmap1 = bitmap;
        if (!picasso.loggingEnabled)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        Utils.log("Hunter", "transformed", data.logId(), "from custom transformations");
        bitmap1 = bitmap;
        obj;
        JVM INSTR monitorexit ;
        bitmap = bitmap1;
        if (bitmap1 == null) goto _L5; else goto _L7
_L7:
        stats.dispatchBitmapTransformed(bitmap1);
        return bitmap1;
        Exception exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    boolean isCancelled()
    {
        return future != null && future.isCancelled();
    }

    public void run()
    {
        updateThreadName(data);
        if (picasso.loggingEnabled)
        {
            Utils.log("Hunter", "executing", Utils.getLogIdsForHunter(this));
        }
        result = hunt();
        if (result != null) goto _L2; else goto _L1
_L1:
        dispatcher.dispatchFailed(this);
_L4:
        Thread.currentThread().setName("Picasso-Idle");
        return;
_L2:
        dispatcher.dispatchComplete(this);
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        obj;
        exception = ((Exception) (obj));
        dispatcher.dispatchFailed(this);
        Thread.currentThread().setName("Picasso-Idle");
        return;
        obj;
        exception = ((Exception) (obj));
        dispatcher.dispatchRetry(this);
        Thread.currentThread().setName("Picasso-Idle");
        return;
        obj;
        StringWriter stringwriter = new StringWriter();
        stats.createSnapshot().dump(new PrintWriter(stringwriter));
        exception = new RuntimeException(stringwriter.toString(), ((Throwable) (obj)));
        dispatcher.dispatchFailed(this);
        Thread.currentThread().setName("Picasso-Idle");
        return;
        obj;
        exception = ((Exception) (obj));
        dispatcher.dispatchFailed(this);
        Thread.currentThread().setName("Picasso-Idle");
        return;
        obj;
        Thread.currentThread().setName("Picasso-Idle");
        throw obj;
    }

    protected void setExifRotation(int i)
    {
        exifRotation = i;
    }

    boolean shouldRetry(boolean flag, NetworkInfo networkinfo)
    {
        return false;
    }

    boolean shouldSkipMemoryCache()
    {
        return skipMemoryCache;
    }

    boolean supportsReplay()
    {
        return false;
    }


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls1 {}

}
