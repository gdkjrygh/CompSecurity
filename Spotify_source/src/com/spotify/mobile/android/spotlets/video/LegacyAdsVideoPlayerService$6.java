// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.video;


// Referenced classes of package com.spotify.mobile.android.spotlets.video:
//            LegacyAdsVideoPlayerService

final class a
    implements Runnable
{

    private int a;
    private LegacyAdsVideoPlayerService b;

    public final void run()
    {
        if (LegacyAdsVideoPlayerService.d(b).equals(ayerState.a))
        {
            int i = a;
            LegacyAdsVideoPlayerService.e(b);
            b.stopSelf(a);
        }
    }

    ayerState(LegacyAdsVideoPlayerService legacyadsvideoplayerservice, int i)
    {
        b = legacyadsvideoplayerservice;
        a = i;
        super();
    }
}
