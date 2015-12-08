// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.location.places.a;
import java.util.Arrays;
import java.util.Collections;
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
                if (!t.a(Integer.valueOf(b), Integer.valueOf(((SubstringEntity) (obj)).b)) || !t.a(Integer.valueOf(c), Integer.valueOf(((SubstringEntity) (obj)).c)))
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
            return t.a(this).a("offset", Integer.valueOf(b)).a("length", Integer.valueOf(c)).toString();
        }

        public void writeToParcel(Parcel parcel, int l)
        {
            com.google.android.gms.location.places.internal.j.a(this, parcel);
        }


        public SubstringEntity(int l, int i1, int j1)
        {
            a = l;
            b = i1;
            c = j1;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.location.places.internal.a();
    private static final List k = Collections.emptyList();
    final int a;
    final String b;
    final String c;
    final List d;
    final List e;
    final int f;
    final String g;
    final List h;
    final String i;
    final List j;

    AutocompletePredictionEntity(int l, String s, List list, int i1, String s1, List list1, String s2, 
            List list2, String s3, List list3)
    {
        a = l;
        c = s;
        d = list;
        f = i1;
        b = s1;
        e = list1;
        g = s2;
        h = list2;
        i = s3;
        j = list3;
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
            if (!t.a(c, ((AutocompletePredictionEntity) (obj)).c) || !t.a(d, ((AutocompletePredictionEntity) (obj)).d) || !t.a(Integer.valueOf(f), Integer.valueOf(((AutocompletePredictionEntity) (obj)).f)) || !t.a(b, ((AutocompletePredictionEntity) (obj)).b) || !t.a(e, ((AutocompletePredictionEntity) (obj)).e) || !t.a(g, ((AutocompletePredictionEntity) (obj)).g) || !t.a(h, ((AutocompletePredictionEntity) (obj)).h) || !t.a(i, ((AutocompletePredictionEntity) (obj)).i) || !t.a(j, ((AutocompletePredictionEntity) (obj)).j))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            c, d, Integer.valueOf(f), b, e, g, h, i, j
        });
    }

    public String toString()
    {
        return t.a(this).a("placeId", c).a("placeTypes", d).a("fullText", b).a("fullTextMatchedSubstrings", e).a("primaryText", g).a("primaryTextMatchedSubstrings", h).a("secondaryText", i).a("secondaryTextMatchedSubstrings", j).toString();
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        com.google.android.gms.location.places.internal.a.a(this, parcel);
    }

}
