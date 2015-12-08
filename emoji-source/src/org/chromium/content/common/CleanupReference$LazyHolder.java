// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.common;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;

// Referenced classes of package org.chromium.content.common:
//            CleanupReference

private static class _cls1
{

    static final Handler sHandler = new Handler(ThreadUtils.getUiThreadLooper()) {

        public void handleMessage(Message message)
        {
            Object obj;
            TraceEvent.begin();
            obj = (CleanupReference)message.obj;
            message.what;
            JVM INSTR tableswitch 1 2: default 36
        //                       1 96
        //                       2 109;
               goto _L1 _L2 _L3
_L1:
            Log.e("CleanupReference", (new StringBuilder()).append("Bad message=").append(message.what).toString());
_L6:
            message = ((Message) (CleanupReference.access$100()));
            message;
            JVM INSTR monitorenter ;
_L4:
            obj = (CleanupReference)CleanupReference.access$000().poll();
            if (obj == null)
            {
                break; /* Loop/switch isn't completed */
            }
            CleanupReference.access$300(((CleanupReference) (obj)));
              goto _L4
            obj;
            message;
            JVM INSTR monitorexit ;
            throw obj;
_L2:
            CleanupReference.access$200().add(obj);
            continue; /* Loop/switch isn't completed */
_L3:
            CleanupReference.access$300(((CleanupReference) (obj)));
            if (true) goto _L6; else goto _L5
_L5:
            CleanupReference.access$100().notifyAll();
            message;
            JVM INSTR monitorexit ;
            TraceEvent.end();
            return;
        }

    };


    private _cls1()
    {
    }
}
