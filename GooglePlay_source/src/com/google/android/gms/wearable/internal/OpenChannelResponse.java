// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            OpenChannelResponseCreator, ChannelImpl

public class OpenChannelResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new OpenChannelResponseCreator();
    public final ChannelImpl channel;
    public final int statusCode;
    public final int versionCode;

    OpenChannelResponse(int i, int j, ChannelImpl channelimpl)
    {
        versionCode = i;
        statusCode = j;
        channel = channelimpl;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        OpenChannelResponseCreator.writeToParcel(this, parcel, i);
    }

}
