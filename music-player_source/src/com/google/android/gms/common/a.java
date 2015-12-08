// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.PendingIntent;
import com.google.android.gms.internal.gq;
import com.google.android.gms.internal.gr;

public final class a
{

    public static final a a = new a(0, null);
    private final PendingIntent b;
    private final int c;

    public a(int i, PendingIntent pendingintent)
    {
        c = i;
        b = pendingintent;
    }

    public final String toString()
    {
        gr gr1 = gq.a(this);
        c;
        JVM INSTR tableswitch 0 15: default 88
    //                   0 128
    //                   1 134
    //                   2 140
    //                   3 146
    //                   4 152
    //                   5 158
    //                   6 164
    //                   7 170
    //                   8 176
    //                   9 182
    //                   10 188
    //                   11 194
    //                   12 88
    //                   13 200
    //                   14 206
    //                   15 212;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L1 _L14 _L15 _L16
_L1:
        String s = (new StringBuilder("unknown status code ")).append(c).toString();
_L18:
        return gr1.a("statusCode", s).a("resolution", b).toString();
_L2:
        s = "SUCCESS";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "SERVICE_MISSING";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "SERVICE_VERSION_UPDATE_REQUIRED";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "SERVICE_DISABLED";
        continue; /* Loop/switch isn't completed */
_L6:
        s = "SIGN_IN_REQUIRED";
        continue; /* Loop/switch isn't completed */
_L7:
        s = "INVALID_ACCOUNT";
        continue; /* Loop/switch isn't completed */
_L8:
        s = "RESOLUTION_REQUIRED";
        continue; /* Loop/switch isn't completed */
_L9:
        s = "NETWORK_ERROR";
        continue; /* Loop/switch isn't completed */
_L10:
        s = "INTERNAL_ERROR";
        continue; /* Loop/switch isn't completed */
_L11:
        s = "SERVICE_INVALID";
        continue; /* Loop/switch isn't completed */
_L12:
        s = "DEVELOPER_ERROR";
        continue; /* Loop/switch isn't completed */
_L13:
        s = "LICENSE_CHECK_FAILED";
        continue; /* Loop/switch isn't completed */
_L14:
        s = "CANCELED";
        continue; /* Loop/switch isn't completed */
_L15:
        s = "TIMEOUT";
        continue; /* Loop/switch isn't completed */
_L16:
        s = "INTERRUPTED";
        if (true) goto _L18; else goto _L17
_L17:
    }

}
