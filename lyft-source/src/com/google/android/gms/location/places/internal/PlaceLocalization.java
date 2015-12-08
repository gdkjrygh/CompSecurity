// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzn

public final class PlaceLocalization
    implements SafeParcelable
{

    public static final zzn CREATOR = new zzn();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;

    public PlaceLocalization(int i, String s, String s1, String s2, String s3, List list)
    {
        a = i;
        b = s;
        c = s1;
        d = s2;
        e = s3;
        f = list;
    }

    public static PlaceLocalization a(String s, String s1, String s2, String s3, List list)
    {
        return new PlaceLocalization(0, s, s1, s2, s3, list);
    }

    public int describeContents()
    {
        zzn zzn1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlaceLocalization))
            {
                return false;
            }
            obj = (PlaceLocalization)obj;
            if (!zzt.a(b, ((PlaceLocalization) (obj)).b) || !zzt.a(c, ((PlaceLocalization) (obj)).c) || !zzt.a(d, ((PlaceLocalization) (obj)).d) || !zzt.a(e, ((PlaceLocalization) (obj)).e) || !zzt.a(f, ((PlaceLocalization) (obj)).f))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzt.a(new Object[] {
            b, c, d, e
        });
    }

    public String toString()
    {
        return zzt.a(this).a("name", b).a("address", c).a("internationalPhoneNumber", d).a("regularOpenHours", e).a("attributions", f).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzn zzn1 = CREATOR;
        zzn.a(this, parcel, i);
    }

}
