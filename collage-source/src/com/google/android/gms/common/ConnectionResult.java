// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.y;

// Referenced classes of package com.google.android.gms.common:
//            i

public final class ConnectionResult
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    public static final ConnectionResult a = new ConnectionResult(0, null);
    final int b;
    private final int c;
    private final PendingIntent d;

    ConnectionResult(int j, int k, PendingIntent pendingintent)
    {
        b = j;
        c = k;
        d = pendingintent;
    }

    public ConnectionResult(int j, PendingIntent pendingintent)
    {
        this(1, j, pendingintent);
    }

    static String a(int j)
    {
        switch (j)
        {
        case 12: // '\f'
        default:
            return (new StringBuilder()).append("UNKNOWN_ERROR_CODE(").append(j).append(")").toString();

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
        }
    }

    public void a(Activity activity, int j)
        throws android.content.IntentSender.SendIntentException
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

    public boolean a()
    {
        return c != 0 && d != null;
    }

    public boolean b()
    {
        return c == 0;
    }

    public int c()
    {
        return c;
    }

    public PendingIntent d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ConnectionResult))
            {
                return false;
            }
            obj = (ConnectionResult)obj;
            if (c != ((ConnectionResult) (obj)).c || !y.a(d, ((ConnectionResult) (obj)).d))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return y.a(new Object[] {
            Integer.valueOf(c), d
        });
    }

    public String toString()
    {
        return y.a(this).a("statusCode", a(c)).a("resolution", d).toString();
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
