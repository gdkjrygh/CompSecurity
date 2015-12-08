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
//            nr, jv

public class nq
    implements SafeParcelable
{

    public static final nr CREATOR = new nr();
    final int CK;
    final boolean ahm;
    final List ahn;
    private final Set aho;

    nq(int i, boolean flag, List list)
    {
        CK = i;
        ahm = flag;
        if (list == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list);
        }
        ahn = list;
        if (ahn.isEmpty())
        {
            aho = Collections.emptySet();
            return;
        } else
        {
            aho = Collections.unmodifiableSet(new HashSet(ahn));
            return;
        }
    }

    public int describeContents()
    {
        nr nr1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof nq))
            {
                return false;
            }
            obj = (nq)obj;
            if (!aho.equals(((nq) (obj)).aho) || ahm != ((nq) (obj)).ahm)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            aho, Boolean.valueOf(ahm)
        });
    }

    public boolean nr()
    {
        return ahm;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        nr nr1 = CREATOR;
        com.google.android.gms.internal.nr.a(this, parcel, i);
    }

}
