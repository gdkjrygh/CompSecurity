// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.model.Urn;

// Referenced classes of package com.soundcloud.android.ads:
//            VisualAdImpressionOperations

private static final class playerIsExpanding
{

    private final boolean currentTrackIsAnAudioAd;
    private final Urn currentTrackUrn;
    private final boolean isAppInForeground;
    private final boolean playerIsExpanding;





    public (Urn urn, boolean flag, boolean flag1, boolean flag2)
    {
        currentTrackUrn = urn;
        isAppInForeground = flag;
        currentTrackIsAnAudioAd = flag1;
        playerIsExpanding = flag2;
    }
}
