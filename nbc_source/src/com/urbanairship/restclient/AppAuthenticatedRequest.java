// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.restclient;

import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.UAirship;

// Referenced classes of package com.urbanairship.restclient:
//            Request

public class AppAuthenticatedRequest extends Request
{

    public AppAuthenticatedRequest(String s, String s1)
    {
        super(s, s1);
        s1 = UAirship.shared().getAirshipConfigOptions();
        s = s1.getAppKey();
        s1 = s1.getAppSecret();
        if (s != null && s1 != null)
        {
            setPreemptiveAuth(s, s1);
        }
    }
}
