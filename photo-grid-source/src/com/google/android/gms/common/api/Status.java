// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.bj;
import com.google.android.gms.common.internal.bk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.api:
//            r, x

public final class Status
    implements r, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new x();
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Status e = new Status(16);
    private final int f;
    private final int g;
    private final String h;
    private final PendingIntent i;

    public Status(int j)
    {
        this(j, null);
    }

    Status(int j, int k, String s, PendingIntent pendingintent)
    {
        f = j;
        g = k;
        h = s;
        i = pendingintent;
    }

    public Status(int j, String s)
    {
        this(1, j, s, null);
    }

    public Status(String s)
    {
        this(1, 8, s, null);
    }

    public final Status a()
    {
        return this;
    }

    final PendingIntent b()
    {
        return i;
    }

    public final String c()
    {
        return h;
    }

    final int d()
    {
        return f;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean e()
    {
        return g <= 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof Status)
        {
            if (f == ((Status) (obj = (Status)obj)).f && g == ((Status) (obj)).g && bj.a(h, ((Status) (obj)).h) && bj.a(i, ((Status) (obj)).i))
            {
                return true;
            }
        }
        return false;
    }

    public final int f()
    {
        return g;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(f), Integer.valueOf(g), h, i
        });
    }

    public final String toString()
    {
        bk bk1 = bj.a(this);
        if (h == null) goto _L2; else goto _L1
_L1:
        String s = h;
_L4:
        return bk1.a("statusCode", s).a("resolution", i).toString();
_L2:
        int j = g;
        switch (j)
        {
        default:
            s = (new StringBuilder("unknown status code: ")).append(j).toString();
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
            s = "ERROR";
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

        case 17: // '\021'
            s = "API_NOT_CONNECTED";
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
        x.a(this, parcel, j);
    }

}
