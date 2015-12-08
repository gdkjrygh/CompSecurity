// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.location.Location;
import java.lang.reflect.Method;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            WrapperHelper

public class LocationWrapper extends WrapperHelper
{

    static final Method a = a(android/location/Location, "isFromMockProvider", new Class[0]);
    private boolean b;

    LocationWrapper(Location location)
    {
        b = false;
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            location = (Boolean)a(location, a, new Object[0]);
            if (location != null)
            {
                b = location.booleanValue();
            }
        }
    }

    boolean a()
    {
        return b;
    }

}
