// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;


// Referenced classes of package com.google.android.gms.common:
//            GooglePlayServicesUtil

public class GoogleApiAvailability
{

    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static final GoogleApiAvailability zzVI = new GoogleApiAvailability();

    GoogleApiAvailability()
    {
    }

    static 
    {
        GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }
}
