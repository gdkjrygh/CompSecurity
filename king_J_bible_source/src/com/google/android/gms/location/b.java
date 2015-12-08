// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fo;

// Referenced classes of package com.google.android.gms.location:
//            c

public class b
    implements SafeParcelable
{

    public static final c CREATOR = new c();
    int Oh;
    int Oi;
    long Oj;
    private final int xH;

    b(int i, int j, int k, long l)
    {
        xH = i;
        Oh = j;
        Oi = k;
        Oj = l;
    }

    private String by(int i)
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
        if (obj instanceof b)
        {
            if (Oh == ((b) (obj = (b)obj)).Oh && Oi == ((b) (obj)).Oi && Oj == ((b) (obj)).Oj)
            {
                return true;
            }
        }
        return false;
    }

    int getVersionCode()
    {
        return xH;
    }

    public int hashCode()
    {
        return fo.hashCode(new Object[] {
            Integer.valueOf(Oh), Integer.valueOf(Oi), Long.valueOf(Oj)
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("LocationStatus[cell status: ").append(by(Oh));
        stringbuilder.append(", wifi status: ").append(by(Oi));
        stringbuilder.append(", elapsed realtime ns: ").append(Oj);
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
