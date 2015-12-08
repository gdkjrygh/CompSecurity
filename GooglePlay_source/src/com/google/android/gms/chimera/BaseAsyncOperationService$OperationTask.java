// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.chimera;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.service.OperationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.gms.chimera:
//            BaseAsyncOperationService, AsyncOperation

protected final class mId
    implements Runnable
{

    private final int mId;
    private final Intent mIntent;
    final AsyncOperation mOperation;
    final BaseAsyncOperationService this$0;

    public final void run()
    {
        Message message;
        Object obj;
        long l;
        try
        {
            mOperation.execute(BaseAsyncOperationService.this);
        }
        catch (OperationException operationexception)
        {
            Log.e(mName, operationexception.getMessage(), operationexception);
        }
        catch (RemoteException remoteexception) { }
        catch (RuntimeException runtimeexception)
        {
            handleRuntimeException(runtimeexception);
            new Status(8);
        }
        BaseAsyncOperationService.access$000(BaseAsyncOperationService.this).lock();
        l = TimeUnit.MILLISECONDS.toNanos(mKeepAliveMs);
_L3:
        if (mId != BaseAsyncOperationService.access$100(BaseAsyncOperationService.this)) goto _L2; else goto _L1
_L1:
        if (l > 0L)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        message = Message.obtain();
        message.arg1 = mId;
        mHandler.dispatchMessage(message);
_L2:
        BaseAsyncOperationService.access$000(BaseAsyncOperationService.this).unlock();
        return;
        l = BaseAsyncOperationService.access$200(BaseAsyncOperationService.this).awaitNanos(l);
          goto _L3
        obj;
        Thread.currentThread().interrupt();
        BaseAsyncOperationService.access$000(BaseAsyncOperationService.this).unlock();
        return;
        obj;
        BaseAsyncOperationService.access$000(BaseAsyncOperationService.this).unlock();
        throw obj;
    }

    public (AsyncOperation asyncoperation, Intent intent, int i)
    {
        this$0 = BaseAsyncOperationService.this;
        super();
        mOperation = asyncoperation;
        mIntent = intent;
        mId = i;
    }
}
