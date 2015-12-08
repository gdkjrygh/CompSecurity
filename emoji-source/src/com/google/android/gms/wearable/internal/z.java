// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            aa, ai

public class z
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new aa();
    public final ai alQ;
    public final int statusCode;
    public final int versionCode;

    z(int i, int j, ai ai)
    {
        versionCode = i;
        statusCode = j;
        alQ = ai;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        aa.a(this, parcel, i);
    }

}
