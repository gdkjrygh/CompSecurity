// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal;

import com.worklight.location.api.WLConfidenceLevel;

// Referenced classes of package com.worklight.location.internal:
//            InternalGeoUtils

static class 
{

    static final int $SwitchMap$com$worklight$location$api$WLConfidenceLevel[];

    static 
    {
        $SwitchMap$com$worklight$location$api$WLConfidenceLevel = new int[WLConfidenceLevel.values().length];
        try
        {
            $SwitchMap$com$worklight$location$api$WLConfidenceLevel[WLConfidenceLevel.LOW.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$worklight$location$api$WLConfidenceLevel[WLConfidenceLevel.MEDIUM.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$worklight$location$api$WLConfidenceLevel[WLConfidenceLevel.HIGH.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
