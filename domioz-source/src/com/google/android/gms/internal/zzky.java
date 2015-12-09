// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            hv, zzla, hz

public class zzky
    implements SafeParcelable
{

    public static final hv CREATOR = new hv();
    private final int a;
    private final zzla b;

    zzky(int i, zzla zzla1)
    {
        a = i;
        b = zzla1;
    }

    private zzky(zzla zzla1)
    {
        a = 1;
        b = zzla1;
    }

    public static zzky a(hz hz)
    {
        if (hz instanceof zzla)
        {
            return new zzky((zzla)hz);
        } else
        {
            throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
        }
    }

    final int a()
    {
        return a;
    }

    final zzla b()
    {
        return b;
    }

    public final hz c()
    {
        if (b != null)
        {
            return b;
        } else
        {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        hv.a(this, parcel, i);
    }

}
