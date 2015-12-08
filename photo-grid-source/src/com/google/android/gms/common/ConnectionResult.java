// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.bj;
import com.google.android.gms.common.internal.bk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common:
//            i

public final class ConnectionResult
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    public static final ConnectionResult a = new ConnectionResult();
    final int b;
    private final int c;
    private final PendingIntent d;
    private final String e;

    private ConnectionResult()
    {
        this(0, null, (byte)0);
    }

    ConnectionResult(int j, int k, PendingIntent pendingintent, String s)
    {
        b = j;
        c = k;
        d = pendingintent;
        e = s;
    }

    public ConnectionResult(int j, PendingIntent pendingintent)
    {
        this(j, pendingintent, (byte)0);
    }

    private ConnectionResult(int j, PendingIntent pendingintent, byte byte0)
    {
        this(1, j, pendingintent, null);
    }

    static String a(int j)
    {
        switch (j)
        {
        case 12: // '\f'
        default:
            return (new StringBuilder("UNKNOWN_ERROR_CODE(")).append(j).append(")").toString();

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

        case 16: // '\020'
            return "API_UNAVAILABLE";

        case 17: // '\021'
            return "SIGN_IN_FAILED";

        case 18: // '\022'
            return "SERVICE_UPDATING";

        case 19: // '\023'
            return "SERVICE_MISSING_PERMISSION";
        }
    }

    public final void a(Activity activity, int j)
    {
        if (!a())
        {
            return;
        } else
        {
            activity.startIntentSenderForResult(d.getIntentSender(), j, null, 0, 0, 0);
            return;
        }
    }

    public final boolean a()
    {
        return c != 0 && d != null;
    }

    public final boolean b()
    {
        return c == 0;
    }

    public final int c()
    {
        return c;
    }

    public final PendingIntent d()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String e()
    {
        return e;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ConnectionResult))
            {
                return false;
            }
            obj = (ConnectionResult)obj;
            if (c != ((ConnectionResult) (obj)).c || !bj.a(d, ((ConnectionResult) (obj)).d) || !bj.a(e, ((ConnectionResult) (obj)).e))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(c), d, e
        });
    }

    public final String toString()
    {
        return bj.a(this).a("statusCode", a(c)).a("resolution", d).a("message", e).toString();
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
