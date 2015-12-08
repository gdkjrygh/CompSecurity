// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Message;
import com.cardinalblue.android.b.k;
import java.lang.ref.WeakReference;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            StickersActivity

private static class a extends Handler
{

    private final WeakReference a;

    public void handleMessage(Message message)
    {
        StickersActivity stickersactivity = (StickersActivity)a.get();
        message.what;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 41
    //                   1 50
    //                   2 77;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        if (stickersactivity != null)
        {
            StickersActivity.e(stickersactivity);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (stickersactivity != null)
        {
            if (StickersActivity.f(stickersactivity) == null)
            {
                StickersActivity.e(stickersactivity);
            }
            StickersActivity.f(stickersactivity).setProgress(message.arg1);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (stickersactivity != null)
        {
            k.a(stickersactivity, StickersActivity.f(stickersactivity));
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public (StickersActivity stickersactivity)
    {
        a = new WeakReference(stickersactivity);
    }
}
