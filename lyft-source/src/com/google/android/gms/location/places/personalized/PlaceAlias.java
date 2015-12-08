// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.location.places.personalized:
//            zzc

public class PlaceAlias
    implements SafeParcelable
{

    public static final zzc CREATOR = new zzc();
    public static final PlaceAlias a = new PlaceAlias(0, "Home");
    public static final PlaceAlias b = new PlaceAlias(0, "Work");
    final int c;
    private final String d;

    PlaceAlias(int i, String s)
    {
        c = i;
        d = s;
    }

    public String a()
    {
        return d;
    }

    public int describeContents()
    {
        zzc zzc1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof PlaceAlias))
        {
            return false;
        } else
        {
            obj = (PlaceAlias)obj;
            return zzt.a(d, ((PlaceAlias) (obj)).d);
        }
    }

    public int hashCode()
    {
        return zzt.a(new Object[] {
            d
        });
    }

    public String toString()
    {
        return zzt.a(this).a("alias", d).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc zzc1 = CREATOR;
        zzc.a(this, parcel, i);
    }

}
