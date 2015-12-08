// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package android.support.v4.app:
//            FragmentActivity, FragmentManagerImpl

class this._cls0 extends Handler
{

    final FragmentActivity this$0;

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 34
    //                   2 53;
           goto _L1 _L2 _L3
_L1:
        super.handleMessage(message);
_L5:
        return;
_L2:
        if (!mStopped) goto _L5; else goto _L4
_L4:
        doReallyStop(false);
        return;
_L3:
        onResumeFragments();
        mFragments.execPendingActions();
        return;
    }

    ()
    {
        this$0 = FragmentActivity.this;
        super();
    }
}
