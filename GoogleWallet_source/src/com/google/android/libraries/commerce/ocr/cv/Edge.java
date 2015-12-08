// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.cv;

import android.graphics.PointF;
import com.google.common.base.Objects;

public class Edge
{

    private final PointF direction;
    private final PointF origin;

    public Edge(PointF pointf, PointF pointf1)
    {
        origin = pointf;
        direction = pointf1;
    }

    public PointF getDirection()
    {
        return direction;
    }

    public PointF getOrigin()
    {
        return origin;
    }

    public String toString()
    {
        return Objects.toStringHelper(this).add("origin.x", origin.x).add("origin.y", origin.y).add("direction.x", direction.x).add("direction.y", direction.y).toString();
    }
}
