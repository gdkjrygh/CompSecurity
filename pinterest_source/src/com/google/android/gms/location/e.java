// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.location:
//            f

public class e
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    private final int CK;
    int agw;
    int agx;
    long agy;

    public e(int i, int j, int k, long l)
    {
        CK = i;
        agw = j;
        agx = k;
        agy = l;
    }

    private String eB(int i)
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
        if (obj instanceof e)
        {
            if (agw == ((e) (obj = (e)obj)).agw && agx == ((e) (obj)).agx && agy == ((e) (obj)).agy)
            {
                return true;
            }
        }
        return false;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Integer.valueOf(agw), Integer.valueOf(agx), Long.valueOf(agy)
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("LocationStatus[cell status: ").append(eB(agw));
        stringbuilder.append(", wifi status: ").append(eB(agx));
        stringbuilder.append(", elapsed realtime ns: ").append(agy);
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
