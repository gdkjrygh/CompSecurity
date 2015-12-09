// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.NetworkInfo;
import android.os.Handler;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.squareup.picasso:
//            Action, RequestHandler, Transformation, Picasso, 
//            Request, Utils, Cache, Stats, 
//            Dispatcher, StatsSnapshot

final class BitmapHunter
    implements Runnable
{

    private static final Object DECODE_LOCK = new Object();
    private static final RequestHandler ERRORING_HANDLER = new RequestHandler() {

        public final boolean canHandleRequest(Request request)
        {
            return true;
        }

        public final RequestHandler.Result load(Request request)
            throws IOException
        {
            throw new IllegalStateException((new StringBuilder("Unrecognized type of request: ")).append(request).toString());
        }

    };
    private static final ThreadLocal NAME_BUILDER = new ThreadLocal() {

        private static StringBuilder initialValue()
        {
            return new StringBuilder("Picasso-");
        }

        protected final volatile Object initialValue()
        {
            return initialValue();
        }

    };
    private static final AtomicInteger SEQUENCE_GENERATOR = new AtomicInteger();
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
    Picasso.Priority priority;
    final RequestHandler requestHandler;
    Bitmap result;
    int retryCount;
    final int sequence;
    final boolean skipMemoryCache;
    final Stats stats;

    private BitmapHunter(Picasso picasso1, Dispatcher dispatcher1, Cache cache1, Stats stats1, Action action1, RequestHandler requesthandler)
    {
        sequence = SEQUENCE_GENERATOR.incrementAndGet();
        picasso = picasso1;
        dispatcher = dispatcher1;
        cache = cache1;
        stats = stats1;
        action = action1;
        key = action1.getKey();
        data = action1.getRequest();
        priority = action1.getPriority();
        skipMemoryCache = action1.skipCache;
        requestHandler = requesthandler;
        retryCount = requesthandler.getRetryCount();
    }

    private static Bitmap applyCustomTransformations(List list, Bitmap bitmap)
    {
        int i;
        int j;
        i = 0;
        j = list.size();
_L2:
        Bitmap bitmap1;
        Transformation transformation;
        bitmap1 = bitmap;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        transformation = (Transformation)list.get(i);
        bitmap1 = transformation.transform(bitmap);
        if (bitmap1 != null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        bitmap = (new StringBuilder("Transformation ")).append(transformation.key()).append(" returned null after ").append(i).append(" previous transformation(s).\n\nTransformation list:\n");
        for (list = list.iterator(); list.hasNext(); bitmap.append(((Transformation)list.next()).key()).append('\n')) { }
        break MISSING_BLOCK_LABEL_142;
        list;
        Picasso.HANDLER.post(new Runnable(transformation, list) {

            final RuntimeException val$e;
            final Transformation val$transformation;

            public final void run()
            {
                throw new RuntimeException((new StringBuilder("Transformation ")).append(transformation.key()).append(" crashed with exception.").toString(), e);
            }

            
            {
                transformation = transformation1;
                e = runtimeexception;
                super();
            }
        });
        bitmap1 = null;
        return bitmap1;
        Picasso.HANDLER.post(new Runnable(bitmap) {

            final StringBuilder val$builder;

            public final void run()
            {
                throw new NullPointerException(builder.toString());
            }

            
            {
                builder = stringbuilder;
                super();
            }
        });
        return null;
        if (bitmap1 == bitmap && bitmap.isRecycled())
        {
            Picasso.HANDLER.post(new Runnable(transformation) {

                final Transformation val$transformation;

                public final void run()
                {
                    throw new IllegalStateException((new StringBuilder("Transformation ")).append(transformation.key()).append(" returned input Bitmap but recycled it.").toString());
                }

            
            {
                transformation = transformation1;
                super();
            }
            });
            return null;
        }
        if (bitmap1 != bitmap && !bitmap.isRecycled())
        {
            Picasso.HANDLER.post(new Runnable(transformation) {

                final Transformation val$transformation;

                public final void run()
                {
                    throw new IllegalStateException((new StringBuilder("Transformation ")).append(transformation.key()).append(" mutated input Bitmap but failed to recycle the original.").toString());
                }

            
            {
                transformation = transformation1;
                super();
            }
            });
            return null;
        }
        bitmap = bitmap1;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private Picasso.Priority computeNewPriority()
    {
        Picasso.Priority priority1 = Picasso.Priority.LOW;
        boolean flag;
        boolean flag1;
        if (actions != null && !actions.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (action != null || flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            return priority1;
        }
        if (action != null)
        {
            priority1 = action.getPriority();
        }
        Picasso.Priority priority2 = priority1;
        if (flag)
        {
            int i = 0;
            int j = actions.size();
            do
            {
                priority2 = priority1;
                if (i >= j)
                {
                    break;
                }
                Picasso.Priority priority3 = ((Action)actions.get(i)).getPriority();
                priority2 = priority1;
                if (priority3.ordinal() > priority1.ordinal())
                {
                    priority2 = priority3;
                }
                i++;
                priority1 = priority2;
            } while (true);
        }
        return priority2;
    }

    static BitmapHunter forRequest(Picasso picasso1, Dispatcher dispatcher1, Cache cache1, Stats stats1, Action action1)
    {
        Request request = action1.getRequest();
        List list = picasso1.getRequestHandlers();
        int i = 0;
        for (int j = list.size(); i < j; i++)
        {
            RequestHandler requesthandler = (RequestHandler)list.get(i);
            if (requesthandler.canHandleRequest(request))
            {
                return new BitmapHunter(picasso1, dispatcher1, cache1, stats1, action1, requesthandler);
            }
        }

        return new BitmapHunter(picasso1, dispatcher1, cache1, stats1, action1, ERRORING_HANDLER);
    }

    private static Bitmap transformResult(Request request, Bitmap bitmap, int i)
    {
        Object obj;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        boolean flag;
        boolean flag1;
        int l1;
        int i2;
        boolean flag2;
        boolean flag3;
        l1 = bitmap.getWidth();
        i2 = bitmap.getHeight();
        flag2 = false;
        flag = false;
        flag3 = false;
        flag1 = false;
        k = l1;
        j = i2;
        obj = new Matrix();
        k1 = ((flag2) ? 1 : 0);
        l = ((flag3) ? 1 : 0);
        i1 = k;
        j1 = j;
        if (!request.needsMatrixTransform()) goto _L2; else goto _L1
_L1:
        float f;
        int j2;
        int k2;
        j2 = request.targetWidth;
        k2 = request.targetHeight;
        f = request.rotationDegrees;
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
        float f3 = (float)j2 / (float)l1;
        float f6 = (float)k2 / (float)i2;
        if (f3 > f6)
        {
            f = f3;
            j = (int)Math.ceil((float)i2 * (f6 / f3));
            l = (i2 - j) / 2;
            i1 = k;
            k = ((flag) ? 1 : 0);
        } else
        {
            f = f6;
            i1 = (int)Math.ceil((float)l1 * (f3 / f6));
            k = (l1 - i1) / 2;
            l = ((flag1) ? 1 : 0);
        }
        ((Matrix) (obj)).preScale(f, f);
        j1 = j;
        k1 = k;
_L2:
        if (i != 0)
        {
            ((Matrix) (obj)).preRotate(i);
        }
        obj = Bitmap.createBitmap(bitmap, k1, l, i1, j1, ((Matrix) (obj)), true);
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
            float f1 = (float)j2 / (float)l1;
            float f4 = (float)k2 / (float)i2;
            if (f1 >= f4)
            {
                f1 = f4;
            }
            ((Matrix) (obj)).preScale(f1, f1);
            k1 = ((flag2) ? 1 : 0);
            l = ((flag3) ? 1 : 0);
            i1 = k;
            j1 = j;
            continue; /* Loop/switch isn't completed */
        }
        if (j2 == 0)
        {
            k1 = ((flag2) ? 1 : 0);
            l = ((flag3) ? 1 : 0);
            i1 = k;
            j1 = j;
            if (k2 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        if (j2 == l1)
        {
            k1 = ((flag2) ? 1 : 0);
            l = ((flag3) ? 1 : 0);
            i1 = k;
            j1 = j;
            if (k2 == i2)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        float f2;
        float f5;
        if (j2 != 0)
        {
            f2 = (float)j2 / (float)l1;
        } else
        {
            f2 = (float)k2 / (float)i2;
        }
        if (k2 != 0)
        {
            f5 = (float)k2 / (float)i2;
        } else
        {
            f5 = (float)j2 / (float)l1;
        }
        ((Matrix) (obj)).preScale(f2, f5);
        k1 = ((flag2) ? 1 : 0);
        l = ((flag3) ? 1 : 0);
        i1 = k;
        j1 = j;
        if (true) goto _L2; else goto _L5
_L5:
    }

    private static void updateThreadName(Request request)
    {
        request = request.getName();
        StringBuilder stringbuilder = (StringBuilder)NAME_BUILDER.get();
        stringbuilder.ensureCapacity(request.length() + 8);
        stringbuilder.replace(8, stringbuilder.length(), request);
        Thread.currentThread().setName(stringbuilder.toString());
    }

    final void attach(Action action1)
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
        }
        action1 = action1.getPriority();
        if (action1.ordinal() > priority.ordinal())
        {
            priority = action1;
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    final boolean cancel()
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

    final void detach(Action action1)
    {
        boolean flag = false;
        if (action != action1) goto _L2; else goto _L1
_L1:
        action = null;
        flag = true;
_L4:
        if (flag && action1.getPriority() == priority)
        {
            priority = computeNewPriority();
        }
        if (picasso.loggingEnabled)
        {
            Utils.log("Hunter", "removed", action1.request.logId(), Utils.getLogIdsForHunter(this, "from "));
        }
        return;
_L2:
        if (actions != null)
        {
            flag = actions.remove(action1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    final Action getAction()
    {
        return action;
    }

    final List getActions()
    {
        return actions;
    }

    final Request getData()
    {
        return data;
    }

    final Exception getException()
    {
        return exception;
    }

    final String getKey()
    {
        return key;
    }

    final Picasso.LoadedFrom getLoadedFrom()
    {
        return loadedFrom;
    }

    final Picasso getPicasso()
    {
        return picasso;
    }

    final Picasso.Priority getPriority()
    {
        return priority;
    }

    final Bitmap getResult()
    {
        return result;
    }

    final Bitmap hunt()
        throws IOException
    {
        Object obj1;
        Bitmap bitmap = null;
        if (!skipMemoryCache)
        {
            Bitmap bitmap1 = cache.get(key);
            bitmap = bitmap1;
            if (bitmap1 != null)
            {
                stats.dispatchCacheHit();
                loadedFrom = Picasso.LoadedFrom.MEMORY;
                if (picasso.loggingEnabled)
                {
                    Utils.log("Hunter", "decoded", data.logId(), "from cache");
                }
                return bitmap1;
            }
        }
        Object obj = data;
        boolean flag;
        if (retryCount == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj.loadFromLocalCacheOnly = flag;
        obj = requestHandler.load(data);
        if (obj != null)
        {
            bitmap = ((RequestHandler.Result) (obj)).getBitmap();
            loadedFrom = ((RequestHandler.Result) (obj)).getLoadedFrom();
            exifRotation = ((RequestHandler.Result) (obj)).getExifOrientation();
        }
        obj = bitmap;
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_334;
        }
        if (picasso.loggingEnabled)
        {
            Utils.log("Hunter", "decoded", data.logId());
        }
        stats.dispatchBitmapDecoded(bitmap);
        if (!data.needsTransformation())
        {
            obj = bitmap;
            if (exifRotation == 0)
            {
                break MISSING_BLOCK_LABEL_334;
            }
        }
        obj1 = DECODE_LOCK;
        obj1;
        JVM INSTR monitorenter ;
        if (data.needsMatrixTransform())
        {
            break MISSING_BLOCK_LABEL_216;
        }
        obj = bitmap;
        if (exifRotation == 0)
        {
            break MISSING_BLOCK_LABEL_259;
        }
        bitmap = transformResult(data, bitmap, exifRotation);
        obj = bitmap;
        if (!picasso.loggingEnabled)
        {
            break MISSING_BLOCK_LABEL_259;
        }
        Utils.log("Hunter", "transformed", data.logId());
        obj = bitmap;
        bitmap = ((Bitmap) (obj));
        if (!data.hasCustomTransformations())
        {
            break MISSING_BLOCK_LABEL_316;
        }
        obj = applyCustomTransformations(data.transformations, ((Bitmap) (obj)));
        bitmap = ((Bitmap) (obj));
        if (!picasso.loggingEnabled)
        {
            break MISSING_BLOCK_LABEL_316;
        }
        Utils.log("Hunter", "transformed", data.logId(), "from custom transformations");
        bitmap = ((Bitmap) (obj));
        obj1;
        JVM INSTR monitorexit ;
        obj = bitmap;
        if (bitmap != null)
        {
            stats.dispatchBitmapTransformed(bitmap);
            obj = bitmap;
        }
        return ((Bitmap) (obj));
        Exception exception1;
        exception1;
        obj1;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    final boolean isCancelled()
    {
        return future != null && future.isCancelled();
    }

    public final void run()
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

    final boolean shouldRetry(boolean flag, NetworkInfo networkinfo)
    {
        boolean flag1;
        if (retryCount > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            return false;
        } else
        {
            retryCount = retryCount - 1;
            return requestHandler.shouldRetry(flag, networkinfo);
        }
    }

    final boolean shouldSkipMemoryCache()
    {
        return skipMemoryCache;
    }

    final boolean supportsReplay()
    {
        return requestHandler.supportsReplay();
    }

}
