// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.x;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location.places.personalized:
//            c

public class PlaceAlias
    implements SafeParcelable
{

    public static final c CREATOR = new c();
    public static final PlaceAlias a = new PlaceAlias(0, "Home");
    public static final PlaceAlias b = new PlaceAlias(0, "Work");
    final int c;
    private final String d;

    PlaceAlias(int i, String s)
    {
        c = i;
        d = s;
    }

    public final String a()
    {
        return d;
    }

    public int describeContents()
    {
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
            return x.a(d, ((PlaceAlias) (obj)).d);
        }
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            d
        });
    }

    public String toString()
    {
        return x.a(this).a("alias", d).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.location.places.personalized.c.a(this, parcel);
    }

}
