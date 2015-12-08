// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;

public final class ak
{

    public static Status a(int i)
    {
        i;
        JVM INSTR tableswitch 4000 4005: default 40
    //                   4000 55
    //                   4001 61
    //                   4002 67
    //                   4003 73
    //                   4004 79
    //                   4005 85;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        String s = b.a(i);
_L9:
        return new Status(i, s);
_L2:
        s = "TARGET_NODE_NOT_CONNECTED";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "DUPLICATE_LISTENER";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "UNKNOWN_LISTENER";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "DATA_ITEM_TOO_LARGE";
        continue; /* Loop/switch isn't completed */
_L6:
        s = "INVALID_TARGET_NODE";
        continue; /* Loop/switch isn't completed */
_L7:
        s = "ASSET_UNAVAILABLE";
        if (true) goto _L9; else goto _L8
_L8:
    }
}
