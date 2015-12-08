// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.x;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location.places:
//            f, k

public final class PlaceFilter extends f
    implements SafeParcelable
{

    public static final k CREATOR = new k();
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
        this(0, a(null), false, a(null), a(null));
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

    public final Set a()
    {
        return h;
    }

    public final Set b()
    {
        return f;
    }

    public final Set c()
    {
        return g;
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
        com.google.android.gms.common.internal.x.a a1 = x.a(this);
        if (!f.isEmpty())
        {
            a1.a("types", f);
        }
        a1.a("requireOpenNow", Boolean.valueOf(c));
        if (!h.isEmpty())
        {
            a1.a("placeIds", h);
        }
        if (!g.isEmpty())
        {
            a1.a("requestedUserDataTypes", g);
        }
        return a1.toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        k.a(this, parcel);
    }

}
