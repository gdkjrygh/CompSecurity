// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.server.converter:
//            a, StringToIntConverter

public class ConverterWrapper
    implements SafeParcelable
{

    public static final a CREATOR = new a();
    final int a;
    public final StringToIntConverter b;

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

    public static ConverterWrapper a(com.google.android.gms.common.server.response.FastJsonResponse.a a1)
    {
        if (a1 instanceof StringToIntConverter)
        {
            return new ConverterWrapper((StringToIntConverter)a1);
        } else
        {
            throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.common.server.converter.a.a(this, parcel, i);
    }

}
