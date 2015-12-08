// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.an;
import com.google.android.gms.common.internal.ao;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            kh

public class zzpo
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new kh();
    final int a;
    final String b;
    final String c;
    final List d;
    final List e;
    final int f;

    zzpo(int i, String s, String s1, List list, List list1, int j)
    {
        a = i;
        b = s;
        c = s1;
        d = list;
        e = list1;
        f = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof zzpo))
            {
                return false;
            }
            obj = (zzpo)obj;
            if (!an.a(b, ((zzpo) (obj)).b) || !an.a(c, ((zzpo) (obj)).c) || !an.a(d, ((zzpo) (obj)).d) || !an.a(e, ((zzpo) (obj)).e) || !an.a(Integer.valueOf(f), Integer.valueOf(((zzpo) (obj)).f)))
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
        return an.a(this).a("description", b).a("placeId", c).a("placeTypes", d).a("substrings", e).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kh.a(this, parcel);
    }

}
