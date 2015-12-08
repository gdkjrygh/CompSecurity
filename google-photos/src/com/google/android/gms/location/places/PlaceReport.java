// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import kct;
import lhx;

public class PlaceReport
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lhx();
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public PlaceReport(int i, String s, String s1, String s2)
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
            if (c.b(b, ((PlaceReport) (obj = (PlaceReport)obj)).b) && c.b(c, ((PlaceReport) (obj)).c) && c.b(d, ((PlaceReport) (obj)).d))
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
        kct kct1 = c.b(this);
        kct1.a("placeId", b);
        kct1.a("tag", c);
        if (!"unknown".equals(d))
        {
            kct1.a("source", d);
        }
        return kct1.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        lhx.a(this, parcel);
    }

}
