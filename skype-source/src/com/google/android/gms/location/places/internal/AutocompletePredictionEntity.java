// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.location.places.a;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            a, j

public class AutocompletePredictionEntity
    implements SafeParcelable, a
{
    public static class SubstringEntity
        implements SafeParcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new j();
        final int a;
        final int b;
        final int c;

        public int describeContents()
        {
            return 0;
        }

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (!(obj instanceof SubstringEntity))
                {
                    return false;
                }
                obj = (SubstringEntity)obj;
                if (!x.a(Integer.valueOf(b), Integer.valueOf(((SubstringEntity) (obj)).b)) || !x.a(Integer.valueOf(c), Integer.valueOf(((SubstringEntity) (obj)).c)))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return Arrays.hashCode(new Object[] {
                Integer.valueOf(b), Integer.valueOf(c)
            });
        }

        public String toString()
        {
            return x.a(this).a("offset", Integer.valueOf(b)).a("length", Integer.valueOf(c)).toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            com.google.android.gms.location.places.internal.j.a(this, parcel);
        }


        public SubstringEntity(int i, int k, int l)
        {
            a = i;
            b = k;
            c = l;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.location.places.internal.a();
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

    public final Object a()
    {
        return this;
    }

    public int describeContents()
    {
        return 0;
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
            if (!x.a(b, ((AutocompletePredictionEntity) (obj)).b) || !x.a(c, ((AutocompletePredictionEntity) (obj)).c) || !x.a(d, ((AutocompletePredictionEntity) (obj)).d) || !x.a(e, ((AutocompletePredictionEntity) (obj)).e) || !x.a(Integer.valueOf(f), Integer.valueOf(((AutocompletePredictionEntity) (obj)).f)))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, c, d, e, Integer.valueOf(f)
        });
    }

    public String toString()
    {
        return x.a(this).a("description", b).a("placeId", c).a("placeTypes", d).a("substrings", e).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.location.places.internal.a.a(this, parcel);
    }

}
