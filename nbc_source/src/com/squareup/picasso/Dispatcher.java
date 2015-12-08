// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.squareup.picasso:
//            Utils, BitmapHunter, Action, Picasso, 
//            Request, MemoryPolicy, Cache, PicassoExecutorService, 
//            NetworkPolicy, Downloader, Stats

class Dispatcher
{
    private static class DispatcherHandler extends Handler
    {

        private final Dispatcher dispatcher;

        public void handleMessage(Message message)
        {
            boolean flag = true;
            Dispatcher dispatcher1;
            switch (message.what)
            {
            case 3: // '\003'
            case 8: // '\b'
            default:
                Picasso.HANDLER.post(message. new Runnable() {

                    final DispatcherHandler this$0;
                    final Message val$msg;

                    public void run()
                    {
                        throw new AssertionError((new StringBuilder()).append("Unknown handler message received: ").append(msg.what).toString());
                    }

            
            {
                this$0 = final_dispatcherhandler;
                msg = Message.this;
                super();
            }
                });
                return;

            case 1: // '\001'
                message = (Action)message.obj;
                dispatcher.performSubmit(message);
                return;

            case 2: // '\002'
                message = (Action)message.obj;
                dispatcher.performCancel(message);
                return;

            case 11: // '\013'
                message = ((Message) (message.obj));
                dispatcher.performPauseTag(message);
                return;

            case 12: // '\f'
                message = ((Message) (message.obj));
                dispatcher.performResumeTag(message);
                return;

            case 4: // '\004'
                message = (BitmapHunter)message.obj;
                dispatcher.performComplete(message);
                return;

            case 5: // '\005'
                message = (BitmapHunter)message.obj;
                dispatcher.performRetry(message);
                return;

            case 6: // '\006'
                message = (BitmapHunter)message.obj;
                dispatcher.performError(message, false);
                return;

            case 7: // '\007'
                dispatcher.performBatchComplete();
                return;

            case 9: // '\t'
                message = (NetworkInfo)message.obj;
                dispatcher.performNetworkStateChange(message);
                return;

            case 10: // '\n'
                dispatcher1 = dispatcher;
                break;
            }
            if (message.arg1 != 1)
            {
                flag = false;
            }
            dispatcher1.performAirplaneModeChange(flag);
        }

        public DispatcherHandler(Looper looper, Dispatcher dispatcher1)
        {
            super(looper);
            dispatcher = dispatcher1;
        }
    }

    static class DispatcherThread extends HandlerThread
    {

        DispatcherThread()
        {
            super("Picasso-Dispatcher", 10);
        }
    }

    static class NetworkBroadcastReceiver extends BroadcastReceiver
    {

        static final String EXTRA_AIRPLANE_STATE = "state";
        private final Dispatcher dispatcher;

        public void onReceive(Context context1, Intent intent)
        {
            if (intent != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            String s;
            s = intent.getAction();
            if (!"android.intent.action.AIRPLANE_MODE".equals(s))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!intent.hasExtra("state")) goto _L1; else goto _L3
_L3:
            dispatcher.dispatchAirplaneModeChange(intent.getBooleanExtra("state", false));
            return;
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(s)) goto _L1; else goto _L4
_L4:
            context1 = (ConnectivityManager)Utils.getService(context1, "connectivity");
            dispatcher.dispatchNetworkStateChange(context1.getActiveNetworkInfo());
            return;
        }

        void register()
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (dispatcher.scansNetworkChanges)
            {
                intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            dispatcher.context.registerReceiver(this, intentfilter);
        }

        void unregister()
        {
            dispatcher.context.unregisterReceiver(this);
        }

