// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.server.converter:
//            StringToIntConverter, StringToIntConverterEntryCreator

public static final class intValue
    implements SafeParcelable
{

    public static final StringToIntConverterEntryCreator CREATOR = new StringToIntConverterEntryCreator();
    final int intValue;
    final String stringValue;
    final int versionCode;

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        StringToIntConverterEntryCreator.writeToParcel$5bed86f6(this, parcel);
    }


    eator(int i, String s, int j)
    {
        versionCode = i;
        stringValue = s;
        intValue = j;
    }

    intValue(String s, int i)
    {
        versionCode = 1;
        stringValue = s;
        intValue = i;
    }
}
