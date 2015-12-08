// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.transport;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.NrdProxy;

// Referenced classes of package com.netflix.mediaclient.javabridge.transport:
//            NativeTransport

private class this._cls0 extends Handler
{

    final NativeTransport this$0;

    public void handleMessage(Message message)
    {
        if (message == null)
        {
            Log.e("nf-NativeTransport", "Received null message!");
            return;
        }
        if (!(message.obj instanceof String))
        {
            Log.e("nf-NativeTransport", "Received obj is NOT string in message!");
            return;
        }
        message = (String)message.obj;
        if (Log.isLoggable("nf-NativeTransport", 3))
        {
            Log.d("nf-NativeTransport", (new StringBuilder()).append("Received message: ").append(message).toString());
        }
        if (NativeTransport.access$000(NativeTransport.this) != null)
        {
            NativeTransport.access$000(NativeTransport.this).processUpdate(message);
            return;
        } else
        {
            Log.e("nf-NativeTransport", "Unable to publish event, na not available");
            return;
        }
    }

    public (Looper looper)
    {
        this$0 = NativeTransport.this;
        super(looper);
    }
}
