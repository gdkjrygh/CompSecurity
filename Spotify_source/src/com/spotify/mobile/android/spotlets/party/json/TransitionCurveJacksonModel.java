// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.party.json;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;
import java.util.ArrayList;
import java.util.List;

public class TransitionCurveJacksonModel
    implements JacksonModel
{

    public final List fadeCurves;
    public final String id;
    public final Double powerCoeff;

    public TransitionCurveJacksonModel(String s, double d, List list)
    {
        id = (String)ctz.a(s);
        powerCoeff = Double.valueOf(d);
        fadeCurves = (List)Optional.c(list).a(new ArrayList());
    }
}
