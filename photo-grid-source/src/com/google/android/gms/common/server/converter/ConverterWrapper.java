// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.a;

// Referenced classes of package com.google.android.gms.common.server.converter:
//            a, StringToIntConverter

public class ConverterWrapper
    implements SafeParcelable
{

    public static final com.google.android.gms.common.server.converter.a CREATOR = new com.google.android.gms.common.server.converter.a();
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

    public static ConverterWrapper a(a a1)
    {
        if (a1 instanceof StringToIntConverter)
        {
            return new ConverterWrapper((StringToIntConverter)a1);
        } else
        {
            throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
        }
    }

    final int a()
    {
        return a;
    }

    final StringToIntConverter b()
    {
        return b;
    }

    public final a c()
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
        com.google.android.gms.common.server.converter.a.a(this, parcel, i);
    }

}
