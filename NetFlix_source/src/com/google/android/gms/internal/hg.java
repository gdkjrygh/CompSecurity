// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            hh, fo

public final class hg
    implements SafeParcelable
{

    public static final hh CREATOR = new hh();
    final List OA;
    private final String OB;
    private final boolean OC;
    private final Set OD;
    final int xH;

    hg(int i, List list, String s, boolean flag)
    {
        xH = i;
        if (list == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list);
        }
        OA = list;
        list = s;
        if (s == null)
        {
            list = "";
        }
        OB = list;
        OC = flag;
        if (OA.isEmpty())
        {
            OD = Collections.emptySet();
            return;
        } else
        {
            OD = Collections.unmodifiableSet(new HashSet(OA));
            return;
        }
    }

    public int describeContents()
    {
        hh hh1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof hg))
            {
                return false;
            }
            obj = (hg)obj;
            if (!OD.equals(((hg) (obj)).OD) || OC != ((hg) (obj)).OC)
            {
                return false;
            }
        }
        return true;
    }

    public String hW()
    {
        return OB;
    }

    public boolean hX()
    {
        return OC;
    }

    public int hashCode()
    {
        return fo.hashCode(new Object[] {
            OD, Boolean.valueOf(OC)
        });
    }

    public String toString()
    {
        return fo.e(this).a("types", OD).a("requireOpenNow", Boolean.valueOf(OC)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        hh hh1 = CREATOR;
        hh.a(this, parcel, i);
    }

}
