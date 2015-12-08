// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.party.json;

import com.spotify.mobile.android.cosmos.JacksonModel;

// Referenced classes of package com.spotify.mobile.android.spotlets.party.json:
//            TransitionCurveJacksonModel

public class FadeOutTransitionJacksonModel
    implements JacksonModel
{

    public final TransitionCurveJacksonModel fadeOutCurve;
    public final Double originalTempo;
    public final Double overlap;
    public final String uri;

    public FadeOutTransitionJacksonModel(TransitionCurveJacksonModel transitioncurvejacksonmodel, Double double1, Double double2, String s)
    {
        fadeOutCurve = transitioncurvejacksonmodel;
        originalTempo = double1;
        overlap = double2;
        uri = s;
    }
}
