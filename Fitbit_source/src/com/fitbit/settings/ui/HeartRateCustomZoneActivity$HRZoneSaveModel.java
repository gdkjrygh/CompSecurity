// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import java.io.Serializable;

// Referenced classes of package com.fitbit.settings.ui:
//            HeartRateCustomZoneActivity

static final class 
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    boolean enabledCustomZone;
    int lowerLimit;
    int upperLimit;

    public void a( )
    {
        enabledCustomZone = .enabledCustomZone();
        upperLimit = .upperLimit();
        lowerLimit = .lowerLimit();
    }

    ()
    {
    }
}
