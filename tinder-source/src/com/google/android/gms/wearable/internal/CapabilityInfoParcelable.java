// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.b;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ba

public class CapabilityInfoParcelable
    implements SafeParcelable, b
{

    public static final android.os.Parcelable.Creator CREATOR = new ba();
    final int a;
    final String b;
    final List c;
    private final Object d = new Object();
    private Set e;

    CapabilityInfoParcelable(int i, String s, List list)
    {
        a = i;
        b = s;
        c = list;
        e = null;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (CapabilityInfoParcelable)obj;
            if (a != ((CapabilityInfoParcelable) (obj)).a)
            {
                return false;
            }
            if (b == null ? ((CapabilityInfoParcelable) (obj)).b != null : !b.equals(((CapabilityInfoParcelable) (obj)).b))
            {
                return false;
            }
            if (c == null ? ((CapabilityInfoParcelable) (obj)).c != null : !c.equals(((CapabilityInfoParcelable) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = 0;
        int k = a;
        int i;
        if (b != null)
        {
            i = b.hashCode();
        } else
        {
            i = 0;
        }
        if (c != null)
        {
            j = c.hashCode();
        }
        return (i + k * 31) * 31 + j;
    }

    public String toString()
    {
        return (new StringBuilder("CapabilityInfo{")).append(b).append(", ").append(c).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ba.a(this, parcel);
    }

}
