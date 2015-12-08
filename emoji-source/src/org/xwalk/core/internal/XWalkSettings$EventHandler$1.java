// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkSettings

class this._cls1 extends Handler
{

    final is._cls0 this$1;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            message = ((Message) (XWalkSettings.access$100(_fld0)));
            break;
        }
        message;
        JVM INSTR monitorenter ;
        XWalkSettings.access$200(_fld0);
        XWalkSettings.access$302(_fld0, false);
        XWalkSettings.access$100(_fld0).notifyAll();
        message;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (Looper looper)
    {
        this$1 = this._cls1.this;
        super(looper);
    }
}
