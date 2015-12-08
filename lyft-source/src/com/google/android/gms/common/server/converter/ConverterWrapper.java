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
    private final int a;
    private final StringToIntConverter b;

    ConverterWrapper(int i, StringToIntConverter stringtointconverter)
    {
        a = i;
        b = stringtointconverter;
    }

    private ConverterWrapper(StringToIntConverter stringtointconverter)
    {
        a = 1;
        b = stringtointconverter;
    }

    public static ConverterWrapper a(com.google.android.gms.common.server.response.FastJsonResponse.zza zza1)
    {
        if (zza1 instanceof StringToIntConverter)
        {
            return new ConverterWrapper((StringToIntConverter)zza1);
        } else
        {
            throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
        }
    }

    int a()
    {
        return a;
    }

    StringToIntConverter b()
    {
        return b;
    }

    public com.google.android.gms.common.server.response.FastJsonResponse.zza c()
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
        zza zza1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza zza1 = CREATOR;
        zza.a(this, parcel, i);
    }

}