        NetworkBroadcastReceiver(Dispatcher dispatcher1)
        {
            dispatcher = dispatcher1;
        }
    }


    static final int AIRPLANE_MODE_CHANGE = 10;
    private static final int AIRPLANE_MODE_OFF = 0;
    private static final int AIRPLANE_MODE_ON = 1;
    private static final int BATCH_DELAY = 200;
    private static final String DISPATCHER_THREAD_NAME = "Dispatcher";
    static final int HUNTER_BATCH_COMPLETE = 8;
    static final int HUNTER_COMPLETE = 4;
    static final int HUNTER_DECODE_FAILED = 6;
    static final int HUNTER_DELAY_NEXT_BATCH = 7;
    static final int HUNTER_RETRY = 5;
    static final int NETWORK_STATE_CHANGE = 9;
    static final int REQUEST_BATCH_RESUME = 13;
    static final int REQUEST_CANCEL = 2;
    static final int REQUEST_GCED = 3;
    static final int REQUEST_SUBMIT = 1;
    private static final int RETRY_DELAY = 500;
    static final int TAG_PAUSE = 11;
    static final int TAG_RESUME = 12;
    boolean airplaneMode;
    final List batch = new ArrayList(4);
    final Cache cache;
    final Context context;
    final DispatcherThread dispatcherThread = new DispatcherThread();
    final Downloader downloader;
    final Map failedActions = new WeakHashMap();
    final Handler handler;
    final Map hunterMap = new LinkedHashMap();
    final Handler mainThreadHandler;
    final Map pausedActions = new WeakHashMap();
    final Set pausedTags = new HashSet();
    final NetworkBroadcastReceiver receiver = new NetworkBroadcastReceiver(this);
    final boolean scansNetworkChanges;
    final ExecutorService service;
    final Stats stats;

    Dispatcher(Context context1, ExecutorService executorservice, Handler handler1, Downloader downloader1, Cache cache1, Stats stats1)
    {
        dispatcherThread.start();
        Utils.flushStackLocalLeaks(dispatcherThread.getLooper());
        context = context1;
        service = executorservice;
        handler = new DispatcherHandler(dispatcherThread.getLooper(), this);
        downloader = downloader1;
        mainThreadHandler = handler1;
        cache = cache1;
        stats = stats1;
        airplaneMode = Utils.isAirplaneModeOn(context);
        scansNetworkChanges = Utils.hasPermission(context1, "android.permission.ACCESS_NETWORK_STATE");
        receiver.register();
    }

    private void batch(BitmapHunter bitmaphunter)
    {
        if (!bitmaphunter.isCancelled())
        {
            batch.add(bitmaphunter);
            if (!handler.hasMessages(7))
            {
                handler.sendEmptyMessageDelayed(7, 200L);
                return;
            }
        }
    }

    private void flushFailedActions()
    {
        if (!failedActions.isEmpty())
        {
            Action action;
            for (Iterator iterator = failedActions.values().iterator(); iterator.hasNext(); performSubmit(action, false))
            {
                action = (Action)iterator.next();
                iterator.remove();
                if (action.getPicasso().loggingEnabled)
                {
                    Utils.log("Dispatcher", "replaying", action.getRequest().logId());
                }
            }

        }
    }

    private void logBatch(List list)
    {
        while (list == null || list.isEmpty() || !((BitmapHunter)list.get(0)).getPicasso().loggingEnabled) 
        {
            return;
        }
        StringBuilder stringbuilder = new StringBuilder();
        BitmapHunter bitmaphunter;
        for (list = list.iterator(); list.hasNext(); stringbuilder.append(Utils.getLogIdsForHunter(bitmaphunter)))
        {
            bitmaphunter = (BitmapHunter)list.next();
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(", ");
            }
        }

        Utils.log("Dispatcher", "delivered", stringbuilder.toString());
    }

    private void markForReplay(Action action)
    {
        Object obj = action.getTarget();
        if (obj != null)
        {
            action.willReplay = true;
            failedActions.put(obj, action);
        }
    }

    private void markForReplay(BitmapHunter bitmaphunter)
    {
        Action action = bitmaphunter.getAction();
        if (action != null)
        {
            markForReplay(action);
        }
        bitmaphunter = bitmaphunter.getActions();
        if (bitmaphunter != null)
        {
            int i = 0;
            for (int j = bitmaphunter.size(); i < j; i++)
            {
                markForReplay((Action)bitmaphunter.get(i));
            }

        }
    }

    void dispatchAirplaneModeChange(boolean flag)
    {
        Handler handler1 = handler;
        Handler handler2 = handler;
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        handler1.sendMessage(handler2.obtainMessage(10, i, 0));
    }

    void dispatchCancel(Action action)
    {
        handler.sendMessage(handler.obtainMessage(2, action));
    }

    void dispatchComplete(BitmapHunter bitmaphunter)
    {
        handler.sendMessage(handler.obtainMessage(4, bitmaphunter));
    }

    void dispatchFailed(BitmapHunter bitmaphunter)
    {
        handler.sendMessage(handler.obtainMessage(6, bitmaphunter));
    }

    void dispatchNetworkStateChange(NetworkInfo networkinfo)
    {
        handler.sendMessage(handler.obtainMessage(9, networkinfo));
    }

    void dispatchPauseTag(Object obj)
    {
        handler.sendMessage(handler.obtainMessage(11, obj));
    }

    void dispatchResumeTag(Object obj)
    {
        handler.sendMessage(handler.obtainMessage(12, obj));
    }

    void dispatchRetry(BitmapHunter bitmaphunter)
    {
        handler.sendMessageDelayed(handler.obtainMessage(5, bitmaphunter), 500L);
    }

    void dispatchSubmit(Action action)
    {
        handler.sendMessage(handler.obtainMessage(1, action));
    }

    void performAirplaneModeChange(boolean flag)
    {
        airplaneMode = flag;
    }

    void performBatchComplete()
    {
        ArrayList arraylist = new ArrayList(batch);
        batch.clear();
        mainThreadHandler.sendMessage(mainThreadHandler.obtainMessage(8, arraylist));
        logBatch(arraylist);
    }

    void performCancel(Action action)
    {
        String s = action.getKey();
        BitmapHunter bitmaphunter = (BitmapHunter)hunterMap.get(s);
        if (bitmaphunter != null)
        {
            bitmaphunter.detach(action);
            if (bitmaphunter.cancel())
            {
                hunterMap.remove(s);
                if (action.getPicasso().loggingEnabled)
                {
                    Utils.log("Dispatcher", "canceled", action.getRequest().logId());
                }
            }
        }
        if (pausedTags.contains(action.getTag()))
        {
            pausedActions.remove(action.getTarget());
            if (action.getPicasso().loggingEnabled)
            {
                Utils.log("Dispatcher", "canceled", action.getRequest().logId(), "because paused request got canceled");
            }
        }
        action = (Action)failedActions.remove(action.getTarget());
        if (action != null && action.getPicasso().loggingEnabled)
        {
            Utils.log("Dispatcher", "canceled", action.getRequest().logId(), "from replaying");
        }
    }

    void performComplete(BitmapHunter bitmaphunter)
    {
        if (MemoryPolicy.shouldWriteToMemoryCache(bitmaphunter.getMemoryPolicy()))
        {
            cache.set(bitmaphunter.getKey(), bitmaphunter.getResult());
        }
        hunterMap.remove(bitmaphunter.getKey());
        batch(bitmaphunter);
        if (bitmaphunter.getPicasso().loggingEnabled)
        {
            Utils.log("Dispatcher", "batched", Utils.getLogIdsForHunter(bitmaphunter), "for completion");
        }
    }

    void performError(BitmapHunter bitmaphunter, boolean flag)
    {
        if (bitmaphunter.getPicasso().loggingEnabled)
        {
            String s1 = Utils.getLogIdsForHunter(bitmaphunter);
            StringBuilder stringbuilder = (new StringBuilder()).append("for error");
            String s;
            if (flag)
            {
                s = " (will replay)";
            } else
            {
                s = "";
            }
            Utils.log("Dispatcher", "batched", s1, stringbuilder.append(s).toString());
        }
        hunterMap.remove(bitmaphunter.getKey());
        batch(bitmaphunter);
    }

    void performNetworkStateChange(NetworkInfo networkinfo)
    {
        if (service instanceof PicassoExecutorService)
        {
            ((PicassoExecutorService)service).adjustThreadCount(networkinfo);
        }
        if (networkinfo != null && networkinfo.isConnected())
        {
            flushFailedActions();
        }
    }

    void performPauseTag(Object obj)
    {
        if (pausedTags.add(obj))
        {
            Iterator iterator = hunterMap.values().iterator();
            while (iterator.hasNext()) 
            {
                BitmapHunter bitmaphunter = (BitmapHunter)iterator.next();
                boolean flag = bitmaphunter.getPicasso().loggingEnabled;
                Action action = bitmaphunter.getAction();
                List list = bitmaphunter.getActions();
                int i;
                if (list != null && !list.isEmpty())
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (action != null || i != 0)
                {
                    if (action != null && action.getTag().equals(obj))
                    {
                        bitmaphunter.detach(action);
                        pausedActions.put(action.getTarget(), action);
                        if (flag)
                        {
                            Utils.log("Dispatcher", "paused", action.request.logId(), (new StringBuilder()).append("because tag '").append(obj).append("' was paused").toString());
                        }
                    }
                    if (i != 0)
                    {
                        i = list.size() - 1;
                        while (i >= 0) 
                        {
                            Action action1 = (Action)list.get(i);
                            if (action1.getTag().equals(obj))
                            {
                                bitmaphunter.detach(action1);
                                pausedActions.put(action1.getTarget(), action1);
                                if (flag)
                                {
                                    Utils.log("Dispatcher", "paused", action1.request.logId(), (new StringBuilder()).append("because tag '").append(obj).append("' was paused").toString());
                                }
                            }
                            i--;
                        }
                    }
                    if (bitmaphunter.cancel())
                    {
                        iterator.remove();
                        if (flag)
                        {
                            Utils.log("Dispatcher", "canceled", Utils.getLogIdsForHunter(bitmaphunter), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    void performResumeTag(Object obj)
    {
        if (pausedTags.remove(obj))
        {
            ArrayList arraylist = null;
            Iterator iterator = pausedActions.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Action action = (Action)iterator.next();
                if (action.getTag().equals(obj))
                {
                    ArrayList arraylist1 = arraylist;
                    if (arraylist == null)
                    {
                        arraylist1 = new ArrayList();
                    }
                    arraylist1.add(action);
                    iterator.remove();
                    arraylist = arraylist1;
                }
            } while (true);
            if (arraylist != null)
            {
                mainThreadHandler.sendMessage(mainThreadHandler.obtainMessage(13, arraylist));
                return;
            }
        }
    }

    void performRetry(BitmapHunter bitmaphunter)
    {
        if (!bitmaphunter.isCancelled()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        boolean flag2;
        if (service.isShutdown())
        {
            performError(bitmaphunter, false);
            return;
        }
        NetworkInfo networkinfo = null;
        if (scansNetworkChanges)
        {
            networkinfo = ((ConnectivityManager)Utils.getService(context, "connectivity")).getActiveNetworkInfo();
        }
        boolean flag1;
        if (networkinfo != null && networkinfo.isConnected())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = bitmaphunter.shouldRetry(airplaneMode, networkinfo);
        flag2 = bitmaphunter.supportsReplay();
        if (flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (scansNetworkChanges && flag2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        performError(bitmaphunter, flag1);
        if (flag1)
        {
            markForReplay(bitmaphunter);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!scansNetworkChanges || flag)
        {
            if (bitmaphunter.getPicasso().loggingEnabled)
            {
                Utils.log("Dispatcher", "retrying", Utils.getLogIdsForHunter(bitmaphunter));
            }
            if (bitmaphunter.getException() instanceof NetworkRequestHandler.ContentLengthException)
            {
                bitmaphunter.networkPolicy = bitmaphunter.networkPolicy | NetworkPolicy.NO_CACHE.index;
            }
            bitmaphunter.future = service.submit(bitmaphunter);
            return;
        }
        performError(bitmaphunter, flag2);
        if (flag2)
        {
            markForReplay(bitmaphunter);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    void performSubmit(Action action)
    {
        performSubmit(action, true);
    }

    void performSubmit(Action action, boolean flag)
    {
        if (!pausedTags.contains(action.getTag())) goto _L2; else goto _L1
_L1:
        pausedActions.put(action.getTarget(), action);
        if (action.getPicasso().loggingEnabled)
        {
            Utils.log("Dispatcher", "paused", action.request.logId(), (new StringBuilder()).append("because tag '").append(action.getTag()).append("' is paused").toString());
        }
_L4:
        return;
_L2:
        BitmapHunter bitmaphunter = (BitmapHunter)hunterMap.get(action.getKey());
        if (bitmaphunter != null)
        {
            bitmaphunter.attach(action);
            return;
        }
        if (!service.isShutdown())
        {
            break; /* Loop/switch isn't completed */
        }
        if (action.getPicasso().loggingEnabled)
        {
            Utils.log("Dispatcher", "ignored", action.request.logId(), "because shut down");
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        BitmapHunter bitmaphunter1 = BitmapHunter.forRequest(action.getPicasso(), this, cache, stats, action);
        bitmaphunter1.future = service.submit(bitmaphunter1);
        hunterMap.put(action.getKey(), bitmaphunter1);
        if (flag)
        {
            failedActions.remove(action.getTarget());
        }
        if (action.getPicasso().loggingEnabled)
        {
            Utils.log("Dispatcher", "enqueued", action.request.logId());
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    void shutdown()
    {
        if (service instanceof PicassoExecutorService)
        {
            service.shutdown();
        }
        downloader.shutdown();
        dispatcherThread.quit();
        Picasso.HANDLER.post(new Runnable() {

            final Dispatcher this$0;

            public void run()
            {
                receiver.unregister();
            }

            
            {
                this$0 = Dispatcher.this;
                super();
            }
        });
    }
}
