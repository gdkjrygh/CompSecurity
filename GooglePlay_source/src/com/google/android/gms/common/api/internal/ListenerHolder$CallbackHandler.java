// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            ListenerHolder

private final class this._cls0 extends Handler
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
        message = (this._cls0)message.obj;
        obj = ((ListenerHolder) (obj)).mListener;
        if (obj == null)
        {
            message.yListenerFailed();
            return;
        }
        try
        {
            message.istener(obj);
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            message.yListenerFailed();
            throw runtimeexception;
        }
    }

    public (Looper looper)
    {
        this$0 = ListenerHolder.this;
        super(looper);
    }
}
