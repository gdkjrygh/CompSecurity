// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.common.api.CommonStatusCodes;

public final class WearableStatusCodes extends CommonStatusCodes
{

    public static String b(int i)
    {
        switch (i)
        {
        default:
            return CommonStatusCodes.a(i);

        case 4000: 
            return "TARGET_NODE_NOT_CONNECTED";

        case 4001: 
            return "DUPLICATE_LISTENER";

        case 4002: 
            return "UNKNOWN_LISTENER";

        case 4003: 
            return "DATA_ITEM_TOO_LARGE";

        case 4004: 
            return "INVALID_TARGET_NODE";

        case 4005: 
            return "ASSET_UNAVAILABLE";
        }
    }
}
