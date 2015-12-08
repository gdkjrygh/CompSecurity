// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo;

import com.worklight.location.api.WLAcquisitionFailureCallbacksConfiguration;
import com.worklight.location.api.geo.WLGeoError;
import com.worklight.location.api.geo.WLGeoFailureCallback;
import com.worklight.location.internal.AbstractAcquisitionError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ChainGeoFailureCallback
    implements WLGeoFailureCallback
{

    private List failureCallbacks;

    public ChainGeoFailureCallback(List list)
    {
        if (list == null)
        {
            failureCallbacks = Collections.emptyList();
            return;
        } else
        {
            failureCallbacks = new ArrayList(list);
            return;
        }
    }

    public void execute(WLGeoError wlgeoerror)
    {
        Iterator iterator = failureCallbacks.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WLAcquisitionFailureCallbacksConfiguration wlacquisitionfailurecallbacksconfiguration = (WLAcquisitionFailureCallbacksConfiguration)iterator.next();
            if (wlacquisitionfailurecallbacksconfiguration != null && wlacquisitionfailurecallbacksconfiguration.getGeoFailureCallback() != null)
            {
                wlacquisitionfailurecallbacksconfiguration.getGeoFailureCallback().execute(wlgeoerror);
            }
        } while (true);
    }

    public volatile void execute(AbstractAcquisitionError abstractacquisitionerror)
    {
        execute((WLGeoError)abstractacquisitionerror);
    }
}
