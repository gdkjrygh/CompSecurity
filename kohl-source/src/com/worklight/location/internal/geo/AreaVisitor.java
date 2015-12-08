// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo;

import com.worklight.location.api.geo.WLCircle;
import com.worklight.location.api.geo.WLPolygon;

public interface AreaVisitor
{

    public abstract Object visitCircle(WLCircle wlcircle);

    public abstract Object visitPolygon(WLPolygon wlpolygon);
}
