// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.places.AutocompletePrediction;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zza

public class AutocompletePredictionEntity
    implements SafeParcelable, AutocompletePrediction
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    final int a;
    final String b;
    final String c;
    final List d;
    final List e;
    final int f;

    AutocompletePredictionEntity(int i, String s, String s1, List list, List list1, int j)
    {
        a = i;
        b = s;
        c = s1;
        d = list;
        e = list1;
        f = j;
    }

    public static AutocompletePredictionEntity a(String s, String s1, List list, List list1, int i)
    {
        return new AutocompletePredictionEntity(0, (String)zzu.a(s), s1, list, list1, i);
    }

    public Object a()
    {
        return e();
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public List d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public AutocompletePrediction e()
    {
        return this;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof AutocompletePredictionEntity))
            {
                return false;
            }
            obj = (AutocompletePredictionEntity)obj;
            if (!zzt.a(b, ((AutocompletePredictionEntity) (obj)).b) || !zzt.a(c, ((AutocompletePredictionEntity) (obj)).c) || !zzt.a(d, ((AutocompletePredictionEntity) (obj)).d) || !zzt.a(e, ((AutocompletePredictionEntity) (obj)).e) || !zzt.a(Integer.valueOf(f), Integer.valueOf(((AutocompletePredictionEntity) (obj)).f)))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzt.a(new Object[] {
            b, c, d, e, Integer.valueOf(f)
        });
    }

    public String toString()
    {
        return zzt.a(this).a("description", b).a("placeId", c).a("placeTypes", d).a("substrings", e).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.a(this, parcel, i);
    }

}
