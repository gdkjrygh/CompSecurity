// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.an;
import com.google.android.gms.common.internal.ao;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location.places:
//            e

public final class PlaceFilter
    implements SafeParcelable
{

    public static final e CREATOR = new e();
    final int a;
    final List b;
    final boolean c;
    final List d;
    final List e;
    private final Set f;
    private final Set g;
    private final Set h;

    public PlaceFilter()
    {
        this((byte)0);
    }

    private PlaceFilter(byte byte0)
    {
        this('\0');
    }

    private PlaceFilter(char c1)
    {
        this(0, Collections.emptyList(), false, Collections.emptyList(), Collections.emptyList());
    }

    PlaceFilter(int i, List list, boolean flag, List list1, List list2)
    {
        a = i;
        if (list == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list);
        }
        b = list;
        c = flag;
        if (list2 == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list2);
        }
        d = list;
        if (list1 == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list1);
        }
        e = list;
        f = a(b);
        g = a(d);
        h = a(e);
    }

    private static Set a(List list)
    {
        if (list == null || list.isEmpty())
        {
            return Collections.emptySet();
        } else
        {
            return Collections.unmodifiableSet(new HashSet(list));
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
            if (!(obj instanceof PlaceFilter))
            {
                return false;
            }
            obj = (PlaceFilter)obj;
            if (!f.equals(((PlaceFilter) (obj)).f) || c != ((PlaceFilter) (obj)).c || !g.equals(((PlaceFilter) (obj)).g) || !h.equals(((PlaceFilter) (obj)).h))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            f, Boolean.valueOf(c), g, h
        });
    }

    public final String toString()
    {
        ao ao1 = an.a(this);
        if (!f.isEmpty())
        {
            ao1.a("types", f);
        }
        ao1.a("requireOpenNow", Boolean.valueOf(c));
        if (!h.isEmpty())
        {
            ao1.a("placeIds", h);
        }
        if (!g.isEmpty())
        {
            ao1.a("requestedUserDataTypes", g);
        }
        return ao1.toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.location.places.e.a(this, parcel);
    }

}
