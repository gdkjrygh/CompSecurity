// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.t;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.personalized:
//            d

public class PlaceUserData
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    final int a;
    final String b;
    final String c;
    final List d;
    final List e;
    final List f;

    PlaceUserData(int i, String s, String s1, List list, List list1, List list2)
    {
        a = i;
        b = s;
        c = s1;
        d = list;
        e = list1;
        f = list2;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlaceUserData))
            {
                return false;
            }
            obj = (PlaceUserData)obj;
            if (!b.equals(((PlaceUserData) (obj)).b) || !c.equals(((PlaceUserData) (obj)).c) || !d.equals(((PlaceUserData) (obj)).d) || !e.equals(((PlaceUserData) (obj)).e) || !f.equals(((PlaceUserData) (obj)).f))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, c, d, e, f
        });
    }

    public String toString()
    {
        return t.a(this).a("accountName", b).a("placeId", c).a("testDataImpls", d).a("placeAliases", e).a("hereContents", f).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.location.places.personalized.d.a(this, parcel);
    }

}
