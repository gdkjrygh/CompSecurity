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
//            IabBackgroundActivity

private static class a extends Handler
{

    private final WeakReference a;

    public void handleMessage(Message message)
    {
        IabBackgroundActivity iabbackgroundactivity = (IabBackgroundActivity)a.get();
        message.what;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 41
    //                   1 50
    //                   2 77;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        if (iabbackgroundactivity != null)
        {
            IabBackgroundActivity.a(iabbackgroundactivity);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (iabbackgroundactivity != null)
        {
            if (IabBackgroundActivity.b(iabbackgroundactivity) == null)
            {
                IabBackgroundActivity.a(iabbackgroundactivity);
            }
            IabBackgroundActivity.b(iabbackgroundactivity).setProgress(message.arg1);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (iabbackgroundactivity != null)
        {
            k.a(iabbackgroundactivity, IabBackgroundActivity.b(iabbackgroundactivity));
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public (IabBackgroundActivity iabbackgroundactivity)
    {
        a = new WeakReference(iabbackgroundactivity);
    }
}
