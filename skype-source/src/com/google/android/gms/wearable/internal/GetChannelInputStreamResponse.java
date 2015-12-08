// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            j

public class GetChannelInputStreamResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    public final int a;
    public final int b;
    public final ParcelFileDescriptor c;

    GetChannelInputStreamResponse(int i, int k, ParcelFileDescriptor parcelfiledescriptor)
    {
        a = i;
        b = k;
        c = parcelfiledescriptor;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
