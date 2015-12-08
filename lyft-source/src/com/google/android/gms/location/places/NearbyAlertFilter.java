// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location.places:
//            zza, zzd

public final class NearbyAlertFilter extends zza
    implements SafeParcelable
{

    public static final zzd CREATOR = new zzd();
    final int a;
    final List b;
    final List c;
    final List d;
    private final Set e;
    private final Set f;
    private final Set g;

    NearbyAlertFilter(int i, List list, List list1, List list2)
    {
        a = i;
        if (list1 == null)
        {
            list1 = Collections.emptyList();
        } else
        {
            list1 = Collections.unmodifiableList(list1);
        }
        c = list1;
        if (list2 == null)
        {
            list1 = Collections.emptyList();
        } else
        {
            list1 = Collections.unmodifiableList(list2);
        }
        d = list1;
        if (list == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list);
        }
        b = list;
        f = a(c);
        g = a(d);
        e = a(b);
    }

    public static NearbyAlertFilter a(Collection collection, Collection collection1, Collection collection2)
    {
        if ((collection == null || collection.isEmpty()) && (collection1 == null || collection1.isEmpty()) && (collection2 == null || collection2.isEmpty()))
        {
            throw new IllegalArgumentException("NearbyAlertFilters must contain at least onePlaceId, PlaceType, or UserDataType to match results with.");
        } else
        {
            return new NearbyAlertFilter(0, a(collection), a(collection1), a(collection2));
        }
    }

    public int describeContents()
    {
        zzd zzd1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof NearbyAlertFilter))
            {
                return false;
            }
            obj = (NearbyAlertFilter)obj;
            if (!f.equals(((NearbyAlertFilter) (obj)).f) || !g.equals(((NearbyAlertFilter) (obj)).g) || !e.equals(((NearbyAlertFilter) (obj)).e))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzt.a(new Object[] {
            f, g, e
        });
    }

    public String toString()
    {
        com.google.android.gms.common.internal.zzt.zza zza1 = zzt.a(this);
        if (!f.isEmpty())
        {
            zza1.a("types", f);
        }
        if (!e.isEmpty())
        {
            zza1.a("placeIds", e);
        }
        if (!g.isEmpty())
        {
            zza1.a("requestedUserDataTypes", g);
        }
        return zza1.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd zzd1 = CREATOR;
        zzd.a(this, parcel, i);
    }

}
