// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget;

import com.thetransitapp.droid.model.RoutingItinerary;
import com.thetransitapp.droid.model.RoutingLeg;

// Referenced classes of package com.thetransitapp.droid.widget:
//            RoutingDetails

public static interface I
{

    public abstract void onDetailClick(RoutingItinerary routingitinerary);

    public abstract void onLegClick(RoutingLeg routingleg);
}
