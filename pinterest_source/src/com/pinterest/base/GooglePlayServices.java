// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.base;

import com.google.android.gms.common.GooglePlayServicesUtil;

// Referenced classes of package com.pinterest.base:
//            Application

public class GooglePlayServices
{

    public GooglePlayServices()
    {
    }

    public static boolean isAvailable()
    {
        return GooglePlayServicesUtil.isGooglePlayServicesAvailable(Application.context()) == 0;
    }
}
