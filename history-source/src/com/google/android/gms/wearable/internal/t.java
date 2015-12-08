// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.c;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            u

public class t
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new u();
    public final c axK[];
    public final int statusCode;
    public final int versionCode;

    t(int i, int j, c ac[])
    {
        versionCode = i;
        statusCode = j;
        axK = ac;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        u.a(this, parcel, i);
    }

}
