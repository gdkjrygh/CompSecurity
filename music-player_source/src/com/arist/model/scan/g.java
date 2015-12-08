// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.scan;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.arist.model.scan:
//            MusicScanProgressView

final class g extends Handler
{

    final MusicScanProgressView a;

    g(MusicScanProgressView musicscanprogressview)
    {
        a = musicscanprogressview;
        super();
    }

    public final void handleMessage(Message message)
    {
        message = a;
        message.a = ((MusicScanProgressView) (message)).a + 2.0F;
        message = a;
        message.a = ((MusicScanProgressView) (message)).a % 360F;
        a.invalidate();
        if (!a.f)
        {
            a.h.sendEmptyMessageDelayed(0, 15L);
            return;
        }
        if (a.f && a.a != 270F)
        {
            a.h.sendEmptyMessageDelayed(0, 15L);
            return;
        } else
        {
            a.f = false;
            return;
        }
    }
}
