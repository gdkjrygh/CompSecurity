// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            SendMessageResponseCreator

public class SendMessageResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new SendMessageResponseCreator();
    public final int requestId;
    public final int statusCode;
    public final int versionCode;

    SendMessageResponse(int i, int j, int k)
    {
        versionCode = i;
        statusCode = j;
        requestId = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        SendMessageResponseCreator.writeToParcel$3305acc0(this, parcel);
    }

}
