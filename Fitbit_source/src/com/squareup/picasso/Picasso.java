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
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.squareup.picasso:
//            Utils, Action, Dispatcher, DeferredRequestCreator, 
//            Request, BitmapHunter, Stats, RequestCreator, 
//            Cache, Target, StatsSnapshot, LruCache, 
//            PicassoExecutorService, Downloader

public class Picasso
{
    public static class Builder
    {

        private Cache cache;
        private final Context context;
        private Downloader downloader;
        private boolean indicatorsEnabled;
        private Listener listener;
        private boolean loggingEnabled;
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
            return new Picasso(context1, new Dispatcher(context1, service, Picasso.HANDLER, downloader, cache, stats1), cache, listener, transformer, stats1, indicatorsEnabled, loggingEnabled);
        }

        public Builder debugging(boolean flag)
        {
            return indicatorsEnabled(flag);
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

        public Builder executor(ExecutorService executorservice)
        {
            if (executorservice == null)
            {
                throw new IllegalArgumentException("Executor service must not be null.");
            }
            if (service != null)
            {
                throw new IllegalStateException("Executor service already set.");
            } else
            {
                service = executorservice;
                return this;
            }
        }

        public Builder indicatorsEnabled(boolean flag)
        {
            indicatorsEnabled = flag;
            return this;
        }

        public Builder listener(Listener listener1)
        {
            if (listener1 == null)
            {
                throw new IllegalArgumentException("Listener must not be null.");
            }
            if (listener != null)
            {
                throw new IllegalStateException("Listener already set.");
            } else
            {
                listener = listener1;
                return this;
            }
        }

        public Builder loggingEnabled(boolean flag)
        {
            loggingEnabled = flag;
            return this;
        }

        public Builder memoryCache(Cache cache1)
        {
            if (cache1 == null)
            {
                throw new IllegalArgumentException("Memory cache must not be null.");
            }
            if (cache != null)
            {
                throw new IllegalStateException("Memory cache already set.");
            } else
            {
                cache = cache1;
                return this;
            }
        }

        public Builder requestTransformer(RequestTransformer requesttransformer)
        {
            if (requesttransformer == null)
            {
                throw new IllegalArgumentException("Transformer must not be null.");
            }
            if (transformer != null)
            {
                throw new IllegalStateException("Transformer already set.");
            } else
            {
                transformer = requesttransformer;
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
            try
            {
                do
                {
                    Action.RequestWeakReference requestweakreference = (Action.RequestWeakReference)referenceQueue.remove();
                    handler.sendMessage(handler.obtainMessage(3, requestweakreference.action));
                } while (true);
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
            }
        }

        void shutdown()
        {
            interrupt();
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
            DISK = new LoadedFrom("DISK", 1, -256);
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
            switch (message.what)
            {
            default:
                throw new AssertionError((new StringBuilder()).append("Unknown handler message received: ").append(message.what).toString());

            case 8: // '\b'
                message = (List)message.obj;
                int j = message.size();
                for (int i = 0; i < j; i++)
                {
                    BitmapHunter bitmaphunter = (BitmapHunter)message.get(i);
                    bitmaphunter.picasso.complete(bitmaphunter);
                }

                break;

            case 3: // '\003'
                message = (Action)message.obj;
                ((Action) (message)).picasso.cancelExistingRequest(message.getTarget());
                break;
            }
        }

    };
    static final String TAG = "Picasso";
    static Picasso singleton = null;
    final Cache cache;
    private final CleanupThread cleanupThread;
    final Context context;
    final Dispatcher dispatcher;
    boolean indicatorsEnabled;
    private final Listener listener;
    volatile boolean loggingEnabled;
    final ReferenceQueue referenceQueue = new ReferenceQueue();
    private final RequestTransformer requestTransformer;
    boolean shutdown;
    final Stats stats;
    final Map targetToAction = new WeakHashMap();
    final Map targetToDeferredRequestCreator = new WeakHashMap();

    Picasso(Context context1, Dispatcher dispatcher1, Cache cache1, Listener listener1, RequestTransformer requesttransformer, Stats stats1, boolean flag, 
            boolean flag1)
    {
        context = context1;
        dispatcher = dispatcher1;
        cache = cache1;
        listener = listener1;
        requestTransformer = requesttransformer;
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

    public static Picasso with(Context context1)
    {
        if (singleton != null) goto _L2; else goto _L1
_L1:
        com/squareup/picasso/Picasso;
        JVM INSTR monitorenter ;
        if (singleton == null)
        {
            singleton = (new Builder(context1)).build();
        }
        com/squareup/picasso/Picasso;
        JVM INSTR monitorexit ;
_L2:
        return singleton;
        context1;
        com/squareup/picasso/Picasso;
        JVM INSTR monitorexit ;
        throw context1;
    }

    public boolean areIndicatorsEnabled()
    {
        return indicatorsEnabled;
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
        boolean flag2 = true;
        Action action = bitmaphunter.getAction();
        List list = bitmaphunter.getActions();
        boolean flag;
        boolean flag1;
        if (list != null && !list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag2;
        if (action == null)
        {
            if (flag)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
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
                int j = list.size();
                for (int i = 0; i < j; i++)
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
        if (obj != null)
        {
            cancelExistingRequest(obj);
            targetToAction.put(obj, action);
        }
        submit(action);
    }

    public StatsSnapshot getSnapshot()
    {
        return stats.createSnapshot();
    }

    public boolean isDebugging()
    {
        return areIndicatorsEnabled() && isLoggingEnabled();
    }

    public boolean isLoggingEnabled()
    {
        return loggingEnabled;
    }

    public RequestCreator load(int i)
    {
        if (i == 0)
        {
            throw new IllegalArgumentException("Resource ID must not be zero.");
        } else
        {
            return new RequestCreator(this, null, i);
        }
    }

    public RequestCreator load(Uri uri)
    {
        return new RequestCreator(this, uri, 0);
    }

    public RequestCreator load(File file)
    {
        if (file == null)
        {
            return new RequestCreator(this, null, 0);
        } else
        {
            return load(Uri.fromFile(file));
        }
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

    public void setDebugging(boolean flag)
    {
        setIndicatorsEnabled(flag);
    }

    public void setIndicatorsEnabled(boolean flag)
    {
        indicatorsEnabled = flag;
    }

    public void setLoggingEnabled(boolean flag)
    {
        loggingEnabled = flag;
    }

    public void shutdown()
    {
        if (this == singleton)
        {
            throw new UnsupportedOperationException("Default singleton instance cannot be shutdown.");
        }
        if (shutdown)
        {
            return;
        }
        cache.clear();
        cleanupThread.shutdown();
        stats.shutdown();
        dispatcher.shutdown();
        for (Iterator iterator = targetToDeferredRequestCreator.values().iterator(); iterator.hasNext(); ((DeferredRequestCreator)iterator.next()).cancel()) { }
        targetToDeferredRequestCreator.clear();
        shutdown = true;
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
