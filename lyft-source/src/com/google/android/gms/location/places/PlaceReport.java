// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.location.places:
//            zzk

public class PlaceReport
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzk();
    final int a;
    private final String b;
    private final String c;
    private final String d;

    PlaceReport(int i, String s, String s1, String s2)
    {
        a = i;
        b = s;
        c = s1;
        d = s2;
    }

    public static PlaceReport a(String s, String s1)
    {
        return a(s, s1, "unknown");
    }

    public static PlaceReport a(String s, String s1, String s2)
    {
        zzu.a(s);
        zzu.a(s1);
        zzu.a(s2);
        zzu.b(a(s2), "Invalid source");
        return new PlaceReport(1, s, s1, s2);
    }

    private static boolean a(String s)
    {
        byte byte0;
        boolean flag;
        flag = true;
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 5: default 60
    //                   -1436706272: 128
    //                   -1194968642: 114
    //                   -284840886: 100
    //                   -262743844: 156
    //                   1287171955: 142;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        switch (byte0)
        {
        default:
            flag = false;
            // fall through

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            return flag;
        }
_L4:
        if (s.equals("unknown"))
        {
            byte0 = 0;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (s.equals("userReported"))
        {
            byte0 = 1;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (s.equals("inferredGeofencing"))
        {
            byte0 = 2;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (s.equals("inferredRadioSignals"))
        {
            byte0 = 3;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (s.equals("inferredReverseGeocoding"))
        {
            byte0 = 4;
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    public String a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public String c()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PlaceReport)
        {
            if (zzt.a(b, ((PlaceReport) (obj = (PlaceReport)obj)).b) && zzt.a(c, ((PlaceReport) (obj)).c) && zzt.a(d, ((PlaceReport) (obj)).d))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return zzt.a(new Object[] {
            b, c, d
        });
    }

    public String toString()
    {
        com.google.android.gms.common.internal.zzt.zza zza = zzt.a(this);
        zza.a("placeId", b);
        zza.a("tag", c);
        if (!"unknown".equals(d))
        {
            zza.a("source", d);
        }
        return zza.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.a(this, parcel, i);
    }

}
