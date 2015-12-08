// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

// Referenced classes of package com.google.android.gms.cast.internal:
//            k, j

public class DeviceStatus
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new k();
    final int a;
    double b;
    boolean c;
    int d;
    ApplicationMetadata e;
    int f;

    public DeviceStatus()
    {
        this(3, (0.0D / 0.0D), false, -1, null, -1);
    }

    DeviceStatus(int i, double d1, boolean flag, int l, ApplicationMetadata applicationmetadata, int i1)
    {
        a = i;
        b = d1;
        c = flag;
        d = l;
        e = applicationmetadata;
        f = i1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof DeviceStatus))
            {
                return false;
            }
            obj = (DeviceStatus)obj;
            if (b != ((DeviceStatus) (obj)).b || c != ((DeviceStatus) (obj)).c || d != ((DeviceStatus) (obj)).d || !j.a(e, ((DeviceStatus) (obj)).e) || f != ((DeviceStatus) (obj)).f)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            Double.valueOf(b), Boolean.valueOf(c), Integer.valueOf(d), e, Integer.valueOf(f)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        k.a(this, parcel, i);
    }

}
