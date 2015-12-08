// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            BrightcoveShowHideController

static final class a extends Handler
{

    private final WeakReference a;

    public final void handleMessage(Message message)
    {
        if (message.what == 1)
        {
            message = (BrightcoveShowHideController)a.get();
            if (message != null)
            {
                message.hide();
            }
        }
    }

    (BrightcoveShowHideController brightcoveshowhidecontroller)
    {
        a = new WeakReference(brightcoveshowhidecontroller);
    }
}
