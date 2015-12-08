// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.squareup.picasso:
//            ResourceRequestHandler, ContactsPhotoRequestHandler, MediaStoreRequestHandler, ContentStreamRequestHandler, 
//            AssetRequestHandler, FileRequestHandler, NetworkRequestHandler, Dispatcher, 
//            Utils, Action, DeferredRequestCreator, Request, 
//            BitmapHunter, RequestCreator, Cache, Stats, 
//            MemoryPolicy, Target, LruCache, PicassoExecutorService, 
//            Downloader

public class Picasso
{
    public static class Builder
    {

        private Cache cache;
        private final Context context;
        private android.graphics.Bitmap.Config defaultBitmapConfig;
        private Downloader downloader;
        private boolean indicatorsEnabled;
        private Listener listener;
        private boolean loggingEnabled;
        private List requestHandlers;
        private ExecutorService service;
        private RequestTransformer transformer;

        public Picasso build()
        {
            Context context1 = context;
            if (downloader == null)
            {
                downloader = Utils.createDefaultDownloader(context1);
            }
            if (cache == null)
            {
                cache = new LruCache(context1);
            }
            if (service == null)
            {
                service = new PicassoExecutorService();
            }
            if (transformer == null)
            {
                transformer = RequestTransformer.IDENTITY;
            }
            Stats stats1 = new Stats(cache);
            return new Picasso(context1, new Dispatcher(context1, service, Picasso.HANDLER, downloader, cache, stats1), cache, listener, transformer, requestHandlers, stats1, defaultBitmapConfig, indicatorsEnabled, loggingEnabled);
        }

        public Builder downloader(Downloader downloader1)
        {
            if (downloader1 == null)
            {
                throw new IllegalArgumentException("Downloader must not be null.");
            }
            if (downloader != null)
            {
                throw new IllegalStateException("Downloader already set.");
            } else
            {
                downloader = downloader1;
                return this;
            }
        }

        public Builder(Context context1)
        {
            if (context1 == null)
            {
                throw new IllegalArgumentException("Context must not be null.");
            } else
            {
                context = context1.getApplicationContext();
                return;
            }
        }
    }

    private static class CleanupThread extends Thread
    {

        private final Handler handler;
        private final ReferenceQueue referenceQueue;

        public void run()
        {
            Process.setThreadPriority(10);
_L1:
            Action.RequestWeakReference requestweakreference;
            Message message;
            try
            {
                requestweakreference = (Action.RequestWeakReference)referenceQueue.remove(1000L);
                message = handler.obtainMessage();
            }
            catch (InterruptedException interruptedexception)
            {
                return;
            }
            catch (Exception exception)
            {
                handler.post(exception. new Runnable() {

                    final CleanupThread this$0;
                    final Exception val$e;

                    public void run()
                    {
                        throw new RuntimeException(e);
                    }

            
            {
                this$0 = final_cleanupthread;
                e = Exception.this;
                super();
            }
                });
                return;
            }
            if (requestweakreference == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            message.what = 3;
            message.obj = requestweakreference.action;
            handler.sendMessage(message);
              goto _L1
            message.recycle();
              goto _L1
        }

        CleanupThread(ReferenceQueue referencequeue, Handler handler1)
        {
            referenceQueue = referencequeue;
            handler = handler1;
            setDaemon(true);
            setName("Picasso-refQueue");
        }
    }

    public static interface Listener
    {

        public abstract void onImageLoadFailed(Picasso picasso, Uri uri, Exception exception);
    }

    public static final class LoadedFrom extends Enum
    {

        private static final LoadedFrom $VALUES[];
        public static final LoadedFrom DISK;
        public static final LoadedFrom MEMORY;
        public static final LoadedFrom NETWORK;
        final int debugColor;

        public static LoadedFrom valueOf(String s)
        {
            return (LoadedFrom)Enum.valueOf(com/squareup/picasso/Picasso$LoadedFrom, s);
        }

        public static LoadedFrom[] values()
        {
            return (LoadedFrom[])$VALUES.clone();
        }

        static 
        {
            MEMORY = new LoadedFrom("MEMORY", 0, 0xff00ff00);
            DISK = new LoadedFrom("DISK", 1, 0xff0000ff);
            NETWORK = new LoadedFrom("NETWORK", 2, 0xffff0000);
            $VALUES = (new LoadedFrom[] {
                MEMORY, DISK, NETWORK
            });
        }

