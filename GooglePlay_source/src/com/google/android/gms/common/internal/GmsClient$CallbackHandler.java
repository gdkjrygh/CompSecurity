// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.internal:
//            GmsClient

final class this._cls0 extends Handler
{

    final GmsClient this$0;

    private static void deliverCallbackFailed(Message message)
    {
        message = (this._cls0)message.obj;
        message.DeliverCallbackFailed();
        message.register();
    }

    private static boolean hasCallback(Message message)
    {
        return message.what == 2 || message.what == 1 || message.what == 5 || message.what == 6;
    }

    public final void handleMessage(Message message)
    {
        if (mDisconnectCount.get() != message.arg1)
        {
            if (hasCallback(message))
            {
                deliverCallbackFailed(message);
            }
            return;
        }
        if ((message.what == 1 || message.what == 5 || message.what == 6) && !isConnecting())
        {
            deliverCallbackFailed(message);
            return;
        }
        if (message.what == 3)
        {
            message = new ConnectionResult(message.arg2, null);
            GmsClient.access$100(GmsClient.this).onReportServiceBinding(message);
            onConnectionFailed(message);
            return;
        }
        if (message.what == 4)
        {
            GmsClient.access$200$53d09639(GmsClient.this, 4);
            if (GmsClient.access$300(GmsClient.this) != null)
            {
                GmsClient.access$300(GmsClient.this).onConnectionSuspended(message.arg2);
            }
            onConnectionSuspended(message.arg2);
            GmsClient.access$400(GmsClient.this, 4, 1, null);
            return;
        }
        if (message.what == 2 && !isConnected())
        {
            deliverCallbackFailed(message);
            return;
        }
        if (!hasCallback(message))
        {
            break MISSING_BLOCK_LABEL_305;
        }
        Object obj;
        synchronized ((hasCallback)message.obj)
        {
            obj = ((hasCallback) (message)).istener;
            if (((istener) (message)).allbackDelivered)
            {
                Log.w("GmsClient", (new StringBuilder("Callback proxy ")).append(message).append(" being reused. This is not safe.").toString());
            }
        }
        if (obj != null)
        {
            try
            {
                message.liverCallback(obj);
            }
            catch (RuntimeException runtimeexception)
            {
                message.DeliverCallbackFailed();
                throw runtimeexception;
            }
        } else
        {
            message.DeliverCallbackFailed();
        }
        message;
        JVM INSTR monitorenter ;
        message.allbackDelivered = true;
        message;
        JVM INSTR monitorexit ;
        message.register();
        return;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
        Exception exception1;
        exception1;
        message;
        JVM INSTR monitorexit ;
        throw exception1;
        Log.wtf("GmsClient", (new StringBuilder("Don't know how to handle message: ")).append(message.what).toString(), new Exception());
        return;
    }

    public acks(Looper looper)
    {
        this$0 = GmsClient.this;
        super(looper);
    }
}
