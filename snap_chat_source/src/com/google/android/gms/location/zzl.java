// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

// Referenced classes of package com.google.android.gms.location:
//            zzm

public class zzl
    implements SafeParcelable
{

    public static final zzm CREATOR = new zzm();
    private final int zzFG;
    int zzamw;
    int zzamx;
    long zzamy;

    public zzl(int i, int j, int k, long l)
    {
        zzFG = i;
        zzamw = j;
        zzamx = k;
        zzamy = l;
    }

    private String zzfp(int i)
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
        if (obj instanceof zzl)
        {
            if (zzamw == ((zzl) (obj = (zzl)obj)).zzamw && zzamx == ((zzl) (obj)).zzamx && zzamy == ((zzl) (obj)).zzamy)
            {
                return true;
            }
        }
        return false;
    }

    int getVersionCode()
    {
        return zzFG;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            Integer.valueOf(zzamw), Integer.valueOf(zzamx), Long.valueOf(zzamy)
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("LocationStatus[cell status: ").append(zzfp(zzamw));
        stringbuilder.append(", wifi status: ").append(zzfp(zzamx));
        stringbuilder.append(", elapsed realtime ns: ").append(zzamy);
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzm.zza(this, parcel, i);
    }

}
