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

class this._cls1
    implements Runnable
{

    final QueueItem.data this$1;

    public void run()
    {
        do
        {
            QueueItem queueitem = ueue.next();
            if (queueitem == null)
            {
                ackgroundRunning.set(false);
                return;
            }
            switch (queueitem.what)
            {
            default:
                Log.e("ThreadUtil", (new StringBuilder()).append("Unsupported message, what=").append(queueitem.what).toString());
                break;

            case 1: // '\001'
                ueue.removeMessages(1);
                callback.refresh(queueitem.arg1);
                break;

            case 2: // '\002'
                ueue.removeMessages(2);
                ueue.removeMessages(3);
                callback.updateRange(queueitem.arg1, queueitem.arg2, queueitem.arg3, queueitem.arg4, queueitem.arg5);
                break;

            case 3: // '\003'
                callback.loadTile(queueitem.arg1, queueitem.arg2);
                break;

            case 4: // '\004'
                callback.recycleTile((allback.recycleTile)queueitem.data);
                break;
            }
        } while (true);
    }

    <init>()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class android/support/v7/util/MessageThreadUtil$2

/* anonymous class */
    class MessageThreadUtil._cls2
        implements ThreadUtil.BackgroundCallback
    {

        private static final int LOAD_TILE = 3;
        private static final int RECYCLE_TILE = 4;
        private static final int REFRESH = 1;
        private static final int UPDATE_RANGE = 2;
        private Runnable mBackgroundRunnable;
        AtomicBoolean mBackgroundRunning;
        private final Executor mExecutor = ParallelExecutorCompat.getParallelExecutor();
        private final MessageThreadUtil.MessageQueue mQueue = new MessageThreadUtil.MessageQueue();
        final MessageThreadUtil this$0;
        final ThreadUtil.BackgroundCallback val$callback;

        private void maybeExecuteBackgroundRunnable()
        {
            if (mBackgroundRunning.compareAndSet(false, true))
            {
                mExecutor.execute(mBackgroundRunnable);
            }
        }

        private void sendMessage(MessageThreadUtil.SyncQueueItem syncqueueitem)
        {
            mQueue.sendMessage(syncqueueitem);
            maybeExecuteBackgroundRunnable();
        }

        private void sendMessageAtFrontOfQueue(MessageThreadUtil.SyncQueueItem syncqueueitem)
        {
            mQueue.sendMessageAtFrontOfQueue(syncqueueitem);
            maybeExecuteBackgroundRunnable();
        }

        public void loadTile(int i, int j)
        {
            sendMessage(MessageThreadUtil.SyncQueueItem.obtainMessage(3, i, j));
        }

        public void recycleTile(TileList.Tile tile)
        {
            sendMessage(MessageThreadUtil.SyncQueueItem.obtainMessage(4, 0, tile));
        }

        public void refresh(int i)
        {
            sendMessageAtFrontOfQueue(MessageThreadUtil.SyncQueueItem.obtainMessage(1, i, null));
        }

        public void updateRange(int i, int j, int k, int l, int i1)
        {
            sendMessageAtFrontOfQueue(MessageThreadUtil.SyncQueueItem.obtainMessage(2, i, j, k, l, i1, null));
        }


            
            {
                this$0 = final_messagethreadutil;
                callback = ThreadUtil.BackgroundCallback.this;
                super();
                mBackgroundRunning = new AtomicBoolean(false);
                mBackgroundRunnable = new MessageThreadUtil._cls2._cls1();
            }
    }

}
