// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.party.json;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;

// Referenced classes of package com.spotify.mobile.android.spotlets.party.json:
//            FadeInTransitionJacksonModel, FadeOutTransitionJacksonModel

public class AudioJacksonModel
    implements JacksonModel
{

    public final long fadeInDuration;
    public final long fadeInStartTime;
    public final FadeInTransitionJacksonModel fadeInTransition;
    public final long fadeOutDuration;
    public final long fadeOutStartTime;
    public final FadeOutTransitionJacksonModel fadeOutTransition;
    public final Long overlap;

    public AudioJacksonModel(Long long1, Long long2, FadeInTransitionJacksonModel fadeintransitionjacksonmodel, Long long3, Long long4, FadeOutTransitionJacksonModel fadeouttransitionjacksonmodel, Long long5)
    {
        fadeInDuration = ((Long)Optional.c(long1).a(Long.valueOf(0L))).longValue();
        fadeInStartTime = ((Long)Optional.c(long2).a(Long.valueOf(0L))).longValue();
        fadeInTransition = fadeintransitionjacksonmodel;
        fadeOutDuration = ((Long)Optional.c(long3).a(Long.valueOf(0L))).longValue();
        fadeOutStartTime = ((Long)Optional.c(long4).a(Long.valueOf(0L))).longValue();
        fadeOutTransition = fadeouttransitionjacksonmodel;
        overlap = long5;
    }
}
