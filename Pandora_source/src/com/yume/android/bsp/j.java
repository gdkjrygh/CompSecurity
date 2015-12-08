// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.bsp;

import android.os.Handler;
import android.os.Message;
import com.yume.android.sdk.YuMeException;
import com.yume.android.sdk.YuMeSDKBSPInterface;
import java.util.Date;

// Referenced classes of package com.yume.android.bsp:
//            YuMeBSPInterfaceImpl, i, p, f, 
//            c

final class j extends Handler
{

    private i a;

    j(i k)
    {
        a = k;
        super();
    }

    public final void handleMessage(Message message)
    {
        Object obj;
        if (!YuMeBSPInterfaceImpl.b)
        {
            a.a.a("YuMe BSP seems to be DeInitialized - Ignoring Get Playlist Response.");
            message.obj = null;
            return;
        }
        obj = (f)message.obj;
        if (obj != null)
        {
            a.a(((f) (obj)));
        }
        message.what;
        JVM INSTR tableswitch 0 2: default 76
    //                   0 76
    //                   1 149
    //                   2 82;
           goto _L1 _L1 _L2 _L3
_L1:
        message.obj = null;
        return;
_L3:
        if (a.c != null)
        {
            a.c.clearExpired(new Date());
        }
        if (obj != null)
        {
            try
            {
                YuMeBSPInterfaceImpl.a.YuMeSDKBSP_GetPlaylistComplete(((f) (obj)).d(), ((f) (obj)).h(), ((f) (obj)).g(), ((f) (obj)).f());
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
                YuMeBSPInterfaceImpl.a.YuMeSDKBSP_GetPlaylistComplete(((f) (obj)).d(), ((f) (obj)).h(), null, 0L);
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
