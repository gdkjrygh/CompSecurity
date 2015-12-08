// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.NetworkInfo;
import android.os.Handler;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.squareup.picasso:
//            Action, RequestHandler, Transformation, Picasso, 
//            MarkableInputStream, Utils, Request, MemoryPolicy, 
//            Cache, Stats, NetworkPolicy, Dispatcher, 
//            StatsSnapshot

class BitmapHunter
    implements Runnable
{

    private static final Object DECODE_LOCK = new Object();
    private static final RequestHandler ERRORING_HANDLER = new RequestHandler() {

        public boolean canHandleRequest(Request request)
        {
            return true;
        }

        public RequestHandler.Result load(Request request, int i)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unrecognized type of request: ").append(request).toString());
        }

    };
    private static final ThreadLocal NAME_BUILDER = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected StringBuilder initialValue()
        {
            return new StringBuilder("Picasso-");
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
    final int memoryPolicy;
    int networkPolicy;
    final Picasso picasso;
    Picasso.Priority priority;
    final RequestHandler requestHandler;
    Bitmap result;
    int retryCount;
    final int sequence;
    final Stats stats;

    BitmapHunter(Picasso picasso1, Dispatcher dispatcher1, Cache cache1, Stats stats1, Action action1, RequestHandler requesthandler)
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
        memoryPolicy = action1.getMemoryPolicy();
        networkPolicy = action1.getNetworkPolicy();
        requestHandler = requesthandler;
        retryCount = requesthandler.getRetryCount();
    }

    static Bitmap applyCustomTransformations(final List e, final Bitmap builder)
    {
        int j = e.size();
        for (int i = 0; i < j;)
        {
            final Transformation transformation = (Transformation)e.get(i);
            Bitmap bitmap;
            try
            {
                bitmap = transformation.transform(builder);
            }
            // Misplaced declaration of an exception variable
            catch (final List e)
            {
                Picasso.HANDLER.post(new Runnable() {

                    final RuntimeException val$e;
                    final Transformation val$transformation;

                    public void run()
                    {
                        throw new RuntimeException((new StringBuilder()).append("Transformation ").append(transformation.key()).append(" crashed with exception.").toString(), e);
                    }

            
            {
                transformation = transformation1;
                e = runtimeexception;
                super();
            }
                });
                return null;
            }
            if (bitmap == null)
            {
                builder = (new StringBuilder()).append("Transformation ").append(transformation.key()).append(" returned null after ").append(i).append(" previous transformation(s).\n\nTransformation list:\n");
                for (e = e.iterator(); e.hasNext(); builder.append(((Transformation)e.next()).key()).append('\n')) { }
                Picasso.HANDLER.post(new Runnable() {

                    final StringBuilder val$builder;

                    public void run()
                    {
                        throw new NullPointerException(builder.toString());
                    }

            
            {
                builder = stringbuilder;
                super();
            }
                });
                return null;
            }
            if (bitmap == builder && builder.isRecycled())
            {
                Picasso.HANDLER.post(new Runnable() {

                    final Transformation val$transformation;

                    public void run()
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Transformation ").append(transformation.key()).append(" returned input Bitmap but recycled it.").toString());
                    }

            
            {
                transformation = transformation1;
                super();
            }
                });
                return null;
            }
            if (bitmap != builder && !builder.isRecycled())
            {
                Picasso.HANDLER.post(new Runnable() {

                    final Transformation val$transformation;

                    public void run()
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Transformation ").append(transformation.key()).append(" mutated input Bitmap but failed to recycle the original.").toString());
                    }

            
            {
                transformation = transformation1;
                super();
            }
                });
                return null;
            }
            i++;
            builder = bitmap;
        }

        return builder;
    }

    private Picasso.Priority computeNewPriority()
    {
        Picasso.Priority priority1;
        Picasso.Priority priority2;
        boolean flag;
        boolean flag2;
        boolean flag3 = true;
        flag2 = false;
        priority1 = Picasso.Priority.LOW;
        boolean flag1;
        if (actions != null && !actions.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag3;
        if (action == null)
        {
            if (flag)
            {
                flag1 = flag3;
            } else
            {
                flag1 = false;
            }
        }
        if (flag1) goto _L2; else goto _L1
_L1:
        priority2 = priority1;
_L4:
        return priority2;
_L2:
        if (action != null)
        {
            priority1 = action.getPriority();
        }
        priority2 = priority1;
        if (!flag)
        {
            continue;
        }
        int j = actions.size();
        int i = ((flag2) ? 1 : 0);
        do
        {
            priority2 = priority1;
            if (i >= j)
            {
                continue;
            }
            priority2 = ((Action)actions.get(i)).getPriority();
            if (priority2.ordinal() > priority1.ordinal())
            {
                priority1 = priority2;
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static Bitmap decodeStream(InputStream inputstream, Request request)
    {
        InputStream inputstream1 = new MarkableInputStream(inputstream);
        long l = inputstream1.savePosition(0x10000);
        inputstream = RequestHandler.createBitmapOptions(request);
        boolean flag = RequestHandler.requiresInSampleSize(inputstream);
        boolean flag1 = Utils.isWebPFile(inputstream1);
        inputstream1.reset(l);
        if (flag1)
        {
            inputstream1 = Utils.toByteArray(inputstream1);
            if (flag)
            {
                BitmapFactory.decodeByteArray(inputstream1, 0, inputstream1.length, inputstream);
                RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, inputstream, request);
            }
            inputstream = BitmapFactory.decodeByteArray(inputstream1, 0, inputstream1.length, inputstream);
        } else
        {
            if (flag)
            {
                BitmapFactory.decodeStream(inputstream1, null, inputstream);
                RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, inputstream, request);
                inputstream1.reset(l);
            }
            request = BitmapFactory.decodeStream(inputstream1, null, inputstream);
            inputstream = request;
            if (request == null)
            {
                throw new IOException("Failed to decode stream.");
            }
        }
        return inputstream;
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

    private static boolean shouldResize(boolean flag, int i, int j, int k, int l)
    {
        return !flag || i > k || j > l;
    }

    static Bitmap transformResult(Request request, Bitmap bitmap, int i)
    {
        Object obj;
        int j;
        int k;
        boolean flag4;
        j = bitmap.getWidth();
        k = bitmap.getHeight();
        flag4 = request.onlyScaleDown;
        obj = new Matrix();
        if (!request.needsMatrixTransform()) goto _L2; else goto _L1
_L1:
        float f;
        int l;
        int i1;
        int l1;
        int i2;
        l1 = request.targetWidth;
        i2 = request.targetHeight;
        f = request.rotationDegrees;
        float f6;
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
        float f3 = (float)l1 / (float)j;
        f = (float)i2 / (float)k;
        int j1;
        int k1;
        if (f3 > f)
        {
            f6 = k;
            i1 = (int)Math.ceil((f / f3) * f6);
            l = (k - i1) / 2;
            f = (float)i2 / (float)i1;
            j1 = 0;
            k1 = j;
        } else
        {
            float f7 = j;
            k1 = (int)Math.ceil((f3 / f) * f7);
            j1 = (j - k1) / 2;
            f3 = (float)l1 / (float)k1;
            l = 0;
            i1 = k;
        }
        if (shouldResize(flag4, j, k, l1, i2))
        {
            ((Matrix) (obj)).preScale(f3, f);
        }
        j = j1;
        k = l;
        l = k1;
_L6:
        if (i != 0)
        {
            ((Matrix) (obj)).preRotate(i);
        }
        obj = Bitmap.createBitmap(bitmap, j, k, l, i1, ((Matrix) (obj)), true);
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
            float f1 = (float)l1 / (float)j;
            float f4 = (float)i2 / (float)k;
            boolean flag;
            boolean flag2;
            if (f1 >= f4)
            {
                f1 = f4;
            }
            if (shouldResize(flag4, j, k, l1, i2))
            {
                ((Matrix) (obj)).preScale(f1, f1);
            }
            flag = false;
            flag2 = false;
            i1 = k;
            l = j;
            j = ((flag2) ? 1 : 0);
            k = ((flag) ? 1 : 0);
            continue; /* Loop/switch isn't completed */
        }
        if ((l1 != 0 || i2 != 0) && (l1 != j || i2 != k))
        {
            float f2;
            float f5;
            boolean flag1;
            boolean flag3;
            if (l1 != 0)
            {
                f2 = (float)l1 / (float)j;
            } else
            {
                f2 = (float)i2 / (float)k;
            }
            if (i2 != 0)
            {
                f5 = (float)i2 / (float)k;
            } else
            {
                f5 = (float)l1 / (float)j;
            }
            if (shouldResize(flag4, j, k, l1, i2))
            {
                ((Matrix) (obj)).preScale(f2, f5);
            }
        }
_L2:
        flag1 = false;
        flag3 = false;
        i1 = k;
        l = j;
        j = ((flag3) ? 1 : 0);
        k = ((flag1) ? 1 : 0);
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

    void detach(Action action1)
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

    int getMemoryPolicy()
    {
        return memoryPolicy;
    }

    Picasso getPicasso()
    {
        return picasso;
    }

    Picasso.Priority getPriority()
    {
        return priority;
    }

    Bitmap getResult()
    {
        return result;
    }

    Bitmap hunt()
    {
        Object obj = null;
        if (!MemoryPolicy.shouldReadFromMemoryCache(memoryPolicy)) goto _L2; else goto _L1
_L1:
        Object obj2;
        obj2 = cache.get(key);
        obj = obj2;
        if (obj2 == null) goto _L2; else goto _L3
_L3:
        Object obj1;
        stats.dispatchCacheHit();
        loadedFrom = Picasso.LoadedFrom.MEMORY;
        obj1 = obj2;
        if (picasso.loggingEnabled)
        {
            Utils.log("Hunter", "decoded", data.logId(), "from cache");
            obj1 = obj2;
        }
_L5:
        return ((Bitmap) (obj1));
_L2:
        obj1 = data;
        int i;
        if (retryCount == 0)
        {
            i = NetworkPolicy.OFFLINE.index;
        } else
        {
            i = networkPolicy;
        }
        obj1.networkPolicy = i;
        obj2 = requestHandler.load(data, networkPolicy);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        loadedFrom = ((RequestHandler.Result) (obj2)).getLoadedFrom();
        exifRotation = ((RequestHandler.Result) (obj2)).getExifOrientation();
        obj1 = ((RequestHandler.Result) (obj2)).getBitmap();
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        obj1 = ((RequestHandler.Result) (obj2)).getStream();
        obj = decodeStream(((InputStream) (obj1)), data);
        Utils.closeQuietly(((InputStream) (obj1)));
        obj1 = obj;
        if (obj == null) goto _L5; else goto _L4
_L4:
        if (picasso.loggingEnabled)
        {
            Utils.log("Hunter", "decoded", data.logId());
        }
        stats.dispatchBitmapDecoded(((Bitmap) (obj)));
        if (data.needsTransformation())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        if (exifRotation == 0) goto _L5; else goto _L6
_L6:
        obj2 = DECODE_LOCK;
        obj2;
        JVM INSTR monitorenter ;
        if (data.needsMatrixTransform())
        {
            break MISSING_BLOCK_LABEL_256;
        }
        obj1 = obj;
        if (exifRotation == 0)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        obj = transformResult(data, ((Bitmap) (obj)), exifRotation);
        obj1 = obj;
        if (!picasso.loggingEnabled)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        Utils.log("Hunter", "transformed", data.logId());
        obj1 = obj;
        obj = obj1;
        if (!data.hasCustomTransformations())
        {
            break MISSING_BLOCK_LABEL_356;
        }
        obj1 = applyCustomTransformations(data.transformations, ((Bitmap) (obj1)));
        obj = obj1;
        if (!picasso.loggingEnabled)
        {
            break MISSING_BLOCK_LABEL_356;
        }
        Utils.log("Hunter", "transformed", data.logId(), "from custom transformations");
        obj = obj1;
        obj2;
        JVM INSTR monitorexit ;
        obj1 = obj;
        if (obj == null) goto _L5; else goto _L7
_L7:
        stats.dispatchBitmapTransformed(((Bitmap) (obj)));
        return ((Bitmap) (obj));
        Exception exception1;
        exception1;
        Utils.closeQuietly(((InputStream) (obj1)));
        throw exception1;
        exception1;
        obj2;
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
        if (!((Downloader.ResponseException) (obj)).localCacheOnly || ((Downloader.ResponseException) (obj)).responseCode != 504)
        {
            exception = ((Exception) (obj));
        }
        dispatcher.dispatchFailed(this);
        Thread.currentThread().setName("Picasso-Idle");
        return;
        obj;
        exception = ((Exception) (obj));
        dispatcher.dispatchRetry(this);
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

    boolean shouldRetry(boolean flag, NetworkInfo networkinfo)
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

    boolean supportsReplay()
    {
        return requestHandler.supportsReplay();
    }

}
