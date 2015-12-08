// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.google;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;

class GooglePlayServicesUtilWrapper
{

    GooglePlayServicesUtilWrapper()
    {
    }

    public static int isGooglePlayServicesAvailable(Context context)
    {
        return GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
    }

    public static boolean isUserRecoverableError(int i)
    {
        return GooglePlayServicesUtil.isUserRecoverableError(i);
    }
}
