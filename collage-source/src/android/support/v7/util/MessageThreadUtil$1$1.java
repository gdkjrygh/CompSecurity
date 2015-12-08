// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.util;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

// Referenced classes of package android.support.v7.util:
//            MessageThreadUtil

class this._cls1
    implements Runnable
{

    final QueueItem.arg2 this$1;

    public void run()
    {
        QueueItem queueitem = ueue.next();
_L6:
        if (queueitem == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        queueitem.what;
        JVM INSTR tableswitch 1 3: default 44
    //                   1 86
    //                   2 109
    //                   3 135;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_135;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        Log.e("ThreadUtil", (new StringBuilder()).append("Unsupported message, what=").append(queueitem.what).toString());
_L7:
        queueitem = ueue.next();
        if (true) goto _L6; else goto _L5
_L5:
        callback.updateItemCount(queueitem.arg1, queueitem.arg2);
          goto _L7
_L3:
        callback.addTile(queueitem.arg1, (QueueItem.arg1)queueitem.data);
          goto _L7
        callback.removeTile(queueitem.arg1, queueitem.arg2);
          goto _L7
    }

    <init>()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class android/support/v7/util/MessageThreadUtil$1

/* anonymous class */
    class MessageThreadUtil._cls1
        implements ThreadUtil.MainThreadCallback
    {

        private static final int ADD_TILE = 2;
        private static final int REMOVE_TILE = 3;
        private static final int UPDATE_ITEM_COUNT = 1;
        private final Handler mMainThreadHandler = new Handler(Looper.getMainLooper());
        private Runnable mMainThreadRunnable;
        private final MessageThreadUtil.MessageQueue mQueue = new MessageThreadUtil.MessageQueue();
        final MessageThreadUtil this$0;
        final ThreadUtil.MainThreadCallback val$callback;

        private void sendMessage(MessageThreadUtil.SyncQueueItem syncqueueitem)
        {
            mQueue.sendMessage(syncqueueitem);
            mMainThreadHandler.post(mMainThreadRunnable);
        }

        public void addTile(int i, TileList.Tile tile)
        {
            sendMessage(MessageThreadUtil.SyncQueueItem.obtainMessage(2, i, tile));
        }

        public void removeTile(int i, int j)
        {
            sendMessage(MessageThreadUtil.SyncQueueItem.obtainMessage(3, i, j));
        }

        public void updateItemCount(int i, int j)
        {
            sendMessage(MessageThreadUtil.SyncQueueItem.obtainMessage(1, i, j));
        }


            
            {
                this$0 = final_messagethreadutil;
                callback = ThreadUtil.MainThreadCallback.this;
                super();
                mMainThreadRunnable = new MessageThreadUtil._cls1._cls1();
            }
    }

}
