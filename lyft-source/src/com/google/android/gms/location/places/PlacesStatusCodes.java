// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzu;

public class PlacesStatusCodes extends CommonStatusCodes
{

    public static Status a(int i, String s)
    {
        zzu.a(s);
        return new Status(i, s);
    }

    public static String b(int i)
    {
        switch (i)
        {
        default:
            return CommonStatusCodes.a(i);

        case 9000: 
            return "PLACES_API_QUOTA_FAILED";

        case 9001: 
            return "PLACES_API_USAGE_LIMIT_EXCEEDED";

        case 9002: 
            return "PLACES_API_KEY_INVALID";

        case 9003: 
            return "PLACES_API_ACCESS_NOT_CONFIGURED";

        case 9004: 
            return "PLACES_API_INVALID_ARGUMENT";

        case 9005: 
            return "PLACES_API_RATE_LIMIT_EXCEEDED";

        case 9006: 
            return "PLACES_API_DEVICE_RATE_LIMIT_EXCEEDED";

        case 9007: 
            return "PLACES_API_KEY_EXPIRED";
        }
    }

    public static Status c(int i)
    {
        return a(i, b(i));
    }
}
