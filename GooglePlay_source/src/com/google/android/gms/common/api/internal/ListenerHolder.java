// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.Preconditions;

public final class ListenerHolder
{
    private final class CallbackHandler extends Handler
    {

        final ListenerHolder this$0;

        public final void handleMessage(Message message)
        {
            boolean flag = true;
            Object obj;
            if (message.what != 1)
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            obj = ListenerHolder.this;
            message = (Notifier)message.obj;
            obj = ((ListenerHolder) (obj)).mListener;
            if (obj == null)
            {
                message.onNotifyListenerFailed();
                return;
            }
            try
            {
                message.notifyListener(obj);
                return;
            }
            catch (RuntimeException runtimeexception)
            {
                message.onNotifyListenerFailed();
                throw runtimeexception;
            }
        }

        public CallbackHandler(Looper looper)
        {
            this$0 = ListenerHolder.this;
            super(looper);
        }
    }

    public static interface Notifier
    {

        public abstract void notifyListener(Object obj);

        public abstract void onNotifyListenerFailed();
    }


    private final CallbackHandler mHandler;
    public volatile Object mListener;

    ListenerHolder(Looper looper, Object obj)
    {
        mHandler = new CallbackHandler(looper);
        mListener = Preconditions.checkNotNull(obj, "Listener must not be null");
    }

    public final void notifyListener(Notifier notifier)
    {
        Preconditions.checkNotNull(notifier, "Notifier must not be null");
        notifier = mHandler.obtainMessage(1, notifier);
        mHandler.sendMessage(notifier);
    }
}
