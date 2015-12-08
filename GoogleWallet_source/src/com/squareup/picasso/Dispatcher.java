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
//            Request, Cache, PicassoExecutorService, Downloader, 
//            Stats

final class Dispatcher
{
    static final class DispatcherHandler extends Handler
    {

        private final Dispatcher dispatcher;

        public final void handleMessage(Message message)
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

                    public final void run()
                    {
                        throw new AssertionError((new StringBuilder("Unknown handler message received: ")).append(msg.what).toString());
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

    static final class DispatcherThread extends HandlerThread
    {

        DispatcherThread()
        {
            super("Picasso-Dispatcher", 10);
        }
    }

    static final class NetworkBroadcastReceiver extends BroadcastReceiver
    {

        private final Dispatcher dispatcher;

        public final void onReceive(Context context1, Intent intent)
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

        final void register()
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (dispatcher.scansNetworkChanges)
            {
                intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            dispatcher.context.registerReceiver(this, intentfilter);
        }

        NetworkBroadcastReceiver(Dispatcher dispatcher1)
        {
            dispatcher = dispatcher1;
        }
    }


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

    private static void logBatch(List list)
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

    private void performSubmit(Action action, boolean flag)
    {
        if (!pausedTags.contains(action.getTag())) goto _L2; else goto _L1
_L1:
        pausedActions.put(action.getTarget(), action);
        if (action.getPicasso().loggingEnabled)
        {
            Utils.log("Dispatcher", "paused", action.request.logId(), (new StringBuilder("because tag '")).append(action.getTag()).append("' is paused").toString());
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

    final void dispatchAirplaneModeChange(boolean flag)
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

    final void dispatchCancel(Action action)
    {
        handler.sendMessage(handler.obtainMessage(2, action));
    }

    final void dispatchComplete(BitmapHunter bitmaphunter)
    {
        handler.sendMessage(handler.obtainMessage(4, bitmaphunter));
    }

    final void dispatchFailed(BitmapHunter bitmaphunter)
    {
        handler.sendMessage(handler.obtainMessage(6, bitmaphunter));
    }

    final void dispatchNetworkStateChange(NetworkInfo networkinfo)
    {
        handler.sendMessage(handler.obtainMessage(9, networkinfo));
    }

    final void dispatchRetry(BitmapHunter bitmaphunter)
    {
        handler.sendMessageDelayed(handler.obtainMessage(5, bitmaphunter), 500L);
    }

    final void dispatchSubmit(Action action)
    {
        handler.sendMessage(handler.obtainMessage(1, action));
    }

    final void performAirplaneModeChange(boolean flag)
    {
        airplaneMode = flag;
    }

    final void performBatchComplete()
    {
        ArrayList arraylist = new ArrayList(batch);
        batch.clear();
        mainThreadHandler.sendMessage(mainThreadHandler.obtainMessage(8, arraylist));
        logBatch(arraylist);
    }

    final void performCancel(Action action)
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

    final void performComplete(BitmapHunter bitmaphunter)
    {
        if (!bitmaphunter.shouldSkipMemoryCache())
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

    final void performError(BitmapHunter bitmaphunter, boolean flag)
    {
        if (bitmaphunter.getPicasso().loggingEnabled)
        {
            String s1 = Utils.getLogIdsForHunter(bitmaphunter);
            StringBuilder stringbuilder = new StringBuilder("for error");
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

    final void performNetworkStateChange(NetworkInfo networkinfo)
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

    final void performPauseTag(Object obj)
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
                            Utils.log("Dispatcher", "paused", action.request.logId(), (new StringBuilder("because tag '")).append(obj).append("' was paused").toString());
                        }
                    }
                    if (i != 0)
                    {
                        for (i = list.size() - 1; i >= 0; i--)
                        {
                            Action action1 = (Action)list.get(i);
                            if (!action1.getTag().equals(obj))
                            {
                                continue;
                            }
                            bitmaphunter.detach(action1);
                            pausedActions.put(action1.getTarget(), action1);
                            if (flag)
                            {
                                Utils.log("Dispatcher", "paused", action1.request.logId(), (new StringBuilder("because tag '")).append(obj).append("' was paused").toString());
                            }
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

    final void performResumeTag(Object obj)
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

    final void performRetry(BitmapHunter bitmaphunter)
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

    final void performSubmit(Action action)
    {
        performSubmit(action, true);
    }
}
