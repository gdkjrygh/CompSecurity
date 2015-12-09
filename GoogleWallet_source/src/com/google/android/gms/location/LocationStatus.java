// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.kl;

// Referenced classes of package com.google.android.gms.location:
//            d

public class LocationStatus
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    public static final int STATUS_INVALID_SCAN = 4;
    public static final int STATUS_IN_PROGRESS = 8;
    public static final int STATUS_LOCATION_DISABLED_IN_SETTINGS = 7;
    public static final int STATUS_NO_INFO_IN_DATABASE = 3;
    public static final int STATUS_SCANS_DISABLED_IN_SETTINGS = 6;
    public static final int STATUS_SUCCESSFUL = 0;
    public static final int STATUS_TIMED_OUT_ON_SCAN = 2;
    public static final int STATUS_UNABLE_TO_QUERY_DATABASE = 5;
    public static final int STATUS_UNKNOWN = 1;
    int atE;
    int atF;
    long atG;
    private final int mVersionCode;

    public LocationStatus(int i, int j, int k, long l)
    {
        mVersionCode = i;
        atE = j;
        atF = k;
        atG = l;
    }

    private static String hw(int i)
    {
        switch (i)
        {
        case 1: // '\001'
        default:
            return "STATUS_UNKNOWN";

        case 0: // '\0'
            return "STATUS_SUCCESSFUL";

        case 2: // '\002'
            return "STATUS_TIMED_OUT_ON_SCAN";

        case 3: // '\003'
            return "STATUS_NO_INFO_IN_DATABASE";

        case 4: // '\004'
            return "STATUS_INVALID_SCAN";

        case 5: // '\005'
            return "STATUS_UNABLE_TO_QUERY_DATABASE";

        case 6: // '\006'
            return "STATUS_SCANS_DISABLED_IN_SETTINGS";

        case 7: // '\007'
            return "STATUS_LOCATION_DISABLED_IN_SETTINGS";

        case 8: // '\b'
            return "STATUS_IN_PROGRESS";
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof LocationStatus)
        {
            if (atE == ((LocationStatus) (obj = (LocationStatus)obj)).atE && atF == ((LocationStatus) (obj)).atF && atG == ((LocationStatus) (obj)).atG)
            {
                return true;
            }
        }
        return false;
    }

    final int getVersionCode()
    {
        return mVersionCode;
    }

    public int hashCode()
    {
        return kl.hashCode(new Object[] {
            Integer.valueOf(atE), Integer.valueOf(atF), Long.valueOf(atG)
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("LocationStatus[cell status: ").append(hw(atE));
        stringbuilder.append(", wifi status: ").append(hw(atF));
        stringbuilder.append(", elapsed realtime ns: ").append(atG);
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

}
