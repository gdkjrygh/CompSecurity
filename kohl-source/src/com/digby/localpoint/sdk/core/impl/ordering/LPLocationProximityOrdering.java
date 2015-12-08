// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl.ordering;

import android.content.Context;
import android.location.Location;
import com.digby.localpoint.sdk.core.ILPLocation;
import com.digby.localpoint.sdk.core.ILPOrdering;
import com.digby.localpoint.sdk.core.util.LPGeoFence;
import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.controller.impl.DigbyController;
import com.digby.mm.android.library.exception.LPArgumentException;
import com.digby.mm.android.library.geoshape.IGeoShape;
import com.digby.mm.android.library.utils.ILocationHelper;

public class LPLocationProximityOrdering
    implements ILPOrdering
{
    public static final class SortDirection extends Enum
    {

        private static final SortDirection $VALUES[];
        public static final SortDirection ASCENDING;
        public static final SortDirection DESCENDING;

        public static SortDirection valueOf(String s)
        {
            return (SortDirection)Enum.valueOf(com/digby/localpoint/sdk/core/impl/ordering/LPLocationProximityOrdering$SortDirection, s);
        }

        public static SortDirection[] values()
        {
            return (SortDirection[])$VALUES.clone();
        }

        static 
        {
            ASCENDING = new SortDirection("ASCENDING", 0);
            DESCENDING = new SortDirection("DESCENDING", 1);
            $VALUES = (new SortDirection[] {
                ASCENDING, DESCENDING
            });
        }

        private SortDirection(String s, int i)
        {
            super(s, i);
        }
    }


    private final Location referenceLocation;
    private final SortDirection sortDirection;

    public LPLocationProximityOrdering(Context context)
    {
        this(DigbyController.getInstance(context).getLocationHelper().getBestCachedLocation());
    }

    public LPLocationProximityOrdering(Context context, SortDirection sortdirection)
    {
        this(DigbyController.getInstance(context).getLocationHelper().getBestCachedLocation(), sortdirection);
    }

    public LPLocationProximityOrdering(Location location)
    {
        this(location, SortDirection.ASCENDING);
    }

    public LPLocationProximityOrdering(Location location, SortDirection sortdirection)
    {
        referenceLocation = location;
        sortDirection = sortdirection;
    }

    public int compare(Object obj, Object obj1)
    {
        if (!(obj instanceof ILPLocation) || !(obj1 instanceof ILPLocation))
        {
            throw new LPArgumentException("Ordering can only apply to objects of type ILPLocation");
        }
        obj = (ILPLocation)obj;
        obj1 = (ILPLocation)obj1;
        obj = Float.valueOf((new LPGeoFence(((ILPLocation) (obj)))).getGeoShape().distanceFromLocation(referenceLocation));
        obj1 = Float.valueOf((new LPGeoFence(((ILPLocation) (obj1)))).getGeoShape().distanceFromLocation(referenceLocation));
        static class _cls1
        {

            static final int $SwitchMap$com$digby$localpoint$sdk$core$impl$ordering$LPLocationProximityOrdering$SortDirection[];

            static 
            {
                $SwitchMap$com$digby$localpoint$sdk$core$impl$ordering$LPLocationProximityOrdering$SortDirection = new int[SortDirection.values().length];
                try
                {
                    $SwitchMap$com$digby$localpoint$sdk$core$impl$ordering$LPLocationProximityOrdering$SortDirection[SortDirection.DESCENDING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        _cls1..SwitchMap.com.digby.localpoint.sdk.core.impl.ordering.LPLocationProximityOrdering.SortDirection[sortDirection.ordinal()];
        JVM INSTR tableswitch 1 1: default 112
    //                   1 124;
           goto _L1 _L2
_L1:
        int i = ((Float) (obj)).compareTo(((Float) (obj1)));
        if (i <= 0) goto _L4; else goto _L3
_L3:
        return 1;
_L2:
        i = ((Float) (obj1)).compareTo(((Float) (obj)));
        if (i <= 0)
        {
            return i >= 0 ? 0 : -1;
        }
        if (true) goto _L3; else goto _L4
_L4:
        return i >= 0 ? 0 : -1;
    }
}
