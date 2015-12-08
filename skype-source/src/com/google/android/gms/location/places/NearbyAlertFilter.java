// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.x;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location.places:
//            f, i

public final class NearbyAlertFilter extends f
    implements SafeParcelable
{

    public static final i CREATOR = new i();
    final int a;
    final List b;
    final List c;
    final List d;
    private final Set e;
    private final Set f;
    private final Set g;

    NearbyAlertFilter(int j, List list, List list1, List list2)
    {
        a = j;
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

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
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

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            f, g, e
        });
    }

    public final String toString()
    {
        com.google.android.gms.common.internal.x.a a1 = x.a(this);
        if (!f.isEmpty())
        {
            a1.a("types", f);
        }
        if (!e.isEmpty())
        {
            a1.a("placeIds", e);
        }
        if (!g.isEmpty())
        {
            a1.a("requestedUserDataTypes", g);
        }
        return a1.toString();
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel);
    }

}
