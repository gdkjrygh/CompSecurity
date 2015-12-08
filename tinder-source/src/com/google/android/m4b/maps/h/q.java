// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.h;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.m4b.maps.j.v;
import com.google.android.m4b.maps.k.c;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.h:
//            l, p

public final class q
    implements l, c
{

    public static final android.os.Parcelable.Creator CREATOR = new p();
    public static final q a = new q(0);
    public static final q b = new q(8);
    public static final q c = new q(15);
    public static final q d = new q(16);
    private static q i = new q(14);
    final int e;
    final int f;
    final String g;
    final PendingIntent h;

    public q(int j)
    {
        this(j, null);
    }

    q(int j, int k, String s, PendingIntent pendingintent)
    {
        e = j;
        f = k;
        g = s;
        h = pendingintent;
    }

    public q(int j, String s)
    {
        this(1, j, s, null);
    }

    public q(String s)
    {
        this(1, 8, s, null);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof q)
        {
            if (e == ((q) (obj = (q)obj)).e && f == ((q) (obj)).f && v.a(g, ((q) (obj)).g) && v.a(h, ((q) (obj)).h))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(e), Integer.valueOf(f), g, h
        });
    }

    public final String toString()
    {
        com.google.android.m4b.maps.j.v.a a1 = v.a(this);
        if (g == null) goto _L2; else goto _L1
_L1:
        String s = g;
_L4:
        return a1.a("statusCode", s).a("resolution", h).toString();
_L2:
        int j = f;
        switch (j)
        {
        default:
            s = (new StringBuilder(32)).append("unknown status code: ").append(j).toString();
            break;

        case -1: 
            s = "SUCCESS_CACHE";
            break;

        case 0: // '\0'
            s = "SUCCESS";
            break;

        case 1: // '\001'
            s = "SERVICE_MISSING";
            break;

        case 2: // '\002'
            s = "SERVICE_VERSION_UPDATE_REQUIRED";
            break;

        case 3: // '\003'
            s = "SERVICE_DISABLED";
            break;

        case 4: // '\004'
            s = "SIGN_IN_REQUIRED";
            break;

        case 5: // '\005'
            s = "INVALID_ACCOUNT";
            break;

        case 6: // '\006'
            s = "RESOLUTION_REQUIRED";
            break;

        case 7: // '\007'
            s = "NETWORK_ERROR";
            break;

        case 8: // '\b'
            s = "INTERNAL_ERROR";
            break;

        case 9: // '\t'
            s = "SERVICE_INVALID";
            break;

        case 10: // '\n'
            s = "DEVELOPER_ERROR";
            break;

        case 11: // '\013'
            s = "LICENSE_CHECK_FAILED";
            break;

        case 13: // '\r'
            s = "ERROR_OPERATION_FAILED";
            break;

        case 14: // '\016'
            s = "INTERRUPTED";
            break;

        case 15: // '\017'
            s = "TIMEOUT";
            break;

        case 16: // '\020'
            s = "CANCELED";
            break;

        case 3000: 
            s = "AUTH_API_INVALID_CREDENTIALS";
            break;

        case 3001: 
            s = "AUTH_API_ACCESS_FORBIDDEN";
            break;

        case 3002: 
            s = "AUTH_API_CLIENT_ERROR";
            break;

        case 3003: 
            s = "AUTH_API_SERVER_ERROR";
            break;

        case 3004: 
            s = "AUTH_TOKEN_ERROR";
            break;

        case 3005: 
            s = "AUTH_URL_RESOLUTION";
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        p.a(this, parcel, j);
    }

}
