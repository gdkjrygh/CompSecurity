// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import T;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package android.support.v4.app:
//            FragmentActivity

final class a extends Handler
{

    private FragmentActivity a;

    public final void handleMessage(Message message)
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
        if (!a.mStopped) goto _L5; else goto _L4
_L4:
        a.a(false);
        return;
_L3:
        a.mFragments.n();
        a.mFragments.h();
        return;
    }

    (FragmentActivity fragmentactivity)
    {
        a = fragmentactivity;
        super();
    }
}
