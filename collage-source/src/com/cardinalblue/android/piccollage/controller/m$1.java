// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.graphics.PointF;
import java.util.Comparator;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            m

static final class 
    implements Comparator
{

    public int a(PointF pointf, PointF pointf1)
    {
        return (int)(pointf.y - pointf1.y);
    }

    public int compare(Object obj, Object obj1)
    {
        return a((PointF)obj, (PointF)obj1);
    }

    ()
    {
    }
}
