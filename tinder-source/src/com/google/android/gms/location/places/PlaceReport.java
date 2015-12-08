// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.t;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location.places:
//            n

public class PlaceReport
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new n();
    final int a;
    final String b;
    final String c;
    final String d;

    PlaceReport(int i, String s, String s1, String s2)
    {
        a = i;
        b = s;
        c = s1;
        d = s2;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PlaceReport)
        {
            if (t.a(b, ((PlaceReport) (obj = (PlaceReport)obj)).b) && t.a(c, ((PlaceReport) (obj)).c) && t.a(d, ((PlaceReport) (obj)).d))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, c, d
        });
    }

    public String toString()
    {
        com.google.android.gms.common.internal.t.a a1 = t.a(this);
        a1.a("placeId", b);
        a1.a("tag", c);
        if (!"unknown".equals(d))
        {
            a1.a("source", d);
        }
        return a1.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        n.a(this, parcel);
    }

}
