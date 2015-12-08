// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.util;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.ParallelExecutorCompat;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package android.support.v7.util:
//            ThreadUtil

class MessageThreadUtil
    implements ThreadUtil
{
    static class MessageQueue
    {

        private SyncQueueItem mRoot;

        SyncQueueItem next()
        {
            this;
            JVM INSTR monitorenter ;
            SyncQueueItem syncqueueitem = mRoot;
            if (syncqueueitem != null) goto _L2; else goto _L1
_L1:
            syncqueueitem = null;
_L4:
            this;
            JVM INSTR monitorexit ;
            return syncqueueitem;
_L2:
            syncqueueitem = mRoot;
            mRoot = mRoot.next;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            throw exception;
        }


// JavaClassFileOutputException: Prev chain is broken

        void sendMessage(SyncQueueItem syncqueueitem)
        {
            this;
            JVM INSTR monitorenter ;
            if (mRoot != null) goto _L2; else goto _L1
_L1:
            mRoot = syncqueueitem;
_L4:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            SyncQueueItem syncqueueitem1;
            for (syncqueueitem1 = mRoot; syncqueueitem1.next != null; syncqueueitem1 = syncqueueitem1.next) { }
            syncqueueitem1.next = syncqueueitem;
            if (true) goto _L4; else goto _L3
_L3:
            syncqueueitem;
            throw syncqueueitem;
        }

        void sendMessageAtFrontOfQueue(SyncQueueItem syncqueueitem)
        {
            this;
            JVM INSTR monitorenter ;
            syncqueueitem.next = mRoot;
            mRoot = syncqueueitem;
            this;
            JVM INSTR monitorexit ;
            return;
            syncqueueitem;
            throw syncqueueitem;
        }

        MessageQueue()
        {
        }
    }

    static class SyncQueueItem
    {

        private static SyncQueueItem sPool;
        private static final Object sPoolLock = new Object();
        public int arg1;
        public int arg2;
        public int arg3;
        public int arg4;
        public int arg5;
        public Object data;
        private SyncQueueItem next;
        public int what;

        static SyncQueueItem obtainMessage(int i, int j, int k)
        {
            return obtainMessage(i, j, k, 0, 0, 0, null);
        }

        static SyncQueueItem obtainMessage(int i, int j, int k, int l, int i1, int j1, Object obj)
        {
            Object obj1 = sPoolLock;
            obj1;
            JVM INSTR monitorenter ;
            SyncQueueItem syncqueueitem;
            if (sPool != null)
            {
                break MISSING_BLOCK_LABEL_74;
            }
            syncqueueitem = new SyncQueueItem();
_L1:
            syncqueueitem.what = i;
            syncqueueitem.arg1 = j;
            syncqueueitem.arg2 = k;
            syncqueueitem.arg3 = l;
            syncqueueitem.arg4 = i1;
            syncqueueitem.arg5 = j1;
            syncqueueitem.data = obj;
            return syncqueueitem;
            syncqueueitem = sPool;
            sPool = sPool.next;
            syncqueueitem.next = null;
              goto _L1
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        static SyncQueueItem obtainMessage(int i, int j, Object obj)
        {
            return obtainMessage(i, j, 0, 0, 0, 0, obj);
        }

        void recycle()
        {
            next = null;
            arg5 = 0;
            arg4 = 0;
            arg3 = 0;
            arg2 = 0;
            arg1 = 0;
            what = 0;
            data = null;
            synchronized (sPoolLock)
            {
                if (sPool != null)
                {
                    next = sPool;
                }
                sPool = this;
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }




/*
        static SyncQueueItem access$202(SyncQueueItem syncqueueitem, SyncQueueItem syncqueueitem1)
        {
            syncqueueitem.next = syncqueueitem1;
            return syncqueueitem1;
        }

*/

        SyncQueueItem()
        {
        }
    }


    MessageThreadUtil()
    {
    }

    public ThreadUtil.BackgroundCallback getBackgroundProxy(final ThreadUtil.BackgroundCallback callback)
    {
        return new ThreadUtil.BackgroundCallback() {

            private static final int LOAD_TILE = 3;
            private static final int RECYCLE_TILE = 4;
            private static final int REFRESH = 1;
            private static final int UPDATE_RANGE = 2;
            private Runnable mBackgroundRunnable;
            AtomicBoolean mBackgroundRunning;
            private final Executor mExecutor = ParallelExecutorCompat.getParallelExecutor();
            private final MessageQueue mQueue = new MessageQueue();
            final MessageThreadUtil this$0;
            final ThreadUtil.BackgroundCallback val$callback;

            private void maybeExecuteBackgroundRunnable()
            {
                if (mBackgroundRunning.compareAndSet(false, true))
                {
                    mExecutor.execute(mBackgroundRunnable);
                }
            }

            private void sendMessage(SyncQueueItem syncqueueitem)
            {
                mQueue.sendMessage(syncqueueitem);
                maybeExecuteBackgroundRunnable();
            }

            private void sendMessageAtFrontOfQueue(SyncQueueItem syncqueueitem)
            {
                mQueue.sendMessageAtFrontOfQueue(syncqueueitem);
                maybeExecuteBackgroundRunnable();
            }

            public void loadTile(int i, int j)
            {
                sendMessage(SyncQueueItem.obtainMessage(3, i, j));
            }

            public void recycleTile(TileList.Tile tile)
            {
                sendMessage(SyncQueueItem.obtainMessage(4, 0, tile));
            }

            public void refresh(int i)
            {
                sendMessageAtFrontOfQueue(SyncQueueItem.obtainMessage(1, i, null));
            }

            public void updateRange(int i, int j, int k, int l, int i1)
            {
                sendMessageAtFrontOfQueue(SyncQueueItem.obtainMessage(2, i, j, k, l, i1, null));
            }


            
            {
                this$0 = MessageThreadUtil.this;
                callback = backgroundcallback;
                super();
                mBackgroundRunning = new AtomicBoolean(false);
                mBackgroundRunnable = new _cls1();
            }
        };
    }

    public ThreadUtil.MainThreadCallback getMainThreadProxy(final ThreadUtil.MainThreadCallback callback)
    {
        return new ThreadUtil.MainThreadCallback() {

            private static final int ADD_TILE = 2;
            private static final int REMOVE_TILE = 3;
            private static final int UPDATE_ITEM_COUNT = 1;
            private final Handler mMainThreadHandler = new Handler(Looper.getMainLooper());
            private Runnable mMainThreadRunnable;
            private final MessageQueue mQueue = new MessageQueue();
            final MessageThreadUtil this$0;
            final ThreadUtil.MainThreadCallback val$callback;

            private void sendMessage(SyncQueueItem syncqueueitem)
            {
                mQueue.sendMessage(syncqueueitem);
                mMainThreadHandler.post(mMainThreadRunnable);
            }

            public void addTile(int i, TileList.Tile tile)
            {
                sendMessage(SyncQueueItem.obtainMessage(2, i, tile));
            }

            public void removeTile(int i, int j)
            {
                sendMessage(SyncQueueItem.obtainMessage(3, i, j));
            }

            public void updateItemCount(int i, int j)
            {
                sendMessage(SyncQueueItem.obtainMessage(1, i, j));
            }


            
            {
                this$0 = MessageThreadUtil.this;
                callback = mainthreadcallback;
                super();
                mMainThreadRunnable = new _cls1();
            }
        };
    }

    // Unreferenced inner class android/support/v7/util/MessageThreadUtil$1$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        final _cls1 this$1;

        public void run()
        {
            SyncQueueItem syncqueueitem = mQueue.next();
_L6:
            if (syncqueueitem == null)
            {
                break MISSING_BLOCK_LABEL_158;
            }
            syncqueueitem.what;
            JVM INSTR tableswitch 1 3: default 44
        //                       1 86
        //                       2 109
        //                       3 135;
               goto _L1 _L2 _L3 _L4
_L4:
            break MISSING_BLOCK_LABEL_135;
_L2:
            break; /* Loop/switch isn't completed */
_L1:
            Log.e("ThreadUtil", (new StringBuilder()).append("Unsupported message, what=").append(syncqueueitem.what).toString());
_L7:
            syncqueueitem = mQueue.next();
            if (true) goto _L6; else goto _L5
_L5:
            callback.updateItemCount(syncqueueitem.arg1, syncqueueitem.arg2);
              goto _L7
_L3:
            callback.addTile(syncqueueitem.arg1, (TileList.Tile)syncqueueitem.data);
              goto _L7
            callback.removeTile(syncqueueitem.arg1, syncqueueitem.arg2);
              goto _L7
        }

            
            {
                this$1 = _cls1.this;
                super();
            }
    }


    // Unreferenced inner class android/support/v7/util/MessageThreadUtil$2$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        final _cls2 this$1;

        public void run()
        {
            do
            {
                SyncQueueItem syncqueueitem = mQueue.next();
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
                this$1 = _cls2.this;
                super();
            }
    }

}
