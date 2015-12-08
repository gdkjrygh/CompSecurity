// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api.geo;

import com.worklight.location.internal.AcquisitionCallback;

// Referenced classes of package com.worklight.location.api.geo:
//            WLGeoPosition

public interface WLGeoCallback
    extends AcquisitionCallback
{

    public abstract void execute(WLGeoPosition wlgeoposition);
}
