// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            mk

public final class mj
    implements SafeParcelable
{

    public static final mk CREATOR = new mk();
    final int BR;
    final List afr;
    private final String afs;
    private final boolean aft;
    final List afu;
    final List afv;
    private final Set afw;
    private final Set afx;
    private final Set afy;

    mj(int i, List list, String s, boolean flag, List list1, List list2)
    {
        BR = i;
        if (list == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list);
        }
        afr = list;
        list = s;
        if (s == null)
        {
            list = "";
        }
        afs = list;
        aft = flag;
        if (list1 == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list1);
        }
        afu = list;
        if (list2 == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list2);
        }
        afv = list;
        afw = f(afr);
        afx = f(afu);
        afy = f(afv);
    }

    private static Set f(List list)
    {
        if (list.isEmpty())
        {
            return Collections.emptySet();
        } else
        {
            return Collections.unmodifiableSet(new HashSet(list));
        }
    }

    public int describeContents()
    {
        mk mk1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof mj))
            {
                return false;
            }
            obj = (mj)obj;
            if (!afw.equals(((mj) (obj)).afw) || aft != ((mj) (obj)).aft || !afx.equals(((mj) (obj)).afx) || !afy.equals(((mj) (obj)).afy))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            afw, Boolean.valueOf(aft), afx, afy
        });
    }

    public String mi()
    {
        return afs;
    }

    public boolean mj()
    {
        return aft;
    }

    public String toString()
    {
        return n.h(this).a("types", afw).a("placeIds", afy).a("requireOpenNow", Boolean.valueOf(aft)).a("requestedUserDataTypes", afx).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        mk mk1 = CREATOR;
        mk.a(this, parcel, i);
    }

}
