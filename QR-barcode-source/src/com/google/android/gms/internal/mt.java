// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            mu

public final class mt
    implements SafeParcelable
{

    public static final mu CREATOR = new mu();
    public static final mt aic;
    public static final mt aid;
    public static final mt aie;
    public static final Set aif;
    final int BR;
    final int aig;
    final String uO;

    mt(int i, String s, int j)
    {
        o.aZ(s);
        BR = i;
        uO = s;
        aig = j;
    }

    private static mt y(String s, int i)
    {
        return new mt(0, s, i);
    }

    public int describeContents()
    {
        mu mu1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof mt))
            {
                return false;
            }
            obj = (mt)obj;
            if (!uO.equals(((mt) (obj)).uO) || aig != ((mt) (obj)).aig)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return uO.hashCode();
    }

    public String toString()
    {
        return uO;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        mu mu1 = CREATOR;
        mu.a(this, parcel, i);
    }

    static 
    {
        aic = y("test_type", 1);
        aid = y("trellis_store", 2);
        aie = y("labeled_place", 6);
        aif = Collections.unmodifiableSet(new HashSet(Arrays.asList(new mt[] {
            aic, aid, aie
        })));
    }
}
