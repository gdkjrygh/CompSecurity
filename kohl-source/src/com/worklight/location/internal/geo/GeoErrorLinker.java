// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo;

import com.worklight.location.api.geo.WLGeoFailureCallback;
import com.worklight.location.internal.GenericErrorLinker;
import com.worklight.location.internal.ICallbackExecutor;
import java.util.List;

public final class GeoErrorLinker extends GenericErrorLinker
    implements WLGeoFailureCallback
{

    public GeoErrorLinker(List list, ICallbackExecutor icallbackexecutor)
    {
        super(list, icallbackexecutor);
    }
}
