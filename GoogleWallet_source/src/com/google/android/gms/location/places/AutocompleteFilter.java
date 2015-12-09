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
//            a

public class AutocompleteFilter
    implements SafeParcelable
{

    public static final a CREATOR = new a();
    final boolean avU;
    final List avV;
    private final Set avW;
    final int mVersionCode;

    AutocompleteFilter(int i, boolean flag, List list)
    {
        mVersionCode = i;
        avU = flag;
        if (list == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list);
        }
        avV = list;
        if (avV.isEmpty())
        {
            avW = Collections.emptySet();
            return;
        } else
        {
            avW = Collections.unmodifiableSet(new HashSet(avV));
            return;
        }
    }

    public int describeContents()
    {
        a a1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof AutocompleteFilter))
            {
                return false;
            }
            obj = (AutocompleteFilter)obj;
            if (!avW.equals(((AutocompleteFilter) (obj)).avW) || avU != ((AutocompleteFilter) (obj)).avU)
            {
                return false;
            }
        }
        return true;
    }

    public final boolean getRestrictToPlaces()
    {
        return avU;
    }

    public int hashCode()
    {
        return kl.hashCode(new Object[] {
            avW, Boolean.valueOf(avU)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a a1 = CREATOR;
        a.a(this, parcel, i);
    }

}
