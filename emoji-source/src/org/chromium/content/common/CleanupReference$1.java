// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.common;

import android.os.Message;
import android.util.Log;
import java.lang.ref.ReferenceQueue;

// Referenced classes of package org.chromium.content.common:
//            CleanupReference

static final class zyHolder extends Thread
{

    public void run()
    {
_L2:
        CleanupReference cleanupreference = (CleanupReference)CleanupReference.access$000().remove();
        synchronized (CleanupReference.access$100())
        {
            Message.obtain(zyHolder.sHandler, 2, cleanupreference).sendToTarget();
            CleanupReference.access$100().wait(500L);
        }
        continue; /* Loop/switch isn't completed */
        exception1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception1;
        }
        catch (Exception exception)
        {
            Log.e("CleanupReference", "Queue remove exception:", exception);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    zyHolder(String s)
    {
        super(s);
    }
}
