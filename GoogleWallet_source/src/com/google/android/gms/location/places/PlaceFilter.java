// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.kl;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location.places:
//            d

public final class PlaceFilter
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    final List avV;
    private final Set avW;
    private final String awd;
    private final boolean awe;
    final List awf;
    final List awg;
    private final Set awh;
    private final Set awi;
    final int mVersionCode;

    PlaceFilter(int i, List list, String s, boolean flag, List list1, List list2)
    {
        mVersionCode = i;
        if (list == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list);
        }
        avV = list;
        list = s;
        if (s == null)
        {
            list = "";
        }
        awd = list;
        awe = flag;
        if (list1 == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list1);
        }
        awf = list;
        if (list2 == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list2);
        }
        awg = list;
        avW = j(avV);
        awh = j(awf);
        awi = j(awg);
    }

    private static Set j(List list)
    {
        if (list.isEmpty())
        {
            return Collections.emptySet();
        } else
        {
            return Collections.unmodifiableSet(new HashSet(list));
        }
    }

    public final int describeContents()
    {
        d d1 = CREATOR;
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
            if (!avW.equals(((PlaceFilter) (obj)).avW) || awe != ((PlaceFilter) (obj)).awe || !awh.equals(((PlaceFilter) (obj)).awh) || !awi.equals(((PlaceFilter) (obj)).awi))
            {
                return false;
            }
        }
        return true;
    }

    public final boolean getRequireOpenNow()
    {
        return awe;
    }

    public final String getTextQuery()
    {
        return awd;
    }

    public final int hashCode()
    {
        return kl.hashCode(new Object[] {
            avW, Boolean.valueOf(awe), awh, awi
        });
    }

    public final String toString()
    {
        return kl.j(this).a("types", avW).a("placeIds", awi).a("requireOpenNow", Boolean.valueOf(awe)).a("requestedUserDataTypes", awh).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        d d1 = CREATOR;
        d.a(this, parcel, i);
    }

}
