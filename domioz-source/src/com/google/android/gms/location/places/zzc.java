// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.an;
import com.google.android.gms.common.internal.ao;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location.places:
//            d, PlaceFilter

public final class zzc
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    private final int a;
    private final int b;
    private final int c;
    private final PlaceFilter d;

    zzc(int i, int j, int k, PlaceFilter placefilter)
    {
        a = i;
        b = j;
        c = k;
        d = placefilter;
    }

    public final int a()
    {
        return a;
    }

    public final int b()
    {
        return b;
    }

    public final int c()
    {
        return c;
    }

    public final PlaceFilter d()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof zzc))
            {
                return false;
            }
            obj = (zzc)obj;
            if (b != ((zzc) (obj)).b || c != ((zzc) (obj)).c || !d.equals(((zzc) (obj)).d))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(b), Integer.valueOf(c)
        });
    }

    public final String toString()
    {
        return an.a(this).a("transitionTypes", Integer.valueOf(b)).a("loiteringTimeMillis", Integer.valueOf(c)).a("placeFilter", d).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.location.places.d.a(this, parcel, i);
    }

}
