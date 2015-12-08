// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.internal.hm;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            c

public class CustomProperty
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    final CustomPropertyKey JQ;
    final String mValue;
    final int xM;

    CustomProperty(int i, CustomPropertyKey custompropertykey, String s)
    {
        xM = i;
        hm.b(custompropertykey, "key");
        JQ = custompropertykey;
        mValue = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
