// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.model.Urn;

// Referenced classes of package com.soundcloud.android.ads:
//            AdPlayerController

private static class playerUIEventKind
{

    private final boolean isAudioAd;
    private final int playerUIEventKind;
    private final Urn trackUrn;




    public _cls9(boolean flag, Urn urn, int i)
    {
        isAudioAd = flag;
        trackUrn = urn;
        playerUIEventKind = i;
    }
}
