// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.common:
//            zzb

public final class ConnectionResult
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    public static final ConnectionResult zzVG = new ConnectionResult(0, null);
    private final PendingIntent mPendingIntent;
    final int zzCY;
    private final int zzTS;

    ConnectionResult(int i, int j, PendingIntent pendingintent)
    {
        zzCY = i;
        zzTS = j;
        mPendingIntent = pendingintent;
    }

    public ConnectionResult(int i, PendingIntent pendingintent)
    {
        this(1, i, pendingintent);
    }

    static String getStatusString(int i)
    {
        switch (i)
        {
        case 12: // '\f'
        default:
            return (new StringBuilder()).append("UNKNOWN_ERROR_CODE(").append(i).append(")").toString();

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
            if (zzTS != ((ConnectionResult) (obj)).zzTS || !zzt.equal(mPendingIntent, ((ConnectionResult) (obj)).mPendingIntent))
            {
                return false;
            }
        }
        return true;
    }

    public int getErrorCode()
    {
        return zzTS;
    }

    public PendingIntent getResolution()
    {
        return mPendingIntent;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            Integer.valueOf(zzTS), mPendingIntent
        });
    }

    public boolean isSuccess()
    {
        return zzTS == 0;
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("statusCode", getStatusString(zzTS)).zzg("resolution", mPendingIntent).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

}
