// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ap, m

public class ao
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ap();
    public final m avA;
    public final int statusCode;
    public final int versionCode;

    ao(int i, int j, m m)
    {
        versionCode = i;
        statusCode = j;
        avA = m;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ap.a(this, parcel, i);
    }

}
