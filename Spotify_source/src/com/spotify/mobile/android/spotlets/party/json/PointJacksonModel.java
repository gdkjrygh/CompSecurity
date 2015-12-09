// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.party.json;

import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;

public class PointJacksonModel
    implements JacksonModel
{

    public final double x;
    public final double y;

    public PointJacksonModel(Double double1, Double double2)
    {
        x = ((Double)ctz.a(double1)).doubleValue();
        y = ((Double)ctz.a(double2)).doubleValue();
    }
}
