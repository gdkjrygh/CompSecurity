// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.location;

import android.location.Location;
import com.google.android.apps.wallet.base.java.System;

public class LocationHelper
{

    private final System mSystem;

    LocationHelper(System system)
    {
        mSystem = system;
    }

    public final boolean isLocationTimeRecent(Location location, long l)
    {
        if (location != null)
        {
            System system = mSystem;
            if (System.currentTimeMillis() - location.getTime() < l)
            {
                return true;
            }
        }
        return false;
    }
}
