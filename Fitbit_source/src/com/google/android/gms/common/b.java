// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.internal.ak;

public final class b
{

    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 10;
    public static final int l = 11;
    public static final int m = 13;
    public static final int n = 14;
    public static final int o = 15;
    public static final int p = 16;
    public static final int q = 1500;
    public static final b r = new b(0, null);
    private final PendingIntent s;
    private final int t;

    public b(int i1, PendingIntent pendingintent)
    {
        t = i1;
        s = pendingintent;
    }

    private String e()
    {
        switch (t)
        {
        case 12: // '\f'
        default:
            return (new StringBuilder()).append("unknown status code ").append(t).toString();

        case 0: // '\0'
            return "SUCCESS";

        case 1: // '\001'
            return "SERVICE_MISSING";

        case 2: // '\002'
            return "SERVICE_VERSION_UPDATE_REQUIRED";

        case 3: // '\003'
            return "SERVICE_DISABLED";

        case 4: // '\004'
            return "SIGN_IN_REQUIRED";

        case 5: // '\005'
            return "INVALID_ACCOUNT";

        case 6: // '\006'
            return "RESOLUTION_REQUIRED";

        case 7: // '\007'
            return "NETWORK_ERROR";

        case 8: // '\b'
            return "INTERNAL_ERROR";

        case 9: // '\t'
            return "SERVICE_INVALID";

        case 10: // '\n'
            return "DEVELOPER_ERROR";

        case 11: // '\013'
            return "LICENSE_CHECK_FAILED";

        case 13: // '\r'
            return "CANCELED";

        case 14: // '\016'
            return "TIMEOUT";

        case 15: // '\017'
            return "INTERRUPTED";
        }
    }

    public void a(Activity activity, int i1)
        throws android.content.IntentSender.SendIntentException
    {
        if (!a())
        {
            return;
        } else
        {
            activity.startIntentSenderForResult(s.getIntentSender(), i1, null, 0, 0, 0);
            return;
        }
    }

    public boolean a()
    {
        return t != 0 && s != null;
    }

    public boolean b()
    {
        return t == 0;
    }

    public int c()
    {
        return t;
    }

    public PendingIntent d()
    {
        return s;
    }

    public String toString()
    {
        return ak.a(this).a("statusCode", e()).a("resolution", s).toString();
    }

}
