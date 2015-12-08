// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            al

public class StorageInfoResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new al();
    public final int a;
    public final int b;
    public final long c;
    public final List d;

    StorageInfoResponse(int i, int j, long l, List list)
    {
        a = i;
        b = j;
        c = l;
        d = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        al.a(this, parcel);
    }

}
