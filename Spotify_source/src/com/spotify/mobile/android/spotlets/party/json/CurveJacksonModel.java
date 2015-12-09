// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.party.json;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;
import java.util.ArrayList;
import java.util.List;

public class CurveJacksonModel
    implements JacksonModel
{

    public final List controlPoints;
    public final double endPoint;
    public final double startPoint;

    public CurveJacksonModel(Double double1, Double double2, List list)
    {
        startPoint = ((Double)ctz.a(double1)).doubleValue();
        endPoint = ((Double)ctz.a(double2)).doubleValue();
        controlPoints = (List)Optional.c(list).a(new ArrayList());
    }
}
