// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.server.converter:
//            ConverterWrapperCreator, StringToIntConverter

public class ConverterWrapper
    implements SafeParcelable
{

    public static final ConverterWrapperCreator CREATOR = new ConverterWrapperCreator();
    public final StringToIntConverter mStringToIntConverter;
    final int mVersionCode;

    ConverterWrapper(int i, StringToIntConverter stringtointconverter)
    {
        mVersionCode = i;
        mStringToIntConverter = stringtointconverter;
    }

    private ConverterWrapper(StringToIntConverter stringtointconverter)
    {
        mVersionCode = 1;
        mStringToIntConverter = stringtointconverter;
    }

    public static ConverterWrapper wrap(com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter fieldconverter)
    {
        if (fieldconverter instanceof StringToIntConverter)
        {
            return new ConverterWrapper((StringToIntConverter)fieldconverter);
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
        ConverterWrapperCreator.writeToParcel(this, parcel, i);
    }

}
