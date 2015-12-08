// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl;

import com.digby.localpoint.sdk.core.ILPID;
import java.util.Locale;

// Referenced classes of package com.digby.localpoint.sdk.core.impl:
//            LPLocation

public static class locationId
    implements ILPID
{

    private final long locationId;

    public String getValue()
    {
        return String.format(Locale.US, "%d", new Object[] {
            Long.valueOf(locationId)
        });
    }

    public (long l)
    {
        locationId = l;
    }
}
