// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            m

public class GetCloudSyncOptInStatusResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new m();
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;

    GetCloudSyncOptInStatusResponse(int i, int j, boolean flag, boolean flag1)
    {
        a = i;
        b = j;
        c = flag;
        d = flag1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        m.a(this, parcel);
    }

}