        private LoadedFrom(String s, int i, int j)
        {
            super(s, i);
            debugColor = j;
        }
    }

    public static final class Priority extends Enum
    {

        private static final Priority $VALUES[];
        public static final Priority HIGH;
        public static final Priority LOW;
        public static final Priority NORMAL;

        public static Priority valueOf(String s)
        {
            return (Priority)Enum.valueOf(com/squareup/picasso/Picasso$Priority, s);
        }

        public static Priority[] values()
        {
            return (Priority[])$VALUES.clone();
        }

        static 
        {
            LOW = new Priority("LOW", 0);
            NORMAL = new Priority("NORMAL", 1);
            HIGH = new Priority("HIGH", 2);
            $VALUES = (new Priority[] {
                LOW, NORMAL, HIGH
            });
        }

        private Priority(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface RequestTransformer
    {

        public static final RequestTransformer IDENTITY = new RequestTransformer() {

            public Request transformRequest(Request request)
            {
                return request;
            }

        };

        public abstract Request transformRequest(Request request);

    }


    static final Handler HANDLER = new Handler(Looper.getMainLooper()) {

        public void handleMessage(Message message)
        {
            message.what;
            JVM INSTR lookupswitch 3: default 40
        //                       3: 120
        //                       8: 70
        //                       13: 166;
               goto _L1 _L2 _L3 _L4
_L1:
            throw new AssertionError((new StringBuilder()).append("Unknown handler message received: ").append(message.what).toString());
_L3:
            message = (List)message.obj;
            int i = 0;
            for (int k = message.size(); i < k; i++)
            {
                BitmapHunter bitmaphunter = (BitmapHunter)message.get(i);
                bitmaphunter.picasso.complete(bitmaphunter);
            }

            break; /* Loop/switch isn't completed */
_L2:
            message = (Action)message.obj;
            if (message.getPicasso().loggingEnabled)
            {
                Utils.log("Main", "canceled", ((Action) (message)).request.logId(), "target got garbage collected");
            }
            ((Action) (message)).picasso.cancelExistingRequest(message.getTarget());
_L6:
            return;
_L4:
            message = (List)message.obj;
            int j = 0;
            int l = message.size();
            while (j < l) 
            {
                Action action = (Action)message.get(j);
                action.picasso.resumeAction(action);
                j++;
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

    };
    static volatile Picasso singleton = null;
    final Cache cache;
    private final CleanupThread cleanupThread;
    final Context context;
    final android.graphics.Bitmap.Config defaultBitmapConfig;
    final Dispatcher dispatcher;
    boolean indicatorsEnabled;
    private final Listener listener;
    volatile boolean loggingEnabled;
    final ReferenceQueue referenceQueue = new ReferenceQueue();
    private final List requestHandlers;
    private final RequestTransformer requestTransformer;
    boolean shutdown;
    final Stats stats;
    final Map targetToAction = new WeakHashMap();
    final Map targetToDeferredRequestCreator = new WeakHashMap();

    Picasso(Context context1, Dispatcher dispatcher1, Cache cache1, Listener listener1, RequestTransformer requesttransformer, List list, Stats stats1, 
            android.graphics.Bitmap.Config config, boolean flag, boolean flag1)
    {
        context = context1;
        dispatcher = dispatcher1;
        cache = cache1;
        listener = listener1;
        requestTransformer = requesttransformer;
        defaultBitmapConfig = config;
        int i;
        if (list != null)
        {
            i = list.size();
        } else
        {
            i = 0;
        }
        cache1 = new ArrayList(7 + i);
        cache1.add(new ResourceRequestHandler(context1));
        if (list != null)
        {
            cache1.addAll(list);
        }
        cache1.add(new ContactsPhotoRequestHandler(context1));
        cache1.add(new MediaStoreRequestHandler(context1));
        cache1.add(new ContentStreamRequestHandler(context1));
        cache1.add(new AssetRequestHandler(context1));
        cache1.add(new FileRequestHandler(context1));
        cache1.add(new NetworkRequestHandler(dispatcher1.downloader, stats1));
        requestHandlers = Collections.unmodifiableList(cache1);
        stats = stats1;
        indicatorsEnabled = flag;
        loggingEnabled = flag1;
        cleanupThread = new CleanupThread(referenceQueue, HANDLER);
        cleanupThread.start();
    }

    private void cancelExistingRequest(Object obj)
    {
        Utils.checkMain();
        Action action = (Action)targetToAction.remove(obj);
        if (action != null)
        {
            action.cancel();
            dispatcher.dispatchCancel(action);
        }
        if (obj instanceof ImageView)
        {
            obj = (ImageView)obj;
            obj = (DeferredRequestCreator)targetToDeferredRequestCreator.remove(obj);
            if (obj != null)
            {
                ((DeferredRequestCreator) (obj)).cancel();
            }
        }
    }

    private void deliverAction(Bitmap bitmap, LoadedFrom loadedfrom, Action action)
    {
        if (!action.isCancelled()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!action.willReplay())
        {
            targetToAction.remove(action.getTarget());
        }
        if (bitmap == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (loadedfrom == null)
        {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        action.complete(bitmap, loadedfrom);
        if (loggingEnabled)
        {
            Utils.log("Main", "completed", action.request.logId(), (new StringBuilder()).append("from ").append(loadedfrom).toString());
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        action.error();
        if (loggingEnabled)
        {
            Utils.log("Main", "errored", action.request.logId());
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void cancelRequest(ImageView imageview)
    {
        cancelExistingRequest(imageview);
    }

    public void cancelRequest(Target target)
    {
        cancelExistingRequest(target);
    }

    void complete(BitmapHunter bitmaphunter)
    {
        boolean flag1 = false;
        Action action = bitmaphunter.getAction();
        List list = bitmaphunter.getActions();
        boolean flag;
        if (list != null && !list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (action != null || flag)
        {
            flag1 = true;
        }
        if (flag1)
        {
            Uri uri = bitmaphunter.getData().uri;
            Exception exception = bitmaphunter.getException();
            Bitmap bitmap = bitmaphunter.getResult();
            bitmaphunter = bitmaphunter.getLoadedFrom();
            if (action != null)
            {
                deliverAction(bitmap, bitmaphunter, action);
            }
            if (flag)
            {
                int i = 0;
                for (int j = list.size(); i < j; i++)
                {
                    deliverAction(bitmap, bitmaphunter, (Action)list.get(i));
                }

            }
            if (listener != null && exception != null)
            {
                listener.onImageLoadFailed(this, uri, exception);
                return;
            }
        }
    }

    void defer(ImageView imageview, DeferredRequestCreator deferredrequestcreator)
    {
        targetToDeferredRequestCreator.put(imageview, deferredrequestcreator);
    }

    void enqueueAndSubmit(Action action)
    {
        Object obj = action.getTarget();
        if (obj != null && targetToAction.get(obj) != action)
        {
            cancelExistingRequest(obj);
            targetToAction.put(obj, action);
        }
        submit(action);
    }

    List getRequestHandlers()
    {
        return requestHandlers;
    }

    public RequestCreator load(Uri uri)
    {
        return new RequestCreator(this, uri, 0);
    }

    public RequestCreator load(String s)
    {
        if (s == null)
        {
            return new RequestCreator(this, null, 0);
        }
        if (s.trim().length() == 0)
        {
            throw new IllegalArgumentException("Path must not be empty.");
        } else
        {
            return load(Uri.parse(s));
        }
    }

    Bitmap quickMemoryCacheCheck(String s)
    {
        s = cache.get(s);
        if (s != null)
        {
            stats.dispatchCacheHit();
            return s;
        } else
        {
            stats.dispatchCacheMiss();
            return s;
        }
    }

    void resumeAction(Action action)
    {
        Bitmap bitmap = null;
        if (MemoryPolicy.shouldReadFromMemoryCache(action.memoryPolicy))
        {
            bitmap = quickMemoryCacheCheck(action.getKey());
        }
        if (bitmap != null)
        {
            deliverAction(bitmap, LoadedFrom.MEMORY, action);
            if (loggingEnabled)
            {
                Utils.log("Main", "completed", action.request.logId(), (new StringBuilder()).append("from ").append(LoadedFrom.MEMORY).toString());
            }
        } else
        {
            enqueueAndSubmit(action);
            if (loggingEnabled)
            {
                Utils.log("Main", "resumed", action.request.logId());
                return;
            }
        }
    }

    void submit(Action action)
    {
        dispatcher.dispatchSubmit(action);
    }

    Request transformRequest(Request request)
    {
        Request request1 = requestTransformer.transformRequest(request);
        if (request1 == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Request transformer ").append(requestTransformer.getClass().getCanonicalName()).append(" returned null for ").append(request).toString());
        } else
        {
            return request1;
        }
    }


}
