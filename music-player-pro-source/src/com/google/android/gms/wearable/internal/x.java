// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            y, m

public class x
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new y();
    public final m axM;
    public final int statusCode;
    public final int versionCode;

    x(int i, int j, m m)
    {
        versionCode = i;
        statusCode = j;
        axM = m;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        y.a(this, parcel, i);
    }

}
