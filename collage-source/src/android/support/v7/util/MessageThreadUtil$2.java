// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.util;

import android.support.v4.content.ParallelExecutorCompat;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package android.support.v7.util:
//            MessageThreadUtil

class ncQueueItem.data
    implements dCallback
{

    private static final int LOAD_TILE = 3;
    private static final int RECYCLE_TILE = 4;
    private static final int REFRESH = 1;
    private static final int UPDATE_RANGE = 2;
    private Runnable mBackgroundRunnable;
    AtomicBoolean mBackgroundRunning;
    private final Executor mExecutor = ParallelExecutorCompat.getParallelExecutor();
    private final ssageQueue mQueue = new ssageQueue();
    final MessageThreadUtil this$0;
    final dCallback val$callback;

    private void maybeExecuteBackgroundRunnable()
    {
        if (mBackgroundRunning.compareAndSet(false, true))
        {
            mExecutor.execute(mBackgroundRunnable);
        }
    }

    private void sendMessage(ncQueueItem ncqueueitem)
    {
        mQueue.sendMessage(ncqueueitem);
        maybeExecuteBackgroundRunnable();
    }

    private void sendMessageAtFrontOfQueue(ncQueueItem ncqueueitem)
    {
        mQueue.sendMessageAtFrontOfQueue(ncqueueitem);
        maybeExecuteBackgroundRunnable();
    }

    public void loadTile(int i, int j)
    {
        sendMessage(ncQueueItem.obtainMessage(3, i, j));
    }

    public void recycleTile(ncQueueItem.obtainMessage obtainmessage)
    {
        sendMessage(ncQueueItem.obtainMessage(4, 0, obtainmessage));
    }

    public void refresh(int i)
    {
        sendMessageAtFrontOfQueue(ncQueueItem.obtainMessage(1, i, null));
    }

    public void updateRange(int i, int j, int k, int l, int i1)
    {
        sendMessageAtFrontOfQueue(ncQueueItem.obtainMessage(2, i, j, k, l, i1, null));
    }


    dCallback()
    {
        this$0 = final_messagethreadutil;
        val$callback = dCallback.this;
        super();
        mBackgroundRunning = new AtomicBoolean(false);
        mBackgroundRunnable = new Runnable() {

            final MessageThreadUtil._cls2 this$1;

            public void run()
            {
                do
                {
                    MessageThreadUtil.SyncQueueItem syncqueueitem = mQueue.next();
                    if (syncqueueitem == null)
                    {
                        mBackgroundRunning.set(false);
                        return;
                    }
                    switch (syncqueueitem.what)
                    {
                    default:
                        Log.e("ThreadUtil", (new StringBuilder()).append("Unsupported message, what=").append(syncqueueitem.what).toString());
                        break;

                    case 1: // '\001'
                        mQueue.removeMessages(1);
                        callback.refresh(syncqueueitem.arg1);
                        break;

                    case 2: // '\002'
                        mQueue.removeMessages(2);
                        mQueue.removeMessages(3);
                        callback.updateRange(syncqueueitem.arg1, syncqueueitem.arg2, syncqueueitem.arg3, syncqueueitem.arg4, syncqueueitem.arg5);
                        break;

                    case 3: // '\003'
                        callback.loadTile(syncqueueitem.arg1, syncqueueitem.arg2);
                        break;

                    case 4: // '\004'
                        callback.recycleTile((TileList.Tile)syncqueueitem.data);
                        break;
                    }
                } while (true);
            }

            
            {
                this$1 = MessageThreadUtil._cls2.this;
                super();
            }
        };
    }
}
