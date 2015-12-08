// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import crh;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            DataItemParcelable

public class GetDataItemResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new crh();
    public final int a;
    public final int b;
    public final DataItemParcelable c;

    public GetDataItemResponse(int i, int j, DataItemParcelable dataitemparcelable)
    {
        a = i;
        b = j;
        c = dataitemparcelable;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        crh.a(this, parcel, i);
    }

}
