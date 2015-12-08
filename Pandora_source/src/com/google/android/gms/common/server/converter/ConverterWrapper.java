// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.server.converter:
//            zza, StringToIntConverter

public class ConverterWrapper
    implements SafeParcelable
{

    public static final zza CREATOR = new zza();
    private final StringToIntConverter zzUs;
    private final int zzzH;

    ConverterWrapper(int i, StringToIntConverter stringtointconverter)
    {
        zzzH = i;
        zzUs = stringtointconverter;
    }

    private ConverterWrapper(StringToIntConverter stringtointconverter)
    {
        zzzH = 1;
        zzUs = stringtointconverter;
    }

    public static ConverterWrapper zza(com.google.android.gms.common.server.response.FastJsonResponse.zza zza1)
    {
        if (zza1 instanceof StringToIntConverter)
        {
            return new ConverterWrapper((StringToIntConverter)zza1);
        } else
        {
            throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
        }
    }

    public int describeContents()
    {
        zza zza1 = CREATOR;
        return 0;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza zza1 = CREATOR;
        com.google.android.gms.common.server.converter.zza.zza(this, parcel, i);
    }

    StringToIntConverter zzmt()
    {
        return zzUs;
    }

    public com.google.android.gms.common.server.response.FastJsonResponse.zza zzmu()
    {
        if (zzUs != null)
        {
            return zzUs;
        } else
        {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
    }

}
