// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.server.response:
//            FieldMappingDictionary, FieldMapPairCreator

public static class value
    implements SafeParcelable
{

    public static final FieldMapPairCreator CREATOR = new FieldMapPairCreator();
    final String key;
    final value value;
    final int versionCode;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        FieldMapPairCreator.writeToParcel(this, parcel, i);
    }


    (int i, String s,  )
    {
        versionCode = i;
        key = s;
        value = ;
    }

    value(String s, value value1)
    {
        versionCode = 1;
        key = s;
        value = value1;
    }
}
