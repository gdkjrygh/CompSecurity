// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.CapabilityInfo;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzh

public class CapabilityInfoParcelable
    implements SafeParcelable, CapabilityInfo
{

    public static final android.os.Parcelable.Creator CREATOR = new zzh();
    final int a;
    private final Object b = new Object();
    private final String c;
    private final List d;
    private Set e;

    CapabilityInfoParcelable(int i, String s, List list)
    {
        a = i;
        c = s;
        d = list;
        e = null;
    }

    public String a()
    {
        return c;
    }

    public List b()
    {
        return d;
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
            if (c == null ? ((CapabilityInfoParcelable) (obj)).c != null : !c.equals(((CapabilityInfoParcelable) (obj)).c))
            {
                return false;
            }
            if (d == null ? ((CapabilityInfoParcelable) (obj)).d != null : !d.equals(((CapabilityInfoParcelable) (obj)).d))
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
        if (c != null)
        {
            i = c.hashCode();
        } else
        {
            i = 0;
        }
        if (d != null)
        {
            j = d.hashCode();
        }
        return (i + k * 31) * 31 + j;
    }

    public String toString()
    {
        return (new StringBuilder()).append("CapabilityInfo{").append(c).append(", ").append(d).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.a(this, parcel, i);
    }

}
