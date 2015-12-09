// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.bsp;

import android.os.Handler;
import android.os.Message;
import com.yume.android.sdk.YuMeException;
import com.yume.android.sdk.YuMeSDKBSPInterface;

// Referenced classes of package com.yume.android.bsp:
//            YuMeBSPInterfaceImpl, i, p, f

final class k extends Handler
{

    private i a;

    k(i j)
    {
        a = j;
        super();
    }

    public final void handleMessage(Message message)
    {
        Object obj;
        if (!YuMeBSPInterfaceImpl.b)
        {
            a.a.a("YuMe BSP seems to be DeInitialized - Ignoring Send Tracker Response.");
            message.obj = null;
            return;
        }
        obj = (f)message.obj;
        message.what;
        JVM INSTR tableswitch 0 2: default 64
    //                   0 64
    //                   1 101
    //                   2 70;
           goto _L1 _L1 _L2 _L3
_L1:
        message.obj = null;
        return;
_L3:
        if (obj != null)
        {
            try
            {
                YuMeBSPInterfaceImpl.a.YuMeSDKBSP_SendTrackerComplete(((f) (obj)).d(), ((f) (obj)).h());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((YuMeException) (obj)).printStackTrace();
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (obj != null)
        {
            try
            {
                YuMeBSPInterfaceImpl.a.YuMeSDKBSP_SendTrackerComplete(((f) (obj)).d(), ((f) (obj)).h());
            }
            catch (YuMeException yumeexception)
            {
                yumeexception.printStackTrace();
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
