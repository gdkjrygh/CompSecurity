// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.video;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.spotify.mobile.android.util.Assertion;
import fll;

// Referenced classes of package com.spotify.mobile.android.spotlets.video:
//            LegacyAdsVideoPlayerService

final class a extends Handler
{

    private LegacyAdsVideoPlayerService a;

    public final void handleMessage(Message message)
    {
        long l;
        switch (message.what)
        {
        default:
            Assertion.a((new StringBuilder("Unexpected message ")).append(message.what).toString());
            return;

        case 1: // '\001'
            l = a.g();
            break;
        }
        a.d.a(l);
        LegacyAdsVideoPlayerService.a(a, l);
        sendMessageDelayed(obtainMessage(1), 1000L - l % 1000L);
    }

    (LegacyAdsVideoPlayerService legacyadsvideoplayerservice, Looper looper)
    {
        a = legacyadsvideoplayerservice;
        super(looper);
    }
}
