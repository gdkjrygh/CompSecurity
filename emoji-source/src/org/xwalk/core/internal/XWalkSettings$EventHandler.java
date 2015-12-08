// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import org.chromium.base.ThreadUtils;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkSettings

private class this._cls0
{

    static final boolean $assertionsDisabled;
    private static final int UPDATE_WEBKIT_PREFERENCES = 0;
    private Handler mHandler;
    final XWalkSettings this$0;

    private void updateWebkitPreferencesLocked()
    {
        if (!$assertionsDisabled && !Thread.holdsLock(XWalkSettings.access$100(XWalkSettings.this)))
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_27;
        while (true) 
        {
            do
            {
                return;
            } while (XWalkSettings.access$400(XWalkSettings.this) == 0L || mHandler == null);
            if (ThreadUtils.runningOnUiThread())
            {
                XWalkSettings.access$200(XWalkSettings.this);
                return;
            }
            if (!XWalkSettings.access$300(XWalkSettings.this))
            {
                XWalkSettings.access$302(XWalkSettings.this, true);
                mHandler.sendMessage(Message.obtain(null, 0));
                try
                {
                    while (XWalkSettings.access$300(XWalkSettings.this)) 
                    {
                        XWalkSettings.access$100(XWalkSettings.this).wait();
                    }
                }
                catch (InterruptedException interruptedexception)
                {
                    return;
                }
            }
        }
    }

    void bindUiThread()
    {
        if (mHandler != null)
        {
            return;
        } else
        {
            mHandler = new Handler(ThreadUtils.getUiThreadLooper()) {

                final XWalkSettings.EventHandler this$1;

                public void handleMessage(Message message)
                {
                    switch (message.what)
                    {
                    default:
                        return;

                    case 0: // '\0'
                        message = ((Message) (XWalkSettings.access$100(this$0)));
                        break;
                    }
                    message;
                    JVM INSTR monitorenter ;
                    XWalkSettings.access$200(this$0);
                    XWalkSettings.access$302(this$0, false);
                    XWalkSettings.access$100(this$0).notifyAll();
                    message;
                    JVM INSTR monitorexit ;
                    return;
                    Exception exception;
                    exception;
                    message;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

            
            {
                this$1 = XWalkSettings.EventHandler.this;
                super(looper);
            }
            };
            return;
        }
    }

    void maybeRunOnUiThreadBlocking(Runnable runnable)
    {
        if (mHandler != null)
        {
            ThreadUtils.runOnUiThreadBlocking(runnable);
        }
    }

    static 
    {
        boolean flag;
        if (!org/xwalk/core/internal/XWalkSettings.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }


    _cls1.this._cls1()
    {
        this$0 = XWalkSettings.this;
        super();
    }
}
