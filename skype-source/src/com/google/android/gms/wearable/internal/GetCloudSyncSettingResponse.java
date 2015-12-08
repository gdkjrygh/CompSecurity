// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            n

public class GetCloudSyncSettingResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new n();
    public final int a;
    public final int b;
    public final boolean c;

    GetCloudSyncSettingResponse(int i, int j, boolean flag)
    {
        a = i;
        b = j;
        c = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        n.a(this, parcel);
    }

}
